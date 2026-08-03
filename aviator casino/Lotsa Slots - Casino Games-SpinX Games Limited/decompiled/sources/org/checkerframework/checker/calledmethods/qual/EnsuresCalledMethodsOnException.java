package org.checkerframework.checker.calledmethods.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.InheritedAnnotation
@java.lang.annotation.Repeatable(org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsOnException.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface EnsuresCalledMethodsOnException {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsOnException[] value();
    }

    java.lang.String[] methods();

    java.lang.String[] value();
}
