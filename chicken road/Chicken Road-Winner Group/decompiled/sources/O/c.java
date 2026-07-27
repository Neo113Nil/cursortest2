package O;

import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1013b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1014c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1015d;

    public c(byte[] bArr, int i3, int i4) {
        this(-1L, bArr, i3, i4);
    }

    public static c a(long j3, ByteOrder byteOrder) {
        long[] jArr = {j3};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1025D[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1025D[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f1020a);
        wrap.putInt((int) eVar2.f1021b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i3, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1025D[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i3}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g3 = g(byteOrder);
        if (g3 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g3 instanceof String) {
            return Double.parseDouble((String) g3);
        }
        if (g3 instanceof long[]) {
            if (((long[]) g3).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g3 instanceof int[]) {
            if (((int[]) g3).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g3 instanceof double[]) {
            double[] dArr = (double[]) g3;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g3 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g3;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f1020a / eVar.f1021b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g3 = g(byteOrder);
        if (g3 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g3 instanceof String) {
            return Integer.parseInt((String) g3);
        }
        if (g3 instanceof long[]) {
            long[] jArr = (long[]) g3;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g3 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g3;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g3 = g(byteOrder);
        if (g3 == null) {
            return null;
        }
        if (g3 instanceof String) {
            return (String) g3;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (g3 instanceof long[]) {
            long[] jArr = (long[]) g3;
            while (i3 < jArr.length) {
                sb.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (g3 instanceof int[]) {
            int[] iArr = (int[]) g3;
            while (i3 < iArr.length) {
                sb.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (g3 instanceof double[]) {
            double[] dArr = (double[]) g3;
            while (i3 < dArr.length) {
                sb.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (!(g3 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g3;
        while (i3 < eVarArr.length) {
            sb.append(eVarArr[i3].f1020a);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(eVarArr[i3].f1021b);
            i3++;
            if (i3 != eVarArr.length) {
                sb.append(StringUtils.COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:162:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [O.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [O.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        b bVar;
        InputStream inputStream;
        byte b3;
        String sb;
        int i3 = 0;
        byte[] bArr = this.f1015d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.f1009c = byteOrder;
                        int i4 = this.f1012a;
                        int i5 = this.f1013b;
                        switch (i4) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b3 = bArr[0]) < 0 || b3 > 1) {
                                    String str = new String(bArr, g.f1033M);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e3) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b3 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i5 >= g.f1026E.length) {
                                    int i6 = 0;
                                    while (true) {
                                        byte[] bArr2 = g.f1026E;
                                        if (i6 >= bArr2.length) {
                                            i3 = bArr2.length;
                                        } else if (bArr[i6] == bArr2[i6]) {
                                            i6++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    while (i3 < i5) {
                                        byte b4 = bArr[i3];
                                        if (b4 == 0) {
                                            sb = sb2.toString();
                                            bVar.close();
                                            return sb;
                                        }
                                        if (b4 >= 32) {
                                            sb2.append((char) b4);
                                        } else {
                                            sb2.append('?');
                                        }
                                        i3++;
                                    }
                                    bVar.close();
                                    return sb;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return sb;
                                }
                                sb = sb2.toString();
                            case 3:
                                ?? r15 = new int[i5];
                                while (i3 < i5) {
                                    r15[i3] = bVar.readUnsignedShort();
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r15;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                    return r15;
                                }
                            case 4:
                                ?? r152 = new long[i5];
                                while (i3 < i5) {
                                    r152[i3] = bVar.readInt() & 4294967295L;
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r152;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return r152;
                                }
                            case 5:
                                ?? r153 = new e[i5];
                                while (i3 < i5) {
                                    r153[i3] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r153;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                    return r153;
                                }
                            case 8:
                                ?? r154 = new int[i5];
                                while (i3 < i5) {
                                    r154[i3] = bVar.readShort();
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r154;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return r154;
                                }
                            case 9:
                                ?? r155 = new int[i5];
                                while (i3 < i5) {
                                    r155[i3] = bVar.readInt();
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r155;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return r155;
                                }
                            case 10:
                                ?? r156 = new e[i5];
                                while (i3 < i5) {
                                    r156[i3] = new e(bVar.readInt(), bVar.readInt());
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r156;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return r156;
                                }
                            case 11:
                                ?? r157 = new double[i5];
                                while (i3 < i5) {
                                    r157[i3] = bVar.readFloat();
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r157;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r157;
                                }
                            case 12:
                                ?? r158 = new double[i5];
                                while (i3 < i5) {
                                    r158[i3] = bVar.readDouble();
                                    i3++;
                                }
                                try {
                                    bVar.close();
                                    return r158;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r158;
                                }
                            default:
                                bVar.close();
                                return null;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            bVar.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        } catch (IOException e17) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
        }
    }

    public final String toString() {
        return "(" + g.f1024C[this.f1012a] + ", data length:" + this.f1015d.length + ")";
    }

    public c(long j3, byte[] bArr, int i3, int i4) {
        this.f1012a = i3;
        this.f1013b = i4;
        this.f1014c = j3;
        this.f1015d = bArr;
    }
}
