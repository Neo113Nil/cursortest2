package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/pds/components/SelectionCardPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/pds/components/SelectionCardPreviewConfig;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRanges", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class SelectionCardPreviewProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.pds.components.SelectionCardPreviewConfig> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<com.paypal.pds.components.SelectionCardPreviewConfig> getHighResolutionOutputSizeshNQ4ISI;

    public SelectionCardPreviewProvider() {
        float f;
        float f2;
        float f3;
        float f4;
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig = new com.paypal.pds.components.SelectionCardPreviewConfig("Vertical - Basic", new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null), false, false, false, false, 60, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig2 = new com.paypal.pds.components.SelectionCardPreviewConfig("Vertical - With Link", new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null), false, false, true, false, 44, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig3 = new com.paypal.pds.components.SelectionCardPreviewConfig("Vertical - Equal Height & Icon", new com.paypal.pds.components.SelectionCardConfig.Vertical(true), true, false, false, false, 56, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig4 = new com.paypal.pds.components.SelectionCardPreviewConfig("Vertical - With Indicator", new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null), true, false, false, true, 24, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig5 = new com.paypal.pds.components.SelectionCardPreviewConfig("Vertical - Custom View", new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null), false, true, false, true, 20, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig6 = new com.paypal.pds.components.SelectionCardPreviewConfig("Grid - With Icon", new com.paypal.pds.components.SelectionCardConfig.Grid(false, 0, 3, null), true, false, false, false, 56, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig7 = new com.paypal.pds.components.SelectionCardPreviewConfig("Grid - With Icon & Indicator", new com.paypal.pds.components.SelectionCardConfig.Grid(false, 0, 3, null), true, false, false, true, 24, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig8 = new com.paypal.pds.components.SelectionCardPreviewConfig("Grid - Equal Heights", new com.paypal.pds.components.SelectionCardConfig.Grid(true, 0, 2, null), false, false, false, false, 60, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig9 = new com.paypal.pds.components.SelectionCardPreviewConfig("Grid - 3 Columns", new com.paypal.pds.components.SelectionCardConfig.Grid(false, 3, 1, null), true, false, false, false, 56, null);
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig10 = new com.paypal.pds.components.SelectionCardPreviewConfig("Grid - Single Column", new com.paypal.pds.components.SelectionCardConfig.Grid(false, 1, 1, null), false, false, false, false, 60, null);
        f = com.paypal.pds.components.SelectionCardKt.getHighSpeedVideoFpsRanges;
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig11 = new com.paypal.pds.components.SelectionCardPreviewConfig("HScroll - Basic", new com.paypal.pds.components.SelectionCardConfig.HorizontalScroll(f, null), false, false, false, false, 60, null);
        f2 = com.paypal.pds.components.SelectionCardKt.getHighSpeedVideoFpsRanges;
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig12 = new com.paypal.pds.components.SelectionCardPreviewConfig("HScroll - With Icon", new com.paypal.pds.components.SelectionCardConfig.HorizontalScroll(f2, null), true, false, false, false, 56, null);
        f3 = com.paypal.pds.components.SelectionCardKt.getHighSpeedVideoFpsRanges;
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig13 = new com.paypal.pds.components.SelectionCardPreviewConfig("HScroll - With Indicator & Icon", new com.paypal.pds.components.SelectionCardConfig.HorizontalScroll(f3, null), true, false, false, true, 24, null);
        f4 = com.paypal.pds.components.SelectionCardKt.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.pds.components.SelectionCardPreviewConfig[]{selectionCardPreviewConfig, selectionCardPreviewConfig2, selectionCardPreviewConfig3, selectionCardPreviewConfig4, selectionCardPreviewConfig5, selectionCardPreviewConfig6, selectionCardPreviewConfig7, selectionCardPreviewConfig8, selectionCardPreviewConfig9, selectionCardPreviewConfig10, selectionCardPreviewConfig11, selectionCardPreviewConfig12, selectionCardPreviewConfig13, new com.paypal.pds.components.SelectionCardPreviewConfig("HScroll - Custom View", new com.paypal.pds.components.SelectionCardConfig.HorizontalScroll(f4, null), false, true, false, true, 20, null)});
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.pds.components.SelectionCardPreviewConfig> getValues() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
