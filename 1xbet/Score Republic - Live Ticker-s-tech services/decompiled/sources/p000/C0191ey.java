package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: ey */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0191ey {

    /* JADX INFO: renamed from: a */
    public final int f2203a;

    /* JADX INFO: renamed from: b */
    public final int f2204b;

    /* JADX INFO: renamed from: c */
    public final long f2205c;

    /* JADX INFO: renamed from: d */
    public final byte[] f2206d;

    public C0191ey(long j, byte[] bArr, int i, int i2) {
        this.f2203a = i;
        this.f2204b = i2;
        this.f2205c = j;
        this.f2206d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C0191ey m1518a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0339iy.f3699C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C0191ey(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C0191ey m1519b(C0266gy c0266gy, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0339iy.f3699C[5]]);
        byteBufferWrap.order(byteOrder);
        C0266gy c0266gy2 = new C0266gy[]{c0266gy}[0];
        byteBufferWrap.putInt((int) c0266gy2.f2959a);
        byteBufferWrap.putInt((int) c0266gy2.f2960b);
        return new C0191ey(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static C0191ey m1520c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0339iy.f3699C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C0191ey(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m1521d(ByteOrder byteOrder) throws Throwable {
        Object objM1524g = m1524g(byteOrder);
        if (objM1524g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM1524g instanceof String) {
            return Double.parseDouble((String) objM1524g);
        }
        if (objM1524g instanceof long[]) {
            long[] jArr = (long[]) objM1524g;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM1524g instanceof int[]) {
            int[] iArr = (int[]) objM1524g;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM1524g instanceof double[]) {
            double[] dArr = (double[]) objM1524g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM1524g instanceof C0266gy[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0266gy[] c0266gyArr = (C0266gy[]) objM1524g;
        if (c0266gyArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0266gy c0266gy = c0266gyArr[0];
        return c0266gy.f2959a / c0266gy.f2960b;
    }

    /* JADX INFO: renamed from: e */
    public final int m1522e(ByteOrder byteOrder) throws Throwable {
        Object objM1524g = m1524g(byteOrder);
        if (objM1524g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM1524g instanceof String) {
            return Integer.parseInt((String) objM1524g);
        }
        if (objM1524g instanceof long[]) {
            long[] jArr = (long[]) objM1524g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM1524g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM1524g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m1523f(ByteOrder byteOrder) throws Throwable {
        Object objM1524g = m1524g(byteOrder);
        if (objM1524g == null) {
            return null;
        }
        if (objM1524g instanceof String) {
            return (String) objM1524g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM1524g instanceof long[]) {
            long[] jArr = (long[]) objM1524g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM1524g instanceof int[]) {
            int[] iArr = (int[]) objM1524g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM1524g instanceof double[]) {
            double[] dArr = (double[]) objM1524g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM1524g instanceof C0266gy[])) {
            return null;
        }
        C0266gy[] c0266gyArr = (C0266gy[]) objM1524g;
        while (i < c0266gyArr.length) {
            sb.append(c0266gyArr[i].f2959a);
            sb.append('/');
            sb.append(c0266gyArr[i].f2960b);
            i++;
            if (i != c0266gyArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [gy[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [gy[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: g */
    public final Serializable m1524g(ByteOrder byteOrder) throws Throwable {
        C0154dy c0154dy;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.f2206d;
        InputStream inputStream2 = null;
        try {
            try {
                c0154dy = new C0154dy(bArr);
                try {
                    c0154dy.f1881k = byteOrder;
                    int i = this.f2203a;
                    int length = 0;
                    int i2 = this.f2204b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, C0339iy.f3708L);
                                try {
                                    c0154dy.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c0154dy.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= C0339iy.f3700D.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C0339iy.f3700D;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    c0154dy.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            c0154dy.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c0154dy.readUnsignedShort();
                                length++;
                            }
                            try {
                                c0154dy.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) c0154dy.readInt()) & 4294967295L;
                                length++;
                            }
                            c0154dy.close();
                            return r13;
                        case 5:
                            r13 = new C0266gy[i2];
                            while (length < i2) {
                                r13[length] = new C0266gy(((long) c0154dy.readInt()) & 4294967295L, ((long) c0154dy.readInt()) & 4294967295L);
                                length++;
                            }
                            c0154dy.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c0154dy.readShort();
                                length++;
                            }
                            c0154dy.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c0154dy.readInt();
                                length++;
                            }
                            c0154dy.close();
                            return r13;
                        case 10:
                            r13 = new C0266gy[i2];
                            while (length < i2) {
                                r13[length] = new C0266gy(c0154dy.readInt(), c0154dy.readInt());
                                length++;
                            }
                            c0154dy.close();
                            return r13;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c0154dy.readFloat();
                                length++;
                            }
                            c0154dy.close();
                            return r13;
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c0154dy.readDouble();
                                length++;
                            }
                            c0154dy.close();
                            return r13;
                        default:
                            try {
                                c0154dy.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c0154dy != null) {
                        try {
                            c0154dy.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e7) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            c0154dy = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + C0339iy.f3698B[this.f2203a] + ", data length:" + this.f2206d.length + ")";
    }

    public C0191ey(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
