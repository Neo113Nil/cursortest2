package com.paypal.oslo.core.deeplink.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/deeplink/annotations/DeepLinkDestination;", "", "", "path", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.annotation.Repeatable
@java.lang.annotation.Repeatable(com.paypal.oslo.core.deeplink.annotations.DeepLinkDestination.Container.class)
/* loaded from: classes2.dex */
public @interface DeepLinkDestination {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        com.paypal.oslo.core.deeplink.annotations.DeepLinkDestination[] value();
    }

    java.lang.String path();
}
