package w1;

import android.content.Context;

/* renamed from: w1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713k extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17755b;

    public C1713k(int i7, Context context) {
        this.f17754a = i7;
        this.f17755b = context;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        int i7 = this.f17754a;
        if (i7 != 0) {
            V0.d().h(this.f17755b, null);
        }
        if ((i7 & 1) == 1) {
            T0 a2 = T0.a();
            a2.f17542f = true;
            if (a2.f17544h) {
                a2.c();
            }
        }
        if ((i7 & 2) == 2) {
            X0.a().f17579d = true;
        }
    }
}
