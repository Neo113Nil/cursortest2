package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/pds/components/CoachTipPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/Density;", "p0", "Lcom/paypal/pds/components/AnchorEdge;", "p1", "Landroidx/compose/ui/unit/Dp;", "p2", "Lcom/paypal/pds/components/AnchorEdge$EdgePositioning;", "p3", "<init>", "(Landroidx/compose/ui/unit/Density;Lcom/paypal/pds/components/AnchorEdge;FLcom/paypal/pds/components/AnchorEdge$EdgePositioning;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/pds/components/AnchorEdge;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "Lcom/paypal/pds/components/AnchorEdge$EdgePositioning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class CoachTipPopupPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;
    private final androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.pds.components.AnchorEdge getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.pds.components.AnchorEdge.EdgePositioning Camera2StreamConfigurationMap;

    private CoachTipPopupPositionProvider(androidx.compose.ui.unit.Density density, com.paypal.pds.components.AnchorEdge anchorEdge, float f, com.paypal.pds.components.AnchorEdge.EdgePositioning edgePositioning) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchorEdge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(edgePositioning, "");
        this.getHighResolutionOutputSizeshNQ4ISI = density;
        this.getHighSpeedVideoFpsRangesFor = anchorEdge;
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = edgePositioning;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect p0, long p1, androidx.compose.ui.unit.LayoutDirection p2, long p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        return this.getHighSpeedVideoFpsRangesFor.m21565calculatePopupPositionXLN5NMI$pds_release(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, com.paypal.pds.components.AnchorEdge.INSTANCE.m21567getTIP_WIDTHD9Ej5fM$pds_release(), com.paypal.pds.components.AnchorEdge.INSTANCE.m21566getTIP_HEIGHTD9Ej5fM$pds_release(), this.Camera2StreamConfigurationMap, p0, p2, p3);
    }

    public /* synthetic */ CoachTipPopupPositionProvider(androidx.compose.ui.unit.Density density, com.paypal.pds.components.AnchorEdge anchorEdge, float f, com.paypal.pds.components.AnchorEdge.EdgePositioning edgePositioning, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(density, anchorEdge, f, edgePositioning);
    }
}
