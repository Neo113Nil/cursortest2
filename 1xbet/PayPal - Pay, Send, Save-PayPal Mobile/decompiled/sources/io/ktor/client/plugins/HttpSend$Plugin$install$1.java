package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {98, 99}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpSend$Plugin$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.plugins.HttpSend getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.HttpClient getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cd, code lost:
    
        if (r1.proceedWith((io.ktor.client.call.HttpClientCall) r9, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        if (r9 != r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        kotlin.reflect.KType kType;
        int i;
        java.util.List list;
        kotlin.reflect.KType kType2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
            boolean z = obj2 instanceof io.ktor.http.content.OutgoingContent;
            if (!z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n|Fail to prepare request body for sending. \n|The body type is: ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj2.getClass()));
                sb.append(", with Content-Type: ");
                sb.append(io.ktor.http.HttpMessagePropertiesKt.contentType((io.ktor.http.HttpMessageBuilder) pipelineContext.getContext()));
                sb.append(".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.");
                throw new java.lang.IllegalStateException(kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null).toString());
            }
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext();
            if (obj2 == null) {
                httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.http.content.OutgoingContent.class);
                try {
                    kType2 = kotlin.jvm.internal.Reflection.typeOf(io.ktor.http.content.OutgoingContent.class);
                } catch (java.lang.Throwable unused) {
                    kType2 = null;
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType2));
            } else if (z) {
                httpRequestBuilder.setBody(obj2);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj2);
                kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.http.content.OutgoingContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.http.content.OutgoingContent.class);
                } catch (java.lang.Throwable unused2) {
                    kType = null;
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType));
            }
            i = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            io.ktor.client.plugins.HttpSend.InterceptedSender defaultSender = new io.ktor.client.plugins.HttpSend.DefaultSender(i, this.getHighSpeedVideoSizes);
            list = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Iterator it = kotlin.collections.CollectionsKt.reversed(list).iterator();
            while (it.hasNext()) {
                defaultSender = new io.ktor.client.plugins.HttpSend.InterceptedSender((kotlin.jvm.functions.Function3) it.next(), defaultSender);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = pipelineContext;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = defaultSender.execute((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext(), this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new io.ktor.client.plugins.HttpSend$Plugin$install$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        httpSend$Plugin$install$1.getHighResolutionOutputSizeshNQ4ISI = pipelineContext;
        httpSend$Plugin$install$1.Camera2StreamConfigurationMap = obj;
        return httpSend$Plugin$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpSend$Plugin$install$1(io.ktor.client.plugins.HttpSend httpSend, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpSend$Plugin$install$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = httpSend;
        this.getHighSpeedVideoSizes = httpClient;
    }
}
