package com.datadog.android.api;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "", "onlyOnce", "Lkotlin/Function0;", "", "messageBuilder", "", "logToUser", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/api/InternalLogger$Level;ZLkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalLoggerKt {
    public static /* synthetic */ void logToUser$default(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.api.InternalLogger.Level level, boolean z, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        logToUser(internalLogger, level, z, function0);
    }

    public static final void logToUser(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.api.InternalLogger.Level level, boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, level, com.datadog.android.api.InternalLogger.Target.USER, function0, (java.lang.Throwable) null, z, (java.util.Map) null, 40, (java.lang.Object) null);
    }
}
