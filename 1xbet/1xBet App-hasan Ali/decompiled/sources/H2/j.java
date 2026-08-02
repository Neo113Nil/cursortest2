package H2;

import com.google.android.gms.internal.ads.Bi;
import com.google.android.gms.internal.ads.Ei;

/* loaded from: classes.dex */
public final class j implements h, Ei {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2299k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2300l;

    public /* synthetic */ j(int i) {
        this.f2299k = i;
    }

    @Override // H2.h
    public boolean a(F2.h hVar) {
        return this.f2300l;
    }

    @Override // H2.h
    public boolean b() {
        return this.f2300l;
    }

    public synchronized void c() {
        while (!this.f2300l) {
            wait();
        }
    }

    public synchronized void d() {
        boolean z3 = false;
        while (!this.f2300l) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z3 = true;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void e() {
        this.f2300l = false;
    }

    public synchronized boolean f() {
        if (this.f2300l) {
            return false;
        }
        this.f2300l = true;
        notifyAll();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        Bi bi = (Bi) obj;
        switch (this.f2299k) {
            case 3:
                bi.k(this.f2300l);
                break;
            default:
                bi.o0(this.f2300l);
                break;
        }
    }

    public /* synthetic */ j(int i, boolean z3) {
        this.f2299k = i;
        this.f2300l = z3;
    }
}
