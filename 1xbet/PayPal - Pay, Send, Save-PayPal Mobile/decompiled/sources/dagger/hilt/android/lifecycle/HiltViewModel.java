package dagger.hilt.android.lifecycle;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface HiltViewModel {
    java.lang.Class<?> assistedFactory() default java.lang.Object.class;
}
