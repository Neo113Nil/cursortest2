package org.jetbrains.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PACKAGE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface Nls {

    public enum Capitalization {
        NotSpecified,
        Title,
        Sentence
    }

    org.jetbrains.annotations.Nls.Capitalization capitalization() default org.jetbrains.annotations.Nls.Capitalization.NotSpecified;
}
