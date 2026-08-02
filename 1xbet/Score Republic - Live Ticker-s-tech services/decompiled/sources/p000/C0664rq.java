package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: rq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0664rq implements fc0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6939a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final byte[] f6940b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    public static final int[] f6941c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: g */
    public static int m4396g(InterfaceC0627qq interfaceC0627qq, nk0 nk0Var) {
        try {
            int iMo616l = interfaceC0627qq.mo616l();
            if ((iMo616l & 65496) == 65496 || iMo616l == 19789 || iMo616l == 18761) {
                int iM4400k = m4400k(interfaceC0627qq, 225);
                if (iM4400k != -1) {
                    byte[] bArr = (byte[]) nk0Var.m3543c(iM4400k, byte[].class);
                    try {
                        return m4401l(interfaceC0627qq, bArr, iM4400k);
                    } finally {
                        nk0Var.m3547g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo616l);
                return -1;
            }
        } catch (C0590pq unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static ImageHeaderParser$ImageType m4397h(InterfaceC0627qq interfaceC0627qq) {
        try {
            int iMo616l = interfaceC0627qq.mo616l();
            if (iMo616l == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo612g = (iMo616l << 8) | interfaceC0627qq.mo612g();
            if (iMo612g == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo612g2 = (iMo612g << 8) | interfaceC0627qq.mo612g();
            if (iMo612g2 == -1991225785) {
                interfaceC0627qq.skip(21L);
                try {
                    return interfaceC0627qq.mo612g() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0590pq unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo612g2 == 1380533830) {
                interfaceC0627qq.skip(4L);
                if (((interfaceC0627qq.mo616l() << 16) | interfaceC0627qq.mo616l()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo616l2 = (interfaceC0627qq.mo616l() << 16) | interfaceC0627qq.mo616l();
                if ((iMo616l2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo616l2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    interfaceC0627qq.skip(4L);
                    return (interfaceC0627qq.mo612g() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC0627qq.skip(4L);
                short sMo612g = interfaceC0627qq.mo612g();
                if ((sMo612g & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sMo612g & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC0627qq.mo616l() << 16) | interfaceC0627qq.mo616l()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo616l3 = (interfaceC0627qq.mo616l() << 16) | interfaceC0627qq.mo616l();
            if (iMo616l3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo616l3 == 1635150182;
            interfaceC0627qq.skip(4L);
            int i3 = iMo612g2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo616l4 = (interfaceC0627qq.mo616l() << 16) | interfaceC0627qq.mo616l();
                    if (iMo616l4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo616l4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0590pq unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4398i(InterfaceC0627qq interfaceC0627qq, nk0 nk0Var) {
        boolean zM4399j;
        if (m4397h(interfaceC0627qq) == ImageHeaderParser$ImageType.JPEG) {
            int iM4400k = m4400k(interfaceC0627qq, 226);
            while (iM4400k > 0) {
                byte[] bArr = (byte[]) nk0Var.m3543c(iM4400k, byte[].class);
                try {
                    int iMo619o = interfaceC0627qq.mo619o(iM4400k, bArr);
                    if (iMo619o != iM4400k) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM4400k + ", actually read: " + iMo619o);
                        }
                        zM4399j = false;
                    } else {
                        zM4399j = m4399j(bArr, iM4400k, f6940b);
                    }
                    if (zM4399j) {
                        nk0Var.m3547g(bArr);
                        return true;
                    }
                    nk0Var.m3547g(bArr);
                    iM4400k = m4400k(interfaceC0627qq, 226);
                } catch (Throwable th) {
                    nk0Var.m3547g(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4399j(byte[] bArr, int i, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public static int m4400k(InterfaceC0627qq interfaceC0627qq, int i) {
        short sMo612g;
        int iMo616l;
        long j;
        long jSkip;
        do {
            short sMo612g2 = interfaceC0627qq.mo612g();
            if (sMo612g2 == 255) {
                sMo612g = interfaceC0627qq.mo612g();
                if (sMo612g != 218) {
                    if (sMo612g != 217) {
                        iMo616l = interfaceC0627qq.mo616l() - 2;
                        if (sMo612g == i) {
                            return iMo616l;
                        }
                        j = iMo616l;
                        jSkip = interfaceC0627qq.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo612g2));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo612g) + ", wanted to skip: " + iMo616l + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m4401l(InterfaceC0627qq interfaceC0627qq, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo619o = interfaceC0627qq.mo619o(i, bArr);
        if (iMo619o != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo619o);
                return -1;
            }
        } else if (m4399j(bArr, i, f6939a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s != 18761) {
                if (s != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i2 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i3 = i2 + 6;
            short s2 = byteBuffer.remaining() - i3 >= 2 ? byteBuffer.getShort(i3) : (short) -1;
            for (int i4 = 0; i4 < s2; i4++) {
                int i5 = (i4 * 12) + i2 + 8;
                short s3 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
                if (s3 == 274) {
                    int i6 = i5 + 2;
                    short s4 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                    if (s4 >= 1 && s4 <= 12) {
                        int i7 = i5 + 4;
                        int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                        if (i8 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i4 + " tagType=" + ((int) s3) + " formatCode=" + ((int) s4) + " componentCount=" + i8);
                            }
                            int i9 = i8 + f6941c[s4];
                            if (i9 <= 4) {
                                int i10 = i5 + 8;
                                if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                    if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i10 >= 2) {
                                            return byteBuffer.getShort(i10);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) s3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s4));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s4));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo1765a(ByteBuffer byteBuffer) {
        o80.m3647h(byteBuffer, "Argument must not be null");
        return m4397h(new C0319id(byteBuffer, 1));
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: b */
    public final int mo1766b(InputStream inputStream, nk0 nk0Var) {
        b90 b90Var = new b90(17, inputStream);
        o80.m3647h(nk0Var, "Argument must not be null");
        return m4396g(b90Var, nk0Var);
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: c */
    public final boolean mo1767c(ByteBuffer byteBuffer, nk0 nk0Var) {
        C0319id c0319id = new C0319id(byteBuffer, 1);
        o80.m3647h(nk0Var, "Argument must not be null");
        return m4398i(c0319id, nk0Var);
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: d */
    public final int mo1768d(ByteBuffer byteBuffer, nk0 nk0Var) {
        C0319id c0319id = new C0319id(byteBuffer, 1);
        o80.m3647h(nk0Var, "Argument must not be null");
        return m4396g(c0319id, nk0Var);
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: e */
    public final boolean mo1769e(InputStream inputStream, nk0 nk0Var) {
        o80.m3647h(inputStream, "Argument must not be null");
        b90 b90Var = new b90(17, inputStream);
        o80.m3647h(nk0Var, "Argument must not be null");
        return m4398i(b90Var, nk0Var);
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo1770f(InputStream inputStream) {
        return m4397h(new b90(17, inputStream));
    }
}
