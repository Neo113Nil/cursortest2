package io.ktor.client.plugins.contentnegotiation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "<unused var>", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1", f = "ContentNegotiation.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ContentNegotiationKt$ContentNegotiation$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function5<io.ktor.client.plugins.api.TransformRequestBodyContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Object, io.ktor.util.reflect.TypeInfo, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.Set<kotlin.reflect.KClass<?>> getHighSpeedVideoSizes;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.Camera2StreamConfigurationMap;
        java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = null;
        this.getOutputFormats = 1;
        java.lang.Object access$ContentNegotiation$lambda$16$convertRequest = io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.access$ContentNegotiation$lambda$16$convertRequest(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, httpRequestBuilder, obj2, this);
        return access$ContentNegotiation$lambda$16$convertRequest == coroutine_suspended ? coroutine_suspended : access$ContentNegotiation$lambda$16$convertRequest;
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.TransformRequestBodyContext transformRequestBodyContext, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Object obj, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1 contentNegotiationKt$ContentNegotiation$2$1 = new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        contentNegotiationKt$ContentNegotiation$2$1.Camera2StreamConfigurationMap = httpRequestBuilder;
        contentNegotiationKt$ContentNegotiation$2$1.getHighSpeedVideoFpsRangesFor = obj;
        return contentNegotiationKt$ContentNegotiation$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContentNegotiationKt$ContentNegotiation$2$1(java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> list, java.util.Set<? extends kotlin.reflect.KClass<?>> set, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> clientPluginBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1> continuation) {
        super(5, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoSizes = set;
        this.getHighSpeedVideoFpsRanges = clientPluginBuilder;
    }
}
