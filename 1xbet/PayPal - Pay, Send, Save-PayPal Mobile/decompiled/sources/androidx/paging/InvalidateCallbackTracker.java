package androidx.paging;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013"}, d2 = {"Landroidx/paging/InvalidateCallbackTracker;", "T", "", "Lkotlin/Function1;", "", "callbackInvoker", "Lkotlin/Function0;", "", "invalidGetter", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "callbackCount$paging_common", "()I", com.sun.jna.Callback.METHOD_NAME, "registerInvalidatedCallback$paging_common", "(Ljava/lang/Object;)V", "unregisterInvalidatedCallback$paging_common", "invalidate$paging_common", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "Landroidx/paging/internal/SynchronizedLock;", "Camera2StreamConfigurationMap", "Landroidx/paging/internal/SynchronizedLock;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "p0", "invalid", "Z", "getInvalid$paging_common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InvalidateCallbackTracker<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.paging.internal.SynchronizedLock getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final java.util.List<T> getHighSpeedVideoSizes;
    private boolean invalid;

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidateCallbackTracker(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.paging.internal.SynchronizedLock();
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
    }

    public /* synthetic */ InvalidateCallbackTracker(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function0);
    }

    /* renamed from: getInvalid$paging_common, reason: from getter */
    public final boolean getInvalid() {
        return this.invalid;
    }

    public final int callbackCount$paging_common() {
        return this.getHighSpeedVideoSizes.size();
    }

    public final void registerInvalidatedCallback$paging_common(T callback) {
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = this.getHighSpeedVideoFpsRangesFor;
        boolean z = true;
        if (function0 != null && function0.invoke().booleanValue()) {
            invalidate$paging_common();
        }
        if (this.invalid) {
            this.getHighSpeedVideoFpsRanges.invoke(callback);
            return;
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (!this.invalid) {
                this.getHighSpeedVideoSizes.add(callback);
                z = false;
            }
        }
        if (z) {
            this.getHighSpeedVideoFpsRanges.invoke(callback);
        }
    }

    public final void unregisterInvalidatedCallback$paging_common(T callback) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes.remove(callback);
        }
    }

    public final boolean invalidate$paging_common() {
        if (this.invalid) {
            return false;
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.invalid) {
                return false;
            }
            this.invalid = true;
            java.util.List list = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes.clear();
            kotlin.jvm.functions.Function1<T, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            return true;
        }
    }
}
