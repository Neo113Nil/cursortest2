package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowSendMoneyByEmailUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/GranularAccountVisibilityRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/GranularAccountVisibilityRepository;)V", "", "allowSendMoneyByEmail", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/GranularAccountVisibilityRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdateAllowSendMoneyByEmailUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdateAllowSendMoneyByEmailUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository granularAccountVisibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(granularAccountVisibilityRepository, "");
        this.getHighSpeedVideoSizes = granularAccountVisibilityRepository;
    }

    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        return this.getHighSpeedVideoSizes.updateAllowSendMoneyByEmail(z, continuation);
    }
}
