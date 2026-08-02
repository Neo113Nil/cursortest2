package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {82, 99, 100, 110, 117, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 135}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes17.dex */
final class EncodersJvmKt$inflate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    byte getHighResolutionOutputSizeshNQ4ISI;
    byte getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    short getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputStallDuration;
    private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(r17.getHighSpeedVideoFpsRangesFor, r5, r17) == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0141, code lost:
    
        if (r12 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0265, code lost:
    
        if (r4 != r0) goto L65;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x03d4: MOVE (r11 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:117:0x03d4 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x03d6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:117:0x03d4 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x03d5: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:117:0x03d4 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02ef A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:8:0x0034, B:10:0x0316, B:11:0x02e9, B:13:0x02ef, B:17:0x032d, B:19:0x0331, B:21:0x0339, B:23:0x0357, B:28:0x035c, B:29:0x0380, B:30:0x0381, B:31:0x038c, B:32:0x038d, B:33:0x03b0, B:34:0x03b1, B:36:0x03cb, B:37:0x03d2, B:44:0x0281, B:46:0x0287, B:48:0x028d, B:51:0x02d6, B:52:0x0242, B:54:0x024a, B:56:0x0267, B:58:0x026f, B:59:0x02db, B:61:0x02e3, B:62:0x03d3, B:72:0x0080, B:77:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x032d A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:8:0x0034, B:10:0x0316, B:11:0x02e9, B:13:0x02ef, B:17:0x032d, B:19:0x0331, B:21:0x0339, B:23:0x0357, B:28:0x035c, B:29:0x0380, B:30:0x0381, B:31:0x038c, B:32:0x038d, B:33:0x03b0, B:34:0x03b1, B:36:0x03cb, B:37:0x03d2, B:44:0x0281, B:46:0x0287, B:48:0x028d, B:51:0x02d6, B:52:0x0242, B:54:0x024a, B:56:0x0267, B:58:0x026f, B:59:0x02db, B:61:0x02e3, B:62:0x03d3, B:72:0x0080, B:77:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0287 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:8:0x0034, B:10:0x0316, B:11:0x02e9, B:13:0x02ef, B:17:0x032d, B:19:0x0331, B:21:0x0339, B:23:0x0357, B:28:0x035c, B:29:0x0380, B:30:0x0381, B:31:0x038c, B:32:0x038d, B:33:0x03b0, B:34:0x03b1, B:36:0x03cb, B:37:0x03d2, B:44:0x0281, B:46:0x0287, B:48:0x028d, B:51:0x02d6, B:52:0x0242, B:54:0x024a, B:56:0x0267, B:58:0x026f, B:59:0x02db, B:61:0x02e3, B:62:0x03d3, B:72:0x0080, B:77:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024a A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:8:0x0034, B:10:0x0316, B:11:0x02e9, B:13:0x02ef, B:17:0x032d, B:19:0x0331, B:21:0x0339, B:23:0x0357, B:28:0x035c, B:29:0x0380, B:30:0x0381, B:31:0x038c, B:32:0x038d, B:33:0x03b0, B:34:0x03b1, B:36:0x03cb, B:37:0x03d2, B:44:0x0281, B:46:0x0287, B:48:0x028d, B:51:0x02d6, B:52:0x0242, B:54:0x024a, B:56:0x0267, B:58:0x026f, B:59:0x02db, B:61:0x02e3, B:62:0x03d3, B:72:0x0080, B:77:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02db A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:8:0x0034, B:10:0x0316, B:11:0x02e9, B:13:0x02ef, B:17:0x032d, B:19:0x0331, B:21:0x0339, B:23:0x0357, B:28:0x035c, B:29:0x0380, B:30:0x0381, B:31:0x038c, B:32:0x038d, B:33:0x03b0, B:34:0x03b1, B:36:0x03cb, B:37:0x03d2, B:44:0x0281, B:46:0x0287, B:48:0x028d, B:51:0x02d6, B:52:0x0242, B:54:0x024a, B:56:0x0267, B:58:0x026f, B:59:0x02db, B:61:0x02e3, B:62:0x03d3, B:72:0x0080, B:77:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0315 -> B:10:0x0316). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x02b2 -> B:42:0x02ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x026d -> B:52:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x026f -> B:44:0x0281). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        java.nio.ByteBuffer byteBuffer2;
        java.nio.ByteBuffer byteBuffer3;
        java.nio.ByteBuffer byteBuffer4;
        java.util.zip.Inflater inflater;
        java.util.zip.Inflater inflater2;
        io.ktor.utils.io.WriterScope writerScope;
        java.nio.ByteBuffer borrow;
        java.nio.ByteBuffer borrow2;
        java.util.zip.Inflater inflater3;
        java.util.zip.CRC32 crc32;
        java.lang.Object readPacket;
        short readShortLittleEndian;
        byte readByte;
        byte readByte2;
        java.nio.ByteBuffer byteBuffer5;
        io.ktor.utils.io.WriterScope writerScope2;
        java.lang.Object readShort;
        java.nio.ByteBuffer byteBuffer6;
        byte b;
        java.util.zip.Inflater inflater4;
        short s;
        io.ktor.utils.io.WriterScope writerScope3;
        java.nio.ByteBuffer byteBuffer7;
        java.util.zip.CRC32 crc322;
        byte b2;
        java.util.zip.Inflater inflater5;
        java.nio.ByteBuffer byteBuffer8;
        io.ktor.utils.io.WriterScope writerScope4;
        java.util.zip.CRC32 crc323;
        kotlin.jvm.internal.Ref.IntRef intRef;
        java.lang.Object obj2;
        io.ktor.utils.io.WriterScope writerScope5;
        java.util.zip.CRC32 crc324;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        java.lang.Object access$inflateTo;
        io.ktor.utils.io.WriterScope writerScope6;
        kotlin.jvm.internal.Ref.IntRef intRef3;
        java.util.zip.CRC32 crc325;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef4;
        int i2;
        java.lang.Object access$inflateTo2;
        kotlin.jvm.internal.Ref.IntRef intRef5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.getOutputStallDuration) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    writerScope = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    borrow = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    borrow2 = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    inflater3 = new java.util.zip.Inflater(true);
                    crc32 = new java.util.zip.CRC32();
                    if (this.Camera2StreamConfigurationMap) {
                        this.getOutputStallDurationlomOqCM = writerScope;
                        this.getOutputMinFrameDuration = borrow;
                        this.getInputFormats = borrow2;
                        this.getInputSizeshNQ4ISI = inflater3;
                        this.getOutputFormats = crc32;
                        this.getOutputStallDuration = 1;
                        readPacket = io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(this.getHighSpeedVideoFpsRangesFor, 10, this);
                        break;
                    }
                    writerScope4 = writerScope;
                    crc323 = crc32;
                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                    if (this.getHighSpeedVideoFpsRangesFor.isClosedForRead()) {
                        this.getOutputStallDurationlomOqCM = writerScope4;
                        this.getOutputMinFrameDuration = borrow;
                        this.getInputFormats = borrow2;
                        this.getInputSizeshNQ4ISI = inflater3;
                        this.getOutputFormats = crc323;
                        this.getHighSpeedVideoSizesFor = intRef;
                        this.getOutputSizes = null;
                        this.getOutputStallDuration = 5;
                        obj2 = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(this.getHighSpeedVideoFpsRangesFor, borrow, this);
                        break;
                    } else {
                        java.lang.Throwable closedCause = this.getHighSpeedVideoFpsRangesFor.getClosedCause();
                        if (closedCause != null) {
                            throw closedCause;
                        }
                        borrow.flip();
                        writerScope5 = writerScope4;
                        crc324 = crc323;
                        intRef2 = intRef;
                        if (!inflater3.finished()) {
                            i2 = intRef2.element;
                            this.getOutputStallDurationlomOqCM = writerScope5;
                            this.getOutputMinFrameDuration = borrow;
                            this.getInputFormats = borrow2;
                            this.getInputSizeshNQ4ISI = inflater3;
                            this.getOutputFormats = crc324;
                            this.getHighSpeedVideoSizesFor = intRef2;
                            this.getOutputSizes = intRef2;
                            this.getHighSpeedVideoSizes = i2;
                            this.getOutputStallDuration = 7;
                            access$inflateTo2 = io.ktor.util.EncodersJvmKt.access$inflateTo(inflater3, writerScope5.getChannel(), borrow2, crc324, this);
                            if (access$inflateTo2 != coroutine_suspended) {
                                intRef5 = intRef2;
                                intRef2.element = i2 + ((java.lang.Number) access$inflateTo2).intValue();
                                borrow.position(borrow.limit() - inflater3.getRemaining());
                                intRef2 = intRef5;
                                if (!inflater3.finished()) {
                                    if (this.Camera2StreamConfigurationMap) {
                                        if (borrow.remaining() != 8) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append("Expected 8 bytes in the trailer. Actual: ");
                                            sb.append(borrow.remaining());
                                            sb.append(" $");
                                            throw new java.lang.IllegalStateException(sb.toString().toString());
                                        }
                                        borrow.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                        int i3 = borrow.getInt(borrow.position());
                                        int i4 = borrow.getInt(borrow.position() + 4);
                                        if (((int) crc324.getValue()) != i3) {
                                            throw new java.lang.IllegalStateException("Gzip checksum invalid.".toString());
                                        }
                                        if (intRef2.element != i4) {
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            sb2.append("Gzip size invalid. Expected ");
                                            sb2.append(i4);
                                            sb2.append(", actual ");
                                            sb2.append(intRef2.element);
                                            throw new java.lang.IllegalStateException(sb2.toString().toString());
                                        }
                                    } else if (borrow.hasRemaining()) {
                                        throw new java.lang.IllegalStateException("Check failed.");
                                    }
                                    inflater3.end();
                                    io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(borrow);
                                    io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(borrow2);
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                case 1:
                    crc32 = (java.util.zip.CRC32) this.getOutputFormats;
                    inflater3 = (java.util.zip.Inflater) this.getInputSizeshNQ4ISI;
                    borrow2 = (java.nio.ByteBuffer) this.getInputFormats;
                    borrow = (java.nio.ByteBuffer) this.getOutputMinFrameDuration;
                    writerScope = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    readPacket = obj;
                    kotlinx.io.Source source = (kotlinx.io.Source) readPacket;
                    readShortLittleEndian = io.ktor.utils.io.core.ByteReadPacketKt.readShortLittleEndian(source);
                    readByte = source.readByte();
                    readByte2 = source.readByte();
                    io.ktor.utils.io.core.ByteReadPacketKt.discard$default(source, 0L, 1, null);
                    if ((readByte2 & 4) != 0) {
                        this.getOutputStallDurationlomOqCM = writerScope;
                        this.getOutputMinFrameDuration = borrow;
                        this.getInputFormats = borrow2;
                        this.getInputSizeshNQ4ISI = inflater3;
                        this.getOutputFormats = crc32;
                        this.getOutputMinFrameDurationlomOqCM = readShortLittleEndian;
                        this.getHighSpeedVideoFpsRanges = readByte;
                        this.getHighResolutionOutputSizeshNQ4ISI = readByte2;
                        this.getOutputStallDuration = 2;
                        readShort = io.ktor.utils.io.ByteReadChannelOperationsKt.readShort(this.getHighSpeedVideoFpsRangesFor, this);
                        if (readShort != coroutine_suspended) {
                            byteBuffer6 = borrow;
                            b = readByte;
                            inflater4 = inflater3;
                            s = readShortLittleEndian;
                            writerScope3 = writerScope;
                            byteBuffer7 = borrow2;
                            crc322 = crc32;
                            b2 = readByte2;
                            long shortValue = ((java.lang.Number) readShort).shortValue();
                            this.getOutputStallDurationlomOqCM = writerScope3;
                            this.getOutputMinFrameDuration = byteBuffer6;
                            this.getInputFormats = byteBuffer7;
                            this.getInputSizeshNQ4ISI = inflater4;
                            this.getOutputFormats = crc322;
                            this.getOutputMinFrameDurationlomOqCM = s;
                            this.getHighSpeedVideoFpsRanges = b;
                            this.getHighResolutionOutputSizeshNQ4ISI = b2;
                            this.getOutputStallDuration = 3;
                            break;
                        }
                        return coroutine_suspended;
                    }
                    byteBuffer5 = borrow2;
                    writerScope2 = writerScope;
                    if (readShortLittleEndian == -29921) {
                        throw new java.lang.IllegalStateException("GZIP magic invalid: ".concat(java.lang.String.valueOf((int) readShortLittleEndian)).toString());
                    }
                    if (readByte != 8) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Deflater method unsupported: ");
                        sb3.append((int) readByte);
                        sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        throw new java.lang.IllegalStateException(sb3.toString().toString());
                    }
                    if (io.ktor.util.EncodersJvmKt.access$has(readByte2, 8)) {
                        throw new java.lang.IllegalStateException("Gzip file name not supported".toString());
                    }
                    if (io.ktor.util.EncodersJvmKt.access$has(readByte2, 16)) {
                        throw new java.lang.IllegalStateException("Gzip file comment not supported".toString());
                    }
                    if (io.ktor.util.EncodersJvmKt.access$has(readByte2, 2)) {
                        this.getOutputStallDurationlomOqCM = writerScope2;
                        this.getOutputMinFrameDuration = borrow;
                        this.getInputFormats = byteBuffer5;
                        this.getInputSizeshNQ4ISI = inflater3;
                        this.getOutputFormats = crc32;
                        this.getOutputStallDuration = 4;
                        if (io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(this.getHighSpeedVideoFpsRangesFor, 2L, this) != coroutine_suspended) {
                            inflater5 = inflater3;
                            byteBuffer8 = borrow;
                            borrow = byteBuffer8;
                            writerScope = writerScope2;
                            inflater3 = inflater5;
                            borrow2 = byteBuffer5;
                            writerScope4 = writerScope;
                            crc323 = crc32;
                            intRef = new kotlin.jvm.internal.Ref.IntRef();
                            if (this.getHighSpeedVideoFpsRangesFor.isClosedForRead()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    writerScope = writerScope2;
                    borrow2 = byteBuffer5;
                    writerScope4 = writerScope;
                    crc323 = crc32;
                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                    if (this.getHighSpeedVideoFpsRangesFor.isClosedForRead()) {
                    }
                    break;
                case 2:
                    b2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    b = this.getHighSpeedVideoFpsRanges;
                    s = this.getOutputMinFrameDurationlomOqCM;
                    crc322 = (java.util.zip.CRC32) this.getOutputFormats;
                    inflater4 = (java.util.zip.Inflater) this.getInputSizeshNQ4ISI;
                    byteBuffer7 = (java.nio.ByteBuffer) this.getInputFormats;
                    byteBuffer6 = (java.nio.ByteBuffer) this.getOutputMinFrameDuration;
                    writerScope3 = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    readShort = obj;
                    long shortValue2 = ((java.lang.Number) readShort).shortValue();
                    this.getOutputStallDurationlomOqCM = writerScope3;
                    this.getOutputMinFrameDuration = byteBuffer6;
                    this.getInputFormats = byteBuffer7;
                    this.getInputSizeshNQ4ISI = inflater4;
                    this.getOutputFormats = crc322;
                    this.getOutputMinFrameDurationlomOqCM = s;
                    this.getHighSpeedVideoFpsRanges = b;
                    this.getHighResolutionOutputSizeshNQ4ISI = b2;
                    this.getOutputStallDuration = 3;
                    break;
                case 3:
                    b2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    b = this.getHighSpeedVideoFpsRanges;
                    s = this.getOutputMinFrameDurationlomOqCM;
                    crc322 = (java.util.zip.CRC32) this.getOutputFormats;
                    inflater4 = (java.util.zip.Inflater) this.getInputSizeshNQ4ISI;
                    byteBuffer7 = (java.nio.ByteBuffer) this.getInputFormats;
                    byteBuffer6 = (java.nio.ByteBuffer) this.getOutputMinFrameDuration;
                    writerScope3 = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    readByte2 = b2;
                    readByte = b;
                    crc32 = crc322;
                    byteBuffer5 = byteBuffer7;
                    writerScope2 = writerScope3;
                    readShortLittleEndian = s;
                    inflater3 = inflater4;
                    borrow = byteBuffer6;
                    if (readShortLittleEndian == -29921) {
                    }
                    break;
                case 4:
                    crc32 = (java.util.zip.CRC32) this.getOutputFormats;
                    inflater5 = (java.util.zip.Inflater) this.getInputSizeshNQ4ISI;
                    byteBuffer5 = (java.nio.ByteBuffer) this.getInputFormats;
                    byteBuffer8 = (java.nio.ByteBuffer) this.getOutputMinFrameDuration;
                    writerScope2 = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    borrow = byteBuffer8;
                    writerScope = writerScope2;
                    inflater3 = inflater5;
                    borrow2 = byteBuffer5;
                    writerScope4 = writerScope;
                    crc323 = crc32;
                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                    if (this.getHighSpeedVideoFpsRangesFor.isClosedForRead()) {
                    }
                    break;
                case 5:
                    intRef = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoSizesFor;
                    crc323 = (java.util.zip.CRC32) this.getOutputFormats;
                    inflater3 = (java.util.zip.Inflater) this.getInputSizeshNQ4ISI;
                    borrow2 = (java.nio.ByteBuffer) this.getInputFormats;
                    borrow = (java.nio.ByteBuffer) this.getOutputMinFrameDuration;
                    writerScope4 = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    if (((java.lang.Number) obj2).intValue() > 0) {
                        borrow.flip();
                        inflater3.setInput(borrow.array(), borrow.position(), borrow.remaining());
                        if (inflater3.needsInput() && !inflater3.finished()) {
                            int i5 = intRef.element;
                            this.getOutputStallDurationlomOqCM = writerScope4;
                            this.getOutputMinFrameDuration = borrow;
                            this.getInputFormats = borrow2;
                            this.getInputSizeshNQ4ISI = inflater3;
                            this.getOutputFormats = crc323;
                            this.getHighSpeedVideoSizesFor = intRef;
                            this.getOutputSizes = intRef;
                            this.getHighSpeedVideoSizes = i5;
                            this.getOutputStallDuration = 6;
                            access$inflateTo = io.ktor.util.EncodersJvmKt.access$inflateTo(inflater3, writerScope4.getChannel(), borrow2, crc323, this);
                            if (access$inflateTo != coroutine_suspended) {
                                writerScope6 = writerScope4;
                                byteBuffer2 = borrow;
                                intRef3 = intRef;
                                byteBuffer4 = borrow2;
                                inflater2 = inflater3;
                                crc325 = crc323;
                                i = i5;
                                intRef4 = intRef3;
                                intRef4.element = i + ((java.lang.Number) access$inflateTo).intValue();
                                byteBuffer2.position(byteBuffer2.limit() - inflater2.getRemaining());
                                intRef = intRef3;
                                crc323 = crc325;
                                inflater3 = inflater2;
                                borrow2 = byteBuffer4;
                                borrow = byteBuffer2;
                                writerScope4 = writerScope6;
                                if (inflater3.needsInput()) {
                                }
                                borrow.compact();
                            }
                            return coroutine_suspended;
                        }
                        borrow.compact();
                    }
                    if (this.getHighSpeedVideoFpsRangesFor.isClosedForRead()) {
                    }
                    break;
                case 6:
                    i = this.getHighSpeedVideoSizes;
                    intRef4 = (kotlin.jvm.internal.Ref.IntRef) this.getOutputSizes;
                    intRef3 = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoSizesFor;
                    crc325 = (java.util.zip.CRC32) this.getOutputFormats;
                    inflater2 = (java.util.zip.Inflater) this.getInputSizeshNQ4ISI;
                    byteBuffer4 = (java.nio.ByteBuffer) this.getInputFormats;
                    byteBuffer2 = (java.nio.ByteBuffer) this.getOutputMinFrameDuration;
                    writerScope6 = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        access$inflateTo = obj;
                        intRef4.element = i + ((java.lang.Number) access$inflateTo).intValue();
                        byteBuffer2.position(byteBuffer2.limit() - inflater2.getRemaining());
                        intRef = intRef3;
                        crc323 = crc325;
                        inflater3 = inflater2;
                        borrow2 = byteBuffer4;
                        borrow = byteBuffer2;
                        writerScope4 = writerScope6;
                        if (inflater3.needsInput()) {
                        }
                        borrow.compact();
                        if (this.getHighSpeedVideoFpsRangesFor.isClosedForRead()) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            inflater2.end();
                            io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer2);
                            io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer4);
                            throw th2;
                        }
                    }
                    break;
                case 7:
                    i2 = this.getHighSpeedVideoSizes;
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.getOutputSizes;
                    kotlin.jvm.internal.Ref.IntRef intRef6 = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoSizesFor;
                    crc324 = (java.util.zip.CRC32) this.getOutputFormats;
                    inflater3 = (java.util.zip.Inflater) this.getInputSizeshNQ4ISI;
                    borrow2 = (java.nio.ByteBuffer) this.getInputFormats;
                    borrow = (java.nio.ByteBuffer) this.getOutputMinFrameDuration;
                    writerScope5 = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                    kotlin.ResultKt.throwOnFailure(obj);
                    intRef5 = intRef6;
                    access$inflateTo2 = obj;
                    intRef2.element = i2 + ((java.lang.Number) access$inflateTo2).intValue();
                    borrow.position(borrow.limit() - inflater3.getRemaining());
                    intRef2 = intRef5;
                    if (!inflater3.finished()) {
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            byteBuffer2 = byteBuffer;
            byteBuffer4 = byteBuffer3;
            inflater2 = inflater;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.EncodersJvmKt$inflate$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1 = new io.ktor.util.EncodersJvmKt$inflate$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        encodersJvmKt$inflate$1.getOutputStallDurationlomOqCM = obj;
        return encodersJvmKt$inflate$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncodersJvmKt$inflate$1(boolean z, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.util.EncodersJvmKt$inflate$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = byteReadChannel;
    }
}
