package com.google.errorprone.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD})
/* loaded from: classes3.dex */
public @interface RestrictedApi {
    java.lang.String allowedOnPath() default "";

    java.lang.Class<? extends java.lang.annotation.Annotation>[] allowlistAnnotations() default {};

    java.lang.Class<? extends java.lang.annotation.Annotation>[] allowlistWithWarningAnnotations() default {};

    java.lang.String explanation();

    java.lang.String link() default "";
}
