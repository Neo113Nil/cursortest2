package org.checkerframework.checker.index.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.InheritedAnnotation
@org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.index.qual.LTLengthOf.class)
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.checker.index.qual.EnsuresLTLengthOfIf.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface EnsuresLTLengthOfIf {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.index.qual.LTLengthOf.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.index.qual.EnsuresLTLengthOfIf[] value();
    }

    java.lang.String[] expression();

    @org.checkerframework.framework.qual.QualifierArgument("offset")
    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String[] offset() default {};

    boolean result();

    @org.checkerframework.framework.qual.QualifierArgument("value")
    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String[] targetValue();
}
