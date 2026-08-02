package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/http/cio/MultipartEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 11}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 215, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 225, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 255, 257}, m = "invokeSuspend", n = {"$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "headers", "readBeforeParse", "$this$produce", "countedInput", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "headers", "readBeforeParse", "$this$produce", "countedInput", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "headers", "headersMap", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0"})
/* loaded from: classes17.dex */
final class MultipartKt$parseMultipart$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.ktor.http.cio.MultipartEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.Long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.io.bytestring.ByteString getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;

    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0203 A[Catch: all -> 0x0245, TRY_LEAVE, TryCatch #1 {all -> 0x0245, blocks: (B:66:0x01fd, B:68:0x0203, B:72:0x023a, B:73:0x0244), top: B:65:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a A[Catch: all -> 0x0245, TRY_ENTER, TryCatch #1 {all -> 0x0245, blocks: (B:66:0x01fd, B:68:0x0203, B:72:0x023a, B:73:0x0244), top: B:65:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0306  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x022b -> B:37:0x0070). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        io.ktor.utils.io.CountedByteReadChannel counted;
        long totalBytesRead;
        kotlinx.io.bytestring.ByteString byteString;
        java.lang.Object readRemaining;
        kotlinx.io.Source source;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object obj2;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        io.ktor.utils.io.ByteChannel byteChannel;
        io.ktor.utils.io.ByteChannel byteChannel2;
        java.lang.Object obj3;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel2;
        kotlinx.coroutines.channels.ProducerScope producerScope4;
        kotlinx.io.bytestring.ByteString byteString2;
        long j;
        kotlinx.coroutines.CompletableDeferred completableDeferred2;
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap;
        kotlinx.coroutines.channels.ProducerScope producerScope5;
        io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel3;
        kotlinx.coroutines.CompletableDeferred completableDeferred3;
        io.ktor.utils.io.ByteChannel byteChannel3;
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default;
        kotlinx.io.bytestring.ByteString byteString3;
        kotlinx.io.bytestring.ByteString byteString4;
        kotlinx.io.bytestring.ByteString byteString5;
        java.lang.Object readRemaining2;
        java.lang.Object readPacket;
        kotlinx.io.Source source2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        io.ktor.http.cio.HttpHeadersMap httpHeadersMap2 = null;
        switch (this.getInputFormats) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                counted = io.ktor.utils.io.CountedByteReadChannelKt.counted(this.Camera2StreamConfigurationMap);
                totalBytesRead = counted.getTotalBytesRead();
                kotlinx.io.bytestring.ByteString byteString6 = this.getHighSpeedVideoSizes;
                byteString = io.ktor.http.cio.MultipartKt.Camera2StreamConfigurationMap;
                kotlinx.io.bytestring.ByteString substring$default = kotlinx.io.bytestring.ByteString.substring$default(byteString6, byteString.getSize(), 0, 2, null);
                this.getOutputSizes = producerScope;
                this.getOutputMinFrameDuration = counted;
                this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                this.getInputFormats = 1;
                readRemaining = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) producerScope, (kotlin.coroutines.CoroutineContext) null, false, (kotlin.jvm.functions.Function2) new io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1(substring$default, counted, null), 3, (java.lang.Object) null).getChannel(), this);
                if (readRemaining == coroutine_suspended) {
                    return coroutine_suspended;
                }
                source = (kotlinx.io.Source) readRemaining;
                if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source) > 0) {
                    this.getOutputSizes = producerScope;
                    this.getOutputMinFrameDuration = counted;
                    this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                    this.getInputFormats = 2;
                    if (producerScope.send(new io.ktor.http.cio.MultipartEvent.Preamble(source), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                producerScope2 = producerScope;
                if (!counted.isClosedForRead()) {
                    byteString4 = io.ktor.http.cio.MultipartKt.Camera2StreamConfigurationMap;
                    this.getOutputSizes = producerScope2;
                    this.getOutputMinFrameDuration = counted;
                    this.getInputSizeshNQ4ISI = null;
                    this.getOutputFormats = null;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                    this.getInputFormats = 3;
                    obj2 = io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString4, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((java.lang.Boolean) obj2).booleanValue()) {
                        byteString3 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                        this.getOutputSizes = producerScope2;
                        this.getOutputMinFrameDuration = counted;
                        this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                        this.getInputFormats = 4;
                        if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        countedByteReadChannel = counted;
                        producerScope3 = producerScope2;
                        byteChannel3 = new io.ktor.utils.io.ByteChannel(false, 1, null);
                        CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        this.getOutputSizes = producerScope3;
                        this.getOutputMinFrameDuration = countedByteReadChannel;
                        this.getInputSizeshNQ4ISI = byteChannel3;
                        this.getOutputFormats = CompletableDeferred$default;
                        this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                        this.getInputFormats = 5;
                        if (producerScope3.send(new io.ktor.http.cio.MultipartEvent.MultipartPart(CompletableDeferred$default, byteChannel3), this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteChannel = byteChannel3;
                        completableDeferred = CompletableDeferred$default;
                        try {
                            this.getOutputSizes = producerScope3;
                            this.getOutputMinFrameDuration = countedByteReadChannel;
                            this.getInputSizeshNQ4ISI = byteChannel;
                            this.getOutputFormats = completableDeferred;
                            this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                            this.getInputFormats = 6;
                            obj3 = io.ktor.http.cio.MultipartKt.getHighSpeedVideoSizes(countedByteReadChannel, this);
                            if (obj3 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            try {
                                try {
                                    countedByteReadChannel2 = countedByteReadChannel;
                                    byteChannel2 = byteChannel;
                                    if (completableDeferred.complete(httpHeadersMap)) {
                                        httpHeadersMap.release();
                                        throw new java.util.concurrent.CancellationException("Multipart processing has been cancelled");
                                    }
                                    this.getOutputSizes = producerScope5;
                                    this.getOutputMinFrameDuration = countedByteReadChannel3;
                                    this.getInputSizeshNQ4ISI = byteChannel2;
                                    this.getOutputFormats = completableDeferred;
                                    this.getHighSpeedVideoSizesFor = httpHeadersMap;
                                    this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                                    this.getInputFormats = 7;
                                    if (io.ktor.http.cio.MultipartKt.access$parsePartBodyImpl(this.getHighSpeedVideoSizes, countedByteReadChannel3, byteChannel2, httpHeadersMap, this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    try {
                                        completableDeferred3 = completableDeferred;
                                        producerScope2 = producerScope5;
                                        byteChannel2.close();
                                        if (!counted.isClosedForRead()) {
                                        }
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        completableDeferred2 = completableDeferred3;
                                        httpHeadersMap2 = httpHeadersMap;
                                        if (completableDeferred2.completeExceptionally(th)) {
                                        }
                                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                                        throw th;
                                    }
                                    counted = countedByteReadChannel3;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    completableDeferred2 = completableDeferred;
                                    httpHeadersMap2 = httpHeadersMap;
                                    if (completableDeferred2.completeExceptionally(th)) {
                                        httpHeadersMap2.release();
                                    }
                                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                                    throw th;
                                }
                                httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj3;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                completableDeferred2 = completableDeferred;
                                if (completableDeferred2.completeExceptionally(th)) {
                                }
                                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                                throw th;
                            }
                            producerScope5 = producerScope3;
                            countedByteReadChannel3 = countedByteReadChannel2;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            completableDeferred2 = completableDeferred;
                            byteChannel2 = byteChannel;
                            if (completableDeferred2.completeExceptionally(th)) {
                            }
                            io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                            throw th;
                        }
                    }
                }
                producerScope4 = producerScope2;
                byteString2 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = producerScope4;
                this.getOutputMinFrameDuration = counted;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                this.getInputFormats = 8;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = totalBytesRead;
                byteString5 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = producerScope4;
                this.getOutputMinFrameDuration = counted;
                this.getHighSpeedVideoFpsRangesFor = j;
                this.getInputFormats = 9;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getOutputSizes = producerScope4;
                    this.getOutputMinFrameDuration = null;
                    this.getInputFormats = 12;
                    readRemaining2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(counted, this);
                    if (readRemaining2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    source2 = (kotlinx.io.Source) readRemaining2;
                    if (!source2.exhausted()) {
                        this.getOutputSizes = null;
                        this.getInputFormats = 13;
                        if (producerScope4.send(new io.ktor.http.cio.MultipartEvent.Epilogue(source2), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                long longValue = this.getHighResolutionOutputSizeshNQ4ISI.longValue() - (counted.getTotalBytesRead() - j);
                if (longValue > androidx.collection.SieveCacheKt.NodeLinkMask) {
                    throw new java.io.IOException("Failed to parse multipart: prologue is too long");
                }
                if (longValue > 0) {
                    this.getOutputSizes = producerScope4;
                    this.getOutputMinFrameDuration = null;
                    this.getInputFormats = 10;
                    readPacket = io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(counted, (int) longValue, this);
                    if (readPacket == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.getOutputSizes = null;
                    this.getInputFormats = 11;
                    if (producerScope4.send(new io.ktor.http.cio.MultipartEvent.Epilogue((kotlinx.io.Source) readPacket), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                totalBytesRead = this.getHighSpeedVideoFpsRangesFor;
                counted = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                readRemaining = obj;
                source = (kotlinx.io.Source) readRemaining;
                if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source) > 0) {
                }
                producerScope2 = producerScope;
                if (!counted.isClosedForRead()) {
                }
                producerScope4 = producerScope2;
                byteString2 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = producerScope4;
                this.getOutputMinFrameDuration = counted;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                this.getInputFormats = 8;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString2, this) == coroutine_suspended) {
                }
                break;
            case 2:
                totalBytesRead = this.getHighSpeedVideoFpsRangesFor;
                counted = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                if (!counted.isClosedForRead()) {
                }
                producerScope4 = producerScope2;
                byteString2 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = producerScope4;
                this.getOutputMinFrameDuration = counted;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                this.getInputFormats = 8;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString2, this) == coroutine_suspended) {
                }
                break;
            case 3:
                totalBytesRead = this.getHighSpeedVideoFpsRangesFor;
                counted = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                if (!((java.lang.Boolean) obj2).booleanValue()) {
                }
                producerScope4 = producerScope2;
                byteString2 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = producerScope4;
                this.getOutputMinFrameDuration = counted;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                this.getInputFormats = 8;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString2, this) == coroutine_suspended) {
                }
                break;
            case 4:
                totalBytesRead = this.getHighSpeedVideoFpsRangesFor;
                counted = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                countedByteReadChannel = counted;
                producerScope3 = producerScope2;
                byteChannel3 = new io.ktor.utils.io.ByteChannel(false, 1, null);
                CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.getOutputSizes = producerScope3;
                this.getOutputMinFrameDuration = countedByteReadChannel;
                this.getInputSizeshNQ4ISI = byteChannel3;
                this.getOutputFormats = CompletableDeferred$default;
                this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                this.getInputFormats = 5;
                if (producerScope3.send(new io.ktor.http.cio.MultipartEvent.MultipartPart(CompletableDeferred$default, byteChannel3), this) != coroutine_suspended) {
                }
                break;
            case 5:
                totalBytesRead = this.getHighSpeedVideoFpsRangesFor;
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.getOutputFormats;
                io.ktor.utils.io.ByteChannel byteChannel4 = (io.ktor.utils.io.ByteChannel) this.getInputSizeshNQ4ISI;
                countedByteReadChannel = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                byteChannel = byteChannel4;
                this.getOutputSizes = producerScope3;
                this.getOutputMinFrameDuration = countedByteReadChannel;
                this.getInputSizeshNQ4ISI = byteChannel;
                this.getOutputFormats = completableDeferred;
                this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                this.getInputFormats = 6;
                obj3 = io.ktor.http.cio.MultipartKt.getHighSpeedVideoSizes(countedByteReadChannel, this);
                if (obj3 != coroutine_suspended) {
                }
                break;
            case 6:
                totalBytesRead = this.getHighSpeedVideoFpsRangesFor;
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.getOutputFormats;
                io.ktor.utils.io.ByteChannel byteChannel5 = (io.ktor.utils.io.ByteChannel) this.getInputSizeshNQ4ISI;
                io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel4 = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    countedByteReadChannel2 = countedByteReadChannel4;
                    byteChannel2 = byteChannel5;
                    producerScope5 = producerScope3;
                    countedByteReadChannel3 = countedByteReadChannel2;
                    httpHeadersMap = (io.ktor.http.cio.HttpHeadersMap) obj3;
                    if (completableDeferred.complete(httpHeadersMap)) {
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    byteChannel2 = byteChannel5;
                    completableDeferred2 = completableDeferred;
                    if (completableDeferred2.completeExceptionally(th)) {
                    }
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                    throw th;
                }
                break;
            case 7:
                totalBytesRead = this.getHighSpeedVideoFpsRangesFor;
                io.ktor.http.cio.HttpHeadersMap httpHeadersMap3 = (io.ktor.http.cio.HttpHeadersMap) this.getHighSpeedVideoSizesFor;
                completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.getOutputFormats;
                byteChannel2 = (io.ktor.utils.io.ByteChannel) this.getInputSizeshNQ4ISI;
                countedByteReadChannel3 = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                kotlinx.coroutines.channels.ProducerScope producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    completableDeferred3 = completableDeferred2;
                    producerScope2 = producerScope6;
                    httpHeadersMap = httpHeadersMap3;
                    counted = countedByteReadChannel3;
                    byteChannel2.close();
                    if (!counted.isClosedForRead()) {
                    }
                    producerScope4 = producerScope2;
                    byteString2 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                    this.getOutputSizes = producerScope4;
                    this.getOutputMinFrameDuration = counted;
                    this.getInputSizeshNQ4ISI = null;
                    this.getOutputFormats = null;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getHighSpeedVideoFpsRangesFor = totalBytesRead;
                    this.getInputFormats = 8;
                    if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString2, this) == coroutine_suspended) {
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    httpHeadersMap2 = httpHeadersMap3;
                    if (completableDeferred2.completeExceptionally(th) && httpHeadersMap2 != null) {
                        httpHeadersMap2.release();
                    }
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteChannel2, th);
                    throw th;
                }
                break;
            case 8:
                j = this.getHighSpeedVideoFpsRangesFor;
                counted = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                byteString5 = io.ktor.http.cio.MultipartKt.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = producerScope4;
                this.getOutputMinFrameDuration = counted;
                this.getHighSpeedVideoFpsRangesFor = j;
                this.getInputFormats = 9;
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                }
                break;
            case 9:
                j = this.getHighSpeedVideoFpsRangesFor;
                counted = (io.ktor.utils.io.CountedByteReadChannel) this.getOutputMinFrameDuration;
                producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                }
                break;
            case 10:
                kotlinx.coroutines.channels.ProducerScope producerScope7 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope4 = producerScope7;
                readPacket = obj;
                this.getOutputSizes = null;
                this.getInputFormats = 11;
                if (producerScope4.send(new io.ktor.http.cio.MultipartEvent.Epilogue((kotlinx.io.Source) readPacket), this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            case 11:
            case 13:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 12:
                kotlinx.coroutines.channels.ProducerScope producerScope8 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope4 = producerScope8;
                readRemaining2 = obj;
                source2 = (kotlinx.io.Source) readRemaining2;
                if (!source2.exhausted()) {
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.ktor.http.cio.MultipartEvent> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.cio.MultipartKt$parseMultipart$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.cio.MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new io.ktor.http.cio.MultipartKt$parseMultipart$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        multipartKt$parseMultipart$1.getOutputSizes = obj;
        return multipartKt$parseMultipart$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$parseMultipart$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, long j, java.lang.Long l, kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parseMultipart$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = byteReadChannel;
        this.getHighSpeedVideoSizes = byteString;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = l;
    }
}
