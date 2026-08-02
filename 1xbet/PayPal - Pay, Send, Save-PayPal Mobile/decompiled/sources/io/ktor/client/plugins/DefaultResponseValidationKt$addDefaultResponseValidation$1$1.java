package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "invokeSuspend", n = {"response", "statusCode", "response", "exceptionResponse", "statusCode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes17.dex */
final class DefaultResponseValidationKt$addDefaultResponseValidation$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(8:5|6|7|8|9|(2:16|(1:(1:24)(1:23))(1:19))(1:12)|13|14)(2:28|29))(1:30))(2:39|(2:41|42)(4:43|(2:45|(1:47))|49|50))|31|32|33|(10:35|8|9|(0)|16|(0)|(1:21)|24|13|14)|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r11 != r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.statement.HttpResponse httpResponse;
        int value;
        io.ktor.util.AttributeKey<?> attributeKey;
        org.slf4j.Logger logger;
        io.ktor.util.AttributeKey attributeKey2;
        io.ktor.client.statement.HttpResponse response;
        int i;
        io.ktor.client.statement.HttpResponse httpResponse2;
        io.ktor.client.statement.HttpResponse httpResponse3;
        java.lang.String str;
        io.ktor.client.plugins.ServerResponseException responseException;
        org.slf4j.Logger logger2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            httpResponse = (io.ktor.client.statement.HttpResponse) this.Camera2StreamConfigurationMap;
            if (!((java.lang.Boolean) httpResponse.getCall().getAttributes().get(io.ktor.client.plugins.HttpCallValidatorKt.getExpectSuccessAttributeKey())).booleanValue()) {
                logger = io.ktor.client.plugins.DefaultResponseValidationKt.getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Skipping default response validation for ");
                sb.append(httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                logger.trace(sb.toString());
                return kotlin.Unit.INSTANCE;
            }
            value = httpResponse.getStatus().getValue();
            io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
            if (value >= 300) {
                io.ktor.util.Attributes attributes = call.getAttributes();
                attributeKey = io.ktor.client.plugins.DefaultResponseValidationKt.getHighSpeedVideoFpsRanges;
                if (!attributes.contains(attributeKey)) {
                    this.Camera2StreamConfigurationMap = httpResponse;
                    this.getHighResolutionOutputSizeshNQ4ISI = value;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    obj = io.ktor.client.call.SavedCallKt.save(call, this);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getHighResolutionOutputSizeshNQ4ISI;
            httpResponse2 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoSizes;
            httpResponse3 = (io.ktor.client.statement.HttpResponse) this.Camera2StreamConfigurationMap;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                str = (java.lang.String) obj;
            } catch (io.ktor.utils.io.charsets.MalformedInputException unused) {
                response = httpResponse2;
                httpResponse = httpResponse3;
                value = i;
                httpResponse3 = httpResponse;
                int i3 = value;
                httpResponse2 = response;
                str = "<body failed decoding>";
                i = i3;
                if (300 > i) {
                }
                if (400 > i) {
                }
                if (500 > i) {
                }
                responseException = new io.ktor.client.plugins.ResponseException(httpResponse2, str);
                logger2 = io.ktor.client.plugins.DefaultResponseValidationKt.getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Default response validation for ");
                sb2.append(httpResponse3.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                sb2.append(" failed with ");
                sb2.append(responseException);
                logger2.trace(sb2.toString());
                throw responseException;
            }
            if (300 > i && i < 400) {
                responseException = new io.ktor.client.plugins.RedirectResponseException(httpResponse2, str);
            } else if (400 > i && i < 500) {
                responseException = new io.ktor.client.plugins.ClientRequestException(httpResponse2, str);
            } else if (500 > i && i < 600) {
                responseException = new io.ktor.client.plugins.ServerResponseException(httpResponse2, str);
            } else {
                responseException = new io.ktor.client.plugins.ResponseException(httpResponse2, str);
            }
            logger2 = io.ktor.client.plugins.DefaultResponseValidationKt.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Default response validation for ");
            sb22.append(httpResponse3.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
            sb22.append(" failed with ");
            sb22.append(responseException);
            logger2.trace(sb22.toString());
            throw responseException;
        }
        value = this.getHighResolutionOutputSizeshNQ4ISI;
        httpResponse = (io.ktor.client.statement.HttpResponse) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.call.HttpClientCall httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
        io.ktor.util.Attributes attributes2 = httpClientCall.getAttributes();
        attributeKey2 = io.ktor.client.plugins.DefaultResponseValidationKt.getHighSpeedVideoFpsRanges;
        attributes2.put(attributeKey2, kotlin.Unit.INSTANCE);
        response = httpClientCall.getResponse();
        this.Camera2StreamConfigurationMap = httpResponse;
        this.getHighSpeedVideoSizes = response;
        this.getHighResolutionOutputSizeshNQ4ISI = value;
        this.getHighSpeedVideoFpsRangesFor = 2;
        java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(response, null, this, 1, null);
        if (bodyAsText$default != coroutine_suspended) {
            i = value;
            httpResponse2 = response;
            obj = bodyAsText$default;
            httpResponse3 = httpResponse;
            str = (java.lang.String) obj;
            if (300 > i) {
            }
            if (400 > i) {
            }
            if (500 > i) {
            }
            responseException = new io.ktor.client.plugins.ResponseException(httpResponse2, str);
            logger2 = io.ktor.client.plugins.DefaultResponseValidationKt.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Default response validation for ");
            sb222.append(httpResponse3.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
            sb222.append(" failed with ");
            sb222.append(responseException);
            logger2.trace(sb222.toString());
            throw responseException;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1) create(httpResponse, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1 defaultResponseValidationKt$addDefaultResponseValidation$1$1 = new io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1(continuation);
        defaultResponseValidationKt$addDefaultResponseValidation$1$1.Camera2StreamConfigurationMap = obj;
        return defaultResponseValidationKt$addDefaultResponseValidation$1$1;
    }

    DefaultResponseValidationKt$addDefaultResponseValidation$1$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1> continuation) {
        super(2, continuation);
    }
}
