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
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p097n3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M f7463h = new M(9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
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

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean B0(C0095a c0095a, int i7, int i8, boolean z4) {
        int iV;
        long jV;
        int iY;
        int i9;
        int i10 = c0095a.f1463a;
        while (true) {
            try {
                boolean z7 = true;
                if (c0095a.d() < i8) {
                    c0095a.D(i10);
                    return true;
                }
                if (i7 >= 3) {
                    iV = c0095a.g();
                    jV = c0095a.u();
                    iY = c0095a.y();
                } else {
                    iV = c0095a.v();
                    jV = c0095a.v();
                    iY = 0;
                }
                if (iV == 0 && jV == 0 && iY == 0) {
                    c0095a.D(i10);
                    return true;
                }
                if (i7 == 4 && !z4) {
                    if ((8421504 & jV) != 0) {
                        c0095a.D(i10);
                        return false;
                    }
                    jV = (((jV >> 24) & 255) << 21) | (jV & 255) | (((jV >> 8) & 255) << 7) | (((jV >> 16) & 255) << 14);
                }
                if (i7 == 4) {
                    i9 = (iY & 64) != 0 ? 1 : 0;
                    if ((iY & 1) == 0) {
                        z7 = false;
                    }
                } else if (i7 == 3) {
                    i9 = (iY & 32) != 0 ? 1 : 0;
                    if ((iY & 128) == 0) {
                        z7 = false;
                    }
                } else {
                    i9 = 0;
                    z7 = false;
                }
                if (z7) {
                    i9 += 4;
                }
                if (jV < i9) {
                    c0095a.D(i10);
                    return false;
                }
                if (c0095a.d() < jV) {
                    c0095a.D(i10);
                    return false;
                }
                c0095a.E((int) jV);
            } catch (Throwable th) {
                c0095a.D(i10);
                throw th;
            }
        }
    }

    public static ApicFrame i0(C0095a c0095a, int i7, int i8) {
        int iZ0;
        String strA0;
        int iT = c0095a.t();
        String strW0 = w0(iT);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        c0095a.f(bArr, 0, i9);
        if (i8 == 2) {
            strA0 = "image/" + D.a0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(strA0)) {
                strA0 = "image/jpeg";
            }
            iZ0 = 2;
        } else {
            iZ0 = z0(0, bArr);
            strA0 = D.a0(new String(bArr, 0, iZ0, "ISO-8859-1"));
            if (strA0.indexOf(47) == -1) {
                strA0 = "image/".concat(strA0);
            }
        }
        int i10 = bArr[iZ0 + 1] & 255;
        int i11 = iZ0 + 2;
        int iY0 = y0(bArr, i11, iT);
        String str = new String(bArr, i11, iY0 - i11, strW0);
        int iV0 = v0(iT) + iY0;
        return new ApicFrame(strA0, str, i10, i9 <= iV0 ? t.f17164f : Arrays.copyOfRange(bArr, iV0, i9));
    }

    public static ChapterFrame j0(C0095a c0095a, int i7, int i8, boolean z4, int i9, a aVar) {
        int i10 = c0095a.f1463a;
        int iZ0 = z0(i10, (byte[]) c0095a.f1465c);
        String str = new String((byte[]) c0095a.f1465c, i10, iZ0 - i10, "ISO-8859-1");
        c0095a.D(iZ0 + 1);
        int iG = c0095a.g();
        int iG2 = c0095a.g();
        long jU = c0095a.u();
        long j = jU == 4294967295L ? -1L : jU;
        long jU2 = c0095a.u();
        long j3 = jU2 == 4294967295L ? -1L : jU2;
        ArrayList arrayList = new ArrayList();
        int i11 = i10 + i7;
        while (c0095a.f1463a < i11) {
            Id3Frame id3FrameM0 = m0(i8, c0095a, z4, i9, aVar);
            if (id3FrameM0 != null) {
                arrayList.add(id3FrameM0);
            }
        }
        return new ChapterFrame(str, iG, iG2, j, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame k0(C0095a c0095a, int i7, int i8, boolean z4, int i9, a aVar) {
        int i10 = c0095a.f1463a;
        int iZ0 = z0(i10, (byte[]) c0095a.f1465c);
        String str = new String((byte[]) c0095a.f1465c, i10, iZ0 - i10, "ISO-8859-1");
        c0095a.D(iZ0 + 1);
        int iT = c0095a.t();
        boolean z7 = (iT & 2) != 0;
        boolean z8 = (iT & 1) != 0;
        int iT2 = c0095a.t();
        String[] strArr = new String[iT2];
        for (int i11 = 0; i11 < iT2; i11++) {
            int i12 = c0095a.f1463a;
            int iZ1 = z0(i12, (byte[]) c0095a.f1465c);
            strArr[i11] = new String((byte[]) c0095a.f1465c, i12, iZ1 - i12, "ISO-8859-1");
            c0095a.D(iZ1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i7;
        while (c0095a.f1463a < i13) {
            Id3Frame id3FrameM0 = m0(i8, c0095a, z4, i9, aVar);
            if (id3FrameM0 != null) {
                arrayList.add(id3FrameM0);
            }
        }
        return new ChapterTocFrame(str, z7, z8, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame l0(int i7, C0095a c0095a) {
        if (i7 < 4) {
            return null;
        }
        int iT = c0095a.t();
        String strW0 = w0(iT);
        byte[] bArr = new byte[3];
        c0095a.f(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        c0095a.f(bArr2, 0, i8);
        int iY0 = y0(bArr2, 0, iT);
        String str2 = new String(bArr2, 0, iY0, strW0);
        int iV0 = v0(iT) + iY0;
        return new CommentFrame(str, str2, q0(strW0, bArr2, iV0, y0(bArr2, iV0, iT)));
    }

    /* JADX WARN: Code duplicated, block: B:134:0x018d  */
    /* JADX WARN: Code duplicated, block: B:141:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01df A[Catch: all -> 0x0113, UnsupportedEncodingException -> 0x0116, TryCatch #1 {all -> 0x0113, blocks: (B:91:0x010d, B:160:0x01f1, B:162:0x020b, B:165:0x0212, B:96:0x011c, B:103:0x0132, B:105:0x013a, B:113:0x0154, B:122:0x016c, B:133:0x0187, B:140:0x0199, B:146:0x01a8, B:151:0x01c0, B:157:0x01da, B:158:0x01df), top: B:175:0x0103 }] */
    public static Id3Frame m0(int i7, C0095a c0095a, boolean z4, int i8, a aVar) {
        int iW;
        int i9;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str;
        Id3Frame binaryFrame;
        int iT = c0095a.t();
        int iT2 = c0095a.t();
        int iT3 = c0095a.t();
        int iT4 = i7 >= 3 ? c0095a.t() : 0;
        if (i7 == 4) {
            iW = c0095a.w();
            if (!z4) {
                iW = (((iW >> 24) & 255) << 21) | (iW & 255) | (((iW >> 8) & 255) << 7) | (((iW >> 16) & 255) << 14);
            }
        } else {
            iW = i7 == 3 ? c0095a.w() : c0095a.v();
        }
        int i10 = iW;
        int iY = i7 >= 3 ? c0095a.y() : 0;
        if (iT == 0 && iT2 == 0 && iT3 == 0 && iT4 == 0 && i10 == 0 && iY == 0) {
            c0095a.D(c0095a.f1464b);
            return null;
        }
        int i11 = c0095a.f1463a + i10;
        if (i11 > c0095a.f1464b) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            c0095a.D(c0095a.f1464b);
            return null;
        }
        if (aVar != null) {
            i9 = i11;
            if (!aVar.g(i7, iT, iT2, iT3, iT4)) {
                c0095a.D(i9);
                return null;
            }
        } else {
            i9 = i11;
        }
        if (i7 == 3) {
            z7 = (iY & 128) != 0;
            z8 = (iY & 64) != 0;
            z9 = (iY & 32) != 0;
            z11 = z7;
            z10 = false;
        } else {
            if (i7 == 4) {
                z9 = (iY & 64) != 0;
                z7 = (iY & 8) != 0;
                z8 = (iY & 4) != 0;
                z10 = (iY & 2) != 0;
                if ((iY & 1) != 0) {
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
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c0095a.D(i9);
            return null;
        }
        if (z9) {
            i10--;
            c0095a.E(1);
        }
        if (z11) {
            i10 -= 4;
            c0095a.E(4);
        }
        int iA0 = i10;
        if (z10) {
            iA0 = A0(iA0, c0095a);
        }
        int i12 = iA0;
        try {
            try {
                if (iT == 84 && iT2 == 88 && iT3 == 88 && (i7 == 2 || iT4 == 88)) {
                    binaryFrame = s0(i12, c0095a);
                } else if (iT == 84) {
                    binaryFrame = r0(i12, c0095a, x0(i7, iT, iT2, iT3, iT4));
                } else if (iT == 87 && iT2 == 88 && iT3 == 88 && (i7 == 2 || iT4 == 88)) {
                    binaryFrame = u0(i12, c0095a);
                } else if (iT == 87) {
                    binaryFrame = t0(i12, c0095a, x0(i7, iT, iT2, iT3, iT4));
                } else if (iT == 80 && iT2 == 82 && iT3 == 73 && iT4 == 86) {
                    binaryFrame = p0(i12, c0095a);
                } else if (iT == 71 && iT2 == 69 && iT3 == 79 && (iT4 == 66 || i7 == 2)) {
                    binaryFrame = n0(i12, c0095a);
                } else if (i7 == 2) {
                    if (iT == 80 && iT2 == 73 && iT3 == 67) {
                        binaryFrame = i0(c0095a, i12, i7);
                    } else if (iT != 67 && iT2 == 79 && iT3 == 77 && (iT4 == 77 || i7 == 2)) {
                        binaryFrame = l0(i12, c0095a);
                    } else if (iT != 67 && iT2 == 72 && iT3 == 65 && iT4 == 80) {
                        binaryFrame = j0(c0095a, i12, i7, z4, i8, aVar);
                    } else if (iT != 67 && iT2 == 84 && iT3 == 79 && iT4 == 67) {
                        binaryFrame = k0(c0095a, i12, i7, z4, i8, aVar);
                    } else if (iT != 77 && iT2 == 76 && iT3 == 76 && iT4 == 84) {
                        binaryFrame = o0(i12, c0095a);
                    } else {
                        String strX0 = x0(i7, iT, iT2, iT3, iT4);
                        byte[] bArr = new byte[i12];
                        c0095a.f(bArr, 0, i12);
                        binaryFrame = new BinaryFrame(strX0, bArr);
                    }
                } else if (iT == 65 && iT2 == 80 && iT3 == 73 && iT4 == 67) {
                    binaryFrame = i0(c0095a, i12, i7);
                } else if (iT != 67) {
                    if (iT != 67) {
                        if (iT != 67) {
                            if (iT != 77) {
                                String strX1 = x0(i7, iT, iT2, iT3, iT4);
                                byte[] bArr2 = new byte[i12];
                                c0095a.f(bArr2, 0, i12);
                                binaryFrame = new BinaryFrame(strX1, bArr2);
                            } else {
                                String strX2 = x0(i7, iT, iT2, iT3, iT4);
                                byte[] bArr3 = new byte[i12];
                                c0095a.f(bArr3, 0, i12);
                                binaryFrame = new BinaryFrame(strX2, bArr3);
                            }
                        } else if (iT != 77) {
                            String strX3 = x0(i7, iT, iT2, iT3, iT4);
                            byte[] bArr4 = new byte[i12];
                            c0095a.f(bArr4, 0, i12);
                            binaryFrame = new BinaryFrame(strX3, bArr4);
                        } else {
                            String strX4 = x0(i7, iT, iT2, iT3, iT4);
                            byte[] bArr5 = new byte[i12];
                            c0095a.f(bArr5, 0, i12);
                            binaryFrame = new BinaryFrame(strX4, bArr5);
                        }
                    } else if (iT != 67) {
                        if (iT != 77) {
                            String strX5 = x0(i7, iT, iT2, iT3, iT4);
                            byte[] bArr6 = new byte[i12];
                            c0095a.f(bArr6, 0, i12);
                            binaryFrame = new BinaryFrame(strX5, bArr6);
                        } else {
                            String strX6 = x0(i7, iT, iT2, iT3, iT4);
                            byte[] bArr7 = new byte[i12];
                            c0095a.f(bArr7, 0, i12);
                            binaryFrame = new BinaryFrame(strX6, bArr7);
                        }
                    } else if (iT != 77) {
                        String strX7 = x0(i7, iT, iT2, iT3, iT4);
                        byte[] bArr8 = new byte[i12];
                        c0095a.f(bArr8, 0, i12);
                        binaryFrame = new BinaryFrame(strX7, bArr8);
                    } else {
                        String strX8 = x0(i7, iT, iT2, iT3, iT4);
                        byte[] bArr9 = new byte[i12];
                        c0095a.f(bArr9, 0, i12);
                        binaryFrame = new BinaryFrame(strX8, bArr9);
                    }
                } else if (iT != 67) {
                    if (iT != 67) {
                        if (iT != 77) {
                            String strX9 = x0(i7, iT, iT2, iT3, iT4);
                            byte[] bArr10 = new byte[i12];
                            c0095a.f(bArr10, 0, i12);
                            binaryFrame = new BinaryFrame(strX9, bArr10);
                        } else {
                            String strX10 = x0(i7, iT, iT2, iT3, iT4);
                            byte[] bArr11 = new byte[i12];
                            c0095a.f(bArr11, 0, i12);
                            binaryFrame = new BinaryFrame(strX10, bArr11);
                        }
                    } else if (iT != 77) {
                        String strX11 = x0(i7, iT, iT2, iT3, iT4);
                        byte[] bArr12 = new byte[i12];
                        c0095a.f(bArr12, 0, i12);
                        binaryFrame = new BinaryFrame(strX11, bArr12);
                    } else {
                        String strX12 = x0(i7, iT, iT2, iT3, iT4);
                        byte[] bArr13 = new byte[i12];
                        c0095a.f(bArr13, 0, i12);
                        binaryFrame = new BinaryFrame(strX12, bArr13);
                    }
                } else if (iT != 67) {
                    if (iT != 77) {
                        String strX13 = x0(i7, iT, iT2, iT3, iT4);
                        byte[] bArr14 = new byte[i12];
                        c0095a.f(bArr14, 0, i12);
                        binaryFrame = new BinaryFrame(strX13, bArr14);
                    } else {
                        String strX14 = x0(i7, iT, iT2, iT3, iT4);
                        byte[] bArr15 = new byte[i12];
                        c0095a.f(bArr15, 0, i12);
                        binaryFrame = new BinaryFrame(strX14, bArr15);
                    }
                } else if (iT != 77) {
                    String strX15 = x0(i7, iT, iT2, iT3, iT4);
                    byte[] bArr16 = new byte[i12];
                    c0095a.f(bArr16, 0, i12);
                    binaryFrame = new BinaryFrame(strX15, bArr16);
                } else {
                    String strX16 = x0(i7, iT, iT2, iT3, iT4);
                    byte[] bArr17 = new byte[i12];
                    c0095a.f(bArr17, 0, i12);
                    binaryFrame = new BinaryFrame(strX16, bArr17);
                }
                if (binaryFrame == null) {
                    str = r4;
                    try {
                        Log.w(str, "Failed to decode frame: id=" + x0(i7, iT, iT2, iT3, iT4) + ", frameSize=" + i12);
                    } catch (UnsupportedEncodingException unused) {
                        Log.w(str, "Unsupported character encoding");
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
            str = r4;
        }
    }

    public static GeobFrame n0(int i7, C0095a c0095a) {
        int iT = c0095a.t();
        String strW0 = w0(iT);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        int iZ0 = z0(0, bArr);
        String str = new String(bArr, 0, iZ0, "ISO-8859-1");
        int i9 = iZ0 + 1;
        int iY0 = y0(bArr, i9, iT);
        String strQ0 = q0(strW0, bArr, i9, iY0);
        int iV0 = v0(iT) + iY0;
        int iY1 = y0(bArr, iV0, iT);
        String strQ1 = q0(strW0, bArr, iV0, iY1);
        int iV1 = v0(iT) + iY1;
        return new GeobFrame(str, strQ0, strQ1, i8 <= iV1 ? t.f17164f : Arrays.copyOfRange(bArr, iV1, i8));
    }

    public static MlltFrame o0(int i7, C0095a c0095a) {
        int iY = c0095a.y();
        int iV = c0095a.v();
        int iV2 = c0095a.v();
        int iT = c0095a.t();
        int iT2 = c0095a.t();
        x xVar = new x();
        xVar.n(c0095a.f1464b, (byte[]) c0095a.f1465c);
        xVar.o(c0095a.f1463a * 8);
        int i8 = ((i7 - 10) * 8) / (iT + iT2);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = xVar.i(iT);
            int i11 = xVar.i(iT2);
            iArr[i9] = i10;
            iArr2[i9] = i11;
        }
        return new MlltFrame(iY, iV, iV2, iArr, iArr2);
    }

    public static PrivFrame p0(int i7, C0095a c0095a) {
        byte[] bArr = new byte[i7];
        c0095a.f(bArr, 0, i7);
        int iZ0 = z0(0, bArr);
        String str = new String(bArr, 0, iZ0, "ISO-8859-1");
        int i8 = iZ0 + 1;
        return new PrivFrame(str, i7 <= i8 ? t.f17164f : Arrays.copyOfRange(bArr, i8, i7));
    }

    public static String q0(String str, byte[] bArr, int i7, int i8) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, str);
    }

    public static TextInformationFrame r0(int i7, C0095a c0095a, String str) {
        if (i7 < 1) {
            return null;
        }
        int iT = c0095a.t();
        String strW0 = w0(iT);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        return new TextInformationFrame(str, null, new String(bArr, 0, y0(bArr, 0, iT), strW0));
    }

    public static TextInformationFrame s0(int i7, C0095a c0095a) {
        if (i7 < 1) {
            return null;
        }
        int iT = c0095a.t();
        String strW0 = w0(iT);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        int iY0 = y0(bArr, 0, iT);
        String str = new String(bArr, 0, iY0, strW0);
        int iV0 = v0(iT) + iY0;
        return new TextInformationFrame("TXXX", str, q0(strW0, bArr, iV0, y0(bArr, iV0, iT)));
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
        int iT = c0095a.t();
        String strW0 = w0(iT);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        c0095a.f(bArr, 0, i8);
        int iY0 = y0(bArr, 0, iT);
        String str = new String(bArr, 0, iY0, strW0);
        int iV0 = v0(iT) + iY0;
        return new UrlLinkFrame("WXXX", str, q0("ISO-8859-1", bArr, iV0, z0(iV0, bArr)));
    }

    public static int v0(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static String w0(int i7) {
        if (i7 == 1) {
            return "UTF-16";
        }
        if (i7 != 2) {
            return i7 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    public static String x0(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int y0(byte[] bArr, int i7, int i8) {
        int iZ0 = z0(i7, bArr);
        if (i8 == 0 || i8 == 3) {
            return iZ0;
        }
        while (iZ0 < bArr.length - 1) {
            if ((iZ0 - i7) % 2 == 0 && bArr[iZ0 + 1] == 0) {
                return iZ0;
            }
            iZ0 = z0(iZ0 + 1, bArr);
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

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final Metadata h0(int i7, byte[] bArr) {
        boolean z4;
        b bVar;
        int i8;
        int i9;
        boolean z7;
        int iA0;
        Id3Frame id3FrameM0;
        ArrayList arrayList = new ArrayList();
        C0095a c0095a = new C0095a(bArr, i7);
        boolean z8 = false;
        if (c0095a.d() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iV = c0095a.v();
            if (iV == 4801587) {
                int iT = c0095a.t();
                c0095a.E(1);
                int iT2 = c0095a.t();
                int iS = c0095a.s();
                if (iT != 2) {
                    if (iT == 3) {
                        if ((iT2 & 64) != 0) {
                            int iG = c0095a.g();
                            c0095a.E(iG);
                            iS -= iG + 4;
                        }
                    } else if (iT == 4) {
                        if ((iT2 & 64) != 0) {
                            int iS2 = c0095a.s();
                            c0095a.E(iS2 - 4);
                            iS -= iS2;
                        }
                        if ((iT2 & 16) != 0) {
                            iS -= 10;
                        }
                    } else {
                        p150v0.a.j(iT, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iT < 4) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    bVar = new b(iT, z4, iS);
                } else if ((iT2 & 64) != 0) {
                    Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iT < 4 || (iT2 & 128) == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    bVar = new b(iT, z4, iS);
                }
                if (bVar == null) {
                    return null;
                }
                int i10 = c0095a.f1463a;
                i8 = bVar.f7460a;
                i9 = i8 == 2 ? 6 : 10;
                z7 = bVar.f7461b;
                iA0 = bVar.f7462c;
                if (z7) {
                    iA0 = A0(iA0, c0095a);
                }
                c0095a.C(i10 + iA0);
                if (!B0(c0095a, i8, i9, false)) {
                    if (i8 == 4 || !B0(c0095a, 4, i9, true)) {
                        p150v0.a.j(i8, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z8 = true;
                }
                while (c0095a.d() >= i9) {
                    id3FrameM0 = m0(i8, c0095a, z8, i9, this.f7464g);
                    if (id3FrameM0 != null) {
                        arrayList.add(id3FrameM0);
                    }
                }
                return new Metadata(arrayList);
            }
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iV))));
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        int i11 = c0095a.f1463a;
        i8 = bVar.f7460a;
        if (i8 == 2) {
        }
        z7 = bVar.f7461b;
        iA0 = bVar.f7462c;
        if (z7) {
            iA0 = A0(iA0, c0095a);
        }
        c0095a.C(i11 + iA0);
        if (!B0(c0095a, i8, i9, false)) {
            if (i8 == 4) {
            }
            p150v0.a.j(i8, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (c0095a.d() >= i9) {
            id3FrameM0 = m0(i8, c0095a, z8, i9, this.f7464g);
            if (id3FrameM0 != null) {
                arrayList.add(id3FrameM0);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // p097n3.a
    public final Metadata o(S1.c cVar, ByteBuffer byteBuffer) {
        return h0(byteBuffer.limit(), byteBuffer.array());
    }
}
