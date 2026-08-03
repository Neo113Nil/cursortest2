package kotlin.io.path;

/* compiled from: PathReadWrite.kt */
@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b\u001a:\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\r\u001a0\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\u0010\u001a:\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0087\b\u001a.\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00152\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0087\b\u001a\u0016\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a7\u0010\u001d\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007¢\u0006\u0002\u0010 \u001a\u001e\u0010!\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a=\u0010\"\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00170$H\u0087\bø\u0001\u0000\u001a&\u0010(\u001a\u00020)*\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010*\u001a&\u0010+\u001a\u00020,*\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u0010-\u001a\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0/*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001aL\u00100\u001a\u0002H1\"\u0004\b\u0000\u00101*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c03\u0012\u0004\u0012\u0002H10$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u00104\u001a>\u00105\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f072\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u00108\u001a>\u00105\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f032\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0087\b¢\u0006\u0002\u00109\u001a%\u0010:\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f072\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010:\u001a\u00020\u0002*\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f032\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"reader", "Ljava/io/InputStreamReader;", "Ljava/nio/file/Path;", "charset", "Ljava/nio/charset/Charset;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "readBytes", "", "writeBytes", "", "array", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "appendBytes", "readText", "", "writeText", "text", "", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "appendText", "forEachLine", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readLines", "", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeLines", "lines", "", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "appendLines", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
/* loaded from: classes6.dex */
class PathsKt__PathReadWriteKt {
    static /* synthetic */ java.io.InputStreamReader reader$default(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    private static final java.io.InputStreamReader reader(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption[] options, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedReader(new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    private static final java.io.BufferedReader bufferedReader(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedReader(new java.io.InputStreamReader(java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    static /* synthetic */ java.io.OutputStreamWriter writer$default(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    private static final java.io.OutputStreamWriter writer(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption[] options, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    private static final java.io.BufferedWriter bufferedWriter(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length)), charset), i);
    }

    private static final byte[] readBytes(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        byte[] readAllBytes = java.nio.file.Files.readAllBytes(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readAllBytes, "readAllBytes(...)");
        return readAllBytes;
    }

    private static final void writeBytes(java.nio.file.Path path, byte[] array, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Files.write(path, array, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final void appendBytes(java.nio.file.Path path, byte[] array) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        java.nio.file.Files.write(path, array, java.nio.file.StandardOpenOption.APPEND);
    }

    public static /* synthetic */ java.lang.String readText$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return kotlin.io.path.PathsKt.readText(path, charset);
    }

    public static final java.lang.String readText(java.nio.file.Path path, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
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

    public static final void writeText(java.nio.file.Path path, java.lang.CharSequence text, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.OutputStream newOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        try {
            java.io.OutputStream outputStream = newOutputStream;
            if (text instanceof java.lang.String) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(outputStream);
                kotlin.io.FilesKt.writeTextImpl(outputStream, (java.lang.String) text, charset);
            } else {
                java.nio.charset.CharsetEncoder newReplaceEncoder = kotlin.io.FilesKt.newReplaceEncoder(charset);
                java.nio.CharBuffer asReadOnlyBuffer = text instanceof java.nio.CharBuffer ? ((java.nio.CharBuffer) text).asReadOnlyBuffer() : java.nio.CharBuffer.wrap(text);
                int min = java.lang.Math.min(text.length(), 8192);
                kotlin.jvm.internal.Intrinsics.checkNotNull(newReplaceEncoder);
                java.nio.ByteBuffer byteBufferForEncoding = kotlin.io.FilesKt.byteBufferForEncoding(min, newReplaceEncoder);
                while (asReadOnlyBuffer.hasRemaining()) {
                    if (!(true ^ newReplaceEncoder.encode(asReadOnlyBuffer, byteBufferForEncoding, true).isError())) {
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

    public static final void appendText(java.nio.file.Path path, java.lang.CharSequence text, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.io.path.PathsKt.writeText(path, text, charset, java.nio.file.StandardOpenOption.APPEND);
    }

    static /* synthetic */ void forEachLine$default(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.io.BufferedReader newBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBufferedReader, "newBufferedReader(...)");
        java.io.BufferedReader bufferedReader = newBufferedReader;
        try {
            java.util.Iterator<java.lang.String> it = kotlin.io.TextStreamsKt.lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    private static final void forEachLine(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.io.BufferedReader newBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBufferedReader, "newBufferedReader(...)");
        java.io.BufferedReader bufferedReader = newBufferedReader;
        try {
            java.util.Iterator<java.lang.String> it = kotlin.io.TextStreamsKt.lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    private static final java.io.InputStream inputStream(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.InputStream newInputStream = java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInputStream, "newInputStream(...)");
        return newInputStream;
    }

    private static final java.io.OutputStream outputStream(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.io.OutputStream newOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(...)");
        return newOutputStream;
    }

    static /* synthetic */ java.util.List readLines$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.util.List<java.lang.String> readAllLines = java.nio.file.Files.readAllLines(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    private static final java.util.List<java.lang.String> readLines(java.nio.file.Path path, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.util.List<java.lang.String> readAllLines = java.nio.file.Files.readAllLines(path, charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    static /* synthetic */ java.lang.Object useLines$default(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1 block, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.BufferedReader newBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        try {
            java.io.BufferedReader bufferedReader = newBufferedReader;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedReader);
            java.lang.Object invoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.io.CloseableKt.closeFinally(newBufferedReader, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    private static final <T> T useLines(java.nio.file.Path path, java.nio.charset.Charset charset, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.BufferedReader newBufferedReader = java.nio.file.Files.newBufferedReader(path, charset);
        try {
            java.io.BufferedReader bufferedReader = newBufferedReader;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedReader);
            T invoke = block.invoke(kotlin.io.TextStreamsKt.lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.io.CloseableKt.closeFinally(newBufferedReader, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path path, java.lang.Iterable lines, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path write = java.nio.file.Files.write(path, lines, charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path path, java.lang.Iterable<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path write = java.nio.file.Files.write(path, lines, charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path path, kotlin.sequences.Sequence lines, java.nio.charset.Charset charset, java.nio.file.OpenOption[] options, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path write = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path path, kotlin.sequences.Sequence<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset, java.nio.file.OpenOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path write = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path path, java.lang.Iterable lines, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path write = java.nio.file.Files.write(path, lines, charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path path, java.lang.Iterable<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path write = java.nio.file.Files.write(path, lines, charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path path, kotlin.sequences.Sequence lines, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path write = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path path, kotlin.sequences.Sequence<? extends java.lang.CharSequence> lines, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "lines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.nio.file.Path write = java.nio.file.Files.write(path, kotlin.sequences.SequencesKt.asIterable(lines), charset, java.nio.file.StandardOpenOption.APPEND);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(write, "write(...)");
        return write;
    }
}
