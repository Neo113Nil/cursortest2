package com.zettle.o11y.android.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/zettle/o11y/android/core/O11YWrapper;", "", "<init>", "()V", "", "instanceName", "Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "getDDCustomAttributeTracker", "(Ljava/lang/String;)Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "Lokhttp3/Interceptor;", "getDDOkHttpInterceptor", "(Ljava/lang/String;)Lokhttp3/Interceptor;", "Lcom/zettle/o11y/android/core/O11YDataDogManagerInterface;", "getInstance", "(Ljava/lang/String;)Lcom/zettle/o11y/android/core/O11YDataDogManagerInterface;", "Landroid/content/Context;", "context", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "startObservability", "(Landroid/content/Context;Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;)V", "stopAllObservability", "stopObservability", "(Ljava/lang/String;)V", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class O11YWrapper {
    public static final com.zettle.o11y.android.core.O11YWrapper INSTANCE = new com.zettle.o11y.android.core.O11YWrapper();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.String, com.zettle.o11y.android.core.O11YDataDogManagerInterface> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

    private O11YWrapper() {
    }

    public final void startObservability(android.content.Context context, com.zettle.o11y.android.core.configuration.O11YConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        java.lang.String instanceName = configuration.getInstanceName();
        java.util.Map<java.lang.String, com.zettle.o11y.android.core.O11YDataDogManagerInterface> map = getHighSpeedVideoFpsRanges;
        com.zettle.o11y.android.core.O11YDataDogManagerInterface o11YDataDogManagerInterface = map.get(instanceName);
        if (o11YDataDogManagerInterface != null) {
            o11YDataDogManagerInterface.stopObservability();
        }
        com.zettle.o11y.android.core.O11YDataDogManager o11YDataDogManager = new com.zettle.o11y.android.core.O11YDataDogManager();
        o11YDataDogManager.startObservability(context, configuration);
        map.put(instanceName, o11YDataDogManager);
    }

    public final void stopObservability(java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "");
        com.zettle.o11y.android.core.O11YDataDogManagerInterface remove = getHighSpeedVideoFpsRanges.remove(instanceName);
        if (remove != null) {
            remove.stopObservability();
        }
    }

    public final com.zettle.o11y.android.core.O11YDataDogManagerInterface getInstance(java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "");
        com.zettle.o11y.android.core.O11YDataDogManagerInterface o11YDataDogManagerInterface = getHighSpeedVideoFpsRanges.get(instanceName);
        if (o11YDataDogManagerInterface != null) {
            return o11YDataDogManagerInterface;
        }
        throw new java.lang.IllegalArgumentException("No current instance set. Call startObservability first.".toString());
    }

    public final com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager getDDCustomAttributeTracker(java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "");
        return getInstance(instanceName).getDDCustomAttributeTrackingManager();
    }

    public final okhttp3.Interceptor getDDOkHttpInterceptor(java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "");
        return getInstance(instanceName).getDDOkHttpInterceptor();
    }

    public final void stopAllObservability() {
        java.util.Iterator<T> it = getHighSpeedVideoFpsRanges.values().iterator();
        while (it.hasNext()) {
            ((com.zettle.o11y.android.core.O11YDataDogManagerInterface) it.next()).stopObservability();
        }
        getHighSpeedVideoFpsRanges.clear();
    }
}
