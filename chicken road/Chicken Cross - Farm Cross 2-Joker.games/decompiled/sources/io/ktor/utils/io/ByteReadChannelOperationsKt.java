package io.ktor.utils.io;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.charsets.TooLongLineException;
import io.ktor.utils.io.core.BuffersKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.InputKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.io.Buffer;
import kotlinx.io.ByteStringsKt;
import kotlinx.io.Segment;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;
import kotlinx.io.Utf8Kt;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001f\u0010\u001c\u001a$\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010!\u001a\u001c\u0010#\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b#\u0010\u0015\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0000H\u0086@¢\u0006\u0004\b%\u0010\u0003\u001a\u001c\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010&\u001a0\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\nH\u0086@¢\u0006\u0004\b*\u0010+\u001a-\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010,\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b*\u0010/\u001aN\u0010:\u001a\u000209*\u0002002\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020\u00012'\u0010.\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0002\b8¢\u0006\u0004\b:\u0010;\u001aJ\u0010:\u001a\u000209*\u0002002\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020<2'\u0010.\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0002\b8¢\u0006\u0004\b:\u0010=\u001a\u001c\u0010?\u001a\u00020$*\u00020\u00002\u0006\u0010>\u001a\u00020\nH\u0086@¢\u0006\u0004\b?\u0010\u0015\u001a\u001c\u0010A\u001a\u00020\u0013*\u00020\u00002\u0006\u0010@\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bA\u0010&\u001a\u001e\u0010B\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bB\u0010&\u001a*\u0010F\u001a\u00020\u0001*\u00020\u00002\n\u0010E\u001a\u00060Cj\u0002`D2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\bF\u0010G\u001a4\u0010F\u001a\u00020\u0001*\u00020\u00002\n\u0010E\u001a\u00060Cj\u0002`D2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010I\u001a\u00020HH\u0087@¢\u0006\u0004\bJ\u0010K\u001aF\u0010M\u001a\u00020\n*\u00020\u000020\b\u0004\u0010.\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06\u0012\u0006\u0012\u0004\u0018\u0001070LH\u0086H¢\u0006\u0004\bM\u0010N\u001a0\u0010Q\u001a\u00020\u0013*\u00020\u00002\u0006\u0010E\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\nH\u0086@¢\u0006\u0004\bQ\u0010+\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bR\u0010S\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020\u0019H\u0007¢\u0006\u0004\bR\u0010T\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020<H\u0007¢\u0006\u0004\bR\u0010U\u001a8\u0010Z\u001a\u00020\u000e*\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010Y\u001a\u00020\u0001H\u0086@¢\u0006\u0004\bZ\u0010[\u001a\u001c\u0010]\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\\\u001a\u00020VH\u0086@¢\u0006\u0004\b]\u0010^\u001a\u001e\u0010_\u001a\u0004\u0018\u00010V*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b_\u0010\u0015\"\u001b\u0010c\u001a\u00020\n*\u00020\u00198F¢\u0006\f\u0012\u0004\bb\u0010T\u001a\u0004\b`\u0010a\"\u0014\u0010d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010e\"\u001b\u0010j\u001a\u00020\n*\u00020\u00008F¢\u0006\f\u0012\u0004\bi\u0010S\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "exhausted", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toByteArray", "", "readByte", "", "readShort", "", "readInt", "", "readFloat", "", "readLong", "", "readDouble", "numberOfBytes", "", "awaitUntilReadable", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/Buffer;", "readBuffer", "max", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "copyAndClose", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "readUTF8Line", "copyTo", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "readByteArray", "Lkotlinx/io/Source;", "readRemaining", "(Lio/ktor/utils/io/ByteReadChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buffer", "offset", "length", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;[BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/jvm/functions/Function1;)I", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/ReaderScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lio/ktor/utils/io/ReaderJob;", "reader", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ByteChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "packet", "readPacket", "value", "discardExact", "discard", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "readUTF8LineTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/LineEndingMode;", "lineEnding", "readUTF8LineTo-RRvyBJ8", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "read", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "readFully", "rethrowCloseCauseIfNeeded", "(Lio/ktor/utils/io/ByteReadChannel;)V", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "(Lio/ktor/utils/io/ByteChannel;)V", "Lkotlinx/io/bytestring/ByteString;", "matchString", "writeChannel", "ignoreMissing", "readUntil", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "byteString", "skipIfFound", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peek", "getAvailableForWrite", "(Lio/ktor/utils/io/ByteWriteChannel;)I", "getAvailableForWrite$annotations", "availableForWrite", "CR", "B", "LF", "getAvailableForRead", "(Lio/ktor/utils/io/ByteReadChannel;)I", "getAvailableForRead$annotations", "availableForRead", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteReadChannelOperationsKt {
    private static final byte CR = 13;
    private static final byte LF = 10;

    public static /* synthetic */ void getAvailableForRead$annotations(ByteReadChannel byteReadChannel) {
    }

    public static /* synthetic */ void getAvailableForWrite$annotations(ByteWriteChannel byteWriteChannel) {
    }

    public static final int getAvailableForWrite(ByteWriteChannel byteWriteChannel) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        return 1048576 - BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object exhausted(ByteReadChannel byteReadChannel, Continuation<? super Boolean> continuation) {
        ByteReadChannelOperationsKt$exhausted$1 byteReadChannelOperationsKt$exhausted$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$exhausted$1) {
            byteReadChannelOperationsKt$exhausted$1 = (ByteReadChannelOperationsKt$exhausted$1) continuation;
            if ((byteReadChannelOperationsKt$exhausted$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$exhausted$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$exhausted$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$exhausted$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperationsKt$exhausted$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$exhausted$1.label = 1;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$exhausted$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$exhausted$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(byteReadChannel.getReadBuffer().exhausted());
            }
        }
        byteReadChannelOperationsKt$exhausted$1 = new ByteReadChannelOperationsKt$exhausted$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$exhausted$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$exhausted$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(byteReadChannel.getReadBuffer().exhausted());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toByteArray(ByteReadChannel byteReadChannel, Continuation<? super byte[]> continuation) {
        ByteReadChannelOperationsKt$toByteArray$1 byteReadChannelOperationsKt$toByteArray$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$toByteArray$1) {
            byteReadChannelOperationsKt$toByteArray$1 = (ByteReadChannelOperationsKt$toByteArray$1) continuation;
            if ((byteReadChannelOperationsKt$toByteArray$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$toByteArray$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$toByteArray$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$toByteArray$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$toByteArray$1.label = 1;
                    obj = readBuffer(byteReadChannel, byteReadChannelOperationsKt$toByteArray$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return BuffersKt.readBytes$default((Buffer) obj, 0, 1, null);
            }
        }
        byteReadChannelOperationsKt$toByteArray$1 = new ByteReadChannelOperationsKt$toByteArray$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$toByteArray$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$toByteArray$1.label;
        if (i != 0) {
        }
        return BuffersKt.readBytes$default((Buffer) obj2, 0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readByte(ByteReadChannel byteReadChannel, Continuation<? super Byte> continuation) {
        ByteReadChannelOperationsKt$readByte$1 byteReadChannelOperationsKt$readByte$1;
        Object obj;
        int i;
        Source readBuffer;
        Source source;
        if (continuation instanceof ByteReadChannelOperationsKt$readByte$1) {
            byteReadChannelOperationsKt$readByte$1 = (ByteReadChannelOperationsKt$readByte$1) continuation;
            if ((byteReadChannelOperationsKt$readByte$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readByte$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$readByte$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readByte$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    readBuffer = byteReadChannel.getReadBuffer();
                    if (readBuffer.exhausted()) {
                        byteReadChannelOperationsKt$readByte$1.L$0 = readBuffer;
                        byteReadChannelOperationsKt$readByte$1.label = 1;
                        Object awaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readByte$1, 1, null);
                        if (awaitContent$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = awaitContent$default;
                        source = readBuffer;
                    }
                    return Boxing.boxByte(readBuffer.readByte());
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                source = (Source) byteReadChannelOperationsKt$readByte$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    throw new EOFException("Not enough data available");
                }
                readBuffer = source;
                return Boxing.boxByte(readBuffer.readByte());
            }
        }
        byteReadChannelOperationsKt$readByte$1 = new ByteReadChannelOperationsKt$readByte$1(continuation);
        obj = byteReadChannelOperationsKt$readByte$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readByte$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readShort(ByteReadChannel byteReadChannel, Continuation<? super Short> continuation) {
        ByteReadChannelOperationsKt$readShort$1 byteReadChannelOperationsKt$readShort$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$readShort$1) {
            byteReadChannelOperationsKt$readShort$1 = (ByteReadChannelOperationsKt$readShort$1) continuation;
            if ((byteReadChannelOperationsKt$readShort$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readShort$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readShort$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readShort$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readShort$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readShort$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 2, byteReadChannelOperationsKt$readShort$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$readShort$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxShort(byteReadChannel.getReadBuffer().readShort());
            }
        }
        byteReadChannelOperationsKt$readShort$1 = new ByteReadChannelOperationsKt$readShort$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readShort$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readShort$1.label;
        if (i != 0) {
        }
        return Boxing.boxShort(byteReadChannel.getReadBuffer().readShort());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readInt(ByteReadChannel byteReadChannel, Continuation<? super Integer> continuation) {
        ByteReadChannelOperationsKt$readInt$1 byteReadChannelOperationsKt$readInt$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$readInt$1) {
            byteReadChannelOperationsKt$readInt$1 = (ByteReadChannelOperationsKt$readInt$1) continuation;
            if ((byteReadChannelOperationsKt$readInt$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readInt$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readInt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readInt$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readInt$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readInt$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 4, byteReadChannelOperationsKt$readInt$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$readInt$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxInt(byteReadChannel.getReadBuffer().readInt());
            }
        }
        byteReadChannelOperationsKt$readInt$1 = new ByteReadChannelOperationsKt$readInt$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readInt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readInt$1.label;
        if (i != 0) {
        }
        return Boxing.boxInt(byteReadChannel.getReadBuffer().readInt());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFloat(ByteReadChannel byteReadChannel, Continuation<? super Float> continuation) {
        ByteReadChannelOperationsKt$readFloat$1 byteReadChannelOperationsKt$readFloat$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$readFloat$1) {
            byteReadChannelOperationsKt$readFloat$1 = (ByteReadChannelOperationsKt$readFloat$1) continuation;
            if ((byteReadChannelOperationsKt$readFloat$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readFloat$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readFloat$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readFloat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readFloat$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readFloat$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 4, byteReadChannelOperationsKt$readFloat$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$readFloat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxFloat(SourcesKt.readFloat(byteReadChannel.getReadBuffer()));
            }
        }
        byteReadChannelOperationsKt$readFloat$1 = new ByteReadChannelOperationsKt$readFloat$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readFloat$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readFloat$1.label;
        if (i != 0) {
        }
        return Boxing.boxFloat(SourcesKt.readFloat(byteReadChannel.getReadBuffer()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readLong(ByteReadChannel byteReadChannel, Continuation<? super Long> continuation) {
        ByteReadChannelOperationsKt$readLong$1 byteReadChannelOperationsKt$readLong$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$readLong$1) {
            byteReadChannelOperationsKt$readLong$1 = (ByteReadChannelOperationsKt$readLong$1) continuation;
            if ((byteReadChannelOperationsKt$readLong$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readLong$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readLong$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readLong$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readLong$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readLong$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 8, byteReadChannelOperationsKt$readLong$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$readLong$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxLong(byteReadChannel.getReadBuffer().readLong());
            }
        }
        byteReadChannelOperationsKt$readLong$1 = new ByteReadChannelOperationsKt$readLong$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readLong$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readLong$1.label;
        if (i != 0) {
        }
        return Boxing.boxLong(byteReadChannel.getReadBuffer().readLong());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readDouble(ByteReadChannel byteReadChannel, Continuation<? super Double> continuation) {
        ByteReadChannelOperationsKt$readDouble$1 byteReadChannelOperationsKt$readDouble$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$readDouble$1) {
            byteReadChannelOperationsKt$readDouble$1 = (ByteReadChannelOperationsKt$readDouble$1) continuation;
            if ((byteReadChannelOperationsKt$readDouble$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readDouble$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readDouble$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readDouble$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readDouble$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readDouble$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 8, byteReadChannelOperationsKt$readDouble$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$readDouble$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxDouble(SourcesKt.readDouble(byteReadChannel.getReadBuffer()));
            }
        }
        byteReadChannelOperationsKt$readDouble$1 = new ByteReadChannelOperationsKt$readDouble$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readDouble$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readDouble$1.label;
        if (i != 0) {
        }
        return Boxing.boxDouble(SourcesKt.readDouble(byteReadChannel.getReadBuffer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitUntilReadable(ByteReadChannel byteReadChannel, int i, Continuation<? super Unit> continuation) {
        ByteReadChannelOperationsKt$awaitUntilReadable$1 byteReadChannelOperationsKt$awaitUntilReadable$1;
        Object obj;
        int i2;
        if (continuation instanceof ByteReadChannelOperationsKt$awaitUntilReadable$1) {
            byteReadChannelOperationsKt$awaitUntilReadable$1 = (ByteReadChannelOperationsKt$awaitUntilReadable$1) continuation;
            if ((byteReadChannelOperationsKt$awaitUntilReadable$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$awaitUntilReadable$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$awaitUntilReadable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$awaitUntilReadable$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$awaitUntilReadable$1.label = 1;
                    obj = byteReadChannel.awaitContent(i, byteReadChannelOperationsKt$awaitUntilReadable$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new EOFException("Not enough data available");
                }
                return Unit.INSTANCE;
            }
        }
        byteReadChannelOperationsKt$awaitUntilReadable$1 = new ByteReadChannelOperationsKt$awaitUntilReadable$1(continuation);
        obj = byteReadChannelOperationsKt$awaitUntilReadable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$awaitUntilReadable$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBuffer(ByteReadChannel byteReadChannel, Continuation<? super Buffer> continuation) {
        ByteReadChannelOperationsKt$readBuffer$1 byteReadChannelOperationsKt$readBuffer$1;
        int i;
        Buffer buffer;
        Throwable closedCause;
        if (continuation instanceof ByteReadChannelOperationsKt$readBuffer$1) {
            byteReadChannelOperationsKt$readBuffer$1 = (ByteReadChannelOperationsKt$readBuffer$1) continuation;
            if ((byteReadChannelOperationsKt$readBuffer$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readBuffer$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readBuffer$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readBuffer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    buffer = new Buffer();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Buffer buffer2 = (Buffer) byteReadChannelOperationsKt$readBuffer$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readBuffer$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    buffer = buffer2;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    buffer.transferFrom(byteReadChannel.getReadBuffer());
                    byteReadChannelOperationsKt$readBuffer$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readBuffer$1.L$1 = buffer;
                    byteReadChannelOperationsKt$readBuffer$1.label = 1;
                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readBuffer$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                closedCause = byteReadChannel.getClosedCause();
                if (closedCause != null) {
                    return buffer;
                }
                throw closedCause;
            }
        }
        byteReadChannelOperationsKt$readBuffer$1 = new ByteReadChannelOperationsKt$readBuffer$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readBuffer$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readBuffer$1.label;
        if (i != 0) {
        }
        while (!byteReadChannel.isClosedForRead()) {
        }
        closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0054 -> B:11:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:10:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBuffer(ByteReadChannel byteReadChannel, int i, Continuation<? super Buffer> continuation) {
        ByteReadChannelOperationsKt$readBuffer$3 byteReadChannelOperationsKt$readBuffer$3;
        int i2;
        Buffer buffer;
        if (continuation instanceof ByteReadChannelOperationsKt$readBuffer$3) {
            byteReadChannelOperationsKt$readBuffer$3 = (ByteReadChannelOperationsKt$readBuffer$3) continuation;
            if ((byteReadChannelOperationsKt$readBuffer$3.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readBuffer$3.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readBuffer$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readBuffer$3.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    buffer = new Buffer();
                    if (i > 0) {
                    }
                    return buffer;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = byteReadChannelOperationsKt$readBuffer$3.I$0;
                Buffer buffer2 = (Buffer) byteReadChannelOperationsKt$readBuffer$3.L$1;
                ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readBuffer$3.L$0;
                ResultKt.throwOnFailure(obj);
                buffer = buffer2;
                i = i3;
                byteReadChannel = byteReadChannel2;
                long min = Math.min(i, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                byteReadChannel.getReadBuffer().readTo(buffer, min);
                i -= (int) min;
                if (i > 0 || byteReadChannel.isClosedForRead()) {
                    return buffer;
                }
                if (byteReadChannel.getReadBuffer().exhausted()) {
                    byteReadChannelOperationsKt$readBuffer$3.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readBuffer$3.L$1 = buffer;
                    byteReadChannelOperationsKt$readBuffer$3.I$0 = i;
                    byteReadChannelOperationsKt$readBuffer$3.label = 1;
                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readBuffer$3, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteReadChannel2 = byteReadChannel;
                    i3 = i;
                    buffer2 = buffer;
                    buffer = buffer2;
                    i = i3;
                    byteReadChannel = byteReadChannel2;
                }
                long min2 = Math.min(i, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                byteReadChannel.getReadBuffer().readTo(buffer, min2);
                i -= (int) min2;
                if (i > 0) {
                }
                return buffer;
            }
        }
        byteReadChannelOperationsKt$readBuffer$3 = new ByteReadChannelOperationsKt$readBuffer$3(continuation);
        Object obj2 = byteReadChannelOperationsKt$readBuffer$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$readBuffer$3.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #1 {all -> 0x00c7, blocks: (B:25:0x0074, B:27:0x007a, B:35:0x00ab, B:41:0x00c6), top: B:24:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[Catch: all -> 0x00c7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c7, blocks: (B:25:0x0074, B:27:0x007a, B:35:0x00ab, B:41:0x00c6), top: B:24:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:23:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyAndClose(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, Continuation<? super Long> continuation) {
        ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$1;
        ?? r3;
        ByteReadChannel byteReadChannel2;
        long j;
        ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$12;
        ByteReadChannel byteReadChannel3;
        long j2;
        ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof ByteReadChannelOperationsKt$copyAndClose$1) {
                byteReadChannelOperationsKt$copyAndClose$1 = (ByteReadChannelOperationsKt$copyAndClose$1) continuation;
                if ((byteReadChannelOperationsKt$copyAndClose$1.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyAndClose$1.label -= Integer.MIN_VALUE;
                    Object obj = byteReadChannelOperationsKt$copyAndClose$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyAndClose$1.label;
                    if (r3 != 0) {
                        ResultKt.throwOnFailure(obj);
                        j = 0;
                        r3 = byteWriteChannel;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else if (r3 == 1) {
                        j = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                        ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) byteReadChannelOperationsKt$copyAndClose$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        byteReadChannelOperationsKt$copyAndClose$1.L$0 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$1.L$1 = r3;
                        byteReadChannelOperationsKt$copyAndClose$1.J$0 = j;
                        byteReadChannelOperationsKt$copyAndClose$1.label = 2;
                        byteWriteChannel2 = r3;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyAndClose$1, 1, null) == coroutine_suspended) {
                        }
                        ByteReadChannel byteReadChannel4 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel4;
                        r3 = byteWriteChannel2;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j2 = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                                ResultKt.throwOnFailure(obj);
                                return Boxing.boxLong(j2);
                            }
                            if (r3 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                        ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) byteReadChannelOperationsKt$copyAndClose$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel4;
                        ByteReadChannel byteReadChannel42 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel42;
                        r3 = byteWriteChannel2;
                        try {
                            if (byteReadChannel3.isClosedForRead()) {
                                j += byteReadChannel3.getReadBuffer().transferTo(r3.getWriteBuffer());
                                byteReadChannelOperationsKt$copyAndClose$12.L$0 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyAndClose$12.L$1 = r3;
                                byteReadChannelOperationsKt$copyAndClose$12.J$0 = j;
                                byteReadChannelOperationsKt$copyAndClose$12.label = 1;
                                if (r3.flush(byteReadChannelOperationsKt$copyAndClose$12) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$13 = byteReadChannelOperationsKt$copyAndClose$12;
                                byteReadChannel2 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyAndClose$1 = byteReadChannelOperationsKt$copyAndClose$13;
                                r3 = r3;
                                byteReadChannelOperationsKt$copyAndClose$1.L$0 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyAndClose$1.L$1 = r3;
                                byteReadChannelOperationsKt$copyAndClose$1.J$0 = j;
                                byteReadChannelOperationsKt$copyAndClose$1.label = 2;
                                byteWriteChannel2 = r3;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyAndClose$1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ByteReadChannel byteReadChannel422 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                                byteReadChannel3 = byteReadChannel422;
                                r3 = byteWriteChannel2;
                                if (byteReadChannel3.isClosedForRead()) {
                                    Throwable closedCause = byteReadChannel3.getClosedCause();
                                    if (closedCause != null) {
                                        throw closedCause;
                                    }
                                    byteReadChannelOperationsKt$copyAndClose$12.L$0 = null;
                                    byteReadChannelOperationsKt$copyAndClose$12.L$1 = null;
                                    byteReadChannelOperationsKt$copyAndClose$12.J$0 = j;
                                    byteReadChannelOperationsKt$copyAndClose$12.label = 3;
                                    if (r3.flushAndClose(byteReadChannelOperationsKt$copyAndClose$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j2 = j;
                                    return Boxing.boxLong(j2);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$14 = byteReadChannelOperationsKt$copyAndClose$12;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyAndClose$1 = byteReadChannelOperationsKt$copyAndClose$14;
                            try {
                                byteReadChannel2.cancel(th);
                                ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (Throwable th3) {
                                byteReadChannelOperationsKt$copyAndClose$1.L$0 = th3;
                                byteReadChannelOperationsKt$copyAndClose$1.L$1 = null;
                                byteReadChannelOperationsKt$copyAndClose$1.label = 4;
                                if (r3.flushAndClose(byteReadChannelOperationsKt$copyAndClose$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (r3 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyAndClose$1 = new ByteReadChannelOperationsKt$copyAndClose$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$copyAndClose$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = byteReadChannelOperationsKt$copyAndClose$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readUTF8Line(ByteReadChannel byteReadChannel, int i, Continuation<? super String> continuation) {
        ByteReadChannelOperationsKt$readUTF8Line$1 byteReadChannelOperationsKt$readUTF8Line$1;
        Object obj;
        int i2;
        StringBuilder sb;
        if (continuation instanceof ByteReadChannelOperationsKt$readUTF8Line$1) {
            byteReadChannelOperationsKt$readUTF8Line$1 = (ByteReadChannelOperationsKt$readUTF8Line$1) continuation;
            if ((byteReadChannelOperationsKt$readUTF8Line$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUTF8Line$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$readUTF8Line$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readUTF8Line$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    StringBuilder sb2 = new StringBuilder();
                    byteReadChannelOperationsKt$readUTF8Line$1.L$0 = sb2;
                    byteReadChannelOperationsKt$readUTF8Line$1.label = 1;
                    Object readUTF8LineTo = readUTF8LineTo(byteReadChannel, sb2, i, byteReadChannelOperationsKt$readUTF8Line$1);
                    if (readUTF8LineTo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = readUTF8LineTo;
                    sb = sb2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sb = (StringBuilder) byteReadChannelOperationsKt$readUTF8Line$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return sb.toString();
            }
        }
        byteReadChannelOperationsKt$readUTF8Line$1 = new ByteReadChannelOperationsKt$readUTF8Line$1(continuation);
        obj = byteReadChannelOperationsKt$readUTF8Line$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$readUTF8Line$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public static /* synthetic */ Object readUTF8Line$default(ByteReadChannel byteReadChannel, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8Line(byteReadChannel, i, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x0077, B:27:0x007d), top: B:24:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ac -> B:23:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, Continuation<? super Long> continuation) {
        ByteReadChannelOperationsKt$copyTo$1 byteReadChannelOperationsKt$copyTo$1;
        ?? r3;
        ByteReadChannel byteReadChannel2;
        long j;
        ByteReadChannelOperationsKt$copyTo$1 byteReadChannelOperationsKt$copyTo$12;
        ByteReadChannel byteReadChannel3;
        long j2;
        long j3;
        ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof ByteReadChannelOperationsKt$copyTo$1) {
                byteReadChannelOperationsKt$copyTo$1 = (ByteReadChannelOperationsKt$copyTo$1) continuation;
                if ((byteReadChannelOperationsKt$copyTo$1.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyTo$1.label -= Integer.MIN_VALUE;
                    Object obj = byteReadChannelOperationsKt$copyTo$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyTo$1.label;
                    if (r3 != 0) {
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel;
                        j = 0;
                        byteReadChannelOperationsKt$copyTo$12 = byteReadChannelOperationsKt$copyTo$1;
                        byteReadChannel3 = byteReadChannel;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else if (r3 == 1) {
                        j2 = byteReadChannelOperationsKt$copyTo$1.J$0;
                        ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) byteReadChannelOperationsKt$copyTo$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        byteReadChannelOperationsKt$copyTo$1.L$0 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyTo$1.L$1 = r3;
                        byteReadChannelOperationsKt$copyTo$1.J$0 = j2;
                        byteReadChannelOperationsKt$copyTo$1.label = 2;
                        byteWriteChannel2 = r3;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyTo$1, 1, null) == coroutine_suspended) {
                        }
                        long j4 = j2;
                        byteReadChannelOperationsKt$copyTo$12 = byteReadChannelOperationsKt$copyTo$1;
                        byteReadChannel3 = byteReadChannel2;
                        j = j4;
                        r3 = byteWriteChannel2;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j3 = byteReadChannelOperationsKt$copyTo$1.J$0;
                                ResultKt.throwOnFailure(obj);
                                return Boxing.boxLong(j3);
                            }
                            if (r3 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) byteReadChannelOperationsKt$copyTo$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j2 = byteReadChannelOperationsKt$copyTo$1.J$0;
                        ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) byteReadChannelOperationsKt$copyTo$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel4;
                        long j42 = j2;
                        byteReadChannelOperationsKt$copyTo$12 = byteReadChannelOperationsKt$copyTo$1;
                        byteReadChannel3 = byteReadChannel2;
                        j = j42;
                        r3 = byteWriteChannel2;
                        try {
                            if (byteReadChannel3.isClosedForRead()) {
                                long transferTo = j + byteReadChannel3.getReadBuffer().transferTo(r3.getWriteBuffer());
                                byteReadChannelOperationsKt$copyTo$12.L$0 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyTo$12.L$1 = r3;
                                byteReadChannelOperationsKt$copyTo$12.J$0 = transferTo;
                                byteReadChannelOperationsKt$copyTo$12.label = 1;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$12) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel2 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyTo$1 = byteReadChannelOperationsKt$copyTo$12;
                                j2 = transferTo;
                                r3 = r3;
                                byteReadChannelOperationsKt$copyTo$1.L$0 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyTo$1.L$1 = r3;
                                byteReadChannelOperationsKt$copyTo$1.J$0 = j2;
                                byteReadChannelOperationsKt$copyTo$1.label = 2;
                                byteWriteChannel2 = r3;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyTo$1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                long j422 = j2;
                                byteReadChannelOperationsKt$copyTo$12 = byteReadChannelOperationsKt$copyTo$1;
                                byteReadChannel3 = byteReadChannel2;
                                j = j422;
                                r3 = byteWriteChannel2;
                                if (byteReadChannel3.isClosedForRead()) {
                                    byteReadChannelOperationsKt$copyTo$12.L$0 = null;
                                    byteReadChannelOperationsKt$copyTo$12.L$1 = null;
                                    byteReadChannelOperationsKt$copyTo$12.J$0 = j;
                                    byteReadChannelOperationsKt$copyTo$12.label = 3;
                                    if (r3.flush(byteReadChannelOperationsKt$copyTo$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j3 = j;
                                    return Boxing.boxLong(j3);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyTo$1 = byteReadChannelOperationsKt$copyTo$12;
                            try {
                                byteReadChannel2.cancel(th);
                                ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (Throwable th3) {
                                byteReadChannelOperationsKt$copyTo$1.L$0 = th3;
                                byteReadChannelOperationsKt$copyTo$1.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$1.label = 4;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (r3 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyTo$1 = new ByteReadChannelOperationsKt$copyTo$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$copyTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = byteReadChannelOperationsKt$copyTo$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d7 -> B:23:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, Continuation<? super Long> continuation) {
        ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$2;
        ?? r3;
        ByteReadChannel byteReadChannel2;
        long j2;
        long j3;
        ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$22;
        ByteReadChannel byteReadChannel3;
        Object flush;
        long j4;
        long j5;
        ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof ByteReadChannelOperationsKt$copyTo$2) {
                byteReadChannelOperationsKt$copyTo$2 = (ByteReadChannelOperationsKt$copyTo$2) continuation;
                if ((byteReadChannelOperationsKt$copyTo$2.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyTo$2.label -= Integer.MIN_VALUE;
                    Object obj = byteReadChannelOperationsKt$copyTo$2.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyTo$2.label;
                    int i = 1;
                    if (r3 != 0) {
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel;
                        j2 = j;
                        j3 = j2;
                        byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                        byteReadChannel3 = byteReadChannel;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                        byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                        byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                        byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                        byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                        byteReadChannelOperationsKt$copyTo$22.label = 3;
                        if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                        }
                    } else if (r3 == 1) {
                        j2 = byteReadChannelOperationsKt$copyTo$2.J$1;
                        j3 = byteReadChannelOperationsKt$copyTo$2.J$0;
                        ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) byteReadChannelOperationsKt$copyTo$2.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyTo$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        long min = Math.min(j2, ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                        byteReadChannel2.getReadBuffer().readTo(r3.getWriteBuffer(), min);
                        j2 -= min;
                        byteReadChannelOperationsKt$copyTo$2.L$0 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyTo$2.L$1 = r3;
                        byteReadChannelOperationsKt$copyTo$2.J$0 = j3;
                        byteReadChannelOperationsKt$copyTo$2.J$1 = j2;
                        byteReadChannelOperationsKt$copyTo$2.label = 2;
                        flush = r3.flush(byteReadChannelOperationsKt$copyTo$2);
                        byteWriteChannel2 = r3;
                        if (flush == coroutine_suspended) {
                        }
                        ByteReadChannel byteReadChannel4 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                        byteReadChannel3 = byteReadChannel4;
                        i = 1;
                        r3 = byteWriteChannel2;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                        byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                        byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                        byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                        byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                        byteReadChannelOperationsKt$copyTo$22.label = 3;
                        if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j4 = byteReadChannelOperationsKt$copyTo$2.J$1;
                                j5 = byteReadChannelOperationsKt$copyTo$2.J$0;
                                ResultKt.throwOnFailure(obj);
                                return Boxing.boxLong(j5 - j4);
                            }
                            if (r3 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) byteReadChannelOperationsKt$copyTo$2.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j2 = byteReadChannelOperationsKt$copyTo$2.J$1;
                        j3 = byteReadChannelOperationsKt$copyTo$2.J$0;
                        ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) byteReadChannelOperationsKt$copyTo$2.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyTo$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel4;
                        try {
                            ByteReadChannel byteReadChannel42 = byteReadChannel2;
                            byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                            byteReadChannel3 = byteReadChannel42;
                            if (byteReadChannel3.isClosedForRead() && j2 > 0) {
                                if (byteReadChannel3.getReadBuffer().exhausted()) {
                                    byteReadChannelOperationsKt$copyTo$22.L$0 = byteReadChannel3;
                                    byteReadChannelOperationsKt$copyTo$22.L$1 = r3;
                                    byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                                    byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                                    byteReadChannelOperationsKt$copyTo$22.label = i;
                                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$copyTo$22, i, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$23 = byteReadChannelOperationsKt$copyTo$22;
                                byteReadChannel2 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$23;
                                r3 = r3;
                                long min2 = Math.min(j2, ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                                byteReadChannel2.getReadBuffer().readTo(r3.getWriteBuffer(), min2);
                                j2 -= min2;
                                byteReadChannelOperationsKt$copyTo$2.L$0 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyTo$2.L$1 = r3;
                                byteReadChannelOperationsKt$copyTo$2.J$0 = j3;
                                byteReadChannelOperationsKt$copyTo$2.J$1 = j2;
                                byteReadChannelOperationsKt$copyTo$2.label = 2;
                                flush = r3.flush(byteReadChannelOperationsKt$copyTo$2);
                                byteWriteChannel2 = r3;
                                if (flush == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ByteReadChannel byteReadChannel422 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                                byteReadChannel3 = byteReadChannel422;
                                i = 1;
                                r3 = byteWriteChannel2;
                                if (byteReadChannel3.isClosedForRead()) {
                                }
                                byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                                byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                                byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                                byteReadChannelOperationsKt$copyTo$22.label = 3;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                                }
                            } else {
                                byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                                byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                                byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                                byteReadChannelOperationsKt$copyTo$22.label = 3;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                j4 = j2;
                                j5 = j3;
                                return Boxing.boxLong(j5 - j4);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$24 = byteReadChannelOperationsKt$copyTo$22;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$24;
                            try {
                                byteReadChannel2.cancel(th);
                                ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (Throwable th3) {
                                byteReadChannelOperationsKt$copyTo$2.L$0 = th3;
                                byteReadChannelOperationsKt$copyTo$2.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$2.label = 4;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$2) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th3;
                            }
                        }
                        i = 1;
                        r3 = byteWriteChannel2;
                    }
                }
            }
            if (r3 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyTo$2 = new ByteReadChannelOperationsKt$copyTo$2(continuation);
        Object obj2 = byteReadChannelOperationsKt$copyTo$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = byteReadChannelOperationsKt$copyTo$2.label;
        int i2 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:10:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readByteArray(ByteReadChannel byteReadChannel, int i, Continuation<? super byte[]> continuation) {
        ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$1;
        int i2;
        int i3;
        Sink sink;
        Buffer buffer;
        if (continuation instanceof ByteReadChannelOperationsKt$readByteArray$1) {
            byteReadChannelOperationsKt$readByteArray$1 = (ByteReadChannelOperationsKt$readByteArray$1) continuation;
            if ((byteReadChannelOperationsKt$readByteArray$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readByteArray$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readByteArray$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readByteArray$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Buffer buffer2 = new Buffer();
                    Buffer buffer3 = buffer2;
                    i3 = i;
                    sink = buffer3;
                    buffer = buffer2;
                    if (BytePacketBuilderKt.getSize(sink) < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readByteArray$1.I$0;
                    sink = (Sink) byteReadChannelOperationsKt$readByteArray$1.L$2;
                    buffer = (Buffer) byteReadChannelOperationsKt$readByteArray$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readByteArray$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$12 = byteReadChannelOperationsKt$readByteArray$1;
                    int i5 = i4;
                    byteReadChannel = byteReadChannel2;
                    Buffer buffer4 = buffer;
                    ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$13 = byteReadChannelOperationsKt$readByteArray$12;
                    BytePacketBuilderKt.writePacket(sink, (Source) obj);
                    i3 = i5;
                    byteReadChannelOperationsKt$readByteArray$1 = byteReadChannelOperationsKt$readByteArray$13;
                    buffer = buffer4;
                    if (BytePacketBuilderKt.getSize(sink) < i3) {
                        int size = i3 - BytePacketBuilderKt.getSize(sink);
                        byteReadChannelOperationsKt$readByteArray$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$readByteArray$1.L$1 = buffer;
                        byteReadChannelOperationsKt$readByteArray$1.L$2 = sink;
                        byteReadChannelOperationsKt$readByteArray$1.I$0 = i3;
                        byteReadChannelOperationsKt$readByteArray$1.label = 1;
                        Object readPacket = readPacket(byteReadChannel, size, byteReadChannelOperationsKt$readByteArray$1);
                        if (readPacket == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannelOperationsKt$readByteArray$12 = byteReadChannelOperationsKt$readByteArray$1;
                        i5 = i3;
                        obj = readPacket;
                        Buffer buffer42 = buffer;
                        ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$132 = byteReadChannelOperationsKt$readByteArray$12;
                        BytePacketBuilderKt.writePacket(sink, (Source) obj);
                        i3 = i5;
                        byteReadChannelOperationsKt$readByteArray$1 = byteReadChannelOperationsKt$readByteArray$132;
                        buffer = buffer42;
                        if (BytePacketBuilderKt.getSize(sink) < i3) {
                            return SourcesKt.readByteArray(buffer);
                        }
                    }
                }
            }
        }
        byteReadChannelOperationsKt$readByteArray$1 = new ByteReadChannelOperationsKt$readByteArray$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readByteArray$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$readByteArray$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readRemaining(ByteReadChannel byteReadChannel, Continuation<? super Source> continuation) {
        ByteReadChannelOperationsKt$readRemaining$1 byteReadChannelOperationsKt$readRemaining$1;
        int i;
        Sink BytePacketBuilder;
        if (continuation instanceof ByteReadChannelOperationsKt$readRemaining$1) {
            byteReadChannelOperationsKt$readRemaining$1 = (ByteReadChannelOperationsKt$readRemaining$1) continuation;
            if ((byteReadChannelOperationsKt$readRemaining$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readRemaining$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readRemaining$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sink sink = (Sink) byteReadChannelOperationsKt$readRemaining$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readRemaining$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = sink;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    BytePacketBuilder.transferFrom(byteReadChannel.getReadBuffer());
                    byteReadChannelOperationsKt$readRemaining$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readRemaining$1.L$1 = BytePacketBuilder;
                    byteReadChannelOperationsKt$readRemaining$1.label = 1;
                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readRemaining$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                rethrowCloseCauseIfNeeded(byteReadChannel);
                return BytePacketBuilder.getBufferField();
            }
        }
        byteReadChannelOperationsKt$readRemaining$1 = new ByteReadChannelOperationsKt$readRemaining$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readRemaining$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readRemaining$1.label;
        if (i != 0) {
        }
        while (!byteReadChannel.isClosedForRead()) {
        }
        rethrowCloseCauseIfNeeded(byteReadChannel);
        return BytePacketBuilder.getBufferField();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readRemaining(ByteReadChannel byteReadChannel, long j, Continuation<? super Source> continuation) {
        ByteReadChannelOperationsKt$readRemaining$2 byteReadChannelOperationsKt$readRemaining$2;
        int i;
        Sink BytePacketBuilder;
        if (continuation instanceof ByteReadChannelOperationsKt$readRemaining$2) {
            byteReadChannelOperationsKt$readRemaining$2 = (ByteReadChannelOperationsKt$readRemaining$2) continuation;
            if ((byteReadChannelOperationsKt$readRemaining$2.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$2.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readRemaining$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readRemaining$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = byteReadChannelOperationsKt$readRemaining$2.J$0;
                    Sink sink = (Sink) byteReadChannelOperationsKt$readRemaining$2.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readRemaining$2.L$0;
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = sink;
                    j = j2;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    long j3 = 0;
                    if (j <= 0) {
                        break;
                    }
                    if (j >= ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) {
                        j3 = j - ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer());
                        Boxing.boxLong(byteReadChannel.getReadBuffer().transferTo(BytePacketBuilder));
                    } else {
                        byteReadChannel.getReadBuffer().readTo(BytePacketBuilder, j);
                    }
                    byteReadChannelOperationsKt$readRemaining$2.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readRemaining$2.L$1 = BytePacketBuilder;
                    byteReadChannelOperationsKt$readRemaining$2.J$0 = j3;
                    byteReadChannelOperationsKt$readRemaining$2.label = 1;
                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readRemaining$2, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = j3;
                }
                return BytePacketBuilder.getBufferField();
            }
        }
        byteReadChannelOperationsKt$readRemaining$2 = new ByteReadChannelOperationsKt$readRemaining$2(continuation);
        Object obj2 = byteReadChannelOperationsKt$readRemaining$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readRemaining$2.label;
        if (i != 0) {
        }
        while (!byteReadChannel.isClosedForRead()) {
        }
        return BytePacketBuilder.getBufferField();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readAvailable(ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, Continuation<? super Integer> continuation) {
        ByteReadChannelOperationsKt$readAvailable$1 byteReadChannelOperationsKt$readAvailable$1;
        int i3;
        if (continuation instanceof ByteReadChannelOperationsKt$readAvailable$1) {
            byteReadChannelOperationsKt$readAvailable$1 = (ByteReadChannelOperationsKt$readAvailable$1) continuation;
            if ((byteReadChannelOperationsKt$readAvailable$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readAvailable$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readAvailable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = byteReadChannelOperationsKt$readAvailable$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return Boxing.boxInt(-1);
                    }
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperationsKt$readAvailable$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$readAvailable$1.L$1 = bArr;
                        byteReadChannelOperationsKt$readAvailable$1.I$0 = i;
                        byteReadChannelOperationsKt$readAvailable$1.I$1 = i2;
                        byteReadChannelOperationsKt$readAvailable$1.label = 1;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readAvailable$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readAvailable$1.I$1;
                    int i5 = byteReadChannelOperationsKt$readAvailable$1.I$0;
                    byte[] bArr2 = (byte[]) byteReadChannelOperationsKt$readAvailable$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readAvailable$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i2 = i4;
                    byteReadChannel = byteReadChannel2;
                    i = i5;
                    bArr = bArr2;
                }
                return !byteReadChannel.isClosedForRead() ? Boxing.boxInt(-1) : Boxing.boxInt(InputKt.readAvailable(byteReadChannel.getReadBuffer(), bArr, i, i2));
            }
        }
        byteReadChannelOperationsKt$readAvailable$1 = new ByteReadChannelOperationsKt$readAvailable$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readAvailable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = byteReadChannelOperationsKt$readAvailable$1.label;
        if (i3 != 0) {
        }
        if (!byteReadChannel.isClosedForRead()) {
        }
    }

    public static /* synthetic */ Object readAvailable$default(ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return readAvailable(byteReadChannel, bArr, i, i2, continuation);
    }

    public static final int readAvailable(ByteReadChannel byteReadChannel, int i, Function1<? super Buffer, Integer> block) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (i <= 0) {
            throw new IllegalArgumentException("min should be positive".toString());
        }
        if (i > 1048576) {
            throw new IllegalArgumentException(("Min(" + i + ") shouldn't be greater than 1048576").toString());
        }
        if (getAvailableForRead(byteReadChannel) < i) {
            return -1;
        }
        return block.invoke(byteReadChannel.getReadBuffer().getBufferField()).intValue();
    }

    public static /* synthetic */ ReaderJob reader$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return reader(coroutineScope, coroutineContext, z, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    public static final ReaderJob reader(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return reader(coroutineScope, coroutineContext, new ByteChannel(false, 1, null), block);
    }

    public static final ReaderJob reader(CoroutineScope coroutineScope, CoroutineContext coroutineContext, final ByteChannel channel, Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new ByteReadChannelOperationsKt$reader$job$1(block, channel, null), 2, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: io.ktor.utils.io.ByteReadChannelOperationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit reader$lambda$6$lambda$5;
                reader$lambda$6$lambda$5 = ByteReadChannelOperationsKt.reader$lambda$6$lambda$5(ByteChannel.this, (Throwable) obj);
                return reader$lambda$6$lambda$5;
            }
        });
        return new ReaderJob(CloseHookByteWriteChannelKt.onClose(channel, new ByteReadChannelOperationsKt$reader$1(launch$default, null)), launch$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reader$lambda$6$lambda$5(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForRead()) {
            byteChannel.cancel(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:11:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006b -> B:10:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readPacket(ByteReadChannel byteReadChannel, int i, Continuation<? super Source> continuation) {
        ByteReadChannelOperationsKt$readPacket$1 byteReadChannelOperationsKt$readPacket$1;
        int i2;
        int i3;
        Buffer buffer;
        if (continuation instanceof ByteReadChannelOperationsKt$readPacket$1) {
            byteReadChannelOperationsKt$readPacket$1 = (ByteReadChannelOperationsKt$readPacket$1) continuation;
            if ((byteReadChannelOperationsKt$readPacket$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readPacket$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readPacket$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readPacket$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readPacket$1.I$0;
                    buffer = (Buffer) byteReadChannelOperationsKt$readPacket$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readPacket$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i4;
                    byteReadChannel = byteReadChannel2;
                    if (!byteReadChannel.isClosedForRead()) {
                        long j = i3;
                        if (ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()) > j - buffer.getSizeMut()) {
                            byteReadChannel.getReadBuffer().readTo(buffer, j - buffer.getSizeMut());
                        } else {
                            Boxing.boxLong(byteReadChannel.getReadBuffer().transferTo(buffer));
                        }
                        if (buffer.getSizeMut() < i3) {
                            if (byteReadChannel.getReadBuffer().exhausted()) {
                                byteReadChannelOperationsKt$readPacket$1.L$0 = byteReadChannel;
                                byteReadChannelOperationsKt$readPacket$1.L$1 = buffer;
                                byteReadChannelOperationsKt$readPacket$1.I$0 = i3;
                                byteReadChannelOperationsKt$readPacket$1.label = 1;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readPacket$1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel2 = byteReadChannel;
                                i4 = i3;
                                i3 = i4;
                                byteReadChannel = byteReadChannel2;
                            }
                            if (!byteReadChannel.isClosedForRead()) {
                            }
                        }
                    }
                    if (buffer.getSizeMut() < i3) {
                        return buffer;
                    }
                    throw new EOFException("Not enough data available, required " + i3 + " bytes but only " + buffer.getSizeMut() + " available");
                }
                ResultKt.throwOnFailure(obj);
                i3 = i;
                buffer = new Buffer();
                if (buffer.getSizeMut() < i3) {
                }
                if (buffer.getSizeMut() < i3) {
                }
            }
        }
        byteReadChannelOperationsKt$readPacket$1 = new ByteReadChannelOperationsKt$readPacket$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readPacket$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$readPacket$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object discardExact(ByteReadChannel byteReadChannel, long j, Continuation<? super Unit> continuation) {
        ByteReadChannelOperationsKt$discardExact$1 byteReadChannelOperationsKt$discardExact$1;
        Object obj;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$discardExact$1) {
            byteReadChannelOperationsKt$discardExact$1 = (ByteReadChannelOperationsKt$discardExact$1) continuation;
            if ((byteReadChannelOperationsKt$discardExact$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$discardExact$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$discardExact$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$discardExact$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$discardExact$1.J$0 = j;
                    byteReadChannelOperationsKt$discardExact$1.label = 1;
                    obj = discard(byteReadChannel, j, byteReadChannelOperationsKt$discardExact$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = byteReadChannelOperationsKt$discardExact$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Number) obj).longValue() >= j) {
                    throw new EOFException("Unable to discard " + j + " bytes");
                }
                return Unit.INSTANCE;
            }
        }
        byteReadChannelOperationsKt$discardExact$1 = new ByteReadChannelOperationsKt$discardExact$1(continuation);
        obj = byteReadChannelOperationsKt$discardExact$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$discardExact$1.label;
        if (i != 0) {
        }
        if (((Number) obj).longValue() >= j) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:11:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:10:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object discard(ByteReadChannel byteReadChannel, long j, Continuation<? super Long> continuation) {
        ByteReadChannelOperationsKt$discard$1 byteReadChannelOperationsKt$discard$1;
        int i;
        long j2;
        if (continuation instanceof ByteReadChannelOperationsKt$discard$1) {
            byteReadChannelOperationsKt$discard$1 = (ByteReadChannelOperationsKt$discard$1) continuation;
            if ((byteReadChannelOperationsKt$discard$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$discard$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$discard$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$discard$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (j <= 0) {
                    }
                    return Boxing.boxLong(j2 - j);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = byteReadChannelOperationsKt$discard$1.J$1;
                j2 = byteReadChannelOperationsKt$discard$1.J$0;
                ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$discard$1.L$0;
                ResultKt.throwOnFailure(obj);
                long j4 = j3;
                byteReadChannel = byteReadChannel2;
                j = j4;
                long min = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), min);
                j -= min;
                if (j <= 0 && !byteReadChannel.isClosedForRead()) {
                    if (getAvailableForRead(byteReadChannel) == 0) {
                        byteReadChannelOperationsKt$discard$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$discard$1.J$0 = j2;
                        byteReadChannelOperationsKt$discard$1.J$1 = j;
                        byteReadChannelOperationsKt$discard$1.label = 1;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$discard$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel;
                        j3 = j;
                        long j42 = j3;
                        byteReadChannel = byteReadChannel2;
                        j = j42;
                    }
                    long min2 = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                    ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), min2);
                    j -= min2;
                    if (j <= 0) {
                    }
                    return Boxing.boxLong(j2 - j);
                }
                return Boxing.boxLong(j2 - j);
            }
        }
        byteReadChannelOperationsKt$discard$1 = new ByteReadChannelOperationsKt$discard$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$discard$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$discard$1.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object discard$default(ByteReadChannel byteReadChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return discard(byteReadChannel, j, continuation);
    }

    public static /* synthetic */ Object readUTF8LineTo$default(ByteReadChannel byteReadChannel, Appendable appendable, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8LineTo(byteReadChannel, appendable, i, continuation);
    }

    public static final Object readUTF8LineTo(ByteReadChannel byteReadChannel, Appendable appendable, int i, Continuation<? super Boolean> continuation) {
        return m8046readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i, LineEndingMode.INSTANCE.m8060getAnyf0jXZW8(), continuation);
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01d8: INVOKE (r14 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: kotlin.jdk7.AutoCloseableKt.closeFinally(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)], block:B:90:0x01d7 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1 A[Catch: all -> 0x006d, LOOP:1: B:18:0x00d1->B:25:0x016e, LOOP_START, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01b2, B:58:0x01b3, B:61:0x01be, B:63:0x01c8, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01b2, B:58:0x01b3, B:61:0x01be, B:63:0x01c8, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01b2, B:58:0x01b3, B:61:0x01be, B:63:0x01c8, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01b2, B:58:0x01b3, B:61:0x01be, B:63:0x01c8, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: readUTF8LineTo-RRvyBJ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8046readUTF8LineToRRvyBJ8(ByteReadChannel byteReadChannel, Appendable appendable, int i, int i2, Continuation<? super Boolean> continuation) {
        ByteReadChannelOperationsKt$readUTF8LineTo$2 byteReadChannelOperationsKt$readUTF8LineTo$2;
        int i3;
        Appendable appendable2;
        int i4;
        int i5;
        ByteReadChannel byteReadChannel2;
        int i6;
        Buffer buffer;
        Appendable appendable3;
        Throwable th;
        Buffer buffer2;
        ByteReadChannel byteReadChannel3;
        Appendable appendable4;
        Buffer buffer3;
        ByteReadChannel byteReadChannel4;
        Boolean boxBoolean;
        try {
            if (continuation instanceof ByteReadChannelOperationsKt$readUTF8LineTo$2) {
                byteReadChannelOperationsKt$readUTF8LineTo$2 = (ByteReadChannelOperationsKt$readUTF8LineTo$2) continuation;
                if ((byteReadChannelOperationsKt$readUTF8LineTo$2.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$readUTF8LineTo$2.label -= Integer.MIN_VALUE;
                    Object obj = byteReadChannelOperationsKt$readUTF8LineTo$2.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i3 = byteReadChannelOperationsKt$readUTF8LineTo$2.label;
                    Throwable th2 = null;
                    if (i3 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (byteReadChannel.getReadBuffer().exhausted()) {
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$0 = byteReadChannel;
                            appendable2 = appendable;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$1 = appendable2;
                            i4 = i;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$0 = i4;
                            i5 = i2;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$1 = i5;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.label = 1;
                            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            appendable2 = appendable;
                            i4 = i;
                            i5 = i2;
                        }
                        byteReadChannel2 = byteReadChannel;
                        i6 = i5;
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                                buffer3 = (Buffer) byteReadChannelOperationsKt$readUTF8LineTo$2.L$3;
                                buffer = (AutoCloseable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$2;
                                appendable4 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                                byteReadChannel4 = (ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                                ResultKt.throwOnFailure(obj);
                                byteReadChannel3 = byteReadChannel4;
                                buffer2 = buffer3;
                                appendable3 = appendable4;
                                th = th2;
                                if (byteReadChannel3.getReadBuffer().getBufferField().get(0L) != 10) {
                                }
                                appendable3.append(Utf8Kt.readString(buffer2));
                                Boolean boxBoolean2 = Boxing.boxBoolean(true);
                                AutoCloseableKt.closeFinally(buffer, th);
                                return boxBoolean2;
                            }
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$1;
                            i4 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                            buffer2 = (Buffer) byteReadChannelOperationsKt$readUTF8LineTo$2.L$3;
                            buffer = (AutoCloseable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$2;
                            appendable3 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                            byteReadChannel3 = (ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                            ResultKt.throwOnFailure(obj);
                            th = null;
                            while (!byteReadChannel3.isClosedForRead()) {
                                while (!byteReadChannel3.getReadBuffer().exhausted()) {
                                    byte readByte = byteReadChannel3.getReadBuffer().readByte();
                                    if (readByte == 13) {
                                        if (byteReadChannel3.getReadBuffer().exhausted()) {
                                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$0 = byteReadChannel3;
                                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$1 = appendable3;
                                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$2 = buffer;
                                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$3 = buffer2;
                                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$0 = i6;
                                            byteReadChannelOperationsKt$readUTF8LineTo$2.label = 2;
                                            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            th2 = th;
                                            byteReadChannel4 = byteReadChannel3;
                                            buffer3 = buffer2;
                                            appendable4 = appendable3;
                                            byteReadChannel3 = byteReadChannel4;
                                            buffer2 = buffer3;
                                            appendable3 = appendable4;
                                            th = th2;
                                        }
                                        if (byteReadChannel3.getReadBuffer().getBufferField().get(0L) != 10) {
                                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, LineEndingMode.INSTANCE.m8062getCRLFf0jXZW8());
                                            Boxing.boxLong(ByteReadPacketKt.discard(byteReadChannel3.getReadBuffer(), 1L));
                                        } else {
                                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, LineEndingMode.INSTANCE.m8061getCRf0jXZW8());
                                        }
                                        appendable3.append(Utf8Kt.readString(buffer2));
                                        Boolean boxBoolean22 = Boxing.boxBoolean(true);
                                        AutoCloseableKt.closeFinally(buffer, th);
                                        return boxBoolean22;
                                    }
                                    if (readByte == 10) {
                                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, LineEndingMode.INSTANCE.m8063getLFf0jXZW8());
                                        appendable3.append(Utf8Kt.readString(buffer2));
                                        Boolean boxBoolean3 = Boxing.boxBoolean(true);
                                        AutoCloseableKt.closeFinally(buffer, th);
                                        return boxBoolean3;
                                    }
                                    buffer2.writeByte(readByte);
                                }
                                if (buffer2.getSizeMut() >= i4) {
                                    throw new TooLongLineException("Line exceeds limit of " + i4 + " characters");
                                }
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$0 = byteReadChannel3;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$1 = appendable3;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$2 = buffer;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$3 = buffer2;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.I$0 = i4;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.I$1 = i6;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.label = 3;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            boxBoolean = Boxing.boxBoolean(buffer2.getSizeMut() > 0);
                            if (boxBoolean.booleanValue()) {
                                appendable3.append(Utf8Kt.readString(buffer2));
                            }
                            AutoCloseableKt.closeFinally(buffer, th);
                            return boxBoolean;
                        }
                        i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$1;
                        i4 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                        Appendable appendable5 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        appendable2 = appendable5;
                    }
                    if (!byteReadChannel2.isClosedForRead()) {
                        return Boxing.boxBoolean(false);
                    }
                    buffer = new Buffer();
                    appendable3 = appendable2;
                    th = null;
                    ByteReadChannel byteReadChannel5 = byteReadChannel2;
                    buffer2 = buffer;
                    byteReadChannel3 = byteReadChannel5;
                    while (!byteReadChannel3.isClosedForRead()) {
                    }
                    boxBoolean = Boxing.boxBoolean(buffer2.getSizeMut() > 0);
                    if (boxBoolean.booleanValue()) {
                    }
                    AutoCloseableKt.closeFinally(buffer, th);
                    return boxBoolean;
                }
            }
            if (i3 != 0) {
            }
            if (!byteReadChannel2.isClosedForRead()) {
            }
        } finally {
        }
        byteReadChannelOperationsKt$readUTF8LineTo$2 = new ByteReadChannelOperationsKt$readUTF8LineTo$2(continuation);
        Object obj2 = byteReadChannelOperationsKt$readUTF8LineTo$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = byteReadChannelOperationsKt$readUTF8LineTo$2.label;
        Throwable th22 = null;
    }

    /* renamed from: readUTF8LineTo-RRvyBJ8$default, reason: not valid java name */
    public static /* synthetic */ Object m8047readUTF8LineToRRvyBJ8$default(ByteReadChannel byteReadChannel, Appendable appendable, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            i2 = LineEndingMode.INSTANCE.m8060getAnyf0jXZW8();
        }
        return m8046readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i, i2, continuation);
    }

    private static final void readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(int i, int i2) {
        if (!LineEndingMode.m8053containslTjpP64(i, i2)) {
            throw new IOException("Unexpected line ending " + ((Object) LineEndingMode.m8058toStringimpl(i2)) + ", while expected " + ((Object) LineEndingMode.m8058toStringimpl(i)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object read(ByteReadChannel byteReadChannel, Function4<? super byte[], ? super Integer, ? super Integer, ? super Continuation<? super Integer>, ? extends Object> function4, Continuation<? super Integer> continuation) {
        ByteReadChannelOperationsKt$read$1 byteReadChannelOperationsKt$read$1;
        int i;
        Buffer buffer;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Segment segment;
        int i2;
        if (continuation instanceof ByteReadChannelOperationsKt$read$1) {
            byteReadChannelOperationsKt$read$1 = (ByteReadChannelOperationsKt$read$1) continuation;
            if ((byteReadChannelOperationsKt$read$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$read$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$read$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$read$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return Boxing.boxInt(-1);
                    }
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperationsKt$read$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$read$1.L$1 = function4;
                        byteReadChannelOperationsKt$read$1.label = 1;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$read$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        intRef = (Ref.IntRef) byteReadChannelOperationsKt$read$1.L$3;
                        segment = (Segment) byteReadChannelOperationsKt$read$1.L$2;
                        buffer = (Buffer) byteReadChannelOperationsKt$read$1.L$1;
                        intRef2 = (Ref.IntRef) byteReadChannelOperationsKt$read$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        intRef.element = ((Number) obj).intValue();
                        i2 = intRef2.element;
                        if (i2 != 0) {
                            if (i2 < 0) {
                                throw new IllegalStateException("Returned negative read bytes count");
                            }
                            if (i2 > segment.getSize()) {
                                throw new IllegalStateException("Returned too many bytes");
                            }
                            buffer.skip(i2);
                        }
                        return Boxing.boxInt(intRef2.element);
                    }
                    function4 = (Function4) byteReadChannelOperationsKt$read$1.L$1;
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$read$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!byteReadChannel.isClosedForRead()) {
                    return Boxing.boxInt(-1);
                }
                Ref.IntRef intRef3 = new Ref.IntRef();
                UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                Buffer bufferField = byteReadChannel.getReadBuffer().getBufferField();
                if (bufferField.exhausted()) {
                    throw new IllegalArgumentException("Buffer is empty".toString());
                }
                Segment head = bufferField.getHead();
                Intrinsics.checkNotNull(head);
                byte[] dataAsByteArray = head.dataAsByteArray(true);
                int pos = head.getPos();
                int limit = head.getLimit();
                Integer boxInt = Boxing.boxInt(pos);
                Integer boxInt2 = Boxing.boxInt(limit);
                byteReadChannelOperationsKt$read$1.L$0 = intRef3;
                byteReadChannelOperationsKt$read$1.L$1 = bufferField;
                byteReadChannelOperationsKt$read$1.L$2 = head;
                byteReadChannelOperationsKt$read$1.L$3 = intRef3;
                byteReadChannelOperationsKt$read$1.label = 2;
                Object invoke = function4.invoke(dataAsByteArray, boxInt, boxInt2, byteReadChannelOperationsKt$read$1);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                buffer = bufferField;
                intRef = intRef3;
                intRef2 = intRef;
                obj = invoke;
                segment = head;
                intRef.element = ((Number) obj).intValue();
                i2 = intRef2.element;
                if (i2 != 0) {
                }
                return Boxing.boxInt(intRef2.element);
            }
        }
        byteReadChannelOperationsKt$read$1 = new ByteReadChannelOperationsKt$read$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$read$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$read$1.label;
        if (i != 0) {
        }
        if (!byteReadChannel.isClosedForRead()) {
        }
    }

    private static final Object read$$forInline(ByteReadChannel byteReadChannel, Function4<? super byte[], ? super Integer, ? super Integer, ? super Continuation<? super Integer>, ? extends Object> function4, Continuation<? super Integer> continuation) {
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        if (byteReadChannel.getReadBuffer().exhausted()) {
            InlineMarker.mark(0);
            ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, continuation, 1, null);
            InlineMarker.mark(1);
        }
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Buffer bufferField = byteReadChannel.getReadBuffer().getBufferField();
        if (bufferField.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty".toString());
        }
        Segment head = bufferField.getHead();
        Intrinsics.checkNotNull(head);
        Object dataAsByteArray = head.dataAsByteArray(true);
        Integer valueOf = Integer.valueOf(head.getPos());
        int intValue = Integer.valueOf(head.getLimit()).intValue();
        Integer valueOf2 = Integer.valueOf(valueOf.intValue());
        Integer valueOf3 = Integer.valueOf(intValue);
        InlineMarker.mark(3);
        intRef.element = ((Number) function4.invoke((byte[]) dataAsByteArray, valueOf2, valueOf3, null)).intValue();
        int intValue2 = Integer.valueOf(intRef.element).intValue();
        if (intValue2 != 0) {
            if (intValue2 < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (intValue2 > head.getSize()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bufferField.skip(intValue2);
        }
        return Integer.valueOf(intRef.element);
    }

    public static final int getAvailableForRead(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return (int) byteReadChannel.getReadBuffer().getBufferField().getSizeMut();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005c -> B:11:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0071 -> B:10:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFully(ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, Continuation<? super Unit> continuation) {
        ByteReadChannelOperationsKt$readFully$1 byteReadChannelOperationsKt$readFully$1;
        int i3;
        if (continuation instanceof ByteReadChannelOperationsKt$readFully$1) {
            byteReadChannelOperationsKt$readFully$1 = (ByteReadChannelOperationsKt$readFully$1) continuation;
            if ((byteReadChannelOperationsKt$readFully$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readFully$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readFully$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = byteReadChannelOperationsKt$readFully$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i2 > i && byteReadChannel.isClosedForRead()) {
                        throw new EOFException("Channel is already closed");
                    }
                    if (i < i2) {
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readFully$1.I$1;
                    int i5 = byteReadChannelOperationsKt$readFully$1.I$0;
                    byte[] bArr2 = (byte[]) byteReadChannelOperationsKt$readFully$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readFully$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    byte[] bArr3 = bArr2;
                    i = i4;
                    byteReadChannel = byteReadChannel2;
                    i2 = i5;
                    bArr = bArr3;
                    if (byteReadChannel.isClosedForRead()) {
                        int min = Math.min(i2 - i, (int) ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) + i;
                        SourcesKt.readTo(byteReadChannel.getReadBuffer(), bArr, i, min);
                        i = min;
                        if (i < i2) {
                            if (byteReadChannel.getReadBuffer().exhausted()) {
                                byteReadChannelOperationsKt$readFully$1.L$0 = byteReadChannel;
                                byteReadChannelOperationsKt$readFully$1.L$1 = bArr;
                                byteReadChannelOperationsKt$readFully$1.I$0 = i2;
                                byteReadChannelOperationsKt$readFully$1.I$1 = i;
                                byteReadChannelOperationsKt$readFully$1.label = 1;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readFully$1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                int i6 = i2;
                                byteReadChannel2 = byteReadChannel;
                                i4 = i;
                                bArr2 = bArr;
                                i5 = i6;
                                byte[] bArr32 = bArr2;
                                i = i4;
                                byteReadChannel = byteReadChannel2;
                                i2 = i5;
                                bArr = bArr32;
                            }
                            if (byteReadChannel.isClosedForRead()) {
                                throw new EOFException("Channel is already closed");
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        byteReadChannelOperationsKt$readFully$1 = new ByteReadChannelOperationsKt$readFully$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readFully$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = byteReadChannelOperationsKt$readFully$1.label;
        if (i3 != 0) {
        }
    }

    public static /* synthetic */ Object readFully$default(ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return readFully(byteReadChannel, bArr, i, i2, continuation);
    }

    public static final void rethrowCloseCauseIfNeeded(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(ByteWriteChannel byteWriteChannel) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Throwable closedCause = byteWriteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(ByteChannel byteChannel) {
        Intrinsics.checkNotNullParameter(byteChannel, "<this>");
        Throwable closedCause = byteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static /* synthetic */ Object readUntil$default(ByteReadChannel byteReadChannel, ByteString byteString, ByteWriteChannel byteWriteChannel, long j, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Long.MAX_VALUE;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = false;
        }
        return readUntil(byteReadChannel, byteString, byteWriteChannel, j2, z, continuation);
    }

    public static final Object readUntil(ByteReadChannel byteReadChannel, ByteString byteString, ByteWriteChannel byteWriteChannel, long j, boolean z, Continuation<? super Long> continuation) {
        return new ByteChannelScanner(byteReadChannel, byteString, byteWriteChannel, j).findNext$ktor_io(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object skipIfFound(ByteReadChannel byteReadChannel, ByteString byteString, Continuation<? super Boolean> continuation) {
        ByteReadChannelOperationsKt$skipIfFound$1 byteReadChannelOperationsKt$skipIfFound$1;
        Object obj;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$skipIfFound$1) {
            byteReadChannelOperationsKt$skipIfFound$1 = (ByteReadChannelOperationsKt$skipIfFound$1) continuation;
            if ((byteReadChannelOperationsKt$skipIfFound$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$skipIfFound$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$skipIfFound$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$skipIfFound$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int size = byteString.getSize();
                    byteReadChannelOperationsKt$skipIfFound$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$skipIfFound$1.L$1 = byteString;
                    byteReadChannelOperationsKt$skipIfFound$1.label = 1;
                    obj = peek(byteReadChannel, size, byteReadChannelOperationsKt$skipIfFound$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    }
                    byteString = (ByteString) byteReadChannelOperationsKt$skipIfFound$1.L$1;
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$skipIfFound$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!Intrinsics.areEqual(obj, byteString)) {
                    long size2 = byteString.getSize();
                    byteReadChannelOperationsKt$skipIfFound$1.L$0 = null;
                    byteReadChannelOperationsKt$skipIfFound$1.L$1 = null;
                    byteReadChannelOperationsKt$skipIfFound$1.label = 2;
                    if (discard(byteReadChannel, size2, byteReadChannelOperationsKt$skipIfFound$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Boxing.boxBoolean(true);
                }
                return Boxing.boxBoolean(false);
            }
        }
        byteReadChannelOperationsKt$skipIfFound$1 = new ByteReadChannelOperationsKt$skipIfFound$1(continuation);
        obj = byteReadChannelOperationsKt$skipIfFound$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$skipIfFound$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual(obj, byteString)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object peek(ByteReadChannel byteReadChannel, int i, Continuation<? super ByteString> continuation) {
        ByteReadChannelOperationsKt$peek$1 byteReadChannelOperationsKt$peek$1;
        Object obj;
        int i2;
        if (continuation instanceof ByteReadChannelOperationsKt$peek$1) {
            byteReadChannelOperationsKt$peek$1 = (ByteReadChannelOperationsKt$peek$1) continuation;
            if ((byteReadChannelOperationsKt$peek$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$peek$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$peek$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$peek$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return null;
                    }
                    byteReadChannelOperationsKt$peek$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$peek$1.I$0 = i;
                    byteReadChannelOperationsKt$peek$1.label = 1;
                    obj = byteReadChannel.awaitContent(i, byteReadChannelOperationsKt$peek$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = byteReadChannelOperationsKt$peek$1.I$0;
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$peek$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return ByteStringsKt.readByteString(byteReadChannel.getReadBuffer().peek(), i);
            }
        }
        byteReadChannelOperationsKt$peek$1 = new ByteReadChannelOperationsKt$peek$1(continuation);
        obj = byteReadChannelOperationsKt$peek$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$peek$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
