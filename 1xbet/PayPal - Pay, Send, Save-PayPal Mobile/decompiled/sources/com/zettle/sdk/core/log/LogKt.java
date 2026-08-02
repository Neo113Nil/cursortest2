package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\t*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\t*\u00020\u00032\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0000*\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\t*\u00020\u00032\u0006\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0010"}, d2 = {"", "tag", "parent", "Lcom/zettle/sdk/core/log/Loggable;", "loggable", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/core/log/Loggable;", "loggableFrom", "(Ljava/lang/String;)Lcom/zettle/sdk/core/log/Loggable;", "message", "", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "(Lcom/zettle/sdk/core/log/Loggable;Ljava/lang/String;)V", "log", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "report", "(Lcom/zettle/sdk/core/log/Loggable;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "toLog", "(Ljava/lang/Object;)Ljava/lang/String;", "warn"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LogKt {
    public static final com.zettle.sdk.core.log.Loggable loggable(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.zettle.sdk.core.log.Logger(str, str2);
    }

    public static /* synthetic */ com.zettle.sdk.core.log.Loggable loggable$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return loggable(str, str2);
    }

    public static final com.zettle.sdk.core.log.Loggable loggableFrom(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.zettle.sdk.core.log.Logger(null, str);
    }

    public static final void log(com.zettle.sdk.core.log.Loggable loggable, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.zettle.sdk.commons.util.Log.DefaultImpls.i$default(com.zettle.sdk.commons.util.Log.INSTANCE.get(loggable.getGetHighSpeedVideoFpsRangesFor()), str, null, 2, null);
    }

    public static /* synthetic */ void warn$default(com.zettle.sdk.core.log.Loggable loggable, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        warn(loggable, str, th);
    }

    public static final void warn(com.zettle.sdk.core.log.Loggable loggable, java.lang.String str, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.zettle.sdk.commons.util.Log.INSTANCE.get(loggable.getGetHighSpeedVideoFpsRangesFor()).w(str, th);
    }

    public static final void debug(com.zettle.sdk.core.log.Loggable loggable, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(com.zettle.sdk.commons.util.Log.INSTANCE.get(loggable.getGetHighSpeedVideoFpsRangesFor()), str, null, 2, null);
    }

    public static final void report(com.zettle.sdk.core.log.Loggable loggable, java.lang.String str, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        com.zettle.sdk.commons.util.Log.INSTANCE.get(loggable.getGetHighSpeedVideoFpsRangesFor()).e(str, new com.zettle.sdk.core.HealthMonitorException(loggable.getGetHighSpeedVideoFpsRangesFor(), str, th));
    }

    public static final java.lang.String toLog(java.lang.Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof com.zettle.sdk.core.log.SafeToLog) {
            return ((com.zettle.sdk.core.log.SafeToLog) obj).toLogString();
        }
        java.lang.String simpleName = obj.getClass().getSimpleName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleName);
        sb.append("(Implement SafeToLog for details)");
        return sb.toString();
    }
}
