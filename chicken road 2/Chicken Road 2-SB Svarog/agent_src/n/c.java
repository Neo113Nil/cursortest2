package n;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f967b;

    /* renamed from: c, reason: collision with root package name */
    public final long f968c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f969d;

    public c(byte[] bArr, int i2, int i3) {
        this(-1L, bArr, i2, i3);
    }

    public static c a(long j2, ByteOrder byteOrder) {
        long[] jArr = {j2};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f977C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f977C[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f974a);
        wrap.putInt((int) eVar2.f975b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i2, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f977C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i2}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g2 = g(byteOrder);
        if (g2 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g2 instanceof String) {
            return Double.parseDouble((String) g2);
        }
        if (g2 instanceof long[]) {
            if (((long[]) g2).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g2 instanceof int[]) {
            if (((int[]) g2).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g2 instanceof double[]) {
            double[] dArr = (double[]) g2;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g2 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g2;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f974a / eVar.f975b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g2 = g(byteOrder);
        if (g2 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g2 instanceof String) {
            return Integer.parseInt((String) g2);
        }
        if (g2 instanceof long[]) {
            long[] jArr = (long[]) g2;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g2 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g2;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g2 = g(byteOrder);
        if (g2 == null) {
            return null;
        }
        if (g2 instanceof String) {
            return (String) g2;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (g2 instanceof long[]) {
            long[] jArr = (long[]) g2;
            while (i2 < jArr.length) {
                sb.append(jArr[i2]);
                i2++;
                if (i2 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g2 instanceof int[]) {
            int[] iArr = (int[]) g2;
            while (i2 < iArr.length) {
                sb.append(iArr[i2]);
                i2++;
                if (i2 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g2 instanceof double[]) {
            double[] dArr = (double[]) g2;
            while (i2 < dArr.length) {
                sb.append(dArr[i2]);
                i2++;
                if (i2 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g2 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g2;
        while (i2 < eVarArr.length) {
            sb.append(eVarArr[i2].f974a);
            sb.append('/');
            sb.append(eVarArr[i2].f975b);
            i2++;
            if (i2 != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [n.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [n.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        b bVar;
        InputStream inputStream;
        ?? str;
        byte b2;
        byte[] bArr = this.f969d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f963d = byteOrder;
                    int i2 = this.f966a;
                    int i3 = 0;
                    int i4 = this.f967b;
                    switch (i2) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b2 = bArr[0]) >= 0 && b2 <= 1) {
                                String str2 = new String(new char[]{(char) (b2 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                    return str2;
                                }
                            }
                            str = new String(bArr, g.L);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i4 >= g.f978D.length) {
                                int i5 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f978D;
                                    if (i5 >= bArr2.length) {
                                        i3 = bArr2.length;
                                    } else if (bArr[i5] == bArr2[i5]) {
                                        i5++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i3 < i4) {
                                byte b3 = bArr[i3];
                                if (b3 == 0) {
                                    str = sb.toString();
                                    break;
                                } else {
                                    if (b3 >= 32) {
                                        sb.append((char) b3);
                                    } else {
                                        sb.append('?');
                                    }
                                    i3++;
                                }
                            }
                            str = sb.toString();
                        case 3:
                            str = new int[i4];
                            while (i3 < i4) {
                                str[i3] = bVar.readUnsignedShort();
                                i3++;
                            }
                        case 4:
                            str = new long[i4];
                            while (i3 < i4) {
                                str[i3] = bVar.readInt() & 4294967295L;
                                i3++;
                            }
                        case 5:
                            str = new e[i4];
                            while (i3 < i4) {
                                str[i3] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i3++;
                            }
                        case 8:
                            str = new int[i4];
                            while (i3 < i4) {
                                str[i3] = bVar.readShort();
                                i3++;
                            }
                        case 9:
                            str = new int[i4];
                            while (i3 < i4) {
                                str[i3] = bVar.readInt();
                                i3++;
                            }
                        case 10:
                            str = new e[i4];
                            while (i3 < i4) {
                                str[i3] = new e(bVar.readInt(), bVar.readInt());
                                i3++;
                            }
                        case 11:
                            str = new double[i4];
                            while (i3 < i4) {
                                str[i3] = bVar.readFloat();
                                i3++;
                            }
                        case 12:
                            str = new double[i4];
                            while (i3 < i4) {
                                str[i3] = bVar.readDouble();
                                i3++;
                            }
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e4) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                        return str;
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
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
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + g.B[this.f966a] + ", data length:" + this.f969d.length + ")";
    }

    public c(long j2, byte[] bArr, int i2, int i3) {
        this.f966a = i2;
        this.f967b = i3;
        this.f968c = j2;
        this.f969d = bArr;
    }
}
