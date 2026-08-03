package org.checkerframework.dataflow.qual;

/* JADX WARN: Classes with same name are omitted:
  assets/audience_network/classes.dex
 */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface Pure {

    public enum Kind {
        SIDE_EFFECT_FREE,
        DETERMINISTIC
    }
}
