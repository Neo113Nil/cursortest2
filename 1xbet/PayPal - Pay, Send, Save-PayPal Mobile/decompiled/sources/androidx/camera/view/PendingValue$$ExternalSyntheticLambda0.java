package androidx.camera.view;

/* loaded from: classes6.dex */
public final /* synthetic */ class PendingValue$$ExternalSyntheticLambda0 implements androidx.concurrent.futures.CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ androidx.camera.view.PendingValue f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ PendingValue$$ExternalSyntheticLambda0(androidx.camera.view.PendingValue pendingValue, java.lang.Object obj) {
        this.f$0 = pendingValue;
        this.f$1 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        androidx.camera.view.PendingValue pendingValue = this.f$0;
        java.lang.Object obj = this.f$1;
        androidx.core.util.Pair<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void>, T> pair = pendingValue.getHighSpeedVideoSizes;
        if (pair != 0) {
            ((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) java.util.Objects.requireNonNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) pair.first)).setCancelled();
        }
        pendingValue.getHighSpeedVideoSizes = new androidx.core.util.Pair<>(completer, obj);
        return "PendingValue ".concat(java.lang.String.valueOf(obj));
    }
}
