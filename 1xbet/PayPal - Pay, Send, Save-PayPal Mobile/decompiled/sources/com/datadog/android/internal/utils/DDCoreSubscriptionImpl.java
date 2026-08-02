package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\tR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/internal/utils/DDCoreSubscriptionImpl;", "", "T", "Lcom/datadog/android/internal/utils/DDCoreSubscription;", "<init>", "()V", "p0", "", "addListener", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "notifyListeners", "(Lkotlin/jvm/functions/Function1;)V", "removeListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getHighResolutionOutputSizeshNQ4ISI", "", "getListenersCount", "()I", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DDCoreSubscriptionImpl<T> implements com.datadog.android.internal.utils.DDCoreSubscription<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.CopyOnWriteArraySet<T> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.CopyOnWriteArraySet<>();

    @Override // com.datadog.android.internal.utils.DDCoreSubscription
    public final void addListener(T p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.add(p0);
    }

    @Override // com.datadog.android.internal.utils.DDCoreSubscription
    public final void removeListener(T p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.remove(p0);
    }

    @Override // com.datadog.android.internal.utils.DDCoreSubscription
    public final void notifyListeners(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        for (T t : this.getHighResolutionOutputSizeshNQ4ISI) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "");
            p0.invoke(t);
        }
    }

    @Override // com.datadog.android.internal.utils.DDCoreSubscription
    public final int getListenersCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }
}
