package io.ktor.client.plugins.contentnegotiation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "response", "Lio/ktor/client/statement/HttpResponse;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lio/ktor/utils/io/ByteReadChannel;", "info", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2", f = "ContentNegotiation.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ContentNegotiationKt$ContentNegotiation$2$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function5<io.ktor.client.plugins.api.TransformResponseBodyContext, io.ktor.client.statement.HttpResponse, io.ktor.utils.io.ByteReadChannel, io.ktor.util.reflect.TypeInfo, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    final /* synthetic */ java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.Set<kotlin.reflect.KClass<?>> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRanges;
        io.ktor.utils.io.ByteReadChannel byteReadChannel = (io.ktor.utils.io.ByteReadChannel) this.getHighSpeedVideoSizes;
        io.ktor.util.reflect.TypeInfo typeInfo = (io.ktor.util.reflect.TypeInfo) this.getOutputFormats;
        io.ktor.http.ContentType contentType = io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse);
        if (contentType == null) {
            return null;
        }
        java.nio.charset.Charset suitableCharset$default = io.ktor.serialization.ContentConverterKt.suitableCharset$default(io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getHeaders(), null, 1, null);
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        this.getInputFormats = 1;
        java.lang.Object access$ContentNegotiation$lambda$16$convertResponse = io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.access$ContentNegotiation$lambda$16$convertResponse(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getGetHighSpeedVideoFpsRanges(), typeInfo, byteReadChannel, contentType, suitableCharset$default, this);
        return access$ContentNegotiation$lambda$16$convertResponse == coroutine_suspended ? coroutine_suspended : access$ContentNegotiation$lambda$16$convertResponse;
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.TransformResponseBodyContext transformResponseBodyContext, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2 contentNegotiationKt$ContentNegotiation$2$2 = new io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        contentNegotiationKt$ContentNegotiation$2$2.getHighSpeedVideoFpsRanges = httpResponse;
        contentNegotiationKt$ContentNegotiation$2$2.getHighSpeedVideoSizes = byteReadChannel;
        contentNegotiationKt$ContentNegotiation$2$2.getOutputFormats = typeInfo;
        return contentNegotiationKt$ContentNegotiation$2$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContentNegotiationKt$ContentNegotiation$2$2(java.util.Set<? extends kotlin.reflect.KClass<?>> set, java.util.List<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig.ConverterRegistration> list, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig> clientPluginBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2> continuation) {
        super(5, continuation);
        this.getHighSpeedVideoFpsRangesFor = set;
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = clientPluginBuilder;
    }
}
