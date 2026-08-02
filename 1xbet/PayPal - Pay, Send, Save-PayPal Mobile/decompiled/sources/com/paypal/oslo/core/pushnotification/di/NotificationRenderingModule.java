package com.paypal.oslo.core.pushnotification.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/di/NotificationRenderingModule;", "", "Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationRendererImpl;", "impl", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "bindNotificationRenderer", "(Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationRendererImpl;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "Lcom/paypal/oslo/core/pushnotification/data/media/MediaImageLoaderImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;", "bindMediaImageLoader", "(Lcom/paypal/oslo/core/pushnotification/data/media/MediaImageLoaderImpl;)Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;", "", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomViewRenderer;", "bindCustomViewRenderers", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface NotificationRenderingModule {
    @dagger.multibindings.Multibinds
    java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer> bindCustomViewRenderers();

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader bindMediaImageLoader(com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer bindNotificationRenderer(com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl impl);
}
