package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0011\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\"\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010 "}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AlignmentLineOffsetDpNode;", "Landroidx/compose/ui/layout/AlignmentLine;", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p3", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/layout/AlignmentLineOffsetDpNode;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/layout/AlignmentLineOffsetDpNode;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/AlignmentLine;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AlignmentLineOffsetDpElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.AlignmentLineOffsetDpNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.AlignmentLine getHighSpeedVideoSizes;
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(androidx.compose.ui.layout.AlignmentLine alignmentLine, float f, float f2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = alignmentLine;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighSpeedVideoFpsRangesFor = function1;
        boolean z = true;
        boolean z2 = f >= 0.0f || java.lang.Float.isNaN(f);
        if (f2 < 0.0f && !java.lang.Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.AlignmentLineOffsetDpNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.AlignmentLineOffsetDpNode(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.AlignmentLineOffsetDpNode p0) {
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        p0.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
        p0.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.getHighSpeedVideoFpsRangesFor.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        androidx.compose.foundation.layout.AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = p0 instanceof androidx.compose.foundation.layout.AlignmentLineOffsetDpElement ? (androidx.compose.foundation.layout.AlignmentLineOffsetDpElement) p0 : null;
        return alignmentLineOffsetDpElement != null && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, alignmentLineOffsetDpElement.getHighSpeedVideoSizes) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, alignmentLineOffsetDpElement.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, alignmentLineOffsetDpElement.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.getHighSpeedVideoSizes.hashCode() * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public /* synthetic */ AlignmentLineOffsetDpElement(androidx.compose.ui.layout.AlignmentLine alignmentLine, float f, float f2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, f, f2, function1);
    }
}
