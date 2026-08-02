package L3;

import L3.K;
import io.sentry.C7141f;
import t3.C9737c;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16264c;

    public /* synthetic */ H(int i11, Object obj, Object obj2) {
        this.f16262a = i11;
        this.f16263b = obj;
        this.f16264c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16262a) {
            case 0:
                K.a.e((K.a) this.f16263b, (C9737c) this.f16264c);
                break;
            case 1:
                io.sentry.android.ndk.f.n((io.sentry.android.ndk.f) this.f16263b, (io.sentry.protocol.E) this.f16264c);
                break;
            default:
                io.sentry.cache.l.C((io.sentry.cache.l) this.f16263b, (C7141f) this.f16264c);
                break;
        }
    }
}
