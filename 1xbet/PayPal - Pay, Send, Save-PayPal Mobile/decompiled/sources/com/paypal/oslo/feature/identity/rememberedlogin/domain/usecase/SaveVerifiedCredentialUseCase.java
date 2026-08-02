package com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/SaveVerifiedCredentialUseCase;", "", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;)V", "", "publicCredential", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;", "loginType", "", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaveVerifiedCredentialUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SaveVerifiedCredentialUseCase(com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository rememberedLoginRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = rememberedLoginRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object saveVerifiedCredential = this.getHighResolutionOutputSizeshNQ4ISI.saveVerifiedCredential(str, loginType, continuation);
        return saveVerifiedCredential == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? saveVerifiedCredential : kotlin.Unit.INSTANCE;
    }
}
