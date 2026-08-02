package okio;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okio.C1190e;

@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BufferedSource.kt\nokio/internal/-BufferedSource\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,207:1\n63#1:213\n63#1:224\n63#1:231\n63#1:237\n63#1:239\n63#1:243\n63#1:248\n63#1:266\n63#1:270\n63#1:277\n63#1:290\n63#1:299\n63#1:300\n63#1:301\n63#1:307\n63#1:315\n63#1:328\n63#1:332\n63#1:333\n63#1:334\n63#1:335\n63#1:340\n63#1:352\n63#1:368\n63#1:378\n63#1:381\n63#1:384\n63#1:387\n63#1:390\n63#1:393\n63#1:399\n63#1:416\n63#1:436\n63#1:451\n63#1:468\n63#1:495\n39#2:208\n40#2,3:210\n43#2,7:214\n53#2:221\n54#2:223\n58#2,2:225\n62#2:227\n63#2,2:229\n65#2,3:232\n71#2,2:235\n76#2:238\n77#2:240\n81#2,2:241\n86#2:244\n88#2,2:246\n90#2,13:249\n109#2:265\n110#2:267\n114#2,2:268\n119#2,6:271\n125#2,9:278\n136#2,3:287\n139#2,6:291\n145#2:298\n149#2,5:302\n154#2,5:308\n161#2,2:313\n163#2,11:316\n177#2:327\n178#2:329\n182#2,2:330\n187#2,4:336\n191#2,6:341\n201#2:347\n202#2,3:349\n205#2,8:353\n213#2,3:362\n220#2,3:365\n223#2,7:369\n233#2,2:376\n238#2,2:379\n243#2,2:382\n248#2,2:385\n253#2,2:388\n258#2,2:391\n263#2,5:394\n268#2,11:400\n282#2,5:411\n287#2,14:417\n304#2,2:431\n306#2,2:434\n308#2,7:437\n317#2,2:444\n319#2,4:447\n323#2,11:452\n421#2,2:463\n424#2,2:466\n426#2,7:469\n442#2:476\n444#2,12:478\n459#2:490\n463#2,4:491\n467#2:496\n469#2:497\n471#2:498\n1#3:209\n1#3:222\n1#3:228\n1#3:245\n1#3:348\n1#3:433\n1#3:446\n1#3:465\n1#3:477\n26#4,3:262\n88#5:297\n88#5:361\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n67#1:213\n68#1:224\n70#1:231\n71#1:237\n72#1:239\n73#1:243\n74#1:248\n76#1:266\n77#1:270\n79#1:277\n81#1:290\n84#1:299\n85#1:300\n89#1:301\n93#1:307\n94#1:315\n95#1:328\n96#1:332\n99#1:333\n100#1:334\n105#1:335\n108#1:340\n110#1:352\n111#1:368\n112#1:378\n113#1:381\n114#1:384\n115#1:387\n116#1:390\n117#1:393\n118#1:399\n119#1:416\n120#1:436\n125#1:451\n135#1:468\n203#1:495\n67#1:208\n67#1:210,3\n67#1:214,7\n68#1:221\n68#1:223\n69#1:225,2\n70#1:227\n70#1:229,2\n70#1:232,3\n71#1:235,2\n72#1:238\n72#1:240\n73#1:241,2\n74#1:244\n74#1:246,2\n74#1:249,13\n76#1:265\n76#1:267\n77#1:268,2\n79#1:271,6\n79#1:278,9\n81#1:287,3\n81#1:291,6\n81#1:298\n93#1:302,5\n93#1:308,5\n94#1:313,2\n94#1:316,11\n95#1:327\n95#1:329\n96#1:330,2\n108#1:336,4\n108#1:341,6\n110#1:347\n110#1:349,3\n110#1:353,8\n110#1:362,3\n111#1:365,3\n111#1:369,7\n112#1:376,2\n113#1:379,2\n114#1:382,2\n115#1:385,2\n116#1:388,2\n117#1:391,2\n118#1:394,5\n118#1:400,11\n119#1:411,5\n119#1:417,14\n120#1:431,2\n120#1:434,2\n120#1:437,7\n125#1:444,2\n125#1:447,4\n125#1:452,11\n135#1:463,2\n135#1:466,2\n135#1:469,7\n149#1:476\n149#1:478,12\n151#1:490\n203#1:491,4\n203#1:496\n204#1:497\n205#1:498\n67#1:209\n68#1:222\n70#1:228\n74#1:245\n110#1:348\n120#1:433\n125#1:446\n135#1:465\n149#1:477\n75#1:262,3\n81#1:297\n110#1:361\n*E\n"})
/* loaded from: classes5.dex */
public final class F implements InterfaceC1192g {

