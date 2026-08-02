package androidx.compose.runtime.internal;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.RUNTIME)
@androidx.compose.runtime.ComposeCompilerApi
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/internal/FunctionKeyMeta;", "", "", "key", "startOffset", "endOffset", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Repeatable
@java.lang.annotation.Repeatable(androidx.compose.runtime.internal.FunctionKeyMeta.Container.class)
/* loaded from: classes.dex */
public @interface FunctionKeyMeta {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.RUNTIME)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        androidx.compose.runtime.internal.FunctionKeyMeta[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}
