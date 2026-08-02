package com.microblink.blinkid.annotation.entities;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface EntityTemplate {
    boolean alwaysGenerateSerializationCode() default false;

    java.lang.String base();

    boolean callSuperConsumeResult() default false;

    java.lang.String[] deprecatedIf() default {""};

    java.lang.String[] interfaces() default {""};

    java.lang.String name();

    boolean shouldGenerateDefaultConstructor() default true;
}
