package kotlin.io;

/* compiled from: ReadWrite.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r*\u00020\u0002\u001aB\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f*\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u0004\u0012\u0002H\u000f0\nH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0087\b\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011*\u00020\u0001\u001a\n\u0010\u0016\u001a\u00020\u000b*\u00020\u0002\u001a\u001c\u0010\u0017\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0017\u0010\u0016\u001a\u00020\u000b*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0087\b\u001a\n\u0010\u001d\u001a\u00020\u001e*\u00020\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "forEachLine", "", "action", "Lkotlin/Function1;", "", "readLines", "", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "reader", "Ljava/io/StringReader;", "lineSequence", "readText", "copyTo", "", "out", "Ljava/net/URL;", "charset", "Ljava/nio/charset/Charset;", "readBytes", "", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextStreamsKt {
    static /* synthetic */ java.io.BufferedReader buffered$default(java.io.Reader reader, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, i);
    }

    private static final java.io.BufferedReader buffered(java.io.Reader reader, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, i);
    }

    static /* synthetic */ java.io.BufferedWriter buffered$default(java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) writer : new java.io.BufferedWriter(writer, i);
    }

    private static final java.io.BufferedWriter buffered(java.io.Writer writer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) writer : new java.io.BufferedWriter(writer, i);
    }

    public static final java.util.List<java.lang.String> readLines(java.io.Reader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        forEachLine(reader, new kotlin.jvm.functions.Function1() { // from class: kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit readLines$lambda$1;
                readLines$lambda$1 = kotlin.io.TextStreamsKt.readLines$lambda$1(arrayList, (java.lang.String) obj);
                return readLines$lambda$1;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit readLines$lambda$1(java.util.ArrayList arrayList, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return kotlin.Unit.INSTANCE;
    }

    public static final <T> T useLines(java.io.Reader reader, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            T invoke = block.invoke(lineSequence(bufferedReader));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    private static final java.io.StringReader reader(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.io.StringReader(str);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(java.io.BufferedReader bufferedReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.io.LinesSequence(bufferedReader));
    }

    public static final java.lang.String readText(java.io.Reader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        java.lang.String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static /* synthetic */ long copyTo$default(java.io.Reader reader, java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(reader, writer, i);
    }

    public static final long copyTo(java.io.Reader reader, java.io.Writer out, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    private static final java.lang.String readText(java.net.URL url, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(readBytes(url), charset);
    }

    static /* synthetic */ java.lang.String readText$default(java.net.URL url, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(readBytes(url), charset);
    }

    public static final byte[] readBytes(java.net.URL url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
        java.io.InputStream openStream = url.openStream();
        try {
            java.io.InputStream inputStream = openStream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(inputStream);
            byte[] readBytes = kotlin.io.ByteStreamsKt.readBytes(inputStream);
            kotlin.io.CloseableKt.closeFinally(openStream, null);
            return readBytes;
        } finally {
        }
    }

    public static final void forEachLine(java.io.Reader reader, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            java.util.Iterator<java.lang.String> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
        } finally {
        }
    }
}
