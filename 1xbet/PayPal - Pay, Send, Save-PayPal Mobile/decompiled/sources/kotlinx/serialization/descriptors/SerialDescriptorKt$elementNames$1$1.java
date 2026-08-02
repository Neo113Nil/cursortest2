package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorKt$elementNames$1$1;", "", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/String;", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SerialDescriptorKt$elementNames$1$1 implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    SerialDescriptorKt$elementNames$1$1(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        this.getHighResolutionOutputSizeshNQ4ISI = serialDescriptor;
        this.getHighSpeedVideoFpsRangesFor = serialDescriptor.getElementsCount();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor > 0;
    }

    @Override // java.util.Iterator
    public final java.lang.String next() {
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = this.getHighResolutionOutputSizeshNQ4ISI;
        int elementsCount = serialDescriptor.getElementsCount();
        int i = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i - 1;
        return serialDescriptor.getElementName(elementsCount - i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
