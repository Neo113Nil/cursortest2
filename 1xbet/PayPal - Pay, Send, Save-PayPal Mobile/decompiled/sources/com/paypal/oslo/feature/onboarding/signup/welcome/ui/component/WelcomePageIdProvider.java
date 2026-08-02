package com.paypal.oslo.feature.onboarding.signup.welcome.ui.component;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/component/WelcomePageIdProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRanges", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WelcomePageIdProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> getHighSpeedVideoSizes = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId[]{com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP, com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.PAY, com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.EARN, com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.TRANSFER});

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId> getValues() {
        return this.getHighSpeedVideoSizes;
    }
}
