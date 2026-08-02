package org.jetbrains.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface Contract {
    java.lang.String mutates() default "";

    boolean pure() default false;

    java.lang.String value() default "";
}
