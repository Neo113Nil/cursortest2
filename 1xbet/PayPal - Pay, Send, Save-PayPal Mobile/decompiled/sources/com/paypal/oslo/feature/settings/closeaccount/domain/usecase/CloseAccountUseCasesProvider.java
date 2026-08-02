package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCasesProvider;", "", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountEligibilityUseCase;", "getEligibility", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountUserProfileUseCase;", "getUserProfile", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCase;", "closeAccount", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CreateAccountActivityLogUseCase;", "createAccountActivityLog", "Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;", "logout", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountEligibilityUseCase;Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountUserProfileUseCase;Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCase;Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CreateAccountActivityLogUseCase;Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;)V", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountEligibilityUseCase;", "getGetEligibility", "()Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountEligibilityUseCase;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountUserProfileUseCase;", "getGetUserProfile", "()Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountUserProfileUseCase;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCase;", "getCloseAccount", "()Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCase;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CreateAccountActivityLogUseCase;", "getCreateAccountActivityLog", "()Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CreateAccountActivityLogUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;", "getLogout", "()Lcom/paypal/oslo/feature/settings/domain/usecase/LogoutUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountUseCasesProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase closeAccount;
    private final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase createAccountActivityLog;
    private final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase getEligibility;
    private final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getUserProfile;
    private final com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logout;

    @javax.inject.Inject
    public CloseAccountUseCasesProvider(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase getCloseAccountEligibilityUseCase, com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getCloseAccountUserProfileUseCase, com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase closeAccountUseCase, com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase createAccountActivityLogUseCase, com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logoutUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCloseAccountEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCloseAccountUserProfileUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAccountActivityLogUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutUseCase, "");
        this.getEligibility = getCloseAccountEligibilityUseCase;
        this.getUserProfile = getCloseAccountUserProfileUseCase;
        this.closeAccount = closeAccountUseCase;
        this.createAccountActivityLog = createAccountActivityLogUseCase;
        this.logout = logoutUseCase;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase getGetEligibility() {
        return this.getEligibility;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getGetUserProfile() {
        return this.getUserProfile;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase getCloseAccount() {
        return this.closeAccount;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase getCreateAccountActivityLog() {
        return this.createAccountActivityLog;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase getLogout() {
        return this.logout;
    }
}
