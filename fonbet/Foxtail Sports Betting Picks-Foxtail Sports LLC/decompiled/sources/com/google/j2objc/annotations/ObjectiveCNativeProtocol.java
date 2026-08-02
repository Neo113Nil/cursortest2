package com.google.j2objc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Repeatable(ObjectiveCNativeProtocols.class)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface ObjectiveCNativeProtocol {
    String header() default "";

    String name() default "";
}
