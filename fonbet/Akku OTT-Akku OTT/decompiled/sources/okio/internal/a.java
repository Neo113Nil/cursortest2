package okio.internal;

import kotlin.UByte;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okio.A;
import okio.C1187b;
import okio.C1190e;
import okio.C1193h;
import okio.G;

@JvmName(name = "-Buffer")
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1712:1\n110#1,20:1735\n110#1,20:1768\n110#1:1788\n112#1,18:1790\n110#1,20:1808\n73#2:1713\n73#2:1714\n73#2:1715\n73#2:1716\n73#2:1717\n73#2:1718\n73#2:1719\n73#2:1720\n73#2:1721\n73#2:1722\n73#2:1723\n73#2:1724\n82#2:1725\n82#2:1726\n76#2:1727\n76#2:1728\n76#2:1729\n76#2:1730\n76#2:1731\n76#2:1732\n76#2:1733\n76#2:1734\n85#2:1755\n88#2:1757\n73#2:1758\n73#2:1759\n73#2:1760\n73#2:1761\n73#2:1762\n73#2:1763\n73#2:1764\n73#2:1765\n73#2:1766\n73#2:1767\n88#2:1789\n85#2:1828\n1#3:1756\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n413#1:1735,20\n1262#1:1768,20\n1305#1:1788\n1305#1:1790,18\n1341#1:1808,20\n176#1:1713\n200#1:1714\n319#1:1715\n324#1:1716\n347#1:1717\n348#1:1718\n349#1:1719\n350#1:1720\n356#1:1721\n357#1:1722\n358#1:1723\n359#1:1724\n383#1:1725\n384#1:1726\n390#1:1727\n391#1:1728\n392#1:1729\n393#1:1730\n394#1:1731\n395#1:1732\n396#1:1733\n397#1:1734\n425#1:1755\n858#1:1757\n876#1:1758\n878#1:1759\n882#1:1760\n884#1:1761\n888#1:1762\n890#1:1763\n894#1:1764\n896#1:1765\n916#1:1766\n919#1:1767\n1317#1:1789\n1658#1:1828\n*E\n"})
/* loaded from: classes5.dex */
public final class a {
    public static final byte[] a;
    public static final long[] b;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(C1190e c1190e, C1193h bytes, long j, long j2, int i) {
        G g;
        byte[] bArr;
        long j3 = j;
        long j4 = j2;
        Intrinsics.checkNotNullParameter(c1190e, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j5 = i;
        C1187b.b(bytes.d(), 0, j5);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(androidx.core.database.a.c(j3, "fromIndex < 0: ").toString());
        }
        if (j3 > j4) {
            StringBuilder b2 = androidx.compose.runtime.snapshots.m.b(j3, "fromIndex > toIndex: ", " > ");
            b2.append(j4);
            throw new IllegalArgumentException(b2.toString().toString());
        }
        long j7 = c1190e.b;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 == j4 || (g = c1190e.a) == null) {
            return -1L;
        }
        if (j7 - j3 >= j3) {
            while (true) {
                long j8 = (g.c - g.b) + j6;
                if (j8 > j3) {
                    break;
                }
                g = g.f;
                Intrinsics.checkNotNull(g);
                j6 = j8;
            }
            byte[] h = bytes.h();
            byte b3 = h[0];
            long min = Math.min(j4, (c1190e.b - j5) + 1);
            while (j6 < min) {
                byte[] bArr2 = g.a;
                int min2 = (int) Math.min(g.c, (g.b + min) - j6);
                for (int i2 = (int) ((g.b + j3) - j6); i2 < min2; i2++) {
                    if (bArr2[i2] == b3 && b(g, i2 + 1, h, 1, i)) {
                        return (i2 - g.b) + j6;
                    }
                }
                j6 += g.c - g.b;
                g = g.f;
                Intrinsics.checkNotNull(g);
                j3 = j6;
            }
            return -1L;
        }
        while (j7 > j3) {
            g = g.g;
            Intrinsics.checkNotNull(g);
            j7 -= g.c - g.b;
        }
        byte[] h2 = bytes.h();
        byte b4 = h2[0];
        byte[] bArr3 = h2;
        long min3 = Math.min(j4, (c1190e.b - j5) + 1);
        while (j7 < min3) {
            byte[] bArr4 = g.a;
            int min4 = (int) Math.min(g.c, (g.b + min3) - j7);
            int i3 = (int) ((g.b + j3) - j7);
            while (i3 < min4) {
                if (bArr4[i3] == b4) {
                    bArr = bArr3;
                    if (b(g, i3 + 1, bArr, 1, i)) {
                        return (i3 - g.b) + j7;
                    }
                } else {
                    bArr = bArr3;
                }
                i3++;
                bArr3 = bArr;
            }
            j7 += g.c - g.b;
            g = g.f;
            Intrinsics.checkNotNull(g);
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(G segment, int i, byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i4 = segment.c;
        byte[] bArr = segment.a;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.f;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.a;
                bArr = bArr2;
                i = segment.b;
                i4 = segment.c;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(C1190e c1190e, long j) {
        Intrinsics.checkNotNullParameter(c1190e, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c1190e.t(j2) == 13) {
                String X = c1190e.X(j2, Charsets.UTF_8);
                c1190e.skip(2L);
                return X;
            }
        }
        c1190e.getClass();
        String X2 = c1190e.X(j, Charsets.UTF_8);
        c1190e.skip(1L);
        return X2;
    }

    public static final int d(C1190e c1190e, A options, boolean z) {
        int i;
        int i2;
        int i3;
        G g;
        int i4;
        Intrinsics.checkNotNullParameter(c1190e, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        G g2 = c1190e.a;
        if (g2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = g2.a;
        int i5 = g2.b;
        int i6 = g2.c;
        int[] iArr = options.b;
        G g3 = g2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (g3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & UByte.MAX_VALUE;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            g3 = g3.f;
                            Intrinsics.checkNotNull(g3);
                            int i16 = g3.b;
                            byte[] bArr2 = g3.a;
                            i2 = g3.c;
                            if (g3 == g2) {
                                i3 = i16;
                                bArr = bArr2;
                                g3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & UByte.MAX_VALUE) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i20 == i18;
                if (i19 == i6) {
                    Intrinsics.checkNotNull(g3);
                    G g4 = g3.f;
                    Intrinsics.checkNotNull(g4);
                    i3 = g4.b;
                    byte[] bArr3 = g4.a;
                    i4 = g4.c;
                    if (g4 != g2) {
                        g = g4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        g = null;
                    }
                } else {
                    g = g3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    g3 = g;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                g3 = g;
                i11 = i20;
            }
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
