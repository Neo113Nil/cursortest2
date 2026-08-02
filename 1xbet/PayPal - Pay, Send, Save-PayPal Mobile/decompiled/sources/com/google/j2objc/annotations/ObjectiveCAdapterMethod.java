package com.google.j2objc.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ObjectiveCAdapterMethod {

    /* loaded from: classes9.dex */
    public enum Adaptation {
        EXCEPTIONS_AS_ERRORS,
        RETURN_NATIVE_BOOLS,
        ACCEPT_NATIVE_BOOLS,
        RETURN_NATIVE_ENUMS,
        ACCEPT_NATIVE_ENUMS,
        RETURN_ADAPTER_PROTOCOLS,
        RETURN_LISTS_AS_NATIVE_ARRAYS
    }

    com.google.j2objc.annotations.ObjectiveCAdapterMethod.Adaptation[] adaptations() default {};

    java.lang.String selector() default "";
}
