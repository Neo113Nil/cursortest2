package com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/data/repository/MastercardConnectRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/repository/MastercardConnectRepository;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/handler/MastercardConnectEventHandler;", "eventHandler", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/connectsdk/handler/MastercardConnectEventHandler;)V", "Landroid/app/Activity;", "activity", "", "connectUrl", "redirectUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/model/MastercardConnectError;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectResult;", "initiateConnect", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "", "saveConnectUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedConnectUrl", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/handler/MastercardConnectEventHandler;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MastercardConnectRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public MastercardConnectRepositoryImpl(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mastercardConnectEventHandler, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mastercardConnectEventHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initiateConnect(android.app.Activity activity, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError, com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$initiateConnect$1 mastercardConnectRepositoryImpl$initiateConnect$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$initiateConnect$1) {
                mastercardConnectRepositoryImpl$initiateConnect$1 = (com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$initiateConnect$1) continuation;
                if ((mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Initiating Mastercard Connect flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasRedirectUrl", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str2.length() > 0))), null, 4, null);
                        this.getHighResolutionOutputSizeshNQ4ISI.resetForNewSession();
                        com.mastercard.openbanking.connect.Connect.start(activity, str, this.getHighResolutionOutputSizeshNQ4ISI);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Mastercard Connect SDK launched successfully", null, null, 6, null);
                        mastercardConnectRepositoryImpl$initiateConnect$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activity);
                        mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        mastercardConnectRepositoryImpl$initiateConnect$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoFpsRanges = 1;
                        obj = getHighSpeedVideoFpsRanges(mastercardConnectRepositoryImpl$initiateConnect$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (arrow.core.Either) obj;
                }
            }
            if (i != 0) {
            }
            return (arrow.core.Either) obj;
        } catch (java.io.IOException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Network error during Connect flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, e, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.Network.INSTANCE);
        } catch (java.lang.IllegalArgumentException e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Invalid argument for SDK", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e2.getMessage())), null, e2, 4, null);
            java.lang.String message = e2.getMessage();
            if (message == null) {
                message = "Invalid SDK configuration";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.SdkInitialization(message));
        } catch (java.lang.IllegalStateException e3) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "SDK initialization error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e3.getMessage())), null, e3, 4, null);
            java.lang.String message2 = e3.getMessage();
            if (message2 == null) {
                message2 = "SDK initialization failed";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.SdkInitialization(message2));
        }
        mastercardConnectRepositoryImpl$initiateConnect$1 = new com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$initiateConnect$1(this, continuation);
        java.lang.Object obj2 = mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mastercardConnectRepositoryImpl$initiateConnect$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError, com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$handleSdkCompletion$1 mastercardConnectRepositoryImpl$handleSdkCompletion$1;
        int i;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$handleSdkCompletion$1) {
            mastercardConnectRepositoryImpl$handleSdkCompletion$1 = (com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$handleSdkCompletion$1) continuation;
            if ((mastercardConnectRepositoryImpl$handleSdkCompletion$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                mastercardConnectRepositoryImpl$handleSdkCompletion$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$handleSdkCompletion$1 mastercardConnectRepositoryImpl$handleSdkCompletion$12 = mastercardConnectRepositoryImpl$handleSdkCompletion$1;
                java.lang.Object obj = mastercardConnectRepositoryImpl$handleSdkCompletion$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mastercardConnectRepositoryImpl$handleSdkCompletion$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler = this.getHighResolutionOutputSizeshNQ4ISI;
                    mastercardConnectRepositoryImpl$handleSdkCompletion$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler.awaitCompletion$default(mastercardConnectEventHandler, 0L, mastercardConnectRepositoryImpl$handleSdkCompletion$12, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent connectEvent = (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent) obj;
                com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType type = connectEvent == null ? connectEvent.getType() : null;
                i2 = type != null ? -1 : com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i2 != 1) {
                    java.lang.String credentialToken = connectEvent.getCredentialToken();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Connect flow completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasToken", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(credentialToken != null))), null, 4, null);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult(true, null, credentialToken, null, 10, null));
                }
                if (i2 == 2) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Connect flow was cancelled by user", null, null, 6, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.UserCancelled.INSTANCE);
                }
                if (i2 == 3) {
                    java.lang.String message = connectEvent.getMessage();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Connect flow encountered an error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", message)), null, null, 12, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.ConnectionFailed(message));
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Connect flow completed with unexpected state or timeout", null, null, 6, null);
                return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError.Timeout.INSTANCE);
            }
        }
        mastercardConnectRepositoryImpl$handleSdkCompletion$1 = new com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$handleSdkCompletion$1(this, continuation);
        com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$handleSdkCompletion$1 mastercardConnectRepositoryImpl$handleSdkCompletion$122 = mastercardConnectRepositoryImpl$handleSdkCompletion$1;
        java.lang.Object obj2 = mastercardConnectRepositoryImpl$handleSdkCompletion$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mastercardConnectRepositoryImpl$handleSdkCompletion$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent connectEvent2 = (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent) obj2;
        if (connectEvent2 == null) {
        }
        if (type != null) {
        }
        if (i2 != 1) {
        }
    }

    @Override // com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository
    public final java.lang.Object saveConnectUrl(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoFpsRangesFor = str;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Saved Connect URL (in-memory)", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository
    public final java.lang.Object getSavedConnectUrl(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.DONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.CANCELLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
