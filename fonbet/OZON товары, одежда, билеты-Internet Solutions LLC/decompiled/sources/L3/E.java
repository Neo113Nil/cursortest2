package L3;

import L3.K;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f16255c;

    public /* synthetic */ E(Object obj, Serializable serializable, int i11) {
        this.f16253a = i11;
        this.f16254b = obj;
        this.f16255c = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16253a) {
            case 0:
                K.a.i((K.a) this.f16254b, (String) this.f16255c);
                break;
            default:
                ((io.sentry.cache.l) this.f16254b).K((ConcurrentHashMap) this.f16255c, "tags.json");
                break;
        }
    }
}
