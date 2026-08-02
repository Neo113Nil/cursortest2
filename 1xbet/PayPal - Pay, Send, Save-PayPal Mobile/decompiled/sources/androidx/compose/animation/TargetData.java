package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f"}, d2 = {"Landroidx/compose/animation/TargetData;", "", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Offset;", "initialMfrOffset", "targetStructuralOffset", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "size$delegate", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "initialMfrOffset$delegate", "getInitialMfrOffset-F1C5BW0", "setInitialMfrOffset-k-4lQ0M", "targetStructuralOffset$delegate", "getTargetStructuralOffset-F1C5BW0", "setTargetStructuralOffset-k-4lQ0M", "currentMfrOffset$delegate", "getCurrentMfrOffset-F1C5BW0", "setCurrentMfrOffset-k-4lQ0M", "currentMfrOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TargetData {
    public static final int $stable = 0;

    /* renamed from: currentMfrOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentMfrOffset;

    /* renamed from: initialMfrOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState initialMfrOffset;

    /* renamed from: size$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState size;

    /* renamed from: targetStructuralOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState targetStructuralOffset;

    private TargetData(long j, long j2, long j3) {
        this.size = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m5809boximpl(j), null, 2, null);
        this.initialMfrOffset = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(j2), null, 2, null);
        this.targetStructuralOffset = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(j3), null, 2, null);
        this.currentMfrOffset = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(j2), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m1159getSizeNHjbRc() {
        return ((androidx.compose.ui.geometry.Size) this.size.getValue()).m5826unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m1163setSizeuvyYCjk(long j) {
        this.size.setValue(androidx.compose.ui.geometry.Size.m5809boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getInitialMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m1158getInitialMfrOffsetF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.initialMfrOffset.getValue()).m5762unboximpl();
    }

    /* renamed from: setInitialMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m1162setInitialMfrOffsetk4lQ0M(long j) {
        this.initialMfrOffset.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getTargetStructuralOffset-F1C5BW0, reason: not valid java name */
    public final long m1160getTargetStructuralOffsetF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.targetStructuralOffset.getValue()).m5762unboximpl();
    }

    /* renamed from: setTargetStructuralOffset-k-4lQ0M, reason: not valid java name */
    public final void m1164setTargetStructuralOffsetk4lQ0M(long j) {
        this.targetStructuralOffset.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m1157getCurrentMfrOffsetF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.currentMfrOffset.getValue()).m5762unboximpl();
    }

    /* renamed from: setCurrentMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m1161setCurrentMfrOffsetk4lQ0M(long j) {
        this.currentMfrOffset.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    public /* synthetic */ TargetData(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
