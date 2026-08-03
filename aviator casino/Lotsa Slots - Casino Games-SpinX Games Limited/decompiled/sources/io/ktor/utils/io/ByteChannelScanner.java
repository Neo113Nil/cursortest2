package io.ktor.utils.io;

/* compiled from: ByteChannelScanner.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010!R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/ktor/utils/io/ByteChannelScanner;", "", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "Lkotlinx/io/bytestring/ByteString;", "matchString", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "", "limit", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteWriteChannel;J)V", "", "ignoreMissing", "findNext$ktor_io", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findNext", "", "buildPartialMatchTable", "()[I", "", "advanceToNextPotentialMatch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkFullMatch", "extra", "checkBounds", "(J)V", "", "toSingleLineString", "(Lkotlinx/io/bytestring/ByteString;)Ljava/lang/String;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/bytestring/ByteString;", "Lio/ktor/utils/io/ByteWriteChannel;", "J", "Lkotlinx/io/Source;", "input", "Lkotlinx/io/Source;", "partialMatchTable", "[I", "Lkotlinx/io/Buffer;", "partialMatchBuffer", "Lkotlinx/io/Buffer;", "bytesRead", "", "matchIndex", "I", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteChannelScanner {
    private long bytesRead;
    private final io.ktor.utils.io.ByteReadChannel channel;
    private final kotlinx.io.Source input;
    private final long limit;
    private int matchIndex;
    private final kotlinx.io.bytestring.ByteString matchString;
    private final kotlinx.io.Buffer partialMatchBuffer;
    private final int[] partialMatchTable;
    private final io.ktor.utils.io.ByteWriteChannel writeChannel;

    public ByteChannelScanner(io.ktor.utils.io.ByteReadChannel channel, kotlinx.io.bytestring.ByteString matchString, io.ktor.utils.io.ByteWriteChannel writeChannel, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchString, "matchString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        this.channel = channel;
        this.matchString = matchString;
        this.writeChannel = writeChannel;
        this.limit = j;
        if (matchString.getSize() <= 0) {
            throw new java.lang.IllegalArgumentException("Empty match string not permitted for scanning".toString());
        }
        this.input = channel.getReadBuffer();
        this.partialMatchTable = buildPartialMatchTable();
        this.partialMatchBuffer = new kotlinx.io.Buffer();
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

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cf -> B:19:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object findNext$ktor_io(boolean r10, kotlin.coroutines.Continuation<? super java.lang.Long> r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelScanner.findNext$ktor_io(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final int[] buildPartialMatchTable() {
        int[] iArr = new int[this.matchString.getSize()];
        int size = this.matchString.getSize();
        int i = 0;
        for (int i2 = 1; i2 < size; i2++) {
            while (i > 0 && this.matchString.get(i2) != this.matchString.get(i)) {
                i = iArr[i - 1];
            }
            if (this.matchString.get(i2) == this.matchString.get(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ab -> B:26:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object advanceToNextPotentialMatch(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1 byteChannelScanner$advanceToNextPotentialMatch$1;
        int i;
        long indexOf$default;
        if (continuation instanceof io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1) {
            byteChannelScanner$advanceToNextPotentialMatch$1 = (io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1) continuation;
            if ((byteChannelScanner$advanceToNextPotentialMatch$1.label & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$advanceToNextPotentialMatch$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteChannelScanner$advanceToNextPotentialMatch$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$advanceToNextPotentialMatch$1.label;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        indexOf$default = kotlinx.io.SourcesKt.indexOf$default(this.input, this.matchString.get(0), 0L, 0L, 6, null);
                        if (indexOf$default != -1) {
                            kotlinx.io.Source source = this.input;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(source, "null cannot be cast to non-null type kotlinx.io.Buffer");
                            checkBounds(((kotlinx.io.Buffer) source).getSizeMut());
                            this.bytesRead += ((kotlinx.io.Buffer) this.input).transferTo(this.writeChannel.getWriteBuffer());
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.writeChannel;
                            byteChannelScanner$advanceToNextPotentialMatch$1.label = 2;
                            if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, byteChannelScanner$advanceToNextPotentialMatch$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (this.input.exhausted()) {
                                io.ktor.utils.io.ByteReadChannel byteReadChannel = this.channel;
                                byteChannelScanner$advanceToNextPotentialMatch$1.label = 1;
                                obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$advanceToNextPotentialMatch$1, 1, null);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                }
                            }
                            indexOf$default = kotlinx.io.SourcesKt.indexOf$default(this.input, this.matchString.get(0), 0L, 0L, 6, null);
                            if (indexOf$default != -1) {
                                checkBounds(indexOf$default);
                                long j = this.bytesRead;
                                kotlinx.io.Source source2 = this.input;
                                kotlinx.io.Sink writeBuffer = this.writeChannel.getWriteBuffer();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(writeBuffer, "null cannot be cast to non-null type kotlinx.io.Buffer");
                                this.bytesRead = j + source2.readAtMostTo((kotlinx.io.Buffer) writeBuffer, indexOf$default);
                                io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                                byteChannelScanner$advanceToNextPotentialMatch$1.label = 3;
                                if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(byteWriteChannel2, byteChannelScanner$advanceToNextPotentialMatch$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    } else if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.input.exhausted()) {
                }
                indexOf$default = kotlinx.io.SourcesKt.indexOf$default(this.input, this.matchString.get(0), 0L, 0L, 6, null);
                if (indexOf$default != -1) {
                }
            }
        }
        byteChannelScanner$advanceToNextPotentialMatch$1 = new io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1(this, continuation);
        java.lang.Object obj2 = byteChannelScanner$advanceToNextPotentialMatch$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$advanceToNextPotentialMatch$1.label;
        if (i != 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj2);
        if (this.input.exhausted()) {
        }
        indexOf$default = kotlinx.io.SourcesKt.indexOf$default(this.input, this.matchString.get(0), 0L, 0L, 6, null);
        if (indexOf$default != -1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0044 -> B:21:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkFullMatch(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1 byteChannelScanner$checkFullMatch$1;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (continuation instanceof io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1) {
            byteChannelScanner$checkFullMatch$1 = (io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1) continuation;
            if ((byteChannelScanner$checkFullMatch$1.label & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$checkFullMatch$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = byteChannelScanner$checkFullMatch$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$checkFullMatch$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.input.exhausted()) {
                    }
                    byte readByte = this.input.readByte();
                    i2 = this.matchIndex;
                    if (i2 > 0) {
                    }
                    i3 = this.matchIndex + 1;
                    this.matchIndex = i3;
                    if (i3 == this.matchString.getSize()) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.bytesRead++;
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    byte readByte2 = this.input.readByte();
                    i2 = this.matchIndex;
                    if (i2 > 0 && readByte2 != this.matchString.get(i2)) {
                        int i6 = this.matchIndex;
                        while (true) {
                            i4 = this.matchIndex;
                            if (i4 <= 0 || readByte2 == this.matchString.get(i4)) {
                                break;
                            }
                            this.matchIndex = this.partialMatchTable[this.matchIndex - 1];
                        }
                        long j = i6 - this.matchIndex;
                        checkBounds(j);
                        long j2 = this.bytesRead;
                        kotlinx.io.Buffer buffer = this.partialMatchBuffer;
                        kotlinx.io.Sink writeBuffer = this.writeChannel.getWriteBuffer();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(writeBuffer, "null cannot be cast to non-null type kotlinx.io.Buffer");
                        this.bytesRead = j2 + buffer.readAtMostTo((kotlinx.io.Buffer) writeBuffer, j);
                        i5 = this.matchIndex;
                        if (i5 == 0 && readByte2 != this.matchString.get(i5)) {
                            byteChannelScanner$checkFullMatch$1.label = 2;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(this.writeChannel, readByte2, byteChannelScanner$checkFullMatch$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.bytesRead++;
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        }
                    }
                    i3 = this.matchIndex + 1;
                    this.matchIndex = i3;
                    if (i3 == this.matchString.getSize()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    }
                    this.partialMatchBuffer.writeByte(readByte2);
                    if (this.input.exhausted()) {
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = this.channel;
                        byteChannelScanner$checkFullMatch$1.label = 1;
                        obj = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$checkFullMatch$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    }
                    byte readByte22 = this.input.readByte();
                    i2 = this.matchIndex;
                    if (i2 > 0) {
                        int i62 = this.matchIndex;
                        while (true) {
                            i4 = this.matchIndex;
                            if (i4 <= 0) {
                                break;
                            }
                            break;
                            this.matchIndex = this.partialMatchTable[this.matchIndex - 1];
                        }
                        long j3 = i62 - this.matchIndex;
                        checkBounds(j3);
                        long j22 = this.bytesRead;
                        kotlinx.io.Buffer buffer2 = this.partialMatchBuffer;
                        kotlinx.io.Sink writeBuffer2 = this.writeChannel.getWriteBuffer();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(writeBuffer2, "null cannot be cast to non-null type kotlinx.io.Buffer");
                        this.bytesRead = j22 + buffer2.readAtMostTo((kotlinx.io.Buffer) writeBuffer2, j3);
                        i5 = this.matchIndex;
                        if (i5 == 0) {
                            byteChannelScanner$checkFullMatch$1.label = 2;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(this.writeChannel, readByte22, byteChannelScanner$checkFullMatch$1) == coroutine_suspended) {
                            }
                            this.bytesRead++;
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        }
                    }
                    i3 = this.matchIndex + 1;
                    this.matchIndex = i3;
                    if (i3 == this.matchString.getSize()) {
                    }
                }
            }
        }
        byteChannelScanner$checkFullMatch$1 = new io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1(this, continuation);
        java.lang.Object obj2 = byteChannelScanner$checkFullMatch$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$checkFullMatch$1.label;
        if (i != 0) {
        }
    }

    private final void checkBounds(long extra) {
        if (this.bytesRead + extra <= this.limit) {
            return;
        }
        throw new java.io.IOException("Limit of " + this.limit + " bytes exceeded while searching for \"" + toSingleLineString(this.matchString) + '\"');
    }

    private final java.lang.String toSingleLineString(kotlinx.io.bytestring.ByteString byteString) {
        return kotlin.text.StringsKt.replace$default(kotlinx.io.bytestring.ByteStringKt.decodeToString(byteString), "\n", "\\n", false, 4, (java.lang.Object) null);
    }
}
