package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010!"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "Landroidx/compose/ui/layout/AlignmentLine;", "p0", "Landroidx/compose/ui/unit/TextUnit;", "p1", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p3", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;JJLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Camera2StreamConfigurationMap", "()Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/AlignmentLine;", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AlignmentLineOffsetTextUnitElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.AlignmentLine getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetTextUnitElement(androidx.compose.ui.layout.AlignmentLine alignmentLine, long j, long j2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = alignmentLine;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.Camera2StreamConfigurationMap = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitNode(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.getHighSpeedVideoSizes.hashCode() * 31) + androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.getHighSpeedVideoFpsRangesFor)) * 31) + androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = p0 instanceof androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitElement ? (androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitElement) p0 : null;
        return alignmentLineOffsetTextUnitElement != null && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, alignmentLineOffsetTextUnitElement.getHighSpeedVideoSizes) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.getHighSpeedVideoFpsRangesFor, alignmentLineOffsetTextUnitElement.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.getHighSpeedVideoFpsRanges, alignmentLineOffsetTextUnitElement.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.Camera2StreamConfigurationMap.invoke(inspectorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitNode p0) {
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
    }

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(androidx.compose.ui.layout.AlignmentLine alignmentLine, long j, long j2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, j, j2, function1);
    }
}
