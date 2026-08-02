package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lio/ktor/http/cio/CIOMultipartDataBase;", "Lio/ktor/http/content/MultiPartData;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "contentLength", "formFieldLimit", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/CharSequence;Ljava/lang/Long;J)V", "Lio/ktor/http/content/PartData;", "readPart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lio/ktor/http/cio/MultipartEvent;", "p0", "Camera2StreamConfigurationMap", "(Lio/ktor/http/cio/MultipartEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "getHighSpeedVideoFpsRangesFor", "(Lio/ktor/http/cio/MultipartEvent$MultipartPart;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/http/content/PartData;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/channels/ReceiveChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CIOMultipartDataBase implements io.ktor.http.content.MultiPartData, kotlinx.coroutines.CoroutineScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private io.ktor.http.content.PartData getHighSpeedVideoFpsRanges;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> getHighSpeedVideoSizes;

    public CIOMultipartDataBase(kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.CharSequence charSequence, java.lang.Long l, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        this.coroutineContext = coroutineContext;
        this.getHighSpeedVideoSizes = io.ktor.http.cio.MultipartKt.parseMultipart(this, byteReadChannel, charSequence, l, j);
    }

    public /* synthetic */ CIOMultipartDataBase(kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.CharSequence charSequence, java.lang.Long l, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, byteReadChannel, charSequence, l, (i & 16) != 0 ? 65536L : j);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:16:0x0069). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.MultiPartData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readPart(kotlin.coroutines.Continuation<? super io.ktor.http.content.PartData> continuation) {
        io.ktor.http.cio.CIOMultipartDataBase$readPart$1 cIOMultipartDataBase$readPart$1;
        int i;
        kotlin.jvm.functions.Function0<kotlin.Unit> dispose;
        io.ktor.http.cio.MultipartEvent multipartEvent;
        if (continuation instanceof io.ktor.http.cio.CIOMultipartDataBase$readPart$1) {
            cIOMultipartDataBase$readPart$1 = (io.ktor.http.cio.CIOMultipartDataBase$readPart$1) continuation;
            if ((cIOMultipartDataBase$readPart$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$readPart$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cIOMultipartDataBase$readPart$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cIOMultipartDataBase$readPart$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.content.PartData partData = this.getHighSpeedVideoFpsRanges;
                    if (partData != null && (dispose = partData.getDispose()) != null) {
                        dispose.invoke();
                    }
                    multipartEvent = (io.ktor.http.cio.MultipartEvent) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighSpeedVideoSizes.mo24073tryReceivePtdJZtk());
                    if (multipartEvent == null) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.http.content.PartData partData2 = (io.ktor.http.content.PartData) obj;
                if (partData2 != null) {
                    this.getHighSpeedVideoFpsRanges = partData2;
                    return partData2;
                }
                multipartEvent = (io.ktor.http.cio.MultipartEvent) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighSpeedVideoSizes.mo24073tryReceivePtdJZtk());
                if (multipartEvent == null) {
                    cIOMultipartDataBase$readPart$1.getHighSpeedVideoSizes = 1;
                    obj = Camera2StreamConfigurationMap(multipartEvent, cIOMultipartDataBase$readPart$1);
                } else {
                    cIOMultipartDataBase$readPart$1.getHighSpeedVideoSizes = 2;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cIOMultipartDataBase$readPart$1);
                    if (highSpeedVideoFpsRanges != coroutine_suspended) {
                        return highSpeedVideoFpsRanges;
                    }
                }
                return coroutine_suspended;
            }
        }
        cIOMultipartDataBase$readPart$1 = new io.ktor.http.cio.CIOMultipartDataBase$readPart$1(this, continuation);
        java.lang.Object obj2 = cIOMultipartDataBase$readPart$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$readPart$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r6 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:12:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super io.ktor.http.content.PartData> continuation) {
        io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1 cIOMultipartDataBase$readPartSuspend$1;
        int i;
        io.ktor.http.content.PartData partData;
        try {
            if (continuation instanceof io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1) {
                cIOMultipartDataBase$readPartSuspend$1 = (io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1) continuation;
                if ((cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = cIOMultipartDataBase$readPartSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> receiveChannel = this.getHighSpeedVideoSizes;
                        cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes = 1;
                        obj = receiveChannel.receive(cIOMultipartDataBase$readPartSuspend$1);
                    } else if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes = 2;
                        obj = Camera2StreamConfigurationMap((io.ktor.http.cio.MultipartEvent) obj, cIOMultipartDataBase$readPartSuspend$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        partData = (io.ktor.http.content.PartData) obj;
                        if (partData != null) {
                        }
                        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> receiveChannel2 = this.getHighSpeedVideoSizes;
                        cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes = 1;
                        obj = receiveChannel2.receive(cIOMultipartDataBase$readPartSuspend$1);
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        partData = (io.ktor.http.content.PartData) obj;
                        if (partData != null) {
                            return partData;
                        }
                        kotlinx.coroutines.channels.ReceiveChannel<io.ktor.http.cio.MultipartEvent> receiveChannel22 = this.getHighSpeedVideoSizes;
                        cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes = 1;
                        obj = receiveChannel22.receive(cIOMultipartDataBase$readPartSuspend$1);
                    }
                }
            }
            if (i != 0) {
            }
        } catch (kotlinx.coroutines.channels.ClosedReceiveChannelException unused) {
            return null;
        }
        cIOMultipartDataBase$readPartSuspend$1 = new io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1(this, continuation);
        java.lang.Object obj2 = cIOMultipartDataBase$readPartSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$readPartSuspend$1.getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(io.ktor.http.cio.MultipartEvent multipartEvent, kotlin.coroutines.Continuation<? super io.ktor.http.content.PartData> continuation) {
        io.ktor.http.cio.CIOMultipartDataBase$eventToData$1 cIOMultipartDataBase$eventToData$1;
        int i;
        try {
            if (continuation instanceof io.ktor.http.cio.CIOMultipartDataBase$eventToData$1) {
                cIOMultipartDataBase$eventToData$1 = (io.ktor.http.cio.CIOMultipartDataBase$eventToData$1) continuation;
                if ((cIOMultipartDataBase$eventToData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    cIOMultipartDataBase$eventToData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = cIOMultipartDataBase$eventToData$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cIOMultipartDataBase$eventToData$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!(multipartEvent instanceof io.ktor.http.cio.MultipartEvent.MultipartPart)) {
                            return null;
                        }
                        cIOMultipartDataBase$eventToData$1.getHighResolutionOutputSizeshNQ4ISI = multipartEvent;
                        cIOMultipartDataBase$eventToData$1.getHighSpeedVideoFpsRanges = 1;
                        obj = getHighSpeedVideoFpsRangesFor((io.ktor.http.cio.MultipartEvent.MultipartPart) multipartEvent, cIOMultipartDataBase$eventToData$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (io.ktor.http.content.PartData) obj;
                }
            }
            if (i != 0) {
            }
            return (io.ktor.http.content.PartData) obj;
        } finally {
            multipartEvent.release();
        }
        cIOMultipartDataBase$eventToData$1 = new io.ktor.http.cio.CIOMultipartDataBase$eventToData$1(this, continuation);
        java.lang.Object obj2 = cIOMultipartDataBase$eventToData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$eventToData$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0055, code lost:
    
        if (r9 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(final io.ktor.http.cio.MultipartEvent.MultipartPart multipartPart, kotlin.coroutines.Continuation<? super io.ktor.http.content.PartData> continuation) {
        io.ktor.http.cio.CIOMultipartDataBase$partToData$1 cIOMultipartDataBase$partToData$1;
        int i;
        java.lang.String parameter;
        final io.ktor.http.cio.MultipartEvent.MultipartPart multipartPart2;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        if (continuation instanceof io.ktor.http.cio.CIOMultipartDataBase$partToData$1) {
            cIOMultipartDataBase$partToData$1 = (io.ktor.http.cio.CIOMultipartDataBase$partToData$1) continuation;
            if ((cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Deferred<io.ktor.http.cio.HttpHeadersMap> headers = multipartPart.getHeaders();
                    cIOMultipartDataBase$partToData$1.getHighResolutionOutputSizeshNQ4ISI = multipartPart;
                    cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRanges = 1;
                    obj = headers.await(cIOMultipartDataBase$partToData$1);
                } else if (i == 1) {
                    multipartPart = (io.ktor.http.cio.MultipartEvent.MultipartPart) cIOMultipartDataBase$partToData$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) cIOMultipartDataBase$partToData$1.getHighSpeedVideoSizes;
                    multipartPart2 = (io.ktor.http.cio.MultipartEvent.MultipartPart) cIOMultipartDataBase$partToData$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.io.Source source = (kotlinx.io.Source) obj;
                    try {
                        io.ktor.http.content.PartData.FormItem formItem = new io.ktor.http.content.PartData.FormItem(io.ktor.utils.io.DeprecationKt.readText(source), new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return io.ktor.http.cio.CIOMultipartDataBase.m23360$r8$lambda$btGnbg2vBLvUuL_wQ8Ekf935Js(io.ktor.http.cio.MultipartEvent.MultipartPart.this);
                            }
                        }, new io.ktor.http.cio.CIOHeaders(httpHeadersMap));
                        kotlin.jdk7.AutoCloseableKt.closeFinally(source, null);
                        return formItem;
                    } finally {
                    }
                }
                io.ktor.http.cio.HttpHeadersMap httpHeadersMap2 = (io.ktor.http.cio.HttpHeadersMap) obj;
                java.lang.CharSequence charSequence = httpHeadersMap2.get("Content-Disposition");
                io.ktor.http.ContentDisposition parse = charSequence == null ? io.ktor.http.ContentDisposition.INSTANCE.parse(charSequence.toString()) : null;
                parameter = parse == null ? parse.parameter("filename") : null;
                io.ktor.utils.io.ByteReadChannel body = multipartPart.getBody();
                if (parameter != null) {
                    cIOMultipartDataBase$partToData$1.getHighResolutionOutputSizeshNQ4ISI = multipartPart;
                    cIOMultipartDataBase$partToData$1.getHighSpeedVideoSizes = httpHeadersMap2;
                    cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRanges = 2;
                    java.lang.Object readRemaining = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(body, cIOMultipartDataBase$partToData$1);
                    if (readRemaining != coroutine_suspended) {
                        multipartPart2 = multipartPart;
                        httpHeadersMap = httpHeadersMap2;
                        obj = readRemaining;
                        kotlinx.io.Source source2 = (kotlinx.io.Source) obj;
                        io.ktor.http.content.PartData.FormItem formItem2 = new io.ktor.http.content.PartData.FormItem(io.ktor.utils.io.DeprecationKt.readText(source2), new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return io.ktor.http.cio.CIOMultipartDataBase.m23360$r8$lambda$btGnbg2vBLvUuL_wQ8Ekf935Js(io.ktor.http.cio.MultipartEvent.MultipartPart.this);
                            }
                        }, new io.ktor.http.cio.CIOHeaders(httpHeadersMap));
                        kotlin.jdk7.AutoCloseableKt.closeFinally(source2, null);
                        return formItem2;
                    }
                    return coroutine_suspended;
                }
                return new io.ktor.http.content.PartData.FileItem(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        io.ktor.utils.io.ByteReadChannel body2;
                        body2 = io.ktor.http.cio.MultipartEvent.MultipartPart.this.getBody();
                        return body2;
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return io.ktor.http.cio.CIOMultipartDataBase.$r8$lambda$SaRMcQnve2jap1qtZIDLAzSHZAI(io.ktor.http.cio.MultipartEvent.MultipartPart.this);
                    }
                }, new io.ktor.http.cio.CIOHeaders(httpHeadersMap2));
            }
        }
        cIOMultipartDataBase$partToData$1 = new io.ktor.http.cio.CIOMultipartDataBase$partToData$1(this, continuation);
        java.lang.Object obj2 = cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$partToData$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap22 = (io.ktor.http.cio.HttpHeadersMap) obj2;
        java.lang.CharSequence charSequence2 = httpHeadersMap22.get("Content-Disposition");
        if (charSequence2 == null) {
        }
        if (parse == null) {
        }
        io.ktor.utils.io.ByteReadChannel body2 = multipartPart.getBody();
        if (parameter != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SaRMcQnve2jap1qtZIDLAzSHZAI(io.ktor.http.cio.MultipartEvent.MultipartPart multipartPart) {
        multipartPart.release();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$btGnbg2vBLvUuL_wQ8Ek-f935Js, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23360$r8$lambda$btGnbg2vBLvUuL_wQ8Ekf935Js(io.ktor.http.cio.MultipartEvent.MultipartPart multipartPart) {
        multipartPart.release();
        return kotlin.Unit.INSTANCE;
    }
}
