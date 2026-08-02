package com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/submission/ui/AccountCreationSubmissionImageProvider;", "Lcom/paypal/oslo/feature/oneonboarding/ui/common/StepImageProvider;", "<init>", "()V", "", "", "getImages", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountCreationSubmissionImageProvider implements com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AccountCreationSubmissionImageProvider() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider
    public final java.util.List<java.lang.String> getImages() {
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.AccountCreationSubmissionImageProviderKt.AccountCreationSubmissionBackgroundUrl);
    }
}
