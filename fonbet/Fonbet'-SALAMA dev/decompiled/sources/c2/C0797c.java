package c2;

import com.google.android.exoplayer2.Format$Builder;
import w1.V0;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797c implements W {

    /* renamed from: a, reason: collision with root package name */
    public final W f10309a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0798d f10311c;

    public C0797c(C0798d c0798d, W w7) {
        this.f10311c = c0798d;
        this.f10309a = w7;
    }

    @Override // c2.W
    public final boolean b() {
        return !this.f10311c.a() && this.f10309a.b();
    }

    @Override // c2.W
    public final void c() {
        this.f10309a.c();
    }

    @Override // c2.W
    public final int d(long j) {
        if (this.f10311c.a()) {
            return -3;
        }
        return this.f10309a.d(j);
    }

    @Override // c2.W
    public final int e(V0 v02, D1.h hVar, int i7) {
        C0798d c0798d = this.f10311c;
        if (c0798d.a()) {
            return -3;
        }
        if (this.f10310b) {
            hVar.f1675b = 4;
            return -4;
        }
        int e7 = this.f10309a.e(v02, hVar, i7);
        if (e7 != -5) {
            long j = c0798d.f10321f;
            if (j == Long.MIN_VALUE || ((e7 != -4 || hVar.f1699f < j) && !(e7 == -3 && c0798d.T() == Long.MIN_VALUE && !hVar.f1698e))) {
                return e7;
            }
            hVar.t();
            hVar.f1675b = 4;
            this.f10310b = true;
            return -4;
        }
        A1.X x4 = (A1.X) v02.f17563c;
        x4.getClass();
        int i8 = x4.f300T;
        int i9 = x4.f299S;
        if (i9 != 0 || i8 != 0) {
            if (c0798d.f10320e != 0) {
                i9 = 0;
            }
            if (c0798d.f10321f != Long.MIN_VALUE) {
                i8 = 0;
            }
            Format$Builder a2 = x4.a();
            a2.f10524A = i9;
            a2.f10525B = i8;
            v02.f17563c = new A1.X(a2);
        }
        return -5;
    }
}
