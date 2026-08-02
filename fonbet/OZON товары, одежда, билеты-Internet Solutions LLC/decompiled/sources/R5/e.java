package R5;

import R5.a;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private int[] f24579a;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0488a f24581c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f24582d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f24583e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f24584f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f24585g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f24586h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f24587i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f24588j;

    /* renamed from: k, reason: collision with root package name */
    private int f24589k;

    /* renamed from: l, reason: collision with root package name */
    private c f24590l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f24591m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f24592n;

    /* renamed from: o, reason: collision with root package name */
    private int f24593o;

    /* renamed from: p, reason: collision with root package name */
    private int f24594p;

    /* renamed from: q, reason: collision with root package name */
    private int f24595q;

    /* renamed from: r, reason: collision with root package name */
    private int f24596r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f24597s;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f24580b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    private Bitmap.Config f24598t = Bitmap.Config.ARGB_8888;

    public e(@NonNull a.InterfaceC0488a interfaceC0488a, c cVar, ByteBuffer byteBuffer, int i11) {
        this.f24581c = interfaceC0488a;
        this.f24590l = new c();
        synchronized (this) {
            try {
                if (i11 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i11);
                }
                int highestOneBit = Integer.highestOneBit(i11);
                this.f24593o = 0;
                this.f24590l = cVar;
                this.f24589k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f24582d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f24582d.order(ByteOrder.LITTLE_ENDIAN);
                this.f24592n = false;
                Iterator it = cVar.f24568e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f24559g == 3) {
                        this.f24592n = true;
                        break;
                    }
                }
                this.f24594p = highestOneBit;
                int i12 = cVar.f24569f;
                this.f24596r = i12 / highestOneBit;
                int i13 = cVar.f24570g;
                this.f24595q = i13 / highestOneBit;
                this.f24587i = ((g6.b) this.f24581c).b(i12 * i13);
                this.f24588j = ((g6.b) this.f24581c).c(this.f24596r * this.f24595q);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Bitmap h() {
        Boolean bool = this.f24597s;
        Bitmap a11 = ((g6.b) this.f24581c).a(this.f24596r, this.f24595q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f24598t);
        a11.setHasAlpha(true);
        return a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r4.f24573j == r36.f24560h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap k(b bVar, b bVar2) {
        int[] iArr;
        byte b11;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr2;
        int i15;
        short[] sArr;
        short s11;
        short s12;
        int i16;
        Bitmap bitmap;
        int i17;
        int i18;
        int i19;
        int[] iArr3 = this.f24588j;
        a.InterfaceC0488a interfaceC0488a = this.f24581c;
        byte b12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f24591m;
            if (bitmap2 != null) {
                ((g6.b) interfaceC0488a).d(bitmap2);
            }
            this.f24591m = null;
            Arrays.fill(iArr3, 0);
        }
        if (bVar2 != null && bVar2.f24559g == 3 && this.f24591m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (bVar2 != null && (i16 = bVar2.f24559g) > 0) {
            if (i16 == 2) {
                if (!bVar.f24558f) {
                    c cVar = this.f24590l;
                    i17 = cVar.f24574k;
                    if (bVar.f24563k != null) {
                    }
                    int i21 = bVar2.f24556d;
                    int i22 = this.f24594p;
                    int i23 = i21 / i22;
                    int i24 = bVar2.f24554b / i22;
                    int i25 = bVar2.f24555c / i22;
                    int i26 = bVar2.f24553a / i22;
                    int i27 = this.f24596r;
                    i18 = (i24 * i27) + i26;
                    i19 = (i23 * i27) + i18;
                    while (i18 < i19) {
                        int i28 = i18 + i25;
                        for (int i29 = i18; i29 < i28; i29++) {
                            iArr3[i29] = i17;
                        }
                        i18 += this.f24596r;
                    }
                }
                i17 = 0;
                int i212 = bVar2.f24556d;
                int i222 = this.f24594p;
                int i232 = i212 / i222;
                int i242 = bVar2.f24554b / i222;
                int i252 = bVar2.f24555c / i222;
                int i262 = bVar2.f24553a / i222;
                int i272 = this.f24596r;
                i18 = (i242 * i272) + i262;
                i19 = (i232 * i272) + i18;
                while (i18 < i19) {
                }
            } else if (i16 == 3 && (bitmap = this.f24591m) != null) {
                int i31 = this.f24596r;
                bitmap.getPixels(iArr3, 0, i31, 0, 0, i31, this.f24595q);
            }
        }
        int[] iArr4 = iArr3;
        this.f24582d.position(bVar.f24562j);
        int i32 = bVar.f24555c * bVar.f24556d;
        byte[] bArr = this.f24587i;
        if (bArr == null || bArr.length < i32) {
            this.f24587i = ((g6.b) interfaceC0488a).b(i32);
        }
        byte[] bArr2 = this.f24587i;
        if (this.f24584f == null) {
            this.f24584f = new short[4096];
        }
        short[] sArr2 = this.f24584f;
        if (this.f24585g == null) {
            this.f24585g = new byte[4096];
        }
        byte[] bArr3 = this.f24585g;
        if (this.f24586h == null) {
            this.f24586h = new byte[4097];
        }
        byte[] bArr4 = this.f24586h;
        int i33 = this.f24582d.get() & 255;
        int i34 = 1;
        int i35 = 1 << i33;
        int i36 = i35 + 1;
        int i37 = i35 + 2;
        int i38 = i33 + 1;
        int i39 = (1 << i38) - 1;
        int i41 = 0;
        while (i41 < i35) {
            sArr2[i41] = 0;
            bArr3[i41] = (byte) i41;
            i41++;
            i34 = i34;
        }
        int i42 = i34;
        byte[] bArr5 = this.f24583e;
        int i43 = i38;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = i37;
        int i54 = i39;
        short s13 = -1;
        while (true) {
            if (i44 >= i32) {
                iArr = iArr4;
                b11 = b12;
                break;
            }
            if (i45 == 0) {
                s11 = -1;
                int i55 = this.f24582d.get() & 255;
                if (i55 <= 0) {
                    iArr = iArr4;
                    sArr = sArr2;
                } else {
                    ByteBuffer byteBuffer = this.f24582d;
                    iArr = iArr4;
                    sArr = sArr2;
                    byteBuffer.get(this.f24583e, 0, Math.min(i55, byteBuffer.remaining()));
                }
                if (i55 <= 0) {
                    this.f24593o = 3;
                    b11 = 0;
                    break;
                }
                i45 = i55;
                i46 = 0;
            } else {
                iArr = iArr4;
                sArr = sArr2;
                s11 = -1;
            }
            i48 += (bArr5[i46] & 255) << i47;
            i46++;
            i45--;
            int i56 = i47 + 8;
            int i57 = i53;
            int i58 = i43;
            short s14 = s13;
            int i59 = i51;
            while (true) {
                i47 = i56;
                if (i56 < i58) {
                    i43 = i58;
                    s13 = s14;
                    i51 = i59;
                    iArr4 = iArr;
                    b12 = 0;
                    i53 = i57;
                    sArr2 = sArr;
                    break;
                }
                int i61 = i48 & i54;
                i48 >>= i58;
                i47 -= i58;
                if (i61 == i35) {
                    i58 = i38;
                    i57 = i37;
                    i54 = i39;
                    i56 = i47;
                    s14 = s11;
                } else {
                    if (i61 == i36) {
                        i53 = i57;
                        i43 = i58;
                        s13 = s14;
                        i51 = i59;
                        iArr4 = iArr;
                        sArr2 = sArr;
                        b12 = 0;
                        break;
                    }
                    int i62 = i44;
                    if (s14 == s11) {
                        bArr2[i49] = bArr3[i61 == true ? 1 : 0];
                        i49++;
                        i44 = i62 + 1;
                        s14 = i61 == true ? 1 : 0;
                        i59 = s14;
                        i56 = i47;
                    } else {
                        if (i61 >= i57) {
                            bArr4[i52] = (byte) i59;
                            i52++;
                            s12 = s14;
                        } else {
                            s12 = i61 == true ? 1 : 0;
                        }
                        while (s12 >= i35) {
                            bArr4[i52] = bArr3[s12];
                            i52++;
                            s12 = sArr[s12];
                        }
                        i59 = bArr3[s12] & 255;
                        byte b13 = (byte) i59;
                        bArr2[i49] = b13;
                        while (true) {
                            i49++;
                            i62++;
                            if (i52 <= 0) {
                                break;
                            }
                            i52--;
                            bArr2[i49] = bArr4[i52];
                        }
                        if (i57 < 4096) {
                            sArr[i57] = s14;
                            bArr3[i57] = b13;
                            i57++;
                            if ((i57 & i54) == 0 && i57 < 4096) {
                                i58++;
                                i54 += i57;
                            }
                        }
                        i56 = i47;
                        i44 = i62;
                        s14 = i61 == true ? 1 : 0;
                    }
                    s11 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i49, i32, b11);
        if (bVar.f24557e || this.f24594p != i42) {
            int[] iArr5 = this.f24588j;
            int i63 = bVar.f24556d;
            int i64 = this.f24594p;
            int i65 = i63 / i64;
            int i66 = bVar.f24554b / i64;
            int i67 = bVar.f24555c / i64;
            int i68 = bVar.f24553a / i64;
            boolean z11 = this.f24589k == 0;
            int i69 = this.f24596r;
            int i71 = this.f24595q;
            byte[] bArr6 = this.f24587i;
            int[] iArr6 = this.f24579a;
            Boolean bool = this.f24597s;
            int i72 = 8;
            int i73 = 0;
            int i74 = 1;
            int i75 = 0;
            while (i75 < i65) {
                int[] iArr7 = iArr5;
                if (bVar.f24557e) {
                    if (i73 >= i65) {
                        i74++;
                        if (i74 == 2) {
                            i73 = 4;
                        } else if (i74 == 3) {
                            i72 = 4;
                            i73 = 2;
                        } else if (i74 == 4) {
                            i73 = 1;
                            i72 = 2;
                        }
                    }
                    i11 = i73 + i72;
                } else {
                    i11 = i73;
                    i73 = i75;
                }
                int i76 = i73 + i66;
                int i77 = i11;
                boolean z12 = i64 == 1;
                if (i76 < i71) {
                    int i78 = i76 * i69;
                    int i79 = i78 + i68;
                    boolean z13 = z12;
                    int i81 = i79 + i67;
                    int i82 = i78 + i69;
                    if (i82 < i81) {
                        i81 = i82;
                    }
                    i12 = i65;
                    int i83 = i75 * i64 * bVar.f24555c;
                    if (z13) {
                        int i84 = i79;
                        while (i84 < i81) {
                            int i85 = i84;
                            int i86 = iArr6[bArr6[i83] & 255];
                            if (i86 != 0) {
                                iArr7[i85] = i86;
                            } else if (z11 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i83 += i64;
                            i84 = i85 + 1;
                        }
                    } else {
                        int i87 = ((i81 - i79) * i64) + i83;
                        i13 = i64;
                        int i88 = i79;
                        while (i88 < i81) {
                            int i89 = i81;
                            int i91 = bVar.f24555c;
                            int i92 = i88;
                            int i93 = i83;
                            int i94 = 0;
                            int i95 = 0;
                            int i96 = 0;
                            int i97 = 0;
                            int i98 = 0;
                            while (true) {
                                if (i93 >= this.f24594p + i83) {
                                    i14 = i66;
                                    break;
                                }
                                byte[] bArr7 = this.f24587i;
                                i14 = i66;
                                if (i93 >= bArr7.length || i93 >= i87) {
                                    break;
                                }
                                int i99 = this.f24579a[bArr7[i93] & 255];
                                if (i99 != 0) {
                                    i94 += (i99 >> 24) & 255;
                                    i95 += (i99 >> 16) & 255;
                                    i96 += (i99 >> 8) & 255;
                                    i97 += i99 & 255;
                                    i98++;
                                }
                                i93++;
                                i66 = i14;
                            }
                            int i100 = i83 + i91;
                            int i101 = i100;
                            while (i101 < this.f24594p + i100) {
                                byte[] bArr8 = this.f24587i;
                                int i102 = i100;
                                if (i101 >= bArr8.length || i101 >= i87) {
                                    break;
                                }
                                int i103 = this.f24579a[bArr8[i101] & 255];
                                if (i103 != 0) {
                                    i94 += (i103 >> 24) & 255;
                                    i95 += (i103 >> 16) & 255;
                                    i96 += (i103 >> 8) & 255;
                                    i97 += i103 & 255;
                                    i98++;
                                }
                                i101++;
                                i100 = i102;
                            }
                            int i104 = i98 == 0 ? 0 : ((i94 / i98) << 24) | ((i95 / i98) << 16) | ((i96 / i98) << 8) | (i97 / i98);
                            if (i104 != 0) {
                                iArr7[i92] = i104;
                            } else if (z11 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i83 += i13;
                            i88 = i92 + 1;
                            i81 = i89;
                            i66 = i14;
                        }
                        i75++;
                        iArr5 = iArr7;
                        i73 = i77;
                        i64 = i13;
                        i65 = i12;
                        i66 = i66;
                    }
                } else {
                    i12 = i65;
                }
                i13 = i64;
                i75++;
                iArr5 = iArr7;
                i73 = i77;
                i64 = i13;
                i65 = i12;
                i66 = i66;
            }
            if (this.f24597s == null) {
                this.f24597s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr8 = this.f24588j;
            int i105 = bVar.f24556d;
            int i106 = bVar.f24554b;
            int i107 = bVar.f24555c;
            int i108 = bVar.f24553a;
            byte b14 = this.f24589k == 0 ? (byte) 1 : b11;
            int i109 = this.f24596r;
            byte[] bArr9 = this.f24587i;
            int[] iArr9 = this.f24579a;
            int i110 = -1;
            for (int i111 = b11; i111 < i105; i111++) {
                int i112 = (i111 + i106) * i109;
                int i113 = i112 + i108;
                int i114 = i113 + i107;
                int i115 = i112 + i109;
                if (i115 < i114) {
                    i114 = i115;
                }
                int i116 = bVar.f24555c * i111;
                while (i113 < i114) {
                    int[] iArr10 = iArr8;
                    int i117 = bArr9[i116];
                    int i118 = i105;
                    int i119 = i117 & 255;
                    if (i119 != i110) {
                        int i120 = iArr9[i119];
                        if (i120 != 0) {
                            iArr10[i113] = i120;
                        } else {
                            i110 = i117;
                        }
                    }
                    i116++;
                    i113++;
                    iArr8 = iArr10;
                    i105 = i118;
                }
            }
            Boolean bool2 = this.f24597s;
            this.f24597s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f24597s != null || b14 == 0 || i110 == -1));
        }
        if (this.f24592n && ((i15 = bVar.f24559g) == 0 || i15 == 1)) {
            if (this.f24591m == null) {
                this.f24591m = h();
            }
            Bitmap bitmap3 = this.f24591m;
            int i121 = this.f24596r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i121, 0, 0, i121, this.f24595q);
        } else {
            iArr2 = iArr;
        }
        Bitmap h11 = h();
        int i122 = this.f24596r;
        h11.setPixels(iArr2, 0, i122, 0, 0, i122, this.f24595q);
        return h11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005d, B:19:0x006e, B:20:0x007a, B:23:0x0083, B:25:0x0087, B:27:0x008f, B:28:0x00a2, B:32:0x00a6, B:34:0x00aa, B:36:0x00bc, B:38:0x00c0, B:39:0x00c4, B:42:0x007f, B:44:0x00ca, B:46:0x00d2, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005d, B:19:0x006e, B:20:0x007a, B:23:0x0083, B:25:0x0087, B:27:0x008f, B:28:0x00a2, B:32:0x00a6, B:34:0x00aa, B:36:0x00bc, B:38:0x00c0, B:39:0x00c4, B:42:0x007f, B:44:0x00ca, B:46:0x00d2, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005d, B:19:0x006e, B:20:0x007a, B:23:0x0083, B:25:0x0087, B:27:0x008f, B:28:0x00a2, B:32:0x00a6, B:34:0x00aa, B:36:0x00bc, B:38:0x00c0, B:39:0x00c4, B:42:0x007f, B:44:0x00ca, B:46:0x00d2, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005d, B:19:0x006e, B:20:0x007a, B:23:0x0083, B:25:0x0087, B:27:0x008f, B:28:0x00a2, B:32:0x00a6, B:34:0x00aa, B:36:0x00bc, B:38:0x00c0, B:39:0x00c4, B:42:0x007f, B:44:0x00ca, B:46:0x00d2, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005d, B:19:0x006e, B:20:0x007a, B:23:0x0083, B:25:0x0087, B:27:0x008f, B:28:0x00a2, B:32:0x00a6, B:34:0x00aa, B:36:0x00bc, B:38:0x00c0, B:39:0x00c4, B:42:0x007f, B:44:0x00ca, B:46:0x00d2, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005d, B:19:0x006e, B:20:0x007a, B:23:0x0083, B:25:0x0087, B:27:0x008f, B:28:0x00a2, B:32:0x00a6, B:34:0x00aa, B:36:0x00bc, B:38:0x00c0, B:39:0x00c4, B:42:0x007f, B:44:0x00ca, B:46:0x00d2, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    @Override // R5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap a() {
        int i11;
        int[] iArr;
        try {
            if (this.f24590l.f24566c > 0) {
                if (this.f24589k < 0) {
                }
                i11 = this.f24593o;
                if (i11 != 1 && i11 != 2) {
                    this.f24593o = 0;
                    if (this.f24583e == null) {
                        this.f24583e = ((g6.b) this.f24581c).b(255);
                    }
                    b bVar = (b) this.f24590l.f24568e.get(this.f24589k);
                    int i12 = this.f24589k - 1;
                    b bVar2 = i12 < 0 ? (b) this.f24590l.f24568e.get(i12) : null;
                    iArr = bVar.f24563k;
                    if (iArr != null) {
                        iArr = this.f24590l.f24564a;
                    }
                    this.f24579a = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable("e", 3)) {
                            Log.d("e", "No valid color table found for frame #" + this.f24589k);
                        }
                        this.f24593o = 1;
                        return null;
                    }
                    if (bVar.f24558f) {
                        System.arraycopy(iArr, 0, this.f24580b, 0, iArr.length);
                        int[] iArr2 = this.f24580b;
                        this.f24579a = iArr2;
                        iArr2[bVar.f24560h] = 0;
                        if (bVar.f24559g == 2 && this.f24589k == 0) {
                            this.f24597s = Boolean.TRUE;
                        }
                    }
                    return k(bVar, bVar2);
                }
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "Unable to decode frame, status=" + this.f24593o);
                }
                return null;
            }
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f24590l.f24566c + ", framePointer=" + this.f24589k);
            }
            this.f24593o = 1;
            i11 = this.f24593o;
            if (i11 != 1) {
                this.f24593o = 0;
                if (this.f24583e == null) {
                }
                b bVar3 = (b) this.f24590l.f24568e.get(this.f24589k);
                int i122 = this.f24589k - 1;
                if (i122 < 0) {
                }
                iArr = bVar3.f24563k;
                if (iArr != null) {
                }
                this.f24579a = iArr;
                if (iArr != null) {
                }
            }
            if (Log.isLoggable("e", 3)) {
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b() {
        this.f24589k = (this.f24589k + 1) % this.f24590l.f24566c;
    }

    public final void c() {
        this.f24590l = null;
        byte[] bArr = this.f24587i;
        a.InterfaceC0488a interfaceC0488a = this.f24581c;
        if (bArr != null) {
            ((g6.b) interfaceC0488a).e(bArr);
        }
        int[] iArr = this.f24588j;
        if (iArr != null) {
            ((g6.b) interfaceC0488a).f(iArr);
        }
        Bitmap bitmap = this.f24591m;
        if (bitmap != null) {
            ((g6.b) interfaceC0488a).d(bitmap);
        }
        this.f24591m = null;
        this.f24582d = null;
        this.f24597s = null;
        byte[] bArr2 = this.f24583e;
        if (bArr2 != null) {
            ((g6.b) interfaceC0488a).e(bArr2);
        }
    }

    public final int d() {
        return (this.f24588j.length * 4) + this.f24582d.limit() + this.f24587i.length;
    }

    public final int e() {
        return this.f24589k;
    }

    @NonNull
    public final ByteBuffer f() {
        return this.f24582d;
    }

    public final int g() {
        return this.f24590l.f24566c;
    }

    public final int i() {
        int i11;
        c cVar = this.f24590l;
        int i12 = cVar.f24566c;
        if (i12 <= 0 || (i11 = this.f24589k) < 0) {
            return 0;
        }
        if (i11 < 0 || i11 >= i12) {
            return -1;
        }
        return ((b) cVar.f24568e.get(i11)).f24561i;
    }

    public final void j(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f24598t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }
}
