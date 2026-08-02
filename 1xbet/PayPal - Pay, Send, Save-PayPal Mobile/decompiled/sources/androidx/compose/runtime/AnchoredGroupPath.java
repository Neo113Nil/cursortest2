package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/AnchoredGroupPath;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "", "p0", "<init>", "(I)V", "Landroidx/compose/runtime/SlotTable;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/SlotTable;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnchoredGroupPath extends androidx.compose.runtime.SourceInformationGroupPath {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    public AnchoredGroupPath(int i) {
        super(null);
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.runtime.SlotTable p0) {
        return p0.anchor(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof androidx.compose.runtime.AnchoredGroupPath) && ((androidx.compose.runtime.AnchoredGroupPath) p0).getHighSpeedVideoSizes == this.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes * 31;
    }
}
