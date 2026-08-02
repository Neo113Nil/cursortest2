package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lkotlinx/io/SegmentCopyTracker;", "", "<init>", "()V", "", "addCopy", "", "removeCopy", "()Z", "getShared", "shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SegmentCopyTracker {
    public abstract void addCopy();

    public abstract boolean getShared();

    public abstract boolean removeCopy();
}
