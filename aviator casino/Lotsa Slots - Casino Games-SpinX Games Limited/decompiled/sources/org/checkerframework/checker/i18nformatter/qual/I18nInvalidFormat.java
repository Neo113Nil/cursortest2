package org.checkerframework.checker.i18nformatter.qual;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.i18nformatter.qual.I18nUnknownFormat.class})
/* loaded from: classes6.dex */
public @interface I18nInvalidFormat {
    java.lang.String value();
}
