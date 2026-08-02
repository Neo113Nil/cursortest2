package org.modelmapper.internal.bytebuddy.asm;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ModifierAdjustment extends AsmVisitorWrapper.AbstractBase {
    private final List<Adjustment<FieldDescription.InDefinedShape>> fieldAdjustments;
    private final List<Adjustment<MethodDescription>> methodAdjustments;
    private final List<Adjustment<TypeDescription>> typeAdjustments;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifierAdjustment modifierAdjustment = (ModifierAdjustment) obj;
        return this.typeAdjustments.equals(modifierAdjustment.typeAdjustments) && this.fieldAdjustments.equals(modifierAdjustment.fieldAdjustments) && this.methodAdjustments.equals(modifierAdjustment.methodAdjustments);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeAdjustments.hashCode()) * 31) + this.fieldAdjustments.hashCode()) * 31) + this.methodAdjustments.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
    public /* bridge */ /* synthetic */ ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList fieldList, MethodList methodList, int i, int i2) {
        return wrap(typeDescription, classVisitor, context, typePool, (FieldList<FieldDescription.InDefinedShape>) fieldList, (MethodList<?>) methodList, i, i2);
    }

    public ModifierAdjustment() {
        this(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    protected ModifierAdjustment(List<Adjustment<TypeDescription>> list, List<Adjustment<FieldDescription.InDefinedShape>> list2, List<Adjustment<MethodDescription>> list3) {
        this.typeAdjustments = list;
        this.fieldAdjustments = list2;
        this.methodAdjustments = list3;
    }

    public ModifierAdjustment withTypeModifiers(ModifierContributor.ForType... forTypeArr) {
        return withTypeModifiers(Arrays.asList(forTypeArr));
    }

    public ModifierAdjustment withTypeModifiers(List<? extends ModifierContributor.ForType> list) {
        return withTypeModifiers(ElementMatchers.any(), list);
    }

    public ModifierAdjustment withTypeModifiers(ElementMatcher<? super TypeDescription> elementMatcher, ModifierContributor.ForType... forTypeArr) {
        return withTypeModifiers(elementMatcher, Arrays.asList(forTypeArr));
    }

    public ModifierAdjustment withTypeModifiers(ElementMatcher<? super TypeDescription> elementMatcher, List<? extends ModifierContributor.ForType> list) {
        return new ModifierAdjustment(CompoundList.of(new Adjustment(elementMatcher, ModifierContributor.Resolver.of(list)), this.typeAdjustments), this.fieldAdjustments, this.methodAdjustments);
    }

    public ModifierAdjustment withFieldModifiers(ModifierContributor.ForField... forFieldArr) {
        return withFieldModifiers(Arrays.asList(forFieldArr));
    }

    public ModifierAdjustment withFieldModifiers(List<? extends ModifierContributor.ForField> list) {
        return withFieldModifiers(ElementMatchers.any(), list);
    }

    public ModifierAdjustment withFieldModifiers(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, ModifierContributor.ForField... forFieldArr) {
        return withFieldModifiers(elementMatcher, Arrays.asList(forFieldArr));
    }

    public ModifierAdjustment withFieldModifiers(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, List<? extends ModifierContributor.ForField> list) {
        return new ModifierAdjustment(this.typeAdjustments, CompoundList.of(new Adjustment(elementMatcher, ModifierContributor.Resolver.of(list)), this.fieldAdjustments), this.methodAdjustments);
    }

    public ModifierAdjustment withMethodModifiers(ModifierContributor.ForMethod... forMethodArr) {
        return withMethodModifiers(Arrays.asList(forMethodArr));
    }

    public ModifierAdjustment withMethodModifiers(List<? extends ModifierContributor.ForMethod> list) {
        return withMethodModifiers(ElementMatchers.any(), list);
    }

    public ModifierAdjustment withMethodModifiers(ElementMatcher<? super MethodDescription> elementMatcher, ModifierContributor.ForMethod... forMethodArr) {
        return withMethodModifiers(elementMatcher, Arrays.asList(forMethodArr));
    }

    public ModifierAdjustment withMethodModifiers(ElementMatcher<? super MethodDescription> elementMatcher, List<? extends ModifierContributor.ForMethod> list) {
        return withInvokableModifiers(ElementMatchers.isMethod().and(elementMatcher), list);
    }

    public ModifierAdjustment withConstructorModifiers(ModifierContributor.ForMethod... forMethodArr) {
        return withConstructorModifiers(Arrays.asList(forMethodArr));
    }

    public ModifierAdjustment withConstructorModifiers(List<? extends ModifierContributor.ForMethod> list) {
        return withConstructorModifiers(ElementMatchers.any(), list);
    }

    public ModifierAdjustment withConstructorModifiers(ElementMatcher<? super MethodDescription> elementMatcher, ModifierContributor.ForMethod... forMethodArr) {
        return withConstructorModifiers(elementMatcher, Arrays.asList(forMethodArr));
    }

    public ModifierAdjustment withConstructorModifiers(ElementMatcher<? super MethodDescription> elementMatcher, List<? extends ModifierContributor.ForMethod> list) {
        return withInvokableModifiers(ElementMatchers.isConstructor().and(elementMatcher), list);
    }

    public ModifierAdjustment withInvokableModifiers(ModifierContributor.ForMethod... forMethodArr) {
        return withInvokableModifiers(Arrays.asList(forMethodArr));
    }

    public ModifierAdjustment withInvokableModifiers(List<? extends ModifierContributor.ForMethod> list) {
        return withInvokableModifiers(ElementMatchers.any(), list);
    }

    public ModifierAdjustment withInvokableModifiers(ElementMatcher<? super MethodDescription> elementMatcher, ModifierContributor.ForMethod... forMethodArr) {
        return withInvokableModifiers(elementMatcher, Arrays.asList(forMethodArr));
    }

    public ModifierAdjustment withInvokableModifiers(ElementMatcher<? super MethodDescription> elementMatcher, List<? extends ModifierContributor.ForMethod> list) {
        return new ModifierAdjustment(this.typeAdjustments, this.fieldAdjustments, CompoundList.of(new Adjustment(elementMatcher, ModifierContributor.Resolver.of(list)), this.methodAdjustments));
    }

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
    public ModifierAdjustingClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2) {
        HashMap hashMap = new HashMap();
        for (FieldDescription.InDefinedShape inDefinedShape : fieldList) {
            hashMap.put(inDefinedShape.getInternalName() + inDefinedShape.getDescriptor(), inDefinedShape);
        }
        HashMap hashMap2 = new HashMap();
        for (MethodDescription methodDescription : CompoundList.of(methodList, new MethodDescription.Latent.TypeInitializer(typeDescription))) {
            hashMap2.put(methodDescription.getInternalName() + methodDescription.getDescriptor(), methodDescription);
        }
        return new ModifierAdjustingClassVisitor(classVisitor, this.typeAdjustments, this.fieldAdjustments, this.methodAdjustments, typeDescription, hashMap, hashMap2);
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Adjustment<T> implements ElementMatcher<T> {
        private final ElementMatcher<? super T> matcher;
        private final ModifierContributor.Resolver<?> resolver;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Adjustment adjustment = (Adjustment) obj;
            return this.matcher.equals(adjustment.matcher) && this.resolver.equals(adjustment.resolver);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.resolver.hashCode();
        }

        protected Adjustment(ElementMatcher<? super T> elementMatcher, ModifierContributor.Resolver<?> resolver) {
            this.matcher = elementMatcher;
            this.resolver = resolver;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
        public boolean matches(T t) {
            return this.matcher.matches(t);
        }

        protected int resolve(int i) {
            return this.resolver.resolve(i);
        }
    }

    protected static class ModifierAdjustingClassVisitor extends ClassVisitor {
        private final List<Adjustment<FieldDescription.InDefinedShape>> fieldAdjustments;
        private final Map<String, FieldDescription.InDefinedShape> fields;
        private final TypeDescription instrumentedType;
        private final List<Adjustment<MethodDescription>> methodAdjustments;
        private final Map<String, MethodDescription> methods;
        private final List<Adjustment<TypeDescription>> typeAdjustments;

        protected ModifierAdjustingClassVisitor(ClassVisitor classVisitor, List<Adjustment<TypeDescription>> list, List<Adjustment<FieldDescription.InDefinedShape>> list2, List<Adjustment<MethodDescription>> list3, TypeDescription typeDescription, Map<String, FieldDescription.InDefinedShape> map, Map<String, MethodDescription> map2) {
            super(OpenedClassReader.ASM_API, classVisitor);
            this.typeAdjustments = list;
            this.fieldAdjustments = list2;
            this.methodAdjustments = list3;
            this.instrumentedType = typeDescription;
            this.fields = map;
            this.methods = map2;
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
            Iterator<Adjustment<TypeDescription>> it = this.typeAdjustments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Adjustment<TypeDescription> next = it.next();
                if (next.matches(this.instrumentedType)) {
                    i2 = next.resolve(i2);
                    break;
                }
            }
            super.visit(i, i2, str, str2, str3, strArr);
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public void visitInnerClass(String str, String str2, String str3, int i) {
            if (this.instrumentedType.getInternalName().equals(str)) {
                Iterator<Adjustment<TypeDescription>> it = this.typeAdjustments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Adjustment<TypeDescription> next = it.next();
                    if (next.matches(this.instrumentedType)) {
                        i = next.resolve(i);
                        break;
                    }
                }
            }
            super.visitInnerClass(str, str2, str3, i);
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
            FieldDescription.InDefinedShape inDefinedShape = this.fields.get(str + str2);
            if (inDefinedShape != null) {
                Iterator<Adjustment<FieldDescription.InDefinedShape>> it = this.fieldAdjustments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Adjustment<FieldDescription.InDefinedShape> next = it.next();
                    if (next.matches(inDefinedShape)) {
                        i = next.resolve(i);
                        break;
                    }
                }
            }
            return super.visitField(i, str, str2, str3, obj);
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
            MethodDescription methodDescription = this.methods.get(str + str2);
            if (methodDescription != null) {
                Iterator<Adjustment<MethodDescription>> it = this.methodAdjustments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Adjustment<MethodDescription> next = it.next();
                    if (next.matches(methodDescription)) {
                        i = next.resolve(i);
                        break;
                    }
                }
            }
            return super.visitMethod(i, str, str2, str3, strArr);
        }
    }
}
