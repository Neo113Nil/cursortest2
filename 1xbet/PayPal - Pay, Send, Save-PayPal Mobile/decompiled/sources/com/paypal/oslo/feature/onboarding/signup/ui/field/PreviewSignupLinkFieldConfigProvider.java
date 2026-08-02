package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/field/PreviewSignupLinkFieldConfigProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLinkFieldConfig;", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PreviewSignupLinkFieldConfigProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig> {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "Click here";

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig> getHighSpeedVideoFpsRangesFor = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig[]{new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig("preview_link_small", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("LINK"), "Click here", com.paypal.pds.components.LinkSize.Small.INSTANCE, null), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig("preview_link_medium", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("LINK"), "Click here", com.paypal.pds.components.LinkSize.Medium.INSTANCE, null), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig("preview_link_large", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("LINK"), "Click here", com.paypal.pds.components.LinkSize.Large.INSTANCE, null)});

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig> getValues() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
