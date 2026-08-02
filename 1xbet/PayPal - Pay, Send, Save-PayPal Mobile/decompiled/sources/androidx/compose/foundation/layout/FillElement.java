package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/foundation/layout/Direction;", "p0", "", "p1", "", "p2", "<init>", "(Landroidx/compose/foundation/layout/Direction;FLjava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/layout/FillNode;", "", "(Landroidx/compose/foundation/layout/FillNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/Direction;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Companion_"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FillElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.FillNode> {

    /* renamed from: Companion_, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.FillElement.Companion INSTANCE = new androidx.compose.foundation.layout.FillElement.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.Direction getHighSpeedVideoFpsRanges;

    public FillElement(androidx.compose.foundation.layout.Direction direction, float f, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = direction;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoSizes = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.FillNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.FillNode(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.FillNode p0) {
        p0.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
        p0.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set("fraction", java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.FillElement)) {
            return false;
        }
        androidx.compose.foundation.layout.FillElement fillElement = (androidx.compose.foundation.layout.FillElement) p0;
        return this.getHighSpeedVideoFpsRanges == fillElement.getHighSpeedVideoFpsRanges && this.getHighResolutionOutputSizeshNQ4ISI == fillElement.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/layout/FillElement$Companion_;", "", "<init>", "()V", "", "fraction", "Landroidx/compose/foundation/layout/FillElement;", "width", "(F)Landroidx/compose/foundation/layout/FillElement;", "height", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.FillElement$Companion_, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.layout.FillElement width(float fraction) {
            return new androidx.compose.foundation.layout.FillElement(androidx.compose.foundation.layout.Direction.Horizontal, fraction, "fillMaxWidth");
        }

        public final androidx.compose.foundation.layout.FillElement height(float fraction) {
            return new androidx.compose.foundation.layout.FillElement(androidx.compose.foundation.layout.Direction.Vertical, fraction, "fillMaxHeight");
        }

        public final androidx.compose.foundation.layout.FillElement size(float fraction) {
            return new androidx.compose.foundation.layout.FillElement(androidx.compose.foundation.layout.Direction.Both, fraction, "fillMaxSize");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
