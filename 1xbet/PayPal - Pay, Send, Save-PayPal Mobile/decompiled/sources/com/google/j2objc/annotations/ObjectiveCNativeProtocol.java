package com.google.j2objc.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Repeatable(com.google.j2objc.annotations.ObjectiveCNativeProtocols.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ObjectiveCNativeProtocol {
    java.lang.String header() default "";

    java.lang.String name() default "";
}
