package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/SlotWriter$groupSlots$1;", "", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "current", com.visa.cbp.getEncExpo.warmup, "getCurrent", "()I", "setCurrent", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotWriter$groupSlots$1 implements java.util.Iterator<java.lang.Object>, kotlin.jvm.internal.markers.KMappedMarker {
    private int current;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.SlotWriter getHighSpeedVideoSizes;

    SlotWriter$groupSlots$1(int i, int i2, androidx.compose.runtime.SlotWriter slotWriter) {
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizes = slotWriter;
        this.current = i;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.current < this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            return null;
        }
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
        androidx.compose.runtime.SlotWriter slotWriter = this.getHighSpeedVideoSizes;
        int i = this.current;
        this.current = i + 1;
        return objArr[slotWriter.getHighSpeedVideoFpsRanges(i)];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
