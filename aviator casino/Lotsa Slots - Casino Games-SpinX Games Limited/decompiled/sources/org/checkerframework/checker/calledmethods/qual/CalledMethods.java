package org.checkerframework.checker.calledmethods.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({})
@org.checkerframework.framework.qual.DefaultQualifierInHierarchy
/* loaded from: classes6.dex */
public @interface CalledMethods {
    java.lang.String[] value() default {};
}
