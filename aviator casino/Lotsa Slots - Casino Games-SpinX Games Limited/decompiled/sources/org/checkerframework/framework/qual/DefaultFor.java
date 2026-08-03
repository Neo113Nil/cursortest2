package org.checkerframework.framework.qual;

/* JADX WARN: Classes with same name are omitted:
  assets/audience_network/classes.dex
 */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface DefaultFor {
    java.lang.String[] names() default {};

    java.lang.String[] namesExceptions() default {};

    org.checkerframework.framework.qual.TypeKind[] typeKinds() default {};

    java.lang.Class<?>[] types() default {};

    org.checkerframework.framework.qual.TypeUseLocation[] value() default {};
}
