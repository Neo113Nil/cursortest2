package We;

import B0.A0;
import I0.C3173b;
import Sc.InterfaceC3999a;
import We.C;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.InterfaceC9683i;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"LWe/M;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lsf/i;", "consumer", "", "sizeMapper", "consumeSource", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "LWe/C;", "contentType", "()LWe/C;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lsf/i;", "", "bytes", "()[B", "Lsf/j;", "byteString", "()Lsf/j;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public abstract class M implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private Reader reader;

    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33664a;

        /* renamed from: b, reason: collision with root package name */
        private InputStreamReader f33665b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC9683i f33666c;

        /* renamed from: d, reason: collision with root package name */
        private final Charset f33667d;

        public a(@NotNull InterfaceC9683i source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f33666c = source;
            this.f33667d = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f33664a = true;
            InputStreamReader inputStreamReader = this.f33665b;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f33666c.close();
            }
        }

        @Override // java.io.Reader
        public final int read(@NotNull char[] cbuf, int i11, int i12) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f33664a) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f33665b;
            if (inputStreamReader == null) {
                InterfaceC9683i interfaceC9683i = this.f33666c;
                inputStreamReader = new InputStreamReader(interfaceC9683i.a2(), Ye.b.u(interfaceC9683i, this.f33667d));
                this.f33665b = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i11, i12);
        }
    }

    /* renamed from: We.M$b, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static N a(@NotNull String string, C c11) {
            Intrinsics.checkNotNullParameter(string, "$this$toResponseBody");
            Charset charset = Charsets.UTF_8;
            if (c11 != null) {
                C.a aVar = C.f33536g;
                Charset c12 = c11.c(null);
                if (c12 == null) {
                    C.f33536g.getClass();
                    c11 = C.a.b(c11 + "; charset=utf-8");
                } else {
                    charset = c12;
                }
            }
            C9681g c9681g = new C9681g();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            int length = string.length();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            if (length < 0) {
                throw new IllegalArgumentException(A0.a(length, 0, "endIndex < beginIndex: ", " < ").toString());
            }
            if (length > string.length()) {
                StringBuilder f7 = P4.f.f(length, "endIndex > string.length: ", " > ");
                f7.append(string.length());
                throw new IllegalArgumentException(f7.toString().toString());
            }
            if (Intrinsics.d(charset, Charsets.UTF_8)) {
                c9681g.D0(0, length, string);
            } else {
                String substring = string.substring(0, length);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = substring.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                c9681g.b0(bytes, 0, bytes.length);
            }
            return b(c9681g, c11, c9681g.size());
        }

        @NotNull
        public static N b(@NotNull InterfaceC9683i asResponseBody, C c11, long j11) {
            Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
            return new N(asResponseBody, c11, j11);
        }

        @NotNull
        public static N c(@NotNull byte[] toResponseBody, C c11) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            C9681g c9681g = new C9681g();
            c9681g.Z(toResponseBody);
            return b(c9681g, c11, toResponseBody.length);
        }

        public static /* synthetic */ N d(Companion companion) {
            companion.getClass();
            return a("MockFailure", null);
        }
    }

    private final Charset charset() {
        Charset c11;
        C contentType = contentType();
        return (contentType == null || (c11 = contentType.c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : c11;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Function1<? super InterfaceC9683i, ? extends T> consumer, Function1<? super T, Integer> sizeMapper) {
        long contentLength = contentLength();
        if (contentLength > Integer.MAX_VALUE) {
            throw new IOException(C3173b.b(contentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC9683i source = source();
        try {
            T invoke = consumer.invoke(source);
            Vd0.b.a(source, null);
            int intValue = sizeMapper.invoke(invoke).intValue();
            if (contentLength == -1 || contentLength == intValue) {
                return invoke;
            }
            StringBuilder b11 = Ql.c.b(contentLength, "Content-Length (", intValue, ") and stream length (");
            b11.append(") disagree");
            throw new IOException(b11.toString());
        } finally {
        }
    }

    @InterfaceC3999a
    @NotNull
    public static final M create(C c11, long j11, @NotNull InterfaceC9683i content) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.b(content, c11, j11);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().a2();
    }

    @NotNull
    public final C9684j byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > Integer.MAX_VALUE) {
            throw new IOException(C3173b.b(contentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC9683i source = source();
        try {
            C9684j v02 = source.v0();
            source.close();
            int g10 = v02.g();
            if (contentLength == -1 || contentLength == g10) {
                return v02;
            }
            StringBuilder b11 = Ql.c.b(contentLength, "Content-Length (", g10, ") and stream length (");
            b11.append(") disagree");
            throw new IOException(b11.toString());
        } finally {
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > Integer.MAX_VALUE) {
            throw new IOException(C3173b.b(contentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC9683i source = source();
        try {
            byte[] g02 = source.g0();
            source.close();
            int length = g02.length;
            if (contentLength == -1 || contentLength == length) {
                return g02;
            }
            StringBuilder b11 = Ql.c.b(contentLength, "Content-Length (", length, ") and stream length (");
            b11.append(") disagree");
            throw new IOException(b11.toString());
        } finally {
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Ye.b.e(source());
    }

    public abstract long contentLength();

    public abstract C contentType();

    @NotNull
    public abstract InterfaceC9683i source();

    @NotNull
    public final String string() throws IOException {
        InterfaceC9683i source = source();
        try {
            String t02 = source.t0(Ye.b.u(source, charset()));
            source.close();
            return t02;
        } finally {
        }
    }

    @InterfaceC3999a
    @NotNull
    public static final M create(C c11, @NotNull String content) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.a(content, c11);
    }

    @InterfaceC3999a
    @NotNull
    public static final M create(C c11, @NotNull C9684j toResponseBody) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(toResponseBody, "content");
        Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
        C9681g c9681g = new C9681g();
        c9681g.X(toResponseBody);
        return Companion.b(c9681g, c11, toResponseBody.g());
    }

    @InterfaceC3999a
    @NotNull
    public static final M create(C c11, @NotNull byte[] content) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return Companion.c(content, c11);
    }

    @NotNull
    public static final M create(@NotNull String str, C c11) {
        INSTANCE.getClass();
        return Companion.a(str, c11);
    }

    @NotNull
    public static final M create(@NotNull InterfaceC9683i interfaceC9683i, C c11, long j11) {
        INSTANCE.getClass();
        return Companion.b(interfaceC9683i, c11, j11);
    }

    @NotNull
    public static final M create(@NotNull byte[] bArr, C c11) {
        INSTANCE.getClass();
        return Companion.c(bArr, c11);
    }

    @NotNull
    public static final M create(@NotNull C9684j toResponseBody, C c11) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
        C9681g c9681g = new C9681g();
        c9681g.X(toResponseBody);
        return Companion.b(c9681g, c11, toResponseBody.g());
    }
}
