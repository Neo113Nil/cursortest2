package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularSendMoneyUseCases;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByNameUseCase;", "byName", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByEmailUseCase;", "byEmail", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByPhoneUseCase;", "byPhone", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByUsernameUseCase;", "byUsername", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByNameUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByEmailUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByPhoneUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByUsernameUseCase;)V", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByNameUseCase;", "getByName", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByNameUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByEmailUseCase;", "getByEmail", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByEmailUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByPhoneUseCase;", "getByPhone", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByPhoneUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByUsernameUseCase;", "getByUsername", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByUsernameUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GranularSendMoneyUseCases {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase byEmail;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByNameUseCase byName;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase byPhone;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase byUsername;

    @javax.inject.Inject
    public GranularSendMoneyUseCases(com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByNameUseCase updateAllowSendMoneyByNameUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase updateAllowSendMoneyByEmailUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase updateAllowSendMoneyByPhoneUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase updateAllowSendMoneyByUsernameUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowSendMoneyByNameUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowSendMoneyByEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowSendMoneyByPhoneUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowSendMoneyByUsernameUseCase, "");
        this.byName = updateAllowSendMoneyByNameUseCase;
        this.byEmail = updateAllowSendMoneyByEmailUseCase;
        this.byPhone = updateAllowSendMoneyByPhoneUseCase;
        this.byUsername = updateAllowSendMoneyByUsernameUseCase;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByNameUseCase getByName() {
        return this.byName;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase getByEmail() {
        return this.byEmail;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase getByPhone() {
        return this.byPhone;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase getByUsername() {
        return this.byUsername;
    }
}
