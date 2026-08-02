package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y91 {

    /* JADX INFO: renamed from: a */
    public int[] f9230a;

    /* JADX INFO: renamed from: c */
    public final f50 f9232c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f9233d;

    /* JADX INFO: renamed from: e */
    public byte[] f9234e;

    /* JADX INFO: renamed from: f */
    public short[] f9235f;

    /* JADX INFO: renamed from: g */
    public byte[] f9236g;

    /* JADX INFO: renamed from: h */
    public byte[] f9237h;

    /* JADX INFO: renamed from: i */
    public byte[] f9238i;

    /* JADX INFO: renamed from: j */
    public final int[] f9239j;

    /* JADX INFO: renamed from: k */
    public int f9240k;

    /* JADX INFO: renamed from: l */
    public i80 f9241l;

    /* JADX INFO: renamed from: m */
    public Bitmap f9242m;

    /* JADX INFO: renamed from: n */
    public final boolean f9243n;

    /* JADX INFO: renamed from: o */
    public int f9244o;

    /* JADX INFO: renamed from: p */
    public final int f9245p;

    /* JADX INFO: renamed from: q */
    public final int f9246q;

    /* JADX INFO: renamed from: r */
    public final int f9247r;

    /* JADX INFO: renamed from: s */
    public Boolean f9248s;

    /* JADX INFO: renamed from: b */
    public final int[] f9231b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f9249t = Bitmap.Config.ARGB_8888;

    public y91(f50 f50Var, i80 i80Var, ByteBuffer byteBuffer, int i) {
        this.f9232c = f50Var;
        this.f9241l = new i80();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                int i2 = 0;
                this.f9244o = 0;
                this.f9241l = i80Var;
                this.f9240k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f9233d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f9233d.order(ByteOrder.LITTLE_ENDIAN);
                this.f9243n = false;
                ArrayList arrayList = i80Var.f3467e;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((e80) obj).f2003g == 3) {
                        this.f9243n = true;
                        break;
                    }
                }
                this.f9245p = iHighestOneBit;
                int i3 = i80Var.f3468f;
                this.f9247r = i3 / iHighestOneBit;
                int i4 = i80Var.f3469g;
                this.f9246q = i4 / iHighestOneBit;
                int i5 = i3 * i4;
                nk0 nk0Var = (nk0) this.f9232c.f2314l;
                this.f9238i = nk0Var == null ? new byte[i5] : (byte[]) nk0Var.m3543c(i5, byte[].class);
                f50 f50Var2 = this.f9232c;
                int i6 = this.f9247r * this.f9246q;
                nk0 nk0Var2 = (nk0) f50Var2.f2314l;
                this.f9239j = nk0Var2 == null ? new int[i6] : (int[]) nk0Var2.m3543c(i6, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m5746a() {
        Boolean bool = this.f9248s;
        Bitmap bitmapMo2590f = ((InterfaceC0318ic) this.f9232c.f2313k).mo2590f(this.f9247r, this.f9246q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f9249t);
        bitmapMo2590f.setHasAlpha(true);
        return bitmapMo2590f;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m5747b() {
        try {
            if (this.f9241l.f3465c <= 0 || this.f9240k < 0) {
                if (Log.isLoggable("y91", 3)) {
                    Log.d("y91", "Unable to decode frame, frameCount=" + this.f9241l.f3465c + ", framePointer=" + this.f9240k);
                }
                this.f9244o = 1;
            }
            int i = this.f9244o;
            if (i != 1 && i != 2) {
                this.f9244o = 0;
                if (this.f9234e == null) {
                    nk0 nk0Var = (nk0) this.f9232c.f2314l;
                    this.f9234e = nk0Var == null ? new byte[255] : (byte[]) nk0Var.m3543c(255, byte[].class);
                }
                e80 e80Var = (e80) this.f9241l.f3467e.get(this.f9240k);
                int i2 = this.f9240k - 1;
                e80 e80Var2 = i2 >= 0 ? (e80) this.f9241l.f3467e.get(i2) : null;
                int[] iArr = e80Var.f2007k;
                if (iArr == null) {
                    iArr = this.f9241l.f3463a;
                }
                this.f9230a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("y91", 3)) {
                        Log.d("y91", "No valid color table found for frame #" + this.f9240k);
                    }
                    this.f9244o = 1;
                    return null;
                }
                if (e80Var.f2002f) {
                    System.arraycopy(iArr, 0, this.f9231b, 0, iArr.length);
                    int[] iArr2 = this.f9231b;
                    this.f9230a = iArr2;
                    iArr2[e80Var.f2004h] = 0;
                    if (e80Var.f2003g == 2 && this.f9240k == 0) {
                        this.f9248s = Boolean.TRUE;
                    }
                }
                return m5749d(e80Var, e80Var2);
            }
            if (Log.isLoggable("y91", 3)) {
                Log.d("y91", "Unable to decode frame, status=" + this.f9244o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5748c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f9249t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7 A[PHI: r7
      0x01e7: PHI (r7v18 int) = (r7v12 int), (r7v20 int), (r7v20 int) binds: [B:95:0x01d3, B:97:0x01de, B:98:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [short] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX INFO: renamed from: d */
    public final Bitmap m5749d(e80 e80Var, e80 e80Var2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        short s;
        int i7;
        int i8;
        f50 f50Var = this.f9232c;
        byte b = 0;
        int[] iArr2 = this.f9239j;
        if (e80Var2 == null) {
            Bitmap bitmap = this.f9242m;
            if (bitmap != null) {
                ((InterfaceC0318ic) f50Var.f2313k).mo2591h(bitmap);
            }
            this.f9242m = null;
            Arrays.fill(iArr2, 0);
        }
        if (e80Var2 != null && e80Var2.f2003g == 3 && this.f9242m == null) {
            Arrays.fill(iArr2, 0);
        }
        int i9 = this.f9247r;
        int i10 = this.f9245p;
        if (e80Var2 != null && (i7 = e80Var2.f2003g) > 0) {
            if (i7 == 2) {
                if (e80Var.f2002f) {
                    i8 = 0;
                } else {
                    i80 i80Var = this.f9241l;
                    i8 = i80Var.f3473k;
                    if (e80Var.f2007k != null && i80Var.f3472j == e80Var.f2004h) {
                        i8 = 0;
                    }
                }
                int i11 = e80Var2.f2000d / i10;
                int i12 = e80Var2.f1998b / i10;
                int i13 = e80Var2.f1999c / i10;
                int i14 = (i12 * i9) + (e80Var2.f1997a / i10);
                int i15 = (i11 * i9) + i14;
                while (i14 < i15) {
                    int i16 = i14 + i13;
                    for (int i17 = i14; i17 < i16; i17++) {
                        iArr2[i17] = i8;
                    }
                    i14 += i9;
                }
            } else if (i7 == 3) {
                Bitmap bitmap2 = this.f9242m;
                if (bitmap2 != null) {
                    int i18 = this.f9246q;
                    int i19 = this.f9247r;
                    bitmap2.getPixels(iArr2, 0, i19, 0, 0, i19, i18);
                }
            }
        }
        this.f9233d.position(e80Var.f2006j);
        int i20 = e80Var.f1999c * e80Var.f2000d;
        byte[] bArr = this.f9238i;
        if (bArr == null || bArr.length < i20) {
            nk0 nk0Var = (nk0) f50Var.f2314l;
            this.f9238i = nk0Var == null ? new byte[i20] : (byte[]) nk0Var.m3543c(i20, byte[].class);
        }
        byte[] bArr2 = this.f9238i;
        if (this.f9235f == null) {
            this.f9235f = new short[4096];
        }
        short[] sArr = this.f9235f;
        if (this.f9236g == null) {
            this.f9236g = new byte[4096];
        }
        byte[] bArr3 = this.f9236g;
        if (this.f9237h == null) {
            this.f9237h = new byte[4097];
        }
        byte[] bArr4 = this.f9237h;
        int i21 = this.f9233d.get() & 255;
        int i22 = 1 << i21;
        int i23 = i22 + 1;
        int i24 = i22 + 2;
        int i25 = i21 + 1;
        int i26 = (1 << i25) - 1;
        for (int i27 = 0; i27 < i22; i27++) {
            sArr[i27] = 0;
            bArr3[i27] = (byte) i27;
        }
        byte[] bArr5 = this.f9234e;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = i25;
        int i37 = i24;
        int i38 = i26;
        int i39 = -1;
        int i40 = -1;
        while (true) {
            if (i28 >= i20) {
                iArr2 = iArr2;
                break;
            }
            if (i29 == 0) {
                i29 = this.f9233d.get() & 255;
                if (i29 > 0) {
                    ByteBuffer byteBuffer = this.f9233d;
                    byteBuffer.get(this.f9234e, 0, Math.min(i29, byteBuffer.remaining()));
                }
                if (i29 <= 0) {
                    this.f9244o = 3;
                    b = 0;
                    break;
                }
                i30 = 0;
            } else {
                iArr2 = iArr2;
                sArr = sArr;
                bArr5 = bArr5;
            }
            i32 += (bArr5[i30] & 255) << i31;
            i30++;
            i29--;
            i40 = i40;
            i31 += 8;
            i37 = i37;
            int i41 = i36;
            bArr3 = bArr3;
            i34 = i34;
            while (true) {
                i31 = i31;
                if (i31 < i41) {
                    i36 = i41;
                    i39 = -1;
                    break;
                }
                int i42 = i32 & i38;
                i32 >>= i41;
                i31 -= i41;
                if (i42 == i22) {
                    i41 = i25;
                    i37 = i24;
                    i38 = i26;
                    i40 = i39;
                    i31 = i31;
                } else {
                    if (i42 == i23) {
                        i36 = i41;
                        break;
                    }
                    int i43 = i41;
                    if (i40 == i39) {
                        bArr2[i33] = bArr3[i42];
                        i33++;
                        i28++;
                        i40 = i42;
                        i34 = i40;
                        i41 = i43;
                    } else {
                        if (i42 >= i37) {
                            bArr4[i35] = (byte) i34;
                            i35++;
                            s = i40;
                        } else {
                            s = i42;
                        }
                        while (s >= i22) {
                            bArr4[i35] = bArr3[s];
                            i35++;
                            s = sArr[s];
                        }
                        i34 = bArr3[s] & 255;
                        byte b2 = (byte) i34;
                        bArr2[i33] = b2;
                        while (true) {
                            i33++;
                            i28++;
                            if (i35 <= 0) {
                                break;
                            }
                            i35--;
                            bArr2[i33] = bArr4[i35];
                        }
                        int i44 = i22;
                        if (i37 < 4096) {
                            sArr[i37] = (short) i40;
                            bArr3[i37] = b2;
                            i37++;
                            if ((i37 & i38) != 0 || i37 >= 4096) {
                                i41 = i43;
                            } else {
                                i41 = i43 + 1;
                                i38 += i37;
                            }
                        } else {
                            i41 = i43;
                        }
                        i40 = i42;
                        i22 = i44;
                    }
                    i39 = -1;
                }
            }
            b = 0;
        }
        Arrays.fill(bArr2, i33, i20, b);
        boolean z = e80Var.f2001e;
        int[] iArr3 = this.f9239j;
        if (z || i10 != 1) {
            int i45 = e80Var.f2000d / i10;
            int i46 = e80Var.f1998b / i10;
            int i47 = e80Var.f1999c / i10;
            int i48 = e80Var.f1997a / i10;
            boolean z2 = this.f9240k == 0;
            byte[] bArr6 = this.f9238i;
            int[] iArr4 = this.f9230a;
            Boolean bool = this.f9248s;
            int i49 = 8;
            int i50 = 0;
            int i51 = 0;
            int i52 = 1;
            while (i50 < i45) {
                int i53 = i46;
                if (e80Var.f2001e) {
                    if (i51 >= i45) {
                        i52++;
                        if (i52 == 2) {
                            i51 = 4;
                        } else if (i52 == 3) {
                            i49 = 4;
                            i51 = 2;
                        } else if (i52 == 4) {
                            i51 = 1;
                            i49 = 2;
                        }
                    }
                    i = i51 + i49;
                } else {
                    i = i51;
                    i51 = i50;
                }
                int i54 = i51 + i53;
                int i55 = i45;
                boolean z3 = i10 == 1;
                if (i54 < this.f9246q) {
                    int i56 = i54 * i9;
                    int i57 = i56 + i48;
                    int i58 = i57 + i47;
                    int i59 = i56 + i9;
                    if (i59 < i58) {
                        i58 = i59;
                    }
                    i2 = i;
                    int i60 = i50 * i10 * e80Var.f1999c;
                    if (z3) {
                        int i61 = i57;
                        while (i61 < i58) {
                            int i62 = i61;
                            int i63 = iArr4[bArr6[i60] & 255];
                            if (i63 != 0) {
                                iArr3[i62] = i63;
                            } else if (z2 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i60 += i10;
                            i61 = i62 + 1;
                        }
                    } else {
                        int i64 = ((i58 - i57) * i10) + i60;
                        Boolean bool2 = bool;
                        int i65 = i60;
                        int i66 = i57;
                        while (i66 < i58) {
                            int i67 = i58;
                            int i68 = e80Var.f1999c;
                            int i69 = i47;
                            int i70 = i65;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            while (true) {
                                if (i70 >= i65 + i10) {
                                    i5 = i48;
                                    break;
                                }
                                byte[] bArr7 = this.f9238i;
                                i5 = i48;
                                if (i70 >= bArr7.length || i70 >= i64) {
                                    break;
                                }
                                int i76 = this.f9230a[bArr7[i70] & 255];
                                if (i76 != 0) {
                                    i71 += (i76 >> 24) & 255;
                                    i72 += (i76 >> 16) & 255;
                                    i73 += (i76 >> 8) & 255;
                                    i74 += i76 & 255;
                                    i75++;
                                }
                                i70++;
                                i48 = i5;
                            }
                            int i77 = i65 + i68;
                            int i78 = i77;
                            while (i78 < i77 + i10) {
                                byte[] bArr8 = this.f9238i;
                                int i79 = i77;
                                if (i78 >= bArr8.length || i78 >= i64) {
                                    break;
                                }
                                int i80 = this.f9230a[bArr8[i78] & 255];
                                if (i80 != 0) {
                                    i71 += (i80 >> 24) & 255;
                                    i72 += (i80 >> 16) & 255;
                                    i73 += (i80 >> 8) & 255;
                                    i74 += i80 & 255;
                                    i75++;
                                }
                                i78++;
                                i77 = i79;
                            }
                            int i81 = i75 == 0 ? 0 : ((i71 / i75) << 24) | ((i72 / i75) << 16) | ((i73 / i75) << 8) | (i74 / i75);
                            if (i81 != 0) {
                                iArr3[i66] = i81;
                            } else if (z2 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i65 += i10;
                            i66++;
                            i58 = i67;
                            i47 = i69;
                            i48 = i5;
                        }
                        i4 = i47;
                        i3 = i48;
                        bool = bool2;
                    }
                    i50++;
                    i46 = i53;
                    i45 = i55;
                    i51 = i2;
                    i47 = i4;
                    i48 = i3;
                } else {
                    i2 = i;
                }
                i4 = i47;
                i3 = i48;
                i50++;
                i46 = i53;
                i45 = i55;
                i51 = i2;
                i47 = i4;
                i48 = i3;
            }
            if (this.f9248s == null) {
                this.f9248s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i82 = e80Var.f2000d;
            int i83 = e80Var.f1998b;
            int i84 = e80Var.f1999c;
            int i85 = e80Var.f1997a;
            byte b3 = this.f9240k == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.f9238i;
            int[] iArr5 = this.f9230a;
            byte b4 = -1;
            for (int i86 = b; i86 < i82; i86++) {
                int i87 = (i86 + i83) * i9;
                int i88 = i87 + i85;
                int i89 = i88 + i84;
                int i90 = i87 + i9;
                if (i90 < i89) {
                    i89 = i90;
                }
                int i91 = e80Var.f1999c * i86;
                while (i88 < i89) {
                    int i92 = i82;
                    byte b5 = bArr9[i91];
                    int[] iArr6 = iArr3;
                    int i93 = b5 & 255;
                    if (i93 != b4) {
                        int i94 = iArr5[i93];
                        if (i94 != 0) {
                            iArr6[i88] = i94;
                        } else {
                            b4 = b5;
                        }
                    }
                    i91++;
                    i88++;
                    i82 = i92;
                    iArr3 = iArr6;
                }
            }
            Boolean bool3 = this.f9248s;
            this.f9248s = Boolean.valueOf((bool3 != null && bool3.booleanValue()) || !(this.f9248s != null || b3 == 0 || b4 == -1));
        }
        if (this.f9243n && ((i6 = e80Var.f2003g) == 0 || i6 == 1)) {
            if (this.f9242m == null) {
                this.f9242m = m5746a();
            }
            Bitmap bitmap3 = this.f9242m;
            int i95 = this.f9246q;
            int i96 = this.f9247r;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i96, 0, 0, i96, i95);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapM5746a = m5746a();
        int i97 = this.f9246q;
        int i98 = this.f9247r;
        bitmapM5746a.setPixels(iArr, 0, i98, 0, 0, i98, i97);
        return bitmapM5746a;
    }
}
