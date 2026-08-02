package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/ReaderKind;", "reader", "", "recordReadIn-h_f27i8$runtime", "(I)V", "recordReadIn", "", "isReadIn-h_f27i8$runtime", "(I)Z", "isReadIn", "Landroidx/compose/runtime/internal/AtomicInt;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/internal/AtomicInt;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StateObjectImpl implements androidx.compose.runtime.snapshots.StateObject {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.internal.AtomicInt getHighSpeedVideoFpsRanges = new androidx.compose.runtime.internal.AtomicInt(0);

    /* renamed from: recordReadIn-h_f27i8$runtime, reason: not valid java name */
    public final void m5492recordReadInh_f27i8$runtime(int reader) {
        int m5475constructorimpl;
        do {
            m5475constructorimpl = androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(this.getHighSpeedVideoFpsRanges.get());
            if ((m5475constructorimpl & reader) != 0) {
                return;
            }
        } while (!this.getHighSpeedVideoFpsRanges.compareAndSet(m5475constructorimpl, androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(m5475constructorimpl | reader)));
    }

    /* renamed from: isReadIn-h_f27i8$runtime, reason: not valid java name */
    public final boolean m5491isReadInh_f27i8$runtime(int reader) {
        return (reader & androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(this.getHighSpeedVideoFpsRanges.get())) != 0;
    }
}
