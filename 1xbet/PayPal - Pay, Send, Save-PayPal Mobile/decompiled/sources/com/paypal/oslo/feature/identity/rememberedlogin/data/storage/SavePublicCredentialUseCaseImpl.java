package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/SavePublicCredentialUseCaseImpl;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/storage/SavePublicCredentialUseCase;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "rememberedUserStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;)V", "", "publicCredential", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SavePublicCredentialUseCaseImpl implements com.paypal.oslo.feature.identity.rememberedlogin.domain.storage.SavePublicCredentialUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SavePublicCredentialUseCaseImpl(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedUserStorageWithProfile, "");
        this.getHighSpeedVideoSizes = rememberedUserStorageWithProfile;
    }

    @Override // com.paypal.oslo.feature.identity.rememberedlogin.domain.storage.SavePublicCredentialUseCase
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object savePublicCredentialOnly = this.getHighSpeedVideoSizes.savePublicCredentialOnly(str, continuation);
        return savePublicCredentialOnly == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? savePublicCredentialOnly : kotlin.Unit.INSTANCE;
    }
}
