package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lkotlinx/io/AlwaysSharedCopyTracker;", "Lkotlinx/io/SegmentCopyTracker;", "<init>", "()V", "", "addCopy", "", "removeCopy", "()Z", "getShared", "shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlwaysSharedCopyTracker extends kotlinx.io.SegmentCopyTracker {
    public static final kotlinx.io.AlwaysSharedCopyTracker INSTANCE = new kotlinx.io.AlwaysSharedCopyTracker();

    @Override // kotlinx.io.SegmentCopyTracker
    public final void addCopy() {
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public final boolean getShared() {
        return true;
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public final boolean removeCopy() {
        return true;
    }

    private AlwaysSharedCopyTracker() {
    }
}
