package org.checkerframework.checker.mustcall.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.DefaultFor({org.checkerframework.framework.qual.TypeUseLocation.EXCEPTION_PARAMETER, org.checkerframework.framework.qual.TypeUseLocation.UPPER_BOUND})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.mustcall.qual.MustCallUnknown.class})
@org.checkerframework.framework.qual.DefaultQualifierInHierarchy
/* loaded from: classes6.dex */
public @interface MustCall {
    java.lang.String[] value() default {};
}
