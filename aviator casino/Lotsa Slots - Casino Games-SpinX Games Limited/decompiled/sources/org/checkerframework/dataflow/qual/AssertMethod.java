package org.checkerframework.dataflow.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface AssertMethod {
    boolean isAssertFalse() default false;

    int parameter() default 1;

    java.lang.Class<?> value() default java.lang.AssertionError.class;
}
