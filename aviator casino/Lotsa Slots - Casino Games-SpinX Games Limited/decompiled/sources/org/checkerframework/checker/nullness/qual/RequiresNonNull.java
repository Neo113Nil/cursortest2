package org.checkerframework.checker.nullness.qual;

/* JADX WARN: Classes with same name are omitted:
  assets/audience_network/classes.dex
 */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.nullness.qual.NonNull.class)
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.checker.nullness.qual.RequiresNonNull.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface RequiresNonNull {

    /* JADX WARN: Classes with same name are omitted:
      assets/audience_network/classes.dex
     */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.nullness.qual.NonNull.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.nullness.qual.RequiresNonNull[] value();
    }

    java.lang.String[] value();
}
