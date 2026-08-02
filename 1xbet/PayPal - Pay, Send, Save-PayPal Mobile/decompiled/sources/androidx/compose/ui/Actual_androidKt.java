package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"", "currentTimeMillis", "()J", "delayMillis", "Lkotlin/Function0;", "", "block", "", "postDelayed", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "removePost", "(Ljava/lang/Object;)V", "Landroid/os/Handler;", "getHighSpeedVideoFpsRangesFor", "Landroid/os/Handler;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Actual_androidKt {
    private static final android.os.Handler getHighSpeedVideoFpsRangesFor = new android.os.Handler(android.os.Looper.getMainLooper());

    public static final long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
    }

    public static final java.lang.Object postDelayed(long j, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.compose.ui.Actual_androidKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.Actual_androidKt.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0.this);
            }
        };
        getHighSpeedVideoFpsRangesFor.postDelayed(runnable, j);
        return runnable;
    }

    public static final void removePost(java.lang.Object obj) {
        if ((obj instanceof java.lang.Runnable ? (java.lang.Runnable) obj : null) == null) {
            return;
        }
        getHighSpeedVideoFpsRangesFor.removeCallbacks((java.lang.Runnable) obj);
    }
}
