package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        return z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.util.Attributes attributes = ((io.ktor.client.request.HttpRequestBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getAttributes();
        io.ktor.util.AttributeKey<java.lang.Boolean> expectSuccessAttributeKey = io.ktor.client.plugins.HttpCallValidatorKt.getExpectSuccessAttributeKey();
        final boolean z = this.getHighSpeedVideoFpsRanges;
        attributes.computeIfAbsent(expectSuccessAttributeKey, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1.getHighResolutionOutputSizeshNQ4ISI(z));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1) create(httpRequestBuilder, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1 httpCallValidatorKt$HttpCallValidator$2$1 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1(this.getHighSpeedVideoFpsRanges, continuation);
        httpCallValidatorKt$HttpCallValidator$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return httpCallValidatorKt$HttpCallValidator$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCallValidatorKt$HttpCallValidator$2$1(boolean z, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = z;
    }
}
