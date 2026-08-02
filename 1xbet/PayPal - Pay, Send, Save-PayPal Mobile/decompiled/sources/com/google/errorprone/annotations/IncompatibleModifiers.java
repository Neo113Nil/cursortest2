package com.google.errorprone.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface IncompatibleModifiers {
    com.google.errorprone.annotations.Modifier[] modifier() default {};
}
