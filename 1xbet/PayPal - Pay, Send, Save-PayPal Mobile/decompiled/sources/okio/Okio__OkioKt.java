package okio;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001aP\u0010\u000f\u001a\u00028\u0001\"\u0010\b\u0000\u0010\u000b*\n\u0018\u00010\tj\u0004\u0018\u0001`\n\"\u0004\b\u0001\u0010\f*\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokio/Source;", "Lokio/BufferedSource;", "buffer", "(Lokio/Source;)Lokio/BufferedSource;", "Lokio/Sink;", "Lokio/BufferedSink;", "(Lokio/Sink;)Lokio/BufferedSink;", "blackhole", "()Lokio/Sink;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "p0", "use", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes5.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final okio.BufferedSource buffer(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new okio.RealBufferedSource(source);
    }

    public static final okio.BufferedSink buffer(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return new okio.RealBufferedSink(sink);
    }

    public static final okio.Sink blackhole() {
        return new okio.BlackholeSink();
    }

    public static final <T extends java.io.Closeable, R> R use(T t, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        R r;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.Throwable th = null;
        try {
            r = function1.invoke(t);
            if (t != null) {
                try {
                    t.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (t != null) {
                try {
                    t.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            r = null;
        }
        if (th == null) {
            return r;
        }
        throw th;
    }
}
