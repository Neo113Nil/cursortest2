package L3;

import L3.K;
import io.sentry.j3;
import j3.Q;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16246c;

    public /* synthetic */ B(int i11, Object obj, Object obj2) {
        this.f16244a = i11;
        this.f16245b = obj;
        this.f16246c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16244a) {
            case 0:
                K.a.f((K.a) this.f16245b, (Q) this.f16246c);
                break;
            case 1:
                io.sentry.android.ndk.f.t((io.sentry.android.ndk.f) this.f16245b, (j3) this.f16246c);
                break;
            default:
                io.sentry.cache.l.w((io.sentry.cache.l) this.f16245b, (String) this.f16246c);
                break;
        }
    }
}
