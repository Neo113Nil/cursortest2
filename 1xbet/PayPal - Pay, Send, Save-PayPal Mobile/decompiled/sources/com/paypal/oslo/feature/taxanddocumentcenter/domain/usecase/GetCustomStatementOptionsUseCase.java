package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetCustomStatementOptionsUseCase;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/CustomStatementRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/CustomStatementRepository;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/CustomStatementOptionsDomain;", "invoke", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/CustomStatementOptionsDomain;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/CustomStatementRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetCustomStatementOptionsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.CustomStatementRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCustomStatementOptionsUseCase(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.CustomStatementRepository customStatementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customStatementRepository, "");
        this.getHighSpeedVideoFpsRangesFor = customStatementRepository;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain invoke() {
        return this.getHighSpeedVideoFpsRangesFor.getCustomStatementOptions();
    }
}
