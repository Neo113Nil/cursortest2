package org.modelmapper.internal.bytebuddy.build;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.implementation.EqualsMethod;
import org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@Enhance
/* loaded from: classes4.dex */
public class HashCodeAndEqualsPlugin implements Plugin {

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Enhance {

        public enum InvokeSuper {
            IF_DECLARED { // from class: org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.1
                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected HashCodeMethod hashCodeMethod(TypeDescription typeDescription) {
                    for (TypeDescription.Generic superClass = typeDescription.getSuperClass(); superClass != null && !superClass.represents(Object.class); superClass = superClass.getSuperClass()) {
                        if (superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) {
                            return HashCodeMethod.usingSuperClassOffset();
                        }
                        MethodList filter = superClass.getDeclaredMethods().filter(ElementMatchers.isHashCode());
                        if (!filter.isEmpty()) {
                            if (((MethodDescription) filter.getOnly()).isAbstract()) {
                                return HashCodeMethod.usingDefaultOffset();
                            }
                            return HashCodeMethod.usingSuperClassOffset();
                        }
                    }
                    return HashCodeMethod.usingDefaultOffset();
                }

                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    for (TypeDefinition superClass = typeDescription.getSuperClass(); superClass != null && !superClass.represents(Object.class); superClass = superClass.getSuperClass().asErasure()) {
                        if (superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) {
                            return EqualsMethod.requiringSuperClassEquality();
                        }
                        MethodList filter = superClass.getDeclaredMethods().filter(ElementMatchers.isHashCode());
                        if (!filter.isEmpty()) {
                            if (((MethodDescription) filter.getOnly()).isAbstract()) {
                                return EqualsMethod.isolated();
                            }
                            return EqualsMethod.requiringSuperClassEquality();
                        }
                    }
                    return EqualsMethod.isolated();
                }
            },
            IF_ANNOTATED { // from class: org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.2
                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected HashCodeMethod hashCodeMethod(TypeDescription typeDescription) {
                    TypeDescription.Generic superClass = typeDescription.getSuperClass();
                    if (superClass != null && superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) {
                        return HashCodeMethod.usingSuperClassOffset();
                    }
                    return HashCodeMethod.usingDefaultOffset();
                }

                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    TypeDescription.Generic superClass = typeDescription.getSuperClass();
                    if (superClass != null && superClass.asErasure().getDeclaredAnnotations().isAnnotationPresent(Enhance.class)) {
                        return EqualsMethod.requiringSuperClassEquality();
                    }
                    return EqualsMethod.isolated();
                }
            },
            ALWAYS { // from class: org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.3
                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected HashCodeMethod hashCodeMethod(TypeDescription typeDescription) {
                    return HashCodeMethod.usingSuperClassOffset();
                }

                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    return EqualsMethod.requiringSuperClassEquality();
                }
            },
            NEVER { // from class: org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper.4
                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected HashCodeMethod hashCodeMethod(TypeDescription typeDescription) {
                    return HashCodeMethod.usingDefaultOffset();
                }

                @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance.InvokeSuper
                protected EqualsMethod equalsMethod(TypeDescription typeDescription) {
                    return EqualsMethod.isolated();
                }
            };

            protected abstract EqualsMethod equalsMethod(TypeDescription typeDescription);

            protected abstract HashCodeMethod hashCodeMethod(TypeDescription typeDescription);
        }

        boolean includeSyntheticFields() default false;

        InvokeSuper invokeSuper() default InvokeSuper.IF_DECLARED;

        boolean permitSubclassEquality() default false;

        boolean simpleComparisonsFirst() default true;
    }

    @Target({ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Sorted {
        public static final int DEFAULT = 0;

        int value();
    }

    @Target({ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ValueHandling {

        public enum Sort {
            IGNORE,
            REVERSE_NULLABILITY
        }

        Sort value();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode() {
        return 17;
    }

    protected ElementMatcher<FieldDescription> nonNullable(ElementMatcher<FieldDescription> elementMatcher) {
        return elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(TypeDescription typeDescription) {
        return typeDescription.getDeclaredAnnotations().isAnnotationPresent(Enhance.class);
    }

    @Override // org.modelmapper.internal.bytebuddy.build.Plugin
    public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        ElementMatcher.Junction isSynthetic;
        ElementMatcher.Junction isSynthetic2;
        Enhance enhance = (Enhance) typeDescription.getDeclaredAnnotations().ofType(Enhance.class).loadSilent();
        if (typeDescription.getDeclaredMethods().filter(ElementMatchers.isHashCode()).isEmpty()) {
            DynamicType.Builder.MethodDefinition.ImplementationDefinition<?> method = builder.method(ElementMatchers.isHashCode());
            HashCodeMethod hashCodeMethod = enhance.invokeSuper().hashCodeMethod(typeDescription);
            if (enhance.includeSyntheticFields()) {
                isSynthetic2 = ElementMatchers.none();
            } else {
                isSynthetic2 = ElementMatchers.isSynthetic();
            }
            builder = method.intercept(hashCodeMethod.withIgnoredFields(isSynthetic2).withIgnoredFields(new ValueMatcher(ValueHandling.Sort.IGNORE)).withNonNullableFields(nonNullable(new ValueMatcher(ValueHandling.Sort.REVERSE_NULLABILITY))));
        }
        if (!typeDescription.getDeclaredMethods().filter(ElementMatchers.isEquals()).isEmpty()) {
            return builder;
        }
        EqualsMethod equalsMethod = enhance.invokeSuper().equalsMethod(typeDescription);
        if (enhance.includeSyntheticFields()) {
            isSynthetic = ElementMatchers.none();
        } else {
            isSynthetic = ElementMatchers.isSynthetic();
        }
        EqualsMethod withFieldOrder = equalsMethod.withIgnoredFields(isSynthetic).withIgnoredFields(new ValueMatcher(ValueHandling.Sort.IGNORE)).withNonNullableFields(nonNullable(new ValueMatcher(ValueHandling.Sort.REVERSE_NULLABILITY))).withFieldOrder(AnnotationOrderComparator.INSTANCE);
        EqualsMethod equalsMethod2 = withFieldOrder;
        if (enhance.simpleComparisonsFirst()) {
            equalsMethod2 = withFieldOrder.withPrimitiveTypedFieldsFirst().withEnumerationTypedFieldsFirst().withPrimitiveWrapperTypedFieldsFirst().withStringTypedFieldsFirst();
        }
        DynamicType.Builder.MethodDefinition.ImplementationDefinition<?> method2 = builder.method(ElementMatchers.isEquals());
        Implementation implementation = equalsMethod2;
        if (enhance.permitSubclassEquality()) {
            implementation = equalsMethod2.withSubclassEquality();
        }
        return method2.intercept(implementation);
    }

    @Enhance
    public static class WithNonNullableFields extends HashCodeAndEqualsPlugin {
        @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin
        public int hashCode() {
            return super.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin, org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
        public /* bridge */ /* synthetic */ boolean matches(TypeDescription typeDescription) {
            return super.matches(typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin
        protected ElementMatcher<FieldDescription> nonNullable(ElementMatcher<FieldDescription> elementMatcher) {
            return ElementMatchers.not(elementMatcher);
        }
    }

    protected enum AnnotationOrderComparator implements Comparator<FieldDescription.InDefinedShape> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
            AnnotationDescription.Loadable ofType = inDefinedShape.getDeclaredAnnotations().ofType(Sorted.class);
            AnnotationDescription.Loadable ofType2 = inDefinedShape2.getDeclaredAnnotations().ofType(Sorted.class);
            int value = ofType == null ? 0 : ((Sorted) ofType.loadSilent()).value();
            int value2 = ofType2 == null ? 0 : ((Sorted) ofType2.loadSilent()).value();
            if (value > value2) {
                return -1;
            }
            return value < value2 ? 1 : 0;
        }
    }

    @Enhance
    protected static class ValueMatcher implements ElementMatcher<FieldDescription> {
        private final ValueHandling.Sort sort;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.sort.equals(((ValueMatcher) obj).sort);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.sort.hashCode();
        }

        protected ValueMatcher(ValueHandling.Sort sort) {
            this.sort = sort;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
        public boolean matches(FieldDescription fieldDescription) {
            AnnotationDescription.Loadable ofType = fieldDescription.getDeclaredAnnotations().ofType(ValueHandling.class);
            return ofType != null && ((ValueHandling) ofType.loadSilent()).value() == this.sort;
        }
    }
}
