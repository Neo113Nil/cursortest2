package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "Landroidx/compose/foundation/text/Handle;", "handle", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "", "visible", "<init>", "(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/foundation/text/Handle;", "component2-F1C5BW0", "()J", "component2", "component3", "()Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "component4", "()Z", "copy-ubNVwUQ", "(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;Z)Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/Handle;", "getHandle", "J", "getPosition-F1C5BW0", "Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "getAnchor", "Z", "getVisible"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SelectionHandleInfo {
    public static final int $stable = 0;
    private final androidx.compose.foundation.text.selection.SelectionHandleAnchor anchor;
    private final androidx.compose.foundation.text.Handle handle;
    private final long position;
    private final boolean visible;

    private SelectionHandleInfo(androidx.compose.foundation.text.Handle handle, long j, androidx.compose.foundation.text.selection.SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.handle = handle;
        this.position = j;
        this.anchor = selectionHandleAnchor;
        this.visible = z;
    }

    public final androidx.compose.foundation.text.Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m2397getPositionF1C5BW0() {
        return this.position;
    }

    public final androidx.compose.foundation.text.selection.SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.handle);
        sb.append(", position=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.position));
        sb.append(", anchor=");
        sb.append(this.anchor);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.handle.hashCode() * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.position)) * 31) + this.anchor.hashCode()) * 31) + java.lang.Boolean.hashCode(this.visible);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.selection.SelectionHandleInfo)) {
            return false;
        }
        androidx.compose.foundation.text.selection.SelectionHandleInfo selectionHandleInfo = (androidx.compose.foundation.text.selection.SelectionHandleInfo) other;
        return this.handle == selectionHandleInfo.handle && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final androidx.compose.foundation.text.selection.SelectionHandleInfo m2396copyubNVwUQ(androidx.compose.foundation.text.Handle handle, long position, androidx.compose.foundation.text.selection.SelectionHandleAnchor anchor, boolean visible) {
        return new androidx.compose.foundation.text.selection.SelectionHandleInfo(handle, position, anchor, visible, null);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.foundation.text.selection.SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.foundation.text.Handle getHandle() {
        return this.handle;
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.text.selection.SelectionHandleInfo m2394copyubNVwUQ$default(androidx.compose.foundation.text.selection.SelectionHandleInfo selectionHandleInfo, androidx.compose.foundation.text.Handle handle, long j, androidx.compose.foundation.text.selection.SelectionHandleAnchor selectionHandleAnchor, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i & 2) != 0) {
            j = selectionHandleInfo.position;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        androidx.compose.foundation.text.selection.SelectionHandleAnchor selectionHandleAnchor2 = selectionHandleAnchor;
        if ((i & 8) != 0) {
            z = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m2396copyubNVwUQ(handle, j2, selectionHandleAnchor2, z);
    }

    public /* synthetic */ SelectionHandleInfo(androidx.compose.foundation.text.Handle handle, long j, androidx.compose.foundation.text.selection.SelectionHandleAnchor selectionHandleAnchor, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j, selectionHandleAnchor, z);
    }
}
