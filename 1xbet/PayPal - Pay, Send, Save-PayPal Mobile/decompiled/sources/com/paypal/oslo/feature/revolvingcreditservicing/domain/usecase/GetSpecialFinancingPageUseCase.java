package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetSpecialFinancingPageUseCase;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/SpecialFinancingRepository;", "specialFinancingRepository", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/SpecialFinancingRepository;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/SpecialFinancingRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/SpecialFinancingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/SpecialFinancingRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetSpecialFinancingPageUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetSpecialFinancingPageUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository specialFinancingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingRepository, "");
        this.Camera2StreamConfigurationMap = specialFinancingRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest specialFinancingRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage>> continuation) {
        return this.Camera2StreamConfigurationMap.getSpecialFinancingPage(specialFinancingRequest, continuation);
    }
}
