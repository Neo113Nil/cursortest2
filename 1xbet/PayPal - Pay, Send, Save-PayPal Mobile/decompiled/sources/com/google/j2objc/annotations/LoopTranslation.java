package com.google.j2objc.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.LOCAL_VARIABLE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface LoopTranslation {

    /* loaded from: classes9.dex */
    public enum LoopStyle {
        JAVA_ITERATOR,
        FAST_ENUMERATION
    }

    com.google.j2objc.annotations.LoopTranslation.LoopStyle value();
}
