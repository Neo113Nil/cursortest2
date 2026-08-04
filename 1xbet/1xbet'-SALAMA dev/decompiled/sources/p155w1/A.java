package p155w1;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1054z f17276c;

    public A(C1054z c1054z, boolean z4, String str) {
        this.f17276c = c1054z;
        this.f17274a = z4;
        this.f17275b = str;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        C1054z c1054z = this.f17276c;
        c1054z.f17945b.f17306D.h();
        C c3 = c1054z.f17945b;
        C1048x c1048x = c3.f17306D;
        if (this.f17274a == c1048x.f17921A && this.f17275b.equals(c1048x.f17923z)) {
            return;
        }
        Collections.emptyMap();
        c3.getClass();
        c3.d(new C1054z(c3, 2));
    }
}