    @JvmField
    public final K a;

    @JvmField
    public final C1190e b;

    @JvmField
    public boolean c;

    public F(K source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.a = source;
        this.b = new C1190e();
    }

    @Override // okio.InterfaceC1192g
    public final void A(long j) {
        if (!p(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.InterfaceC1192g
    public final C1193h C(long j) {
        A(j);
        return this.b.C(j);
    }

    @Override // okio.InterfaceC1192g
    public final byte[] D() {
        K k = this.a;
        C1190e c1190e = this.b;
        c1190e.o(k);
        return c1190e.W(c1190e.b);
    }

    @Override // okio.InterfaceC1192g
    public final boolean E() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C1190e c1190e = this.b;
        return c1190e.E() && this.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.InterfaceC1192g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long G() {
        C1190e c1190e;
        A(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean p = p(j2);
            c1190e = this.b;
            if (!p) {
                break;
            }
            byte t = c1190e.t(j);
            if ((t < 48 || t > 57) && !(j == 0 && t == 45)) {
                break;
            }
            j = j2;
        }
        return c1190e.G();
    }

    @Override // okio.InterfaceC1192g
    public final long I(C1190e sink) {
        C1190e c1190e;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (true) {
            K k = this.a;
            c1190e = this.b;
            if (k.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long q = c1190e.q();
            if (q > 0) {
                j += q;
                sink.write(c1190e, q);
            }
        }
        long j2 = c1190e.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        sink.write(c1190e, j2);
        return j3;
    }

    @Override // okio.InterfaceC1192g
    public final String J(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        K k = this.a;
        C1190e c1190e = this.b;
        c1190e.o(k);
        return c1190e.J(charset);
    }

    @Override // okio.InterfaceC1192g
    public final C1193h N() {
        K k = this.a;
        C1190e c1190e = this.b;
        c1190e.o(k);
        return c1190e.C(c1190e.b);
    }

    @Override // okio.InterfaceC1192g
    public final int P() {
        A(4L);
        return this.b.P();
    }

    @Override // okio.InterfaceC1192g
    public final long Q(long j, C1193h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return okio.internal.i.a(this, bytes, bytes.d(), j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.InterfaceC1192g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long T() {
        C1190e c1190e;
        A(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean p = p(i2);
            c1190e = this.b;
            if (!p) {
                break;
            }
            byte t = c1190e.t(i);
            if ((t < 48 || t > 57) && ((t < 97 || t > 102) && (t < 65 || t > 70))) {
                break;
            }
            i = i2;
        }
        return c1190e.T();
    }

    @Override // okio.InterfaceC1192g
    public final InputStream U() {
        return new a();
    }

    @Override // okio.InterfaceC1192g
    public final int V(A options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C1190e c1190e = this.b;
            int d = okio.internal.a.d(c1190e, options, true);
            if (d != -2) {
                if (d != -1) {
                    c1190e.skip(options.a[d].d());
                    return d;
                }
            } else if (this.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.InterfaceC1192g
    public final C1190e a() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.d();
    }

    public final long d(byte b, long j, long j2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j2, "fromIndex=0 toIndex=").toString());
        }
        long j3 = 0;
        while (j3 < j2) {
            byte b2 = b;
            long j4 = j2;
            long u = this.b.u(b2, j3, j4);
            if (u == -1) {
                C1190e c1190e = this.b;
                long j5 = c1190e.b;
                if (j5 >= j4 || this.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return u;
            }
        }
        return -1L;
    }

    @Override // okio.InterfaceC1192g
    public final void i(C1190e sink, long j) {
        C1190e c1190e = this.b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            A(j);
            c1190e.i(sink, j);
        } catch (EOFException e) {
            sink.o(c1190e);
            throw e;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // okio.InterfaceC1192g
    public final String k(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long d = d((byte) 10, 0L, j2);
        C1190e c1190e = this.b;
        if (d != -1) {
            return okio.internal.a.c(c1190e, d);
        }
        if (j2 < Long.MAX_VALUE && p(j2) && c1190e.t(j2 - 1) == 13 && p(j2 + 1) && c1190e.t(j2) == 10) {
            return okio.internal.a.c(c1190e, j2);
        }
        C1190e c1190e2 = new C1190e();
        c1190e.s(0L, c1190e2, Math.min(32, c1190e.b));
        throw new EOFException("\\n not found: limit=" + Math.min(c1190e.b, j) + " content=" + c1190e2.C(c1190e2.b).e() + Typography.ellipsis);
    }

    public final long l() {
        A(8L);
        long readLong = this.b.readLong();
        C1190e.a aVar = C1187b.a;
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // okio.InterfaceC1192g
    public final boolean n(long j, C1193h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int d = bytes.d();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (d >= 0 && d <= bytes.d()) {
            return d == 0 || okio.internal.i.a(this, bytes, d, 1L) != -1;
        }
        return false;
    }

    @Override // okio.InterfaceC1192g
    public final boolean p(long j) {
        C1190e c1190e;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            c1190e = this.b;
            if (c1190e.b >= j) {
                return true;
            }
        } while (this.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // okio.InterfaceC1192g
    public final F peek() {
        return z.b(new D(this));
    }

    public final String q(long j) {
        A(j);
        C1190e c1190e = this.b;
        c1190e.getClass();
        return c1190e.X(j, Charsets.UTF_8);
    }

    @Override // okio.InterfaceC1192g
    public final String r() {
        return k(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C1190e c1190e = this.b;
        if (c1190e.b == 0 && this.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return c1190e.read(sink);
    }

    @Override // okio.InterfaceC1192g
    public final byte readByte() {
        A(1L);
        return this.b.readByte();
    }

    @Override // okio.InterfaceC1192g
    public final void readFully(byte[] sink) {
        C1190e c1190e = this.b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            A(sink.length);
            c1190e.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c1190e.b;
                if (j <= 0) {
                    throw e;
                }
                int read = c1190e.read(sink, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // okio.InterfaceC1192g
    public final int readInt() {
        A(4L);
        return this.b.readInt();
    }

    @Override // okio.InterfaceC1192g
    public final long readLong() {
        A(8L);
        return this.b.readLong();
    }

    @Override // okio.InterfaceC1192g
    public final short readShort() {
        A(2L);
        return this.b.readShort();
    }

    @Override // okio.InterfaceC1192g
    public final void skip(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C1190e c1190e = this.b;
            if (c1190e.b == 0 && this.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, c1190e.b);
            c1190e.skip(min);
            j -= min;
        }
    }

    @Override // okio.K
    public final L timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // okio.InterfaceC1192g
    public final short v() {
        A(2L);
        return this.b.v();
    }

    @Override // okio.K
    public final long read(C1190e sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j >= 0) {
            if (!this.c) {
                C1190e c1190e = this.b;
                if (c1190e.b == 0) {
                    if (j == 0) {
                        return 0L;
                    }
                    if (this.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1L;
                    }
                }
                return c1190e.read(sink, Math.min(j, c1190e.b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
    }

    @SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,207:1\n63#2:208\n63#2:209\n63#2:210\n63#2:212\n63#2:213\n63#2:214\n63#2:215\n63#2:217\n63#2:218\n63#2:219\n63#2:220\n73#3:211\n85#3:216\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n157#1:208\n158#1:209\n161#1:210\n168#1:212\n169#1:213\n173#1:214\n178#1:215\n189#1:217\n190#1:218\n193#1:219\n194#1:220\n161#1:211\n178#1:216\n*E\n"})
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            F f = F.this;
            if (f.c) {
                throw new IOException("closed");
            }
            return (int) Math.min(f.b.b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            F.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            F f = F.this;
            C1190e c1190e = f.b;
            if (f.c) {
                throw new IOException("closed");
            }
            if (c1190e.b == 0 && f.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return c1190e.readByte() & UByte.MAX_VALUE;
        }

        public final String toString() {
            return F.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final long transferTo(OutputStream out) {
            Intrinsics.checkNotNullParameter(out, "out");
            F f = F.this;
            C1190e c1190e = f.b;
            if (f.c) {
                throw new IOException("closed");
            }
            long j = 0;
            long j2 = 0;
            while (true) {
                if (c1190e.b == j && f.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return j2;
                }
                long j3 = c1190e.b;
                j2 += j3;
                Intrinsics.checkNotNullParameter(out, "out");
                C1187b.b(c1190e.b, 0L, j3);
                G g = c1190e.a;
                while (j3 > j) {
                    Intrinsics.checkNotNull(g);
                    int min = (int) Math.min(j3, g.c - g.b);
                    out.write(g.a, g.b, min);
                    int i = g.b + min;
                    g.b = i;
                    long j4 = min;
                    c1190e.b -= j4;
                    j3 -= j4;
                    if (i == g.c) {
                        G a = g.a();
                        c1190e.a = a;
                        H.a(g);
                        g = a;
                    }
                    j = 0;
                }
            }
        }

        @Override // java.io.InputStream
        public final int read(byte[] data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            F f = F.this;
            C1190e c1190e = f.b;
            if (!f.c) {
                C1187b.b(data.length, i, i2);
                if (c1190e.b == 0 && f.a.read(c1190e, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return c1190e.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
