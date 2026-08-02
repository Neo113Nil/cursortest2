package com.microblink.blinkid.annotation.entities;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface Transform {
    java.lang.String[] annotations() default {""};

    java.lang.String[] requires() default {""};
}
