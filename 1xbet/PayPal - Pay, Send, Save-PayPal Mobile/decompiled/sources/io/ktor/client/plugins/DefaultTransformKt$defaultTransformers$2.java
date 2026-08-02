package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9}, l = {72, 76, 76, 81, 81, 85, 92, 116, 121, 137}, m = "invokeSuspend", n = {"$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class DefaultTransformKt$defaultTransformers$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.HttpClient getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        io.ktor.util.reflect.TypeInfo expectedType;
        java.lang.Object readRemaining;
        io.ktor.util.pipeline.PipelineContext pipelineContext2;
        io.ktor.util.pipeline.PipelineContext pipelineContext3;
        io.ktor.util.reflect.TypeInfo typeInfo;
        java.lang.Object proceedWith;
        io.ktor.util.reflect.TypeInfo typeInfo2;
        java.lang.Object proceedWith2;
        java.lang.Object proceedWith3;
        java.lang.Object byteArray;
        io.ktor.util.pipeline.PipelineContext pipelineContext4;
        io.ktor.util.reflect.TypeInfo typeInfo3;
        java.lang.Object readRemaining2;
        io.ktor.util.pipeline.PipelineContext pipelineContext5;
        io.ktor.util.reflect.TypeInfo typeInfo4;
        java.lang.Object proceedWith4;
        java.lang.Object proceedWith5;
        io.ktor.util.reflect.TypeInfo typeInfo5;
        io.ktor.client.statement.HttpResponseContainer httpResponseContainer;
        java.lang.Object proceedWith6;
        java.lang.Object proceedWith7;
        org.slf4j.Logger logger;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        io.ktor.client.statement.HttpResponseContainer httpResponseContainer2 = null;
        switch (this.getHighResolutionOutputSizeshNQ4ISI) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                io.ktor.client.statement.HttpResponseContainer httpResponseContainer3 = (io.ktor.client.statement.HttpResponseContainer) this.Camera2StreamConfigurationMap;
                expectedType = httpResponseContainer3.getExpectedType();
                java.lang.Object response = httpResponseContainer3.getResponse();
                if (!(response instanceof io.ktor.utils.io.ByteReadChannel)) {
                    return kotlin.Unit.INSTANCE;
                }
                io.ktor.client.statement.HttpResponse response2 = ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse();
                kotlin.reflect.KClass<?> type = expectedType.getType();
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class))) {
                    io.ktor.utils.io.ByteReadChannelKt.cancel((io.ktor.utils.io.ByteReadChannel) response);
                    this.getInputFormats = pipelineContext;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    proceedWith4 = pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, kotlin.Unit.INSTANCE), this);
                    if (proceedWith4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo2 = expectedType;
                    httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith4;
                    expectedType = typeInfo2;
                    if (httpResponseContainer2 != null) {
                        logger = io.ktor.client.plugins.DefaultTransformKt.Camera2StreamConfigurationMap;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transformed with default transformers response body for ");
                        sb.append(((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getRequest().getGetHighSpeedVideoFpsRanges());
                        sb.append(" to ");
                        sb.append(expectedType.getType());
                        logger.trace(sb.toString());
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE))) {
                    this.getInputFormats = pipelineContext;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighSpeedVideoFpsRanges = pipelineContext;
                    this.getHighSpeedVideoSizes = expectedType;
                    this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    readRemaining2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining((io.ktor.utils.io.ByteReadChannel) response, this);
                    if (readRemaining2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext2 = pipelineContext;
                    pipelineContext5 = pipelineContext2;
                    typeInfo4 = expectedType;
                    this.getInputFormats = pipelineContext2;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 3;
                    proceedWith5 = pipelineContext5.proceedWith(new io.ktor.client.statement.HttpResponseContainer(typeInfo4, kotlin.coroutines.jvm.internal.Boxing.boxInt(java.lang.Integer.parseInt(io.ktor.utils.io.DeprecationKt.readText((kotlinx.io.Source) readRemaining2)))), this);
                    if (proceedWith5 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo5 = expectedType;
                    httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) proceedWith5;
                    expectedType = typeInfo5;
                    httpResponseContainer2 = httpResponseContainer;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.io.Source.class)) || kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.io.Source.class))) {
                    this.getInputFormats = pipelineContext;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighSpeedVideoFpsRanges = pipelineContext;
                    this.getHighSpeedVideoSizes = expectedType;
                    this.getHighResolutionOutputSizeshNQ4ISI = 4;
                    readRemaining = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining((io.ktor.utils.io.ByteReadChannel) response, this);
                    if (readRemaining == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext2 = pipelineContext;
                    pipelineContext3 = pipelineContext2;
                    typeInfo = expectedType;
                    this.getInputFormats = pipelineContext2;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 5;
                    proceedWith6 = pipelineContext3.proceedWith(new io.ktor.client.statement.HttpResponseContainer(typeInfo, readRemaining), this);
                    if (proceedWith6 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo5 = expectedType;
                    httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) proceedWith6;
                    expectedType = typeInfo5;
                    httpResponseContainer2 = httpResponseContainer;
                    pipelineContext = pipelineContext2;
                    if (httpResponseContainer2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class))) {
                    this.getInputFormats = pipelineContext;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighResolutionOutputSizeshNQ4ISI = 6;
                    byteArray = io.ktor.utils.io.ByteReadChannelOperationsKt.toByteArray((io.ktor.utils.io.ByteReadChannel) response, this);
                    if (byteArray == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext4 = pipelineContext;
                    typeInfo3 = expectedType;
                    io.ktor.client.call.UtilsKt.checkContentLength(io.ktor.http.HttpMessagePropertiesKt.contentLength(((io.ktor.client.call.HttpClientCall) pipelineContext4.getContext()).getResponse()), r3.length, ((io.ktor.client.call.HttpClientCall) pipelineContext4.getContext()).getRequest().getGetHighSpeedVideoSizes());
                    this.getInputFormats = pipelineContext4;
                    this.Camera2StreamConfigurationMap = typeInfo3;
                    this.getHighResolutionOutputSizeshNQ4ISI = 7;
                    proceedWith7 = pipelineContext4.proceedWith(new io.ktor.client.statement.HttpResponseContainer(typeInfo3, (byte[]) byteArray), this);
                    if (proceedWith7 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo2 = typeInfo3;
                    pipelineContext = pipelineContext4;
                    httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith7;
                    expectedType = typeInfo2;
                    if (httpResponseContainer2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.utils.io.ByteReadChannel.class))) {
                    final kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) response2.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
                    io.ktor.utils.io.WriterJob writer$default = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) pipelineContext, this.getHighSpeedVideoFpsRangesFor.getCoroutineContext(), false, (kotlin.jvm.functions.Function2) new io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1(response, response2, null), 2, (java.lang.Object) null);
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.invokeOnCompletion(writer$default, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CompletableJob.this);
                        }
                    });
                    this.getInputFormats = pipelineContext;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighResolutionOutputSizeshNQ4ISI = 8;
                    proceedWith3 = pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, writer$default.getChannel()), this);
                    if (proceedWith3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo2 = expectedType;
                    httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith3;
                    expectedType = typeInfo2;
                    if (httpResponseContainer2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.http.HttpStatusCode.class))) {
                    io.ktor.utils.io.ByteReadChannelKt.cancel((io.ktor.utils.io.ByteReadChannel) response);
                    this.getInputFormats = pipelineContext;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighResolutionOutputSizeshNQ4ISI = 9;
                    proceedWith2 = pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, response2.getStatus()), this);
                    if (proceedWith2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo2 = expectedType;
                    httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith2;
                    expectedType = typeInfo2;
                    if (httpResponseContainer2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.http.content.MultiPartData.class))) {
                    java.lang.String str = ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
                    if (str == null) {
                        throw new java.lang.IllegalStateException("No content type provided for multipart".toString());
                    }
                    io.ktor.http.ContentType parse = io.ktor.http.ContentType.INSTANCE.parse(str);
                    if (!parse.match(io.ktor.http.ContentType.MultiPart.INSTANCE.getFormData())) {
                        throw new java.lang.IllegalStateException("Expected multipart/form-data, got ".concat(java.lang.String.valueOf(parse)).toString());
                    }
                    java.lang.String str2 = ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                    java.lang.Long boxLong = str2 != null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.Long.parseLong(str2)) : null;
                    this.getInputFormats = pipelineContext;
                    this.Camera2StreamConfigurationMap = expectedType;
                    this.getHighResolutionOutputSizeshNQ4ISI = 10;
                    proceedWith = pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, new io.ktor.http.cio.CIOMultipartDataBase(pipelineContext.getCoroutineContext(), (io.ktor.utils.io.ByteReadChannel) response, str, boxLong, 0L, 16, null)), this);
                    if (proceedWith == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    typeInfo2 = expectedType;
                    httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith;
                    expectedType = typeInfo2;
                }
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                typeInfo2 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                proceedWith4 = obj;
                httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith4;
                expectedType = typeInfo2;
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 2:
                typeInfo4 = (io.ktor.util.reflect.TypeInfo) this.getHighSpeedVideoSizes;
                io.ktor.util.pipeline.PipelineContext pipelineContext6 = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
                expectedType = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                pipelineContext5 = pipelineContext6;
                readRemaining2 = obj;
                this.getInputFormats = pipelineContext2;
                this.Camera2StreamConfigurationMap = expectedType;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes = null;
                this.getHighResolutionOutputSizeshNQ4ISI = 3;
                proceedWith5 = pipelineContext5.proceedWith(new io.ktor.client.statement.HttpResponseContainer(typeInfo4, kotlin.coroutines.jvm.internal.Boxing.boxInt(java.lang.Integer.parseInt(io.ktor.utils.io.DeprecationKt.readText((kotlinx.io.Source) readRemaining2)))), this);
                if (proceedWith5 != coroutine_suspended) {
                }
                break;
            case 3:
                typeInfo5 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                io.ktor.util.pipeline.PipelineContext pipelineContext7 = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                pipelineContext2 = pipelineContext7;
                proceedWith5 = obj;
                httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) proceedWith5;
                expectedType = typeInfo5;
                httpResponseContainer2 = httpResponseContainer;
                pipelineContext = pipelineContext2;
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 4:
                typeInfo = (io.ktor.util.reflect.TypeInfo) this.getHighSpeedVideoSizes;
                io.ktor.util.pipeline.PipelineContext pipelineContext8 = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
                expectedType = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                pipelineContext3 = pipelineContext8;
                readRemaining = obj;
                this.getInputFormats = pipelineContext2;
                this.Camera2StreamConfigurationMap = expectedType;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes = null;
                this.getHighResolutionOutputSizeshNQ4ISI = 5;
                proceedWith6 = pipelineContext3.proceedWith(new io.ktor.client.statement.HttpResponseContainer(typeInfo, readRemaining), this);
                if (proceedWith6 != coroutine_suspended) {
                }
                break;
            case 5:
                typeInfo5 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                io.ktor.util.pipeline.PipelineContext pipelineContext9 = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                pipelineContext2 = pipelineContext9;
                proceedWith6 = obj;
                httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) proceedWith6;
                expectedType = typeInfo5;
                httpResponseContainer2 = httpResponseContainer;
                pipelineContext = pipelineContext2;
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 6:
                typeInfo3 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                io.ktor.util.pipeline.PipelineContext pipelineContext10 = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                pipelineContext4 = pipelineContext10;
                byteArray = obj;
                io.ktor.client.call.UtilsKt.checkContentLength(io.ktor.http.HttpMessagePropertiesKt.contentLength(((io.ktor.client.call.HttpClientCall) pipelineContext4.getContext()).getResponse()), r3.length, ((io.ktor.client.call.HttpClientCall) pipelineContext4.getContext()).getRequest().getGetHighSpeedVideoSizes());
                this.getInputFormats = pipelineContext4;
                this.Camera2StreamConfigurationMap = typeInfo3;
                this.getHighResolutionOutputSizeshNQ4ISI = 7;
                proceedWith7 = pipelineContext4.proceedWith(new io.ktor.client.statement.HttpResponseContainer(typeInfo3, (byte[]) byteArray), this);
                if (proceedWith7 != coroutine_suspended) {
                }
                break;
            case 7:
                typeInfo2 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                proceedWith7 = obj;
                httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith7;
                expectedType = typeInfo2;
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 8:
                typeInfo2 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                proceedWith3 = obj;
                httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith3;
                expectedType = typeInfo2;
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 9:
                typeInfo2 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                proceedWith2 = obj;
                httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith2;
                expectedType = typeInfo2;
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            case 10:
                typeInfo2 = (io.ktor.util.reflect.TypeInfo) this.Camera2StreamConfigurationMap;
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                proceedWith = obj;
                httpResponseContainer2 = (io.ktor.client.statement.HttpResponseContainer) proceedWith;
                expectedType = typeInfo2;
                if (httpResponseContainer2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CompletableJob completableJob) {
        completableJob.complete();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2(this.getHighSpeedVideoFpsRangesFor, continuation);
        defaultTransformKt$defaultTransformers$2.getInputFormats = pipelineContext;
        defaultTransformKt$defaultTransformers$2.Camera2StreamConfigurationMap = httpResponseContainer;
        return defaultTransformKt$defaultTransformers$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultTransformKt$defaultTransformers$2(io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = httpClient;
    }
}
