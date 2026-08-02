package com.paypal.oslo.feature.identity.moreoptions.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/GetAuthOptionsUseCase;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;)V", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "invoke", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetAuthOptionsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetAuthOptionsUseCase(com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moreOptionRepository, "");
        this.getHighSpeedVideoFpsRangesFor = moreOptionRepository;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> invoke() {
        return this.getHighSpeedVideoFpsRangesFor.getAllAuthOptions();
    }
}
