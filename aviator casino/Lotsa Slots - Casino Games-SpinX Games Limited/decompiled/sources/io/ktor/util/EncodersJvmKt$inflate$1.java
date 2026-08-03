package io.ktor.util;

/* compiled from: EncodersJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {82, 99, 100, 110, 117, 123, 135}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes6.dex */
final class EncodersJvmKt$inflate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel $source;
    byte B$0;
    byte B$1;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    short S$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncodersJvmKt$inflate$1(boolean z, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.util.EncodersJvmKt$inflate$1> continuation) {
        super(2, continuation);
        this.$gzip = z;
        this.$source = byteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1 = new io.ktor.util.EncodersJvmKt$inflate$1(this.$gzip, this.$source, continuation);
        encodersJvmKt$inflate$1.L$0 = obj;
        return encodersJvmKt$inflate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.EncodersJvmKt$inflate$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0308 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:8:0x0034, B:10:0x032f, B:11:0x0302, B:13:0x0308, B:17:0x0346, B:19:0x034a, B:21:0x0352, B:23:0x0370, B:28:0x0375, B:29:0x0399, B:30:0x039a, B:31:0x03a5, B:32:0x03a6, B:33:0x03c9, B:34:0x03ca, B:37:0x03e5, B:38:0x03ec, B:45:0x0299, B:47:0x029f, B:49:0x02a5, B:53:0x02ef, B:54:0x0259, B:56:0x0261, B:59:0x027f, B:61:0x0287, B:62:0x02f4, B:64:0x02fc, B:65:0x03ed, B:76:0x0083), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0346 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:8:0x0034, B:10:0x032f, B:11:0x0302, B:13:0x0308, B:17:0x0346, B:19:0x034a, B:21:0x0352, B:23:0x0370, B:28:0x0375, B:29:0x0399, B:30:0x039a, B:31:0x03a5, B:32:0x03a6, B:33:0x03c9, B:34:0x03ca, B:37:0x03e5, B:38:0x03ec, B:45:0x0299, B:47:0x029f, B:49:0x02a5, B:53:0x02ef, B:54:0x0259, B:56:0x0261, B:59:0x027f, B:61:0x0287, B:62:0x02f4, B:64:0x02fc, B:65:0x03ed, B:76:0x0083), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029f A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:8:0x0034, B:10:0x032f, B:11:0x0302, B:13:0x0308, B:17:0x0346, B:19:0x034a, B:21:0x0352, B:23:0x0370, B:28:0x0375, B:29:0x0399, B:30:0x039a, B:31:0x03a5, B:32:0x03a6, B:33:0x03c9, B:34:0x03ca, B:37:0x03e5, B:38:0x03ec, B:45:0x0299, B:47:0x029f, B:49:0x02a5, B:53:0x02ef, B:54:0x0259, B:56:0x0261, B:59:0x027f, B:61:0x0287, B:62:0x02f4, B:64:0x02fc, B:65:0x03ed, B:76:0x0083), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0261 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:8:0x0034, B:10:0x032f, B:11:0x0302, B:13:0x0308, B:17:0x0346, B:19:0x034a, B:21:0x0352, B:23:0x0370, B:28:0x0375, B:29:0x0399, B:30:0x039a, B:31:0x03a5, B:32:0x03a6, B:33:0x03c9, B:34:0x03ca, B:37:0x03e5, B:38:0x03ec, B:45:0x0299, B:47:0x029f, B:49:0x02a5, B:53:0x02ef, B:54:0x0259, B:56:0x0261, B:59:0x027f, B:61:0x0287, B:62:0x02f4, B:64:0x02fc, B:65:0x03ed, B:76:0x0083), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0287 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:8:0x0034, B:10:0x032f, B:11:0x0302, B:13:0x0308, B:17:0x0346, B:19:0x034a, B:21:0x0352, B:23:0x0370, B:28:0x0375, B:29:0x0399, B:30:0x039a, B:31:0x03a5, B:32:0x03a6, B:33:0x03c9, B:34:0x03ca, B:37:0x03e5, B:38:0x03ec, B:45:0x0299, B:47:0x029f, B:49:0x02a5, B:53:0x02ef, B:54:0x0259, B:56:0x0261, B:59:0x027f, B:61:0x0287, B:62:0x02f4, B:64:0x02fc, B:65:0x03ed, B:76:0x0083), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f4 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:8:0x0034, B:10:0x032f, B:11:0x0302, B:13:0x0308, B:17:0x0346, B:19:0x034a, B:21:0x0352, B:23:0x0370, B:28:0x0375, B:29:0x0399, B:30:0x039a, B:31:0x03a5, B:32:0x03a6, B:33:0x03c9, B:34:0x03ca, B:37:0x03e5, B:38:0x03ec, B:45:0x0299, B:47:0x029f, B:49:0x02a5, B:53:0x02ef, B:54:0x0259, B:56:0x0261, B:59:0x027f, B:61:0x0287, B:62:0x02f4, B:64:0x02fc, B:65:0x03ed, B:76:0x0083), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x032e -> B:10:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x02cb -> B:43:0x02d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0285 -> B:54:0x0259). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0287 -> B:45:0x0299). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        java.nio.ByteBuffer byteBuffer2;
        java.util.zip.Inflater inflater;
        io.ktor.utils.io.WriterScope writerScope;
        java.nio.ByteBuffer borrow;
        java.nio.ByteBuffer borrow2;
        java.util.zip.Inflater inflater2;
        java.util.zip.CRC32 crc32;
        java.nio.ByteBuffer byteBuffer3;
        java.lang.Object readPacket;
        short readShortLittleEndian;
        byte readByte;
        byte readByte2;
        java.util.zip.Inflater inflater3;
        java.nio.ByteBuffer byteBuffer4;
        java.nio.ByteBuffer byteBuffer5;
        io.ktor.utils.io.WriterScope writerScope2;
        java.lang.Object readShort;
        java.nio.ByteBuffer byteBuffer6;
        short s;
        java.nio.ByteBuffer byteBuffer7;
        java.util.zip.CRC32 crc322;
        byte b;
        java.util.zip.Inflater inflater4;
        byte b2;
        io.ktor.utils.io.WriterScope writerScope3;
        long shortValue;
        boolean has;
        boolean has2;
        boolean has3;
        io.ktor.utils.io.WriterScope writerScope4;
        java.nio.ByteBuffer byteBuffer8;
        java.util.zip.CRC32 crc323;
        kotlin.jvm.internal.Ref.IntRef intRef;
        java.lang.Object obj2;
        java.nio.ByteBuffer byteBuffer9;
        java.nio.ByteBuffer byteBuffer10;
        java.util.zip.Inflater inflater5;
        io.ktor.utils.io.WriterScope writerScope5;
        java.util.zip.CRC32 crc324;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        java.lang.Object inflateTo;
        io.ktor.utils.io.WriterScope writerScope6;
        kotlin.jvm.internal.Ref.IntRef intRef3;
        java.util.zip.CRC32 crc325;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef4;
        int i2;
        java.lang.Object inflateTo2;
        kotlin.jvm.internal.Ref.IntRef intRef5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
                    borrow = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    borrow2 = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    inflater2 = new java.util.zip.Inflater(true);
                    crc32 = new java.util.zip.CRC32();
                    if (this.$gzip) {
                        this.L$0 = writerScope;
                        this.L$1 = borrow;
                        this.L$2 = borrow2;
                        this.L$3 = inflater2;
                        this.L$4 = crc32;
                        this.label = 1;
                        readPacket = io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(this.$source, 10, this);
                        if (readPacket == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlinx.io.Source source = (kotlinx.io.Source) readPacket;
                        readShortLittleEndian = io.ktor.utils.io.core.ByteReadPacketKt.readShortLittleEndian(source);
                        readByte = source.readByte();
                        readByte2 = source.readByte();
                        io.ktor.utils.io.core.ByteReadPacketKt.discard$default(source, 0L, 1, null);
                        if ((readByte2 & 4) == 0) {
                            this.L$0 = writerScope;
                            this.L$1 = borrow;
                            this.L$2 = borrow2;
                            this.L$3 = inflater2;
                            this.L$4 = crc32;
                            this.S$0 = readShortLittleEndian;
                            this.B$0 = readByte;
                            this.B$1 = readByte2;
                            this.label = 2;
                            readShort = io.ktor.utils.io.ByteReadChannelOperationsKt.readShort(this.$source, this);
                            if (readShort == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteBuffer6 = borrow2;
                            s = readShortLittleEndian;
                            byteBuffer7 = borrow;
                            crc322 = crc32;
                            b = readByte2;
                            io.ktor.utils.io.WriterScope writerScope7 = writerScope;
                            inflater4 = inflater2;
                            b2 = readByte;
                            writerScope3 = writerScope7;
                            shortValue = ((java.lang.Number) readShort).shortValue();
                            this.L$0 = writerScope3;
                            this.L$1 = byteBuffer7;
                            this.L$2 = byteBuffer6;
                            this.L$3 = inflater4;
                            this.L$4 = crc322;
                            this.S$0 = s;
                            this.B$0 = b2;
                            this.B$1 = b;
                            this.label = 3;
                            if (io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(this.$source, shortValue, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            readByte2 = b;
                            crc32 = crc322;
                            inflater3 = inflater4;
                            writerScope2 = writerScope3;
                            readByte = b2;
                            byteBuffer4 = byteBuffer6;
                            java.nio.ByteBuffer byteBuffer11 = byteBuffer7;
                            readShortLittleEndian = s;
                            byteBuffer5 = byteBuffer11;
                            if (readShortLittleEndian == -29921) {
                                throw new java.lang.IllegalStateException(("GZIP magic invalid: " + ((int) readShortLittleEndian)).toString());
                            }
                            if (readByte == 8) {
                                has = io.ktor.util.EncodersJvmKt.has(readByte2, 8);
                                if (!has) {
                                    has2 = io.ktor.util.EncodersJvmKt.has(readByte2, 16);
                                    if (!has2) {
                                        has3 = io.ktor.util.EncodersJvmKt.has(readByte2, 2);
                                        if (has3) {
                                            this.L$0 = writerScope2;
                                            this.L$1 = byteBuffer5;
                                            this.L$2 = byteBuffer4;
                                            this.L$3 = inflater3;
                                            this.L$4 = crc32;
                                            this.label = 4;
                                            if (io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(this.$source, 2L, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        writerScope = writerScope2;
                                        byteBuffer2 = byteBuffer4;
                                        java.nio.ByteBuffer byteBuffer12 = byteBuffer5;
                                        inflater = inflater3;
                                        byteBuffer3 = byteBuffer12;
                                        try {
                                            writerScope4 = writerScope;
                                            byteBuffer8 = byteBuffer3;
                                            crc323 = crc32;
                                            intRef = new kotlin.jvm.internal.Ref.IntRef();
                                            if (this.$source.isClosedForRead()) {
                                                this.L$0 = writerScope4;
                                                this.L$1 = byteBuffer8;
                                                this.L$2 = byteBuffer2;
                                                this.L$3 = inflater;
                                                this.L$4 = crc323;
                                                this.L$5 = intRef;
                                                this.L$6 = null;
                                                this.label = 5;
                                                obj2 = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(this.$source, byteBuffer8, this);
                                                if (obj2 == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                if (((java.lang.Number) obj2).intValue() > 0) {
                                                    byteBuffer8.flip();
                                                    inflater.setInput(byteBuffer8.array(), byteBuffer8.position(), byteBuffer8.remaining());
                                                    if (inflater.needsInput() && !inflater.finished()) {
                                                        int i3 = intRef.element;
                                                        this.L$0 = writerScope4;
                                                        this.L$1 = byteBuffer8;
                                                        this.L$2 = byteBuffer2;
                                                        this.L$3 = inflater;
                                                        this.L$4 = crc323;
                                                        this.L$5 = intRef;
                                                        this.L$6 = intRef;
                                                        this.I$0 = i3;
                                                        this.label = 6;
                                                        inflateTo = io.ktor.util.EncodersJvmKt.inflateTo(inflater, writerScope4.getChannel(), byteBuffer2, crc323, this);
                                                        if (inflateTo == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        writerScope6 = writerScope4;
                                                        byteBuffer9 = byteBuffer8;
                                                        intRef3 = intRef;
                                                        byteBuffer10 = byteBuffer2;
                                                        inflater5 = inflater;
                                                        crc325 = crc323;
                                                        i = i3;
                                                        intRef4 = intRef3;
                                                        intRef4.element = i + ((java.lang.Number) inflateTo).intValue();
                                                        byteBuffer9.position(byteBuffer9.limit() - inflater5.getRemaining());
                                                        intRef = intRef3;
                                                        crc323 = crc325;
                                                        inflater = inflater5;
                                                        byteBuffer2 = byteBuffer10;
                                                        byteBuffer8 = byteBuffer9;
                                                        writerScope4 = writerScope6;
                                                        if (inflater.needsInput()) {
                                                        }
                                                        byteBuffer8.compact();
                                                    } else {
                                                        byteBuffer8.compact();
                                                    }
                                                }
                                                if (this.$source.isClosedForRead()) {
                                                    java.lang.Throwable closedCause = this.$source.getClosedCause();
                                                    if (closedCause != null) {
                                                        throw closedCause;
                                                    }
                                                    byteBuffer8.flip();
                                                    writerScope5 = writerScope4;
                                                    crc324 = crc323;
                                                    intRef2 = intRef;
                                                    if (!inflater.finished()) {
                                                        i2 = intRef2.element;
                                                        this.L$0 = writerScope5;
                                                        this.L$1 = byteBuffer8;
                                                        this.L$2 = byteBuffer2;
                                                        this.L$3 = inflater;
                                                        this.L$4 = crc324;
                                                        this.L$5 = intRef2;
                                                        this.L$6 = intRef2;
                                                        this.I$0 = i2;
                                                        this.label = 7;
                                                        inflateTo2 = io.ktor.util.EncodersJvmKt.inflateTo(inflater, writerScope5.getChannel(), byteBuffer2, crc324, this);
                                                        if (inflateTo2 == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        intRef5 = intRef2;
                                                        intRef2.element = i2 + ((java.lang.Number) inflateTo2).intValue();
                                                        byteBuffer8.position(byteBuffer8.limit() - inflater.getRemaining());
                                                        intRef2 = intRef5;
                                                        if (!inflater.finished()) {
                                                            if (this.$gzip) {
                                                                if (byteBuffer8.remaining() != 8) {
                                                                    throw new java.lang.IllegalStateException(("Expected 8 bytes in the trailer. Actual: " + byteBuffer8.remaining() + " $").toString());
                                                                }
                                                                byteBuffer8.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                                                int i4 = byteBuffer8.getInt(byteBuffer8.position());
                                                                int i5 = byteBuffer8.getInt(byteBuffer8.position() + 4);
                                                                if (((int) crc324.getValue()) != i4) {
                                                                    throw new java.lang.IllegalStateException("Gzip checksum invalid.".toString());
                                                                }
                                                                if (intRef2.element != i5) {
                                                                    throw new java.lang.IllegalStateException(("Gzip size invalid. Expected " + i5 + ", actual " + intRef2.element).toString());
                                                                }
                                                            } else if (!(!byteBuffer8.hasRemaining())) {
                                                                throw new java.lang.IllegalStateException("Check failed.");
                                                            }
                                                            inflater.end();
                                                            io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer8);
                                                            io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer2);
                                                            return kotlin.Unit.INSTANCE;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            byteBuffer = byteBuffer3;
                                            try {
                                                throw th;
                                            } catch (java.lang.Throwable th2) {
                                                inflater.end();
                                                io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer);
                                                io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer2);
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        throw new java.lang.IllegalStateException("Gzip file comment not supported".toString());
                                    }
                                } else {
                                    throw new java.lang.IllegalStateException("Gzip file name not supported".toString());
                                }
                            } else {
                                throw new java.lang.IllegalStateException(("Deflater method unsupported: " + ((int) readByte) + '.').toString());
                            }
                        } else {
                            inflater3 = inflater2;
                            byteBuffer4 = borrow2;
                            byteBuffer5 = borrow;
                            writerScope2 = writerScope;
                            if (readShortLittleEndian == -29921) {
                            }
                        }
                    } else {
                        byteBuffer3 = borrow;
                        byteBuffer2 = borrow2;
                        inflater = inflater2;
                        writerScope4 = writerScope;
                        byteBuffer8 = byteBuffer3;
                        crc323 = crc32;
                        intRef = new kotlin.jvm.internal.Ref.IntRef();
                        if (this.$source.isClosedForRead()) {
                        }
                    }
                case 1:
                    crc32 = (java.util.zip.CRC32) this.L$4;
                    inflater2 = (java.util.zip.Inflater) this.L$3;
                    borrow2 = (java.nio.ByteBuffer) this.L$2;
                    borrow = (java.nio.ByteBuffer) this.L$1;
                    writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    readPacket = obj;
                    kotlinx.io.Source source2 = (kotlinx.io.Source) readPacket;
                    readShortLittleEndian = io.ktor.utils.io.core.ByteReadPacketKt.readShortLittleEndian(source2);
                    readByte = source2.readByte();
                    readByte2 = source2.readByte();
                    io.ktor.utils.io.core.ByteReadPacketKt.discard$default(source2, 0L, 1, null);
                    if ((readByte2 & 4) == 0) {
                    }
                    break;
                case 2:
                    b = this.B$1;
                    b2 = this.B$0;
                    s = this.S$0;
                    crc322 = (java.util.zip.CRC32) this.L$4;
                    inflater4 = (java.util.zip.Inflater) this.L$3;
                    byteBuffer6 = (java.nio.ByteBuffer) this.L$2;
                    byteBuffer7 = (java.nio.ByteBuffer) this.L$1;
                    writerScope3 = (io.ktor.utils.io.WriterScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    readShort = obj;
                    shortValue = ((java.lang.Number) readShort).shortValue();
                    this.L$0 = writerScope3;
                    this.L$1 = byteBuffer7;
                    this.L$2 = byteBuffer6;
                    this.L$3 = inflater4;
                    this.L$4 = crc322;
                    this.S$0 = s;
                    this.B$0 = b2;
                    this.B$1 = b;
                    this.label = 3;
                    if (io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(this.$source, shortValue, this) == coroutine_suspended) {
                    }
                    readByte2 = b;
                    crc32 = crc322;
                    inflater3 = inflater4;
                    writerScope2 = writerScope3;
                    readByte = b2;
                    byteBuffer4 = byteBuffer6;
                    java.nio.ByteBuffer byteBuffer112 = byteBuffer7;
                    readShortLittleEndian = s;
                    byteBuffer5 = byteBuffer112;
                    if (readShortLittleEndian == -29921) {
                    }
                    break;
                case 3:
                    b = this.B$1;
                    b2 = this.B$0;
                    s = this.S$0;
                    crc322 = (java.util.zip.CRC32) this.L$4;
                    inflater4 = (java.util.zip.Inflater) this.L$3;
                    byteBuffer6 = (java.nio.ByteBuffer) this.L$2;
                    byteBuffer7 = (java.nio.ByteBuffer) this.L$1;
                    writerScope3 = (io.ktor.utils.io.WriterScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    readByte2 = b;
                    crc32 = crc322;
                    inflater3 = inflater4;
                    writerScope2 = writerScope3;
                    readByte = b2;
                    byteBuffer4 = byteBuffer6;
                    java.nio.ByteBuffer byteBuffer1122 = byteBuffer7;
                    readShortLittleEndian = s;
                    byteBuffer5 = byteBuffer1122;
                    if (readShortLittleEndian == -29921) {
                    }
                    break;
                case 4:
                    crc32 = (java.util.zip.CRC32) this.L$4;
                    inflater3 = (java.util.zip.Inflater) this.L$3;
                    byteBuffer4 = (java.nio.ByteBuffer) this.L$2;
                    byteBuffer5 = (java.nio.ByteBuffer) this.L$1;
                    writerScope2 = (io.ktor.utils.io.WriterScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    writerScope = writerScope2;
                    byteBuffer2 = byteBuffer4;
                    java.nio.ByteBuffer byteBuffer122 = byteBuffer5;
                    inflater = inflater3;
                    byteBuffer3 = byteBuffer122;
                    writerScope4 = writerScope;
                    byteBuffer8 = byteBuffer3;
                    crc323 = crc32;
                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                    if (this.$source.isClosedForRead()) {
                    }
                    break;
                case 5:
                    intRef = (kotlin.jvm.internal.Ref.IntRef) this.L$5;
                    crc323 = (java.util.zip.CRC32) this.L$4;
                    inflater = (java.util.zip.Inflater) this.L$3;
                    byteBuffer2 = (java.nio.ByteBuffer) this.L$2;
                    byteBuffer8 = (java.nio.ByteBuffer) this.L$1;
                    writerScope4 = (io.ktor.utils.io.WriterScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    if (((java.lang.Number) obj2).intValue() > 0) {
                    }
                    if (this.$source.isClosedForRead()) {
                    }
                    break;
                case 6:
                    i = this.I$0;
                    intRef4 = (kotlin.jvm.internal.Ref.IntRef) this.L$6;
                    intRef3 = (kotlin.jvm.internal.Ref.IntRef) this.L$5;
                    crc325 = (java.util.zip.CRC32) this.L$4;
                    inflater5 = (java.util.zip.Inflater) this.L$3;
                    byteBuffer10 = (java.nio.ByteBuffer) this.L$2;
                    byteBuffer9 = (java.nio.ByteBuffer) this.L$1;
                    writerScope6 = (io.ktor.utils.io.WriterScope) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        inflateTo = obj;
                        intRef4.element = i + ((java.lang.Number) inflateTo).intValue();
                        byteBuffer9.position(byteBuffer9.limit() - inflater5.getRemaining());
                        intRef = intRef3;
                        crc323 = crc325;
                        inflater = inflater5;
                        byteBuffer2 = byteBuffer10;
                        byteBuffer8 = byteBuffer9;
                        writerScope4 = writerScope6;
                        if (inflater.needsInput()) {
                        }
                        byteBuffer8.compact();
                        if (this.$source.isClosedForRead()) {
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        inflater = inflater5;
                        byteBuffer2 = byteBuffer10;
                        byteBuffer = byteBuffer9;
                        throw th;
                    }
                    break;
                case 7:
                    i2 = this.I$0;
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.L$6;
                    kotlin.jvm.internal.Ref.IntRef intRef6 = (kotlin.jvm.internal.Ref.IntRef) this.L$5;
                    crc324 = (java.util.zip.CRC32) this.L$4;
                    inflater = (java.util.zip.Inflater) this.L$3;
                    byteBuffer2 = (java.nio.ByteBuffer) this.L$2;
                    byteBuffer8 = (java.nio.ByteBuffer) this.L$1;
                    writerScope5 = (io.ktor.utils.io.WriterScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    intRef5 = intRef6;
                    inflateTo2 = obj;
                    intRef2.element = i2 + ((java.lang.Number) inflateTo2).intValue();
                    byteBuffer8.position(byteBuffer8.limit() - inflater.getRemaining());
                    intRef2 = intRef5;
                    if (!inflater.finished()) {
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }
}
