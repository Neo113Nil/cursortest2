package X1;

import C1.C0095a;
import F1.x;
import R5.M;
import Y4.D;
import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import n3.AbstractC1464a;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class c extends AbstractC1464a {

    /* renamed from: h, reason: collision with root package name */
    public static final M f7463h = new M(9);

    /* renamed from: g, reason: collision with root package name */
    public final a f7464g;

    public c(a aVar) {
        this.f7464g = aVar;
    }

    public static int A0(int i7, C0095a c0095a) {
        byte[] bArr = (byte[]) c0095a.f1465c;
        int i8 = c0095a.f1463a;
        int i9 = i8;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= i8 + i7) {
                return i7;
            }
            if ((bArr[i9] & 255) == 255 && bArr[i10] == 0) {
                System.arraycopy(bArr, i9 + 2, bArr, i10, (i7 - (i9 - i8)) - 2);
                i7--;
            }
            i9 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean B0(C0095a c0095a, int i7, int i8, boolean z4) {
        int v6;
        long v7;
        int i9;
        int i10;
        int i11 = c0095a.f1463a;
        while (true) {
            try {
                boolean z7 = true;
                if (c0095a.d() < i8) {
                    c0095a.D(i11);
                    return true;
                }
                if (i7 >= 3) {
                    v6 = c0095a.g();
                    v7 = c0095a.u();
                    i9 = c0095a.y();
                } else {
                    v6 = c0095a.v();
                    v7 = c0095a.v();
                    i9 = 0;
                }
                if (v6 == 0 && v7 == 0 && i9 == 0) {
                    c0095a.D(i11);
                    return true;
                }
                if (i7 == 4 && !z4) {
                    if ((8421504 & v7) != 0) {
                        c0095a.D(i11);
                        return false;
                    }
                    v7 = (((v7 >> 24) & 255) << 21) | (v7 & 255) | (((v7 >> 8) & 255) << 7) | (((v7 >> 16) & 255) << 14);
                }
                if (i7 == 4) {
                    i10 = (i9 & 64) != 0 ? 1 : 0;
                } else {
                    if (i7 == 3) {
                        i10 = (i9 & 32) != 0 ? 1 : 0;
                    } else {
                        i10 = 0;
                        z7 = false;
                    }
                    if (z7) {
                        i10 += 4;
                    }
                    if (v7 < i10) {
                        c0095a.D(i11);
                        return false;
                    }
                    if (c0095a.d() < v7) {
                        c0095a.D(i11);
                        return false;
                    }
                    c0095a.E((int) v7);
                }
            } catch (Throwable th) {
                c0095a.D(i11);
                throw th;
            }
        }
    }

    public static ApicFrame i0(C0095a c0095a, int i7, int i8) {
        int z02;
        String a02;
        int t7 = c0095a.t();
        String w02 = w0(t7);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        c0095a.f(bArr, 0, i9);
        if (i8 == 2) {
            a02 = "image/" + D.a0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(a02)) {
                a02 = "image/jpeg";
            }
            z02 = 2;
        } else {
            z02 = z0(0, bArr);
            a02 = D.a0(new String(bArr, 0, z02, "ISO-8859-1"));
            if (a02.indexOf(47) == -1) {
                a02 = "image/".concat(a02);
            }
        }
        int i10 = bArr[z02 + 1] & 255;
        int i11 = z02 + 2;
        int y02 = y0(bArr, i11, t7);
        String str = new String(bArr, i11, y02 - i11, w02);
        int v02 = v0(t7) + y02;
        return new ApicFrame(a02, str, i10, i9 <= v02 ? t.f17158f : Arrays.copyOfRange(bArr, v02, i9));
    }

    public static ChapterFrame j0(C0095a c0095a, int i7, int i8, boolean z4, int i9, a aVar) {
        int i10 = c0095a.f1463a;
        int z02 = z0(i10, (byte[]) c0095a.f1465c);
        String str = new String((byte[]) c0095a.f1465c, i10, z02 - i10, "ISO-8859-1");
        c0095a.D(z02 + 1);
        int g3 = c0095a.g();
        int g7 = c0095a.g();
        long u4 = c0095a.u();
        long j = u4 == 4294967295L ? -1L : u4;
        long u7 = c0095a.u();
        long j3 = u7 == 4294967295L ? -1L : u7;
        ArrayList arrayList = new ArrayList();
        int i11 = i10 + i7;
        while (c0095a.f1463a < i11) {
            Id3Frame m02 = m0(i8, c0095a, z4, i9, aVar);
            if (m02 != null) {
                arrayList.add(m02);
            }
        }
        return new ChapterFrame(str, g3, g7, j, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame k0(C0095a c0095a, int i7, int i8, boolean z4, int i9, a aVar) {
        int i10 = c0095a.f1463a;
        int z02 = z0(i10, (byte[]) c0095a.f1465c);
        String str = new String((byte[]) c0095a.f1465c, i10, z02 - i10, "ISO-8859-1");
        c0095a.D(z02 + 1);
        int t7 = c0095a.t();
        boolean z7 = (t7 & 2) != 0;
        boolean z8 = (t7 & 1) != 0;
        int t8 = c0095a.t();
        String[] strArr = new String[t8];
        for (int i11 = 0; i11 < t8; i11++) {
            int i12 = c0095a.f1463a;
            int z03 = z0(i12, (byte[]) c0095a.f1465c);
            strArr[i11] = new String((byte[]) c0095a.f1465c, i12, z03 - i12, "ISO-8859-1");
            c0095a.D(z03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i7;
        while (c0095a.f1463a < i13) {
            Id3Frame m02 = m0(i8, c0095a, z4, i9, aVar);
            if (m02 != null) {
                arrayList.add(m02);
            }
        }
        return new ChapterTocFrame(str, z7, z8, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame l0(int i7, C0095a c0095a) {
        if (i7 < 4) {
            return null;
        }
        int t7 = c0095a.t();
        String w02 = w0(t7);
        byte[] bArr = new byte[3];
        c0095a.f(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        c0095a.f(bArr2, 0, i8);
        int y02 = y0(bArr2, 0, t7);
        String str2 = new String(bArr2, 0, y02, w02);
        int v02 = v0(t7) + y02;
        return new CommentFrame(str, str2, q0(w02, bArr2, v02, y0(bArr2, v02, t7)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0185, code lost:
    
        if (r14 == 67) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame m0(int i7, C0095a c0095a, boolean z4, int i8, a aVar) {
        int w7;
        String str;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str2;
        Id3Frame binaryFrame;
        int t7 = c0095a.t();
        int t8 = c0095a.t();
        int t9 = c0095a.t();
        int t10 = i7 >= 3 ? c0095a.t() : 0;
        if (i7 == 4) {
            w7 = c0095a.w();
            if (!z4) {
                w7 = (((w7 >> 24) & 255) << 21) | (w7 & 255) | (((w7 >> 8) & 255) << 7) | (((w7 >> 16) & 255) << 14);
            }
        } else {
            w7 = i7 == 3 ? c0095a.w() : c0095a.v();
        }
        int i11 = w7;
        int y4 = i7 >= 3 ? c0095a.y() : 0;
        if (t7 == 0 && t8 == 0 && t9 == 0 && t10 == 0 && i11 == 0 && y4 == 0) {
            c0095a.D(c0095a.f1464b);
            return null;
        }
        int i12 = c0095a.f1463a + i11;
        if (i12 > c0095a.f1464b) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            c0095a.D(c0095a.f1464b);
            return null;
        }
        if (aVar != null) {
            str = "Id3Decoder";
            i9 = i12;
            i10 = y4;
            if (!aVar.g(i7, t7, t8, t9, t10)) {
                c0095a.D(i9);
                return null;
            }
        } else {
            str = "Id3Decoder";
            i9 = i12;
            i10 = y4;
        }
        if (i7 == 3) {
            z7 = (i10 & 128) != 0;
            z8 = (i10 & 64) != 0;
            z9 = (i10 & 32) != 0;
            z11 = z7;
            z10 = false;
        } else {
            if (i7 == 4) {
                z9 = (i10 & 64) != 0;
                z7 = (i10 & 8) != 0;
                z8 = (i10 & 4) != 0;
                z10 = (i10 & 2) != 0;
                if ((i10 & 1) != 0) {
                    z11 = true;
                }
            } else {
                z7 = false;
                z8 = false;
                z9 = false;
                z10 = false;
            }
            z11 = false;
        }
        if (z7 || z8) {
            Log.w(str, "Skipping unsupported compressed or encrypted frame");
            c0095a.D(i9);
            return null;
        }
        if (z9) {
            i11--;
            c0095a.E(1);
        }
        if (z11) {
            i11 -= 4;
            c0095a.E(4);
        }
        int i13 = i11;
        if (z10) {
            i13 = A0(i13, c0095a);
        }
        int i14 = i13;
        try {
            try {
                if (t7 == 84 && t8 == 88 && t9 == 88 && (i7 == 2 || t10 == 88)) {
                    binaryFrame = s0(i14, c0095a);
                } else if (t7 == 84) {
                    binaryFrame = r0(i14, c0095a, x0(i7, t7, t8, t9, t10));
                } else if (t7 == 87 && t8 == 88 && t9 == 88 && (i7 == 2 || t10 == 88)) {
                    binaryFrame = u0(i14, c0095a);
                } else if (t7 == 87) {
                    binaryFrame = t0(i14, c0095a, x0(i7, t7, t8, t9, t10));
                } else if (t7 == 80 && t8 == 82 && t9 == 73 && t10 == 86) {
                    binaryFrame = p0(i14, c0095a);
                } else if (t7 == 71 && t8 == 69 && t9 == 79 && (t10 == 66 || i7 == 2)) {
                    binaryFrame = n0(i14, c0095a);
                } else if (i7 == 2) {
                    if (t7 == 80 && t8 == 73 && t9 == 67) {
                        binaryFrame = i0(c0095a, i14, i7);
                    }
                    if (t7 != 67 && t8 == 79 && t9 == 77 && (t10 == 77 || i7 == 2)) {
                        binaryFrame = l0(i14, c0095a);
                    } else if (t7 != 67 && t8 == 72 && t9 == 65 && t10 == 80) {
                        binaryFrame = j0(c0095a, i14, i7, z4, i8, aVar);
                    } else if (t7 != 67 && t8 == 84 && t9 == 79 && t10 == 67) {
                        binaryFrame = k0(c0095a, i14, i7, z4, i8, aVar);
                    } else if (t7 != 77 && t8 == 76 && t9 == 76 && t10 == 84) {
                        binaryFrame = o0(i14, c0095a);
                    } else {
                        String x02 = x0(i7, t7, t8, t9, t10);
                        byte[] bArr = new byte[i14];
                        c0095a.f(bArr, 0, i14);
                        binaryFrame = new BinaryFrame(x02, bArr);
                    }
                } else {
                    if (t7 == 65) {
                        if (t8 == 80) {
                            if (t9 == 73) {
                            }
                        }
                    }
                    if (t7 != 67) {
                    }
                    if (t7 != 67) {
                    }
                    if (t7 != 67) {
                    }
                    if (t7 != 77) {
                    }
                    String x022 = x0(i7, t7, t8, t9, t10);
                    byte[] bArr2 = new byte[i14];
                    c0095a.f(bArr2, 0, i14);
                    binaryFrame = new BinaryFrame(x022, bArr2);
                }
                if (binaryFrame == null) {
                    str2 = str;
                    try {
                        Log.w(str2, "Failed to decode frame: id=" + x0(i7, t7, t8, t9, t10) + ", frameSize=" + i14);
                    } catch (UnsupportedEncodingException unused) {
                        Log.w(str2, "Unsupported character encoding");
                        c0095a.D(i9);
                        return null;
                    }
                }
                c0095a.D(i9);
                return binaryFrame;
            } catch (Throwable th) {
                c0095a.D(i9);
                throw th;
            }
        } catch (UnsupportedEncodingException unused2) {
            str2 = str;
        }
    }

    public static GeobFrame n0(int i7, C0095a c0095a) {
        int t7 = c0095a.t();
        String w02 = w0(t7);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        int z02 = z0(0, bArr);
        String str = new String(bArr, 0, z02, "ISO-8859-1");
        int i9 = z02 + 1;
        int y02 = y0(bArr, i9, t7);
        String q02 = q0(w02, bArr, i9, y02);
        int v02 = v0(t7) + y02;
        int y03 = y0(bArr, v02, t7);
        String q03 = q0(w02, bArr, v02, y03);
        int v03 = v0(t7) + y03;
        return new GeobFrame(str, q02, q03, i8 <= v03 ? t.f17158f : Arrays.copyOfRange(bArr, v03, i8));
    }

    public static MlltFrame o0(int i7, C0095a c0095a) {
        int y4 = c0095a.y();
        int v6 = c0095a.v();
        int v7 = c0095a.v();
        int t7 = c0095a.t();
        int t8 = c0095a.t();
        x xVar = new x();
        xVar.n(c0095a.f1464b, (byte[]) c0095a.f1465c);
        xVar.o(c0095a.f1463a * 8);
        int i8 = ((i7 - 10) * 8) / (t7 + t8);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = xVar.i(t7);
            int i11 = xVar.i(t8);
            iArr[i9] = i10;
            iArr2[i9] = i11;
        }
        return new MlltFrame(y4, v6, v7, iArr, iArr2);
    }

    public static PrivFrame p0(int i7, C0095a c0095a) {
        byte[] bArr = new byte[i7];
        c0095a.f(bArr, 0, i7);
        int z02 = z0(0, bArr);
        String str = new String(bArr, 0, z02, "ISO-8859-1");
        int i8 = z02 + 1;
        return new PrivFrame(str, i7 <= i8 ? t.f17158f : Arrays.copyOfRange(bArr, i8, i7));
    }

    public static String q0(String str, byte[] bArr, int i7, int i8) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, str);
    }

    public static TextInformationFrame r0(int i7, C0095a c0095a, String str) {
        if (i7 < 1) {
            return null;
        }
        int t7 = c0095a.t();
        String w02 = w0(t7);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        return new TextInformationFrame(str, null, new String(bArr, 0, y0(bArr, 0, t7), w02));
    }

    public static TextInformationFrame s0(int i7, C0095a c0095a) {
        if (i7 < 1) {
            return null;
        }
        int t7 = c0095a.t();
        String w02 = w0(t7);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        int y02 = y0(bArr, 0, t7);
        String str = new String(bArr, 0, y02, w02);
        int v02 = v0(t7) + y02;
        return new TextInformationFrame("TXXX", str, q0(w02, bArr, v02, y0(bArr, v02, t7)));
    }

    public static UrlLinkFrame t0(int i7, C0095a c0095a, String str) {
        byte[] bArr = new byte[i7];
        c0095a.f(bArr, 0, i7);
        return new UrlLinkFrame(str, null, new String(bArr, 0, z0(0, bArr), "ISO-8859-1"));
    }

    public static UrlLinkFrame u0(int i7, C0095a c0095a) {
        if (i7 < 1) {
            return null;
        }
        int t7 = c0095a.t();
        String w02 = w0(t7);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        int y02 = y0(bArr, 0, t7);
        String str = new String(bArr, 0, y02, w02);
        int v02 = v0(t7) + y02;
        return new UrlLinkFrame("WXXX", str, q0("ISO-8859-1", bArr, v02, z0(v02, bArr)));
    }

    public static int v0(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static String w0(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String x0(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int y0(byte[] bArr, int i7, int i8) {
        int z02 = z0(i7, bArr);
        if (i8 == 0 || i8 == 3) {
            return z02;
        }
        while (z02 < bArr.length - 1) {
            if ((z02 - i7) % 2 == 0 && bArr[z02 + 1] == 0) {
                return z02;
            }
            z02 = z0(z02 + 1, bArr);
        }
        return bArr.length;
    }

    public static int z0(int i7, byte[] bArr) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Metadata h0(int i7, byte[] bArr) {
        b bVar;
        ArrayList arrayList = new ArrayList();
        C0095a c0095a = new C0095a(bArr, i7);
        boolean z4 = false;
        if (c0095a.d() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int v6 = c0095a.v();
            if (v6 == 4801587) {
                int t7 = c0095a.t();
                c0095a.E(1);
                int t8 = c0095a.t();
                int s7 = c0095a.s();
                if (t7 == 2) {
                    if ((t8 & 64) != 0) {
                        Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(t7, t7 >= 4 && (t8 & 128) != 0, s7);
                } else {
                    if (t7 == 3) {
                        if ((t8 & 64) != 0) {
                            int g3 = c0095a.g();
                            c0095a.E(g3);
                            s7 -= g3 + 4;
                        }
                    } else if (t7 == 4) {
                        if ((t8 & 64) != 0) {
                            int s8 = c0095a.s();
                            c0095a.E(s8 - 4);
                            s7 -= s8;
                        }
                        if ((t8 & 16) != 0) {
                            s7 -= 10;
                        }
                    } else {
                        AbstractC1663a.j(t7, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    bVar = new b(t7, t7 >= 4 && (t8 & 128) != 0, s7);
                }
                if (bVar != null) {
                    return null;
                }
                int i8 = c0095a.f1463a;
                int i9 = bVar.f7460a;
                int i10 = i9 == 2 ? 6 : 10;
                boolean z7 = bVar.f7461b;
                int i11 = bVar.f7462c;
                if (z7) {
                    i11 = A0(i11, c0095a);
                }
                c0095a.C(i8 + i11);
                if (!B0(c0095a, i9, i10, false)) {
                    if (i9 != 4 || !B0(c0095a, 4, i10, true)) {
                        AbstractC1663a.j(i9, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z4 = true;
                }
                while (c0095a.d() >= i10) {
                    Id3Frame m02 = m0(i9, c0095a, z4, i10, this.f7464g);
                    if (m02 != null) {
                        arrayList.add(m02);
                    }
                }
                return new Metadata(arrayList);
            }
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(v6))));
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    @Override // n3.AbstractC1464a
    public final Metadata o(S1.c cVar, ByteBuffer byteBuffer) {
        return h0(byteBuffer.limit(), byteBuffer.array());
    }
}
