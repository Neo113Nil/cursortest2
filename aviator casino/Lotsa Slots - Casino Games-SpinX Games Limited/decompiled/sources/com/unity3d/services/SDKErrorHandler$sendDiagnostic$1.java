package com.unity3d.services;

/* compiled from: SDKErrorHandler.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SDKErrorHandler$sendDiagnostic$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $name;
    final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
    final /* synthetic */ java.lang.String $reason;
    final /* synthetic */ java.lang.String $scopeName;
    final /* synthetic */ java.lang.String $stackTrace;
    int label;
    final /* synthetic */ com.unity3d.services.SDKErrorHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SDKErrorHandler$sendDiagnostic$1(com.unity3d.services.SDKErrorHandler sDKErrorHandler, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.services.SDKErrorHandler$sendDiagnostic$1> continuation) {
        super(2, continuation);
        this.this$0 = sDKErrorHandler;
        this.$name = str;
        this.$reason = str2;
        this.$stackTrace = str3;
        this.$scopeName = str4;
        this.$opportunityId = byteString;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.SDKErrorHandler$sendDiagnostic$1(this.this$0, this.$name, this.$reason, this.$stackTrace, this.$scopeName, this.$opportunityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.SDKErrorHandler$sendDiagnostic$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            java.lang.String str = this.$name;
            java.lang.String str2 = this.$reason;
            java.lang.String str3 = this.$stackTrace;
            java.lang.String str4 = this.$scopeName;
            com.google.protobuf.ByteString byteString = this.$opportunityId;
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            createMapBuilder.put("reason", str2);
            createMapBuilder.put("reason_debug", str3);
            createMapBuilder.put("coroutine_name", str4);
            if (byteString != null) {
                java.lang.String uuid = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(byteString).toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "it.toUUID().toString()");
                createMapBuilder.put("impressionOpportunityId", uuid);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, kotlin.collections.MapsKt.build(createMapBuilder), null, null, null, 58, null);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
