package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "", "action", "forEachLine", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V", "", "readLines", "(Ljava/io/Reader;)Ljava/util/List;", "T", "Lkotlin/sequences/Sequence;", "block", "useLines", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "lineSequence", "(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;", "readText", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/io/Writer;", "out", "", "bufferSize", "", "copyTo", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "Ljava/net/URL;", "", "readBytes", "(Ljava/net/URL;)[B"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextStreamsKt {
    public static final java.util.List<java.lang.String> readLines(java.io.Reader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        forEachLine(reader, new kotlin.jvm.functions.Function1() { // from class: kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.io.TextStreamsKt.$r8$lambda$3AhJ2UCBpcTyB1jZJdphp_uKhXo(arrayList, (java.lang.String) obj);
            }
        });
        return arrayList;
    }

    @kotlin.IgnorableReturnValue
    public static final <T> T useLines(java.io.Reader reader, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            T invoke = function1.invoke(lineSequence(bufferedReader));
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            return invoke;
        } finally {
        }
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(java.io.BufferedReader bufferedReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedReader, "");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.io.LinesSequence(bufferedReader));
    }

    public static final java.lang.String readText(java.io.Reader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        java.lang.String obj = stringWriter.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ long copyTo$default(java.io.Reader reader, java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(reader, writer, i);
    }

    @kotlin.IgnorableReturnValue
    public static final long copyTo(java.io.Reader reader, java.io.Writer writer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static final byte[] readBytes(java.net.URL url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
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

    public static final void forEachLine(java.io.Reader reader, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            java.util.Iterator<java.lang.String> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
        } finally {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3AhJ2UCBpcTyB1jZJdphp_uKhXo(java.util.ArrayList arrayList, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        arrayList.add(str);
        return kotlin.Unit.INSTANCE;
    }
}
