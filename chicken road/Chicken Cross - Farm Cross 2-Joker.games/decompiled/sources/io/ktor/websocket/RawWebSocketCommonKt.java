package io.ktor.websocket;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.MemoryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.io.Buffer;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0087@¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/io/Source;", "", "maskKey", "mask", "(Lkotlinx/io/Source;I)Lkotlinx/io/Source;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/websocket/Frame;", "frame", "", "masking", "", "writeFrame", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/websocket/Frame;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "", "maxFrameSize", "lastOpcode", "readFrame", "(Lio/ktor/utils/io/ByteReadChannel;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RawWebSocketCommonKt {
    private static final Source mask(final Source source, final int i) {
        return (Source) MemoryKt.withMemory(4, new Function1() { // from class: io.ktor.websocket.RawWebSocketCommonKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Source mask$lambda$2;
                mask$lambda$2 = RawWebSocketCommonKt.mask$lambda$2(i, source, (byte[]) obj);
                return mask$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Source mask$lambda$2(int i, Source source, byte[] maskMemory) {
        Intrinsics.checkNotNullParameter(maskMemory, "maskMemory");
        MemoryKt.storeIntAt(maskMemory, 0, i);
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        int remaining = (int) ByteReadPacketKt.getRemaining(source);
        for (int i2 = 0; i2 < remaining; i2++) {
            buffer2.writeByte((byte) (source.readByte() ^ maskMemory[i2 % 4]));
        }
        return buffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeFrame(ByteWriteChannel byteWriteChannel, Frame frame, boolean z, Continuation<? super Unit> continuation) {
        RawWebSocketCommonKt$writeFrame$1 rawWebSocketCommonKt$writeFrame$1;
        Frame frame2;
        int i;
        boolean z2;
        int i2;
        int i3;
        ByteWriteChannel byteWriteChannel2;
        int i4;
        Frame frame3;
        boolean z3;
        boolean z4;
        Frame frame4;
        ByteWriteChannel byteWriteChannel3;
        Source ByteReadPacket$default;
        int nextInt;
        ByteWriteChannel byteWriteChannel4;
        if (continuation instanceof RawWebSocketCommonKt$writeFrame$1) {
            rawWebSocketCommonKt$writeFrame$1 = (RawWebSocketCommonKt$writeFrame$1) continuation;
            if ((rawWebSocketCommonKt$writeFrame$1.label & Integer.MIN_VALUE) != 0) {
                rawWebSocketCommonKt$writeFrame$1.label -= Integer.MIN_VALUE;
                Object obj = rawWebSocketCommonKt$writeFrame$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rawWebSocketCommonKt$writeFrame$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        int length = frame.getData().length;
                        byte opcode = (byte) ((frame.getFin() ? 128 : 0) | (frame.getRsv1() ? 64 : 0) | (frame.getRsv2() ? 32 : 0) | (frame.getRsv3() ? 16 : 0) | frame.getFrameType().getOpcode());
                        rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = frame;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z;
                        rawWebSocketCommonKt$writeFrame$1.I$0 = length;
                        rawWebSocketCommonKt$writeFrame$1.label = 1;
                        if (ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, opcode, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        frame2 = frame;
                        i = length;
                        z2 = z;
                        i2 = i >= 126 ? i : i <= 65535 ? 126 : 127;
                        i3 = z2 ? 128 : 0;
                        rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = frame2;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z2;
                        rawWebSocketCommonKt$writeFrame$1.I$0 = i;
                        rawWebSocketCommonKt$writeFrame$1.I$1 = i2;
                        rawWebSocketCommonKt$writeFrame$1.label = 2;
                        if (ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, (byte) (i3 | i2), rawWebSocketCommonKt$writeFrame$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteWriteChannel2 = byteWriteChannel;
                        i4 = i2;
                        frame3 = frame2;
                        z3 = z2;
                        if (i4 != 126) {
                            rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel2;
                            rawWebSocketCommonKt$writeFrame$1.L$1 = frame3;
                            rawWebSocketCommonKt$writeFrame$1.Z$0 = z3;
                            rawWebSocketCommonKt$writeFrame$1.label = 3;
                            if (ByteWriteChannelOperationsKt.writeShort(byteWriteChannel2, (short) i, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i4 == 127) {
                                rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel2;
                                rawWebSocketCommonKt$writeFrame$1.L$1 = frame3;
                                rawWebSocketCommonKt$writeFrame$1.Z$0 = z3;
                                rawWebSocketCommonKt$writeFrame$1.label = 4;
                                if (ByteWriteChannelOperationsKt.writeLong(byteWriteChannel2, i, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            ByteReadPacket$default = ByteReadPacketKt.ByteReadPacket$default(frame3.getData(), 0, 0, 6, null);
                            if (!z3) {
                                nextInt = Random.INSTANCE.nextInt();
                                rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel2;
                                rawWebSocketCommonKt$writeFrame$1.L$1 = ByteReadPacket$default;
                                rawWebSocketCommonKt$writeFrame$1.I$0 = nextInt;
                                rawWebSocketCommonKt$writeFrame$1.label = 5;
                                if (ByteWriteChannelOperationsKt.writeInt(byteWriteChannel2, nextInt, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteWriteChannel4 = byteWriteChannel2;
                                ByteReadPacket$default = mask(ByteReadPacket$default, nextInt);
                                byteWriteChannel2 = byteWriteChannel4;
                                rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                                rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                                rawWebSocketCommonKt$writeFrame$1.label = 6;
                                if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel2, ByteReadPacket$default, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            if (z3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                            rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                            rawWebSocketCommonKt$writeFrame$1.label = 6;
                            if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel2, ByteReadPacket$default, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        z4 = z3;
                        frame4 = frame3;
                        byteWriteChannel3 = byteWriteChannel2;
                        frame3 = frame4;
                        byteWriteChannel2 = byteWriteChannel3;
                        z3 = z4;
                        ByteReadPacket$default = ByteReadPacketKt.ByteReadPacket$default(frame3.getData(), 0, 0, 6, null);
                        if (!z3) {
                        }
                    case 1:
                        int i5 = rawWebSocketCommonKt$writeFrame$1.I$0;
                        boolean z5 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                        Frame frame5 = (Frame) rawWebSocketCommonKt$writeFrame$1.L$1;
                        ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = z5;
                        frame2 = frame5;
                        i = i5;
                        byteWriteChannel = byteWriteChannel5;
                        if (i >= 126) {
                        }
                        if (z2) {
                        }
                        rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = frame2;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z2;
                        rawWebSocketCommonKt$writeFrame$1.I$0 = i;
                        rawWebSocketCommonKt$writeFrame$1.I$1 = i2;
                        rawWebSocketCommonKt$writeFrame$1.label = 2;
                        if (ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, (byte) (i3 | i2), rawWebSocketCommonKt$writeFrame$1) != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        i4 = rawWebSocketCommonKt$writeFrame$1.I$1;
                        i = rawWebSocketCommonKt$writeFrame$1.I$0;
                        z3 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                        frame3 = (Frame) rawWebSocketCommonKt$writeFrame$1.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (i4 != 126) {
                        }
                        z4 = z3;
                        frame4 = frame3;
                        byteWriteChannel3 = byteWriteChannel2;
                        frame3 = frame4;
                        byteWriteChannel2 = byteWriteChannel3;
                        z3 = z4;
                        ByteReadPacket$default = ByteReadPacketKt.ByteReadPacket$default(frame3.getData(), 0, 0, 6, null);
                        if (!z3) {
                        }
                        break;
                    case 3:
                    case 4:
                        z4 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                        frame4 = (Frame) rawWebSocketCommonKt$writeFrame$1.L$1;
                        byteWriteChannel3 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        frame3 = frame4;
                        byteWriteChannel2 = byteWriteChannel3;
                        z3 = z4;
                        ByteReadPacket$default = ByteReadPacketKt.ByteReadPacket$default(frame3.getData(), 0, 0, 6, null);
                        if (!z3) {
                        }
                        break;
                    case 5:
                        nextInt = rawWebSocketCommonKt$writeFrame$1.I$0;
                        ByteReadPacket$default = (Source) rawWebSocketCommonKt$writeFrame$1.L$1;
                        byteWriteChannel4 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ByteReadPacket$default = mask(ByteReadPacket$default, nextInt);
                        byteWriteChannel2 = byteWriteChannel4;
                        rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                        rawWebSocketCommonKt$writeFrame$1.label = 6;
                        if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel2, ByteReadPacket$default, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rawWebSocketCommonKt$writeFrame$1 = new RawWebSocketCommonKt$writeFrame$1(continuation);
        Object obj2 = rawWebSocketCommonKt$writeFrame$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rawWebSocketCommonKt$writeFrame$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFrame(ByteReadChannel byteReadChannel, long j, int i, Continuation<? super Frame> continuation) {
        RawWebSocketCommonKt$readFrame$1 rawWebSocketCommonKt$readFrame$1;
        long j2;
        int i2;
        Object readByte;
        Object readByte2;
        ByteReadChannel byteReadChannel2;
        int i3;
        long j3;
        byte b;
        byte byteValue;
        int i4;
        FrameType frameType;
        int i5;
        FrameType frameType2;
        byte b2;
        int i6;
        byte b3;
        long j4;
        long j5;
        ByteReadChannel byteReadChannel3;
        FrameType frameType3;
        long shortValue;
        boolean z;
        int i7;
        int i8;
        int i9;
        FrameType frameType4;
        ByteReadChannel byteReadChannel4 = byteReadChannel;
        if (continuation instanceof RawWebSocketCommonKt$readFrame$1) {
            rawWebSocketCommonKt$readFrame$1 = (RawWebSocketCommonKt$readFrame$1) continuation;
            if ((rawWebSocketCommonKt$readFrame$1.label & Integer.MIN_VALUE) != 0) {
                rawWebSocketCommonKt$readFrame$1.label -= Integer.MIN_VALUE;
                Object obj = rawWebSocketCommonKt$readFrame$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rawWebSocketCommonKt$readFrame$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel4;
                        j2 = j;
                        rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                        i2 = i;
                        rawWebSocketCommonKt$readFrame$1.I$0 = i2;
                        rawWebSocketCommonKt$readFrame$1.label = 1;
                        readByte = ByteReadChannelOperationsKt.readByte(byteReadChannel4, rawWebSocketCommonKt$readFrame$1);
                        if (readByte == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byte byteValue2 = ((Number) readByte).byteValue();
                        rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel4;
                        rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                        rawWebSocketCommonKt$readFrame$1.I$0 = i2;
                        rawWebSocketCommonKt$readFrame$1.B$0 = byteValue2;
                        rawWebSocketCommonKt$readFrame$1.label = 2;
                        readByte2 = ByteReadChannelOperationsKt.readByte(byteReadChannel4, rawWebSocketCommonKt$readFrame$1);
                        if (readByte2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel4;
                        i3 = i2;
                        obj = readByte2;
                        j3 = j2;
                        b = byteValue2;
                        byteValue = ((Number) obj).byteValue();
                        i4 = b & Ascii.SI;
                        if (i4 != 0 && i3 == 0) {
                            throw new ProtocolViolationException("Can't continue finished frames");
                        }
                        int i10 = i4 != 0 ? i3 : i4;
                        frameType = FrameType.INSTANCE.get(i10);
                        if (frameType != null) {
                            throw new ProtocolViolationException("Unsupported opcode: " + i10);
                        }
                        if (i4 != 0 && i3 != 0 && !frameType.getControlFrame()) {
                            throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
                        }
                        i5 = (b & 128) != 0 ? 1 : 0;
                        if (frameType.getControlFrame() && i5 == 0) {
                            throw new ProtocolViolationException("control frames can't be fragmented");
                        }
                        int i11 = byteValue & Byte.MAX_VALUE;
                        if (i11 == 126) {
                            rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel2;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j3;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b;
                            rawWebSocketCommonKt$readFrame$1.B$1 = byteValue;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.label = 3;
                            Object readShort = ByteReadChannelOperationsKt.readShort(byteReadChannel2, rawWebSocketCommonKt$readFrame$1);
                            if (readShort == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            frameType2 = frameType;
                            b2 = byteValue;
                            i6 = i5;
                            obj = readShort;
                            shortValue = ((Number) obj).shortValue() & 65535;
                            i5 = i6;
                            byteValue = b2;
                            b3 = b;
                            ByteReadChannel byteReadChannel5 = byteReadChannel2;
                            frameType3 = frameType2;
                            j4 = j3;
                            j5 = shortValue;
                            byteReadChannel3 = byteReadChannel5;
                            if (!frameType3.getControlFrame()) {
                            }
                            if ((byteValue & 128) != 0) {
                            }
                            if (!z) {
                            }
                        } else if (i11 == 127) {
                            rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel2;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j3;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b;
                            rawWebSocketCommonKt$readFrame$1.B$1 = byteValue;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.label = 4;
                            Object readLong = ByteReadChannelOperationsKt.readLong(byteReadChannel2, rawWebSocketCommonKt$readFrame$1);
                            if (readLong == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            frameType2 = frameType;
                            b2 = byteValue;
                            i6 = i5;
                            obj = readLong;
                            shortValue = ((Number) obj).longValue();
                            i5 = i6;
                            byteValue = b2;
                            b3 = b;
                            ByteReadChannel byteReadChannel52 = byteReadChannel2;
                            frameType3 = frameType2;
                            j4 = j3;
                            j5 = shortValue;
                            byteReadChannel3 = byteReadChannel52;
                            if (!frameType3.getControlFrame()) {
                            }
                            if ((byteValue & 128) != 0) {
                            }
                            if (!z) {
                            }
                        } else {
                            long j6 = i11;
                            b3 = b;
                            j4 = j3;
                            j5 = j6;
                            byteReadChannel3 = byteReadChannel2;
                            frameType3 = frameType;
                            if (!frameType3.getControlFrame() && j5 > 125) {
                                throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
                            }
                            z = (byteValue & 128) != 0;
                            if (!z) {
                                if (z) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i7 = -1;
                                if (j5 <= 2147483647L) {
                                }
                                throw new FrameTooBigException(j5);
                            }
                            rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel3;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType3;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j4;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b3;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.J$1 = j5;
                            rawWebSocketCommonKt$readFrame$1.label = 5;
                            Object readInt = ByteReadChannelOperationsKt.readInt(byteReadChannel3, rawWebSocketCommonKt$readFrame$1);
                            if (readInt == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            int i12 = i5;
                            obj = readInt;
                            i8 = i12;
                            int intValue = ((Number) obj).intValue();
                            i5 = i8;
                            i7 = intValue;
                            if (j5 <= 2147483647L || j5 > j4) {
                                throw new FrameTooBigException(j5);
                            }
                            rawWebSocketCommonKt$readFrame$1.L$0 = frameType3;
                            rawWebSocketCommonKt$readFrame$1.L$1 = null;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b3;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.I$1 = i7;
                            rawWebSocketCommonKt$readFrame$1.label = 6;
                            Object readPacket = ByteReadChannelOperationsKt.readPacket(byteReadChannel3, (int) j5, rawWebSocketCommonKt$readFrame$1);
                            if (readPacket == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i9 = i5;
                            obj = readPacket;
                            frameType4 = frameType3;
                            Source source = (Source) obj;
                            if (i7 != -1) {
                                source = mask(source, i7);
                            }
                            return Frame.INSTANCE.byType(i9 == 0, frameType4, SourcesKt.readByteArray(source), (b3 & SignedBytes.MAX_POWER_OF_TWO) == 0, (b3 & 32) == 0, (b3 & Ascii.DLE) == 0);
                        }
                    case 1:
                        int i13 = rawWebSocketCommonKt$readFrame$1.I$0;
                        j2 = rawWebSocketCommonKt$readFrame$1.J$0;
                        ByteReadChannel byteReadChannel6 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i13;
                        byteReadChannel4 = byteReadChannel6;
                        readByte = obj;
                        byte byteValue22 = ((Number) readByte).byteValue();
                        rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel4;
                        rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                        rawWebSocketCommonKt$readFrame$1.I$0 = i2;
                        rawWebSocketCommonKt$readFrame$1.B$0 = byteValue22;
                        rawWebSocketCommonKt$readFrame$1.label = 2;
                        readByte2 = ByteReadChannelOperationsKt.readByte(byteReadChannel4, rawWebSocketCommonKt$readFrame$1);
                        if (readByte2 != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        byte b4 = rawWebSocketCommonKt$readFrame$1.B$0;
                        i3 = rawWebSocketCommonKt$readFrame$1.I$0;
                        long j7 = rawWebSocketCommonKt$readFrame$1.J$0;
                        ByteReadChannel byteReadChannel7 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteReadChannel2 = byteReadChannel7;
                        j3 = j7;
                        b = b4;
                        byteValue = ((Number) obj).byteValue();
                        i4 = b & Ascii.SI;
                        if (i4 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        frameType = FrameType.INSTANCE.get(i10);
                        if (frameType != null) {
                        }
                        break;
                    case 3:
                        i6 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b2 = rawWebSocketCommonKt$readFrame$1.B$1;
                        b = rawWebSocketCommonKt$readFrame$1.B$0;
                        j3 = rawWebSocketCommonKt$readFrame$1.J$0;
                        frameType2 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        shortValue = ((Number) obj).shortValue() & 65535;
                        i5 = i6;
                        byteValue = b2;
                        b3 = b;
                        ByteReadChannel byteReadChannel522 = byteReadChannel2;
                        frameType3 = frameType2;
                        j4 = j3;
                        j5 = shortValue;
                        byteReadChannel3 = byteReadChannel522;
                        if (!frameType3.getControlFrame()) {
                        }
                        if ((byteValue & 128) != 0) {
                        }
                        if (!z) {
                        }
                        break;
                    case 4:
                        i6 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b2 = rawWebSocketCommonKt$readFrame$1.B$1;
                        b = rawWebSocketCommonKt$readFrame$1.B$0;
                        j3 = rawWebSocketCommonKt$readFrame$1.J$0;
                        frameType2 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        shortValue = ((Number) obj).longValue();
                        i5 = i6;
                        byteValue = b2;
                        b3 = b;
                        ByteReadChannel byteReadChannel5222 = byteReadChannel2;
                        frameType3 = frameType2;
                        j4 = j3;
                        j5 = shortValue;
                        byteReadChannel3 = byteReadChannel5222;
                        if (!frameType3.getControlFrame()) {
                        }
                        if ((byteValue & 128) != 0) {
                        }
                        if (!z) {
                        }
                        break;
                    case 5:
                        j5 = rawWebSocketCommonKt$readFrame$1.J$1;
                        i8 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b3 = rawWebSocketCommonKt$readFrame$1.B$0;
                        j4 = rawWebSocketCommonKt$readFrame$1.J$0;
                        frameType3 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                        byteReadChannel3 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        int intValue2 = ((Number) obj).intValue();
                        i5 = i8;
                        i7 = intValue2;
                        if (j5 <= 2147483647L) {
                        }
                        throw new FrameTooBigException(j5);
                    case 6:
                        i7 = rawWebSocketCommonKt$readFrame$1.I$1;
                        i9 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b3 = rawWebSocketCommonKt$readFrame$1.B$0;
                        FrameType frameType5 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        frameType4 = frameType5;
                        Source source2 = (Source) obj;
                        if (i7 != -1) {
                        }
                        return Frame.INSTANCE.byType(i9 == 0, frameType4, SourcesKt.readByteArray(source2), (b3 & SignedBytes.MAX_POWER_OF_TWO) == 0, (b3 & 32) == 0, (b3 & Ascii.DLE) == 0);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rawWebSocketCommonKt$readFrame$1 = new RawWebSocketCommonKt$readFrame$1(continuation);
        Object obj2 = rawWebSocketCommonKt$readFrame$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rawWebSocketCommonKt$readFrame$1.label) {
        }
    }
}
