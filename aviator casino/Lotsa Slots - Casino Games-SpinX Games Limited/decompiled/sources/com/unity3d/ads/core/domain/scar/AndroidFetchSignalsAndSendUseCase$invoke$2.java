package com.unity3d.ads.core.domain.scar;

/* compiled from: AndroidFetchSignalsAndSendUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", i = {0, 0, 1, 1}, l = {34, 54}, m = "invokeSuspend", n = {"requestedSignals", "startTime", "requestedSignals", "uploadStartTime"}, s = {"L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes5.dex */
final class AndroidFetchSignalsAndSendUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.TokenConfiguration $tokenConfiguration;
    final /* synthetic */ com.google.protobuf.ByteString $tokenId;
    final /* synthetic */ int $tokenNumber;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFetchSignalsAndSendUseCase$invoke$2(com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase, com.unity3d.ads.TokenConfiguration tokenConfiguration, int i, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidFetchSignalsAndSendUseCase;
        this.$tokenConfiguration = tokenConfiguration;
        this.$tokenNumber = i;
        this.$tokenId = byteString;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2 androidFetchSignalsAndSendUseCase$invoke$2 = new com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2(this.this$0, this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, continuation);
        androidFetchSignalsAndSendUseCase$invoke$2.L$0 = obj;
        return androidFetchSignalsAndSendUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0118  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        long j;
        java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> list;
        com.unity3d.ads.core.data.manager.ScarManager scarManager;
        java.lang.Object signals;
        java.lang.Object m10798constructorimpl;
        com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals;
        java.lang.String str;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent2;
        java.util.Map tags;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent3;
        com.unity3d.ads.core.domain.scar.HandleGetTokenRequest handleGetTokenRequest;
        java.lang.Object invoke;
        long j2;
        java.lang.String str2;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent4;
        java.util.Map tags2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
            scarEligibleEffectiveUseCase = this.this$0.scarEligibleEffectiveUseCase;
            java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> invoke2 = scarEligibleEffectiveUseCase.invoke(this.$tokenConfiguration);
            if (invoke2.isEmpty()) {
                return kotlin.Unit.INSTANCE;
            }
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_scar_signals_collection_started", null, null, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$tokenNumber), 30, null);
            com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase = this.this$0;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                scarManager = androidFetchSignalsAndSendUseCase.scarManager;
                this.L$0 = invoke2;
                this.J$0 = m12261markNowz9LOYto;
                this.label = 1;
                signals = scarManager.getSignals(invoke2, this);
                if (signals == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = m12261markNowz9LOYto;
                list = invoke2;
            } catch (java.lang.Throwable th) {
                th = th;
                j = m12261markNowz9LOYto;
                list = invoke2;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                }
                biddingSignals = (com.unity3d.services.ads.gmascar.models.BiddingSignals) m10798constructorimpl;
                if (biddingSignals != null) {
                }
                sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                java.lang.Double boxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                tags = this.this$0.getTags(list);
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str, boxDouble, tags, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$tokenNumber), 24, null);
                if (biddingSignals == null) {
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = this.J$0;
                java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> list2 = (java.util.List) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                list = list2;
                invoke = obj;
                if (!((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) invoke).hasError()) {
                    str2 = "native_scar_signals_upload_failure_time";
                } else {
                    str2 = "native_scar_signals_upload_success_time";
                }
                sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                java.lang.Double boxDouble2 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2)));
                tags2 = this.this$0.getTags(list);
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str2, boxDouble2, tags2, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$tokenNumber), 24, null);
                return kotlin.Unit.INSTANCE;
            }
            j = this.J$0;
            list = (java.util.List) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                signals = obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                }
                biddingSignals = (com.unity3d.services.ads.gmascar.models.BiddingSignals) m10798constructorimpl;
                if (biddingSignals != null) {
                }
                sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                java.lang.Double boxDouble3 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                tags = this.this$0.getTags(list);
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str, boxDouble3, tags, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$tokenNumber), 24, null);
                if (biddingSignals == null) {
                }
            }
        }
        m10798constructorimpl = kotlin.Result.m10798constructorimpl((com.unity3d.services.ads.gmascar.models.BiddingSignals) signals);
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        biddingSignals = (com.unity3d.services.ads.gmascar.models.BiddingSignals) m10798constructorimpl;
        if (biddingSignals != null) {
            str = "native_scar_signals_collection_success_time";
        } else {
            str = "native_scar_signals_collection_failure_time";
        }
        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
        java.lang.Double boxDouble32 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
        tags = this.this$0.getTags(list);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str, boxDouble32, tags, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$tokenNumber), 24, null);
        if (biddingSignals == null) {
            return kotlin.Unit.INSTANCE;
        }
        long m12261markNowz9LOYto2 = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "native_scar_signals_upload_started", null, null, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$tokenNumber), 30, null);
        handleGetTokenRequest = this.this$0.handleGetTokenRequest;
        this.L$0 = list;
        this.J$0 = m12261markNowz9LOYto2;
        this.label = 2;
        invoke = handleGetTokenRequest.invoke(this.$tokenId, biddingSignals, this);
        if (invoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        j2 = m12261markNowz9LOYto2;
        if (!((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) invoke).hasError()) {
        }
        sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
        java.lang.Double boxDouble22 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2)));
        tags2 = this.this$0.getTags(list);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str2, boxDouble22, tags2, null, null, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$tokenNumber), 24, null);
        return kotlin.Unit.INSTANCE;
    }
}
