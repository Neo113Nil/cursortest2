package com.apollographql.apollo.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/BufferedSource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", i = {0}, l = {29}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class MultipartKt$multipartBodyFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super okio.BufferedSource>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.api.http.HttpResponse getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.internal.MultipartReader> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.apollographql.apollo.internal.MultipartReader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.apollographql.apollo.internal.MultipartReader.Part nextPart;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.internal.MultipartReader> objectRef = this.getHighSpeedVideoFpsRangesFor;
            okio.BufferedSource body = this.getHighSpeedVideoFpsRanges.getBody();
            kotlin.jvm.internal.Intrinsics.checkNotNull(body);
            java.lang.String access$getBoundaryParameter = com.apollographql.apollo.internal.MultipartKt.access$getBoundaryParameter(com.apollographql.apollo.api.http.HttpHeaders.valueOf(this.getHighSpeedVideoFpsRanges.getHeaders(), "Content-Type"));
            if (access$getBoundaryParameter != null) {
                objectRef.element = new com.apollographql.apollo.internal.MultipartReader(body, access$getBoundaryParameter);
            } else {
                throw new com.apollographql.apollo.exception.DefaultApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        do {
            com.apollographql.apollo.internal.MultipartReader multipartReader = this.getHighSpeedVideoFpsRangesFor.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(multipartReader);
            nextPart = multipartReader.nextPart();
            if (nextPart == null) {
                return kotlin.Unit.INSTANCE;
            }
            this.Camera2StreamConfigurationMap = flowCollector;
            this.getHighSpeedVideoSizes = 1;
        } while (flowCollector.emit(nextPart.getBody(), this) != coroutine_suspended);
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super okio.BufferedSource> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1 multipartKt$multipartBodyFlow$1 = new com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        multipartKt$multipartBodyFlow$1.Camera2StreamConfigurationMap = obj;
        return multipartKt$multipartBodyFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$multipartBodyFlow$1(kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.internal.MultipartReader> objectRef, com.apollographql.apollo.api.http.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = objectRef;
        this.getHighSpeedVideoFpsRanges = httpResponse;
    }
}
