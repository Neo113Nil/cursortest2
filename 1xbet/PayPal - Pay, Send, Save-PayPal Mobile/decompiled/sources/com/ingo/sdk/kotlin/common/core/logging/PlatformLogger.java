package com.ingo.sdk.kotlin.common.core.logging;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ%\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/logging/PlatformLogger;", "", "<init>", "()V", "", "tag", "message", "", "logDebug", "(Ljava/lang/String;Ljava/lang/String;)V", "logError", "", "exception", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PlatformLogger {
    public final void logDebug(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
    }

    public final void logError(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
    }

    public final void logError(java.lang.String tag, java.lang.String message, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
    }
}
