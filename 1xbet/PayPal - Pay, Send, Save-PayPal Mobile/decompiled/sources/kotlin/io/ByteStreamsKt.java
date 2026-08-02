package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\r*\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0010"}, d2 = {"Ljava/io/BufferedInputStream;", "Lkotlin/collections/ByteIterator;", "iterator", "(Ljava/io/BufferedInputStream;)Lkotlin/collections/ByteIterator;", "Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "copyTo", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "estimatedSize", "", "readBytes", "(Ljava/io/InputStream;I)[B", "(Ljava/io/InputStream;)[B"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteStreamsKt {
    public static final kotlin.collections.ByteIterator iterator(final java.io.BufferedInputStream bufferedInputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedInputStream, "");
        return new kotlin.collections.ByteIterator() { // from class: kotlin.io.ByteStreamsKt$iterator$1
            private boolean finished;
            private int nextByte = -1;
            private boolean nextPrepared;

            public final int getNextByte() {
                return this.nextByte;
            }

            public final void setNextByte(int i) {
                this.nextByte = i;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            public final void setNextPrepared(boolean z) {
                this.nextPrepared = z;
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final void setFinished(boolean z) {
                this.finished = z;
            }

            private final void getHighSpeedVideoSizes() {
                if (this.nextPrepared || this.finished) {
                    return;
                }
                int read = bufferedInputStream.read();
                this.nextByte = read;
                this.nextPrepared = true;
                this.finished = read == -1;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                getHighSpeedVideoSizes();
                return !this.finished;
            }

            @Override // kotlin.collections.ByteIterator
            public final byte nextByte() {
                getHighSpeedVideoSizes();
                if (this.finished) {
                    throw new java.util.NoSuchElementException("Input stream is over.");
                }
                byte b = (byte) this.nextByte;
                this.nextPrepared = false;
                return b;
            }
        };
    }

    public static /* synthetic */ long copyTo$default(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(inputStream, outputStream, i);
    }

    @kotlin.IgnorableReturnValue
    public static final long copyTo(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static /* synthetic */ byte[] readBytes$default(java.io.InputStream inputStream, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return readBytes(inputStream, i);
    }

    @kotlin.Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @kotlin.ReplaceWith(expression = "readBytes()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = com.miteksystems.misnap.core.MibiData.MIBI_VERSION, warningSince = "1.3")
    public static final /* synthetic */ byte[] readBytes(java.io.InputStream inputStream, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(i, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }

    public static final byte[] readBytes(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }
}
