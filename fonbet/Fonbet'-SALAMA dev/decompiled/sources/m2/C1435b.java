package m2;

import C1.C0095a;
import android.graphics.Bitmap;
import com.google.android.gms.internal.ads.zzbbd;
import j2.AbstractC1308e;
import j2.C1305b;
import j2.InterfaceC1309f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import l2.C1388j;
import v2.t;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435b extends AbstractC1308e {

    /* renamed from: D, reason: collision with root package name */
    public final C0095a f15244D = new C0095a(4, false);

    /* renamed from: E, reason: collision with root package name */
    public final C0095a f15245E = new C0095a(4, false);

    /* renamed from: F, reason: collision with root package name */
    public final C1434a f15246F = new C1434a();

    /* renamed from: G, reason: collision with root package name */
    public Inflater f15247G;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r9.C(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r5.reset();
        r4.B(r9.f1464b, (byte[]) r9.f1465c);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    @Override // j2.AbstractC1308e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1309f e(byte[] bArr, int i7, boolean z4) {
        char c3;
        C0095a c0095a;
        int i8;
        C0095a c0095a2;
        C0095a c0095a3;
        C0095a c0095a4;
        int v6;
        Inflater inflater;
        int i9 = 4;
        C0095a c0095a5 = this.f15244D;
        c0095a5.B(i7, bArr);
        char c4 = 255;
        int i10 = 0;
        int i11 = 2;
        if (c0095a5.d() > 0 && (((byte[]) c0095a5.f1465c)[c0095a5.f1463a] & 255) == 120) {
            if (this.f15247G == null) {
                this.f15247G = new Inflater();
            }
            inflater = this.f15247G;
            int i12 = t.f17153a;
            if (c0095a5.d() > 0) {
                C0095a c0095a6 = this.f15245E;
                if (((byte[]) c0095a6.f1465c).length < c0095a5.d()) {
                    c0095a6.e(c0095a5.d() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput((byte[]) c0095a5.f1465c, c0095a5.f1463a, c0095a5.d());
                int i13 = 0;
                while (true) {
                    try {
                        byte[] bArr2 = (byte[]) c0095a6.f1465c;
                        i13 += inflater.inflate(bArr2, i13, bArr2.length - i13);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break;
                            }
                            byte[] bArr3 = (byte[]) c0095a6.f1465c;
                            if (i13 == bArr3.length) {
                                c0095a6.e(bArr3.length * 2);
                            }
                        } else {
                            break;
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
            }
        }
        C1434a c1434a = this.f15246F;
        c1434a.f15238d = 0;
        c1434a.f15239e = 0;
        c1434a.f15240f = 0;
        c1434a.f15241g = 0;
        c1434a.f15242h = 0;
        c1434a.f15243i = 0;
        C0095a c0095a7 = c1434a.f15235a;
        c0095a7.A(0);
        c1434a.f15237c = false;
        ArrayList arrayList = new ArrayList();
        while (c0095a5.d() >= 3) {
            int i14 = c0095a5.f1464b;
            int t7 = c0095a5.t();
            int y4 = c0095a5.y();
            int i15 = c0095a5.f1463a + y4;
            C1305b c1305b = null;
            if (i15 > i14) {
                c0095a5.D(i14);
                c0095a2 = c0095a5;
                c3 = c4;
                i8 = i10;
                c0095a = c0095a7;
            } else {
                int[] iArr = c1434a.f15236b;
                if (t7 != 128) {
                    switch (t7) {
                        case 20:
                            if (y4 % 5 == i11) {
                                c0095a5.E(i11);
                                Arrays.fill(iArr, i10);
                                int i16 = y4 / 5;
                                int i17 = i10;
                                while (i17 < i16) {
                                    int t8 = c0095a5.t();
                                    double t9 = c0095a5.t();
                                    double t10 = c0095a5.t() - 128;
                                    double t11 = c0095a5.t() - 128;
                                    iArr[t8] = t.j((int) ((t11 * 1.772d) + t9), 0, 255) | (c0095a5.t() << 24) | (t.j((int) ((1.402d * t10) + t9), 0, 255) << 16) | (t.j((int) ((t9 - (0.34414d * t11)) - (t10 * 0.71414d)), 0, 255) << 8);
                                    i17++;
                                    c0095a7 = c0095a7;
                                    c4 = 255;
                                    c0095a5 = c0095a5;
                                }
                                c0095a3 = c0095a5;
                                c3 = c4;
                                c0095a4 = c0095a7;
                                c1434a.f15237c = true;
                                break;
                            }
                            c0095a3 = c0095a5;
                            c3 = c4;
                            c0095a4 = c0095a7;
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            if (y4 >= i9) {
                                c0095a5.E(3);
                                int i18 = y4 - 4;
                                if (((c0095a5.t() & 128) != 0 ? 1 : i10) != 0) {
                                    if (i18 >= 7 && (v6 = c0095a5.v()) >= i9) {
                                        c1434a.f15242h = c0095a5.y();
                                        c1434a.f15243i = c0095a5.y();
                                        c0095a7.A(v6 - i9);
                                        i18 = y4 - 11;
                                    }
                                }
                                int i19 = c0095a7.f1463a;
                                int i20 = c0095a7.f1464b;
                                if (i19 < i20 && i18 > 0) {
                                    int min = Math.min(i18, i20 - i19);
                                    c0095a5.f((byte[]) c0095a7.f1465c, i19, min);
                                    c0095a7.D(i19 + min);
                                }
                            }
                            c0095a3 = c0095a5;
                            c3 = c4;
                            c0095a4 = c0095a7;
                            break;
                        case 22:
                            if (y4 >= 19) {
                                c1434a.f15238d = c0095a5.y();
                                c1434a.f15239e = c0095a5.y();
                                c0095a5.E(11);
                                c1434a.f15240f = c0095a5.y();
                                c1434a.f15241g = c0095a5.y();
                            }
                            c0095a3 = c0095a5;
                            c3 = c4;
                            c0095a4 = c0095a7;
                            break;
                        default:
                            c0095a3 = c0095a5;
                            c3 = c4;
                            c0095a4 = c0095a7;
                            break;
                    }
                    c0095a = c0095a4;
                    c0095a2 = c0095a3;
                    i8 = 0;
                } else {
                    C0095a c0095a8 = c0095a5;
                    c3 = c4;
                    C0095a c0095a9 = c0095a7;
                    if (c1434a.f15238d == 0 || c1434a.f15239e == 0 || c1434a.f15242h == 0 || c1434a.f15243i == 0) {
                        c0095a = c0095a9;
                    } else {
                        c0095a = c0095a9;
                        int i21 = c0095a.f1464b;
                        if (i21 != 0 && c0095a.f1463a == i21 && c1434a.f15237c) {
                            c0095a.D(0);
                            int i22 = c1434a.f15242h * c1434a.f15243i;
                            int[] iArr2 = new int[i22];
                            int i23 = 0;
                            while (i23 < i22) {
                                int t12 = c0095a.t();
                                if (t12 != 0) {
                                    iArr2[i23] = iArr[t12];
                                    i23++;
                                } else {
                                    int t13 = c0095a.t();
                                    if (t13 != 0) {
                                        int t14 = ((t13 & 64) == 0 ? t13 & 63 : ((t13 & 63) << 8) | c0095a.t()) + i23;
                                        Arrays.fill(iArr2, i23, t14, (t13 & 128) == 0 ? 0 : iArr[c0095a.t()]);
                                        i23 = t14;
                                    }
                                }
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr2, c1434a.f15242h, c1434a.f15243i, Bitmap.Config.ARGB_8888);
                            float f7 = c1434a.f15240f;
                            float f8 = c1434a.f15238d;
                            float f9 = f7 / f8;
                            float f10 = c1434a.f15241g;
                            float f11 = c1434a.f15239e;
                            c1305b = new C1305b(null, null, null, createBitmap, f10 / f11, 0, 0, f9, 0, Integer.MIN_VALUE, -3.4028235E38f, c1434a.f15242h / f8, c1434a.f15243i / f11, false, -16777216, Integer.MIN_VALUE, 0.0f);
                        }
                    }
                    i8 = 0;
                    c1434a.f15238d = 0;
                    c1434a.f15239e = 0;
                    c1434a.f15240f = 0;
                    c1434a.f15241g = 0;
                    c1434a.f15242h = 0;
                    c1434a.f15243i = 0;
                    c0095a.A(0);
                    c1434a.f15237c = false;
                    c0095a2 = c0095a8;
                }
                c0095a2.D(i15);
            }
            C1305b c1305b2 = c1305b;
            if (c1305b2 != null) {
                arrayList.add(c1305b2);
            }
            c0095a7 = c0095a;
            i10 = i8;
            c4 = c3;
            i9 = 4;
            i11 = 2;
            c0095a5 = c0095a2;
        }
        return new C1388j(1, Collections.unmodifiableList(arrayList));
        inflater.reset();
        C1434a c1434a2 = this.f15246F;
        c1434a2.f15238d = 0;
        c1434a2.f15239e = 0;
        c1434a2.f15240f = 0;
        c1434a2.f15241g = 0;
        c1434a2.f15242h = 0;
        c1434a2.f15243i = 0;
        C0095a c0095a72 = c1434a2.f15235a;
        c0095a72.A(0);
        c1434a2.f15237c = false;
        ArrayList arrayList2 = new ArrayList();
        while (c0095a5.d() >= 3) {
        }
        return new C1388j(1, Collections.unmodifiableList(arrayList2));
    }
}
