package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final G1 f8645a = new G1();

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f8646b = new C1617tm(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    public int f8647c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8648d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8649e;

    public final boolean a(B b3) {
        int i;
        boolean z3 = this.f8649e;
        C1617tm c1617tm = this.f8646b;
        if (z3) {
            this.f8649e = false;
            c1617tm.g(0);
        }
        while (true) {
            if (this.f8649e) {
                return true;
            }
            int i5 = this.f8647c;
            G1 g12 = this.f8645a;
            if (i5 < 0) {
                if (!g12.b(b3, -1L) || !g12.a(b3, true)) {
                    break;
                }
                int i6 = g12.f9155d;
                if ((g12.f9152a & 1) == 1 && c1617tm.f15726c == 0) {
                    i6 += b(0);
                    i = this.f8648d;
                } else {
                    i = 0;
                }
                try {
                    b3.k(i6);
                    this.f8647c = i;
                    i5 = i;
                } catch (EOFException unused) {
                }
            }
            int b5 = b(i5);
            int i7 = this.f8647c + this.f8648d;
            if (b5 > 0) {
                c1617tm.e(c1617tm.f15726c + b5);
                b3.F(c1617tm.f15724a, c1617tm.f15726c, b5, false);
                c1617tm.i(c1617tm.f15726c + b5);
                this.f8649e = g12.f[i7 + (-1)] != 255;
            }
            if (i7 == g12.f9154c) {
                i7 = -1;
            }
            this.f8647c = i7;
        }
        return false;
    }

    public final int b(int i) {
        int i5;
        int i6 = 0;
        this.f8648d = 0;
        do {
            int i7 = this.f8648d;
            int i8 = i + i7;
            G1 g12 = this.f8645a;
            if (i8 >= g12.f9154c) {
                break;
            }
            this.f8648d = i7 + 1;
            i5 = g12.f[i8];
            i6 += i5;
        } while (i5 == 255);
        return i6;
    }
}
