package org.modelmapper.internal.bytebuddy.asm;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class MemberRemoval extends AsmVisitorWrapper.AbstractBase {
    private final ElementMatcher.Junction<FieldDescription.InDefinedShape> fieldMatcher;
    private final ElementMatcher.Junction<MethodDescription> methodMatcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberRemoval memberRemoval = (MemberRemoval) obj;
        return this.fieldMatcher.equals(memberRemoval.fieldMatcher) && this.methodMatcher.equals(memberRemoval.methodMatcher);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldMatcher.hashCode()) * 31) + this.methodMatcher.hashCode();
    }

    public MemberRemoval() {
        this(ElementMatchers.none(), ElementMatchers.none());
    }

    protected MemberRemoval(ElementMatcher.Junction<FieldDescription.InDefinedShape> junction, ElementMatcher.Junction<MethodDescription> junction2) {
        this.fieldMatcher = junction;
        this.methodMatcher = junction2;
    }

    public MemberRemoval stripFields(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new MemberRemoval(this.fieldMatcher.or(elementMatcher), this.methodMatcher);
    }

    public MemberRemoval stripMethods(ElementMatcher<? super MethodDescription> elementMatcher) {
        return stripInvokables(ElementMatchers.isMethod().and(elementMatcher));
    }

    public MemberRemoval stripConstructors(ElementMatcher<? super MethodDescription> elementMatcher) {
        return stripInvokables(ElementMatchers.isConstructor().and(elementMatcher));
    }

    public MemberRemoval stripInvokables(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new MemberRemoval(this.fieldMatcher, this.methodMatcher.or(elementMatcher));
    }

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
    public ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2) {
        HashMap hashMap = new HashMap();
        for (FieldDescription.InDefinedShape inDefinedShape : fieldList) {
            hashMap.put(inDefinedShape.getInternalName() + inDefinedShape.getDescriptor(), inDefinedShape);
        }
        HashMap hashMap2 = new HashMap();
        for (MethodDescription methodDescription : CompoundList.of(methodList, new MethodDescription.Latent.TypeInitializer(typeDescription))) {
            hashMap2.put(methodDescription.getInternalName() + methodDescription.getDescriptor(), methodDescription);
        }
        return new MemberRemovingClassVisitor(classVisitor, this.fieldMatcher, this.methodMatcher, hashMap, hashMap2);
    }

    protected static class MemberRemovingClassVisitor extends ClassVisitor {
        private static final FieldVisitor REMOVE_FIELD = null;
        private static final MethodVisitor REMOVE_METHOD = null;
        private final ElementMatcher.Junction<FieldDescription.InDefinedShape> fieldMatcher;
        private final Map<String, FieldDescription.InDefinedShape> fields;
        private final ElementMatcher.Junction<MethodDescription> methodMatcher;
        private final Map<String, MethodDescription> methods;

        protected MemberRemovingClassVisitor(ClassVisitor classVisitor, ElementMatcher.Junction<FieldDescription.InDefinedShape> junction, ElementMatcher.Junction<MethodDescription> junction2, Map<String, FieldDescription.InDefinedShape> map, Map<String, MethodDescription> map2) {
            super(OpenedClassReader.ASM_API, classVisitor);
            this.fieldMatcher = junction;
            this.methodMatcher = junction2;
            this.fields = map;
            this.methods = map2;
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
            FieldDescription.InDefinedShape inDefinedShape = this.fields.get(str + str2);
            return (inDefinedShape == null || !this.fieldMatcher.matches(inDefinedShape)) ? super.visitField(i, str, str2, str3, obj) : REMOVE_FIELD;
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
            MethodDescription methodDescription = this.methods.get(str + str2);
            return (methodDescription == null || !this.methodMatcher.matches(methodDescription)) ? super.visitMethod(i, str, str2, str3, strArr) : REMOVE_METHOD;
        }
    }
}
