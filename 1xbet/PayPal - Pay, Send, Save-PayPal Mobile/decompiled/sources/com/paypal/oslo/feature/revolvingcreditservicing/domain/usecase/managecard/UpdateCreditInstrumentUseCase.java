package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/managecard/UpdateCreditInstrumentUseCase;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ManageAccountRepository;", "manageAccountRepositoryImpl", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ManageAccountRepository;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "creditInstrumentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "status", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CardLockUnlockError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CreditInstrumentUpdateResponse;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ManageAccountRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpdateCreditInstrumentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UpdateCreditInstrumentUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository manageAccountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAccountRepository, "");
        this.Camera2StreamConfigurationMap = manageAccountRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse>> continuation) {
        return this.Camera2StreamConfigurationMap.updateCreditInstrumentStatus(creditProductIdentifier, str, str2, creditInstrumentStatus, continuation);
    }
}
