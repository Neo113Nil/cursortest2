package p018c2;

import A1.X;
import D1.h;
import com.google.android.exoplayer2.Format$Builder;
import p155w1.V0;

/* JADX INFO: renamed from: c2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0757c implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f10309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0758d f10311c;

    public C0757c(C0758d c0758d, W w7) {
        this.f10311c = c0758d;
        this.f10309a = w7;
    }

    @Override // p018c2.W
    public final boolean b() {
        return !this.f10311c.a() && this.f10309a.b();
    }

    @Override // p018c2.W
    public final void c() {
        this.f10309a.c();
    }

    @Override // p018c2.W
    public final int d(long j) {
        if (this.f10311c.a()) {
            return -3;
        }
        return this.f10309a.d(j);
    }

    @Override // p018c2.W
    public final int e(V0 v6, h hVar, int i7) {
        C0758d c0758d = this.f10311c;
        if (c0758d.a()) {
            return -3;
        }
        if (this.f10310b) {
            hVar.f1675b = 4;
            return -4;
        }
        int iE = this.f10309a.e(v6, hVar, i7);
        if (iE != -5) {
            long j = c0758d.f10321f;
            if (j == Long.MIN_VALUE || ((iE != -4 || hVar.f1699f < j) && !(iE == -3 && c0758d.T() == Long.MIN_VALUE && !hVar.f1698e))) {
                return iE;
            }
            hVar.t();
            hVar.f1675b = 4;
            this.f10310b = true;
            return -4;
        }
        X x4 = (X) v6.f17569c;
        x4.getClass();
        int i8 = x4.f300T;
        int i9 = x4.f299S;
        if (i9 != 0 || i8 != 0) {
            if (c0758d.f10320e != 0) {
                i9 = 0;
            }
            if (c0758d.f10321f != Long.MIN_VALUE) {
                i8 = 0;
            }
            Format$Builder format$BuilderA = x4.a();
            format$BuilderA.f10524A = i9;
            format$BuilderA.f10525B = i8;
            v6.f17569c = new X(format$BuilderA);
        }
        return -5;
    }
}
