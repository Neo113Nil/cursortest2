package q;

import android.os.Bundle;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2288c implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18840k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f18841l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f18842m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC2290e f18843n;

    public /* synthetic */ RunnableC2288c(BinderC2290e binderC2290e, String str, Bundle bundle, int i) {
        this.f18840k = i;
        this.f18843n = binderC2290e;
        this.f18841l = str;
        this.f18842m = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18840k) {
            case 0:
                this.f18843n.f18850l.a(this.f18841l, this.f18842m);
                break;
            default:
                this.f18843n.f18850l.f(this.f18841l, this.f18842m);
                break;
        }
    }
}
