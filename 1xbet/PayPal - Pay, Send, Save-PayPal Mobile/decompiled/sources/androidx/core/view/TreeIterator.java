package androidx.core.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/core/view/TreeIterator;", "T", "", "rootIterator", "Lkotlin/Function1;", "getChildIterator", "<init>", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Iterator;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TreeIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private final kotlin.jvm.functions.Function1<T, java.util.Iterator<T>> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<java.util.Iterator<T>> getHighSpeedVideoSizes = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.Iterator<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public TreeIterator(java.util.Iterator<? extends T> it, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends T>> function1) {
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.getHighResolutionOutputSizeshNQ4ISI.next();
        java.util.Iterator<T> invoke = this.Camera2StreamConfigurationMap.invoke(next);
        if (invoke != null && invoke.hasNext()) {
            this.getHighSpeedVideoSizes.add(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI = invoke;
        } else {
            while (!this.getHighResolutionOutputSizeshNQ4ISI.hasNext() && !this.getHighSpeedVideoSizes.isEmpty()) {
                this.getHighResolutionOutputSizeshNQ4ISI = (java.util.Iterator) kotlin.collections.CollectionsKt.last((java.util.List) this.getHighSpeedVideoSizes);
                kotlin.collections.CollectionsKt.removeLast(this.getHighSpeedVideoSizes);
            }
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
