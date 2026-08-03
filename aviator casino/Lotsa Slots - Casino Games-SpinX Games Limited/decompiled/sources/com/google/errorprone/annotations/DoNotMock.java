package com.google.errorprone.annotations;

/* JADX WARN: Classes with same name are omitted:
  assets/audience_network/classes2.dex
 */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Inherited
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface DoNotMock {
    java.lang.String value() default "Create a real instance instead";
}
