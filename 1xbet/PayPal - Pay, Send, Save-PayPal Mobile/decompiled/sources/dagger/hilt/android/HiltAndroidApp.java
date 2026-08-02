package dagger.hilt.android;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface HiltAndroidApp {
    java.lang.Class<?> value() default java.lang.Void.class;
}
