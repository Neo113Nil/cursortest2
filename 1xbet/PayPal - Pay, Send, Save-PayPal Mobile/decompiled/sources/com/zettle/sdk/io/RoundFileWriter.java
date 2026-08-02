package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/io/RoundFileWriter;", "Lcom/zettle/sdk/io/CopyableFile;", "Ljava/io/Closeable;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.adjust.sdk.Constants.PUSH, "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RoundFileWriter extends com.zettle.sdk.io.CopyableFile, java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.io.RoundFileWriter.Companion INSTANCE = com.zettle.sdk.io.RoundFileWriter.Companion.getHighSpeedVideoSizes;

    void push(java.lang.String value);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/io/RoundFileWriter$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/zettle/sdk/io/RoundFileWriter;", "create", "(Ljava/io/File;)Lcom/zettle/sdk/io/RoundFileWriter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.io.RoundFileWriter.Companion getHighSpeedVideoSizes = new com.zettle.sdk.io.RoundFileWriter.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.io.RoundFileWriter create(final java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            return new com.zettle.sdk.io.RoundFileWriterImpl(com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_ITEM_SIZE, new kotlin.jvm.functions.Function0<com.zettle.sdk.io.FileWriter>() { // from class: com.zettle.sdk.io.RoundFileWriter$Companion$create$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final com.zettle.sdk.io.FileWriter invoke() {
                    return com.zettle.sdk.io.FileWriter.INSTANCE.create(file);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, new kotlin.jvm.functions.Function2<java.io.File, kotlin.jvm.functions.Function1<? super com.zettle.sdk.io.WritableFileChannel, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.zettle.sdk.io.RoundFileWriter$Companion$create$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(java.io.File file2, kotlin.jvm.functions.Function1<? super com.zettle.sdk.io.WritableFileChannel, ? extends kotlin.Unit> function1) {
                    getHighSpeedVideoSizes(file2, function1);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(java.io.File file2, kotlin.jvm.functions.Function1<? super com.zettle.sdk.io.WritableFileChannel, kotlin.Unit> function1) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                    com.zettle.sdk.io.WritableFileChannel fileOutputStream = new java.io.FileOutputStream(file2, true);
                    try {
                        com.zettle.sdk.io.WritableFileChannel.Companion companion = com.zettle.sdk.io.WritableFileChannel.INSTANCE;
                        java.nio.channels.FileChannel channel = fileOutputStream.getChannel();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "");
                        fileOutputStream = companion.create(channel);
                        try {
                            function1.invoke(fileOutputStream);
                            kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                        } finally {
                        }
                    } finally {
                    }
                }
            });
        }
    }
}
