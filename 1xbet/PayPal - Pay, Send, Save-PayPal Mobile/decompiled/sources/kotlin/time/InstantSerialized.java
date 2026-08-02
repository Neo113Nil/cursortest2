package kotlin.time;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/time/InstantSerialized;", "Ljava/io/Externalizable;", "", "p0", "", "p1", "<init>", "(JI)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class InstantSerialized implements java.io.Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public int getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public long getHighSpeedVideoFpsRanges;

    public InstantSerialized(long j, int i) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = i;
    }

    public InstantSerialized() {
        this(0L, 0);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.writeLong(this.getHighSpeedVideoFpsRanges);
        p0.writeInt(this.getHighSpeedVideoSizes);
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges = p0.readLong();
        this.getHighSpeedVideoSizes = p0.readInt();
    }

    private final java.lang.Object readResolve() {
        return kotlin.time.Instant.INSTANCE.fromEpochSeconds(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }
}
