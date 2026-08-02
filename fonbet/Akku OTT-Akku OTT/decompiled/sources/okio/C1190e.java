package okio;

import androidx.collection.SieveCacheKt;
import androidx.media3.session.legacy.PlaybackStateCompat;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Typography;

@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BufferedSource.kt\nokio/internal/-BufferedSource\n*L\n1#1,649:1\n88#2:650\n85#2:683\n85#2:685\n73#2:745\n73#2:771\n82#2:810\n76#2:821\n88#2:1014\n73#2:1029\n85#2:1133\n242#3,32:651\n277#3,10:686\n290#3,18:696\n412#3,2:714\n110#3:716\n414#3:717\n112#3,18:718\n311#3,9:736\n320#3,15:746\n338#3,10:761\n348#3,3:772\n346#3,25:775\n374#3,10:800\n384#3:811\n382#3,9:812\n391#3,7:822\n389#3,20:829\n652#3,60:849\n715#3,56:909\n773#3:965\n776#3:966\n777#3,6:968\n787#3,7:974\n797#3,6:984\n805#3,5:990\n837#3,6:995\n847#3:1001\n848#3,11:1003\n859#3,5:1015\n868#3,9:1020\n878#3,61:1030\n603#3:1091\n606#3:1092\n607#3,5:1094\n614#3:1099\n617#3,7:1100\n626#3,20:1107\n418#3:1127\n421#3,5:1128\n426#3,10:1134\n437#3,7:1144\n442#3,2:1151\n943#3:1153\n944#3,87:1155\n1034#3,48:1242\n573#3:1290\n580#3,21:1291\n1085#3,7:1312\n1095#3,7:1319\n1105#3,4:1326\n1112#3,8:1330\n1123#3,10:1338\n1136#3,14:1348\n447#3,35:1362\n513#3,40:1397\n556#3:1437\n558#3,13:1439\n1153#3:1452\n1204#3:1453\n1205#3,39:1455\n1246#3,2:1494\n1248#3,4:1497\n1255#3,3:1501\n1259#3,4:1505\n110#3:1509\n1263#3,22:1510\n112#3,18:1532\n1338#3,2:1550\n1341#3:1553\n110#3:1554\n1342#3,50:1555\n112#3,18:1605\n1401#3,12:1623\n1416#3,32:1635\n1451#3,12:1667\n1466#3,18:1679\n1488#3:1697\n1489#3:1699\n1494#3,34:1700\n1#4:684\n1#4:967\n1#4:1002\n1#4:1093\n1#4:1154\n1#4:1438\n1#4:1454\n1#4:1496\n1#4:1504\n1#4:1552\n1#4:1698\n26#5,3:981\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:650\n197#1:683\n235#1:685\n261#1:745\n264#1:771\n267#1:810\n267#1:821\n337#1:1014\n340#1:1029\n376#1:1133\n181#1:651,32\n252#1:686,10\n255#1:696,18\n258#1:714,2\n258#1:716\n258#1:717\n258#1:718,18\n261#1:736,9\n261#1:746,15\n264#1:761,10\n264#1:772,3\n264#1:775,25\n267#1:800,10\n267#1:811\n267#1:812,9\n267#1:822,7\n267#1:829,20\n279#1:849,60\n282#1:909,56\n284#1:965\n287#1:966\n287#1:968,6\n289#1:974,7\n294#1:984,6\n297#1:990,5\n331#1:995,6\n337#1:1001\n337#1:1003,11\n337#1:1015,5\n340#1:1020,9\n340#1:1030,61\n342#1:1091\n345#1:1092\n345#1:1094,5\n347#1:1099\n350#1:1100,7\n353#1:1107,20\n373#1:1127\n376#1:1128,5\n376#1:1134,10\n378#1:1144,7\n381#1:1151,2\n386#1:1153\n386#1:1155,87\n389#1:1242,48\n412#1:1290\n418#1:1291,21\n439#1:1312,7\n443#1:1319,7\n445#1:1326,4\n447#1:1330,8\n451#1:1338,10\n455#1:1348,14\n459#1:1362,35\n462#1:1397,40\n465#1:1437\n465#1:1439,13\n467#1:1452\n467#1:1453\n467#1:1455,39\n469#1:1494,2\n469#1:1497,4\n480#1:1501,3\n480#1:1505,4\n480#1:1509\n480#1:1510,22\n480#1:1532,18\n496#1:1550,2\n496#1:1553\n496#1:1554\n496#1:1555,50\n496#1:1605,18\n506#1:1623,12\n576#1:1635,32\n578#1:1667,12\n586#1:1679,18\n594#1:1697\n594#1:1699\n596#1:1700,34\n287#1:967\n337#1:1002\n345#1:1093\n386#1:1154\n465#1:1438\n467#1:1454\n469#1:1496\n480#1:1504\n496#1:1552\n594#1:1698\n291#1:981,3\n*E\n"})
/* renamed from: okio.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1190e implements InterfaceC1192g, InterfaceC1191f, Cloneable, ByteChannel {

    @JvmField
    public G a;
    public long b;

    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,649:1\n1549#2:650\n1550#2:652\n1554#2:653\n1555#2,68:655\n1626#2:723\n1627#2,32:725\n1659#2,18:758\n1680#2:776\n1681#2,18:778\n1703#2:796\n1705#2,7:798\n1#3:651\n1#3:654\n1#3:724\n1#3:777\n1#3:797\n85#4:757\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n636#1:650\n636#1:652\n638#1:653\n638#1:655,68\n640#1:723\n640#1:725,32\n640#1:758,18\n642#1:776\n642#1:778,18\n645#1:796\n645#1:798,7\n636#1:651\n638#1:654\n640#1:724\n642#1:777\n645#1:797\n640#1:757\n*E\n"})
    /* renamed from: okio.e$a */
    public static final class a implements Closeable {

        @JvmField
        public C1190e a;

        @JvmField
        public boolean b;
        public G c;

        @JvmField
        public byte[] e;

        @JvmField
        public long d = -1;

        @JvmField
        public int f = -1;

        @JvmField
        public int i = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.a = null;
            this.c = null;
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.i = -1;
        }

        public final void d(long j) {
            C1190e c1190e = this.a;
            if (c1190e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = c1190e.b;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(androidx.core.database.a.c(j, "newSize < 0: ").toString());
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    G g = c1190e.a;
                    Intrinsics.checkNotNull(g);
                    G g2 = g.g;
                    Intrinsics.checkNotNull(g2);
                    int i = g2.c;
                    long j4 = i - g2.b;
                    if (j4 > j3) {
                        g2.c = i - ((int) j3);
                        break;
                    } else {
                        c1190e.a = g2.a();
                        H.a(g2);
                        j3 -= j4;
                    }
                }
                this.c = null;
                this.d = j;
                this.e = null;
                this.f = -1;
                this.i = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    G a0 = c1190e.a0(i2);
                    int min = (int) Math.min(j5, 8192 - a0.c);
                    int i3 = a0.c + min;
                    a0.c = i3;
                    j5 -= min;
                    if (z) {
                        this.c = a0;
                        this.d = j2;
                        this.e = a0.a;
                        this.f = i3 - min;
                        this.i = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            c1190e.b = j;
        }

        public final int l(long j) {
            G g;
            C1190e c1190e = this.a;
            if (c1190e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j2 = c1190e.b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.c = null;
                        this.d = j;
                        this.e = null;
                        this.f = -1;
                        this.i = -1;
                        return -1;
                    }
                    G g2 = c1190e.a;
                    G g3 = this.c;
                    long j3 = 0;
                    if (g3 != null) {
                        long j4 = this.d;
                        int i = this.f;
                        Intrinsics.checkNotNull(g3);
                        long j5 = j4 - (i - g3.b);
                        if (j5 > j) {
                            g = g2;
                            g2 = this.c;
                            j2 = j5;
                        } else {
                            g = this.c;
                            j3 = j5;
                        }
                    } else {
                        g = g2;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            Intrinsics.checkNotNull(g);
                            long j6 = (g.c - g.b) + j3;
                            if (j < j6) {
                                break;
                            }
                            g = g.f;
                            j3 = j6;
                        }
                    } else {
                        while (j2 > j) {
                            Intrinsics.checkNotNull(g2);
                            g2 = g2.g;
                            Intrinsics.checkNotNull(g2);
                            j2 -= g2.c - g2.b;
                        }
                        g = g2;
                        j3 = j2;
                    }
                    if (this.b) {
                        Intrinsics.checkNotNull(g);
                        if (g.d) {
                            byte[] bArr = g.a;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                            G g4 = new G(copyOf, g.b, g.c, false, true);
                            if (c1190e.a == g) {
                                c1190e.a = g4;
                            }
                            g.b(g4);
                            G g5 = g4.g;
                            Intrinsics.checkNotNull(g5);
                            g5.a();
                            g = g4;
                        }
                    }
                    this.c = g;
                    this.d = j;
                    Intrinsics.checkNotNull(g);
                    this.e = g.a;
                    int i2 = g.b + ((int) (j - j3));
                    this.f = i2;
                    int i3 = g.c;
                    this.i = i3;
                    return i3 - i2;
                }
            }
            StringBuilder b = androidx.compose.runtime.snapshots.m.b(j, "offset=", " > size=");
            b.append(c1190e.b);
            throw new ArrayIndexOutOfBoundsException(b.toString());
        }
    }

    /* renamed from: okio.e$c */
    public static final class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public final String toString() {
            return C1190e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            C1190e.this.c0(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            C1190e.this.m3358write(data, i, i2);
        }
    }

    @Override // okio.InterfaceC1192g
    public final void A(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f B(long j) {
        d0(j);
        return this;
    }

    @Override // okio.InterfaceC1192g
    public final C1193h C(long j) throws EOFException {
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new C1193h(W(j));
        }
        C1193h Z = Z((int) j);
        skip(j);
        return Z;
    }

    @Override // okio.InterfaceC1192g
    public final byte[] D() {
        return W(this.b);
    }

    @Override // okio.InterfaceC1192g
    public final boolean E() {
        return this.b == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.b - r1;
        r19.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r1 = androidx.browser.browseractions.a.d(r1, " but was 0x");
        r1.append(okio.C1187b.e(t(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    @Override // okio.InterfaceC1192g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long G() throws EOFException {
        long j;
        byte b2;
        long j2 = 0;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            G g = this.a;
            Intrinsics.checkNotNull(g);
            byte[] bArr = g.a;
            int i2 = g.b;
            int i3 = g.c;
            while (i2 < i3) {
                b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + i4;
                } else {
                    j = j2;
                    if (b2 != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            j = j2;
            if (i2 == i3) {
                this.a = g.a();
                H.a(g);
            } else {
                g.b = i2;
            }
            if (z2 || this.a == null) {
                break;
            }
            j2 = j;
        }
        C1190e c1190e = new C1190e();
        c1190e.d0(j3);
        c1190e.c0(b2);
        if (!z) {
            c1190e.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(c1190e.Y()));
    }

    @JvmOverloads
    public final a H(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = okio.internal.a.a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        a aVar = C1187b.a;
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == C1187b.a) {
            unsafeCursor = new a();
        }
        if (unsafeCursor.a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.a = this;
        unsafeCursor.b = true;
        return unsafeCursor;
    }

    @Override // okio.InterfaceC1192g
    public final long I(C1190e sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.b;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    @Override // okio.InterfaceC1192g
    public final String J(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return X(this.b, charset);
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f L(long j) {
        e0(j);
        return this;
    }

    @Override // okio.InterfaceC1192g
    public final C1193h N() {
        return C(this.b);
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f O(int i, int i2, String str) {
        j0(i, i2, str);
        return this;
    }

    @Override // okio.InterfaceC1192g
    public final int P() throws EOFException {
        return C1187b.d(readInt());
    }

    @Override // okio.InterfaceC1192g
    public final long Q(long j, C1193h bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte[] bArr = okio.internal.a.a;
        return okio.internal.a.a(this, bytes, 0L, j, bytes.d());
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f R(C1193h c1193h) {
        b0(c1193h);
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final OutputStream S() {
        return new c();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[EDGE_INSN: B:40:0x0095->B:37:0x0095 BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    @Override // okio.InterfaceC1192g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long T() throws EOFException {
        int i;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            G g = this.a;
            Intrinsics.checkNotNull(g);
            byte[] bArr = g.a;
            int i3 = g.b;
            int i4 = g.c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else if (b2 >= 65 && b2 <= 70) {
                    i = b2 - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + C1187b.e(b2));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.a = g.a();
                        H.a(g);
                    } else {
                        g.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C1190e c1190e = new C1190e();
                    c1190e.e0(j);
                    c1190e.c0(b2);
                    throw new NumberFormatException("Number too large: ".concat(c1190e.Y()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.a != null);
        this.b -= i2;
        return j;
    }

    @Override // okio.InterfaceC1192g
    public final InputStream U() {
        return new b();
    }

    @Override // okio.InterfaceC1192g
    public final int V(A options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int d = okio.internal.a.d(this, options, false);
        if (d == -1) {
            return -1;
        }
        skip(options.a[d].d());
        return d;
    }

    public final byte[] W(long j) throws EOFException {
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final String X(long j, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        int i = g.b;
        if (i + j > g.c) {
            return new String(W(j), charset);
        }
        int i2 = (int) j;
        String str = new String(g.a, i, i2, charset);
        int i3 = g.b + i2;
        g.b = i3;
        this.b -= j;
        if (i3 == g.c) {
            this.a = g.a();
            H.a(g);
        }
        return str;
    }

    public final String Y() {
        return X(this.b, Charsets.UTF_8);
    }

    public final C1193h Z(int i) {
        if (i == 0) {
            return C1193h.d;
        }
        C1187b.b(this.b, 0L, i);
        G g = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(g);
            int i5 = g.c;
            int i6 = g.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            g = g.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        G g2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(g2);
            bArr[i7] = g2.a;
            i2 += g2.c - g2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = g2.b;
            g2.d = true;
            i7++;
            g2 = g2.f;
        }
        return new I(bArr, iArr);
    }

    @Override // okio.InterfaceC1192g
    public final C1190e a() {
        return this;
    }

    public final G a0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        G g = this.a;
        if (g == null) {
            G b2 = H.b();
            this.a = b2;
            b2.g = b2;
            b2.f = b2;
            return b2;
        }
        Intrinsics.checkNotNull(g);
        G g2 = g.g;
        Intrinsics.checkNotNull(g2);
        if (g2.c + i <= 8192 && g2.e) {
            return g2;
        }
        G b3 = H.b();
        g2.b(b3);
        return b3;
    }

    public final void b0(C1193h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.s(byteString.d(), this);
    }

    public final void c0(int i) {
        G a0 = a0(1);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        a0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.J
    public final void close() {
    }

    public final void d() {
        skip(this.b);
    }

    public final void d0(long j) {
        boolean z;
        if (j == 0) {
            c0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                k0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = okio.internal.a.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > okio.internal.a.b[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        G a0 = a0(i);
        byte[] bArr2 = a0.a;
        int i2 = a0.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = okio.internal.a.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        a0.c += i;
        this.b += i;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f e() {
        return this;
    }

    public final void e0(long j) {
        if (j == 0) {
            c0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        G a0 = a0(i);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = okio.internal.a.a[(int) (15 & j)];
            j >>>= 4;
        }
        a0.c += i;
        this.b += i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190e)) {
            return false;
        }
        long j = this.b;
        C1190e c1190e = (C1190e) obj;
        if (j != c1190e.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        G g2 = c1190e.a;
        Intrinsics.checkNotNull(g2);
        int i = g.b;
        int i2 = g2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(g.c - i, g2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (g.a[i] != g2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == g.c) {
                g = g.f;
                Intrinsics.checkNotNull(g);
                i = g.b;
            }
            if (i2 == g2.c) {
                g2 = g2.f;
                Intrinsics.checkNotNull(g2);
                i2 = g2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f f(int i) {
        l0(i);
        return this;
    }

    public final void f0(int i) {
        G a0 = a0(4);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        a0.c = i2 + 4;
        this.b += 4;
    }

    @Override // okio.InterfaceC1191f, okio.J, java.io.Flushable
    public final void flush() {
    }

    public final void g0(long j) {
        G a0 = a0(8);
        byte[] bArr = a0.a;
        int i = a0.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        a0.c = i + 8;
        this.b += 8;
    }

    public final void h0(int i) {
        G a0 = a0(2);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        a0.c = i2 + 2;
        this.b += 2;
    }

    public final int hashCode() {
        G g = this.a;
        if (g == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = g.c;
            for (int i3 = g.b; i3 < i2; i3++) {
                i = (i * 31) + g.a[i3];
            }
            g = g.f;
            Intrinsics.checkNotNull(g);
        } while (g != this.a);
        return i;
    }

    @Override // okio.InterfaceC1192g
    public final void i(C1190e sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.b;
        if (j2 >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, j2);
            throw new EOFException();
        }
    }

    public final void i0(String string, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (i2 > string.length()) {
            StringBuilder c2 = androidx.collection.g.c(i2, "endIndex > string.length: ", " > ");
            c2.append(string.length());
            throw new IllegalArgumentException(c2.toString().toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            j0(i, i2, string);
            return;
        }
        String substring = string.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        m3358write(bytes, 0, bytes.length);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f j() {
        return this;
    }

    public final void j0(int i, int i2, String string) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (i2 > string.length()) {
            StringBuilder c2 = androidx.collection.g.c(i2, "endIndex > string.length: ", " > ");
            c2.append(string.length());
            throw new IllegalArgumentException(c2.toString().toString());
        }
        while (i < i2) {
            char charAt2 = string.charAt(i);
            if (charAt2 < 128) {
                G a0 = a0(1);
                byte[] bArr = a0.a;
                int i3 = a0.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = a0.c;
                int i6 = (i3 + i) - i5;
                a0.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    G a02 = a0(2);
                    byte[] bArr2 = a02.a;
                    int i7 = a02.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    a02.c = i7 + 2;
                    this.b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    G a03 = a0(3);
                    byte[] bArr3 = a03.a;
                    int i8 = a03.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    a03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        c0(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        G a04 = a0(4);
                        byte[] bArr4 = a04.a;
                        int i11 = a04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        a04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // okio.InterfaceC1192g
    public final String k(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long u = u((byte) 10, 0L, j2);
        if (u != -1) {
            return okio.internal.a.c(this, u);
        }
        if (j2 < this.b && t(j2 - 1) == 13 && t(j2) == 10) {
            return okio.internal.a.c(this, j2);
        }
        C1190e c1190e = new C1190e();
        s(0L, c1190e, Math.min(32, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + c1190e.C(c1190e.b).e() + Typography.ellipsis);
    }

    public final void k0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        j0(0, string.length(), string);
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C1190e clone() {
        C1190e c1190e = new C1190e();
        if (this.b == 0) {
            return c1190e;
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        G c2 = g.c();
        c1190e.a = c2;
        c2.g = c2;
        c2.f = c2;
        for (G g2 = g.f; g2 != g; g2 = g2.f) {
            G g3 = c2.g;
            Intrinsics.checkNotNull(g3);
            Intrinsics.checkNotNull(g2);
            g3.b(g2.c());
        }
        c1190e.b = this.b;
        return c1190e;
    }

    public final void l0(int i) {
        if (i < 128) {
            c0(i);
            return;
        }
        if (i < 2048) {
            G a0 = a0(2);
            byte[] bArr = a0.a;
            int i2 = a0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            a0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            c0(63);
            return;
        }
        if (i < 65536) {
            G a02 = a0(3);
            byte[] bArr2 = a02.a;
            int i3 = a02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            a02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C1187b.f(i));
        }
        G a03 = a0(4);
        byte[] bArr3 = a03.a;
        int i4 = a03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        a03.c = i4 + 4;
        this.b += 4;
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f m(String str) {
        k0(str);
        return this;
    }

    @Override // okio.InterfaceC1192g
    public final boolean n(long j, C1193h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return y(bytes.d(), bytes, j);
    }

    @Override // okio.InterfaceC1191f
    public final long o(K source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // okio.InterfaceC1192g
    public final boolean p(long j) {
        return this.b >= j;
    }

    @Override // okio.InterfaceC1192g
    public final F peek() {
        return z.b(new D(this));
    }

    public final long q() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        G g2 = g.g;
        Intrinsics.checkNotNull(g2);
        return (g2.c >= 8192 || !g2.e) ? j : j - (r3 - g2.b);
    }

    @Override // okio.InterfaceC1192g
    public final String r() throws EOFException {
        return k(Long.MAX_VALUE);
    }

    @Override // okio.K
    public final long read(C1190e sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j, "byteCount < 0: ").toString());
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.write(this, j);
        return j;
    }

    @Override // okio.InterfaceC1192g
    public final byte readByte() throws EOFException {
        if (this.b == 0) {
            throw new EOFException();
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        int i = g.b;
        int i2 = g.c;
        int i3 = i + 1;
        byte b2 = g.a[i];
        this.b--;
        if (i3 != i2) {
            g.b = i3;
            return b2;
        }
        this.a = g.a();
        H.a(g);
        return b2;
    }

    @Override // okio.InterfaceC1192g
    public final void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // okio.InterfaceC1192g
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        int i = g.b;
        int i2 = g.c;
        if (i2 - i < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        byte[] bArr = g.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & UByte.MAX_VALUE) | i4;
        this.b -= 4;
        if (i5 != i2) {
            g.b = i5;
            return i6;
        }
        this.a = g.a();
        H.a(g);
        return i6;
    }

    @Override // okio.InterfaceC1192g
    public final long readLong() throws EOFException {
        if (this.b < 8) {
            throw new EOFException();
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        int i = g.b;
        int i2 = g.c;
        if (i2 - i < 8) {
            return ((readInt() & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & readInt());
        }
        byte[] bArr = g.a;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.b -= 8;
        if (i4 != i2) {
            g.b = i4;
            return j2;
        }
        this.a = g.a();
        H.a(g);
        return j2;
    }

    @Override // okio.InterfaceC1192g
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        G g = this.a;
        Intrinsics.checkNotNull(g);
        int i = g.b;
        int i2 = g.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        byte[] bArr = g.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & UByte.MAX_VALUE) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = g.a();
            H.a(g);
        } else {
            g.b = i5;
        }
        return (short) i6;
    }

    public final void s(long j, C1190e out, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j3 = j;
        C1187b.b(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        out.b += j2;
        G g = this.a;
        while (true) {
            Intrinsics.checkNotNull(g);
            long j4 = g.c - g.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            g = g.f;
        }
        G g2 = g;
        long j5 = j2;
        while (j5 > 0) {
            Intrinsics.checkNotNull(g2);
            G c2 = g2.c();
            int i = c2.b + ((int) j3);
            c2.b = i;
            c2.c = Math.min(i + ((int) j5), c2.c);
            G g3 = out.a;
            if (g3 == null) {
                c2.g = c2;
                c2.f = c2;
                out.a = c2;
            } else {
                Intrinsics.checkNotNull(g3);
                G g4 = g3.g;
                Intrinsics.checkNotNull(g4);
                g4.b(c2);
            }
            j5 -= c2.c - c2.b;
            g2 = g2.f;
            j3 = 0;
        }
    }

    @Override // okio.InterfaceC1192g
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            G g = this.a;
            if (g == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, g.c - g.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            int i = g.b + min;
            g.b = i;
            if (i == g.c) {
                this.a = g.a();
                H.a(g);
            }
        }
    }

    @JvmName(name = "getByte")
    public final byte t(long j) {
        C1187b.b(this.b, j, 1L);
        G g = this.a;
        if (g == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                g = g.g;
                Intrinsics.checkNotNull(g);
                j2 -= g.c - g.b;
            }
            Intrinsics.checkNotNull(g);
            return g.a[(int) ((g.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (g.c - g.b) + j3;
            if (j4 > j) {
                Intrinsics.checkNotNull(g);
                return g.a[(int) ((g.b + j) - j3)];
            }
            g = g.f;
            Intrinsics.checkNotNull(g);
            j3 = j4;
        }
    }

    @Override // okio.K
    public final L timeout() {
        return L.NONE;
    }

    public final String toString() {
        long j = this.b;
        if (j <= SieveCacheKt.NodeLinkMask) {
            return Z((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final long u(byte b2, long j, long j2) {
        G g;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (g = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                g = g.g;
                Intrinsics.checkNotNull(g);
                j4 -= g.c - g.b;
            }
            while (j4 < j2) {
                byte[] bArr = g.a;
                int min = (int) Math.min(g.c, (g.b + j2) - j4);
                for (int i = (int) ((g.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b2) {
                        return (i - g.b) + j4;
                    }
                }
                j4 += g.c - g.b;
                g = g.f;
                Intrinsics.checkNotNull(g);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (g.c - g.b) + j3;
            if (j5 > j) {
                break;
            }
            g = g.f;
            Intrinsics.checkNotNull(g);
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = g.a;
            int min2 = (int) Math.min(g.c, (g.b + j2) - j3);
            for (int i2 = (int) ((g.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b2) {
                    return (i2 - g.b) + j3;
                }
            }
            j3 += g.c - g.b;
            g = g.f;
            Intrinsics.checkNotNull(g);
            j = j3;
        }
        return -1L;
    }

    @Override // okio.InterfaceC1192g
    public final short v() throws EOFException {
        short readShort = readShort();
        a aVar = C1187b.a;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f write(byte[] bArr) {
        m3357write(bArr);
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f writeByte(int i) {
        c0(i);
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f writeInt(int i) {
        f0(i);
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f writeShort(int i) {
        h0(i);
        return this;
    }

    public final long x(C1193h targetBytes) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        G g = this.a;
        if (g == null) {
            return -1L;
        }
        long j = this.b;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                g = g.g;
                Intrinsics.checkNotNull(g);
                j -= g.c - g.b;
            }
            if (targetBytes.d() == 2) {
                byte i3 = targetBytes.i(0);
                byte i4 = targetBytes.i(1);
                while (j < this.b) {
                    byte[] bArr = g.a;
                    i = (int) ((g.b + j2) - j);
                    int i5 = g.c;
                    while (i < i5) {
                        byte b2 = bArr[i];
                        if (b2 != i3 && b2 != i4) {
                            i++;
                        }
                        i2 = g.b;
                    }
                    j2 = (g.c - g.b) + j;
                    g = g.f;
                    Intrinsics.checkNotNull(g);
                    j = j2;
                }
                return -1L;
            }
            byte[] h = targetBytes.h();
            while (j < this.b) {
                byte[] bArr2 = g.a;
                i = (int) ((g.b + j2) - j);
                int i6 = g.c;
                while (i < i6) {
                    byte b3 = bArr2[i];
                    for (byte b4 : h) {
                        if (b3 == b4) {
                            i2 = g.b;
                        }
                    }
                    i++;
                }
                j2 = (g.c - g.b) + j;
                g = g.f;
                Intrinsics.checkNotNull(g);
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (g.c - g.b) + j;
            if (j3 > 0) {
                break;
            }
            g = g.f;
            Intrinsics.checkNotNull(g);
            j = j3;
        }
        if (targetBytes.d() == 2) {
            byte i7 = targetBytes.i(0);
            byte i8 = targetBytes.i(1);
            while (j < this.b) {
                byte[] bArr3 = g.a;
                i = (int) ((g.b + j2) - j);
                int i9 = g.c;
                while (i < i9) {
                    byte b5 = bArr3[i];
                    if (b5 != i7 && b5 != i8) {
                        i++;
                    }
                    i2 = g.b;
                }
                j2 = (g.c - g.b) + j;
                g = g.f;
                Intrinsics.checkNotNull(g);
                j = j2;
            }
            return -1L;
        }
        byte[] h2 = targetBytes.h();
        while (j < this.b) {
            byte[] bArr4 = g.a;
            i = (int) ((g.b + j2) - j);
            int i10 = g.c;
            while (i < i10) {
                byte b6 = bArr4[i];
                for (byte b7 : h2) {
                    if (b6 == b7) {
                        i2 = g.b;
                    }
                }
                i++;
            }
            j2 = (g.c - g.b) + j;
            g = g.f;
            Intrinsics.checkNotNull(g);
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    public final boolean y(int i, C1193h bytes, long j) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (i >= 0 && j >= 0 && i + j <= this.b && i <= bytes.d()) {
            return i == 0 || okio.internal.a.a(this, bytes, j, j + 1, i) != -1;
        }
        return false;
    }

    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,649:1\n73#2:650\n85#2:651\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:650\n136#1:651\n*E\n"})
    /* renamed from: okio.e$b */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C1190e.this.b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            C1190e c1190e = C1190e.this;
            if (c1190e.b > 0) {
                return c1190e.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        public final String toString() {
            return C1190e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C1190e.this.read(sink, i, i2);
        }
    }

    @Override // okio.InterfaceC1191f
    public final /* bridge */ /* synthetic */ InterfaceC1191f write(byte[] bArr, int i, int i2) {
        m3358write(bArr, i, i2);
        return this;
    }

    @Override // okio.J
    public final void write(C1190e source, long j) {
        G g;
        G b2;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            C1187b.b(source.b, 0L, j);
            while (j > 0) {
                G g2 = source.a;
                Intrinsics.checkNotNull(g2);
                int i = g2.c;
                G g3 = source.a;
                Intrinsics.checkNotNull(g3);
                long j2 = i - g3.b;
                int i2 = 0;
                if (j < j2) {
                    G g4 = this.a;
                    if (g4 != null) {
                        Intrinsics.checkNotNull(g4);
                        g = g4.g;
                    } else {
                        g = null;
                    }
                    if (g != null && g.e) {
                        if ((g.c + j) - (g.d ? 0 : g.b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            G g5 = source.a;
                            Intrinsics.checkNotNull(g5);
                            g5.d(g, (int) j);
                            source.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    G g6 = source.a;
                    Intrinsics.checkNotNull(g6);
                    int i3 = (int) j;
                    if (i3 <= 0) {
                        g6.getClass();
                    } else if (i3 <= g6.c - g6.b) {
                        if (i3 >= 1024) {
                            b2 = g6.c();
                        } else {
                            b2 = H.b();
                            byte[] bArr = g6.a;
                            byte[] bArr2 = b2.a;
                            int i4 = g6.b;
                            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i4, i4 + i3, 2, (Object) null);
                        }
                        b2.c = b2.b + i3;
                        g6.b += i3;
                        G g7 = g6.g;
                        Intrinsics.checkNotNull(g7);
                        g7.b(b2);
                        source.a = b2;
                    }
                    throw new IllegalArgumentException("byteCount out of range");
                }
                G g8 = source.a;
                Intrinsics.checkNotNull(g8);
                long j3 = g8.c - g8.b;
                source.a = g8.a();
                G g9 = this.a;
                if (g9 == null) {
                    this.a = g8;
                    g8.g = g8;
                    g8.f = g8;
                } else {
                    Intrinsics.checkNotNull(g9);
                    G g10 = g9.g;
                    Intrinsics.checkNotNull(g10);
                    g10.b(g8);
                    G g11 = g8.g;
                    if (g11 != g8) {
                        Intrinsics.checkNotNull(g11);
                        if (g11.e) {
                            int i5 = g8.c - g8.b;
                            G g12 = g8.g;
                            Intrinsics.checkNotNull(g12);
                            int i6 = 8192 - g12.c;
                            G g13 = g8.g;
                            Intrinsics.checkNotNull(g13);
                            if (!g13.d) {
                                G g14 = g8.g;
                                Intrinsics.checkNotNull(g14);
                                i2 = g14.b;
                            }
                            if (i5 <= i6 + i2) {
                                G g15 = g8.g;
                                Intrinsics.checkNotNull(g15);
                                g8.d(g15, i5);
                                g8.a();
                                H.a(g8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.b -= j3;
                this.b += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        G g = this.a;
        if (g == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), g.c - g.b);
        sink.put(g.a, g.b, min);
        int i = g.b + min;
        g.b = i;
        this.b -= min;
        if (i == g.c) {
            this.a = g.a();
            H.a(g);
        }
        return min;
    }

    public final int read(byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C1187b.b(sink.length, i, i2);
        G g = this.a;
        if (g == null) {
            return -1;
        }
        int min = Math.min(i2, g.c - g.b);
        byte[] bArr = g.a;
        int i3 = g.b;
        ArraysKt.copyInto(bArr, sink, i, i3, i3 + min);
        int i4 = g.b + min;
        g.b = i4;
        this.b -= min;
        if (i4 == g.c) {
            this.a = g.a();
            H.a(g);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            G a0 = a0(1);
            int min = Math.min(i, 8192 - a0.c);
            source.get(a0.a, a0.c, min);
            i -= min;
            a0.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m3357write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        m3358write(source, 0, source.length);
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m3358write(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        C1187b.b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            G a0 = a0(1);
            int min = Math.min(i3 - i, 8192 - a0.c);
            int i4 = i + min;
            ArraysKt.copyInto(source, a0.a, a0.c, i, i4);
            a0.c += min;
            i = i4;
        }
        this.b += j;
    }
}
