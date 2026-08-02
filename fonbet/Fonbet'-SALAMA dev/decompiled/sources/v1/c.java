package v1;

import java.util.HashMap;
import u1.j;
import w1.C1722m0;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f17073b;

    public /* synthetic */ c(int i7, HashMap hashMap) {
        this.f17072a = i7;
        this.f17073b = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17072a) {
            case 0:
                j.f16701b.c(this.f17073b);
                break;
            case 1:
                C1722m0.f17791c.c(this.f17073b);
                break;
            case 2:
                C1722m0.f17791c.c(this.f17073b);
                break;
            default:
                d.f17074a.c(this.f17073b);
                break;
        }
    }
}
