package com.zettle.o11y.android.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/o11y/android/core/O11YDataDogManagerInterface;", "", "Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "getDDCustomAttributeTrackingManager", "()Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "Lokhttp3/Interceptor;", "getDDOkHttpInterceptor", "()Lokhttp3/Interceptor;", "Landroid/content/Context;", "context", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "startObservability", "(Landroid/content/Context;Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;)V", "stopObservability", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface O11YDataDogManagerInterface {
    com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager getDDCustomAttributeTrackingManager();

    okhttp3.Interceptor getDDOkHttpInterceptor();

    void startObservability(android.content.Context context, com.zettle.o11y.android.core.configuration.O11YConfiguration configuration);

    void stopObservability();
}
