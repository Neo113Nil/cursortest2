package com.microblink.blinkid.annotation.entities;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface Field {

    /* loaded from: classes9.dex */
    public enum Nullability {
        NonNull("@NonNull"),
        Nullable("@Nullable");

        public final java.lang.String annotationName;

        Nullability(java.lang.String str) {
            this.annotationName = str;
        }
    }

    java.lang.String getterPrefix() default "";

    java.lang.String nativeName() default "";

    com.microblink.blinkid.annotation.entities.Field.Nullability nullability() default com.microblink.blinkid.annotation.entities.Field.Nullability.NonNull;

    java.lang.String[] requires() default {""};
}
