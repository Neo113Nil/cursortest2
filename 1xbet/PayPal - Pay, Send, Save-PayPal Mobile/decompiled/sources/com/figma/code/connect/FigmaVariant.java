package com.figma.code.connect;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/figma/code/connect/FigmaVariant;", "", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Repeatable
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Repeatable(com.figma.code.connect.FigmaVariant.Container.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface FigmaVariant {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        com.figma.code.connect.FigmaVariant[] value();
    }

    java.lang.String key();

    java.lang.String value();
}
