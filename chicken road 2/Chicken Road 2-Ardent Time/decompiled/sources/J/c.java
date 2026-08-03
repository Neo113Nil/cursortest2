package J;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f881b;

    /* renamed from: c, reason: collision with root package name */
    public final long f882c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f883d;

    public c(byte[] bArr, int i2, int i3) {
        this(-1L, bArr, i2, i3);
    }

    public static J.c a(long j2, java.nio.ByteOrder byteOrder) {
        long[] jArr = {j2};
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[J.g.f893D[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new J.c(wrap.array(), 4, 1);
    }

    public static J.c b(J.e eVar, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[J.g.f893D[5]]);
        wrap.order(byteOrder);
        J.e eVar2 = new J.e[]{eVar}[0];
        wrap.putInt((int) eVar2.f888a);
        wrap.putInt((int) eVar2.f889b);
        return new J.c(wrap.array(), 5, 1);
    }

    public static J.c c(int i2, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[J.g.f893D[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i2}[0]);
        return new J.c(wrap.array(), 3, 1);
    }

    public final double d(java.nio.ByteOrder byteOrder) {
        java.lang.Object g2 = g(byteOrder);
        if (g2 == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
        }
        if (g2 instanceof java.lang.String) {
            return java.lang.Double.parseDouble((java.lang.String) g2);
        }
        if (g2 instanceof long[]) {
            if (((long[]) g2).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (g2 instanceof int[]) {
            if (((int[]) g2).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (g2 instanceof double[]) {
            double[] dArr = (double[]) g2;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(g2 instanceof J.e[])) {
            throw new java.lang.NumberFormatException("Couldn't find a double value");
        }
        J.e[] eVarArr = (J.e[]) g2;
        if (eVarArr.length != 1) {
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        J.e eVar = eVarArr[0];
        return eVar.f888a / eVar.f889b;
    }

    public final int e(java.nio.ByteOrder byteOrder) {
        java.lang.Object g2 = g(byteOrder);
        if (g2 == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g2 instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) g2);
        }
        if (g2 instanceof long[]) {
            long[] jArr = (long[]) g2;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(g2 instanceof int[])) {
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g2;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    public final java.lang.String f(java.nio.ByteOrder byteOrder) {
        java.lang.Object g2 = g(byteOrder);
        if (g2 == null) {
            return null;
        }
        if (g2 instanceof java.lang.String) {
            return (java.lang.String) g2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = 0;
        if (g2 instanceof long[]) {
            long[] jArr = (long[]) g2;
            while (i2 < jArr.length) {
                sb.append(jArr[i2]);
                i2++;
                if (i2 != jArr.length) {
                    sb.append(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA);
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
                    sb.append(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA);
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
                    sb.append(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (!(g2 instanceof J.e[])) {
            return null;
        }
        J.e[] eVarArr = (J.e[]) g2;
        while (i2 < eVarArr.length) {
            sb.append(eVarArr[i2].f888a);
            sb.append('/');
            sb.append(eVarArr[i2].f889b);
            i2++;
            if (i2 != eVarArr.length) {
                sb.append(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:158:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [J.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [J.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.Serializable g(java.nio.ByteOrder byteOrder) {
        J.b bVar;
        java.io.InputStream inputStream;
        byte b2;
        int i2 = 0;
        byte[] bArr = this.f883d;
        java.io.InputStream inputStream2 = null;
        try {
            try {
                bVar = new J.b(bArr);
                try {
                    bVar.f877c = byteOrder;
                    int i3 = this.f880a;
                    int i4 = this.f881b;
                    switch (i3) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                java.lang.String str = new java.lang.String(bArr, J.g.f901M);
                                try {
                                    bVar.close();
                                } catch (java.io.IOException e2) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str;
                            }
                            java.lang.String str2 = new java.lang.String(new char[]{(char) (b2 + 48)});
                            try {
                                bVar.close();
                            } catch (java.io.IOException e3) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i4 >= J.g.f894E.length) {
                                int i5 = 0;
                                while (true) {
                                    byte[] bArr2 = J.g.f894E;
                                    if (i5 >= bArr2.length) {
                                        i2 = bArr2.length;
                                    } else if (bArr[i5] == bArr2[i5]) {
                                        i5++;
                                    }
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            while (i2 < i4) {
                                byte b3 = bArr[i2];
                                if (b3 == 0) {
                                    java.lang.String sb2 = sb.toString();
                                    bVar.close();
                                    return sb2;
                                }
                                if (b3 >= 32) {
                                    sb.append((char) b3);
                                } else {
                                    sb.append('?');
                                }
                                i2++;
                            }
                            java.lang.String sb22 = sb.toString();
                            bVar.close();
                            return sb22;
                        case 3:
                            ?? r15 = new int[i4];
                            while (i2 < i4) {
                                r15[i2] = bVar.readUnsignedShort();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e4) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                            }
                            return r15;
                        case 4:
                            ?? r152 = new long[i4];
                            while (i2 < i4) {
                                r152[i2] = bVar.readInt() & 4294967295L;
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e5) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                            }
                            return r152;
                        case 5:
                            ?? r153 = new J.e[i4];
                            while (i2 < i4) {
                                r153[i2] = new J.e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e6) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                            return r153;
                        case 8:
                            ?? r154 = new int[i4];
                            while (i2 < i4) {
                                r154[i2] = bVar.readShort();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e7) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                            }
                            return r154;
                        case 9:
                            ?? r155 = new int[i4];
                            while (i2 < i4) {
                                r155[i2] = bVar.readInt();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e8) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            }
                            return r155;
                        case 10:
                            ?? r156 = new J.e[i4];
                            while (i2 < i4) {
                                r156[i2] = new J.e(bVar.readInt(), bVar.readInt());
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e9) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                            }
                            return r156;
                        case 11:
                            ?? r157 = new double[i4];
                            while (i2 < i4) {
                                r157[i2] = bVar.readFloat();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e10) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return r157;
                        case 12:
                            ?? r158 = new double[i4];
                            while (i2 < i4) {
                                r158[i2] = bVar.readDouble();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (java.io.IOException e11) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return r158;
                        default:
                            try {
                                bVar.close();
                            } catch (java.io.IOException e12) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return null;
                    }
                } catch (java.io.IOException e13) {
                    e = e13;
                    android.util.Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (java.io.IOException e14) {
                            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e15) {
                        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e16) {
            e = e16;
            bVar = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final java.lang.String toString() {
        return "(" + J.g.f892C[this.f880a] + ", data length:" + this.f883d.length + ")";
    }

    public c(long j2, byte[] bArr, int i2, int i3) {
        this.f880a = i2;
        this.f881b = i3;
        this.f882c = j2;
        this.f883d = bArr;
    }
}
