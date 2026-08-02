package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.gifdecoder.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class e implements a {

    @ColorInt
    public int[] a;
    public final a.InterfaceC0053a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;

    @ColorInt
    public final int[] j;
    public int k;
    public c l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;

    @Nullable
    public Boolean s;

    @ColorInt
    public final int[] b = new int[256];

    @NonNull
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public e(@NonNull a.InterfaceC0053a interfaceC0053a, c cVar, ByteBuffer byteBuffer, int i) {
        this.c = interfaceC0053a;
        this.l = new c();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = cVar;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = cVar.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i2 = cVar.f;
                this.r = i2 / highestOneBit;
                int i3 = cVar.g;
                this.q = i3 / highestOneBit;
                int i4 = i2 * i3;
                com.bumptech.glide.load.engine.bitmap_recycle.b bVar = ((com.bumptech.glide.load.resource.gif.b) this.c).b;
                this.i = bVar == null ? new byte[i4] : (byte[]) bVar.c(byte[].class, i4);
                a.InterfaceC0053a interfaceC0053a2 = this.c;
                int i5 = this.r * this.q;
                com.bumptech.glide.load.engine.bitmap_recycle.b bVar2 = ((com.bumptech.glide.load.resource.gif.b) interfaceC0053a2).b;
                this.j = bVar2 == null ? new int[i5] : (int[]) bVar2.c(int[].class, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x007a, B:34:0x007e, B:36:0x0090, B:38:0x0094, B:39:0x0098, B:42:0x0069, B:44:0x009e, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x007a, B:34:0x007e, B:36:0x0090, B:38:0x0094, B:39:0x0098, B:42:0x0069, B:44:0x009e, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x007a, B:34:0x007e, B:36:0x0090, B:38:0x0094, B:39:0x0098, B:42:0x0069, B:44:0x009e, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x007a, B:34:0x007e, B:36:0x0090, B:38:0x0094, B:39:0x0098, B:42:0x0069, B:44:0x009e, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x007a, B:34:0x007e, B:36:0x0090, B:38:0x0094, B:39:0x0098, B:42:0x0069, B:44:0x009e, B:47:0x0011, B:49:0x0019, B:50:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    @Override // com.bumptech.glide.gifdecoder.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap a() {
        int i;
        int[] iArr;
        try {
            if (this.l.c > 0) {
                if (this.k < 0) {
                }
                i = this.o;
                if (i != 1 && i != 2) {
                    this.o = 0;
                    if (this.e == null) {
                        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = ((com.bumptech.glide.load.resource.gif.b) this.c).b;
                        this.e = bVar == null ? new byte[255] : (byte[]) bVar.c(byte[].class, 255);
                    }
                    b bVar2 = (b) this.l.e.get(this.k);
                    int i2 = this.k - 1;
                    b bVar3 = i2 < 0 ? (b) this.l.e.get(i2) : null;
                    iArr = bVar2.k;
                    if (iArr != null) {
                        iArr = this.l.a;
                    }
                    this.a = iArr;
                    if (iArr != null) {
                        Log.isLoggable("e", 3);
                        this.o = 1;
                        return null;
                    }
                    if (bVar2.f) {
                        System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                        int[] iArr2 = this.b;
                        this.a = iArr2;
                        iArr2[bVar2.h] = 0;
                        if (bVar2.g == 2 && this.k == 0) {
                            this.s = Boolean.TRUE;
                        }
                    }
                    return e(bVar2, bVar3);
                }
                Log.isLoggable("e", 3);
                return null;
            }
            if (Log.isLoggable("e", 3)) {
                int i3 = this.l.c;
            }
            this.o = 1;
            i = this.o;
            if (i != 1) {
                this.o = 0;
                if (this.e == null) {
                }
                b bVar22 = (b) this.l.e.get(this.k);
                int i22 = this.k - 1;
                if (i22 < 0) {
                }
                iArr = bVar22.k;
                if (iArr != null) {
                }
                this.a = iArr;
                if (iArr != null) {
                }
            }
            Log.isLoggable("e", 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.k = (this.k + 1) % this.l.c;
    }

    public final Bitmap c() {
        Boolean bool = this.s;
        Bitmap c = ((com.bumptech.glide.load.resource.gif.b) this.c).a.c(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        c.setHasAlpha(true);
        return c;
    }

    public final void d(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r5.j == r36.h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap e(b bVar, b bVar2) {
        int[] iArr;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        short[] sArr;
        short s;
        short s2;
        int i6;
        Bitmap bitmap;
        int i7;
        int i8;
        int i9;
        a.InterfaceC0053a interfaceC0053a = this.c;
        byte b2 = 0;
        int[] iArr3 = this.j;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                ((com.bumptech.glide.load.resource.gif.b) interfaceC0053a).a.d(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr3, 0);
        }
        if (bVar2 != null && bVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (bVar2 != null && (i6 = bVar2.g) > 0) {
            if (i6 == 2) {
                if (!bVar.f) {
                    c cVar = this.l;
                    i7 = cVar.k;
                    if (bVar.k != null) {
                    }
                    int i10 = bVar2.d;
                    int i11 = this.p;
                    int i12 = i10 / i11;
                    int i13 = bVar2.b / i11;
                    int i14 = bVar2.c / i11;
                    int i15 = bVar2.a / i11;
                    int i16 = this.r;
                    i8 = (i13 * i16) + i15;
                    i9 = (i12 * i16) + i8;
                    while (i8 < i9) {
                        int i17 = i8 + i14;
                        for (int i18 = i8; i18 < i17; i18++) {
                            iArr3[i18] = i7;
                        }
                        i8 += this.r;
                    }
                }
                i7 = 0;
                int i102 = bVar2.d;
                int i112 = this.p;
                int i122 = i102 / i112;
                int i132 = bVar2.b / i112;
                int i142 = bVar2.c / i112;
                int i152 = bVar2.a / i112;
                int i162 = this.r;
                i8 = (i132 * i162) + i152;
                i9 = (i122 * i162) + i8;
                while (i8 < i9) {
                }
            } else if (i6 == 3 && (bitmap = this.m) != null) {
                int i19 = this.q;
                int i20 = this.r;
                bitmap.getPixels(iArr3, 0, i20, 0, 0, i20, i19);
            }
        }
        this.d.position(bVar.j);
        int i21 = bVar.c * bVar.d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i21) {
            com.bumptech.glide.load.engine.bitmap_recycle.b bVar3 = ((com.bumptech.glide.load.resource.gif.b) interfaceC0053a).b;
            this.i = bVar3 == null ? new byte[i21] : (byte[]) bVar3.c(byte[].class, i21);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr2 = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr4 = this.h;
        int i22 = this.d.get() & UByte.MAX_VALUE;
        int i23 = 1;
        int i24 = 1 << i22;
        int i25 = i24 + 1;
        int i26 = i24 + 2;
        int i27 = i22 + 1;
        int i28 = (1 << i27) - 1;
        int i29 = 0;
        while (i29 < i24) {
            sArr2[i29] = 0;
            bArr3[i29] = (byte) i29;
            i29++;
            i23 = i23;
        }
        int i30 = i23;
        byte[] bArr5 = this.e;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = i27;
        int i40 = i26;
        int i41 = i28;
        short s3 = -1;
        while (true) {
            if (i31 >= i21) {
                iArr = iArr3;
                b = b2;
                break;
            }
            if (i32 == 0) {
                s = -1;
                int i42 = this.d.get() & UByte.MAX_VALUE;
                if (i42 <= 0) {
                    sArr = sArr2;
                    iArr = iArr3;
                } else {
                    ByteBuffer byteBuffer = this.d;
                    sArr = sArr2;
                    iArr = iArr3;
                    byteBuffer.get(this.e, 0, Math.min(i42, byteBuffer.remaining()));
                }
                if (i42 <= 0) {
                    this.o = 3;
                    b = 0;
                    break;
                }
                i32 = i42;
                i33 = 0;
            } else {
                sArr = sArr2;
                iArr = iArr3;
                s = -1;
            }
            i35 += (bArr5[i33] & UByte.MAX_VALUE) << i34;
            i33++;
            i32--;
            int i43 = i34 + 8;
            int i44 = i40;
            int i45 = i39;
            short s4 = s3;
            int i46 = i37;
            while (true) {
                i34 = i43;
                if (i43 < i45) {
                    s3 = s4;
                    i37 = i46;
                    i39 = i45;
                    iArr3 = iArr;
                    b2 = 0;
                    i40 = i44;
                    sArr2 = sArr;
                    break;
                }
                int i47 = i35 & i41;
                i35 >>= i45;
                i34 -= i45;
                if (i47 == i24) {
                    i45 = i27;
                    i44 = i26;
                    i41 = i28;
                    i43 = i34;
                    s4 = s;
                } else {
                    if (i47 == i25) {
                        i40 = i44;
                        i39 = i45;
                        s3 = s4;
                        i37 = i46;
                        sArr2 = sArr;
                        iArr3 = iArr;
                        b2 = 0;
                        break;
                    }
                    int i48 = i45;
                    if (s4 == s) {
                        bArr2[i36] = bArr3[i47 == true ? 1 : 0];
                        i36++;
                        i31++;
                        s4 = i47 == true ? 1 : 0;
                        i46 = s4;
                        i43 = i34;
                        i45 = i48;
                    } else {
                        if (i47 >= i44) {
                            bArr4[i38] = (byte) i46;
                            i38++;
                            s2 = s4;
                        } else {
                            s2 = i47 == true ? 1 : 0;
                        }
                        while (s2 >= i24) {
                            bArr4[i38] = bArr3[s2];
                            i38++;
                            s2 = sArr[s2];
                        }
                        i46 = bArr3[s2] & UByte.MAX_VALUE;
                        byte b3 = (byte) i46;
                        bArr2[i36] = b3;
                        while (true) {
                            i36++;
                            i31++;
                            if (i38 <= 0) {
                                break;
                            }
                            i38--;
                            bArr2[i36] = bArr4[i38];
                        }
                        if (i44 < 4096) {
                            sArr[i44] = s4;
                            bArr3[i44] = b3;
                            i44++;
                            if ((i44 & i41) == 0 && i44 < 4096) {
                                i45 = i48 + 1;
                                i41 += i44;
                                i43 = i34;
                                s4 = i47 == true ? 1 : 0;
                            }
                        }
                        i45 = i48;
                        i43 = i34;
                        s4 = i47 == true ? 1 : 0;
                    }
                    s = -1;
                }
            }
        }
        Arrays.fill(bArr2, i36, i21, b);
        if (bVar.e || this.p != i30) {
            int i49 = bVar.d;
            int i50 = this.p;
            int i51 = i49 / i50;
            int i52 = bVar.b / i50;
            int i53 = bVar.c / i50;
            int i54 = bVar.a / i50;
            boolean z = this.k == 0;
            byte[] bArr6 = this.i;
            int[] iArr4 = this.a;
            Boolean bool = this.s;
            int i55 = 8;
            int i56 = 0;
            int i57 = 1;
            int i58 = 0;
            while (i58 < i51) {
                if (bVar.e) {
                    if (i56 >= i51) {
                        i57++;
                        if (i57 == 2) {
                            i56 = 4;
                        } else if (i57 == 3) {
                            i55 = 4;
                            i56 = 2;
                        } else if (i57 == 4) {
                            i56 = 1;
                            i55 = 2;
                        }
                    }
                    i = i56 + i55;
                } else {
                    i = i56;
                    i56 = i58;
                }
                int i59 = i56 + i52;
                int i60 = i51;
                boolean z2 = i50 == 1;
                if (i59 < this.q) {
                    int i61 = this.r;
                    int i62 = i59 * i61;
                    int i63 = i62 + i54;
                    int i64 = i63 + i53;
                    int i65 = i62 + i61;
                    if (i65 < i64) {
                        i64 = i65;
                    }
                    i2 = i50;
                    int i66 = i58 * i50 * bVar.c;
                    int[] iArr5 = this.j;
                    if (z2) {
                        int i67 = i63;
                        while (i67 < i64) {
                            int i68 = i67;
                            int i69 = iArr4[bArr6[i66] & 255];
                            if (i69 != 0) {
                                iArr5[i68] = i69;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i66 += i2;
                            i67 = i68 + 1;
                        }
                    } else {
                        int i70 = ((i64 - i63) * i2) + i66;
                        i3 = i52;
                        int i71 = i63;
                        while (i71 < i64) {
                            int i72 = i64;
                            int i73 = bVar.c;
                            int i74 = i71;
                            int i75 = i66;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            while (true) {
                                if (i75 >= this.p + i66) {
                                    i4 = i53;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i4 = i53;
                                if (i75 >= bArr7.length || i75 >= i70) {
                                    break;
                                }
                                int i81 = this.a[bArr7[i75] & 255];
                                if (i81 != 0) {
                                    i76 += (i81 >> 24) & 255;
                                    i77 += (i81 >> 16) & 255;
                                    i78 += (i81 >> 8) & 255;
                                    i79 += i81 & 255;
                                    i80++;
                                }
                                i75++;
                                i53 = i4;
                            }
                            int i82 = i66 + i73;
                            int i83 = i82;
                            while (i83 < this.p + i82) {
                                byte[] bArr8 = this.i;
                                int i84 = i82;
                                if (i83 >= bArr8.length || i83 >= i70) {
                                    break;
                                }
                                int i85 = this.a[bArr8[i83] & 255];
                                if (i85 != 0) {
                                    i76 += (i85 >> 24) & 255;
                                    i77 += (i85 >> 16) & 255;
                                    i78 += (i85 >> 8) & 255;
                                    i79 += i85 & 255;
                                    i80++;
                                }
                                i83++;
                                i82 = i84;
                            }
                            int i86 = i80 == 0 ? 0 : ((i76 / i80) << 24) | ((i77 / i80) << 16) | ((i78 / i80) << 8) | (i79 / i80);
                            if (i86 != 0) {
                                iArr5[i74] = i86;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i66 += i2;
                            i71 = i74 + 1;
                            i64 = i72;
                            i53 = i4;
                        }
                        i58++;
                        i56 = i;
                        i51 = i60;
                        i52 = i3;
                        i50 = i2;
                        i53 = i53;
                    }
                } else {
                    i2 = i50;
                }
                i3 = i52;
                i58++;
                i56 = i;
                i51 = i60;
                i52 = i3;
                i50 = i2;
                i53 = i53;
            }
            if (this.s == null) {
                this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i87 = bVar.d;
            int i88 = bVar.b;
            int i89 = bVar.c;
            int i90 = bVar.a;
            byte b4 = this.k == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.i;
            int[] iArr6 = this.a;
            int i91 = -1;
            for (int i92 = b; i92 < i87; i92++) {
                int i93 = this.r;
                int i94 = (i92 + i88) * i93;
                int i95 = i94 + i90;
                int i96 = i95 + i89;
                int i97 = i94 + i93;
                if (i97 < i96) {
                    i96 = i97;
                }
                int i98 = bVar.c * i92;
                while (i95 < i96) {
                    int i99 = bArr9[i98];
                    int i100 = i99 & 255;
                    if (i100 != i91) {
                        int i101 = iArr6[i100];
                        if (i101 != 0) {
                            this.j[i95] = i101;
                        } else {
                            i91 = i99;
                        }
                    }
                    i98++;
                    i95++;
                }
            }
            Boolean bool2 = this.s;
            this.s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.s != null || b4 == 0 || i91 == -1));
        }
        if (this.n && ((i5 = bVar.g) == 0 || i5 == 1)) {
            if (this.m == null) {
                this.m = c();
            }
            Bitmap bitmap3 = this.m;
            int i103 = this.q;
            int i104 = this.r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i104, 0, 0, i104, i103);
        } else {
            iArr2 = iArr;
        }
        Bitmap c = c();
        int i105 = this.q;
        int i106 = this.r;
        c.setPixels(iArr2, 0, i106, 0, 0, i106, i105);
        return c;
    }
}
