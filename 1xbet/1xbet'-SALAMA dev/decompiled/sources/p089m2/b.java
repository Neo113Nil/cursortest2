package p089m2;

import C1.C0095a;
import android.graphics.Bitmap;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p068j2.e;
import p068j2.f;
import p081l2.j;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0095a f15250D = new C0095a(4, false);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0095a f15251E = new C0095a(4, false);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final a f15252F = new a();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Inflater f15253G;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    @Override // p068j2.e
    public final f e(byte[] bArr, int i7, boolean z4) {
        char c3;
        C0095a c0095a;
        int i8;
        C0095a c0095a2;
        C0095a c0095a3;
        C0095a c0095a4;
        int i9;
        int i10;
        int iV;
        int i11 = 4;
        C0095a c0095a5 = this.f15250D;
        c0095a5.B(i7, bArr);
        char c4 = 255;
        int i12 = 0;
        int i13 = 2;
        if (c0095a5.d() > 0 && (((byte[]) c0095a5.f1465c)[c0095a5.f1463a] & 255) == 120) {
            if (this.f15253G == null) {
                this.f15253G = new Inflater();
            }
            Inflater inflater = this.f15253G;
            int i14 = t.f17159a;
            if (c0095a5.d() > 0) {
                C0095a c0095a6 = this.f15251E;
                if (((byte[]) c0095a6.f1465c).length < c0095a5.d()) {
                    c0095a6.e(c0095a5.d() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput((byte[]) c0095a5.f1465c, c0095a5.f1463a, c0095a5.d());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr2 = (byte[]) c0095a6.f1465c;
                        iInflate += inflater.inflate(bArr2, iInflate, bArr2.length - iInflate);
                        if (!inflater.finished()) {
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr3 = (byte[]) c0095a6.f1465c;
                                if (iInflate == bArr3.length) {
                                    c0095a6.e(bArr3.length * 2);
                                }
                            }
                            inflater.reset();
                            break;
                        }
                        c0095a6.C(iInflate);
                        inflater.reset();
                        c0095a5.B(c0095a6.f1464b, (byte[]) c0095a6.f1465c);
                        break;
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
            }
        }
        a aVar = this.f15252F;
        aVar.f15244d = 0;
        aVar.f15245e = 0;
        aVar.f15246f = 0;
        aVar.f15247g = 0;
        aVar.f15248h = 0;
        aVar.f15249i = 0;
        C0095a c0095a7 = aVar.f15241a;
        c0095a7.A(0);
        aVar.f15243c = false;
        ArrayList arrayList = new ArrayList();
        while (c0095a5.d() >= 3) {
            int i15 = c0095a5.f1464b;
            int iT = c0095a5.t();
            int iY = c0095a5.y();
            int i16 = c0095a5.f1463a + iY;
            p068j2.b bVar = null;
            if (i16 > i15) {
                c0095a5.D(i15);
                c0095a2 = c0095a5;
                c3 = c4;
                i8 = i12;
                c0095a = c0095a7;
            } else {
                int[] iArr = aVar.f15242b;
                if (iT != 128) {
                    switch (iT) {
                        case 20:
                            if (iY % 5 == i13) {
                                c0095a5.E(i13);
                                Arrays.fill(iArr, i12);
                                int i17 = iY / 5;
                                int i18 = i12;
                                while (i18 < i17) {
                                    int iT2 = c0095a5.t();
                                    double dT = c0095a5.t();
                                    double dT2 = c0095a5.t() - 128;
                                    double dT3 = c0095a5.t() - 128;
                                    iArr[iT2] = t.j((int) ((dT3 * 1.772d) + dT), 0, 255) | (c0095a5.t() << 24) | (t.j((int) ((1.402d * dT2) + dT), 0, 255) << 16) | (t.j((int) ((dT - (0.34414d * dT3)) - (dT2 * 0.71414d)), 0, 255) << 8);
                                    i18++;
                                    c0095a7 = c0095a7;
                                    c4 = 255;
                                    c0095a5 = c0095a5;
                                }
                                c0095a3 = c0095a5;
                                c3 = c4;
                                c0095a4 = c0095a7;
                                aVar.f15243c = true;
                            } else {
                                c0095a3 = c0095a5;
                                c3 = c4;
                                c0095a4 = c0095a7;
                            }
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            if (iY >= i11) {
                                c0095a5.E(3);
                                int i19 = iY - 4;
                                if (((c0095a5.t() & 128) != 0 ? 1 : i12) == 0) {
                                    i9 = c0095a7.f1463a;
                                    i10 = c0095a7.f1464b;
                                    if (i9 < i10 && i19 > 0) {
                                        int iMin = Math.min(i19, i10 - i9);
                                        c0095a5.f((byte[]) c0095a7.f1465c, i9, iMin);
                                        c0095a7.D(i9 + iMin);
                                    }
                                } else if (i19 >= 7 && (iV = c0095a5.v()) >= i11) {
                                    aVar.f15248h = c0095a5.y();
                                    aVar.f15249i = c0095a5.y();
                                    c0095a7.A(iV - i11);
                                    i19 = iY - 11;
                                    i9 = c0095a7.f1463a;
                                    i10 = c0095a7.f1464b;
                                    if (i9 < i10) {
                                        int iMin2 = Math.min(i19, i10 - i9);
                                        c0095a5.f((byte[]) c0095a7.f1465c, i9, iMin2);
                                        c0095a7.D(i9 + iMin2);
                                    }
                                }
                            }
                            c0095a3 = c0095a5;
                            c3 = c4;
                            c0095a4 = c0095a7;
                            break;
                        case 22:
                            if (iY >= 19) {
                                aVar.f15244d = c0095a5.y();
                                aVar.f15245e = c0095a5.y();
                                c0095a5.E(11);
                                aVar.f15246f = c0095a5.y();
                                aVar.f15247g = c0095a5.y();
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
                    if (aVar.f15244d == 0 || aVar.f15245e == 0 || aVar.f15248h == 0 || aVar.f15249i == 0) {
                        c0095a = c0095a9;
                    } else {
                        c0095a = c0095a9;
                        int i20 = c0095a.f1464b;
                        if (i20 != 0 && c0095a.f1463a == i20 && aVar.f15243c) {
                            c0095a.D(0);
                            int i21 = aVar.f15248h * aVar.f15249i;
                            int[] iArr2 = new int[i21];
                            int i22 = 0;
                            while (i22 < i21) {
                                int iT3 = c0095a.t();
                                if (iT3 != 0) {
                                    iArr2[i22] = iArr[iT3];
                                    i22++;
                                } else {
                                    int iT4 = c0095a.t();
                                    if (iT4 != 0) {
                                        int iT5 = ((iT4 & 64) == 0 ? iT4 & 63 : ((iT4 & 63) << 8) | c0095a.t()) + i22;
                                        Arrays.fill(iArr2, i22, iT5, (iT4 & 128) == 0 ? 0 : iArr[c0095a.t()]);
                                        i22 = iT5;
                                    }
                                }
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, aVar.f15248h, aVar.f15249i, Bitmap.Config.ARGB_8888);
                            float f7 = aVar.f15246f;
                            float f8 = aVar.f15244d;
                            float f9 = f7 / f8;
                            float f10 = aVar.f15247g;
                            float f11 = aVar.f15245e;
                            bVar = new p068j2.b(null, null, null, bitmapCreateBitmap, f10 / f11, 0, 0, f9, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.f15248h / f8, aVar.f15249i / f11, false, -16777216, Integer.MIN_VALUE, 0.0f);
                        }
                    }
                    i8 = 0;
                    aVar.f15244d = 0;
                    aVar.f15245e = 0;
                    aVar.f15246f = 0;
                    aVar.f15247g = 0;
                    aVar.f15248h = 0;
                    aVar.f15249i = 0;
                    c0095a.A(0);
                    aVar.f15243c = false;
                    c0095a2 = c0095a8;
                }
                c0095a2.D(i16);
            }
            p068j2.b bVar2 = bVar;
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
            c0095a7 = c0095a;
            i12 = i8;
            c4 = c3;
            i11 = 4;
            i13 = 2;
            c0095a5 = c0095a2;
        }
        return new j(1, Collections.unmodifiableList(arrayList));
    }
}
