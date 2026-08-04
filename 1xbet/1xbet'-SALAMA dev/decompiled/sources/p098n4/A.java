package p098n4;

import java.util.HashMap;
import java.util.concurrent.Callable;
import p106o4.c;
import p106o4.d;
import p106o4.e;
import p114p4.a;
import p134s4.h;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15360a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0934g f15361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f15362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15363d;

    public A(D d7, C0934g c0934g, r rVar) {
        this.f15362c = d7;
        this.f15361b = c0934g;
        this.f15363d = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15360a) {
            case 0:
                D d7 = this.f15362c;
                a aVar = d7.f15371g;
                C0934g c0934g = this.f15361b;
                h hVarA = h.a(c0934g);
                r rVar = (r) this.f15363d;
                aVar.v(hVarA, rVar);
                return D.a(d7, new e(d.f15612e, c0934g, rVar));
            default:
                C0929b c0929bA = C0929b.A((HashMap) this.f15363d);
                D d8 = this.f15362c;
                a aVar2 = d8.f15371g;
                C0934g c0934g2 = this.f15361b;
                aVar2.b(c0934g2, c0929bA);
                return D.a(d8, new c(d.f15612e, c0934g2, c0929bA));
        }
    }

    public A(D d7, HashMap map, C0934g c0934g) {
        this.f15362c = d7;
        this.f15363d = map;
        this.f15361b = c0934g;
    }
}
