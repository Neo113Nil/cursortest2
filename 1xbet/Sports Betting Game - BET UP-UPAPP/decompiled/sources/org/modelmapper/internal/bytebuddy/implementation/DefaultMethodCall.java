package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class DefaultMethodCall implements Implementation {
    private final List<TypeDescription> prioritizedInterfaces;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.prioritizedInterfaces.equals(((DefaultMethodCall) obj).prioritizedInterfaces);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.prioritizedInterfaces.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    protected DefaultMethodCall(List<TypeDescription> list) {
        this.prioritizedInterfaces = list;
    }

    public static Implementation prioritize(Class<?>... clsArr) {
        return prioritize((Collection<? extends TypeDescription>) new TypeList.ForLoadedTypes(clsArr));
    }

    public static Implementation prioritize(Iterable<? extends Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return prioritize((Collection<? extends TypeDescription>) new TypeList.ForLoadedTypes(arrayList));
    }

    public static Implementation prioritize(TypeDescription... typeDescriptionArr) {
        return prioritize((Collection<? extends TypeDescription>) Arrays.asList(typeDescriptionArr));
    }

    public static Implementation prioritize(Collection<? extends TypeDescription> collection) {
        return new DefaultMethodCall(new ArrayList(collection));
    }

    public static Implementation unambiguousOnly() {
        return new DefaultMethodCall(Collections.emptyList());
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return new Appender(target, filterRelevant(target.getInstrumentedType()));
    }

    private List<TypeDescription> filterRelevant(TypeDescription typeDescription) {
        ArrayList arrayList = new ArrayList(this.prioritizedInterfaces.size());
        HashSet hashSet = new HashSet(typeDescription.getInterfaces().asErasures());
        for (TypeDescription typeDescription2 : this.prioritizedInterfaces) {
            if (hashSet.remove(typeDescription2)) {
                arrayList.add(typeDescription2);
            }
        }
        return arrayList;
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Appender implements ByteCodeAppender {
        private final Implementation.Target implementationTarget;

        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
        private final Set<TypeDescription> nonPrioritizedInterfaces;
        private final List<TypeDescription> prioritizedInterfaces;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.implementationTarget.equals(appender.implementationTarget) && this.prioritizedInterfaces.equals(appender.prioritizedInterfaces);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.implementationTarget.hashCode()) * 31) + this.prioritizedInterfaces.hashCode();
        }

        protected Appender(Implementation.Target target, List<TypeDescription> list) {
            this.implementationTarget = target;
            this.prioritizedInterfaces = list;
            HashSet hashSet = new HashSet(target.getInstrumentedType().getInterfaces().asErasures());
            this.nonPrioritizedInterfaces = hashSet;
            hashSet.removeAll(list);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            StackManipulation locateDefault = locateDefault(methodDescription);
            if (!locateDefault.isValid()) {
                throw new IllegalStateException("Cannot invoke default method on " + methodDescription);
            }
            return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), locateDefault, MethodReturn.of(methodDescription.getReturnType())).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }

        private StackManipulation locateDefault(MethodDescription methodDescription) {
            MethodDescription.SignatureToken asSignatureToken = methodDescription.asSignatureToken();
            Implementation.SpecialMethodInvocation specialMethodInvocation = Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
            Iterator<TypeDescription> it = this.prioritizedInterfaces.iterator();
            while (it.hasNext()) {
                specialMethodInvocation = this.implementationTarget.invokeDefault(asSignatureToken, it.next());
                if (specialMethodInvocation.isValid()) {
                    return specialMethodInvocation;
                }
            }
            Iterator<TypeDescription> it2 = this.nonPrioritizedInterfaces.iterator();
            while (it2.hasNext()) {
                Implementation.SpecialMethodInvocation invokeDefault = this.implementationTarget.invokeDefault(asSignatureToken, it2.next());
                if (specialMethodInvocation.isValid() && invokeDefault.isValid()) {
                    throw new IllegalStateException(methodDescription + " has an ambiguous default method with " + invokeDefault.getMethodDescription() + " and " + specialMethodInvocation.getMethodDescription());
                }
                specialMethodInvocation = invokeDefault;
            }
            return specialMethodInvocation;
        }
    }
}
