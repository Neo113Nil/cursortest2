package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Ljava/nio/file/Path;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "readText", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;", "", "text", "", "Ljava/nio/file/OpenOption;", "options", "", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "appendText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)V"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
/* loaded from: classes17.dex */
class PathsKt__PathReadWriteKt {
    public static /* synthetic */ java.lang.String readText$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return kotlin.io.path.PathsKt.readText(path, charset);
    }

    public static final java.lang.String readText(java.nio.file.Path path, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(new java.nio.file.OpenOption[0], 0)), charset);
        try {
            java.lang.String readText = kotlin.io.TextStreamsKt.readText(inputStreamReader);
            kotlin.io.CloseableKt.closeFinally(inputStreamReader, null);
            return readText;
        } finally {
        }
    }

    public static /* synthetic */ void writeText$default(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset, java.nio.file.OpenOption[] openOptionArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.path.PathsKt.writeText(path, charSequence, charset, openOptionArr);
    }

    public static final void writeText(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset, java.nio.file.OpenOption... openOptionArr) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openOptionArr, "");
        java.io.OutputStream newOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
        try {
            java.io.OutputStream outputStream = newOutputStream;
            if (charSequence instanceof java.lang.String) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(outputStream);
                kotlin.io.FilesKt.writeTextImpl(outputStream, (java.lang.String) charSequence, charset);
            } else {
                java.nio.charset.CharsetEncoder newReplaceEncoder = kotlin.io.FilesKt.newReplaceEncoder(charset);
                java.nio.CharBuffer asReadOnlyBuffer = charSequence instanceof java.nio.CharBuffer ? ((java.nio.CharBuffer) charSequence).asReadOnlyBuffer() : java.nio.CharBuffer.wrap(charSequence);
                int min = java.lang.Math.min(charSequence.length(), 8192);
                kotlin.jvm.internal.Intrinsics.checkNotNull(newReplaceEncoder);
                java.nio.ByteBuffer byteBufferForEncoding = kotlin.io.FilesKt.byteBufferForEncoding(min, newReplaceEncoder);
                while (asReadOnlyBuffer.hasRemaining()) {
                    if (newReplaceEncoder.encode(asReadOnlyBuffer, byteBufferForEncoding, true).isError()) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    outputStream.write(byteBufferForEncoding.array(), 0, byteBufferForEncoding.position());
                    byteBufferForEncoding.clear();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(newOutputStream, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(newOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void appendText$default(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.io.path.PathsKt.appendText(path, charSequence, charset);
    }

    public static final void appendText(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        kotlin.io.path.PathsKt.writeText(path, charSequence, charset, java.nio.file.StandardOpenOption.APPEND);
    }
}
