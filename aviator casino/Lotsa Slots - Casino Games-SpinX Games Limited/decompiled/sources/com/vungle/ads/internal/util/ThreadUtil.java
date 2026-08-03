package com.vungle.ads.internal.util;

/* compiled from: ThreadUtil.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/util/ThreadUtil;", "", "()V", "UI_HANDLER", "Landroid/os/Handler;", "isMainThread", "", "()Z", "uiExecutor", "Ljava/util/concurrent/Executor;", "getUiExecutor$vungle_ads_release$annotations", "getUiExecutor$vungle_ads_release", "()Ljava/util/concurrent/Executor;", "setUiExecutor$vungle_ads_release", "(Ljava/util/concurrent/Executor;)V", "runOnUiThread", "", "block", "Lkotlin/Function0;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ThreadUtil {
    public static final com.vungle.ads.internal.util.ThreadUtil INSTANCE = new com.vungle.ads.internal.util.ThreadUtil();
    private static final android.os.Handler UI_HANDLER = new android.os.Handler(android.os.Looper.getMainLooper());
    private static java.util.concurrent.Executor uiExecutor;

    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }

    private ThreadUtil() {
    }

    public final java.util.concurrent.Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final void setUiExecutor$vungle_ads_release(java.util.concurrent.Executor executor) {
        uiExecutor = executor;
    }

    public final boolean isMainThread() {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return mainLooper.isCurrentThread();
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null && kotlin.jvm.internal.Intrinsics.areEqual(mainLooper.getThread(), myLooper.getThread());
    }

    public final void runOnUiThread(final kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (isMainThread()) {
            block.invoke();
            return;
        }
        java.util.concurrent.Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(new java.lang.Runnable() { // from class: com.vungle.ads.internal.util.ThreadUtil$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.util.ThreadUtil.m10512runOnUiThread$lambda1(kotlin.jvm.functions.Function0.this);
                }
            });
        } else if (executor != null) {
            executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.util.ThreadUtil$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.util.ThreadUtil.m10511runOnUiThread$lambda0(kotlin.jvm.functions.Function0.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m10511runOnUiThread$lambda0(kotlin.jvm.functions.Function0 tmp0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m10512runOnUiThread$lambda1(kotlin.jvm.functions.Function0 tmp0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
