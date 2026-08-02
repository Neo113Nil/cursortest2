package com.ingo.sdk.kotlin.common.core.logging;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/logging/IngoLogger;", "", "<init>", "()V", "", "message", "tag", "", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "", "exception", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/ingo/sdk/kotlin/common/core/logging/PlatformLogger;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/kotlin/common/core/logging/PlatformLogger;", "getHighSpeedVideoSizes", "", "enabled", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IngoLogger {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.core.logging.PlatformLogger getHighSpeedVideoSizes = new com.ingo.sdk.kotlin.common.core.logging.PlatformLogger();
    private boolean enabled = true;

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public static /* synthetic */ void d$default(com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogger, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "Ingo SDK";
        }
        ingoLogger.d(str, str2);
    }

    public final void d(java.lang.String message, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        if (this.enabled) {
            this.getHighSpeedVideoSizes.logDebug(tag, message);
        }
    }

    public static /* synthetic */ void e$default(com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogger, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "Ingo SDK";
        }
        if ((i & 4) != 0) {
            th = null;
        }
        ingoLogger.e(str, str2, th);
    }

    public final void e(java.lang.String message, java.lang.String tag, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        if (this.enabled) {
            if (exception != null) {
                this.getHighSpeedVideoSizes.logError(tag, message, exception);
            } else {
                this.getHighSpeedVideoSizes.logError(tag, message);
            }
        }
    }
}
