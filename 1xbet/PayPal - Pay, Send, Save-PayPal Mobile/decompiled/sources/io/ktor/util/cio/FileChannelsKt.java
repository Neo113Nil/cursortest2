package io.ktor.util.cio;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Ljava/io/File;", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", "readChannel", "(Ljava/io/File;JJLkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "Ljava/nio/channels/SeekableByteChannel;", "Lio/ktor/utils/io/WriterScope;", "writerScope", "", "writeToScope", "(Ljava/nio/channels/SeekableByteChannel;Lio/ktor/utils/io/WriterScope;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "(Ljava/io/File;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/io/RandomAccessFile;", "randomAccessFile", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FileChannelsKt {
    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel readChannel$default(java.io.File file, long j, long j2, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = -1;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getIO();
        }
        return readChannel(file, j3, j4, coroutineContext);
    }

    public static final io.ktor.utils.io.ByteReadChannel readChannel(final java.io.File file, long j, long j2, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        long length = file.length();
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.cio.FileChannelsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.util.cio.FileChannelsKt.m23398$r8$lambda$H10WopP1JT2IbeMry7FZOBxSqM(file);
            }
        });
        io.ktor.utils.io.WriterJob writer = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineContext), new kotlinx.coroutines.CoroutineName("file-reader").plus(coroutineContext), false, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.util.cio.FileChannelsKt$readChannel$writer$1(j, j2, length, lazy, null));
        io.ktor.utils.io.ByteWriteChannelOperationsKt.invokeOnCompletion(writer, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.cio.FileChannelsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.cio.FileChannelsKt.m23397$r8$lambda$bEDRJK6jhLjxVtgx4wX3W2C7I(kotlin.Lazy.this, (java.lang.Throwable) obj);
            }
        });
        return writer.getChannel();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x021a -> B:11:0x021d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeToScope(java.nio.channels.SeekableByteChannel seekableByteChannel, io.ktor.utils.io.WriterScope writerScope, long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.util.cio.FileChannelsKt$writeToScope$1 fileChannelsKt$writeToScope$1;
        int i;
        java.nio.channels.SeekableByteChannel seekableByteChannel2;
        io.ktor.utils.io.ByteWriteChannel channel;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        long j3;
        io.ktor.utils.io.ByteWriteChannel channel2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        int read;
        java.nio.channels.SeekableByteChannel seekableByteChannel3;
        io.ktor.util.cio.FileChannelsKt$writeToScope$1 fileChannelsKt$writeToScope$12;
        boolean z;
        if (continuation instanceof io.ktor.util.cio.FileChannelsKt$writeToScope$1) {
            fileChannelsKt$writeToScope$1 = (io.ktor.util.cio.FileChannelsKt$writeToScope$1) continuation;
            if ((fileChannelsKt$writeToScope$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                fileChannelsKt$writeToScope$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = fileChannelsKt$writeToScope$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileChannelsKt$writeToScope$1.getInputSizeshNQ4ISI;
                java.lang.String str = "Invalid number of bytes written: ";
                java.lang.String str2 = ". Should be in 0..";
                boolean z2 = false;
                int i2 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (j > 0) {
                        seekableByteChannel2 = seekableByteChannel;
                        seekableByteChannel2.position(j);
                    } else {
                        seekableByteChannel2 = seekableByteChannel;
                    }
                    if (j2 == -1) {
                        channel2 = writerScope.getChannel();
                        booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    } else {
                        kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                        longRef2.element = j;
                        channel = writerScope.getChannel();
                        longRef = longRef2;
                        booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                        j3 = j2;
                        if (!booleanRef.element) {
                        }
                    }
                } else if (i == 1) {
                    booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) fileChannelsKt$writeToScope$1.Camera2StreamConfigurationMap;
                    channel2 = (io.ktor.utils.io.ByteWriteChannel) fileChannelsKt$writeToScope$1.getHighSpeedVideoFpsRangesFor;
                    java.nio.channels.SeekableByteChannel seekableByteChannel4 = (java.nio.channels.SeekableByteChannel) fileChannelsKt$writeToScope$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    seekableByteChannel2 = seekableByteChannel4;
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = fileChannelsKt$writeToScope$1.getHighSpeedVideoFpsRanges;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) fileChannelsKt$writeToScope$1.getHighResolutionOutputSizeshNQ4ISI;
                    channel = (io.ktor.utils.io.ByteWriteChannel) fileChannelsKt$writeToScope$1.Camera2StreamConfigurationMap;
                    longRef = (kotlin.jvm.internal.Ref.LongRef) fileChannelsKt$writeToScope$1.getHighSpeedVideoFpsRangesFor;
                    java.nio.channels.SeekableByteChannel seekableByteChannel5 = (java.nio.channels.SeekableByteChannel) fileChannelsKt$writeToScope$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    char c = 65535;
                    java.lang.String str3 = "Invalid number of bytes written: ";
                    char c2 = 2;
                    io.ktor.util.cio.FileChannelsKt$writeToScope$1 fileChannelsKt$writeToScope$13 = fileChannelsKt$writeToScope$1;
                    int i3 = 1;
                    i2 = i3;
                    fileChannelsKt$writeToScope$1 = fileChannelsKt$writeToScope$13;
                    seekableByteChannel2 = seekableByteChannel5;
                    str = str3;
                    z2 = false;
                    if (!booleanRef.element) {
                        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                        kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI = channel.getWriteBuffer().getGetHighResolutionOutputSizeshNQ4ISI();
                        kotlinx.io.Segment writableSegment = getHighResolutionOutputSizeshNQ4ISI.writableSegment(i2);
                        byte[] dataAsByteArray = writableSegment.dataAsByteArray(z2);
                        int limit = writableSegment.getLimit();
                        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
                        long j4 = (j3 - longRef.element) + 1;
                        java.lang.String str4 = str2;
                        str3 = str;
                        if (j4 < wrap.remaining()) {
                            int limit2 = wrap.limit();
                            wrap.limit(wrap.position() + ((int) j4));
                            read = seekableByteChannel2.read(wrap);
                            wrap.limit(limit2);
                        } else {
                            read = seekableByteChannel2.read(wrap);
                        }
                        if (read > 0) {
                            seekableByteChannel3 = seekableByteChannel2;
                            fileChannelsKt$writeToScope$12 = fileChannelsKt$writeToScope$1;
                            longRef.element += read;
                        } else {
                            seekableByteChannel3 = seekableByteChannel2;
                            fileChannelsKt$writeToScope$12 = fileChannelsKt$writeToScope$1;
                        }
                        c = 65535;
                        if (read == -1 || longRef.element > j3) {
                            i3 = 1;
                            z = false;
                        } else {
                            i3 = 1;
                            z = true;
                        }
                        booleanRef.element = !z;
                        int position = wrap.position() - limit;
                        if (position == i3) {
                            writableSegment.writeBackData(dataAsByteArray, position);
                            writableSegment.setLimit(writableSegment.getLimit() + position);
                            getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + position);
                        } else {
                            if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(str3);
                                sb.append(position);
                                sb.append(str4);
                                sb.append(writableSegment.getRemainingCapacity());
                                throw new java.lang.IllegalStateException(sb.toString().toString());
                            }
                            if (position != 0) {
                                writableSegment.writeBackData(dataAsByteArray, position);
                                writableSegment.setLimit(writableSegment.getLimit() + position);
                                getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + position);
                            } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                                getHighResolutionOutputSizeshNQ4ISI.recycleTail();
                            }
                        }
                        fileChannelsKt$writeToScope$13 = fileChannelsKt$writeToScope$12;
                        java.nio.channels.SeekableByteChannel seekableByteChannel6 = seekableByteChannel3;
                        fileChannelsKt$writeToScope$13.getHighSpeedVideoSizes = seekableByteChannel6;
                        fileChannelsKt$writeToScope$13.getHighSpeedVideoFpsRangesFor = longRef;
                        fileChannelsKt$writeToScope$13.Camera2StreamConfigurationMap = channel;
                        fileChannelsKt$writeToScope$13.getHighResolutionOutputSizeshNQ4ISI = booleanRef;
                        fileChannelsKt$writeToScope$13.getHighSpeedVideoFpsRanges = j3;
                        c2 = 2;
                        fileChannelsKt$writeToScope$13.getInputSizeshNQ4ISI = 2;
                        if (channel.flush(fileChannelsKt$writeToScope$13) != coroutine_suspended) {
                            seekableByteChannel5 = seekableByteChannel6;
                            str2 = str4;
                            i2 = i3;
                            fileChannelsKt$writeToScope$1 = fileChannelsKt$writeToScope$13;
                            seekableByteChannel2 = seekableByteChannel5;
                            str = str3;
                            z2 = false;
                            if (!booleanRef.element) {
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                while (!booleanRef2.element) {
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations2 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI2 = channel2.getWriteBuffer().getGetHighResolutionOutputSizeshNQ4ISI();
                    kotlinx.io.Segment writableSegment2 = getHighResolutionOutputSizeshNQ4ISI2.writableSegment(1);
                    byte[] dataAsByteArray2 = writableSegment2.dataAsByteArray(false);
                    int limit3 = writableSegment2.getLimit();
                    java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(dataAsByteArray2, limit3, dataAsByteArray2.length - limit3);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(wrap2);
                    booleanRef2.element = !(seekableByteChannel2.read(wrap2) != -1);
                    int position2 = wrap2.position() - limit3;
                    if (position2 == 1) {
                        writableSegment2.writeBackData(dataAsByteArray2, position2);
                        writableSegment2.setLimit(writableSegment2.getLimit() + position2);
                        getHighResolutionOutputSizeshNQ4ISI2.setSizeMut(getHighResolutionOutputSizeshNQ4ISI2.getSizeMut() + position2);
                    } else {
                        if (position2 < 0 || position2 > writableSegment2.getRemainingCapacity()) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid number of bytes written: ");
                            sb2.append(position2);
                            sb2.append(". Should be in 0..");
                            sb2.append(writableSegment2.getRemainingCapacity());
                            throw new java.lang.IllegalStateException(sb2.toString().toString());
                        }
                        if (position2 != 0) {
                            writableSegment2.writeBackData(dataAsByteArray2, position2);
                            writableSegment2.setLimit(writableSegment2.getLimit() + position2);
                            getHighResolutionOutputSizeshNQ4ISI2.setSizeMut(getHighResolutionOutputSizeshNQ4ISI2.getSizeMut() + position2);
                        } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment2)) {
                            getHighResolutionOutputSizeshNQ4ISI2.recycleTail();
                        }
                    }
                    fileChannelsKt$writeToScope$1.getHighSpeedVideoSizes = seekableByteChannel2;
                    fileChannelsKt$writeToScope$1.getHighSpeedVideoFpsRangesFor = channel2;
                    fileChannelsKt$writeToScope$1.Camera2StreamConfigurationMap = booleanRef2;
                    fileChannelsKt$writeToScope$1.getInputSizeshNQ4ISI = 1;
                    if (channel2.flush(fileChannelsKt$writeToScope$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        fileChannelsKt$writeToScope$1 = new io.ktor.util.cio.FileChannelsKt$writeToScope$1(continuation);
        java.lang.Object obj2 = fileChannelsKt$writeToScope$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileChannelsKt$writeToScope$1.getInputSizeshNQ4ISI;
        java.lang.String str5 = "Invalid number of bytes written: ";
        java.lang.String str22 = ". Should be in 0..";
        boolean z22 = false;
        int i22 = 1;
        if (i != 0) {
        }
        while (!booleanRef2.element) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ io.ktor.utils.io.ByteWriteChannel writeChannel$default(java.io.File file, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getIO();
        }
        return writeChannel(file, coroutineContext);
    }

    public static final io.ktor.utils.io.ByteWriteChannel writeChannel(java.io.File file, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return io.ktor.utils.io.ByteReadChannelOperationsKt.reader((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, new kotlinx.coroutines.CoroutineName("file-writer").plus(coroutineContext), true, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.util.cio.FileChannelsKt$writeChannel$1(file, null)).getChannel();
    }

    /* renamed from: $r8$lambda$-bEDRJK6jhLjxVtgx4wX3W2-C7I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23397$r8$lambda$bEDRJK6jhLjxVtgx4wX3W2C7I(kotlin.Lazy lazy, java.lang.Throwable th) {
        ((java.io.RandomAccessFile) lazy.getValue()).close();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$H10WopP1JT2IbeMry7FZOBxSq-M, reason: not valid java name */
    public static /* synthetic */ java.io.RandomAccessFile m23398$r8$lambda$H10WopP1JT2IbeMry7FZOBxSqM(java.io.File file) {
        return new java.io.RandomAccessFile(file, "r");
    }

    public static final /* synthetic */ java.io.RandomAccessFile access$readChannel$lambda$1(kotlin.Lazy lazy) {
        return (java.io.RandomAccessFile) lazy.getValue();
    }
}
