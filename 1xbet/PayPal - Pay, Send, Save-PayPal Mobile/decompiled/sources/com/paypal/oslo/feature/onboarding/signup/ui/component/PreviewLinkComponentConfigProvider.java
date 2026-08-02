package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/component/PreviewLinkComponentConfigProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/LinkComponentConfig;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PreviewLinkComponentConfigProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig> getHighResolutionOutputSizeshNQ4ISI = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig[]{new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig("preview_link_small", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("LINK"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig("link_field_small", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("LINK"), "Terms and Conditions", com.paypal.pds.components.LinkSize.Small.INSTANCE, null), null), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig("preview_link_medium", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("LINK"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig("link_field_medium", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("LINK"), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.PRIVACY_TITLE, com.paypal.pds.components.LinkSize.Medium.INSTANCE, null), null), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig("preview_link_large", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("LINK"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig("link_field_large", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("LINK"), "Learn More", com.paypal.pds.components.LinkSize.Large.INSTANCE, null), null)});

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig> getValues() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
