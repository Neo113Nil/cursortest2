package com.paypal.oslo.feature.identity.changepassword.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/changepassword/domain/usecase/ChangePasswordUseCase;", "", "Lcom/paypal/oslo/feature/identity/changepassword/domain/repository/ChangePasswordRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/changepassword/domain/repository/ChangePasswordRepository;)V", "", "currentPassword", androidx.autofill.HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "confirmNewPassword", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/changepassword/domain/model/ChangePasswordError;", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/changepassword/domain/repository/ChangePasswordRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangePasswordUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ChangePasswordUseCase(com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository changePasswordRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePasswordRepository, "");
        this.Camera2StreamConfigurationMap = changePasswordRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError, kotlin.Unit>> continuation) {
        return this.Camera2StreamConfigurationMap.changePassword(str, str2, str3, continuation);
    }
}
