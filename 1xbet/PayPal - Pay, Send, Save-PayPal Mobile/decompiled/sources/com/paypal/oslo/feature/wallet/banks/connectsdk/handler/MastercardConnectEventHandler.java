package com.paypal.oslo.feature.wallet.banks.connectsdk.handler;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0&8G¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/handler/MastercardConnectEventHandler;", "Lcom/mastercard/openbanking/connect/EventHandler;", "<init>", "()V", "", "getLastSessionId", "()Ljava/lang/String;", "", "timeoutMs", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEvent;", "awaitCompletion", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSessionId", "", "resetForNewSession", "onLoad", "Lorg/json/JSONObject;", "doneEvent", "onDone", "(Lorg/json/JSONObject;)V", "cancelEvent", "onCancel", "errorEvent", "onError", "routeEvent", "onRoute", "userEvent", "onUser", "p0", "", "", "getHighSpeedVideoSizes", "(Lorg/json/JSONObject;)Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "events", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MastercardConnectEventHandler implements com.mastercard.openbanking.connect.EventHandler {

    @java.lang.Deprecated
    public static final java.lang.String ACTION_ADD_ACCOUNTS = "AddAccounts";

    @java.lang.Deprecated
    public static final java.lang.String ACTION_OAUTH_ADD_ACCOUNTS = "OAuthAddAccounts";

    @java.lang.Deprecated
    public static final java.lang.String KEY_ACTION = "action";

    @java.lang.Deprecated
    public static final java.lang.String KEY_INSTITUTION_LOGIN_ID = "institutionLoginId";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler.Companion Companion = new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler.Companion(null);
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent> Camera2StreamConfigurationMap = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
    private kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent> getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);

    @javax.inject.Inject
    public MastercardConnectEventHandler() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/handler/MastercardConnectEventHandler$Companion;", "", "<init>", "()V", "", "ACTION_ADD_ACCOUNTS", "Ljava/lang/String;", "ACTION_OAUTH_ADD_ACCOUNTS", "KEY_ACTION", "KEY_INSTITUTION_LOGIN_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent> getEvents() {
        return kotlinx.coroutines.flow.FlowKt.asSharedFlow(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: getLastSessionId, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ java.lang.Object awaitCompletion$default(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 300000;
        }
        return mastercardConnectEventHandler.awaitCompletion(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitCompletion(long j, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent> continuation) {
        com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitCompletion$1 mastercardConnectEventHandler$awaitCompletion$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitCompletion$1) {
                mastercardConnectEventHandler$awaitCompletion$1 = (com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitCompletion$1) continuation;
                if ((mastercardConnectEventHandler$awaitCompletion$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    mastercardConnectEventHandler$awaitCompletion$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = mastercardConnectEventHandler$awaitCompletion$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mastercardConnectEventHandler$awaitCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitCompletion$2 mastercardConnectEventHandler$awaitCompletion$2 = new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitCompletion$2(this, null);
                        mastercardConnectEventHandler$awaitCompletion$1.getHighSpeedVideoFpsRanges = j;
                        mastercardConnectEventHandler$awaitCompletion$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = kotlinx.coroutines.TimeoutKt.withTimeout(j, mastercardConnectEventHandler$awaitCompletion$2, mastercardConnectEventHandler$awaitCompletion$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j2 = mastercardConnectEventHandler$awaitCompletion$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent) obj;
                }
            }
            if (i != 0) {
            }
            return (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent) obj;
        } catch (kotlinx.coroutines.TimeoutCancellationException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Timeout waiting for SDK completion", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, e, 4, null);
            return null;
        }
        mastercardConnectEventHandler$awaitCompletion$1 = new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitCompletion$1(this, continuation);
        java.lang.Object obj2 = mastercardConnectEventHandler$awaitCompletion$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mastercardConnectEventHandler$awaitCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ java.lang.Object awaitSessionId$default(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 5000;
        }
        return mastercardConnectEventHandler.awaitSessionId(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitSessionId(long j, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$1 mastercardConnectEventHandler$awaitSessionId$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$1) {
                mastercardConnectEventHandler$awaitSessionId$1 = (com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$1) continuation;
                if ((mastercardConnectEventHandler$awaitSessionId$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    mastercardConnectEventHandler$awaitSessionId$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = mastercardConnectEventHandler$awaitSessionId$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mastercardConnectEventHandler$awaitSessionId$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (str != null) {
                            return str;
                        }
                        com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$3 mastercardConnectEventHandler$awaitSessionId$3 = new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$3(this, null);
                        mastercardConnectEventHandler$awaitSessionId$1.getHighSpeedVideoFpsRanges = j;
                        mastercardConnectEventHandler$awaitSessionId$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = kotlinx.coroutines.TimeoutKt.withTimeout(j, mastercardConnectEventHandler$awaitSessionId$3, mastercardConnectEventHandler$awaitSessionId$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j2 = mastercardConnectEventHandler$awaitSessionId$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (java.lang.String) obj;
                }
            }
            if (i != 0) {
            }
            return (java.lang.String) obj;
        } catch (kotlinx.coroutines.TimeoutCancellationException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Timeout waiting for sessionId", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, e, 4, null);
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        mastercardConnectEventHandler$awaitSessionId$1 = new com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler$awaitSessionId$1(this, continuation);
        java.lang.Object obj2 = mastercardConnectEventHandler$awaitSessionId$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mastercardConnectEventHandler$awaitSessionId$1.getHighSpeedVideoFpsRangesFor;
    }

    public final void resetForNewSession() {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Reset event handler for new Connect session", null, null, 6, null);
    }

    @Override // com.mastercard.openbanking.connect.EventHandler
    public final void onLoad() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Mastercard Connect SDK loaded successfully", null, null, 6, null);
        this.Camera2StreamConfigurationMap.tryEmit(new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.LOADED, "Connect SDK loaded", null, null, 12, null));
    }

    @Override // com.mastercard.openbanking.connect.EventHandler
    public final void onDone(org.json.JSONObject doneEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(doneEvent, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Mastercard Connect completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", doneEvent.toString())), null, 4, null);
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent connectEvent = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.DONE, "Account connection successful", getHighSpeedVideoSizes(doneEvent), this.getHighResolutionOutputSizeshNQ4ISI);
        this.Camera2StreamConfigurationMap.tryEmit(connectEvent);
        this.getHighSpeedVideoFpsRanges.tryEmit(connectEvent);
    }

    @Override // com.mastercard.openbanking.connect.EventHandler
    public final void onCancel(org.json.JSONObject cancelEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelEvent, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "User cancelled Mastercard Connect flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", cancelEvent.toString())), null, 4, null);
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent connectEvent = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.CANCELLED, "User cancelled the connection process", getHighSpeedVideoSizes(cancelEvent), null, 8, null);
        this.Camera2StreamConfigurationMap.tryEmit(connectEvent);
        this.getHighSpeedVideoFpsRanges.tryEmit(connectEvent);
    }

    @Override // com.mastercard.openbanking.connect.EventHandler
    public final void onError(org.json.JSONObject errorEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorEvent, "");
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Mastercard Connect error occurred", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", errorEvent.toString())), null, null, 12, null);
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent connectEvent = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.ERROR, getHighResolutionOutputSizeshNQ4ISI(errorEvent), getHighSpeedVideoSizes(errorEvent), null, 8, null);
        this.Camera2StreamConfigurationMap.tryEmit(connectEvent);
        this.getHighSpeedVideoFpsRanges.tryEmit(connectEvent);
    }

    @Override // com.mastercard.openbanking.connect.EventHandler
    public final void onRoute(org.json.JSONObject routeEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routeEvent, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Mastercard Connect route event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", routeEvent.toString())), null, 4, null);
        this.Camera2StreamConfigurationMap.tryEmit(new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.ROUTE, "Navigation event", getHighSpeedVideoSizes(routeEvent), null, 8, null));
    }

    @Override // com.mastercard.openbanking.connect.EventHandler
    public final void onUser(org.json.JSONObject userEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEvent, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Mastercard Connect user event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", userEvent.toString())), null, 4, null);
        java.lang.String optString = userEvent.optString("action");
        if (kotlin.jvm.internal.Intrinsics.areEqual(optString, ACTION_ADD_ACCOUNTS) || kotlin.jvm.internal.Intrinsics.areEqual(optString, ACTION_OAUTH_ADD_ACCOUNTS)) {
            java.lang.String optString2 = userEvent.optString(KEY_INSTITUTION_LOGIN_ID, null);
            java.lang.String str = optString2;
            if (str != null && str.length() != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = optString2;
                this.getHighSpeedVideoFpsRangesFor.tryEmit(optString2);
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Captured Finicity institutionLoginId (credential token)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(KEY_INSTITUTION_LOGIN_ID, optString2), kotlin.TuplesKt.to("action", optString)), null, 4, null);
            }
        }
        this.Camera2StreamConfigurationMap.tryEmit(new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEvent(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.USER_EVENT, "User interaction event", getHighSpeedVideoSizes(userEvent), null, 8, null));
    }

    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes(org.json.JSONObject p0) {
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator<java.lang.String> keys = p0.keys();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = p0.get(next);
                if (obj instanceof org.json.JSONObject) {
                    obj = getHighSpeedVideoSizes((org.json.JSONObject) obj);
                }
                linkedHashMap.put(next, obj);
            }
            return linkedHashMap;
        } catch (org.json.JSONException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to parse event data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, e, 4, null);
            return kotlin.collections.MapsKt.emptyMap();
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(org.json.JSONObject p0) {
        try {
            java.lang.String optString = p0.optString("message", "An error occurred during the connection process");
            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
            return optString;
        } catch (org.json.JSONException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to parse error message", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, e, 4, null);
            return "An error occurred during the connection process";
        }
    }
}
