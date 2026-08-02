package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/AnnotatedLabelProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lkotlin/Pair;", "Lcom/paypal/pds/core/Typography;", "", "<init>", "()V", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnnotatedLabelProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<kotlin.Pair<? extends com.paypal.pds.core.Typography, ? extends java.lang.String>> {
    public static final int $stable = 8;
    private final kotlin.sequences.Sequence<kotlin.Pair<com.paypal.pds.core.Typography, java.lang.String>> values = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(com.paypal.pds.core.Typography.LinkSmall.INSTANCE, "Paypal Link Small"), kotlin.TuplesKt.to(com.paypal.pds.core.Typography.LinkMedium.INSTANCE, "Paypal Link Medium"), kotlin.TuplesKt.to(com.paypal.pds.core.Typography.LinkLarge.INSTANCE, "Paypal Link Large")});

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<kotlin.Pair<? extends com.paypal.pds.core.Typography, ? extends java.lang.String>> getValues() {
        return this.values;
    }
}
