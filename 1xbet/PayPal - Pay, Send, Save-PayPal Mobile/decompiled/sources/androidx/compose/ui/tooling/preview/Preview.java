package androidx.compose.ui.tooling.preview;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.FUNCTION})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0082\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\b\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\t\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\r\u001a\u00020\f8\u0007¢\u0006\u0006\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\f8\u0007¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/compose/ui/tooling/preview/Preview;", "", "", "name", "group", "", "apiLevel", "widthDp", "heightDp", "locale", "", "fontScale", "", "showSystemUi", "showBackground", "", "backgroundColor", "uiMode", "device", "wallpaper", "()Ljava/lang/String;", "()I", "()F", "()Z", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Repeatable
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(androidx.compose.ui.tooling.preview.Preview.Container.class)
/* loaded from: classes.dex */
public @interface Preview {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.FUNCTION})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        androidx.compose.ui.tooling.preview.Preview[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    java.lang.String device() default "";

    float fontScale() default 1.0f;

    java.lang.String group() default "";

    int heightDp() default -1;

    java.lang.String locale() default "";

    java.lang.String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int wallpaper() default -1;

    int widthDp() default -1;
}
