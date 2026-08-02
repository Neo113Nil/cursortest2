package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface BindingPriority {
    public static final int DEFAULT = 1;

    int value();

    public enum Resolver implements MethodDelegationBinder.AmbiguityResolver {
        INSTANCE;

        private static int resolve(AnnotationDescription.Loadable<BindingPriority> loadable) {
            if (loadable == null) {
                return 1;
            }
            return loadable.loadSilent().value();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
        public MethodDelegationBinder.AmbiguityResolver.Resolution resolve(MethodDescription methodDescription, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
            int resolve = resolve(methodBinding.getTarget().getDeclaredAnnotations().ofType(BindingPriority.class));
            int resolve2 = resolve(methodBinding2.getTarget().getDeclaredAnnotations().ofType(BindingPriority.class));
            if (resolve == resolve2) {
                return MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
            }
            if (resolve < resolve2) {
                return MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT;
            }
            return MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT;
        }
    }
}
