package kotlin.internal;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.TYPEALIAS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\rR\u0011\u0010\n\u001a\u00020\t8\u0007¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e"}, d2 = {"Lkotlin/internal/RequireKotlin;", "", "", "version", "message", "Lkotlin/DeprecationLevel;", "level", "Lkotlin/internal/RequireKotlinVersionKind;", "versionKind", "", "errorCode", "()Ljava/lang/String;", "()Lkotlin/DeprecationLevel;", "()Lkotlin/internal/RequireKotlinVersionKind;", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.annotation.Repeatable
@java.lang.annotation.Repeatable(kotlin.internal.RequireKotlin.Container.class)
/* loaded from: classes3.dex */
public @interface RequireKotlin {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.TYPEALIAS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        kotlin.internal.RequireKotlin[] value();
    }

    int errorCode() default -1;

    kotlin.DeprecationLevel level() default kotlin.DeprecationLevel.ERROR;

    java.lang.String message() default "";

    java.lang.String version();

    kotlin.internal.RequireKotlinVersionKind versionKind() default kotlin.internal.RequireKotlinVersionKind.LANGUAGE_VERSION;
}
