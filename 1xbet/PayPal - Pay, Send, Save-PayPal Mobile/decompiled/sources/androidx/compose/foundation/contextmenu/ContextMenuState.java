package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState;", "", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "initialStatus", "<init>", "(Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "<set-?>", "status$delegate", "Landroidx/compose/runtime/MutableState;", "getStatus", "()Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "setStatus", "status", "Status"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextMenuState {
    public static final int $stable = 0;

    /* renamed from: status$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState status;

    public ContextMenuState(androidx.compose.foundation.contextmenu.ContextMenuState.Status status) {
        this.status = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(status, null, 2, null);
    }

    public /* synthetic */ ContextMenuState(androidx.compose.foundation.contextmenu.ContextMenuState.Status.Closed closed, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.foundation.contextmenu.ContextMenuState.Status.Closed.INSTANCE : closed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.contextmenu.ContextMenuState.Status getStatus() {
        return (androidx.compose.foundation.contextmenu.ContextMenuState.Status) this.status.getValue();
    }

    public final void setStatus(androidx.compose.foundation.contextmenu.ContextMenuState.Status status) {
        this.status.setValue(status);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContextMenuState(status=");
        sb.append(getStatus());
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return getStatus().hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof androidx.compose.foundation.contextmenu.ContextMenuState) {
            return kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.foundation.contextmenu.ContextMenuState) other).getStatus(), getStatus());
        }
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "", "<init>", "()V", "Open", "Closed", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Status {
        public static final int $stable = 0;

        private Status() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getOffset-F1C5BW0", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Open extends androidx.compose.foundation.contextmenu.ContextMenuState.Status {
            public static final int $stable = 0;
            private final long offset;

            private Open(long j) {
                super(null);
                this.offset = j;
                if ((j & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            /* renamed from: getOffset-F1C5BW0, reason: not valid java name and from getter */
            public final long getOffset() {
                return this.offset;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Open(offset=");
                sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.offset));
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.offset);
            }

            public final boolean equals(java.lang.Object other) {
                if (other == this) {
                    return true;
                }
                if (other instanceof androidx.compose.foundation.contextmenu.ContextMenuState.Status.Open) {
                    return androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.offset, ((androidx.compose.foundation.contextmenu.ContextMenuState.Status.Open) other).offset);
                }
                return false;
            }

            public /* synthetic */ Open(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(j);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Closed extends androidx.compose.foundation.contextmenu.ContextMenuState.Status {
            public static final int $stable = 0;
            public static final androidx.compose.foundation.contextmenu.ContextMenuState.Status.Closed INSTANCE = new androidx.compose.foundation.contextmenu.ContextMenuState.Status.Closed();

            private Closed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Closed";
            }
        }

        public /* synthetic */ Status(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
