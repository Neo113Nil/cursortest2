package com.vungle.ads.internal.executor;

/* compiled from: FutureResult.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002:\u0001\u0013B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000bJ \u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/executor/FutureResult;", "T", "Ljava/util/concurrent/Future;", "future", "(Ljava/util/concurrent/Future;)V", "getFuture", "()Ljava/util/concurrent/Future;", "cancel", "", "mayInterruptIfRunning", "get", "()Ljava/lang/Object;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class FutureResult<T> implements java.util.concurrent.Future<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.executor.FutureResult.Companion INSTANCE = new com.vungle.ads.internal.executor.FutureResult.Companion(null);
    private static final java.lang.String TAG = "FutureResult";
    private final java.util.concurrent.Future<T> future;

    /* compiled from: FutureResult.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/executor/FutureResult$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getTAG() {
            return com.vungle.ads.internal.executor.FutureResult.TAG;
        }
    }

    public FutureResult(java.util.concurrent.Future<T> future) {
        this.future = future;
    }

    public final java.util.concurrent.Future<T> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        java.util.concurrent.Future<T> future = this.future;
        if (future != null) {
            return future.cancel(mayInterruptIfRunning);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        java.util.concurrent.Future<T> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.util.concurrent.Future<T> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        try {
            java.util.concurrent.Future<T> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (java.lang.InterruptedException unused) {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "future.get() Interrupted on Thread " + java.lang.Thread.currentThread().getName());
            java.lang.Thread.currentThread().interrupt();
            return null;
        } catch (java.util.concurrent.ExecutionException e) {
            com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG3 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.e(TAG3, "error on execution", e);
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            java.util.concurrent.Future<T> future = this.future;
            if (future != null) {
                return future.get(timeout, unit);
            }
            return null;
        } catch (java.lang.InterruptedException unused) {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "future.get() Interrupted on Thread " + java.lang.Thread.currentThread().getName());
            java.lang.Thread.currentThread().interrupt();
            return null;
        } catch (java.util.concurrent.ExecutionException e) {
            com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG3 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.e(TAG3, "error on execution", e);
            return null;
        } catch (java.util.concurrent.TimeoutException e2) {
            com.vungle.ads.internal.util.Logger.Companion companion3 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG4 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.e(TAG4, "error on timeout", e2);
            com.vungle.ads.internal.util.Logger.Companion companion4 = com.vungle.ads.internal.util.Logger.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion4.w(TAG4, "future.get() Timeout on Thread " + java.lang.Thread.currentThread().getName());
            return null;
        }
    }
}
