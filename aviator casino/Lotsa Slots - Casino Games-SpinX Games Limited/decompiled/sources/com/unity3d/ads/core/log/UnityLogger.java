package com.unity3d.ads.core.log;

/* compiled from: UnityLogger.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/log/UnityLogger;", "Lcom/unity3d/ads/core/log/Logger;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/CreateFile;)V", "isForced", "", "value", "Lcom/unity3d/ads/core/log/LogLevel;", "logLevel", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevel;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevel;)V", "canLog", "targetLogLevel", "", "debug", "", "fb", "Lkotlin/Function0;", "", "message", "error", "e", "", "info", "trace", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnityLogger implements com.unity3d.ads.core.log.Logger {
    private static final java.lang.String LOG_TAG = "UnityAds";
    private final boolean isForced;
    private com.unity3d.ads.core.log.LogLevel logLevel;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (getLogLevel() != com.unity3d.ads.core.log.LogLevel.TRACE) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UnityLogger(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.CreateFile createFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createFile, "createFile");
        this.logLevel = com.unity3d.ads.core.log.LogLevel.INFO;
        java.io.File invoke = createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode");
        try {
            try {
                boolean enableTracing = sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing();
                if (invoke.exists() || enableTracing) {
                    setLogLevel(com.unity3d.ads.core.log.LogLevel.TRACE);
                    debug("Unity logger initialized in TRACE mode");
                }
            } catch (java.lang.Throwable unused) {
                android.util.Log.w("UnityAds", "An issue occurred while initializing the logger");
            }
        } finally {
            this.isForced = getLogLevel() == com.unity3d.ads.core.log.LogLevel.TRACE;
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public com.unity3d.ads.core.log.LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(com.unity3d.ads.core.log.LogLevel value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (this.isForced) {
            return;
        }
        this.logLevel = value;
    }

    private final boolean canLog(int targetLogLevel) {
        return targetLogLevel >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(4)) {
            android.util.Log.i("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(3)) {
            android.util.Log.d("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(java.lang.String message, java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(6)) {
            android.util.Log.e("UnityAds", message, e);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(java.lang.String message, java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(2)) {
            android.util.Log.v("UnityAds", message, e);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(kotlin.jvm.functions.Function0<java.lang.String> fb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fb, "fb");
        if (canLog(3)) {
            debug(fb.invoke());
        }
    }
}
