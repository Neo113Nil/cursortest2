package io.ktor.client.plugins;

/* compiled from: DefaultResponseValidation.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.ironsource.Ve.n, "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "invokeSuspend", n = {com.ironsource.Ve.n, "statusCode", com.ironsource.Ve.n, "exceptionResponse", "statusCode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes6.dex */
final class DefaultResponseValidationKt$addDefaultResponseValidation$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int I$0;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    DefaultResponseValidationKt$addDefaultResponseValidation$1$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1 defaultResponseValidationKt$addDefaultResponseValidation$1$1 = new io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1(continuation);
        defaultResponseValidationKt$addDefaultResponseValidation$1$1.L$0 = obj;
        return defaultResponseValidationKt$addDefaultResponseValidation$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1) create(httpResponse, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(8:5|6|7|8|9|(2:16|(1:(1:24)(1:23))(1:19))(1:12)|13|14)(2:28|29))(1:30))(2:39|(2:41|42)(4:43|(2:45|(2:47|(1:49)(1:50)))|51|52))|31|32|33|(1:35)(10:36|8|9|(0)|16|(0)|(1:21)|24|13|14)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        r0 = r1;
        r3 = r5;
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int value;
        io.ktor.util.AttributeKey<?> attributeKey;
        io.ktor.client.statement.HttpResponse httpResponse;
        org.slf4j.Logger logger;
        io.ktor.util.AttributeKey attributeKey2;
        int i;
        io.ktor.client.statement.HttpResponse httpResponse2;
        io.ktor.client.statement.HttpResponse httpResponse3;
        java.lang.String str;
        io.ktor.client.plugins.ServerResponseException responseException;
        org.slf4j.Logger logger2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.statement.HttpResponse httpResponse4 = (io.ktor.client.statement.HttpResponse) this.L$0;
            if (!((java.lang.Boolean) httpResponse4.getCall().getAttributes().get(io.ktor.client.plugins.HttpCallValidatorKt.getExpectSuccessAttributeKey())).booleanValue()) {
                logger = io.ktor.client.plugins.DefaultResponseValidationKt.LOGGER;
                logger.trace("Skipping default response validation for " + httpResponse4.getCall().getRequest().getUrl());
                return kotlin.Unit.INSTANCE;
            }
            value = httpResponse4.getStatus().getValue();
            io.ktor.client.call.HttpClientCall call = httpResponse4.getCall();
            if (value >= 300) {
                io.ktor.util.Attributes attributes = call.getAttributes();
                attributeKey = io.ktor.client.plugins.DefaultResponseValidationKt.ValidateMark;
                if (!attributes.contains(attributeKey)) {
                    this.L$0 = httpResponse4;
                    this.I$0 = value;
                    this.label = 1;
                    java.lang.Object save = io.ktor.client.call.SavedCallKt.save(call, this);
                    if (save == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpResponse = httpResponse4;
                    obj = save;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            httpResponse3 = (io.ktor.client.statement.HttpResponse) this.L$1;
            httpResponse2 = (io.ktor.client.statement.HttpResponse) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                str = (java.lang.String) obj;
            } catch (io.ktor.utils.io.charsets.MalformedInputException unused) {
                str = "<body failed decoding>";
                if (300 > i) {
                }
                if (400 > i) {
                }
                if (500 > i) {
                }
                responseException = new io.ktor.client.plugins.ResponseException(httpResponse3, str);
                logger2 = io.ktor.client.plugins.DefaultResponseValidationKt.LOGGER;
                logger2.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
                throw responseException;
            }
            if (300 > i && i < 400) {
                responseException = new io.ktor.client.plugins.RedirectResponseException(httpResponse3, str);
            } else if (400 > i && i < 500) {
                responseException = new io.ktor.client.plugins.ClientRequestException(httpResponse3, str);
            } else if (500 > i && i < 600) {
                responseException = new io.ktor.client.plugins.ServerResponseException(httpResponse3, str);
            } else {
                responseException = new io.ktor.client.plugins.ResponseException(httpResponse3, str);
            }
            logger2 = io.ktor.client.plugins.DefaultResponseValidationKt.LOGGER;
            logger2.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
            throw responseException;
        }
        value = this.I$0;
        httpResponse = (io.ktor.client.statement.HttpResponse) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.call.HttpClientCall httpClientCall = (io.ktor.client.call.HttpClientCall) obj;
        io.ktor.util.Attributes attributes2 = httpClientCall.getAttributes();
        attributeKey2 = io.ktor.client.plugins.DefaultResponseValidationKt.ValidateMark;
        attributes2.put(attributeKey2, kotlin.Unit.INSTANCE);
        io.ktor.client.statement.HttpResponse response = httpClientCall.getResponse();
        this.L$0 = httpResponse;
        this.L$1 = response;
        this.I$0 = value;
        this.label = 2;
        java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(response, null, this, 1, null);
        if (bodyAsText$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        i = value;
        httpResponse3 = response;
        obj = bodyAsText$default;
        httpResponse2 = httpResponse;
        str = (java.lang.String) obj;
        if (300 > i) {
        }
        if (400 > i) {
        }
        if (500 > i) {
        }
        responseException = new io.ktor.client.plugins.ResponseException(httpResponse3, str);
        logger2 = io.ktor.client.plugins.DefaultResponseValidationKt.LOGGER;
        logger2.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
        throw responseException;
    }
}
