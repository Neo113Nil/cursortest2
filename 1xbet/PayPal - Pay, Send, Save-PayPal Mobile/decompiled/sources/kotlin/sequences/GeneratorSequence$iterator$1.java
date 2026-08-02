package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlin/sequences/GeneratorSequence$iterator$1;", "", "", "getHighSpeedVideoSizes", "()V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "nextItem", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "", "nextState", com.visa.cbp.getEncExpo.warmup, "getNextState", "()I", "setNextState", "(I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GeneratorSequence$iterator$1<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.sequences.GeneratorSequence<T> getHighSpeedVideoFpsRanges;
    private T nextItem;
    private int nextState = -2;

    GeneratorSequence$iterator$1(kotlin.sequences.GeneratorSequence<T> generatorSequence) {
        this.getHighSpeedVideoFpsRanges = generatorSequence;
    }

    public final T getNextItem() {
        return this.nextItem;
    }

    public final void setNextItem(T t) {
        this.nextItem = t;
    }

    public final int getNextState() {
        return this.nextState;
    }

    public final void setNextState(int i) {
        this.nextState = i;
    }

    private final void getHighSpeedVideoSizes() {
        kotlin.jvm.functions.Function1 function1;
        T t;
        kotlin.jvm.functions.Function0 function0;
        if (this.nextState == -2) {
            function0 = ((kotlin.sequences.GeneratorSequence) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizes;
            t = (T) function0.invoke();
        } else {
            function1 = ((kotlin.sequences.GeneratorSequence) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
            T t2 = this.nextItem;
            kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
            t = (T) function1.invoke(t2);
        }
        this.nextItem = t;
        this.nextState = t == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.nextState < 0) {
            getHighSpeedVideoSizes();
        }
        if (this.nextState == 0) {
            throw new java.util.NoSuchElementException();
        }
        T t = this.nextItem;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        this.nextState = -1;
        return t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.nextState < 0) {
            getHighSpeedVideoSizes();
        }
        return this.nextState == 1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
