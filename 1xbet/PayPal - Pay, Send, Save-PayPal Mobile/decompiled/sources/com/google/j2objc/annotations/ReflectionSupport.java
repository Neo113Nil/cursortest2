package com.google.j2objc.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PACKAGE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ReflectionSupport {

    /* loaded from: classes9.dex */
    public enum Level {
        NATIVE_ONLY,
        FULL
    }

    com.google.j2objc.annotations.ReflectionSupport.Level value();
}
