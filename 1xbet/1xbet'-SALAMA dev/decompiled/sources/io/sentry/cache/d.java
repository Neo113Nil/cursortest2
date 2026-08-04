package io.sentry.cache;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersistingScopeObserver f14458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f14459c;

    public /* synthetic */ d(PersistingScopeObserver persistingScopeObserver, Map map, int i7) {
        this.f14457a = i7;
        this.f14458b = persistingScopeObserver;
        this.f14459c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14457a) {
            case 0:
                this.f14458b.lambda$setExtras$5(this.f14459c);
                break;
            default:
                this.f14458b.lambda$setTags$4(this.f14459c);
                break;
        }
    }
}
