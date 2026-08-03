package org.checkerframework.checker.initialization.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.DefaultFor({org.checkerframework.framework.qual.TypeUseLocation.LOCAL_VARIABLE, org.checkerframework.framework.qual.TypeUseLocation.RESOURCE_VARIABLE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({})
/* loaded from: classes6.dex */
public @interface UnknownInitialization {
    java.lang.Class<?> value() default java.lang.Object.class;
}
