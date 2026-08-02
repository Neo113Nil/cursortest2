package io.sentry.cache;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersistingScopeObserver f14452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f14453c;

    public /* synthetic */ d(PersistingScopeObserver persistingScopeObserver, Map map, int i7) {
        this.f14451a = i7;
        this.f14452b = persistingScopeObserver;
        this.f14453c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14451a) {
            case 0:
                this.f14452b.lambda$setExtras$5(this.f14453c);
                break;
            default:
                this.f14452b.lambda$setTags$4(this.f14453c);
                break;
        }
    }
}
