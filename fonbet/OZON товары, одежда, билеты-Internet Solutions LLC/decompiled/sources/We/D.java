package We;

import We.C;
import We.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.InterfaceC9682h;

/* loaded from: classes10.dex */
public final class D extends K {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C f33541e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C f33542f;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f33543g;

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f33544h;

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f33545i;

    /* renamed from: a, reason: collision with root package name */
    private final C f33546a;

    /* renamed from: b, reason: collision with root package name */
    private long f33547b;

    /* renamed from: c, reason: collision with root package name */
    private final C9684j f33548c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<c> f33549d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C9684j f33550a;

        /* renamed from: b, reason: collision with root package name */
        private C f33551b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f33552c;

        public a() {
            String boundary = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(boundary, "UUID.randomUUID().toString()");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            C9684j c9684j = C9684j.f98719d;
            this.f33550a = C9684j.a.c(boundary);
            this.f33551b = D.f33541e;
            this.f33552c = new ArrayList();
        }

        @NotNull
        public final void a(z zVar, @NotNull K body) {
            Intrinsics.checkNotNullParameter(body, "body");
            c.f33553c.getClass();
            b(c.a.a(zVar, body));
        }

        @NotNull
        public final void b(@NotNull c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f33552c.add(part);
        }

        @NotNull
        public final D c() {
            ArrayList arrayList = this.f33552c;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new D(this.f33550a, this.f33551b, Ye.b.B(arrayList));
        }

        @NotNull
        public final void d(@NotNull C type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.d(type.e(), "multipart")) {
                this.f33551b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public static final class b {
        public static void a(@NotNull String key, @NotNull StringBuilder appendQuotedString) {
            Intrinsics.checkNotNullParameter(appendQuotedString, "$this$appendQuotedString");
            Intrinsics.checkNotNullParameter(key, "key");
            appendQuotedString.append('\"');
            int length = key.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = key.charAt(i11);
                if (charAt == '\n') {
                    appendQuotedString.append("%0A");
                } else if (charAt == '\r') {
                    appendQuotedString.append("%0D");
                } else if (charAt != '\"') {
                    appendQuotedString.append(charAt);
                } else {
                    appendQuotedString.append("%22");
                }
            }
            appendQuotedString.append('\"');
        }
    }

    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f33553c = new a(0);

        /* renamed from: a, reason: collision with root package name */
        private final z f33554a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final K f33555b;

        /* loaded from: classes10.dex */
        public static final class a {
            private a() {
            }

            @NotNull
            public static c a(z zVar, @NotNull K body) {
                Intrinsics.checkNotNullParameter(body, "body");
                if ((zVar != null ? zVar.c("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((zVar != null ? zVar.c("Content-Length") : null) == null) {
                    return new c(zVar, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            @NotNull
            public static c b(@NotNull String name, String str, @NotNull K body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                C c11 = D.f33541e;
                b.a(name, sb2);
                if (str != null) {
                    sb2.append("; filename=");
                    b.a(str, sb2);
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                z.a aVar = new z.a();
                aVar.d("Content-Disposition", sb3);
                return a(aVar.e(), body);
            }

            public /* synthetic */ a(int i11) {
                this();
            }
        }

        public c(z zVar, K k11) {
            this.f33554a = zVar;
            this.f33555b = k11;
        }

        @NotNull
        public final K a() {
            return this.f33555b;
        }

        public final z b() {
            return this.f33554a;
        }
    }

    static {
        C.f33536g.getClass();
        f33541e = C.a.a("multipart/mixed");
        C.a.a("multipart/alternative");
        C.a.a("multipart/digest");
        C.a.a("multipart/parallel");
        f33542f = C.a.a("multipart/form-data");
        f33543g = new byte[]{(byte) 58, (byte) 32};
        f33544h = new byte[]{(byte) 13, (byte) 10};
        byte b11 = (byte) 45;
        f33545i = new byte[]{b11, b11};
    }

    public D(@NotNull C9684j boundaryByteString, @NotNull C type, @NotNull List<c> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f33548c = boundaryByteString;
        this.f33549d = parts;
        C.a aVar = C.f33536g;
        String str = type + "; boundary=" + boundaryByteString.H();
        aVar.getClass();
        this.f33546a = C.a.a(str);
        this.f33547b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long a(InterfaceC9682h interfaceC9682h, boolean z11) throws IOException {
        C9681g c9681g;
        InterfaceC9682h interfaceC9682h2;
        if (z11) {
            interfaceC9682h2 = new C9681g();
            c9681g = interfaceC9682h2;
        } else {
            c9681g = 0;
            interfaceC9682h2 = interfaceC9682h;
        }
        List<c> list = this.f33549d;
        int size = list.size();
        long j11 = 0;
        int i11 = 0;
        while (true) {
            C9684j c9684j = this.f33548c;
            byte[] bArr = f33545i;
            byte[] bArr2 = f33544h;
            if (i11 >= size) {
                Intrinsics.f(interfaceC9682h2);
                interfaceC9682h2.U(bArr);
                interfaceC9682h2.Q1(c9684j);
                interfaceC9682h2.U(bArr);
                interfaceC9682h2.U(bArr2);
                if (!z11) {
                    return j11;
                }
                Intrinsics.f(c9681g);
                long size2 = c9681g.size() + j11;
                c9681g.c();
                return size2;
            }
            c cVar = list.get(i11);
            z b11 = cVar.b();
            K a11 = cVar.a();
            Intrinsics.f(interfaceC9682h2);
            interfaceC9682h2.U(bArr);
            interfaceC9682h2.Q1(c9684j);
            interfaceC9682h2.U(bArr2);
            if (b11 != null) {
                int size3 = b11.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    interfaceC9682h2.h1(b11.e(i12)).U(f33543g).h1(b11.k(i12)).U(bArr2);
                }
            }
            C contentType = a11.contentType();
            if (contentType != null) {
                interfaceC9682h2.h1("Content-Type: ").h1(contentType.toString()).U(bArr2);
            }
            long contentLength = a11.contentLength();
            if (contentLength != -1) {
                interfaceC9682h2.h1("Content-Length: ").Y(contentLength).U(bArr2);
            } else if (z11) {
                Intrinsics.f(c9681g);
                c9681g.c();
                return -1L;
            }
            interfaceC9682h2.U(bArr2);
            if (z11) {
                j11 += contentLength;
            } else {
                a11.writeTo(interfaceC9682h2);
            }
            interfaceC9682h2.U(bArr2);
            i11++;
        }
    }

    @Override // We.K
    public final long contentLength() throws IOException {
        long j11 = this.f33547b;
        if (j11 != -1) {
            return j11;
        }
        long a11 = a(null, true);
        this.f33547b = a11;
        return a11;
    }

    @Override // We.K
    @NotNull
    public final C contentType() {
        return this.f33546a;
    }

    @Override // We.K
    public final void writeTo(@NotNull InterfaceC9682h sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
