package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\n*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R%\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R'\u0010+\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u00100\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00103\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0014\u0010(\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010/R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00102R\u0014\u0010.\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MagnifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/MagnifierNode;", "node", "update", "(Landroidx/compose/foundation/MagnifierNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getOutputFormats", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Z", "getInputSizeshNQ4ISI", "J", "getInputFormats", "Landroidx/compose/foundation/PlatformMagnifierFactory;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MagnifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.MagnifierNode> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpSize, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.PlatformMagnifierFactory getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = function12;
        this.getHighSpeedVideoFpsRanges = function13;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getInputFormats = j;
        this.getInputSizeshNQ4ISI = f2;
        this.getOutputFormats = f3;
        this.getOutputMinFrameDuration = z2;
        this.getHighSpeedVideoSizesFor = platformMagnifierFactory;
    }

    public /* synthetic */ MagnifierElement(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? androidx.compose.ui.unit.DpSize.INSTANCE.m8708getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : f2, (i & 128) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : f3, (i & 256) != 0 ? true : z2, platformMagnifierFactory, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.MagnifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.MagnifierNode(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.MagnifierNode node) {
        node.m1345update5F03MCQ(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.MagnifierElement)) {
            return false;
        }
        androidx.compose.foundation.MagnifierElement magnifierElement = (androidx.compose.foundation.MagnifierElement) other;
        return this.getHighResolutionOutputSizeshNQ4ISI == magnifierElement.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap == magnifierElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == magnifierElement.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == magnifierElement.getHighSpeedVideoFpsRangesFor && androidx.compose.ui.unit.DpSize.m8696equalsimpl0(this.getInputFormats, magnifierElement.getInputFormats) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getInputSizeshNQ4ISI, magnifierElement.getInputSizeshNQ4ISI) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getOutputFormats, magnifierElement.getOutputFormats) && this.getOutputMinFrameDuration == magnifierElement.getOutputMinFrameDuration && this.getHighSpeedVideoFpsRanges == magnifierElement.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, magnifierElement.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1 = this.Camera2StreamConfigurationMap;
        int hashCode2 = function1 != null ? function1.hashCode() : 0;
        int hashCode3 = java.lang.Float.hashCode(this.getHighSpeedVideoSizes);
        int hashCode4 = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
        int m8701hashCodeimpl = androidx.compose.ui.unit.DpSize.m8701hashCodeimpl(this.getInputFormats);
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getInputSizeshNQ4ISI);
        int m8607hashCodeimpl2 = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getOutputFormats);
        int hashCode5 = java.lang.Boolean.hashCode(this.getOutputMinFrameDuration);
        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpSize, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRanges;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + m8701hashCodeimpl) * 31) + m8607hashCodeimpl) * 31) + m8607hashCodeimpl2) * 31) + hashCode5) * 31) + (function12 != null ? function12.hashCode() : 0)) * 31) + this.getHighSpeedVideoSizesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.getHighResolutionOutputSizeshNQ4ISI);
        inspectorInfo.getProperties().set("magnifierCenter", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set("zoom", java.lang.Float.valueOf(this.getHighSpeedVideoSizes));
        inspectorInfo.getProperties().set(io.ktor.http.ContentDisposition.Parameters.Size, androidx.compose.ui.unit.DpSize.m8687boximpl(this.getInputFormats));
        inspectorInfo.getProperties().set("cornerRadius", androidx.compose.ui.unit.Dp.m8599boximpl(this.getInputSizeshNQ4ISI));
        inspectorInfo.getProperties().set("elevation", androidx.compose.ui.unit.Dp.m8599boximpl(this.getOutputFormats));
        inspectorInfo.getProperties().set("clippingEnabled", java.lang.Boolean.valueOf(this.getOutputMinFrameDuration));
    }

    public /* synthetic */ MagnifierElement(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }
}
