package c2;

import A1.H0;
import java.util.ArrayList;
import v2.AbstractC1664a;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798d implements InterfaceC0794B, InterfaceC0793A {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0794B f10316a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0793A f10317b;

    /* renamed from: c, reason: collision with root package name */
    public C0797c[] f10318c = new C0797c[0];

    /* renamed from: d, reason: collision with root package name */
    public long f10319d;

    /* renamed from: e, reason: collision with root package name */
    public long f10320e;

    /* renamed from: f, reason: collision with root package name */
    public long f10321f;

    /* renamed from: x, reason: collision with root package name */
    public C0800f f10322x;

    public C0798d(InterfaceC0794B interfaceC0794B, boolean z4, long j, long j3) {
        this.f10316a = interfaceC0794B;
        this.f10319d = z4 ? j : -9223372036854775807L;
        this.f10320e = j;
        this.f10321f = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0123, code lost:
    
        if (r1 > r3) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    @Override // c2.InterfaceC0794B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long I(t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        long j3;
        boolean z4;
        B1.l e7;
        int a2;
        this.f10318c = new C0797c[wArr.length];
        W[] wArr2 = new W[wArr.length];
        int i7 = 0;
        while (true) {
            W w7 = null;
            if (i7 >= wArr.length) {
                break;
            }
            C0797c[] c0797cArr = this.f10318c;
            C0797c c0797c = (C0797c) wArr[i7];
            c0797cArr[i7] = c0797c;
            if (c0797c != null) {
                w7 = c0797c.f10309a;
            }
            wArr2[i7] = w7;
            i7++;
        }
        long I7 = this.f10316a.I(cVarArr, zArr, wArr2, zArr2, j);
        if (a()) {
            long j7 = this.f10320e;
            if (j == j7 && j7 != 0) {
                for (t2.c cVar : cVarArr) {
                    if (cVar != null) {
                        A1.X x4 = cVar.f16299d[cVar.e()];
                        String str = x4.f283C;
                        ArrayList arrayList = v2.i.f17109a;
                        if (str != null) {
                            switch (str) {
                                case "audio/mp4a-latm":
                                    String str2 = x4.f312z;
                                    if (str2 != null && (e7 = v2.i.e(str2)) != null && (a2 = e7.a()) != 0 && a2 != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.f10319d = j3;
                            if (I7 != j) {
                                if (I7 >= this.f10320e) {
                                    long j8 = this.f10321f;
                                    if (j8 != Long.MIN_VALUE) {
                                    }
                                }
                                z4 = false;
                                AbstractC1664a.h(z4);
                                for (int i8 = 0; i8 < wArr.length; i8++) {
                                    W w8 = wArr2[i8];
                                    if (w8 == null) {
                                        this.f10318c[i8] = null;
                                    } else {
                                        C0797c[] c0797cArr2 = this.f10318c;
                                        C0797c c0797c2 = c0797cArr2[i8];
                                        if (c0797c2 == null || c0797c2.f10309a != w8) {
                                            c0797cArr2[i8] = new C0797c(this, w8);
                                        }
                                    }
                                    wArr[i8] = this.f10318c[i8];
                                }
                                return I7;
                            }
                            z4 = true;
                            AbstractC1664a.h(z4);
                            while (i8 < wArr.length) {
                            }
                            return I7;
                        }
                        j3 = I7;
                        this.f10319d = j3;
                        if (I7 != j) {
                        }
                        z4 = true;
                        AbstractC1664a.h(z4);
                        while (i8 < wArr.length) {
                        }
                        return I7;
                    }
                }
            }
        }
        j3 = -9223372036854775807L;
        this.f10319d = j3;
        if (I7 != j) {
        }
        z4 = true;
        AbstractC1664a.h(z4);
        while (i8 < wArr.length) {
        }
        return I7;
    }

    @Override // c2.InterfaceC0794B
    public final long M() {
        if (a()) {
            long j = this.f10319d;
            this.f10319d = -9223372036854775807L;
            long M7 = M();
            return M7 != -9223372036854775807L ? M7 : j;
        }
        long M8 = this.f10316a.M();
        if (M8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1664a.h(M8 >= this.f10320e);
        long j3 = this.f10321f;
        AbstractC1664a.h(j3 == Long.MIN_VALUE || M8 <= j3);
        return M8;
    }

    @Override // c2.InterfaceC0794B
    public final f0 P() {
        return this.f10316a.P();
    }

    @Override // c2.Y
    public final long T() {
        long T6 = this.f10316a.T();
        if (T6 != Long.MIN_VALUE) {
            long j = this.f10321f;
            if (j == Long.MIN_VALUE || T6 < j) {
                return T6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // c2.Y
    public final void Y(long j) {
        this.f10316a.Y(j);
    }

    public final boolean a() {
        return this.f10319d != -9223372036854775807L;
    }

    @Override // c2.X
    public final void b(Y y4) {
        InterfaceC0793A interfaceC0793A = this.f10317b;
        interfaceC0793A.getClass();
        interfaceC0793A.b(this);
    }

    @Override // c2.InterfaceC0793A
    public final void f(InterfaceC0794B interfaceC0794B) {
        if (this.f10322x != null) {
            return;
        }
        InterfaceC0793A interfaceC0793A = this.f10317b;
        interfaceC0793A.getClass();
        interfaceC0793A.f(this);
    }

    @Override // c2.Y
    public final boolean isLoading() {
        return this.f10316a.isLoading();
    }

    @Override // c2.Y
    public final long k() {
        long k7 = this.f10316a.k();
        if (k7 != Long.MIN_VALUE) {
            long j = this.f10321f;
            if (j == Long.MIN_VALUE || k7 < j) {
                return k7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // c2.InterfaceC0794B
    public final long o(long j, H0 h02) {
        long j3 = this.f10320e;
        if (j == j3) {
            return j3;
        }
        long k7 = v2.t.k(h02.f101a, 0L, j - j3);
        long j7 = this.f10321f;
        long k8 = v2.t.k(h02.f102b, 0L, j7 == Long.MIN_VALUE ? Long.MAX_VALUE : j7 - j);
        if (k7 != h02.f101a || k8 != h02.f102b) {
            h02 = new H0(k7, k8);
        }
        return this.f10316a.o(j, h02);
    }

    @Override // c2.InterfaceC0794B
    public final void p(InterfaceC0793A interfaceC0793A, long j) {
        this.f10317b = interfaceC0793A;
        this.f10316a.p(this, j);
    }

    @Override // c2.InterfaceC0794B
    public final void q() {
        C0800f c0800f = this.f10322x;
        if (c0800f != null) {
            throw c0800f;
        }
        this.f10316a.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // c2.InterfaceC0794B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(long j) {
        this.f10319d = -9223372036854775807L;
        boolean z4 = false;
        for (C0797c c0797c : this.f10318c) {
            if (c0797c != null) {
                c0797c.f10310b = false;
            }
        }
        long v6 = this.f10316a.v(j);
        if (v6 != j) {
            if (v6 >= this.f10320e) {
                long j3 = this.f10321f;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            AbstractC1664a.h(z4);
            return v6;
        }
        z4 = true;
        AbstractC1664a.h(z4);
        return v6;
    }

    @Override // c2.InterfaceC0794B
    public final void w(long j) {
        this.f10316a.w(j);
    }

    @Override // c2.Y
    public final boolean y(long j) {
        return this.f10316a.y(j);
    }
}
