package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0016\u0010\u001b\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)"}, d2 = {"Lio/ktor/utils/io/ByteChannelScanner;", "", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "Lkotlinx/io/bytestring/ByteString;", "matchString", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "", "limit", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteWriteChannel;J)V", "", "ignoreMissing", "findNext$ktor_io", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "p0", "getHighSpeedVideoFpsRanges", "(J)V", "Camera2StreamConfigurationMap", "Lio/ktor/utils/io/ByteReadChannel;", "getInputFormats", "Lkotlinx/io/bytestring/ByteString;", "getOutputMinFrameDuration", "Lio/ktor/utils/io/ByteWriteChannel;", "getHighResolutionOutputSizeshNQ4ISI", "J", "Lkotlinx/io/Source;", "Lkotlinx/io/Source;", "", "getHighSpeedVideoSizesFor", "[I", "Lkotlinx/io/Buffer;", "getInputSizeshNQ4ISI", "Lkotlinx/io/Buffer;", "getOutputFormats", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteChannelScanner {
    private final io.ktor.utils.io.ByteReadChannel Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.io.Source getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;
    private final int[] getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.io.bytestring.ByteString getHighSpeedVideoSizes;
    private final kotlinx.io.Buffer getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final io.ktor.utils.io.ByteWriteChannel getHighResolutionOutputSizeshNQ4ISI;

    public ByteChannelScanner(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        this.Camera2StreamConfigurationMap = byteReadChannel;
        this.getHighSpeedVideoSizes = byteString;
        this.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel;
        this.getHighSpeedVideoFpsRanges = j;
        if (byteString.getSize() <= 0) {
            throw new java.lang.IllegalArgumentException("Empty match string not permitted for scanning".toString());
        }
        this.getHighSpeedVideoFpsRangesFor = byteReadChannel.getReadBuffer();
        int[] iArr = new int[byteString.getSize()];
        int size = byteString.getSize();
        int i = 0;
        for (int i2 = 1; i2 < size; i2++) {
            while (i > 0 && this.getHighSpeedVideoSizes.get(i2) != this.getHighSpeedVideoSizes.get(i)) {
                i = iArr[i - 1];
            }
            if (this.getHighSpeedVideoSizes.get(i2) == this.getHighSpeedVideoSizes.get(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        this.getHighSpeedVideoSizesFor = iArr;
        this.getInputSizeshNQ4ISI = new kotlinx.io.Buffer();
    }

    public /* synthetic */ ByteChannelScanner(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteString, byteWriteChannel, (i & 8) != 0 ? Long.MAX_VALUE : j);
    }

    public static /* synthetic */ java.lang.Object findNext$ktor_io$default(io.ktor.utils.io.ByteChannelScanner byteChannelScanner, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return byteChannelScanner.findNext$ktor_io(z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r10.flush(r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        if (getHighSpeedVideoFpsRangesFor(r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d7 -> B:19:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object findNext$ktor_io(boolean z, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        io.ktor.utils.io.ByteChannelScanner$findNext$1 byteChannelScanner$findNext$1;
        int i;
        if (continuation instanceof io.ktor.utils.io.ByteChannelScanner$findNext$1) {
            byteChannelScanner$findNext$1 = (io.ktor.utils.io.ByteChannelScanner$findNext$1) continuation;
            if ((byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = byteChannelScanner$findNext$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputFormats = 0L;
                    if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
                    }
                    byteChannelScanner$findNext$1.getHighSpeedVideoSizes = z;
                    byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                } else if (i == 1) {
                    z = byteChannelScanner$findNext$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        if (!z) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected \"");
                            sb.append(kotlin.text.StringsKt.replace$default(kotlinx.io.bytestring.ByteStringKt.decodeToString(this.getHighSpeedVideoSizes), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n", false, 4, (java.lang.Object) null));
                            sb.append("\" but encountered end of input");
                            throw new java.io.IOException(sb.toString());
                        }
                        this.getOutputFormats += this.getInputSizeshNQ4ISI.transferTo(this.getHighResolutionOutputSizeshNQ4ISI.getWriteBuffer());
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.getHighResolutionOutputSizeshNQ4ISI;
                        byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI = 4;
                    }
                    byteChannelScanner$findNext$1.getHighSpeedVideoSizes = z;
                    byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                } else if (i == 2) {
                    z = byteChannelScanner$findNext$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteChannelScanner$findNext$1.getHighSpeedVideoSizes = z;
                    byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                    obj = getHighSpeedVideoSizes(byteChannelScanner$findNext$1);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxLong(this.getOutputFormats);
                    }
                    z = byteChannelScanner$findNext$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxLong(this.getOutputFormats);
                    }
                    if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = this.Camera2StreamConfigurationMap;
                        byteChannelScanner$findNext$1.getHighSpeedVideoSizes = z;
                        byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$findNext$1, 1, null);
                    }
                    byteChannelScanner$findNext$1.getHighSpeedVideoSizes = z;
                    byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }
            }
        }
        byteChannelScanner$findNext$1 = new io.ktor.utils.io.ByteChannelScanner$findNext$1(this, continuation);
        java.lang.Object obj2 = byteChannelScanner$findNext$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$findNext$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(r1, r2) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(r1, r2) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00aa -> B:26:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1 byteChannelScanner$advanceToNextPotentialMatch$1;
        int i;
        long indexOf$default;
        if (continuation instanceof io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1) {
            byteChannelScanner$advanceToNextPotentialMatch$1 = (io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1) continuation;
            if ((byteChannelScanner$advanceToNextPotentialMatch$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$advanceToNextPotentialMatch$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = byteChannelScanner$advanceToNextPotentialMatch$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$advanceToNextPotentialMatch$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        indexOf$default = kotlinx.io.SourcesKt.indexOf$default(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.get(0), 0L, 0L, 6, null);
                        if (indexOf$default == -1) {
                            kotlinx.io.Source source = this.getHighSpeedVideoFpsRangesFor;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(source, "");
                            getHighSpeedVideoFpsRanges(((kotlinx.io.Buffer) source).getSizeMut());
                            this.getOutputFormats += ((kotlinx.io.Buffer) this.getHighSpeedVideoFpsRangesFor).transferTo(this.getHighResolutionOutputSizeshNQ4ISI.getWriteBuffer());
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.getHighResolutionOutputSizeshNQ4ISI;
                            byteChannelScanner$advanceToNextPotentialMatch$1.getHighSpeedVideoSizes = 2;
                        } else {
                            getHighSpeedVideoFpsRanges(indexOf$default);
                            long j = this.getOutputFormats;
                            kotlinx.io.Source source2 = this.getHighSpeedVideoFpsRangesFor;
                            kotlinx.io.Sink writeBuffer = this.getHighResolutionOutputSizeshNQ4ISI.getWriteBuffer();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(writeBuffer, "");
                            this.getOutputFormats = j + source2.readAtMostTo((kotlinx.io.Buffer) writeBuffer, indexOf$default);
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            byteChannelScanner$advanceToNextPotentialMatch$1.getHighSpeedVideoSizes = 3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
                    io.ktor.utils.io.ByteReadChannel byteReadChannel = this.Camera2StreamConfigurationMap;
                    byteChannelScanner$advanceToNextPotentialMatch$1.getHighSpeedVideoSizes = 1;
                    obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$advanceToNextPotentialMatch$1, 1, null);
                }
                indexOf$default = kotlinx.io.SourcesKt.indexOf$default(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.get(0), 0L, 0L, 6, null);
                if (indexOf$default == -1) {
                }
                return coroutine_suspended;
            }
        }
        byteChannelScanner$advanceToNextPotentialMatch$1 = new io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1(this, continuation);
        java.lang.Object obj2 = byteChannelScanner$advanceToNextPotentialMatch$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$advanceToNextPotentialMatch$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj2);
        if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
        }
        indexOf$default = kotlinx.io.SourcesKt.indexOf$default(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.get(0), 0L, 0L, 6, null);
        if (indexOf$default == -1) {
        }
        return coroutine_suspended2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r12.getHighResolutionOutputSizeshNQ4ISI, r13, r0) != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
    
        if (r13 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0044 -> B:21:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x004f -> B:17:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1 byteChannelScanner$checkFullMatch$1;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (continuation instanceof io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1) {
            byteChannelScanner$checkFullMatch$1 = (io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1) continuation;
            if ((byteChannelScanner$checkFullMatch$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$checkFullMatch$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = byteChannelScanner$checkFullMatch$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$checkFullMatch$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
                    }
                    byte readByte = this.getHighSpeedVideoFpsRangesFor.readByte();
                    i2 = this.getOutputMinFrameDuration;
                    if (i2 > 0) {
                    }
                    i3 = this.getOutputMinFrameDuration + 1;
                    this.getOutputMinFrameDuration = i3;
                    if (i3 == this.getHighSpeedVideoSizes.getSize()) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getOutputFormats++;
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    byte readByte2 = this.getHighSpeedVideoFpsRangesFor.readByte();
                    i2 = this.getOutputMinFrameDuration;
                    if (i2 > 0 && readByte2 != this.getHighSpeedVideoSizes.get(i2)) {
                        int i6 = this.getOutputMinFrameDuration;
                        while (true) {
                            i4 = this.getOutputMinFrameDuration;
                            if (i4 <= 0 || readByte2 == this.getHighSpeedVideoSizes.get(i4)) {
                                break;
                            }
                            this.getOutputMinFrameDuration = this.getHighSpeedVideoSizesFor[this.getOutputMinFrameDuration - 1];
                        }
                        long j = i6 - this.getOutputMinFrameDuration;
                        getHighSpeedVideoFpsRanges(j);
                        long j2 = this.getOutputFormats;
                        kotlinx.io.Buffer buffer = this.getInputSizeshNQ4ISI;
                        kotlinx.io.Sink writeBuffer = this.getHighResolutionOutputSizeshNQ4ISI.getWriteBuffer();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(writeBuffer, "");
                        this.getOutputFormats = j2 + buffer.readAtMostTo((kotlinx.io.Buffer) writeBuffer, j);
                        i5 = this.getOutputMinFrameDuration;
                        if (i5 == 0 && readByte2 != this.getHighSpeedVideoSizes.get(i5)) {
                            byteChannelScanner$checkFullMatch$1.Camera2StreamConfigurationMap = 2;
                        }
                    }
                    i3 = this.getOutputMinFrameDuration + 1;
                    this.getOutputMinFrameDuration = i3;
                    if (i3 == this.getHighSpeedVideoSizes.getSize()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    this.getInputSizeshNQ4ISI.writeByte(readByte2);
                    if (this.getHighSpeedVideoFpsRangesFor.exhausted()) {
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = this.Camera2StreamConfigurationMap;
                        byteChannelScanner$checkFullMatch$1.Camera2StreamConfigurationMap = 1;
                        obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$checkFullMatch$1, 1, null);
                    }
                    byte readByte22 = this.getHighSpeedVideoFpsRangesFor.readByte();
                    i2 = this.getOutputMinFrameDuration;
                    if (i2 > 0) {
                        int i62 = this.getOutputMinFrameDuration;
                        while (true) {
                            i4 = this.getOutputMinFrameDuration;
                            if (i4 <= 0) {
                                break;
                            }
                            break;
                            this.getOutputMinFrameDuration = this.getHighSpeedVideoSizesFor[this.getOutputMinFrameDuration - 1];
                        }
                        long j3 = i62 - this.getOutputMinFrameDuration;
                        getHighSpeedVideoFpsRanges(j3);
                        long j22 = this.getOutputFormats;
                        kotlinx.io.Buffer buffer2 = this.getInputSizeshNQ4ISI;
                        kotlinx.io.Sink writeBuffer2 = this.getHighResolutionOutputSizeshNQ4ISI.getWriteBuffer();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(writeBuffer2, "");
                        this.getOutputFormats = j22 + buffer2.readAtMostTo((kotlinx.io.Buffer) writeBuffer2, j3);
                        i5 = this.getOutputMinFrameDuration;
                        if (i5 == 0) {
                            byteChannelScanner$checkFullMatch$1.Camera2StreamConfigurationMap = 2;
                        }
                    }
                    i3 = this.getOutputMinFrameDuration + 1;
                    this.getOutputMinFrameDuration = i3;
                    if (i3 == this.getHighSpeedVideoSizes.getSize()) {
                    }
                }
            }
        }
        byteChannelScanner$checkFullMatch$1 = new io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1(this, continuation);
        java.lang.Object obj2 = byteChannelScanner$checkFullMatch$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$checkFullMatch$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    private final void getHighSpeedVideoFpsRanges(long p0) {
        if (this.getOutputFormats + p0 <= this.getHighSpeedVideoFpsRanges) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Limit of ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(" bytes exceeded while searching for \"");
        sb.append(kotlin.text.StringsKt.replace$default(kotlinx.io.bytestring.ByteStringKt.decodeToString(this.getHighSpeedVideoSizes), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n", false, 4, (java.lang.Object) null));
        sb.append('\"');
        throw new java.io.IOException(sb.toString());
    }
}
