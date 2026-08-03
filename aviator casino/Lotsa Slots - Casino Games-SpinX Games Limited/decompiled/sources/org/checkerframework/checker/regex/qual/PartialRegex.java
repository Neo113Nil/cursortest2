package org.checkerframework.checker.regex.qual;

@java.lang.annotation.Target({})
@org.checkerframework.framework.qual.InvisibleQualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.regex.qual.UnknownRegex.class})
/* loaded from: classes6.dex */
public @interface PartialRegex {
    java.lang.String value() default "";
}
