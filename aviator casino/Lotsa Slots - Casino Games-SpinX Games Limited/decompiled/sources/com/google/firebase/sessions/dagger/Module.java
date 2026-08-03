package com.google.firebase.sessions.dagger;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface Module {
    java.lang.Class<?>[] includes() default {};

    java.lang.Class<?>[] subcomponents() default {};
}
