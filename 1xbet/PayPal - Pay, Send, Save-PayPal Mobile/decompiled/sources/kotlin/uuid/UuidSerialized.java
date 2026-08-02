package kotlin.uuid;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Lkotlin/uuid/UuidSerialized;", "Ljava/io/Externalizable;", "", "p0", "p1", "<init>", "(JJ)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class UuidSerialized implements java.io.Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public long getHighSpeedVideoFpsRangesFor;

    public UuidSerialized(long j, long j2) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
    }

    public UuidSerialized() {
        this(0L, 0L);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.writeLong(this.getHighResolutionOutputSizeshNQ4ISI);
        p0.writeLong(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = p0.readLong();
        this.getHighSpeedVideoFpsRangesFor = p0.readLong();
    }

    private final java.lang.Object readResolve() {
        return kotlin.uuid.Uuid.INSTANCE.fromLongs(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }
}
