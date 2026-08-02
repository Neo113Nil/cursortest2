package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012-\u0010\u000f\u001a)\u0012\u0004\u0012\u00020\t\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\f0\bj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR;\u0010 \u001a)\u0012\u0004\u0012\u00020\t\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\f0\bj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001e\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$"}, d2 = {"Lcom/zettle/sdk/io/RoundFileWriterImpl;", "Lcom/zettle/sdk/io/RoundFileWriter;", "", "maxFileSize", "Lkotlin/Function0;", "Lcom/zettle/sdk/io/FileWriter;", "Lcom/zettle/sdk/io/WriterFactory;", "writerFactory", "Lkotlin/Function2;", "Ljava/io/File;", "Lkotlin/Function1;", "Lcom/zettle/sdk/io/WritableFileChannel;", "", "Lkotlin/ExtensionFunctionType;", "Lcom/zettle/sdk/io/UseChannel;", "useChannel", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "close", "()V", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "copy", "(Ljava/io/File;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adjust.sdk.Constants.PUSH, "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RoundFileWriterImpl implements com.zettle.sdk.io.RoundFileWriter {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.io.File, kotlin.jvm.functions.Function1<? super com.zettle.sdk.io.WritableFileChannel, kotlin.Unit>, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.zettle.sdk.io.FileWriter> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy<com.zettle.sdk.io.FileWriter> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundFileWriterImpl(long j, kotlin.jvm.functions.Function0<? extends com.zettle.sdk.io.FileWriter> function0, kotlin.jvm.functions.Function2<? super java.io.File, ? super kotlin.jvm.functions.Function1<? super com.zettle.sdk.io.WritableFileChannel, kotlin.Unit>, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = function2;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.io.FileWriter>() { // from class: com.zettle.sdk.io.RoundFileWriterImpl$writer$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.io.FileWriter invoke() {
                kotlin.jvm.functions.Function0 function02;
                long j2;
                function02 = com.zettle.sdk.io.RoundFileWriterImpl.this.getHighSpeedVideoSizes;
                com.zettle.sdk.io.FileWriter fileWriter = (com.zettle.sdk.io.FileWriter) function02.invoke();
                if (fileWriter.getLength() > 8) {
                    fileWriter.seek(0L);
                    j2 = fileWriter.readLong();
                } else {
                    j2 = 0;
                }
                if (8 > j2 || j2 >= fileWriter.getLength()) {
                    fileWriter.seek(0L);
                    fileWriter.write(8L);
                    return fileWriter;
                }
                fileWriter.seek(j2);
                return fileWriter;
            }

            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.io.RoundFileWriter
    public final void push(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        byte[] bytes = value.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        if (bytes.length == 0) {
            return;
        }
        int i = 0;
        while (i < bytes.length) {
            int pointer = (int) (this.getHighSpeedVideoFpsRangesFor - this.Camera2StreamConfigurationMap.getValue().getPointer());
            if (pointer > 0) {
                int min = java.lang.Math.min(bytes.length - i, pointer);
                com.zettle.sdk.io.FileWriter value2 = this.Camera2StreamConfigurationMap.getValue();
                value2.write(bytes, i, min);
                long pointer2 = value2.getPointer();
                value2.seek(0L);
                value2.write(pointer2);
                value2.seek(pointer2);
                i += min;
            } else {
                this.Camera2StreamConfigurationMap.getValue().seek(8L);
            }
        }
    }

    @Override // com.zettle.sdk.io.CopyableFile
    public final void copy(java.io.File target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        if (!target.exists()) {
            target.createNewFile();
        }
        this.getHighSpeedVideoFpsRanges.invoke(target, new kotlin.jvm.functions.Function1<com.zettle.sdk.io.WritableFileChannel, kotlin.Unit>() { // from class: com.zettle.sdk.io.RoundFileWriterImpl$copy$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.io.WritableFileChannel writableFileChannel) {
                getHighResolutionOutputSizeshNQ4ISI(writableFileChannel);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.io.WritableFileChannel writableFileChannel) {
                kotlin.Lazy lazy;
                kotlin.Lazy lazy2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writableFileChannel, "");
                writableFileChannel.seek(writableFileChannel.getLength());
                lazy = com.zettle.sdk.io.RoundFileWriterImpl.this.Camera2StreamConfigurationMap;
                com.zettle.sdk.io.WritableFileChannel channel = ((com.zettle.sdk.io.FileWriter) lazy.getValue()).getChannel();
                lazy2 = com.zettle.sdk.io.RoundFileWriterImpl.this.Camera2StreamConfigurationMap;
                long pointer = ((com.zettle.sdk.io.FileWriter) lazy2.getValue()).getPointer();
                if (pointer > 8) {
                    channel.transferTo(writableFileChannel, pointer, channel.getLength());
                    channel.transferTo(writableFileChannel, 8L, pointer - 8);
                } else {
                    channel.transferTo(writableFileChannel, 8L, channel.getLength() - 8);
                }
            }

            {
                super(1);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.Camera2StreamConfigurationMap.isInitialized()) {
                this.Camera2StreamConfigurationMap.getValue().close();
                this.Camera2StreamConfigurationMap.getValue().getChannel().close();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
