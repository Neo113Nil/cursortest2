package p098n4;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p106o4.c;
import p106o4.d;
import p106o4.e;
import p114p4.a;
import p134s4.h;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f15483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0934g f15484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f15485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15486e;

    public /* synthetic */ t(D d7, E e7, C0934g c0934g, Object obj, int i7) {
        this.f15482a = i7;
        this.f15485d = d7;
        this.f15483b = e7;
        this.f15484c = c0934g;
        this.f15486e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15482a) {
            case 0:
                E e7 = this.f15483b;
                D d7 = this.f15485d;
                h hVar = (h) d7.f15367c.get(e7);
                if (hVar == null) {
                    return Collections.emptyList();
                }
                C0934g c0934g = this.f15484c;
                C0934g c0934gD = C0934g.D(hVar.f16178a, c0934g);
                C0929b c0929bA = C0929b.A((HashMap) this.f15486e);
                d7.f15371g.b(c0934g, c0929bA);
                return D.b(d7, hVar, new c(new d(2, hVar.f16179b, true), c0934gD, c0929bA));
            default:
                D d8 = this.f15485d;
                h hVar2 = (h) d8.f15367c.get(this.f15483b);
                if (hVar2 == null) {
                    return Collections.emptyList();
                }
                C0934g c0934g2 = hVar2.f16178a;
                C0934g c0934g3 = this.f15484c;
                C0934g c0934gD2 = C0934g.D(c0934g2, c0934g3);
                h hVarA = c0934gD2.isEmpty() ? hVar2 : h.a(c0934g3);
                a aVar = d8.f15371g;
                r rVar = (r) this.f15486e;
                aVar.v(hVarA, rVar);
                return D.b(d8, hVar2, new e(new d(2, hVar2.f16179b, true), c0934gD2, rVar));
        }
    }
}
