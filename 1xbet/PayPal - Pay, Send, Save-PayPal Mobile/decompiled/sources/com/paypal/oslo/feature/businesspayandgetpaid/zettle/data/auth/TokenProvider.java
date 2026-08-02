package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0006\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0012\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/auth/TokenProvider;", "Lcom/zettle/sdk/core/auth/PayPalUatTokenProviderSuspending;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "exchangeTokenForAuthCode", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "scopes", "", "isRetryAfter401", "Lcom/zettle/sdk/core/auth/PayPalUatOAuthTokens;", "provideTokens", "([Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TokenProvider implements com.zettle.sdk.core.auth.PayPalUatTokenProviderSuspending {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public TokenProvider(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.core.auth.PayPalUatTokenProviderSuspending
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object provideTokens(java.lang.String[] strArr, boolean z, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.PayPalUatOAuthTokens> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider$provideTokens$1 tokenProvider$provideTokens$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider$provideTokens$1) {
            tokenProvider$provideTokens$1 = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider$provideTokens$1) continuation;
            if ((tokenProvider$provideTokens$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                tokenProvider$provideTokens$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = tokenProvider$provideTokens$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tokenProvider$provideTokens$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> function1 = this.getHighSpeedVideoSizes;
                    tokenProvider$provideTokens$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(strArr);
                    tokenProvider$provideTokens$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    tokenProvider$provideTokens$1.getHighSpeedVideoSizes = 1;
                    obj = function1.invoke(tokenProvider$provideTokens$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = tokenProvider$provideTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.zettle.sdk.core.auth.PayPalUatOAuthTokens((java.lang.String) obj, Long.MAX_VALUE);
            }
        }
        tokenProvider$provideTokens$1 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider$provideTokens$1(this, continuation);
        java.lang.Object obj2 = tokenProvider$provideTokens$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tokenProvider$provideTokens$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new com.zettle.sdk.core.auth.PayPalUatOAuthTokens((java.lang.String) obj2, Long.MAX_VALUE);
    }
}
