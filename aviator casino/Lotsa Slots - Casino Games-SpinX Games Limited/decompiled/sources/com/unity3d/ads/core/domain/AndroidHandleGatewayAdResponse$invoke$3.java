package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", i = {0}, l = {175}, m = "invokeSuspend", n = {"mark$iv$iv"}, s = {"J$0"})
/* loaded from: classes5.dex */
final class AndroidHandleGatewayAdResponse$invoke$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $tmpAdObject;
    final /* synthetic */ java.lang.String $webViewUrl;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidWebViewContainer $webviewContainer;
    long J$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$invoke$3(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer, java.lang.String str, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3> continuation) {
        super(1, continuation);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$webviewContainer = androidWebViewContainer;
        this.$webViewUrl = str;
        this.$tmpAdObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3(this.this$0, this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.Object m10798constructorimpl;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
            java.lang.String str = this.$webViewUrl;
            long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.J$0 = m12261markNowz9LOYto;
                this.label = 1;
                if (androidWebViewContainer.loadUrl(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = m12261markNowz9LOYto;
            } catch (java.lang.Throwable th) {
                th = th;
                j = m12261markNowz9LOYto;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                kotlin.time.TimedValue timedValue = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j), null);
                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this.this$0;
                com.unity3d.ads.core.data.model.AdObject adObject = this.$tmpAdObject;
                java.lang.Object value = ((kotlin.Result) timedValue.component1()).getValue();
                long duration = timedValue.getDuration();
                sendDiagnosticEvent = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value) ? "native_load_file_task_success_time" : "native_load_file_task_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject, null, 44, null);
                kotlin.ResultKt.throwOnFailure(value);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                kotlin.time.TimedValue timedValue2 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j), null);
                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse2 = this.this$0;
                com.unity3d.ads.core.data.model.AdObject adObject2 = this.$tmpAdObject;
                java.lang.Object value2 = ((kotlin.Result) timedValue2.component1()).getValue();
                long duration2 = timedValue2.getDuration();
                sendDiagnosticEvent = androidHandleGatewayAdResponse2.sendDiagnosticEvent;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value2) ? "native_load_file_task_success_time" : "native_load_file_task_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration2, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject2, null, 44, null);
                kotlin.ResultKt.throwOnFailure(value2);
                return kotlin.Unit.INSTANCE;
            }
        }
        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        kotlin.time.TimedValue timedValue22 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j), null);
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse22 = this.this$0;
        com.unity3d.ads.core.data.model.AdObject adObject22 = this.$tmpAdObject;
        java.lang.Object value22 = ((kotlin.Result) timedValue22.component1()).getValue();
        long duration22 = timedValue22.getDuration();
        sendDiagnosticEvent = androidHandleGatewayAdResponse22.sendDiagnosticEvent;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value22) ? "native_load_file_task_success_time" : "native_load_file_task_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration22, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject22, null, 44, null);
        kotlin.ResultKt.throwOnFailure(value22);
        return kotlin.Unit.INSTANCE;
    }
}
