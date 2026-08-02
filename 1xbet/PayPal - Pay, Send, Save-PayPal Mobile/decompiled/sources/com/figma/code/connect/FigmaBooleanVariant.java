package com.figma.code.connect;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lcom/figma/code/connect/FigmaBooleanVariant;", "", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Ljava/lang/String;", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Repeatable
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Repeatable(com.figma.code.connect.FigmaBooleanVariant.Container.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface FigmaBooleanVariant {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        com.figma.code.connect.FigmaBooleanVariant[] value();
    }

    java.lang.String key();

    boolean value();
}
