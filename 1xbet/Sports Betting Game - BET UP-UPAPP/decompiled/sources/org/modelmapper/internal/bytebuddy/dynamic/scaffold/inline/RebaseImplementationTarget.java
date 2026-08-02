package org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class RebaseImplementationTarget extends Implementation.Target.AbstractBase {
    private final Map<MethodDescription.SignatureToken, MethodRebaseResolver.Resolution> rebaseableMethods;

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.rebaseableMethods.equals(((RebaseImplementationTarget) obj).rebaseableMethods);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase
    public int hashCode() {
        return (super.hashCode() * 31) + this.rebaseableMethods.hashCode();
    }

    protected RebaseImplementationTarget(TypeDescription typeDescription, MethodGraph.Linked linked, Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation, Map<MethodDescription.SignatureToken, MethodRebaseResolver.Resolution> map) {
        super(typeDescription, linked, defaultMethodInvocation);
        this.rebaseableMethods = map;
    }

    protected static Implementation.Target of(TypeDescription typeDescription, MethodGraph.Linked linked, ClassFileVersion classFileVersion, MethodRebaseResolver methodRebaseResolver) {
        return new RebaseImplementationTarget(typeDescription, linked, Implementation.Target.AbstractBase.DefaultMethodInvocation.of(classFileVersion), methodRebaseResolver.asTokenMap());
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
    public Implementation.SpecialMethodInvocation invokeSuper(MethodDescription.SignatureToken signatureToken) {
        MethodRebaseResolver.Resolution resolution = this.rebaseableMethods.get(signatureToken);
        if (resolution == null) {
            return invokeSuper(this.methodGraph.getSuperClassGraph().locate(signatureToken));
        }
        return invokeSuper(resolution);
    }

    private Implementation.SpecialMethodInvocation invokeSuper(MethodGraph.Node node) {
        return node.getSort().isResolved() ? Implementation.SpecialMethodInvocation.Simple.of(node.getRepresentative(), this.instrumentedType.getSuperClass().asErasure()) : Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
    }

    private Implementation.SpecialMethodInvocation invokeSuper(MethodRebaseResolver.Resolution resolution) {
        if (resolution.isRebased()) {
            return RebasedMethodInvocation.of(resolution.getResolvedMethod(), this.instrumentedType, resolution.getAdditionalArguments());
        }
        return Implementation.SpecialMethodInvocation.Simple.of(resolution.getResolvedMethod(), this.instrumentedType);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
    public TypeDescription getOriginType() {
        return this.instrumentedType;
    }

    protected static class RebasedMethodInvocation extends Implementation.SpecialMethodInvocation.AbstractBase {
        private final TypeDescription instrumentedType;
        private final MethodDescription methodDescription;
        private final StackManipulation stackManipulation;

        protected RebasedMethodInvocation(MethodDescription methodDescription, TypeDescription typeDescription, StackManipulation stackManipulation) {
            this.methodDescription = methodDescription;
            this.instrumentedType = typeDescription;
            this.stackManipulation = stackManipulation;
        }

        protected static Implementation.SpecialMethodInvocation of(MethodDescription methodDescription, TypeDescription typeDescription, StackManipulation stackManipulation) {
            StackManipulation special;
            if (methodDescription.isStatic()) {
                special = MethodInvocation.invoke(methodDescription);
            } else {
                special = MethodInvocation.invoke(methodDescription).special(typeDescription);
            }
            return special.isValid() ? new RebasedMethodInvocation(methodDescription, typeDescription, new StackManipulation.Compound(stackManipulation, special)) : Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public MethodDescription getMethodDescription() {
            return this.methodDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public TypeDescription getTypeDescription() {
            return this.instrumentedType;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return this.stackManipulation.apply(methodVisitor, context);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Factory implements Implementation.Target.Factory {
        private final MethodRebaseResolver methodRebaseResolver;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.methodRebaseResolver.equals(((Factory) obj).methodRebaseResolver);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodRebaseResolver.hashCode();
        }

        public Factory(MethodRebaseResolver methodRebaseResolver) {
            this.methodRebaseResolver = methodRebaseResolver;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.Factory
        public Implementation.Target make(TypeDescription typeDescription, MethodGraph.Linked linked, ClassFileVersion classFileVersion) {
            return RebaseImplementationTarget.of(typeDescription, linked, classFileVersion, this.methodRebaseResolver);
        }
    }
}
