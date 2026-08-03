package org.checkerframework.checker.units.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.units.qual.Current.class})
/* loaded from: classes6.dex */
public @interface A {
    org.checkerframework.checker.units.qual.Prefix value() default org.checkerframework.checker.units.qual.Prefix.one;
}
