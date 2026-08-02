package com.paypal.oslo.feature.cryptocurrency.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/CryptoOnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "", "product", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter;", "provisioningFlowRouter", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "status", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;", "mapStatusToEffect", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;)Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;", "Ljava/lang/String;", "getProduct", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOnboardingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter getHighSpeedVideoFpsRangesFor;
    private final java.lang.String product;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/CryptoOnboardingViewModel$Factory;", "", "", "product", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/CryptoOnboardingViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/CryptoOnboardingViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel create(java.lang.String product);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.assisted.AssistedInject
    public CryptoOnboardingViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter cryptoProvisioningFlowRouter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoProvisioningFlowRouter, "");
        this.product = str;
        this.getHighSpeedVideoFpsRangesFor = cryptoProvisioningFlowRouter;
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto mapIntentToIntentId = cryptoProvisioningFlowRouter.mapIntentToIntentId(str == null ? "" : str);
        this.getHighResolutionOutputSizeshNQ4ISI = mapIntentToIntentId == null ? new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto(null, 1, 0 == true ? 1 : 0) : mapIntentToIntentId;
    }

    public final java.lang.String getProduct() {
        return this.product;
    }

    /* renamed from: getIntentId, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect mapStatusToEffect(com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        int i = com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToHub.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToError.INSTANCE;
        }
        if (i == 3 || i == 4 || i == 5) {
            return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.GoBack.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.api.domain.Status.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_PROGRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_REVIEW.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
