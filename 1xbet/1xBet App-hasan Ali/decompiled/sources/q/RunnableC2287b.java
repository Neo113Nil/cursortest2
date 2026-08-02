package q;

import android.os.Bundle;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2287b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18838k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BinderC2290e f18839l;

    public /* synthetic */ RunnableC2287b(BinderC2290e binderC2290e, Bundle bundle, int i) {
        this.f18838k = i;
        this.f18839l = binderC2290e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18838k) {
            case 0:
                this.f18839l.f18850l.getClass();
                break;
            case 1:
                this.f18839l.f18850l.getClass();
                break;
            case 2:
                this.f18839l.f18850l.getClass();
                break;
            default:
                this.f18839l.f18850l.getClass();
                break;
        }
    }

    public RunnableC2287b(BinderC2290e binderC2290e, int i, int i5, int i6, int i7, int i8, Bundle bundle) {
        this.f18838k = 2;
        this.f18839l = binderC2290e;
    }
}
