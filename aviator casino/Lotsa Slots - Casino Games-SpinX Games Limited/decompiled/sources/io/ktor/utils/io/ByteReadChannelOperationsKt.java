package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.kt */
@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001f\u0010\u001c\u001a$\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010!\u001a\u001c\u0010#\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b#\u0010\u0015\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0000H\u0086@¢\u0006\u0004\b%\u0010\u0003\u001a\u001c\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010&\u001a0\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\nH\u0086@¢\u0006\u0004\b*\u0010+\u001a-\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010,\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b*\u0010/\u001aN\u0010:\u001a\u000209*\u0002002\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020\u00012'\u0010.\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0002\b8¢\u0006\u0004\b:\u0010;\u001aJ\u0010:\u001a\u000209*\u0002002\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020<2'\u0010.\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0002\b8¢\u0006\u0004\b:\u0010=\u001a\u001c\u0010?\u001a\u00020$*\u00020\u00002\u0006\u0010>\u001a\u00020\nH\u0086@¢\u0006\u0004\b?\u0010\u0015\u001a\u001c\u0010A\u001a\u00020\u0013*\u00020\u00002\u0006\u0010@\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bA\u0010&\u001a\u001e\u0010B\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bB\u0010&\u001a*\u0010F\u001a\u00020\u0001*\u00020\u00002\n\u0010E\u001a\u00060Cj\u0002`D2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\bF\u0010G\u001a4\u0010F\u001a\u00020\u0001*\u00020\u00002\n\u0010E\u001a\u00060Cj\u0002`D2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010I\u001a\u00020HH\u0087@¢\u0006\u0004\bJ\u0010K\u001aF\u0010M\u001a\u00020\n*\u00020\u000020\b\u0004\u0010.\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06\u0012\u0006\u0012\u0004\u0018\u0001070LH\u0086H¢\u0006\u0004\bM\u0010N\u001a0\u0010Q\u001a\u00020\u0013*\u00020\u00002\u0006\u0010E\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\nH\u0086@¢\u0006\u0004\bQ\u0010+\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bR\u0010S\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020\u0019H\u0007¢\u0006\u0004\bR\u0010T\u001a\u0013\u0010R\u001a\u00020\u0013*\u00020<H\u0007¢\u0006\u0004\bR\u0010U\u001a8\u0010Z\u001a\u00020\u000e*\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010Y\u001a\u00020\u0001H\u0086@¢\u0006\u0004\bZ\u0010[\u001a\u001c\u0010]\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\\\u001a\u00020VH\u0086@¢\u0006\u0004\b]\u0010^\u001a\u001e\u0010_\u001a\u0004\u0018\u00010V*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b_\u0010\u0015\"\u001b\u0010c\u001a\u00020\n*\u00020\u00198F¢\u0006\f\u0012\u0004\bb\u0010T\u001a\u0004\b`\u0010a\"\u0014\u0010d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010e\"\u001b\u0010j\u001a\u00020\n*\u00020\u00008F¢\u0006\f\u0012\u0004\bi\u0010S\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "exhausted", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toByteArray", "", "readByte", "", "readShort", "", "readInt", "", "readFloat", "", "readLong", "", "readDouble", "numberOfBytes", "", "awaitUntilReadable", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/Buffer;", "readBuffer", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "copyAndClose", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "readUTF8Line", "copyTo", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "readByteArray", "Lkotlinx/io/Source;", "readRemaining", "(Lio/ktor/utils/io/ByteReadChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buffer", "offset", "length", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;[BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/jvm/functions/Function1;)I", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/ReaderScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lio/ktor/utils/io/ReaderJob;", "reader", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ByteChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "packet", "readPacket", "value", "discardExact", "discard", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "readUTF8LineTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/LineEndingMode;", "lineEnding", "readUTF8LineTo-RRvyBJ8", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "read", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "readFully", "rethrowCloseCauseIfNeeded", "(Lio/ktor/utils/io/ByteReadChannel;)V", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "(Lio/ktor/utils/io/ByteChannel;)V", "Lkotlinx/io/bytestring/ByteString;", "matchString", "writeChannel", "ignoreMissing", "readUntil", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "byteString", "skipIfFound", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "peek", "getAvailableForWrite", "(Lio/ktor/utils/io/ByteWriteChannel;)I", "getAvailableForWrite$annotations", "availableForWrite", "CR", "B", "LF", "getAvailableForRead", "(Lio/ktor/utils/io/ByteReadChannel;)I", "getAvailableForRead$annotations", "availableForRead", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteReadChannelOperationsKt {
    private static final byte CR = 13;
    private static final byte LF = 10;

    public static /* synthetic */ void getAvailableForRead$annotations(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
    }

    public static /* synthetic */ void getAvailableForWrite$annotations(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
    }

    public static final int getAvailableForWrite(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        return 1048576 - io.ktor.utils.io.core.BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object exhausted(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1 byteReadChannelOperationsKt$exhausted$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1) {
            byteReadChannelOperationsKt$exhausted$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1) continuation;
            if ((byteReadChannelOperationsKt$exhausted$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$exhausted$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$exhausted$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$exhausted$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperationsKt$exhausted$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$exhausted$1.label = 1;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$exhausted$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$exhausted$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(byteReadChannel.getReadBuffer().exhausted());
            }
        }
        byteReadChannelOperationsKt$exhausted$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$exhausted$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$exhausted$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(byteReadChannel.getReadBuffer().exhausted());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toByteArray(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1 byteReadChannelOperationsKt$toByteArray$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1) {
            byteReadChannelOperationsKt$toByteArray$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1) continuation;
            if ((byteReadChannelOperationsKt$toByteArray$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$toByteArray$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$toByteArray$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$toByteArray$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$toByteArray$1.label = 1;
                    obj = readBuffer(byteReadChannel, byteReadChannelOperationsKt$toByteArray$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return io.ktor.utils.io.core.BuffersKt.readBytes$default((kotlinx.io.Buffer) obj, 0, 1, null);
            }
        }
        byteReadChannelOperationsKt$toByteArray$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$toByteArray$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$toByteArray$1.label;
        if (i != 0) {
        }
        return io.ktor.utils.io.core.BuffersKt.readBytes$default((kotlinx.io.Buffer) obj2, 0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readByte(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super java.lang.Byte> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1 byteReadChannelOperationsKt$readByte$1;
        java.lang.Object obj;
        int i;
        kotlinx.io.Source readBuffer;
        kotlinx.io.Source source;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1) {
            byteReadChannelOperationsKt$readByte$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1) continuation;
            if ((byteReadChannelOperationsKt$readByte$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readByte$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$readByte$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readByte$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    readBuffer = byteReadChannel.getReadBuffer();
                    if (readBuffer.exhausted()) {
                        byteReadChannelOperationsKt$readByte$1.L$0 = readBuffer;
                        byteReadChannelOperationsKt$readByte$1.label = 1;
                        java.lang.Object awaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readByte$1, 1, null);
                        if (awaitContent$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = awaitContent$default;
                        source = readBuffer;
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxByte(readBuffer.readByte());
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                source = (kotlinx.io.Source) byteReadChannelOperationsKt$readByte$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.io.EOFException("Not enough data available");
                }
                readBuffer = source;
                return kotlin.coroutines.jvm.internal.Boxing.boxByte(readBuffer.readByte());
            }
        }
        byteReadChannelOperationsKt$readByte$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1(continuation);
        obj = byteReadChannelOperationsKt$readByte$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readByte$1.label;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readShort(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super java.lang.Short> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1 byteReadChannelOperationsKt$readShort$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1) {
            byteReadChannelOperationsKt$readShort$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1) continuation;
            if ((byteReadChannelOperationsKt$readShort$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readShort$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readShort$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readShort$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readShort$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readShort$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 2, byteReadChannelOperationsKt$readShort$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readShort$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxShort(byteReadChannel.getReadBuffer().readShort());
            }
        }
        byteReadChannelOperationsKt$readShort$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readShort$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readShort$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxShort(byteReadChannel.getReadBuffer().readShort());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readInt(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1 byteReadChannelOperationsKt$readInt$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1) {
            byteReadChannelOperationsKt$readInt$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1) continuation;
            if ((byteReadChannelOperationsKt$readInt$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readInt$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readInt$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readInt$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readInt$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readInt$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 4, byteReadChannelOperationsKt$readInt$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readInt$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(byteReadChannel.getReadBuffer().readInt());
            }
        }
        byteReadChannelOperationsKt$readInt$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readInt$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readInt$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(byteReadChannel.getReadBuffer().readInt());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readFloat(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1 byteReadChannelOperationsKt$readFloat$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1) {
            byteReadChannelOperationsKt$readFloat$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1) continuation;
            if ((byteReadChannelOperationsKt$readFloat$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readFloat$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readFloat$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readFloat$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readFloat$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readFloat$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 4, byteReadChannelOperationsKt$readFloat$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readFloat$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(kotlinx.io.SourcesKt.readFloat(byteReadChannel.getReadBuffer()));
            }
        }
        byteReadChannelOperationsKt$readFloat$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readFloat$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readFloat$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(kotlinx.io.SourcesKt.readFloat(byteReadChannel.getReadBuffer()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readLong(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1 byteReadChannelOperationsKt$readLong$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1) {
            byteReadChannelOperationsKt$readLong$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1) continuation;
            if ((byteReadChannelOperationsKt$readLong$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readLong$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readLong$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readLong$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readLong$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readLong$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 8, byteReadChannelOperationsKt$readLong$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readLong$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(byteReadChannel.getReadBuffer().readLong());
            }
        }
        byteReadChannelOperationsKt$readLong$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readLong$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readLong$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxLong(byteReadChannel.getReadBuffer().readLong());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readDouble(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super java.lang.Double> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1 byteReadChannelOperationsKt$readDouble$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1) {
            byteReadChannelOperationsKt$readDouble$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1) continuation;
            if ((byteReadChannelOperationsKt$readDouble$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readDouble$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readDouble$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readDouble$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$readDouble$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readDouble$1.label = 1;
                    if (awaitUntilReadable(byteReadChannel, 8, byteReadChannelOperationsKt$readDouble$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readDouble$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlinx.io.SourcesKt.readDouble(byteReadChannel.getReadBuffer()));
            }
        }
        byteReadChannelOperationsKt$readDouble$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readDouble$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readDouble$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlinx.io.SourcesKt.readDouble(byteReadChannel.getReadBuffer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitUntilReadable(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1 byteReadChannelOperationsKt$awaitUntilReadable$1;
        java.lang.Object obj;
        int i2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1) {
            byteReadChannelOperationsKt$awaitUntilReadable$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1) continuation;
            if ((byteReadChannelOperationsKt$awaitUntilReadable$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$awaitUntilReadable$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$awaitUntilReadable$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$awaitUntilReadable$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$awaitUntilReadable$1.label = 1;
                    obj = byteReadChannel.awaitContent(i, byteReadChannelOperationsKt$awaitUntilReadable$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.io.EOFException("Not enough data available");
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        byteReadChannelOperationsKt$awaitUntilReadable$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1(continuation);
        obj = byteReadChannelOperationsKt$awaitUntilReadable$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$awaitUntilReadable$1.label;
        if (i2 != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
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
    public static final java.lang.Object readBuffer(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super kotlinx.io.Buffer> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1 byteReadChannelOperationsKt$readBuffer$1;
        int i;
        kotlinx.io.Buffer buffer;
        java.lang.Throwable closedCause;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1) {
            byteReadChannelOperationsKt$readBuffer$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1) continuation;
            if ((byteReadChannelOperationsKt$readBuffer$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readBuffer$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readBuffer$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readBuffer$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    buffer = new kotlinx.io.Buffer();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.io.Buffer buffer2 = (kotlinx.io.Buffer) byteReadChannelOperationsKt$readBuffer$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readBuffer$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    buffer = buffer2;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    buffer.transferFrom(byteReadChannel.getReadBuffer());
                    byteReadChannelOperationsKt$readBuffer$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readBuffer$1.L$1 = buffer;
                    byteReadChannelOperationsKt$readBuffer$1.label = 1;
                    if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readBuffer$1, 1, null) == coroutine_suspended) {
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
        byteReadChannelOperationsKt$readBuffer$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readBuffer$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object readBuffer(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation<? super kotlinx.io.Buffer> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3 byteReadChannelOperationsKt$readBuffer$3;
        int i2;
        kotlinx.io.Buffer buffer;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3) {
            byteReadChannelOperationsKt$readBuffer$3 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3) continuation;
            if ((byteReadChannelOperationsKt$readBuffer$3.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readBuffer$3.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readBuffer$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readBuffer$3.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    buffer = new kotlinx.io.Buffer();
                    if (i > 0) {
                    }
                    return buffer;
                }
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = byteReadChannelOperationsKt$readBuffer$3.I$0;
                kotlinx.io.Buffer buffer2 = (kotlinx.io.Buffer) byteReadChannelOperationsKt$readBuffer$3.L$1;
                io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readBuffer$3.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                buffer = buffer2;
                i = i3;
                byteReadChannel = byteReadChannel2;
                long min = java.lang.Math.min(i, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
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
                    if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readBuffer$3, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteReadChannel2 = byteReadChannel;
                    i3 = i;
                    buffer2 = buffer;
                    buffer = buffer2;
                    i = i3;
                    byteReadChannel = byteReadChannel2;
                }
                long min2 = java.lang.Math.min(i, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                byteReadChannel.getReadBuffer().readTo(buffer, min2);
                i -= (int) min2;
                if (i > 0) {
                }
                return buffer;
            }
        }
        byteReadChannelOperationsKt$readBuffer$3 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readBuffer$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object copyAndClose(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$1;
        ?? r3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j;
        io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$12;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        long j2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1) {
                byteReadChannelOperationsKt$copyAndClose$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1) continuation;
                if ((byteReadChannelOperationsKt$copyAndClose$1.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyAndClose$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = byteReadChannelOperationsKt$copyAndClose$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyAndClose$1.label;
                    if (r3 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        j = 0;
                        r3 = byteWriteChannel;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else if (r3 == 1) {
                        j = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) byteReadChannelOperationsKt$copyAndClose$1.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        byteReadChannelOperationsKt$copyAndClose$1.L$0 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$1.L$1 = r3;
                        byteReadChannelOperationsKt$copyAndClose$1.J$0 = j;
                        byteReadChannelOperationsKt$copyAndClose$1.label = 2;
                        byteWriteChannel2 = r3;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyAndClose$1, 1, null) == coroutine_suspended) {
                        }
                        io.ktor.utils.io.ByteReadChannel byteReadChannel4 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel4;
                        r3 = byteWriteChannel2;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j2 = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.coroutines.jvm.internal.Boxing.boxLong(j2);
                            }
                            if (r3 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Throwable th = (java.lang.Throwable) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) byteReadChannelOperationsKt$copyAndClose$1.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel4;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel42 = byteReadChannel2;
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
                                io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$13 = byteReadChannelOperationsKt$copyAndClose$12;
                                byteReadChannel2 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyAndClose$1 = byteReadChannelOperationsKt$copyAndClose$13;
                                r3 = r3;
                                byteReadChannelOperationsKt$copyAndClose$1.L$0 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyAndClose$1.L$1 = r3;
                                byteReadChannelOperationsKt$copyAndClose$1.J$0 = j;
                                byteReadChannelOperationsKt$copyAndClose$1.label = 2;
                                byteWriteChannel2 = r3;
                                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyAndClose$1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                io.ktor.utils.io.ByteReadChannel byteReadChannel422 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                                byteReadChannel3 = byteReadChannel422;
                                r3 = byteWriteChannel2;
                                if (byteReadChannel3.isClosedForRead()) {
                                    java.lang.Throwable closedCause = byteReadChannel3.getClosedCause();
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
                                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(j2);
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$14 = byteReadChannelOperationsKt$copyAndClose$12;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyAndClose$1 = byteReadChannelOperationsKt$copyAndClose$14;
                            try {
                                byteReadChannel2.cancel(th);
                                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (java.lang.Throwable th3) {
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
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyAndClose$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$copyAndClose$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = byteReadChannelOperationsKt$copyAndClose$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readUTF8Line(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1 byteReadChannelOperationsKt$readUTF8Line$1;
        java.lang.Object obj;
        int i2;
        java.lang.StringBuilder sb;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1) {
            byteReadChannelOperationsKt$readUTF8Line$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1) continuation;
            if ((byteReadChannelOperationsKt$readUTF8Line$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUTF8Line$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$readUTF8Line$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readUTF8Line$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    byteReadChannelOperationsKt$readUTF8Line$1.L$0 = sb2;
                    byteReadChannelOperationsKt$readUTF8Line$1.label = 1;
                    java.lang.Object readUTF8LineTo = readUTF8LineTo(byteReadChannel, sb2, i, byteReadChannelOperationsKt$readUTF8Line$1);
                    if (readUTF8LineTo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = readUTF8LineTo;
                    sb = sb2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sb = (java.lang.StringBuilder) byteReadChannelOperationsKt$readUTF8Line$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                return sb.toString();
            }
        }
        byteReadChannelOperationsKt$readUTF8Line$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1(continuation);
        obj = byteReadChannelOperationsKt$readUTF8Line$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$readUTF8Line$1.label;
        if (i2 != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    public static /* synthetic */ java.lang.Object readUTF8Line$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
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
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1 byteReadChannelOperationsKt$copyTo$1;
        ?? r3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j;
        io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1 byteReadChannelOperationsKt$copyTo$12;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        long j2;
        long j3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1) {
                byteReadChannelOperationsKt$copyTo$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1) continuation;
                if ((byteReadChannelOperationsKt$copyTo$1.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyTo$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = byteReadChannelOperationsKt$copyTo$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyTo$1.label;
                    if (r3 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel;
                        j = 0;
                        byteReadChannelOperationsKt$copyTo$12 = byteReadChannelOperationsKt$copyTo$1;
                        byteReadChannel3 = byteReadChannel;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else if (r3 == 1) {
                        j2 = byteReadChannelOperationsKt$copyTo$1.J$0;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) byteReadChannelOperationsKt$copyTo$1.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$copyTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        byteReadChannelOperationsKt$copyTo$1.L$0 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyTo$1.L$1 = r3;
                        byteReadChannelOperationsKt$copyTo$1.J$0 = j2;
                        byteReadChannelOperationsKt$copyTo$1.label = 2;
                        byteWriteChannel2 = r3;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyTo$1, 1, null) == coroutine_suspended) {
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
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.coroutines.jvm.internal.Boxing.boxLong(j3);
                            }
                            if (r3 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Throwable th = (java.lang.Throwable) byteReadChannelOperationsKt$copyTo$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j2 = byteReadChannelOperationsKt$copyTo$1.J$0;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) byteReadChannelOperationsKt$copyTo$1.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$copyTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
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
                                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyTo$1, 1, null) == coroutine_suspended) {
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
                                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(j3);
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyTo$1 = byteReadChannelOperationsKt$copyTo$12;
                            try {
                                byteReadChannel2.cancel(th);
                                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (java.lang.Throwable th3) {
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
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyTo$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$copyTo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$2;
        ?? r3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j2;
        long j3;
        io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$22;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        java.lang.Object flush;
        long j4;
        long j5;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2) {
                byteReadChannelOperationsKt$copyTo$2 = (io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2) continuation;
                if ((byteReadChannelOperationsKt$copyTo$2.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyTo$2.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = byteReadChannelOperationsKt$copyTo$2.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyTo$2.label;
                    int i = 1;
                    if (r3 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
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
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) byteReadChannelOperationsKt$copyTo$2.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$copyTo$2.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        long min = java.lang.Math.min(j2, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
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
                        io.ktor.utils.io.ByteReadChannel byteReadChannel4 = byteReadChannel2;
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
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.coroutines.jvm.internal.Boxing.boxLong(j5 - j4);
                            }
                            if (r3 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Throwable th = (java.lang.Throwable) byteReadChannelOperationsKt$copyTo$2.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j2 = byteReadChannelOperationsKt$copyTo$2.J$1;
                        j3 = byteReadChannelOperationsKt$copyTo$2.J$0;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) byteReadChannelOperationsKt$copyTo$2.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$copyTo$2.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel4;
                        try {
                            io.ktor.utils.io.ByteReadChannel byteReadChannel42 = byteReadChannel2;
                            byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                            byteReadChannel3 = byteReadChannel42;
                            if (byteReadChannel3.isClosedForRead() && j2 > 0) {
                                if (byteReadChannel3.getReadBuffer().exhausted()) {
                                    byteReadChannelOperationsKt$copyTo$22.L$0 = byteReadChannel3;
                                    byteReadChannelOperationsKt$copyTo$22.L$1 = r3;
                                    byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                                    byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                                    byteReadChannelOperationsKt$copyTo$22.label = i;
                                    if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$copyTo$22, i, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$23 = byteReadChannelOperationsKt$copyTo$22;
                                byteReadChannel2 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$23;
                                r3 = r3;
                                long min2 = java.lang.Math.min(j2, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
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
                                io.ktor.utils.io.ByteReadChannel byteReadChannel422 = byteReadChannel2;
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
                                return kotlin.coroutines.jvm.internal.Boxing.boxLong(j5 - j4);
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$24 = byteReadChannelOperationsKt$copyTo$22;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$24;
                            try {
                                byteReadChannel2.cancel(th);
                                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (java.lang.Throwable th3) {
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
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyTo$2 = new io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$copyTo$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object readByteArray(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$1;
        int i2;
        int i3;
        kotlinx.io.Sink sink;
        kotlinx.io.Buffer buffer;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1) {
            byteReadChannelOperationsKt$readByteArray$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1) continuation;
            if ((byteReadChannelOperationsKt$readByteArray$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readByteArray$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readByteArray$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readByteArray$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.io.Buffer buffer2 = new kotlinx.io.Buffer();
                    kotlinx.io.Buffer buffer3 = buffer2;
                    i3 = i;
                    sink = buffer3;
                    buffer = buffer2;
                    if (io.ktor.utils.io.core.BytePacketBuilderKt.getSize(sink) < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readByteArray$1.I$0;
                    sink = (kotlinx.io.Sink) byteReadChannelOperationsKt$readByteArray$1.L$2;
                    buffer = (kotlinx.io.Buffer) byteReadChannelOperationsKt$readByteArray$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readByteArray$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$12 = byteReadChannelOperationsKt$readByteArray$1;
                    int i5 = i4;
                    byteReadChannel = byteReadChannel2;
                    kotlinx.io.Buffer buffer4 = buffer;
                    io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$13 = byteReadChannelOperationsKt$readByteArray$12;
                    io.ktor.utils.io.core.BytePacketBuilderKt.writePacket(sink, (kotlinx.io.Source) obj);
                    i3 = i5;
                    byteReadChannelOperationsKt$readByteArray$1 = byteReadChannelOperationsKt$readByteArray$13;
                    buffer = buffer4;
                    if (io.ktor.utils.io.core.BytePacketBuilderKt.getSize(sink) < i3) {
                        int size = i3 - io.ktor.utils.io.core.BytePacketBuilderKt.getSize(sink);
                        byteReadChannelOperationsKt$readByteArray$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$readByteArray$1.L$1 = buffer;
                        byteReadChannelOperationsKt$readByteArray$1.L$2 = sink;
                        byteReadChannelOperationsKt$readByteArray$1.I$0 = i3;
                        byteReadChannelOperationsKt$readByteArray$1.label = 1;
                        java.lang.Object readPacket = readPacket(byteReadChannel, size, byteReadChannelOperationsKt$readByteArray$1);
                        if (readPacket == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannelOperationsKt$readByteArray$12 = byteReadChannelOperationsKt$readByteArray$1;
                        i5 = i3;
                        obj = readPacket;
                        kotlinx.io.Buffer buffer42 = buffer;
                        io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 byteReadChannelOperationsKt$readByteArray$132 = byteReadChannelOperationsKt$readByteArray$12;
                        io.ktor.utils.io.core.BytePacketBuilderKt.writePacket(sink, (kotlinx.io.Source) obj);
                        i3 = i5;
                        byteReadChannelOperationsKt$readByteArray$1 = byteReadChannelOperationsKt$readByteArray$132;
                        buffer = buffer42;
                        if (io.ktor.utils.io.core.BytePacketBuilderKt.getSize(sink) < i3) {
                            return kotlinx.io.SourcesKt.readByteArray(buffer);
                        }
                    }
                }
            }
        }
        byteReadChannelOperationsKt$readByteArray$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readByteArray$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object readRemaining(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super kotlinx.io.Source> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1 byteReadChannelOperationsKt$readRemaining$1;
        int i;
        kotlinx.io.Sink BytePacketBuilder;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1) {
            byteReadChannelOperationsKt$readRemaining$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1) continuation;
            if ((byteReadChannelOperationsKt$readRemaining$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readRemaining$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readRemaining$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.io.Sink sink = (kotlinx.io.Sink) byteReadChannelOperationsKt$readRemaining$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readRemaining$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = sink;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    BytePacketBuilder.transferFrom(byteReadChannel.getReadBuffer());
                    byteReadChannelOperationsKt$readRemaining$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readRemaining$1.L$1 = BytePacketBuilder;
                    byteReadChannelOperationsKt$readRemaining$1.label = 1;
                    if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readRemaining$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                rethrowCloseCauseIfNeeded(byteReadChannel);
                return BytePacketBuilder.getBufferField();
            }
        }
        byteReadChannelOperationsKt$readRemaining$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readRemaining$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object readRemaining(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, kotlin.coroutines.Continuation<? super kotlinx.io.Source> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2 byteReadChannelOperationsKt$readRemaining$2;
        int i;
        kotlinx.io.Sink BytePacketBuilder;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2) {
            byteReadChannelOperationsKt$readRemaining$2 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2) continuation;
            if ((byteReadChannelOperationsKt$readRemaining$2.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readRemaining$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readRemaining$2.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = byteReadChannelOperationsKt$readRemaining$2.J$0;
                    kotlinx.io.Sink sink = (kotlinx.io.Sink) byteReadChannelOperationsKt$readRemaining$2.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readRemaining$2.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = sink;
                    j = j2;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    long j3 = 0;
                    if (j <= 0) {
                        break;
                    }
                    if (j >= io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) {
                        j3 = j - io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer());
                        kotlin.coroutines.jvm.internal.Boxing.boxLong(byteReadChannel.getReadBuffer().transferTo(BytePacketBuilder));
                    } else {
                        byteReadChannel.getReadBuffer().readTo(BytePacketBuilder, j);
                    }
                    byteReadChannelOperationsKt$readRemaining$2.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readRemaining$2.L$1 = BytePacketBuilder;
                    byteReadChannelOperationsKt$readRemaining$2.J$0 = j3;
                    byteReadChannelOperationsKt$readRemaining$2.label = 1;
                    if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readRemaining$2, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = j3;
                }
                return BytePacketBuilder.getBufferField();
            }
        }
        byteReadChannelOperationsKt$readRemaining$2 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readRemaining$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1 byteReadChannelOperationsKt$readAvailable$1;
        int i3;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1) {
            byteReadChannelOperationsKt$readAvailable$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1) continuation;
            if ((byteReadChannelOperationsKt$readAvailable$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readAvailable$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readAvailable$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = byteReadChannelOperationsKt$readAvailable$1.label;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxInt(-1);
                    }
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperationsKt$readAvailable$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$readAvailable$1.L$1 = bArr;
                        byteReadChannelOperationsKt$readAvailable$1.I$0 = i;
                        byteReadChannelOperationsKt$readAvailable$1.I$1 = i2;
                        byteReadChannelOperationsKt$readAvailable$1.label = 1;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readAvailable$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readAvailable$1.I$1;
                    int i5 = byteReadChannelOperationsKt$readAvailable$1.I$0;
                    byte[] bArr2 = (byte[]) byteReadChannelOperationsKt$readAvailable$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readAvailable$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i4;
                    byteReadChannel = byteReadChannel2;
                    i = i5;
                    bArr = bArr2;
                }
                return !byteReadChannel.isClosedForRead() ? kotlin.coroutines.jvm.internal.Boxing.boxInt(-1) : kotlin.coroutines.jvm.internal.Boxing.boxInt(io.ktor.utils.io.core.InputKt.readAvailable(byteReadChannel.getReadBuffer(), bArr, i, i2));
            }
        }
        byteReadChannelOperationsKt$readAvailable$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readAvailable$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = byteReadChannelOperationsKt$readAvailable$1.label;
        if (i3 != 0) {
        }
        if (!byteReadChannel.isClosedForRead()) {
        }
    }

    public static /* synthetic */ java.lang.Object readAvailable$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return readAvailable(byteReadChannel, bArr, i, i2, continuation);
    }

    public static final int readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.jvm.functions.Function1<? super kotlinx.io.Buffer, java.lang.Integer> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("min should be positive".toString());
        }
        if (i > 1048576) {
            throw new java.lang.IllegalArgumentException(("Min(" + i + ") shouldn't be greater than 1048576").toString());
        }
        if (getAvailableForRead(byteReadChannel) < i) {
            return -1;
        }
        return block.invoke(byteReadChannel.getReadBuffer().getBufferField()).intValue();
    }

    public static /* synthetic */ io.ktor.utils.io.ReaderJob reader$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return reader(coroutineScope, coroutineContext, z, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) function2);
    }

    public static final io.ktor.utils.io.ReaderJob reader(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        return reader(coroutineScope, coroutineContext, new io.ktor.utils.io.ByteChannel(false, 1, null), block);
    }

    public static final io.ktor.utils.io.ReaderJob reader(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, final io.ktor.utils.io.ByteChannel channel, kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1(block, channel, null), 2, null);
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.utils.io.ByteReadChannelOperationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit reader$lambda$6$lambda$5;
                reader$lambda$6$lambda$5 = io.ktor.utils.io.ByteReadChannelOperationsKt.reader$lambda$6$lambda$5(io.ktor.utils.io.ByteChannel.this, (java.lang.Throwable) obj);
                return reader$lambda$6$lambda$5;
            }
        });
        return new io.ktor.utils.io.ReaderJob(io.ktor.utils.io.CloseHookByteWriteChannelKt.onClose(channel, new io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1(launch$default, null)), launch$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit reader$lambda$6$lambda$5(io.ktor.utils.io.ByteChannel byteChannel, java.lang.Throwable th) {
        if (th != null && !byteChannel.isClosedForRead()) {
            byteChannel.cancel(th);
        }
        return kotlin.Unit.INSTANCE;
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
    public static final java.lang.Object readPacket(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation<? super kotlinx.io.Source> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 byteReadChannelOperationsKt$readPacket$1;
        int i2;
        int i3;
        kotlinx.io.Buffer buffer;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1) {
            byteReadChannelOperationsKt$readPacket$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1) continuation;
            if ((byteReadChannelOperationsKt$readPacket$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readPacket$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readPacket$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readPacket$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readPacket$1.I$0;
                    buffer = (kotlinx.io.Buffer) byteReadChannelOperationsKt$readPacket$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readPacket$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i4;
                    byteReadChannel = byteReadChannel2;
                    if (!byteReadChannel.isClosedForRead()) {
                        long j = i3;
                        if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()) > j - buffer.getSizeMut()) {
                            byteReadChannel.getReadBuffer().readTo(buffer, j - buffer.getSizeMut());
                        } else {
                            kotlin.coroutines.jvm.internal.Boxing.boxLong(byteReadChannel.getReadBuffer().transferTo(buffer));
                        }
                        if (buffer.getSizeMut() < i3) {
                            if (byteReadChannel.getReadBuffer().exhausted()) {
                                byteReadChannelOperationsKt$readPacket$1.L$0 = byteReadChannel;
                                byteReadChannelOperationsKt$readPacket$1.L$1 = buffer;
                                byteReadChannelOperationsKt$readPacket$1.I$0 = i3;
                                byteReadChannelOperationsKt$readPacket$1.label = 1;
                                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readPacket$1, 1, null) == coroutine_suspended) {
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
                    throw new java.io.EOFException("Not enough data available, required " + i3 + " bytes but only " + buffer.getSizeMut() + " available");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                i3 = i;
                buffer = new kotlinx.io.Buffer();
                if (buffer.getSizeMut() < i3) {
                }
                if (buffer.getSizeMut() < i3) {
                }
            }
        }
        byteReadChannelOperationsKt$readPacket$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readPacket$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object discardExact(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1 byteReadChannelOperationsKt$discardExact$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1) {
            byteReadChannelOperationsKt$discardExact$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1) continuation;
            if ((byteReadChannelOperationsKt$discardExact$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$discardExact$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$discardExact$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$discardExact$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$discardExact$1.J$0 = j;
                    byteReadChannelOperationsKt$discardExact$1.label = 1;
                    obj = discard(byteReadChannel, j, byteReadChannelOperationsKt$discardExact$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = byteReadChannelOperationsKt$discardExact$1.J$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Number) obj).longValue() >= j) {
                    throw new java.io.EOFException("Unable to discard " + j + " bytes");
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        byteReadChannelOperationsKt$discardExact$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1(continuation);
        obj = byteReadChannelOperationsKt$discardExact$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$discardExact$1.label;
        if (i != 0) {
        }
        if (((java.lang.Number) obj).longValue() >= j) {
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
    public static final java.lang.Object discard(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1 byteReadChannelOperationsKt$discard$1;
        int i;
        long j2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1) {
            byteReadChannelOperationsKt$discard$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1) continuation;
            if ((byteReadChannelOperationsKt$discard$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$discard$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$discard$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$discard$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (j <= 0) {
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(j2 - j);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = byteReadChannelOperationsKt$discard$1.J$1;
                j2 = byteReadChannelOperationsKt$discard$1.J$0;
                io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$discard$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                long j4 = j3;
                byteReadChannel = byteReadChannel2;
                j = j4;
                long min = java.lang.Math.min(j, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), min);
                j -= min;
                if (j <= 0 && !byteReadChannel.isClosedForRead()) {
                    if (getAvailableForRead(byteReadChannel) == 0) {
                        byteReadChannelOperationsKt$discard$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$discard$1.J$0 = j2;
                        byteReadChannelOperationsKt$discard$1.J$1 = j;
                        byteReadChannelOperationsKt$discard$1.label = 1;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$discard$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel;
                        j3 = j;
                        long j42 = j3;
                        byteReadChannel = byteReadChannel2;
                        j = j42;
                    }
                    long min2 = java.lang.Math.min(j, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                    io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), min2);
                    j -= min2;
                    if (j <= 0) {
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(j2 - j);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxLong(j2 - j);
            }
        }
        byteReadChannelOperationsKt$discard$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$discard$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$discard$1.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object discard$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return discard(byteReadChannel, j, continuation);
    }

    public static /* synthetic */ java.lang.Object readUTF8LineTo$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readUTF8LineTo(byteReadChannel, appendable, i, continuation);
    }

    public static final java.lang.Object readUTF8LineTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return m10765readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i, io.ktor.utils.io.LineEndingMode.INSTANCE.m10779getAnyf0jXZW8(), continuation);
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01d5: INVOKE (r14 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: kotlin.jdk7.AutoCloseableKt.closeFinally(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)], block:B:90:0x01d4 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1 A[Catch: all -> 0x006d, LOOP:1: B:18:0x00d1->B:25:0x016e, LOOP_START, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01af, B:58:0x01b0, B:61:0x01bb, B:63:0x01c5, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01af, B:58:0x01b0, B:61:0x01bb, B:63:0x01c5, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01af, B:58:0x01b0, B:61:0x01bb, B:63:0x01c5, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:13:0x0046, B:16:0x00cb, B:18:0x00d1, B:20:0x00db, B:32:0x00e7, B:34:0x00f1, B:39:0x010c, B:41:0x011e, B:42:0x013e, B:45:0x0135, B:27:0x0153, B:25:0x016e, B:47:0x0173, B:49:0x017e, B:55:0x0194, B:56:0x01af, B:58:0x01b0, B:61:0x01bb, B:63:0x01c5, B:69:0x0068, B:76:0x00c1), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: readUTF8LineTo-RRvyBJ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m10765readUTF8LineToRRvyBJ8(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i, int i2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2 byteReadChannelOperationsKt$readUTF8LineTo$2;
        int i3;
        java.lang.Appendable appendable2;
        int i4;
        int i5;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i6;
        kotlinx.io.Buffer buffer;
        java.lang.Appendable appendable3;
        java.lang.Throwable th;
        kotlinx.io.Buffer buffer2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        java.lang.Appendable appendable4;
        kotlinx.io.Buffer buffer3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel4;
        java.lang.Boolean boxBoolean;
        try {
            if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2) {
                byteReadChannelOperationsKt$readUTF8LineTo$2 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2) continuation;
                if ((byteReadChannelOperationsKt$readUTF8LineTo$2.label & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$readUTF8LineTo$2.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = byteReadChannelOperationsKt$readUTF8LineTo$2.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i3 = byteReadChannelOperationsKt$readUTF8LineTo$2.label;
                    java.lang.Throwable th2 = null;
                    if (i3 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (byteReadChannel.getReadBuffer().exhausted()) {
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$0 = byteReadChannel;
                            appendable2 = appendable;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$1 = appendable2;
                            i4 = i;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$0 = i4;
                            i5 = i2;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$1 = i5;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.label = 1;
                            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
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
                                buffer3 = (kotlinx.io.Buffer) byteReadChannelOperationsKt$readUTF8LineTo$2.L$3;
                                buffer = (java.lang.AutoCloseable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$2;
                                appendable4 = (java.lang.Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                                byteReadChannel4 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                byteReadChannel3 = byteReadChannel4;
                                buffer2 = buffer3;
                                appendable3 = appendable4;
                                th = th2;
                                if (byteReadChannel3.getReadBuffer().getBufferField().get(0L) != 10) {
                                }
                                appendable3.append(kotlinx.io.Utf8Kt.readString(buffer2));
                                java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                kotlin.jdk7.AutoCloseableKt.closeFinally(buffer, th);
                                return boxBoolean2;
                            }
                            if (i3 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$1;
                            i4 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                            buffer2 = (kotlinx.io.Buffer) byteReadChannelOperationsKt$readUTF8LineTo$2.L$3;
                            buffer = (java.lang.AutoCloseable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$2;
                            appendable3 = (java.lang.Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                            byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
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
                                            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
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
                                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, io.ktor.utils.io.LineEndingMode.INSTANCE.m10781getCRLFf0jXZW8());
                                            kotlin.coroutines.jvm.internal.Boxing.boxLong(io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel3.getReadBuffer(), 1L));
                                        } else {
                                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, io.ktor.utils.io.LineEndingMode.INSTANCE.m10780getCRf0jXZW8());
                                        }
                                        appendable3.append(kotlinx.io.Utf8Kt.readString(buffer2));
                                        java.lang.Boolean boxBoolean22 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                        kotlin.jdk7.AutoCloseableKt.closeFinally(buffer, th);
                                        return boxBoolean22;
                                    }
                                    if (readByte == 10) {
                                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, io.ktor.utils.io.LineEndingMode.INSTANCE.m10782getLFf0jXZW8());
                                        appendable3.append(kotlinx.io.Utf8Kt.readString(buffer2));
                                        java.lang.Boolean boxBoolean3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                        kotlin.jdk7.AutoCloseableKt.closeFinally(buffer, th);
                                        return boxBoolean3;
                                    }
                                    buffer2.writeByte(readByte);
                                }
                                if (buffer2.getSizeMut() >= i4) {
                                    throw new io.ktor.utils.io.charsets.TooLongLineException("Line exceeds limit of " + i4 + " characters");
                                }
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$0 = byteReadChannel3;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$1 = appendable3;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$2 = buffer;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.L$3 = buffer2;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.I$0 = i4;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.I$1 = i6;
                                byteReadChannelOperationsKt$readUTF8LineTo$2.label = 3;
                                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(buffer2.getSizeMut() > 0);
                            if (boxBoolean.booleanValue()) {
                                appendable3.append(kotlinx.io.Utf8Kt.readString(buffer2));
                            }
                            kotlin.jdk7.AutoCloseableKt.closeFinally(buffer, th);
                            return boxBoolean;
                        }
                        i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$1;
                        i4 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                        java.lang.Appendable appendable5 = (java.lang.Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        appendable2 = appendable5;
                    }
                    if (!byteReadChannel2.isClosedForRead()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    buffer = new kotlinx.io.Buffer();
                    appendable3 = appendable2;
                    th = null;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel5 = byteReadChannel2;
                    buffer2 = buffer;
                    byteReadChannel3 = byteReadChannel5;
                    while (!byteReadChannel3.isClosedForRead()) {
                    }
                    boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(buffer2.getSizeMut() > 0);
                    if (boxBoolean.booleanValue()) {
                    }
                    kotlin.jdk7.AutoCloseableKt.closeFinally(buffer, th);
                    return boxBoolean;
                }
            }
            if (i3 != 0) {
            }
            if (!byteReadChannel2.isClosedForRead()) {
            }
        } finally {
        }
        byteReadChannelOperationsKt$readUTF8LineTo$2 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readUTF8LineTo$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = byteReadChannelOperationsKt$readUTF8LineTo$2.label;
        java.lang.Throwable th22 = null;
    }

    /* renamed from: readUTF8LineTo-RRvyBJ8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m10766readUTF8LineToRRvyBJ8$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            i2 = io.ktor.utils.io.LineEndingMode.INSTANCE.m10779getAnyf0jXZW8();
        }
        return m10765readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i, i2, continuation);
    }

    private static final void readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(int i, int i2) {
        if (io.ktor.utils.io.LineEndingMode.m10772containslTjpP64(i, i2)) {
            return;
        }
        throw new java.io.IOException("Unexpected line ending " + ((java.lang.Object) io.ktor.utils.io.LineEndingMode.m10777toStringimpl(i2)) + ", while expected " + ((java.lang.Object) io.ktor.utils.io.LineEndingMode.m10777toStringimpl(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object read(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.jvm.functions.Function4<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.Integer>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$read$1 byteReadChannelOperationsKt$read$1;
        int i;
        kotlinx.io.Buffer buffer;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlinx.io.Segment segment;
        int i2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$read$1) {
            byteReadChannelOperationsKt$read$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$read$1) continuation;
            if ((byteReadChannelOperationsKt$read$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$read$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$read$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$read$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxInt(-1);
                    }
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperationsKt$read$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$read$1.L$1 = function4;
                        byteReadChannelOperationsKt$read$1.label = 1;
                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$read$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        intRef = (kotlin.jvm.internal.Ref.IntRef) byteReadChannelOperationsKt$read$1.L$3;
                        segment = (kotlinx.io.Segment) byteReadChannelOperationsKt$read$1.L$2;
                        buffer = (kotlinx.io.Buffer) byteReadChannelOperationsKt$read$1.L$1;
                        intRef2 = (kotlin.jvm.internal.Ref.IntRef) byteReadChannelOperationsKt$read$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        intRef.element = ((java.lang.Number) obj).intValue();
                        i2 = intRef2.element;
                        if (i2 != 0) {
                            if (i2 < 0) {
                                throw new java.lang.IllegalStateException("Returned negative read bytes count");
                            }
                            if (i2 > segment.getSize()) {
                                throw new java.lang.IllegalStateException("Returned too many bytes");
                            }
                            buffer.skip(i2);
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef2.element);
                    }
                    function4 = (kotlin.jvm.functions.Function4) byteReadChannelOperationsKt$read$1.L$1;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$read$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!byteReadChannel.isClosedForRead()) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxInt(-1);
                }
                kotlin.jvm.internal.Ref.IntRef intRef3 = new kotlin.jvm.internal.Ref.IntRef();
                kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                kotlinx.io.Buffer bufferField = byteReadChannel.getReadBuffer().getBufferField();
                if (!(!bufferField.exhausted())) {
                    throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
                }
                kotlinx.io.Segment head = bufferField.getHead();
                kotlin.jvm.internal.Intrinsics.checkNotNull(head);
                byte[] dataAsByteArray = head.dataAsByteArray(true);
                int pos = head.getPos();
                int limit = head.getLimit();
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(pos);
                java.lang.Integer boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(limit);
                byteReadChannelOperationsKt$read$1.L$0 = intRef3;
                byteReadChannelOperationsKt$read$1.L$1 = bufferField;
                byteReadChannelOperationsKt$read$1.L$2 = head;
                byteReadChannelOperationsKt$read$1.L$3 = intRef3;
                byteReadChannelOperationsKt$read$1.label = 2;
                java.lang.Object invoke = function4.invoke(dataAsByteArray, boxInt, boxInt2, byteReadChannelOperationsKt$read$1);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                buffer = bufferField;
                intRef = intRef3;
                intRef2 = intRef;
                obj = invoke;
                segment = head;
                intRef.element = ((java.lang.Number) obj).intValue();
                i2 = intRef2.element;
                if (i2 != 0) {
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef2.element);
            }
        }
        byteReadChannelOperationsKt$read$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$read$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$read$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$read$1.label;
        if (i != 0) {
        }
        if (!byteReadChannel.isClosedForRead()) {
        }
    }

    private static final java.lang.Object read$$forInline(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.jvm.functions.Function4<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.Integer>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        if (byteReadChannel.getReadBuffer().exhausted()) {
            kotlin.jvm.internal.InlineMarker.mark(0);
            io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, continuation, 1, null);
            kotlin.jvm.internal.InlineMarker.mark(1);
        }
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer bufferField = byteReadChannel.getReadBuffer().getBufferField();
        if (!(!bufferField.exhausted())) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = bufferField.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        java.lang.Object dataAsByteArray = head.dataAsByteArray(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(head.getPos());
        int intValue = java.lang.Integer.valueOf(head.getLimit()).intValue();
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(valueOf.intValue());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(intValue);
        kotlin.jvm.internal.InlineMarker.mark(3);
        intRef.element = ((java.lang.Number) function4.invoke((byte[]) dataAsByteArray, valueOf2, valueOf3, null)).intValue();
        int intValue2 = java.lang.Integer.valueOf(intRef.element).intValue();
        if (intValue2 != 0) {
            if (intValue2 < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (intValue2 > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            bufferField.skip(intValue2);
        }
        return java.lang.Integer.valueOf(intRef.element);
    }

    public static final int getAvailableForRead(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
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
    public static final java.lang.Object readFully(io.ktor.utils.io.ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 byteReadChannelOperationsKt$readFully$1;
        int i3;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1) {
            byteReadChannelOperationsKt$readFully$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1) continuation;
            if ((byteReadChannelOperationsKt$readFully$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readFully$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteReadChannelOperationsKt$readFully$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = byteReadChannelOperationsKt$readFully$1.label;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i2 > i && byteReadChannel.isClosedForRead()) {
                        throw new java.io.EOFException("Channel is already closed");
                    }
                    if (i < i2) {
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = byteReadChannelOperationsKt$readFully$1.I$1;
                    int i5 = byteReadChannelOperationsKt$readFully$1.I$0;
                    byte[] bArr2 = (byte[]) byteReadChannelOperationsKt$readFully$1.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$readFully$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byte[] bArr3 = bArr2;
                    i = i4;
                    byteReadChannel = byteReadChannel2;
                    i2 = i5;
                    bArr = bArr3;
                    if (byteReadChannel.isClosedForRead()) {
                        int min = java.lang.Math.min(i2 - i, (int) io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) + i;
                        kotlinx.io.SourcesKt.readTo(byteReadChannel.getReadBuffer(), bArr, i, min);
                        i = min;
                        if (i < i2) {
                            if (byteReadChannel.getReadBuffer().exhausted()) {
                                byteReadChannelOperationsKt$readFully$1.L$0 = byteReadChannel;
                                byteReadChannelOperationsKt$readFully$1.L$1 = bArr;
                                byteReadChannelOperationsKt$readFully$1.I$0 = i2;
                                byteReadChannelOperationsKt$readFully$1.I$1 = i;
                                byteReadChannelOperationsKt$readFully$1.label = 1;
                                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readFully$1, 1, null) == coroutine_suspended) {
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
                                throw new java.io.EOFException("Channel is already closed");
                            }
                        } else {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        byteReadChannelOperationsKt$readFully$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1(continuation);
        java.lang.Object obj2 = byteReadChannelOperationsKt$readFully$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = byteReadChannelOperationsKt$readFully$1.label;
        if (i3 != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object readFully$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, byte[] bArr, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return readFully(byteReadChannel, bArr, i, i2, continuation);
    }

    public static final void rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        java.lang.Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        java.lang.Throwable closedCause = byteWriteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteChannel byteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "<this>");
        java.lang.Throwable closedCause = byteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static /* synthetic */ java.lang.Object readUntil$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = Long.MAX_VALUE;
        }
        return readUntil(byteReadChannel, byteString, byteWriteChannel, j, (i & 8) != 0 ? false : z, continuation);
    }

    public static final java.lang.Object readUntil(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return new io.ktor.utils.io.ByteChannelScanner(byteReadChannel, byteString, byteWriteChannel, j).findNext$ktor_io(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object skipIfFound(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1 byteReadChannelOperationsKt$skipIfFound$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1) {
            byteReadChannelOperationsKt$skipIfFound$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1) continuation;
            if ((byteReadChannelOperationsKt$skipIfFound$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$skipIfFound$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$skipIfFound$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$skipIfFound$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
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
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    byteString = (kotlinx.io.bytestring.ByteString) byteReadChannelOperationsKt$skipIfFound$1.L$1;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$skipIfFound$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, byteString)) {
                    long size2 = byteString.getSize();
                    byteReadChannelOperationsKt$skipIfFound$1.L$0 = null;
                    byteReadChannelOperationsKt$skipIfFound$1.L$1 = null;
                    byteReadChannelOperationsKt$skipIfFound$1.label = 2;
                    if (discard(byteReadChannel, size2, byteReadChannelOperationsKt$skipIfFound$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
        }
        byteReadChannelOperationsKt$skipIfFound$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1(continuation);
        obj = byteReadChannelOperationsKt$skipIfFound$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$skipIfFound$1.label;
        if (i != 0) {
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, byteString)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object peek(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation<? super kotlinx.io.bytestring.ByteString> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1 byteReadChannelOperationsKt$peek$1;
        java.lang.Object obj;
        int i2;
        if (continuation instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1) {
            byteReadChannelOperationsKt$peek$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1) continuation;
            if ((byteReadChannelOperationsKt$peek$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$peek$1.label -= Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$peek$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$peek$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
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
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = byteReadChannelOperationsKt$peek$1.I$0;
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) byteReadChannelOperationsKt$peek$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                return kotlinx.io.ByteStringsKt.readByteString(byteReadChannel.getReadBuffer().peek(), i);
            }
        }
        byteReadChannelOperationsKt$peek$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1(continuation);
        obj = byteReadChannelOperationsKt$peek$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$peek$1.label;
        if (i2 != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
