package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/TapToPayApiModule;", "", "Lcom/paypal/oslo/feature/taptopay/domain/api/DeleteCardApiImpl;", "impl", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;", "bindDeleteCardApi", "(Lcom/paypal/oslo/feature/taptopay/domain/api/DeleteCardApiImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;", "Lcom/paypal/oslo/feature/taptopay/domain/api/IsCardDigitizedApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/IsCardDigitizedApi;", "bindIsCardDigitizedApi", "(Lcom/paypal/oslo/feature/taptopay/domain/api/IsCardDigitizedApiImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/IsCardDigitizedApi;", "Lcom/paypal/oslo/feature/taptopay/domain/api/GetCardApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardApi;", "bindGetCardApi", "(Lcom/paypal/oslo/feature/taptopay/domain/api/GetCardApiImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardApi;", "Lcom/paypal/oslo/feature/taptopay/domain/api/GetAllCardsApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetAllCardsApi;", "bindGetAllCardsApi", "(Lcom/paypal/oslo/feature/taptopay/domain/api/GetAllCardsApiImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetAllCardsApi;", "Lcom/paypal/oslo/feature/taptopay/domain/api/GetCardEligibilityApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardEligibilityApi;", "bindGetCardEligibilityApi", "(Lcom/paypal/oslo/feature/taptopay/domain/api/GetCardEligibilityApiImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardEligibilityApi;", "Lcom/paypal/oslo/feature/taptopay/domain/api/IsTapToPayEnabledImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/IsTapToPayEnabled;", "bindIsTapToPayEnabled", "(Lcom/paypal/oslo/feature/taptopay/domain/api/IsTapToPayEnabledImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/IsTapToPayEnabled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface TapToPayApiModule {
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi bindDeleteCardApi(com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi bindGetAllCardsApi(com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardApi bindGetCardApi(com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi bindGetCardEligibilityApi(com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi bindIsCardDigitizedApi(com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled bindIsTapToPayEnabled(com.paypal.oslo.feature.taptopay.domain.api.IsTapToPayEnabledImpl impl);
}
