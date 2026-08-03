package org.checkerframework.common.reflection.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.common.reflection.qual.UnknownClass.class})
/* loaded from: classes6.dex */
public @interface ClassBound {
    java.lang.String[] value();
}
