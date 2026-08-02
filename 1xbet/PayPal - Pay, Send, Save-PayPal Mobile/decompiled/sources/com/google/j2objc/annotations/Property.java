package com.google.j2objc.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface Property {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    public @interface Suppress {
        java.lang.String reason() default "";
    }

    java.lang.String value() default "";
}
