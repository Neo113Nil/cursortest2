package com.google.firebase.encoders.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface ExtraProperty {
    java.lang.Class<?>[] allowedTypes() default {};
}
