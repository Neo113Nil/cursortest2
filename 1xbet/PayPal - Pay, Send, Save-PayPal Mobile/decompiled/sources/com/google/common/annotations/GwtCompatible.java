package com.google.common.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface GwtCompatible {
    boolean emulated() default false;

    boolean serializable() default false;
}
