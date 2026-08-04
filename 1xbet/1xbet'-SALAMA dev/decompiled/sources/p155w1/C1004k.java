package p155w1;

import android.content.Context;

/* JADX INFO: renamed from: w1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1004k extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17761b;

    public C1004k(int i7, Context context) {
        this.f17760a = i7;
        this.f17761b = context;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        int i7 = this.f17760a;
        if (i7 != 0) {
            V0.d().h(this.f17761b, null);
        }
        if ((i7 & 1) == 1) {
            T0 t0A = T0.a();
            t0A.f17548f = true;
            if (t0A.f17550h) {
                t0A.c();
            }
        }
        if ((i7 & 2) == 2) {
            X0.a().f17585d = true;
        }
    }
}
