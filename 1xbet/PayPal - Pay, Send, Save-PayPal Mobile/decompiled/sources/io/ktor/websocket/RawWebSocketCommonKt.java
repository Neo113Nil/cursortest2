package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\r\u001a\u00020\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/websocket/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "masking", "", "writeFrame", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/websocket/Frame;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "", "maxFrameSize", "", "lastOpcode", "readFrame", "(Lio/ktor/utils/io/ByteReadChannel;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RawWebSocketCommonKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x015f, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(r5, r4, r2) != r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0144, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r5, r0, r2) != r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0111, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(r14, r1, r2) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0122, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(r14, (short) r1, r2) != r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeFrame(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.websocket.Frame frame, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1 rawWebSocketCommonKt$writeFrame$1;
        io.ktor.websocket.Frame frame2;
        boolean z2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        io.ktor.websocket.Frame frame3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        kotlinx.io.Source ByteReadPacket$default;
        int nextInt;
        if (continuation instanceof io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1) {
            rawWebSocketCommonKt$writeFrame$1 = (io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1) continuation;
            if ((rawWebSocketCommonKt$writeFrame$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                rawWebSocketCommonKt$writeFrame$1.getInputFormats -= 2147483648;
                java.lang.Object obj = rawWebSocketCommonKt$writeFrame$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rawWebSocketCommonKt$writeFrame$1.getInputFormats) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        int length = frame.getData().length;
                        byte opcode = (byte) ((frame.getFin() ? 128 : 0) | (frame.getRsv1() ? 64 : 0) | (frame.getRsv2() ? 32 : 0) | (frame.getRsv3() ? 16 : 0) | frame.getFrameType().getOpcode());
                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = byteWriteChannel;
                        frame2 = frame;
                        rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = frame2;
                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges = z;
                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoSizes = length;
                        rawWebSocketCommonKt$writeFrame$1.getInputFormats = 1;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, opcode, rawWebSocketCommonKt$writeFrame$1) != coroutine_suspended) {
                            z2 = z;
                            byteWriteChannel2 = byteWriteChannel;
                            i = length;
                            i2 = i >= 126 ? i : i <= 65535 ? 126 : 127;
                            i3 = z2 ? 128 : 0;
                            rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = byteWriteChannel2;
                            rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = frame2;
                            rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges = z2;
                            rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoSizes = i;
                            rawWebSocketCommonKt$writeFrame$1.Camera2StreamConfigurationMap = i2;
                            rawWebSocketCommonKt$writeFrame$1.getInputFormats = 2;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(byteWriteChannel2, (byte) (i3 | i2), rawWebSocketCommonKt$writeFrame$1) != coroutine_suspended) {
                                int i6 = i2;
                                i4 = i;
                                i5 = i6;
                                if (i5 != 126) {
                                    rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = byteWriteChannel2;
                                    rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = frame2;
                                    rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges = z2;
                                    rawWebSocketCommonKt$writeFrame$1.getInputFormats = 3;
                                    break;
                                } else {
                                    if (i5 == 127) {
                                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = byteWriteChannel2;
                                        rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = frame2;
                                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges = z2;
                                        rawWebSocketCommonKt$writeFrame$1.getInputFormats = 4;
                                        break;
                                    }
                                    z3 = z2;
                                    frame3 = frame2;
                                    byteWriteChannel3 = byteWriteChannel2;
                                }
                                ByteReadPacket$default = io.ktor.utils.io.core.ByteReadPacketKt.ByteReadPacket$default(frame3.getData(), 0, 0, 6, null);
                                if (z3) {
                                    nextInt = kotlin.random.Random.INSTANCE.nextInt();
                                    rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = byteWriteChannel3;
                                    rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = ByteReadPacket$default;
                                    rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoSizes = nextInt;
                                    rawWebSocketCommonKt$writeFrame$1.getInputFormats = 5;
                                    break;
                                } else {
                                    if (z3) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = null;
                                    rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                    rawWebSocketCommonKt$writeFrame$1.getInputFormats = 6;
                                    break;
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        i = rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoSizes;
                        z2 = rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges;
                        frame2 = (io.ktor.websocket.Frame) rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                        byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (i >= 126) {
                        }
                        if (z2) {
                        }
                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = byteWriteChannel2;
                        rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = frame2;
                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges = z2;
                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoSizes = i;
                        rawWebSocketCommonKt$writeFrame$1.Camera2StreamConfigurationMap = i2;
                        rawWebSocketCommonKt$writeFrame$1.getInputFormats = 2;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(byteWriteChannel2, (byte) (i3 | i2), rawWebSocketCommonKt$writeFrame$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        i5 = rawWebSocketCommonKt$writeFrame$1.Camera2StreamConfigurationMap;
                        int i7 = rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoSizes;
                        boolean z4 = rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges;
                        frame2 = (io.ktor.websocket.Frame) rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                        byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i4 = i7;
                        z2 = z4;
                        if (i5 != 126) {
                        }
                        ByteReadPacket$default = io.ktor.utils.io.core.ByteReadPacketKt.ByteReadPacket$default(frame3.getData(), 0, 0, 6, null);
                        if (z3) {
                        }
                        break;
                    case 3:
                    case 4:
                        z3 = rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRanges;
                        frame3 = (io.ktor.websocket.Frame) rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        ByteReadPacket$default = io.ktor.utils.io.core.ByteReadPacketKt.ByteReadPacket$default(frame3.getData(), 0, 0, 6, null);
                        if (z3) {
                        }
                        break;
                    case 5:
                        nextInt = rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoSizes;
                        ByteReadPacket$default = (kotlinx.io.Source) rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        ByteReadPacket$default = (kotlinx.io.Source) io.ktor.utils.io.core.MemoryKt.withMemory(4, new io.ktor.websocket.RawWebSocketCommonKt$$ExternalSyntheticLambda0(nextInt, ByteReadPacket$default));
                        rawWebSocketCommonKt$writeFrame$1.getHighSpeedVideoFpsRangesFor = null;
                        rawWebSocketCommonKt$writeFrame$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        rawWebSocketCommonKt$writeFrame$1.getInputFormats = 6;
                        break;
                    case 6:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rawWebSocketCommonKt$writeFrame$1 = new io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1(continuation);
        java.lang.Object obj2 = rawWebSocketCommonKt$writeFrame$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rawWebSocketCommonKt$writeFrame$1.getInputFormats) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00b8, code lost:
    
        if (r4 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readFrame(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, int i, kotlin.coroutines.Continuation<? super io.ktor.websocket.Frame> continuation) {
        io.ktor.websocket.RawWebSocketCommonKt$readFrame$1 rawWebSocketCommonKt$readFrame$1;
        long j2;
        int i2;
        java.lang.Object readByte;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i3;
        long j3;
        byte b;
        byte byteValue;
        int i4;
        io.ktor.websocket.FrameType frameType;
        int i5;
        io.ktor.websocket.FrameType frameType2;
        byte b2;
        int i6;
        byte b3;
        long j4;
        long j5;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        io.ktor.websocket.FrameType frameType3;
        long shortValue;
        boolean z;
        int i7;
        int i8;
        int i9;
        io.ktor.websocket.FrameType frameType4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel4 = byteReadChannel;
        if (continuation instanceof io.ktor.websocket.RawWebSocketCommonKt$readFrame$1) {
            rawWebSocketCommonKt$readFrame$1 = (io.ktor.websocket.RawWebSocketCommonKt$readFrame$1) continuation;
            if ((rawWebSocketCommonKt$readFrame$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                rawWebSocketCommonKt$readFrame$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = rawWebSocketCommonKt$readFrame$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rawWebSocketCommonKt$readFrame$1.getOutputFormats) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI = byteReadChannel4;
                        j2 = j;
                        rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor = j2;
                        i2 = i;
                        rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap = i2;
                        rawWebSocketCommonKt$readFrame$1.getOutputFormats = 1;
                        readByte = io.ktor.utils.io.ByteReadChannelOperationsKt.readByte(byteReadChannel4, rawWebSocketCommonKt$readFrame$1);
                        break;
                    case 1:
                        int i10 = rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap;
                        j2 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel5 = (io.ktor.utils.io.ByteReadChannel) rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = i10;
                        byteReadChannel4 = byteReadChannel5;
                        readByte = obj;
                        byte byteValue2 = ((java.lang.Number) readByte).byteValue();
                        rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI = byteReadChannel4;
                        rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor = j2;
                        rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap = i2;
                        rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes = byteValue2;
                        rawWebSocketCommonKt$readFrame$1.getOutputFormats = 2;
                        java.lang.Object readByte2 = io.ktor.utils.io.ByteReadChannelOperationsKt.readByte(byteReadChannel4, rawWebSocketCommonKt$readFrame$1);
                        if (readByte2 != coroutine_suspended) {
                            byteReadChannel2 = byteReadChannel4;
                            i3 = i2;
                            obj = readByte2;
                            j3 = j2;
                            b = byteValue2;
                            byteValue = ((java.lang.Number) obj).byteValue();
                            i4 = b & com.google.common.base.Ascii.SI;
                            if (i4 != 0 && i3 == 0) {
                                throw new io.ktor.websocket.ProtocolViolationException("Can't continue finished frames");
                            }
                            int i11 = i4 != 0 ? i3 : i4;
                            frameType = io.ktor.websocket.FrameType.INSTANCE.get(i11);
                            if (frameType != null) {
                                throw new io.ktor.websocket.ProtocolViolationException("Unsupported opcode: ".concat(java.lang.String.valueOf(i11)));
                            }
                            if (i4 != 0 && i3 != 0 && !frameType.getControlFrame()) {
                                throw new io.ktor.websocket.ProtocolViolationException("Can't start new data frame before finishing previous one");
                            }
                            i5 = (b & 128) != 0 ? 1 : 0;
                            if (frameType.getControlFrame() && i5 == 0) {
                                throw new io.ktor.websocket.ProtocolViolationException("control frames can't be fragmented");
                            }
                            int i12 = byteValue & Byte.MAX_VALUE;
                            if (i12 == 126) {
                                rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI = byteReadChannel2;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizesFor = frameType;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor = j3;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes = b;
                                rawWebSocketCommonKt$readFrame$1.getHighResolutionOutputSizeshNQ4ISI = byteValue;
                                rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap = i5;
                                rawWebSocketCommonKt$readFrame$1.getOutputFormats = 3;
                                java.lang.Object readShort = io.ktor.utils.io.ByteReadChannelOperationsKt.readShort(byteReadChannel2, rawWebSocketCommonKt$readFrame$1);
                                if (readShort != coroutine_suspended) {
                                    frameType2 = frameType;
                                    b2 = byteValue;
                                    i6 = i5;
                                    obj = readShort;
                                    shortValue = ((java.lang.Number) obj).shortValue() & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    i5 = i6;
                                    byteValue = b2;
                                    b3 = b;
                                    byteReadChannel3 = byteReadChannel2;
                                    frameType3 = frameType2;
                                    j4 = j3;
                                    j5 = shortValue;
                                    if (!frameType3.getControlFrame()) {
                                    }
                                    if ((byteValue & 128) != 0) {
                                    }
                                    if (!z) {
                                    }
                                }
                            } else if (i12 == 127) {
                                rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI = byteReadChannel2;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizesFor = frameType;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor = j3;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes = b;
                                rawWebSocketCommonKt$readFrame$1.getHighResolutionOutputSizeshNQ4ISI = byteValue;
                                rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap = i5;
                                rawWebSocketCommonKt$readFrame$1.getOutputFormats = 4;
                                java.lang.Object readLong = io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(byteReadChannel2, rawWebSocketCommonKt$readFrame$1);
                                if (readLong != coroutine_suspended) {
                                    frameType2 = frameType;
                                    b2 = byteValue;
                                    i6 = i5;
                                    obj = readLong;
                                    shortValue = ((java.lang.Number) obj).longValue();
                                    i5 = i6;
                                    byteValue = b2;
                                    b3 = b;
                                    byteReadChannel3 = byteReadChannel2;
                                    frameType3 = frameType2;
                                    j4 = j3;
                                    j5 = shortValue;
                                    if (!frameType3.getControlFrame()) {
                                    }
                                    if ((byteValue & 128) != 0) {
                                    }
                                    if (!z) {
                                    }
                                }
                            } else {
                                long j6 = i12;
                                b3 = b;
                                j4 = j3;
                                j5 = j6;
                                byteReadChannel3 = byteReadChannel2;
                                frameType3 = frameType;
                                if (!frameType3.getControlFrame() && j5 > 125) {
                                    throw new io.ktor.websocket.ProtocolViolationException("control frames can't be larger than 125 bytes");
                                }
                                z = (byteValue & 128) != 0;
                                if (!z) {
                                    if (z) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    i7 = -1;
                                    if (j5 <= androidx.collection.SieveCacheKt.NodeLinkMask) {
                                    }
                                    throw new io.ktor.websocket.FrameTooBigException(j5);
                                }
                                rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI = byteReadChannel3;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizesFor = frameType3;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor = j4;
                                rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes = b3;
                                rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap = i5;
                                rawWebSocketCommonKt$readFrame$1.getInputFormats = j5;
                                rawWebSocketCommonKt$readFrame$1.getOutputFormats = 5;
                                java.lang.Object readInt = io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(byteReadChannel3, rawWebSocketCommonKt$readFrame$1);
                                if (readInt != coroutine_suspended) {
                                    int i13 = i5;
                                    obj = readInt;
                                    i8 = i13;
                                    int intValue = ((java.lang.Number) obj).intValue();
                                    i5 = i8;
                                    i7 = intValue;
                                    if (j5 <= androidx.collection.SieveCacheKt.NodeLinkMask || j5 > j4) {
                                        throw new io.ktor.websocket.FrameTooBigException(j5);
                                    }
                                    rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI = frameType3;
                                    rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizesFor = null;
                                    rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes = b3;
                                    rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap = i5;
                                    rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRanges = i7;
                                    rawWebSocketCommonKt$readFrame$1.getOutputFormats = 6;
                                    java.lang.Object readPacket = io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(byteReadChannel3, (int) j5, rawWebSocketCommonKt$readFrame$1);
                                    if (readPacket != coroutine_suspended) {
                                        i9 = i5;
                                        obj = readPacket;
                                        frameType4 = frameType3;
                                        kotlinx.io.Source source = (kotlinx.io.Source) obj;
                                        if (i7 != -1) {
                                            source = (kotlinx.io.Source) io.ktor.utils.io.core.MemoryKt.withMemory(4, new io.ktor.websocket.RawWebSocketCommonKt$$ExternalSyntheticLambda0(i7, source));
                                        }
                                        return io.ktor.websocket.Frame.INSTANCE.byType(i9 == 0, frameType4, kotlinx.io.SourcesKt.readByteArray(source), (b3 & 64) == 0, (b3 & 32) == 0, (b3 & 16) == 0);
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        byte b4 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes;
                        i3 = rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap;
                        long j7 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel6 = (io.ktor.utils.io.ByteReadChannel) rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteReadChannel2 = byteReadChannel6;
                        j3 = j7;
                        b = b4;
                        byteValue = ((java.lang.Number) obj).byteValue();
                        i4 = b & com.google.common.base.Ascii.SI;
                        if (i4 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        frameType = io.ktor.websocket.FrameType.INSTANCE.get(i11);
                        if (frameType != null) {
                        }
                        break;
                    case 3:
                        i6 = rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap;
                        b2 = rawWebSocketCommonKt$readFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                        b = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes;
                        j3 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor;
                        frameType2 = (io.ktor.websocket.FrameType) rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizesFor;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        shortValue = ((java.lang.Number) obj).shortValue() & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
                        i5 = i6;
                        byteValue = b2;
                        b3 = b;
                        byteReadChannel3 = byteReadChannel2;
                        frameType3 = frameType2;
                        j4 = j3;
                        j5 = shortValue;
                        if (!frameType3.getControlFrame()) {
                        }
                        if ((byteValue & 128) != 0) {
                        }
                        if (!z) {
                        }
                        break;
                    case 4:
                        i6 = rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap;
                        b2 = rawWebSocketCommonKt$readFrame$1.getHighResolutionOutputSizeshNQ4ISI;
                        b = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes;
                        j3 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor;
                        frameType2 = (io.ktor.websocket.FrameType) rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizesFor;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        shortValue = ((java.lang.Number) obj).longValue();
                        i5 = i6;
                        byteValue = b2;
                        b3 = b;
                        byteReadChannel3 = byteReadChannel2;
                        frameType3 = frameType2;
                        j4 = j3;
                        j5 = shortValue;
                        if (!frameType3.getControlFrame()) {
                        }
                        if ((byteValue & 128) != 0) {
                        }
                        if (!z) {
                        }
                        break;
                    case 5:
                        j5 = rawWebSocketCommonKt$readFrame$1.getInputFormats;
                        i8 = rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap;
                        b3 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes;
                        j4 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRangesFor;
                        frameType3 = (io.ktor.websocket.FrameType) rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizesFor;
                        byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        int intValue2 = ((java.lang.Number) obj).intValue();
                        i5 = i8;
                        i7 = intValue2;
                        if (j5 <= androidx.collection.SieveCacheKt.NodeLinkMask) {
                        }
                        throw new io.ktor.websocket.FrameTooBigException(j5);
                    case 6:
                        i7 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoFpsRanges;
                        i9 = rawWebSocketCommonKt$readFrame$1.Camera2StreamConfigurationMap;
                        b3 = rawWebSocketCommonKt$readFrame$1.getHighSpeedVideoSizes;
                        io.ktor.websocket.FrameType frameType5 = (io.ktor.websocket.FrameType) rawWebSocketCommonKt$readFrame$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        frameType4 = frameType5;
                        kotlinx.io.Source source2 = (kotlinx.io.Source) obj;
                        if (i7 != -1) {
                        }
                        return io.ktor.websocket.Frame.INSTANCE.byType(i9 == 0, frameType4, kotlinx.io.SourcesKt.readByteArray(source2), (b3 & 64) == 0, (b3 & 32) == 0, (b3 & 16) == 0);
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rawWebSocketCommonKt$readFrame$1 = new io.ktor.websocket.RawWebSocketCommonKt$readFrame$1(continuation);
        java.lang.Object obj2 = rawWebSocketCommonKt$readFrame$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rawWebSocketCommonKt$readFrame$1.getOutputFormats) {
        }
    }

    /* renamed from: $r8$lambda$5xn-IQVeIGpEBUybYyUlwCH3P4E, reason: not valid java name */
    public static /* synthetic */ kotlinx.io.Source m23431$r8$lambda$5xnIQVeIGpEBUybYyUlwCH3P4E(int i, kotlinx.io.Source source, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        io.ktor.utils.io.core.MemoryKt.storeIntAt(bArr, 0, i);
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.Buffer buffer2 = buffer;
        int remaining = (int) io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source);
        for (int i2 = 0; i2 < remaining; i2++) {
            buffer2.writeByte((byte) (source.readByte() ^ bArr[i2 % 4]));
        }
        return buffer;
    }
}
