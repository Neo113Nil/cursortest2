package org.modelmapper.internal.bytebuddy.build;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.implementation.ToStringMethod;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ToStringPlugin implements Plugin {

    @Target({ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Exclude {
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

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(TypeDescription typeDescription) {
        return typeDescription.getDeclaredAnnotations().isAnnotationPresent(Enhance.class);
    }

    @Override // org.modelmapper.internal.bytebuddy.build.Plugin
    public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        ElementMatcher.Junction isSynthetic;
        Enhance enhance = (Enhance) typeDescription.getDeclaredAnnotations().ofType(Enhance.class).loadSilent();
        if (!typeDescription.getDeclaredMethods().filter(ElementMatchers.isToString()).isEmpty()) {
            return builder;
        }
        DynamicType.Builder.MethodDefinition.ImplementationDefinition<?> method = builder.method(ElementMatchers.isToString());
        ToStringMethod prefixedBy = ToStringMethod.prefixedBy(enhance.prefix().getPrefixResolver());
        if (enhance.includeSyntheticFields()) {
            isSynthetic = ElementMatchers.none();
        } else {
            isSynthetic = ElementMatchers.isSynthetic();
        }
        return method.intercept(prefixedBy.withIgnoredFields(isSynthetic).withIgnoredFields(ElementMatchers.isAnnotatedWith((Class<? extends Annotation>) Exclude.class)));
    }

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Enhance {
        boolean includeSyntheticFields() default false;

        Prefix prefix() default Prefix.SIMPLE;

        public enum Prefix {
            FULLY_QUALIFIED(ToStringMethod.PrefixResolver.Default.FULLY_QUALIFIED_CLASS_NAME),
            CANONICAL(ToStringMethod.PrefixResolver.Default.CANONICAL_CLASS_NAME),
            SIMPLE(ToStringMethod.PrefixResolver.Default.SIMPLE_CLASS_NAME);

            private final ToStringMethod.PrefixResolver.Default prefixResolver;

            Prefix(ToStringMethod.PrefixResolver.Default r3) {
                this.prefixResolver = r3;
            }

            protected ToStringMethod.PrefixResolver.Default getPrefixResolver() {
                return this.prefixResolver;
            }
        }
    }
}
