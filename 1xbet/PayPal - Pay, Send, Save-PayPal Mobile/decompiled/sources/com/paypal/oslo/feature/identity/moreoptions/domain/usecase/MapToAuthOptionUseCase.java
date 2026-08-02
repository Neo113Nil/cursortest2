package com.paypal.oslo.feature.identity.moreoptions.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MapToAuthOptionUseCase;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;)V", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "optionType", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "invoke", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapToAuthOptionUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public MapToAuthOptionUseCase(com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moreOptionRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = moreOptionRepository;
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions invoke(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.mapToAuthOption(optionType);
    }
}
