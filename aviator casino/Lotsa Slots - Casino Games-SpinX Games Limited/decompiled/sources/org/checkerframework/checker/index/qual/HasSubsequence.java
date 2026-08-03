package org.checkerframework.checker.index.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface HasSubsequence {
    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String from();

    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String subsequence();

    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String to();
}
