package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/pds/components/ButtonSizePreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/pds/components/ButtonSize;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ButtonSizePreviewProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.pds.components.ButtonSize> {
    public static final int $stable = 8;
    private final kotlin.sequences.Sequence<com.paypal.pds.components.ButtonSize> values = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.pds.components.ButtonSize[]{com.paypal.pds.components.ButtonSize.Large.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE});

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.pds.components.ButtonSize> getValues() {
        return this.values;
    }
}
