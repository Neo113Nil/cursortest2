package p134s4;

import p063i4.c;
import p098n4.AbstractC0933f;
import p098n4.C0934g;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0934g f16156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0933f f16157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16158c;

    public b(AbstractC0933f abstractC0933f, c cVar, C0934g c0934g) {
        this.f16157b = abstractC0933f;
        this.f16156a = c0934g;
        this.f16158c = cVar;
    }

    @Override // p134s4.e
    public final void a() {
        this.f16157b.c(this.f16158c);
    }

    @Override // p134s4.e
    public final String toString() {
        return this.f16156a + ":CANCEL";
    }
}
