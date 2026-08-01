package io.ktor.http.cio;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.cio.MultipartEvent;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.CountedByteReadChannel;
import io.ktor.utils.io.CountedByteReadChannelKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.io.Source;
import kotlinx.io.bytestring.ByteString;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/http/cio/MultipartEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 12}, l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 211, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 229, 236, 248, 249, 256, 256, 259, 261}, m = "invokeSuspend", n = {"$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "readBeforeParse", "$this$produce", "countedInput", "firstBoundary", "body", "headers", "headersMap", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0"})
/* loaded from: classes7.dex */
final class MultipartKt$parseMultipart$1 extends SuspendLambda implements Function2<ProducerScope<? super MultipartEvent>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteString $boundaryPrefixed;
    final /* synthetic */ ByteReadChannel $input;
    final /* synthetic */ long $maxPartSize;
    final /* synthetic */ Long $totalLength;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$parseMultipart$1(ByteReadChannel byteReadChannel, ByteString byteString, long j, Long l, Continuation<? super MultipartKt$parseMultipart$1> continuation) {
        super(2, continuation);
        this.$input = byteReadChannel;
        this.$boundaryPrefixed = byteString;
        this.$maxPartSize = j;
        this.$totalLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new MultipartKt$parseMultipart$1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, continuation);
        multipartKt$parseMultipart$1.L$0 = obj;
        return multipartKt$parseMultipart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super MultipartEvent> producerScope, Continuation<? super Unit> continuation) {
        return ((MultipartKt$parseMultipart$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    public final Object invokeSuspend(Object obj) {
        CountedByteReadChannel counted;
        long totalBytesRead;
        ByteString byteString;
        Object readRemaining;
        ProducerScope producerScope;
        ByteString byteString2;
        Source source;
        CountedByteReadChannel countedByteReadChannel;
        long j;
        ProducerScope producerScope2;
        Object obj2;
        long j2;
        CountedByteReadChannel countedByteReadChannel2;
        ProducerScope producerScope3;
        Object obj3;
        long j3;
        ByteString byteString3;
        ProducerScope producerScope4;
        CompletableDeferred completableDeferred;
        CountedByteReadChannel countedByteReadChannel3;
        ByteChannel byteChannel;
        ByteChannel byteChannel2;
        Object obj4;
        ProducerScope producerScope5;
        CountedByteReadChannel countedByteReadChannel4;
        ByteString byteString4;
        HttpHeadersMap httpHeadersMap;
        ProducerScope producerScope6;
        ByteString byteString5;
        CountedByteReadChannel countedByteReadChannel5;
        long j4;
        Object parsePartBodyImpl;
        ByteString byteString6;
        ByteString byteString7;
        HttpHeadersMap httpHeadersMap2;
        ByteChannel byteChannel3;
        ByteString byteString8;
        Object readRemaining2;
        Object readPacket;
        Source source2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = false;
        HttpHeadersMap httpHeadersMap3 = null;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope7 = (ProducerScope) this.L$0;
                counted = CountedByteReadChannelKt.counted(this.$input);
                totalBytesRead = counted.getTotalBytesRead();
                ByteString byteString9 = this.$boundaryPrefixed;
                byteString = MultipartKt.PrefixString;
                ByteString substring$default = ByteString.substring$default(byteString9, byteString.getSize(), 0, 2, null);
                this.L$0 = producerScope7;
                this.L$1 = counted;
                this.L$2 = substring$default;
                this.J$0 = totalBytesRead;
                this.label = 1;
                readRemaining = ByteReadChannelOperationsKt.readRemaining(ByteWriteChannelOperationsKt.writer$default((CoroutineScope) producerScope7, (CoroutineContext) null, false, (Function2) new MultipartKt$parseMultipart$1$preambleData$1(substring$default, counted, null), 3, (Object) null).getChannel(), this);
                if (readRemaining == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope7;
                byteString2 = substring$default;
                source = (Source) readRemaining;
                if (ByteReadPacketKt.getRemaining(source) > 0) {
                    this.L$0 = producerScope;
                    this.L$1 = counted;
                    this.L$2 = byteString2;
                    this.J$0 = totalBytesRead;
                    this.label = 2;
                    if (producerScope.send(new MultipartEvent.Preamble(source), this) == coroutine_suspended) {
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
                    byteString7 = MultipartKt.PrefixString;
                    this.L$0 = producerScope;
                    this.L$1 = counted;
                    this.L$2 = byteString2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = totalBytesRead;
                    this.label = 3;
                    obj2 = ByteReadChannelOperationsKt.skipIfFound(counted, byteString7, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj2).booleanValue()) {
                        byteString6 = MultipartKt.CrLf;
                        this.L$0 = producerScope;
                        this.L$1 = counted;
                        this.L$2 = byteString2;
                        this.J$0 = totalBytesRead;
                        this.label = 4;
                        if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString6, this) == coroutine_suspended) {
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
                        obj3 = ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel2, byteString2, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long j5 = j2;
                        counted = countedByteReadChannel2;
                        ProducerScope producerScope8 = producerScope3;
                        totalBytesRead = j5;
                        if (((Boolean) obj3).booleanValue()) {
                            producerScope = producerScope8;
                            if (!counted.isClosedForRead()) {
                            }
                        } else {
                            byteChannel = new ByteChannel(z, 1, null);
                            CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                            this.L$0 = producerScope8;
                            this.L$1 = counted;
                            this.L$2 = byteString2;
                            this.L$3 = byteChannel;
                            this.L$4 = CompletableDeferred$default;
                            this.J$0 = totalBytesRead;
                            this.label = 6;
                            if (producerScope8.send(new MultipartEvent.MultipartPart(CompletableDeferred$default, byteChannel), this) == coroutine_suspended) {
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
                                obj4 = MultipartKt.parsePartHeadersImpl(countedByteReadChannel3, this);
                                if (obj4 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                producerScope5 = producerScope4;
                                countedByteReadChannel4 = countedByteReadChannel3;
                                ByteChannel byteChannel4 = byteChannel;
                                byteString4 = byteString3;
                                byteChannel2 = byteChannel4;
                                httpHeadersMap = (HttpHeadersMap) obj4;
                                if (completableDeferred.complete(httpHeadersMap)) {
                                    httpHeadersMap.release();
                                    throw new CancellationException("Multipart processing has been cancelled");
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
                                    parsePartBodyImpl = MultipartKt.parsePartBodyImpl(this.$boundaryPrefixed, countedByteReadChannel4, byteChannel2, httpHeadersMap, this.$maxPartSize, this);
                                    if (parsePartBodyImpl == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    byteChannel3.close();
                                    z = false;
                                    if (!counted.isClosedForRead()) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    httpHeadersMap3 = httpHeadersMap2;
                                    byteChannel2 = byteChannel3;
                                    if (completableDeferred.completeExceptionally(th)) {
                                    }
                                    ByteWriteChannelOperationsKt.close(byteChannel2, th);
                                    throw th;
                                }
                                httpHeadersMap2 = httpHeadersMap;
                                byteChannel3 = byteChannel2;
                                byteString2 = byteString4;
                                producerScope = producerScope5;
                                totalBytesRead = j3;
                                counted = countedByteReadChannel4;
                            } catch (Throwable th2) {
                                th = th2;
                                byteChannel2 = byteChannel;
                                if (completableDeferred.completeExceptionally(th)) {
                                    httpHeadersMap3.release();
                                }
                                ByteWriteChannelOperationsKt.close(byteChannel2, th);
                                throw th;
                            }
                        }
                    }
                }
                producerScope6 = producerScope;
                byteString5 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                countedByteReadChannel5 = counted;
                j4 = totalBytesRead;
                byteString8 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = countedByteReadChannel5;
                this.J$0 = j4;
                this.label = 10;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel5, byteString8, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (this.$totalLength == null) {
                    this.L$0 = producerScope6;
                    this.L$1 = null;
                    this.label = 13;
                    readRemaining2 = ByteReadChannelOperationsKt.readRemaining(countedByteReadChannel5, this);
                    if (readRemaining2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    source2 = (Source) readRemaining2;
                    if (!source2.exhausted()) {
                        this.L$0 = null;
                        this.label = 14;
                        if (producerScope6.send(new MultipartEvent.Epilogue(source2), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                long longValue = this.$totalLength.longValue() - (countedByteReadChannel5.getTotalBytesRead() - j4);
                if (longValue > 2147483647L) {
                    throw new IOException("Failed to parse multipart: prologue is too long");
                }
                if (longValue > 0) {
                    this.L$0 = producerScope6;
                    this.L$1 = null;
                    this.label = 11;
                    readPacket = ByteReadChannelOperationsKt.readPacket(countedByteReadChannel5, (int) longValue, this);
                    if (readPacket == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = null;
                    this.label = 12;
                    if (producerScope6.send(new MultipartEvent.Epilogue((Source) readPacket), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                long j6 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel6 = (CountedByteReadChannel) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                readRemaining = obj;
                counted = countedByteReadChannel6;
                totalBytesRead = j6;
                source = (Source) readRemaining;
                if (ByteReadPacketKt.getRemaining(source) > 0) {
                }
                if (!counted.isClosedForRead()) {
                }
                producerScope6 = producerScope;
                byteString5 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                }
                break;
            case 2:
                j = this.J$0;
                byteString2 = (ByteString) this.L$2;
                countedByteReadChannel = (CountedByteReadChannel) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope2;
                totalBytesRead = j;
                counted = countedByteReadChannel;
                if (!counted.isClosedForRead()) {
                }
                producerScope6 = producerScope;
                byteString5 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                }
                break;
            case 3:
                long j7 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel7 = (CountedByteReadChannel) this.L$1;
                ProducerScope producerScope9 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope9;
                totalBytesRead = j7;
                counted = countedByteReadChannel7;
                obj2 = obj;
                if (!((Boolean) obj2).booleanValue()) {
                }
                producerScope6 = producerScope;
                byteString5 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = counted;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = totalBytesRead;
                this.label = 9;
                if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                }
                break;
            case 4:
                j2 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                countedByteReadChannel2 = (CountedByteReadChannel) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = producerScope3;
                this.L$1 = countedByteReadChannel2;
                this.L$2 = byteString2;
                this.J$0 = j2;
                this.label = 5;
                obj3 = ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel2, byteString2, this);
                if (obj3 == coroutine_suspended) {
                }
                long j52 = j2;
                counted = countedByteReadChannel2;
                ProducerScope producerScope82 = producerScope3;
                totalBytesRead = j52;
                if (((Boolean) obj3).booleanValue()) {
                }
                break;
            case 5:
                j2 = this.J$0;
                byteString2 = (ByteString) this.L$2;
                countedByteReadChannel2 = (CountedByteReadChannel) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                long j522 = j2;
                counted = countedByteReadChannel2;
                ProducerScope producerScope822 = producerScope3;
                totalBytesRead = j522;
                if (((Boolean) obj3).booleanValue()) {
                }
                break;
            case 6:
                j3 = this.J$0;
                CompletableDeferred completableDeferred2 = (CompletableDeferred) this.L$4;
                ByteChannel byteChannel5 = (ByteChannel) this.L$3;
                byteString3 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel8 = (CountedByteReadChannel) this.L$1;
                producerScope4 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
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
                obj4 = MultipartKt.parsePartHeadersImpl(countedByteReadChannel3, this);
                if (obj4 != coroutine_suspended) {
                }
                break;
            case 7:
                j3 = this.J$0;
                completableDeferred = (CompletableDeferred) this.L$4;
                byteChannel2 = (ByteChannel) this.L$3;
                ByteString byteString10 = (ByteString) this.L$2;
                CountedByteReadChannel countedByteReadChannel9 = (CountedByteReadChannel) this.L$1;
                ProducerScope producerScope10 = (ProducerScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    producerScope5 = producerScope10;
                    countedByteReadChannel4 = countedByteReadChannel9;
                    byteString4 = byteString10;
                    httpHeadersMap = (HttpHeadersMap) obj4;
                    if (completableDeferred.complete(httpHeadersMap)) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (completableDeferred.completeExceptionally(th)) {
                    }
                    ByteWriteChannelOperationsKt.close(byteChannel2, th);
                    throw th;
                }
                break;
            case 8:
                j3 = this.J$0;
                httpHeadersMap = (HttpHeadersMap) this.L$5;
                completableDeferred = (CompletableDeferred) this.L$4;
                byteChannel2 = (ByteChannel) this.L$3;
                byteString4 = (ByteString) this.L$2;
                countedByteReadChannel4 = (CountedByteReadChannel) this.L$1;
                producerScope5 = (ProducerScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
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
                    byteString5 = MultipartKt.CrLf;
                    this.L$0 = producerScope6;
                    this.L$1 = counted;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = totalBytesRead;
                    this.label = 9;
                    if (ByteReadChannelOperationsKt.skipIfFound(counted, byteString5, this) == coroutine_suspended) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    httpHeadersMap3 = httpHeadersMap;
                    if (completableDeferred.completeExceptionally(th) && httpHeadersMap3 != null) {
                        httpHeadersMap3.release();
                    }
                    ByteWriteChannelOperationsKt.close(byteChannel2, th);
                    throw th;
                }
                break;
            case 9:
                j4 = this.J$0;
                countedByteReadChannel5 = (CountedByteReadChannel) this.L$1;
                producerScope6 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                byteString8 = MultipartKt.CrLf;
                this.L$0 = producerScope6;
                this.L$1 = countedByteReadChannel5;
                this.J$0 = j4;
                this.label = 10;
                if (ByteReadChannelOperationsKt.skipIfFound(countedByteReadChannel5, byteString8, this) == coroutine_suspended) {
                }
                if (this.$totalLength == null) {
                }
                break;
            case 10:
                j4 = this.J$0;
                countedByteReadChannel5 = (CountedByteReadChannel) this.L$1;
                producerScope6 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (this.$totalLength == null) {
                }
                break;
            case 11:
                ProducerScope producerScope11 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope6 = producerScope11;
                readPacket = obj;
                this.L$0 = null;
                this.label = 12;
                if (producerScope6.send(new MultipartEvent.Epilogue((Source) readPacket), this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 12:
            case 14:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 13:
                ProducerScope producerScope12 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope6 = producerScope12;
                readRemaining2 = obj;
                source2 = (Source) readRemaining2;
                if (!source2.exhausted()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
