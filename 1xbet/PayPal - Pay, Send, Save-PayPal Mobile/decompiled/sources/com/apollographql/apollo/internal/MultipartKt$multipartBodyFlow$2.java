package com.apollographql.apollo.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/BufferedSource;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MultipartKt$multipartBodyFlow$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super okio.BufferedSource>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.internal.MultipartReader> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.Unit unit;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.internal.MultipartReader> objectRef = this.getHighSpeedVideoFpsRanges;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.apollographql.apollo.internal.MultipartReader multipartReader = objectRef.element;
            if (multipartReader != null) {
                multipartReader.close();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            kotlin.Result.m23436constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super okio.BufferedSource> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2 multipartKt$multipartBodyFlow$2 = new com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2(this.getHighSpeedVideoFpsRanges, continuation);
        multipartKt$multipartBodyFlow$2.getHighSpeedVideoFpsRangesFor = flowCollector;
        return multipartKt$multipartBodyFlow$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$multipartBodyFlow$2(kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.internal.MultipartReader> objectRef, kotlin.coroutines.Continuation<? super com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = objectRef;
    }
}
