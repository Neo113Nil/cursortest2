package p098n4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import p106o4.d;
import p106o4.e;
import p120q4.k;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0934g f15501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f15502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f15504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f15506g;

    public x(D d7, boolean z4, C0934g c0934g, r rVar, long j, r rVar2, boolean z7) {
        this.f15506g = d7;
        this.f15500a = z4;
        this.f15501b = c0934g;
        this.f15502c = rVar;
        this.f15503d = j;
        this.f15504e = rVar2;
        this.f15505f = z7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4 = this.f15500a;
        C0934g c0934g = this.f15501b;
        D d7 = this.f15506g;
        if (z4) {
            d7.f15371g.p(c0934g, this.f15502c, this.f15503d);
        }
        M m7 = d7.f15366b;
        long j = this.f15503d;
        Long lValueOf = Long.valueOf(j);
        m7.getClass();
        k.c(j > ((Long) m7.f15391c).longValue());
        ArrayList arrayList = (ArrayList) m7.f15390b;
        C0934g c0934g2 = this.f15501b;
        r rVar = this.f15504e;
        boolean z7 = this.f15505f;
        arrayList.add(new H(j, c0934g2, rVar, z7));
        if (z7) {
            m7.f15389a = ((C0929b) m7.f15389a).l(c0934g2, rVar);
        }
        m7.f15391c = lValueOf;
        return !this.f15505f ? Collections.emptyList() : D.a(d7, new e(d.f15611d, c0934g, this.f15504e));
    }
}
