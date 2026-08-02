package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/activities/GetFinancialActivitiesOverviewUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesOverviewRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/FinancialActivitiesRequestError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/FinancialActivityRepository;", "financialActivityRepository", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/FinancialActivityRepository;)V", "input", "Larrow/core/Ior;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/FinancialActivityRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetFinancialActivitiesOverviewUseCase implements com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase<com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest, com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetFinancialActivitiesOverviewUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository financialActivityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialActivityRepository, "");
        this.Camera2StreamConfigurationMap = financialActivityRepository;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview>> continuation) {
        return invoke2(activitiesOverviewRequest, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview>> continuation) {
        return this.Camera2StreamConfigurationMap.getActivitiesOverview(activitiesOverviewRequest, continuation);
    }
}
