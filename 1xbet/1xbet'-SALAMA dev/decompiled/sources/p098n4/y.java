package p098n4;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import p106o4.c;
import p106o4.d;
import p120q4.k;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0934g f15508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0929b f15509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0929b f15511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f15512f;

    public y(D d7, boolean z4, C0934g c0934g, C0929b c0929b, long j, C0929b c0929b2) {
        this.f15512f = d7;
        this.f15507a = z4;
        this.f15508b = c0934g;
        this.f15509c = c0929b;
        this.f15510d = j;
        this.f15511e = c0929b2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4 = this.f15507a;
        long j = this.f15510d;
        C0934g c0934g = this.f15508b;
        D d7 = this.f15512f;
        if (z4) {
            d7.f15371g.k(j, this.f15509c, c0934g);
        }
        M m7 = d7.f15366b;
        Long lValueOf = Long.valueOf(j);
        m7.getClass();
        k.c(j > ((Long) m7.f15391c).longValue());
        ArrayList arrayList = (ArrayList) m7.f15390b;
        C0929b c0929b = this.f15511e;
        arrayList.add(new H(j, c0929b, c0934g));
        m7.f15389a = ((C0929b) m7.f15389a).m(c0934g, c0929b);
        m7.f15391c = lValueOf;
        return D.a(d7, new c(d.f15611d, c0934g, c0929b));
    }
}
