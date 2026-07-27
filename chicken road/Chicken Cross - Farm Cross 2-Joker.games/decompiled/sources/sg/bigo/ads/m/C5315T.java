package sg.bigo.ads.m;

import sg.bigo.ads.h.AbstractC5140Q;

/* renamed from: sg.bigo.ads.m.T, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5315T extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5316U f13067a;

    public C5315T(RunnableC5316U runnableC5316U) {
        this.f13067a = runnableC5316U;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        RunnableC5316U runnableC5316U = this.f13067a;
        if (runnableC5316U.c == null || !((Boolean) runnableC5316U.b.second).booleanValue()) {
            return;
        }
        AbstractC5140Q.a(this.f13067a.c);
    }
}
