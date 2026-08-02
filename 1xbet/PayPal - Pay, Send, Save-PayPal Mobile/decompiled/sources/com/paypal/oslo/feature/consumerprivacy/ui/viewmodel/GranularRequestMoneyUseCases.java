package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularRequestMoneyUseCases;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByNameUseCase;", "byName", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByEmailUseCase;", "byEmail", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByPhoneUseCase;", "byPhone", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByUsernameUseCase;", "byUsername", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByNameUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByEmailUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByPhoneUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByUsernameUseCase;)V", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByNameUseCase;", "getByName", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByNameUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByEmailUseCase;", "getByEmail", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByEmailUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByPhoneUseCase;", "getByPhone", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByPhoneUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByUsernameUseCase;", "getByUsername", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowRequestMoneyByUsernameUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GranularRequestMoneyUseCases {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase byEmail;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByNameUseCase byName;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByPhoneUseCase byPhone;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByUsernameUseCase byUsername;

    @javax.inject.Inject
    public GranularRequestMoneyUseCases(com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByNameUseCase updateAllowRequestMoneyByNameUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase updateAllowRequestMoneyByEmailUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByPhoneUseCase updateAllowRequestMoneyByPhoneUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByUsernameUseCase updateAllowRequestMoneyByUsernameUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowRequestMoneyByNameUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowRequestMoneyByEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowRequestMoneyByPhoneUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowRequestMoneyByUsernameUseCase, "");
        this.byName = updateAllowRequestMoneyByNameUseCase;
        this.byEmail = updateAllowRequestMoneyByEmailUseCase;
        this.byPhone = updateAllowRequestMoneyByPhoneUseCase;
        this.byUsername = updateAllowRequestMoneyByUsernameUseCase;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByNameUseCase getByName() {
        return this.byName;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase getByEmail() {
        return this.byEmail;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByPhoneUseCase getByPhone() {
        return this.byPhone;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByUsernameUseCase getByUsername() {
        return this.byUsername;
    }
}
