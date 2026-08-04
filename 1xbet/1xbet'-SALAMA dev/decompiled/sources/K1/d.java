package K1;

import C0.C0083b;
import F1.r;
import F1.s;
import F1.t;

/* JADX INFO: loaded from: classes.dex */
public final class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f3896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0083b f3897b;

    public d(C0083b c0083b, s sVar) {
        this.f3897b = c0083b;
        this.f3896a = sVar;
    }

    @Override // F1.s
    public final boolean d() {
        return this.f3896a.d();
    }

    @Override // F1.s
    public final r h(long j) {
        r rVarH = this.f3896a.h(j);
        t tVar = rVarH.f2567a;
        long j3 = tVar.f2570a;
        long j7 = tVar.f2571b;
        long j8 = this.f3897b.f1246b;
        t tVar2 = new t(j3, j7 + j8);
        t tVar3 = rVarH.f2568b;
        return new r(tVar2, new t(tVar3.f2570a, tVar3.f2571b + j8));
    }

    @Override // F1.s
    public final long i() {
        return this.f3896a.i();
    }
}
