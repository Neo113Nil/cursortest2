package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetMenuItemsUseCase;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/MenuRepository;", "menuRepository", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/MenuRepository;)V", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuGroupDomain;", "invoke", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/MenuRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetMenuItemsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.MenuRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetMenuItemsUseCase(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.MenuRepository menuRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuRepository, "");
        this.getHighSpeedVideoFpsRangesFor = menuRepository;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain> invoke() {
        return this.getHighSpeedVideoFpsRangesFor.getMenuGroups();
    }
}
