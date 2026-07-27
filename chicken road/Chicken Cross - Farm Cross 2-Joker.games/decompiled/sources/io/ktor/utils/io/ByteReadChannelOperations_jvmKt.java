package io.ktor.utils.io;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt;
import io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.SourcesJvmKt;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: ByteReadChannelOperations.jvm.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0014\u0010\b\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\b\u001a%\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u0007\u0010\u0019\u001a4\u0010\u001c\u001a\u00020\u0013*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u0014\b\b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0017H\u0086H¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljava/nio/ByteBuffer;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "(Ljava/nio/ByteBuffer;)Lio/ktor/utils/io/ByteReadChannel;", "buffer", "", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/bytestring/ByteString;", "ByteString", "(Ljava/nio/ByteBuffer;)Lkotlinx/io/bytestring/ByteString;", "Ljava/nio/channels/WritableByteChannel;", "channel", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/channels/WritableByteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delimiter", "", "skipDelimiter", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFully", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/jvm/functions/Function1;)I", "min", "consumer", "read", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteReadChannelOperations_jvmKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readAvailable(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, Continuation<? super Integer> continuation) {
        ByteReadChannelOperations_jvmKt$readAvailable$1 byteReadChannelOperations_jvmKt$readAvailable$1;
        int i;
        if (continuation instanceof ByteReadChannelOperations_jvmKt$readAvailable$1) {
            byteReadChannelOperations_jvmKt$readAvailable$1 = (ByteReadChannelOperations_jvmKt$readAvailable$1) continuation;
            if ((byteReadChannelOperations_jvmKt$readAvailable$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$readAvailable$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperations_jvmKt$readAvailable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$readAvailable$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return Boxing.boxInt(-1);
                    }
                    if (byteReadChannel.getReadBuffer().exhausted()) {
                        byteReadChannelOperations_jvmKt$readAvailable$1.L$0 = byteReadChannel;
                        byteReadChannelOperations_jvmKt$readAvailable$1.L$1 = byteBuffer;
                        byteReadChannelOperations_jvmKt$readAvailable$1.label = 1;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$readAvailable$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ByteBuffer byteBuffer2 = (ByteBuffer) byteReadChannelOperations_jvmKt$readAvailable$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperations_jvmKt$readAvailable$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteBuffer = byteBuffer2;
                    byteReadChannel = byteReadChannel2;
                }
                return !byteReadChannel.isClosedForRead() ? Boxing.boxInt(-1) : Boxing.boxInt(SourcesJvmKt.readAtMostTo(byteReadChannel.getReadBuffer(), byteBuffer));
            }
        }
        byteReadChannelOperations_jvmKt$readAvailable$1 = new ByteReadChannelOperations_jvmKt$readAvailable$1(continuation);
        Object obj2 = byteReadChannelOperations_jvmKt$readAvailable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$readAvailable$1.label;
        if (i != 0) {
        }
        if (!byteReadChannel.isClosedForRead()) {
        }
    }

    public static final ByteString ByteString(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        byte[] bArr = new byte[buffer.remaining()];
        buffer.mark();
        buffer.get(bArr);
        buffer.reset();
        return new ByteString(bArr, 0, 0, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f7 -> B:11:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, final WritableByteChannel writableByteChannel, final long j, Continuation<? super Long> continuation) {
        ByteReadChannelOperations_jvmKt$copyTo$1 byteReadChannelOperations_jvmKt$copyTo$1;
        int i;
        final Ref.LongRef longRef;
        Function1 function1;
        Throwable closedCause;
        ByteReadChannel byteReadChannel2;
        ByteReadChannel byteReadChannel3;
        Function1 function12;
        Ref.LongRef longRef2;
        long j2;
        if (continuation instanceof ByteReadChannelOperations_jvmKt$copyTo$1) {
            byteReadChannelOperations_jvmKt$copyTo$1 = (ByteReadChannelOperations_jvmKt$copyTo$1) continuation;
            if ((byteReadChannelOperations_jvmKt$copyTo$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$copyTo$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperations_jvmKt$copyTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$copyTo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j < 0) {
                        throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
                    }
                    if ((writableByteChannel instanceof SelectableChannel) && !((SelectableChannel) writableByteChannel).isBlocking()) {
                        throw new IllegalArgumentException("Non-blocking channels are not supported");
                    }
                    if (byteReadChannel.isClosedForRead()) {
                        Throwable closedCause2 = byteReadChannel.getClosedCause();
                        if (closedCause2 != null) {
                            throw closedCause2;
                        }
                        return Boxing.boxLong(0L);
                    }
                    longRef = new Ref.LongRef();
                    function1 = new Function1() { // from class: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit copyTo$lambda$3;
                            copyTo$lambda$3 = ByteReadChannelOperations_jvmKt.copyTo$lambda$3(j, longRef, writableByteChannel, (ByteBuffer) obj2);
                            return copyTo$lambda$3;
                        }
                    };
                } else if (i == 1) {
                    int i2 = byteReadChannelOperations_jvmKt$copyTo$1.I$0;
                    long j3 = byteReadChannelOperations_jvmKt$copyTo$1.J$0;
                    ByteReadChannel byteReadChannel4 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$3;
                    function1 = (Function1) byteReadChannelOperations_jvmKt$copyTo$1.L$2;
                    Ref.LongRef longRef3 = (Ref.LongRef) byteReadChannelOperations_jvmKt$copyTo$1.L$1;
                    ByteReadChannel byteReadChannel5 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        throw new EOFException("Not enough bytes available: required " + i2 + " but " + ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel4) + " available");
                    }
                    ByteReadPacketExtensions_jvmKt.read(byteReadChannel4.getReadBuffer(), function1);
                    j = j3;
                    longRef = longRef3;
                    byteReadChannel = byteReadChannel5;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = byteReadChannelOperations_jvmKt$copyTo$1.J$0;
                    byteReadChannel3 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$3;
                    function12 = (Function1) byteReadChannelOperations_jvmKt$copyTo$1.L$2;
                    longRef2 = (Ref.LongRef) byteReadChannelOperations_jvmKt$copyTo$1.L$1;
                    byteReadChannel2 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ByteReadPacketExtensions_jvmKt.read(byteReadChannel3.getReadBuffer(), function12);
                    }
                    longRef = longRef2;
                    function1 = function12;
                    j = j2;
                    byteReadChannel = byteReadChannel2;
                }
                if (longRef.element < j || byteReadChannel.isClosedForRead()) {
                    closedCause = byteReadChannel.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    return Boxing.boxLong(longRef.element);
                }
                byteReadChannelOperations_jvmKt$copyTo$1.L$0 = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.L$1 = longRef;
                byteReadChannelOperations_jvmKt$copyTo$1.L$2 = function1;
                byteReadChannelOperations_jvmKt$copyTo$1.L$3 = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.J$0 = j;
                byteReadChannelOperations_jvmKt$copyTo$1.label = 2;
                Object awaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$copyTo$1, 1, null);
                if (awaitContent$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteReadChannel2 = byteReadChannel;
                long j4 = j;
                byteReadChannel3 = byteReadChannel2;
                function12 = function1;
                longRef2 = longRef;
                obj = awaitContent$default;
                j2 = j4;
                if (((Boolean) obj).booleanValue()) {
                }
                longRef = longRef2;
                function1 = function12;
                j = j2;
                byteReadChannel = byteReadChannel2;
                if (longRef.element < j) {
                }
                closedCause = byteReadChannel.getClosedCause();
                if (closedCause != null) {
                }
            }
        }
        byteReadChannelOperations_jvmKt$copyTo$1 = new ByteReadChannelOperations_jvmKt$copyTo$1(continuation);
        Object obj2 = byteReadChannelOperations_jvmKt$copyTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$copyTo$1.label;
        if (i != 0) {
        }
        if (longRef.element < j) {
        }
        closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
        }
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, WritableByteChannel writableByteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, writableByteChannel, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyTo$lambda$3(long j, Ref.LongRef longRef, WritableByteChannel writableByteChannel, ByteBuffer bb) {
        Intrinsics.checkNotNullParameter(bb, "bb");
        long j2 = j - longRef.element;
        if (j2 < bb.remaining()) {
            int limit = bb.limit();
            bb.limit(bb.position() + ((int) j2));
            while (bb.hasRemaining()) {
                writableByteChannel.write(bb);
            }
            bb.limit(limit);
            longRef.element += j2;
        } else {
            long j3 = 0;
            while (bb.hasRemaining()) {
                j3 += writableByteChannel.write(bb);
            }
            longRef.element += j3;
        }
        return Unit.INSTANCE;
    }

    public static final Object skipDelimiter(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, Continuation<? super Unit> continuation) {
        Object skipDelimiter = skipDelimiter(byteReadChannel, ByteString(byteBuffer), continuation);
        return skipDelimiter == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? skipDelimiter : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object skipDelimiter(ByteReadChannel byteReadChannel, ByteString byteString, Continuation<? super Unit> continuation) {
        ByteReadChannelOperations_jvmKt$skipDelimiter$2 byteReadChannelOperations_jvmKt$skipDelimiter$2;
        int i;
        int i2;
        ByteReadChannel byteReadChannel2;
        int i3;
        ByteString byteString2;
        if (continuation instanceof ByteReadChannelOperations_jvmKt$skipDelimiter$2) {
            byteReadChannelOperations_jvmKt$skipDelimiter$2 = (ByteReadChannelOperations_jvmKt$skipDelimiter$2) continuation;
            if ((byteReadChannelOperations_jvmKt$skipDelimiter$2.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$skipDelimiter$2.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperations_jvmKt$skipDelimiter$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$skipDelimiter$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int size = byteString.getSize();
                    i2 = 0;
                    byteReadChannel2 = byteReadChannel;
                    i3 = size;
                    byteString2 = byteString;
                    if (i2 >= i3) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = byteReadChannelOperations_jvmKt$skipDelimiter$2.I$1;
                    int i4 = byteReadChannelOperations_jvmKt$skipDelimiter$2.I$0;
                    ByteString byteString3 = (ByteString) byteReadChannelOperations_jvmKt$skipDelimiter$2.L$1;
                    ByteReadChannel byteReadChannel3 = (ByteReadChannel) byteReadChannelOperations_jvmKt$skipDelimiter$2.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Number) obj).byteValue() != byteString3.get(i4)) {
                        byteString2 = byteString3;
                        i2 = i4 + 1;
                        byteReadChannel2 = byteReadChannel3;
                        if (i2 >= i3) {
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.L$0 = byteReadChannel2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.L$1 = byteString2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.I$0 = i2;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.I$1 = i3;
                            byteReadChannelOperations_jvmKt$skipDelimiter$2.label = 1;
                            Object readByte = ByteReadChannelOperationsKt.readByte(byteReadChannel2, byteReadChannelOperations_jvmKt$skipDelimiter$2);
                            if (readByte == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteReadChannel3 = byteReadChannel2;
                            i4 = i2;
                            byteString3 = byteString2;
                            obj = readByte;
                            if (((Number) obj).byteValue() != byteString3.get(i4)) {
                                throw new IllegalStateException("Delimiter is not found");
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        byteReadChannelOperations_jvmKt$skipDelimiter$2 = new ByteReadChannelOperations_jvmKt$skipDelimiter$2(continuation);
        Object obj2 = byteReadChannelOperations_jvmKt$skipDelimiter$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$skipDelimiter$2.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFully(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, Continuation<? super Unit> continuation) {
        ByteReadChannelOperations_jvmKt$readFully$1 byteReadChannelOperations_jvmKt$readFully$1;
        int i;
        if (continuation instanceof ByteReadChannelOperations_jvmKt$readFully$1) {
            byteReadChannelOperations_jvmKt$readFully$1 = (ByteReadChannelOperations_jvmKt$readFully$1) continuation;
            if ((byteReadChannelOperations_jvmKt$readFully$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$readFully$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperations_jvmKt$readFully$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$readFully$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!byteBuffer.hasRemaining()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ByteBuffer byteBuffer2 = (ByteBuffer) byteReadChannelOperations_jvmKt$readFully$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperations_jvmKt$readFully$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteBuffer = byteBuffer2;
                    byteReadChannel = byteReadChannel2;
                    if (!((Boolean) obj).booleanValue()) {
                        SourcesJvmKt.readAtMostTo(byteReadChannel.getReadBuffer(), byteBuffer);
                        if (!byteBuffer.hasRemaining()) {
                            byteReadChannelOperations_jvmKt$readFully$1.L$0 = byteReadChannel;
                            byteReadChannelOperations_jvmKt$readFully$1.L$1 = byteBuffer;
                            byteReadChannelOperations_jvmKt$readFully$1.label = 1;
                            obj = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$readFully$1, 1, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (!((Boolean) obj).booleanValue()) {
                                throw new EOFException("Not enough bytes available: expected " + byteBuffer.remaining() + " more bytes");
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        byteReadChannelOperations_jvmKt$readFully$1 = new ByteReadChannelOperations_jvmKt$readFully$1(continuation);
        Object obj2 = byteReadChannelOperations_jvmKt$readFully$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$readFully$1.label;
        if (i != 0) {
        }
    }

    public static final int readAvailable(ByteReadChannel byteReadChannel, Function1<? super ByteBuffer, Integer> block) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (byteReadChannel.isClosedForRead() || byteReadChannel.getReadBuffer().exhausted()) {
            return -1;
        }
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Buffer bufferField = byteReadChannel.getReadBuffer().getBufferField();
        if (bufferField.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty".toString());
        }
        Segment head = bufferField.getHead();
        Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        ByteBuffer wrap = ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos);
        Intrinsics.checkNotNull(wrap);
        int intValue = block.invoke(wrap).intValue();
        if (intValue != 0) {
            if (intValue < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (intValue > head.getSize()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bufferField.skip(intValue);
        }
        return intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object read(ByteReadChannel byteReadChannel, int i, Function1<? super ByteBuffer, Unit> function1, Continuation<? super Unit> continuation) {
        ByteReadChannelOperations_jvmKt$read$1 byteReadChannelOperations_jvmKt$read$1;
        int i2;
        if (continuation instanceof ByteReadChannelOperations_jvmKt$read$1) {
            byteReadChannelOperations_jvmKt$read$1 = (ByteReadChannelOperations_jvmKt$read$1) continuation;
            if ((byteReadChannelOperations_jvmKt$read$1.label & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$read$1.label -= Integer.MIN_VALUE;
                Object obj = byteReadChannelOperations_jvmKt$read$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperations_jvmKt$read$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i < 0) {
                        throw new IllegalArgumentException("min should be positive or zero".toString());
                    }
                    if (i > 0) {
                        byteReadChannelOperations_jvmKt$read$1.L$0 = byteReadChannel;
                        byteReadChannelOperations_jvmKt$read$1.L$1 = function1;
                        byteReadChannelOperations_jvmKt$read$1.I$0 = i;
                        byteReadChannelOperations_jvmKt$read$1.label = 1;
                        obj = byteReadChannel.awaitContent(i, byteReadChannelOperations_jvmKt$read$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        byteReadChannelOperations_jvmKt$read$1.L$0 = byteReadChannel;
                        byteReadChannelOperations_jvmKt$read$1.L$1 = function1;
                        byteReadChannelOperations_jvmKt$read$1.label = 2;
                        obj = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$read$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                } else if (i2 == 1) {
                    i = byteReadChannelOperations_jvmKt$read$1.I$0;
                    function1 = (Function1) byteReadChannelOperations_jvmKt$read$1.L$1;
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperations_jvmKt$read$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        throw new EOFException("Not enough bytes available: required " + i + " but " + ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel) + " available");
                    }
                    ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (Function1) byteReadChannelOperations_jvmKt$read$1.L$1;
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperations_jvmKt$read$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        byteReadChannelOperations_jvmKt$read$1 = new ByteReadChannelOperations_jvmKt$read$1(continuation);
        Object obj2 = byteReadChannelOperations_jvmKt$read$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperations_jvmKt$read$1.label;
        if (i2 != 0) {
        }
        return Unit.INSTANCE;
    }

    private static final Object read$$forInline(ByteReadChannel byteReadChannel, int i, Function1<? super ByteBuffer, Unit> function1, Continuation<? super Unit> continuation) {
        if (i < 0) {
            throw new IllegalArgumentException("min should be positive or zero".toString());
        }
        if (i > 0) {
            InlineMarker.mark(0);
            Object awaitContent = byteReadChannel.awaitContent(i, continuation);
            InlineMarker.mark(1);
            if (!((Boolean) awaitContent).booleanValue()) {
                throw new EOFException("Not enough bytes available: required " + i + " but " + ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel) + " available");
            }
            ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
        } else {
            InlineMarker.mark(0);
            Object awaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, continuation, 1, null);
            InlineMarker.mark(1);
            if (((Boolean) awaitContent$default).booleanValue()) {
                ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object read$default(ByteReadChannel byteReadChannel, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if (i < 0) {
            throw new IllegalArgumentException("min should be positive or zero".toString());
        }
        if (i > 0) {
            InlineMarker.mark(0);
            Object awaitContent = byteReadChannel.awaitContent(i, continuation);
            InlineMarker.mark(1);
            if (!((Boolean) awaitContent).booleanValue()) {
                throw new EOFException("Not enough bytes available: required " + i + " but " + ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel) + " available");
            }
            ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
        } else {
            InlineMarker.mark(0);
            Object awaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, continuation, 1, null);
            InlineMarker.mark(1);
            if (((Boolean) awaitContent$default).booleanValue()) {
                ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function1);
            }
        }
        return Unit.INSTANCE;
    }

    public static final ByteReadChannel ByteReadChannel(ByteBuffer content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Buffer buffer = new Buffer();
        BytePacketBuilderExtensions_jvmKt.writeFully(buffer, content);
        return ByteChannelCtorKt.ByteReadChannel(buffer);
    }
}
