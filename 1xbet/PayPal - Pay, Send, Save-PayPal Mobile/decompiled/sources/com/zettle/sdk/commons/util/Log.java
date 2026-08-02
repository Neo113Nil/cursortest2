package com.zettle.sdk.commons.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fJ%\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000e\u0010\bJ%\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000f\u0010\bJ%\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0010\u0010\bR\u001c\u0010\u0016\u001a\u00020\u00118'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/commons/util/Log;", "", "", "m", "", "t", "", "d", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "subTag", "get", "(Ljava/lang/String;)Lcom/zettle/sdk/commons/util/Log;", "i", "v", "w", "wtf", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "Lcom/zettle/sdk/commons/util/Log$Strategy;", "getStrategy", "()Lcom/zettle/sdk/commons/util/Log$Strategy;", "setStrategy", "(Lcom/zettle/sdk/commons/util/Log$Strategy;)V", "strategy", "Companion", "Priority", "Strategy"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Log {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.util.Log.Companion INSTANCE = com.zettle.sdk.commons.util.Log.Companion.getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/zettle/sdk/commons/util/Log$Priority;", "", "<init>", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Priority {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR,
        ASSERT
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/commons/util/Log$Strategy;", "", "Lcom/zettle/sdk/commons/util/Log$Priority;", "priority", "", "tag", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcom/zettle/sdk/commons/util/Log$Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Strategy {
        void log(com.zettle.sdk.commons.util.Log.Priority priority, java.lang.String tag, java.lang.String message, java.lang.Throwable throwable);
    }

    void d(java.lang.String m, java.lang.Throwable t);

    void e(java.lang.String m, java.lang.Throwable t);

    com.zettle.sdk.commons.util.Log get(java.lang.String subTag);

    boolean getEnabled();

    com.zettle.sdk.commons.util.Log.Strategy getStrategy();

    void i(java.lang.String m, java.lang.Throwable t);

    void setEnabled(boolean z);

    void setStrategy(com.zettle.sdk.commons.util.Log.Strategy strategy);

    void v(java.lang.String m, java.lang.Throwable t);

    void w(java.lang.String m, java.lang.Throwable t);

    void wtf(java.lang.String m, java.lang.Throwable t);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void v$default(com.zettle.sdk.commons.util.Log log, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            log.v(str, th);
        }

        public static /* synthetic */ void d$default(com.zettle.sdk.commons.util.Log log, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            log.d(str, th);
        }

        public static /* synthetic */ void i$default(com.zettle.sdk.commons.util.Log log, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            log.i(str, th);
        }

        public static /* synthetic */ void w$default(com.zettle.sdk.commons.util.Log log, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            log.w(str, th);
        }

        public static /* synthetic */ void e$default(com.zettle.sdk.commons.util.Log log, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            log.e(str, th);
        }

        public static /* synthetic */ void wtf$default(com.zettle.sdk.commons.util.Log log, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wtf");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            log.wtf(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/zettle/sdk/commons/util/Log$Companion;", "", "<init>", "()V", "", "moduleTag", "Lcom/zettle/sdk/commons/util/Log;", "get", "(Ljava/lang/String;)Lcom/zettle/sdk/commons/util/Log;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/util/Log;", "Lcom/zettle/sdk/commons/util/Log$Strategy;", "getStrategy", "()Lcom/zettle/sdk/commons/util/Log$Strategy;", "setStrategy", "(Lcom/zettle/sdk/commons/util/Log$Strategy;)V", "strategy"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private static final java.util.Map<java.lang.String, com.zettle.sdk.commons.util.Log> getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ com.zettle.sdk.commons.util.Log.Companion getHighSpeedVideoFpsRangesFor;
        private static final com.zettle.sdk.commons.util.Log getHighSpeedVideoSizes;

        private Companion() {
        }

        static {
            com.zettle.sdk.commons.util.Log.Companion companion = new com.zettle.sdk.commons.util.Log.Companion();
            getHighSpeedVideoFpsRangesFor = companion;
            com.zettle.sdk.commons.util.LogImpl logImpl = new com.zettle.sdk.commons.util.LogImpl(com.zettle.sdk.commons.util.LogKt.TAG, null, new com.zettle.sdk.commons.util.Log$Companion$root$1(companion));
            logImpl.setEnabled(true);
            com.zettle.sdk.commons.util.LogImpl logImpl2 = logImpl;
            getHighSpeedVideoSizes = logImpl2;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair(com.zettle.sdk.commons.util.LogKt.TAG, logImpl2));
        }

        public final com.zettle.sdk.commons.util.Log.Strategy getStrategy() {
            return getHighSpeedVideoSizes.getStrategy();
        }

        public final void setStrategy(com.zettle.sdk.commons.util.Log.Strategy strategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
            getHighSpeedVideoSizes.setStrategy(strategy);
        }

        public final boolean getEnabled() {
            return getHighSpeedVideoSizes.getEnabled();
        }

        public final void setEnabled(boolean z) {
            getHighSpeedVideoSizes.setEnabled(z);
        }

        public final com.zettle.sdk.commons.util.Log get(java.lang.String moduleTag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleTag, "");
            return getHighSpeedVideoSizes.get(moduleTag);
        }

        public static final /* synthetic */ com.zettle.sdk.commons.util.Log access$getOrCreate(com.zettle.sdk.commons.util.Log.Companion companion, java.lang.String str, com.zettle.sdk.commons.util.Log log) {
            java.util.Map<java.lang.String, com.zettle.sdk.commons.util.Log> map = getHighResolutionOutputSizeshNQ4ISI;
            com.zettle.sdk.commons.util.LogImpl logImpl = map.get(str);
            if (logImpl == null) {
                logImpl = new com.zettle.sdk.commons.util.LogImpl(str, log, new com.zettle.sdk.commons.util.Log$Companion$getOrCreate$1$1(getHighSpeedVideoFpsRangesFor));
                map.put(str, logImpl);
            }
            return logImpl;
        }
    }
}
