package io.ktor.http.cio;

/* compiled from: Multipart.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/http/cio/MultipartEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 12}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 211, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 229, 236, 248, 249, 256, 256, 259, 261}, m = "invokeSuspend", n = {"$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "headersMap", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0"})
/* loaded from: classes6.dex */
final class MultipartKt$parseMultipart$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.ktor.http.cio.MultipartEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.io.bytestring.ByteString $boundaryPrefixed;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel $input;
    final /* synthetic */ long $maxPartSize;
    final /* synthetic */ java.lang.Long $totalLength;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$parseMultipart$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, long j, java.lang.Long l, kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parseMultipart$1> continuation) {
        super(2, continuation);
        this.$input = byteReadChannel;
        this.$boundaryPrefixed = byteString;
        this.$maxPartSize = j;
        this.$totalLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.cio.MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new io.ktor.http.cio.MultipartKt$parseMultipart$1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, continuation);
        multipartKt$parseMultipart$1.L$0 = obj;
        return multipartKt$parseMultipart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.ktor.http.cio.MultipartEvent> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.cio.MultipartKt$parseMultipart$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0367 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x031e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0274 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0285 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:40:0x006e, B:72:0x027f, B:74:0x0285, B:77:0x02c0, B:78:0x02ca), top: B:39:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c0 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #0 {all -> 0x0079, blocks: (B:40:0x006e, B:72:0x027f, B:74:0x0285, B:77:0x02c0, B:78:0x02ca), top: B:39:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0301 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x038c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x021f -> B:45:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x02b1 -> B:41:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.CountedByteReadChannel counted;
        long totalBytesRead;
        kotlinx.io.bytestring.ByteString byteString;
        java.lang.Object readRemaining;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.io.bytestring.ByteString byteString2;
        kotlinx.io.Source source;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel;
        long j;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object obj2;
        long j2;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel2;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        java.lang.Object obj3;
        long j3;
        kotlinx.io.bytestring.ByteString byteString3;
        kotlinx.coroutines.channels.ProducerScope producerScope4;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel3;
        io.ktor.utils.io.ByteChannel byteChannel;
        io.ktor.utils.io.ByteChannel byteChannel2;
        java.lang.Object obj4;
        kotlinx.coroutines.channels.ProducerScope producerScope5;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel4;
        kotlinx.io.bytestring.ByteString byteString4;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        kotlinx.coroutines.channels.ProducerScope producerScope6;
        kotlinx.io.bytestring.ByteString byteString5;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel5;
        long j4;
        java.lang.Object parsePartBodyImpl;
        kotlinx.io.bytestring.ByteString byteString6;
        kotlinx.io.bytestring.ByteString byteString7;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap2;
        io.ktor.utils.io.ByteChannel byteChannel3;
        kotlinx.io.bytestring.ByteString byteString8;
        java.lang.Object readRemaining2;
        java.lang.Object readPacket;
        kotlinx.io.Source source2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = false;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap3 = null;
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope7 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                counted = io.ktor.utils.io.CountedByteReadChannelKt.counted(this.$input);
                totalBytesRead = counted.getTotalBytesRead();
                kotlinx.io.bytestring.ByteString byteString9 = this.$boundaryPrefixed;
                byteString = io.ktor.http.cio.MultipartKt.PrefixString;
                kotlinx.io.bytestring.ByteString substring$default = kotlinx.io.bytestring.ByteString.substring$default(byteString9, byteString.getSize(), 0, 2, null);
                this.L$0 = producerScope7;
                this.L$1 = counted;
                this.L$2 = substring$default;
                this.J$0 = totalBytesRead;
                this.label = 1;
                readRemaining = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) producerScope7, (kotlin.coroutines.CoroutineContext) null, false, (kotlin.jvm.functions.Function2) new io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1(substring$default, counted, null), 3, (java.lang.Object) null).getChannel(), this);
                if (readRemaining == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope7;
                byteString2 = substring$default;
                source = (kotlinx.io.Source) readRemaining;
                if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source) > 0) {
                    this.L$0 = producerScope;
                    this.L$1 = counted;
                    this.L$2 = byteString2;
                    this.J$0 = totalBytesRead;
                    this.label = 2;
                    if (producerScope.send(new io.ktor.http.cio.MultipartEvent.Preamble(source), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    countedByteReadChannel = counted;
                    j = totalBytesRead;
                    producerScope2 = producerScope;
                    producerScope = producerScope2;
                    totalBytesRead = j;
                    counted = countedByteReadChannel;
                }
                if (!counted.isClosedForRead()) {
                    byteString7 = io.ktor.http.cio.MultipartKt.PrefixString;
                    this.L$0 = producerScope;
                    this.L$1 = counted;
                    this.L$2 = byteString2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = totalBytesRead;
                    this.label = 3;
                    obj2 = io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString7, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((java.lang.Boolean) obj2).booleanValue()) {
                        byteString6 = io.ktor.http.cio.MultipartKt.CrLf;
                        this.L$0 = producerScope;
                        this.L$1 = counted;
                        this.L$2 = byteString2;
                        this.J$0 = totalBytesRead;
                        this.label = 4;
                        if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        countedByteReadChannel2 = counted;
                        j2 = totalBytesRead;
                        producerScope3 = producerScope;
                        this.L$0 = producerScope3;
                        this.L$1 = countedByteReadChannel2;
                        this.L$2 = byteString2;
                        this.J$0 = j2;
                        this.label = 5;
                        obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel2, byteString2, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j5 = j2;
                        counted = countedByteReadChannel2;
                        kotlinx.coroutines.channels.ProducerScope producerScope8 = producerScope3;
                        totalBytesRead = j5;
                        if (((java.lang.Boolean) obj3).booleanValue()) {
                            producerScope = producerScope8;
                            if (!counted.isClosedForRead()) {
                            }
                        } else {
                            byteChannel = new io.ktor.utils.io.ByteChannel(z, 1, null);
                            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                            this.L$0 = producerScope8;
                            this.L$1 = counted;
                            this.L$2 = byteString2;
                            this.L$3 = byteChannel;
                            this.L$4 = CompletableDeferred$default;
                            this.J$0 = totalBytesRead;
                            this.label = 6;
                            if (producerScope8.send(new io.ktor.http.cio.MultipartEvent.MultipartPart(CompletableDeferred$default, byteChannel), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteString3 = byteString2;
                            countedByteReadChannel3 = counted;
                            j3 = totalBytesRead;
                            producerScope4 = producerScope8;
                            completableDeferred = CompletableDeferred$default;
                            try {
                                this.L$0 = producerScope4;
                                this.L$1 = countedByteReadChannel3;
                                this.L$2 = byteString3;
                                this.L$3 = byteChannel;
                                this.L$4 = completableDeferred;
                                this.J$0 = j3;
                                this.label = 7;
                                obj4 = io.ktor.http.cio.MultipartKt.parsePartHeadersImpl(countedByteReadChannel3, this);
                                if (obj4 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                producerScope5 = producerScope4;
                                countedByteReadChannel4 = countedByteReadChannel3;
                                io.ktor.utils.io.ByteChannel byteChannel4 = byteChannel;
                                byteString4 = byteString3;
                                byteChannel2 = byteChannel4;
                                httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj4;
                                if (completableDeferred.complete(httpHeadersMap)) {
                                    httpHeadersMap.release();
                                    throw new java.util.concurrent.CancellationException("Multipart processing has been cancelled");
                                }
                                try {
                                    this.L$0 = producerScope5;
                                    this.L$1 = countedByteReadChannel4;
                                    this.L$2 = byteString4;
                                    this.L$3 = byteChannel2;
                                    this.L$4 = completableDeferred;
                                    this.L$5 = httpHeadersMap;
                                    this.J$0 = j3;
                                    this.label = 8;
                                    parsePartBodyImpl = io.ktor.http.cio.MultipartKt.parsePartBodyImpl(this.$boundaryPrefixed, countedByteReadChannel4, byteChannel2, httpHeadersMap, this.$maxPartSize, this);
                                    if (parsePartBodyImpl == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    byteChannel3.close();
                                    z = false;
                                    if (!counted.isClosedForRead()) {
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    httpHeadersMap3 = httpHeadersMap2;
                                    byteChannel2 = byteChannel3;
                                    if (completableDeferred.completeExceptionally(th)) {
                                    }
                                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                                    throw th;
                                }
                                httpHeadersMap2 = httpHeadersMap;
                                byteChannel3 = byteChannel2;
                                byteString2 = byteString4;
                                producerScope = producerScope5;
                                totalBytesRead = j3;
                                counted = countedByteReadChannel4;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                byteChannel2 = byteChannel;
                                if (completableDeferred.completeExceptionally(th)) {
                                    httpHeadersMap3.release();
                                }
                                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                                throw th;
                            }
                        }
                    }
                }
                producerScope6 = producerScope;
                byteString5 = io.ktor.http.cio.MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                countedByteReadChannel5 = counted;
                j4 = totalBytesRead;
                byteString8 = io.ktor.http.cio.MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = countedByteReadChannel5;
                this.J$0 = j4;
                this.label = 10;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel5, byteString8, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (this.$totalLength == null) {
                    this.L$0 = producerScope6;
                    this.L$1 = null;
                    this.label = 13;
                    readRemaining2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(countedByteReadChannel5, this);
                    if (readRemaining2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    source2 = (kotlinx.io.Source) readRemaining2;
                    if (!source2.exhausted()) {
                        this.L$0 = null;
                        this.label = 14;
                        if (producerScope6.send(new io.ktor.http.cio.MultipartEvent.Epilogue(source2), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                long longValue = this.$totalLength.longValue() - (countedByteReadChannel5.getTotalBytesRead() - j4);
                if (longValue > 2147483647L) {
                    throw new java.io.IOException("Failed to parse multipart: prologue is too long");
                }
                if (longValue > 0) {
                    this.L$0 = producerScope6;
                    this.L$1 = null;
                    this.label = 11;
                    readPacket = io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(countedByteReadChannel5, (int) longValue, this);
                    if (readPacket == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = null;
                    this.label = 12;
                    if (producerScope6.send(new io.ktor.http.cio.MultipartEvent.Epilogue((kotlinx.io.Source) readPacket), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                long j6 = this.J$0;
                byteString2 = (kotlinx.io.bytestring.ByteString) this.L$2;
                io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel6 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                readRemaining = obj;
                counted = countedByteReadChannel6;
                totalBytesRead = j6;
                source = (kotlinx.io.Source) readRemaining;
                if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source) > 0) {
                }
                if (!counted.isClosedForRead()) {
                }
                producerScope6 = producerScope;
                byteString5 = io.ktor.http.cio.MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                }
                break;
            case 2:
                j = this.J$0;
                byteString2 = (kotlinx.io.bytestring.ByteString) this.L$2;
                countedByteReadChannel = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = producerScope2;
                totalBytesRead = j;
                counted = countedByteReadChannel;
                if (!counted.isClosedForRead()) {
                }
                producerScope6 = producerScope;
                byteString5 = io.ktor.http.cio.MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                }
                break;
            case 3:
                long j7 = this.J$0;
                byteString2 = (kotlinx.io.bytestring.ByteString) this.L$2;
                io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel7 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                kotlinx.coroutines.channels.ProducerScope producerScope9 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = producerScope9;
                totalBytesRead = j7;
                counted = countedByteReadChannel7;
                obj2 = obj;
                if (!((java.lang.Boolean) obj2).booleanValue()) {
                }
                producerScope6 = producerScope;
                byteString5 = io.ktor.http.cio.MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                }
                break;
            case 4:
                j2 = this.J$0;
                byteString2 = (kotlinx.io.bytestring.ByteString) this.L$2;
                countedByteReadChannel2 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = producerScope3;
                this.L$1 = countedByteReadChannel2;
                this.L$2 = byteString2;
                this.J$0 = j2;
                this.label = 5;
                obj3 = io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel2, byteString2, this);
                if (obj3 == coroutine_suspended) {
                }
                long j52 = j2;
                counted = countedByteReadChannel2;
                kotlinx.coroutines.channels.ProducerScope producerScope82 = producerScope3;
                totalBytesRead = j52;
                if (((java.lang.Boolean) obj3).booleanValue()) {
                }
                break;
            case 5:
                j2 = this.J$0;
                byteString2 = (kotlinx.io.bytestring.ByteString) this.L$2;
                countedByteReadChannel2 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj3 = obj;
                long j522 = j2;
                counted = countedByteReadChannel2;
                kotlinx.coroutines.channels.ProducerScope producerScope822 = producerScope3;
                totalBytesRead = j522;
                if (((java.lang.Boolean) obj3).booleanValue()) {
                }
                break;
            case 6:
                j3 = this.J$0;
                kotlinx.coroutines.CompletableDeferred completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.L$4;
                io.ktor.utils.io.ByteChannel byteChannel5 = (io.ktor.utils.io.ByteChannel) this.L$3;
                byteString3 = (kotlinx.io.bytestring.ByteString) this.L$2;
                io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel8 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                completableDeferred = completableDeferred2;
                countedByteReadChannel3 = countedByteReadChannel8;
                byteChannel = byteChannel5;
                this.L$0 = producerScope4;
                this.L$1 = countedByteReadChannel3;
                this.L$2 = byteString3;
                this.L$3 = byteChannel;
                this.L$4 = completableDeferred;
                this.J$0 = j3;
                this.label = 7;
                obj4 = io.ktor.http.cio.MultipartKt.parsePartHeadersImpl(countedByteReadChannel3, this);
                if (obj4 != coroutine_suspended) {
                }
                break;
            case 7:
                j3 = this.J$0;
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.L$4;
                byteChannel2 = (io.ktor.utils.io.ByteChannel) this.L$3;
                kotlinx.io.bytestring.ByteString byteString10 = (kotlinx.io.bytestring.ByteString) this.L$2;
                io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel9 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                kotlinx.coroutines.channels.ProducerScope producerScope10 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    producerScope5 = producerScope10;
                    countedByteReadChannel4 = countedByteReadChannel9;
                    byteString4 = byteString10;
                    httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj4;
                    if (completableDeferred.complete(httpHeadersMap)) {
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    if (completableDeferred.completeExceptionally(th)) {
                    }
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                    throw th;
                }
                break;
            case 8:
                j3 = this.J$0;
                httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) this.L$5;
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.L$4;
                byteChannel2 = (io.ktor.utils.io.ByteChannel) this.L$3;
                byteString4 = (kotlinx.io.bytestring.ByteString) this.L$2;
                countedByteReadChannel4 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpHeadersMap2 = httpHeadersMap;
                    byteChannel3 = byteChannel2;
                    byteString2 = byteString4;
                    producerScope = producerScope5;
                    totalBytesRead = j3;
                    counted = countedByteReadChannel4;
                    byteChannel3.close();
                    z = false;
                    if (!counted.isClosedForRead()) {
                    }
                    producerScope6 = producerScope;
                    byteString5 = io.ktor.http.cio.MultipartKt.CrLf;
                    this.L$0 = producerScope6;
                    this.L$1 = counted;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = totalBytesRead;
                    this.label = 9;
                    if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    httpHeadersMap3 = httpHeadersMap;
                    if (completableDeferred.completeExceptionally(th) && httpHeadersMap3 != null) {
                        httpHeadersMap3.release();
                    }
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                    throw th;
                }
                break;
            case 9:
                j4 = this.J$0;
                countedByteReadChannel5 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                byteString8 = io.ktor.http.cio.MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = countedByteReadChannel5;
                this.J$0 = j4;
                this.label = 10;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel5, byteString8, this) == coroutine_suspended) {
                }
                if (this.$totalLength == null) {
                }
                break;
            case 10:
                j4 = this.J$0;
                countedByteReadChannel5 = (io.ktor.utils.io.CountedByteReadChannel) this.L$1;
                producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.$totalLength == null) {
                }
                break;
            case 11:
                kotlinx.coroutines.channels.ProducerScope producerScope11 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope6 = producerScope11;
                readPacket = obj;
                this.L$0 = null;
                this.label = 12;
                if (producerScope6.send(new io.ktor.http.cio.MultipartEvent.Epilogue((kotlinx.io.Source) readPacket), this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            case 12:
            case 14:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 13:
                kotlinx.coroutines.channels.ProducerScope producerScope12 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope6 = producerScope12;
                readRemaining2 = obj;
                source2 = (kotlinx.io.Source) readRemaining2;
                if (!source2.exhausted()) {
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
