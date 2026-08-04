package p098n4;

import A1.x0;
import B1.m;
import p063i4.b;
import p063i4.c;
import p096n1.e;
import p134s4.h;
import v4.r;

/* JADX INFO: renamed from: n4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0936i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15433d;

    public /* synthetic */ RunnableC0936i(Object obj, c cVar, b bVar, int i7) {
        this.f15430a = i7;
        this.f15433d = obj;
        this.f15431b = cVar;
        this.f15432c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15430a) {
            case 0:
                ((m) this.f15433d).m((c) this.f15431b, false, (b) this.f15432c);
                break;
            case 1:
                ((C0939l) this.f15433d).f15445b.m((c) this.f15431b, false, (b) this.f15432c);
                break;
            default:
                x0 x0Var = (x0) this.f15432c;
                e eVar = ((C0940m) x0Var.f613b).f15456d;
                h hVar = (h) this.f15433d;
                r rVar = (r) eVar.f15314b;
                C0934g c0934g = hVar.f16178a;
                r rVarG = rVar.g(c0934g);
                if (!rVarG.isEmpty()) {
                    C0940m c0940m = (C0940m) x0Var.f613b;
                    c0940m.m(c0940m.f15464m.g(c0934g, rVarG));
                    ((M) this.f15431b).d(null);
                }
                break;
        }
    }

    public RunnableC0936i(x0 x0Var, h hVar, M m7) {
        this.f15430a = 2;
        this.f15432c = x0Var;
        this.f15433d = hVar;
        this.f15431b = m7;
    }
}
