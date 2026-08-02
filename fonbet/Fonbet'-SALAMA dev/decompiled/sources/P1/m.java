package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import java.util.Collections;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f5245l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final B f5246a;

    /* renamed from: b, reason: collision with root package name */
    public final C0095a f5247b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f5248c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final k f5249d;

    /* renamed from: e, reason: collision with root package name */
    public final u f5250e;

    /* renamed from: f, reason: collision with root package name */
    public l f5251f;

    /* renamed from: g, reason: collision with root package name */
    public long f5252g;

    /* renamed from: h, reason: collision with root package name */
    public String f5253h;

    /* renamed from: i, reason: collision with root package name */
    public F1.v f5254i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f5255k;

    public m(B b7) {
        this.f5246a = b7;
        k kVar = new k();
        kVar.f5236e = new byte[128];
        this.f5249d = kVar;
        this.f5255k = -9223372036854775807L;
        this.f5250e = new u(178);
        this.f5247b = new C0095a(4, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0281 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    @Override // P1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0095a c0095a) {
        int i7;
        int i8;
        boolean z4;
        l lVar;
        long j;
        int i9;
        float f7;
        C0095a c0095a2 = c0095a;
        boolean z7 = true;
        AbstractC1664a.i(this.f5251f);
        AbstractC1664a.i(this.f5254i);
        int i10 = c0095a2.f1463a;
        int i11 = c0095a2.f1464b;
        byte[] bArr = (byte[]) c0095a2.f1465c;
        this.f5252g += c0095a.d();
        this.f5254i.c(c0095a.d(), c0095a2);
        while (true) {
            int n2 = AbstractC1664a.n(bArr, i10, i11, this.f5248c);
            k kVar = this.f5249d;
            u uVar = this.f5250e;
            if (n2 == i11) {
                if (!this.j) {
                    kVar.a(bArr, i10, i11);
                }
                this.f5251f.a(bArr, i10, i11);
                if (uVar != null) {
                    uVar.a(bArr, i10, i11);
                    return;
                }
                return;
            }
            int i12 = n2 + 3;
            byte b7 = ((byte[]) c0095a2.f1465c)[i12];
            int i13 = b7 & 255;
            int i14 = n2 - i10;
            if (this.j) {
                i7 = i11;
                i8 = i12;
            } else {
                if (i14 > 0) {
                    kVar.a(bArr, i10, n2);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                int i16 = kVar.f5233b;
                if (i16 != 0) {
                    i8 = i12;
                    if (i16 == z7) {
                        i7 = i11;
                        if (i13 != 181) {
                            Log.w("H263Reader", "Unexpected start code value");
                            kVar.f5232a = false;
                            kVar.f5234c = 0;
                            kVar.f5233b = 0;
                        } else {
                            kVar.f5233b = 2;
                        }
                    } else if (i16 != 2) {
                        i7 = i11;
                        if (i16 != 3) {
                            if (i16 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i13 == 179 || i13 == 181) {
                                kVar.f5234c -= i15;
                                kVar.f5232a = false;
                                F1.v vVar = this.f5254i;
                                int i17 = kVar.f5235d;
                                String str = this.f5253h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(kVar.f5236e, kVar.f5234c);
                                F1.x xVar = new F1.x(copyOf, copyOf.length);
                                xVar.s(i17);
                                xVar.s(4);
                                xVar.q();
                                xVar.r(8);
                                if (xVar.h()) {
                                    xVar.r(4);
                                    xVar.r(3);
                                }
                                int i18 = xVar.i(4);
                                if (i18 == 15) {
                                    int i19 = xVar.i(8);
                                    int i20 = xVar.i(8);
                                    if (i20 == 0) {
                                        Log.w("H263Reader", "Invalid aspect ratio");
                                        f7 = 1.0f;
                                        if (xVar.h()) {
                                            xVar.r(2);
                                            xVar.r(1);
                                            if (xVar.h()) {
                                                xVar.r(15);
                                                xVar.q();
                                                xVar.r(15);
                                                xVar.q();
                                                xVar.r(15);
                                                xVar.q();
                                                xVar.r(3);
                                                xVar.r(11);
                                                xVar.q();
                                                xVar.r(15);
                                                xVar.q();
                                            }
                                        }
                                        if (xVar.i(2) != 0) {
                                            Log.w("H263Reader", "Unhandled video object layer shape");
                                        }
                                        xVar.q();
                                        int i21 = xVar.i(16);
                                        xVar.q();
                                        if (xVar.h()) {
                                            if (i21 == 0) {
                                                Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i22 = 0;
                                                for (int i23 = i21 - 1; i23 > 0; i23 >>= 1) {
                                                    i22++;
                                                }
                                                xVar.r(i22);
                                            }
                                        }
                                        xVar.q();
                                        int i24 = xVar.i(13);
                                        xVar.q();
                                        int i25 = xVar.i(13);
                                        xVar.q();
                                        xVar.q();
                                        Format$Builder format$Builder = new Format$Builder();
                                        format$Builder.f10528a = str;
                                        format$Builder.f10537k = "video/mp4v-es";
                                        format$Builder.f10542p = i24;
                                        format$Builder.f10543q = i25;
                                        format$Builder.f10546t = f7;
                                        format$Builder.f10539m = Collections.singletonList(copyOf);
                                        vVar.a(new X(format$Builder));
                                        this.j = true;
                                    } else {
                                        f7 = i19 / i20;
                                        if (xVar.h()) {
                                        }
                                        if (xVar.i(2) != 0) {
                                        }
                                        xVar.q();
                                        int i212 = xVar.i(16);
                                        xVar.q();
                                        if (xVar.h()) {
                                        }
                                        xVar.q();
                                        int i242 = xVar.i(13);
                                        xVar.q();
                                        int i252 = xVar.i(13);
                                        xVar.q();
                                        xVar.q();
                                        Format$Builder format$Builder2 = new Format$Builder();
                                        format$Builder2.f10528a = str;
                                        format$Builder2.f10537k = "video/mp4v-es";
                                        format$Builder2.f10542p = i242;
                                        format$Builder2.f10543q = i252;
                                        format$Builder2.f10546t = f7;
                                        format$Builder2.f10539m = Collections.singletonList(copyOf);
                                        vVar.a(new X(format$Builder2));
                                        this.j = true;
                                    }
                                } else if (i18 < 7) {
                                    f7 = f5245l[i18];
                                    if (xVar.h()) {
                                    }
                                    if (xVar.i(2) != 0) {
                                    }
                                    xVar.q();
                                    int i2122 = xVar.i(16);
                                    xVar.q();
                                    if (xVar.h()) {
                                    }
                                    xVar.q();
                                    int i2422 = xVar.i(13);
                                    xVar.q();
                                    int i2522 = xVar.i(13);
                                    xVar.q();
                                    xVar.q();
                                    Format$Builder format$Builder22 = new Format$Builder();
                                    format$Builder22.f10528a = str;
                                    format$Builder22.f10537k = "video/mp4v-es";
                                    format$Builder22.f10542p = i2422;
                                    format$Builder22.f10543q = i2522;
                                    format$Builder22.f10546t = f7;
                                    format$Builder22.f10539m = Collections.singletonList(copyOf);
                                    vVar.a(new X(format$Builder22));
                                    this.j = true;
                                } else {
                                    Log.w("H263Reader", "Invalid aspect ratio");
                                    f7 = 1.0f;
                                    if (xVar.h()) {
                                    }
                                    if (xVar.i(2) != 0) {
                                    }
                                    xVar.q();
                                    int i21222 = xVar.i(16);
                                    xVar.q();
                                    if (xVar.h()) {
                                    }
                                    xVar.q();
                                    int i24222 = xVar.i(13);
                                    xVar.q();
                                    int i25222 = xVar.i(13);
                                    xVar.q();
                                    xVar.q();
                                    Format$Builder format$Builder222 = new Format$Builder();
                                    format$Builder222.f10528a = str;
                                    format$Builder222.f10537k = "video/mp4v-es";
                                    format$Builder222.f10542p = i24222;
                                    format$Builder222.f10543q = i25222;
                                    format$Builder222.f10546t = f7;
                                    format$Builder222.f10539m = Collections.singletonList(copyOf);
                                    vVar.a(new X(format$Builder222));
                                    this.j = true;
                                }
                            }
                        } else if ((b7 & 240) != 32) {
                            Log.w("H263Reader", "Unexpected start code value");
                            kVar.f5232a = false;
                            kVar.f5234c = 0;
                            kVar.f5233b = 0;
                        } else {
                            kVar.f5235d = kVar.f5234c;
                            kVar.f5233b = 4;
                        }
                    } else {
                        i7 = i11;
                        if (i13 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            kVar.f5232a = false;
                            kVar.f5234c = 0;
                            kVar.f5233b = 0;
                        } else {
                            kVar.f5233b = 3;
                        }
                    }
                } else {
                    i7 = i11;
                    i8 = i12;
                    if (i13 == 176) {
                        kVar.f5233b = 1;
                        kVar.f5232a = true;
                    }
                }
                kVar.a(k.f5231f, 0, 3);
                this.f5251f.a(bArr, i10, n2);
                if (uVar != null) {
                    if (i14 > 0) {
                        uVar.a(bArr, i10, n2);
                        i9 = 0;
                    } else {
                        i9 = -i14;
                    }
                    if (uVar.b(i9)) {
                        int F7 = AbstractC1664a.F(uVar.f5362e, uVar.f5361d);
                        int i26 = v2.t.f17153a;
                        byte[] bArr2 = uVar.f5361d;
                        C0095a c0095a3 = this.f5247b;
                        c0095a3.B(F7, bArr2);
                        this.f5246a.a(this.f5255k, c0095a3);
                    }
                    if (i13 == 178) {
                        c0095a2 = c0095a;
                        z4 = true;
                        if (((byte[]) c0095a2.f1465c)[n2 + 2] == 1) {
                            uVar.d(i13);
                        }
                        int i27 = i7 - n2;
                        long j3 = this.f5252g - i27;
                        lVar = this.f5251f;
                        boolean z8 = this.j;
                        if (lVar.f5241e == 182 && z8 && lVar.f5238b) {
                            j = lVar.f5244h;
                            if (j != -9223372036854775807L) {
                                lVar.f5237a.e(j, lVar.f5240d ? 1 : 0, (int) (j3 - lVar.f5243g), i27, null);
                            }
                        }
                        if (lVar.f5241e != 179) {
                            lVar.f5243g = j3;
                        }
                        l lVar2 = this.f5251f;
                        long j7 = this.f5255k;
                        lVar2.f5241e = i13;
                        lVar2.f5240d = false;
                        lVar2.f5238b = (i13 != 182 || i13 == 179) ? z4 : false;
                        lVar2.f5239c = i13 == 182 ? z4 : false;
                        lVar2.f5242f = 0;
                        lVar2.f5244h = j7;
                        z7 = z4;
                        i10 = i8;
                        i11 = i7;
                    }
                }
                c0095a2 = c0095a;
                z4 = true;
                int i272 = i7 - n2;
                long j32 = this.f5252g - i272;
                lVar = this.f5251f;
                boolean z82 = this.j;
                if (lVar.f5241e == 182) {
                    j = lVar.f5244h;
                    if (j != -9223372036854775807L) {
                    }
                }
                if (lVar.f5241e != 179) {
                }
                l lVar22 = this.f5251f;
                long j72 = this.f5255k;
                lVar22.f5241e = i13;
                lVar22.f5240d = false;
                lVar22.f5238b = (i13 != 182 || i13 == 179) ? z4 : false;
                lVar22.f5239c = i13 == 182 ? z4 : false;
                lVar22.f5242f = 0;
                lVar22.f5244h = j72;
                z7 = z4;
                i10 = i8;
                i11 = i7;
            }
            this.f5251f.a(bArr, i10, n2);
            if (uVar != null) {
            }
            c0095a2 = c0095a;
            z4 = true;
            int i2722 = i7 - n2;
            long j322 = this.f5252g - i2722;
            lVar = this.f5251f;
            boolean z822 = this.j;
            if (lVar.f5241e == 182) {
            }
            if (lVar.f5241e != 179) {
            }
            l lVar222 = this.f5251f;
            long j722 = this.f5255k;
            lVar222.f5241e = i13;
            lVar222.f5240d = false;
            lVar222.f5238b = (i13 != 182 || i13 == 179) ? z4 : false;
            lVar222.f5239c = i13 == 182 ? z4 : false;
            lVar222.f5242f = 0;
            lVar222.f5244h = j722;
            z7 = z4;
            i10 = i8;
            i11 = i7;
        }
    }

    @Override // P1.h
    public final void b() {
        AbstractC1664a.k(this.f5248c);
        k kVar = this.f5249d;
        kVar.f5232a = false;
        kVar.f5234c = 0;
        kVar.f5233b = 0;
        l lVar = this.f5251f;
        if (lVar != null) {
            lVar.f5238b = false;
            lVar.f5239c = false;
            lVar.f5240d = false;
            lVar.f5241e = -1;
        }
        u uVar = this.f5250e;
        if (uVar != null) {
            uVar.c();
        }
        this.f5252g = 0L;
        this.f5255k = -9223372036854775807L;
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5253h = (String) j.f1238e;
        j.d();
        F1.v r7 = mVar.r(j.f1236c, 2);
        this.f5254i = r7;
        this.f5251f = new l(r7);
        this.f5246a.b(mVar, j);
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5255k = j;
        }
    }

    @Override // P1.h
    public final void d() {
    }
}
