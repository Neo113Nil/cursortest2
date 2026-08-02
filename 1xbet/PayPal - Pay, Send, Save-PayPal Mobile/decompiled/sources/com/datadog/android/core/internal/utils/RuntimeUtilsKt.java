package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\"\u0010\u0001\u001a\u00020\u00008\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/InternalLogger;", "unboundInternalLogger", "Lcom/datadog/android/api/InternalLogger;", "getUnboundInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "setUnboundInternalLogger", "(Lcom/datadog/android/api/InternalLogger;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeUtilsKt {
    private static com.datadog.android.api.InternalLogger unboundInternalLogger = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();

    public static final com.datadog.android.api.InternalLogger getUnboundInternalLogger() {
        return unboundInternalLogger;
    }

    public static final void setUnboundInternalLogger(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        unboundInternalLogger = internalLogger;
    }
}
