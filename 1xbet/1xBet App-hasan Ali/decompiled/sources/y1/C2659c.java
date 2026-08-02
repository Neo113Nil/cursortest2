package y1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2659c {

    /* renamed from: a, reason: collision with root package name */
    public final int f21142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21143b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21144c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f21145d;

    public C2659c(byte[] bArr, int i, int i5) {
        this(-1L, bArr, i, i5);
    }

    public static C2659c a(long j5, ByteOrder byteOrder) {
        long[] jArr = {j5};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f21154C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C2659c(wrap.array(), 4, 1);
    }

    public static C2659c b(C2661e c2661e, ByteOrder byteOrder) {
        C2661e[] c2661eArr = {c2661e};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f21154C[5]]);
        wrap.order(byteOrder);
        C2661e c2661e2 = c2661eArr[0];
        wrap.putInt((int) c2661e2.f21150a);
        wrap.putInt((int) c2661e2.f21151b);
        return new C2659c(wrap.array(), 5, 1);
    }

    public static C2659c c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f21154C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new C2659c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g5 = g(byteOrder);
        if (g5 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g5 instanceof String) {
            return Double.parseDouble((String) g5);
        }
        if (g5 instanceof long[]) {
            if (((long[]) g5).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g5 instanceof int[]) {
            if (((int[]) g5).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g5 instanceof double[]) {
            double[] dArr = (double[]) g5;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g5 instanceof C2661e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C2661e[] c2661eArr = (C2661e[]) g5;
        if (c2661eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C2661e c2661e = c2661eArr[0];
        return c2661e.f21150a / c2661e.f21151b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g5 = g(byteOrder);
        if (g5 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g5 instanceof String) {
            return Integer.parseInt((String) g5);
        }
        if (g5 instanceof long[]) {
            long[] jArr = (long[]) g5;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g5 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g5;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g5 = g(byteOrder);
        if (g5 == null) {
            return null;
        }
        if (g5 instanceof String) {
            return (String) g5;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g5 instanceof long[]) {
            long[] jArr = (long[]) g5;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g5 instanceof int[]) {
            int[] iArr = (int[]) g5;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g5 instanceof double[]) {
            double[] dArr = (double[]) g5;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g5 instanceof C2661e[])) {
            return null;
        }
        C2661e[] c2661eArr = (C2661e[]) g5;
        while (i < c2661eArr.length) {
            sb.append(c2661eArr[i].f21150a);
            sb.append('/');
            sb.append(c2661eArr[i].f21151b);
            i++;
            if (i != c2661eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:162:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, y1.e[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.io.Serializable, y1.e[]] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        C2658b c2658b;
        InputStream inputStream;
        byte b3;
        String sb;
        int i = 0;
        byte[] bArr = this.f21145d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    c2658b = new C2658b(bArr);
                    try {
                        c2658b.f21139m = byteOrder;
                        int i5 = this.f21142a;
                        int i6 = this.f21143b;
                        switch (i5) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b3 = bArr[0]) < 0 || b3 > 1) {
                                    String str = new String(bArr, g.f21161L);
                                    try {
                                        c2658b.close();
                                        return str;
                                    } catch (IOException e3) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b3 + 48)});
                                try {
                                    c2658b.close();
                                    return str2;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i6 >= g.f21155D.length) {
                                    int i7 = 0;
                                    while (true) {
                                        byte[] bArr2 = g.f21155D;
                                        if (i7 >= bArr2.length) {
                                            i = bArr2.length;
                                        } else if (bArr[i7] == bArr2[i7]) {
                                            i7++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    while (i < i6) {
                                        byte b5 = bArr[i];
                                        if (b5 == 0) {
                                            sb = sb2.toString();
                                            c2658b.close();
                                            return sb;
                                        }
                                        if (b5 >= 32) {
                                            sb2.append((char) b5);
                                        } else {
                                            sb2.append('?');
                                        }
                                        i++;
                                    }
                                    c2658b.close();
                                    return sb;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                    return sb;
                                }
                                sb = sb2.toString();
                            case 3:
                                ?? r15 = new int[i6];
                                while (i < i6) {
                                    r15[i] = c2658b.readUnsignedShort();
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r15;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return r15;
                                }
                            case 4:
                                ?? r152 = new long[i6];
                                while (i < i6) {
                                    r152[i] = c2658b.readInt() & 4294967295L;
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r152;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                    return r152;
                                }
                            case 5:
                                ?? r153 = new C2661e[i6];
                                while (i < i6) {
                                    r153[i] = new C2661e(c2658b.readInt() & 4294967295L, c2658b.readInt() & 4294967295L);
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r153;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return r153;
                                }
                            case 8:
                                ?? r154 = new int[i6];
                                while (i < i6) {
                                    r154[i] = c2658b.readShort();
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r154;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return r154;
                                }
                            case 9:
                                ?? r155 = new int[i6];
                                while (i < i6) {
                                    r155[i] = c2658b.readInt();
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r155;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return r155;
                                }
                            case 10:
                                ?? r156 = new C2661e[i6];
                                while (i < i6) {
                                    r156[i] = new C2661e(c2658b.readInt(), c2658b.readInt());
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r156;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r156;
                                }
                            case 11:
                                ?? r157 = new double[i6];
                                while (i < i6) {
                                    r157[i] = c2658b.readFloat();
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r157;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r157;
                                }
                            case 12:
                                ?? r158 = new double[i6];
                                while (i < i6) {
                                    r158[i] = c2658b.readDouble();
                                    i++;
                                }
                                try {
                                    c2658b.close();
                                    return r158;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return r158;
                                }
                            default:
                                c2658b.close();
                                return null;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (c2658b != null) {
                            c2658b.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e16) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                        }
                    }
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
                c2658b = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        } catch (IOException e18) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f21153B[this.f21142a]);
        sb.append(", data length:");
        return L1.a.o(sb, this.f21145d.length, ")");
    }

    public C2659c(long j5, byte[] bArr, int i, int i5) {
        this.f21142a = i;
        this.f21143b = i5;
        this.f21144c = j5;
        this.f21145d = bArr;
    }
}
