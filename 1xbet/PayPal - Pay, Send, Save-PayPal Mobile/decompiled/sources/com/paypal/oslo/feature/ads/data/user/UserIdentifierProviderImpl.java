package com.paypal.oslo.feature.ads.data.user;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProviderImpl;", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProvider;", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;", "userIdentificationProvider", "", "isDemoFlavor", "<init>", "(Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;Z)V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/UserIdentifier;", "getUserIdentifier", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserIdentifierProviderImpl implements com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public UserIdentifierProviderImpl(com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider userIdentificationProvider, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIdentificationProvider, "");
        this.getHighSpeedVideoSizes = userIdentificationProvider;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getUserIdentifier(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier> continuation) {
        com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl$getUserIdentifier$1 userIdentifierProviderImpl$getUserIdentifier$1;
        int i;
        final java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl$getUserIdentifier$1) {
            userIdentifierProviderImpl$getUserIdentifier$1 = (com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl$getUserIdentifier$1) continuation;
            if ((userIdentifierProviderImpl$getUserIdentifier$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                userIdentifierProviderImpl$getUserIdentifier$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = userIdentifierProviderImpl$getUserIdentifier$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userIdentifierProviderImpl$getUserIdentifier$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider userIdentificationProvider = this.getHighSpeedVideoSizes;
                    userIdentifierProviderImpl$getUserIdentifier$1.Camera2StreamConfigurationMap = 1;
                    obj = userIdentificationProvider.getPayPalPayerId(userIdentifierProviderImpl$getUserIdentifier$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        throw new java.lang.IllegalStateException("No user identification data available. User must be authenticated to fetch ads.".toString());
                    }
                    str = "2234567892223";
                }
                return new com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId(com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl.$r8$lambda$bbhKhFf75oRMYGn2JWjAIkRzDSM(str, (com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier.Builder) obj2);
                    }
                }));
            }
        }
        userIdentifierProviderImpl$getUserIdentifier$1 = new com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl$getUserIdentifier$1(this, continuation);
        java.lang.Object obj2 = userIdentifierProviderImpl$getUserIdentifier$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userIdentifierProviderImpl$getUserIdentifier$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        return new com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.PaypalPayerId(com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl.$r8$lambda$bbhKhFf75oRMYGn2JWjAIkRzDSM(str, (com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier.Builder) obj22);
            }
        }));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bbhKhFf75oRMYGn2JWjAIkRzDSM(java.lang.String str, com.paypal.oslo.feature.ads.data.models.smithy.PayPalPayerIdIdentifier.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setPayerId(str);
        return kotlin.Unit.INSTANCE;
    }
}
