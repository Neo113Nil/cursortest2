package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/LogoutUseCase;", "", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "identitySession", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;", "stringsProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/api/IdentitySession;Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/util/InAppCheckoutStringsProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LogoutUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.api.IdentitySession getHighSpeedVideoSizes;

    @javax.inject.Inject
    public LogoutUseCase(com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutStringsProvider, "");
        this.getHighSpeedVideoSizes = identitySession;
        this.getHighSpeedVideoFpsRangesFor = inAppCheckoutStringsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase$invoke$1 logoutUseCase$invoke$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase$invoke$1) {
                logoutUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase$invoke$1) continuation;
                if ((logoutUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    logoutUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = logoutUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = logoutUseCase$invoke$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.identity.api.IdentitySession identitySession = this.getHighSpeedVideoSizes;
                        logoutUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                        if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, logoutUseCase$invoke$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
            }
            if (i != 0) {
            }
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = this.getHighSpeedVideoFpsRangesFor.stringValue(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_logout_error);
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("LOGOUT_ERROR", message, true, null, null, 16, null));
        }
        logoutUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = logoutUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = logoutUseCase$invoke$1.getHighSpeedVideoSizes;
    }
}
