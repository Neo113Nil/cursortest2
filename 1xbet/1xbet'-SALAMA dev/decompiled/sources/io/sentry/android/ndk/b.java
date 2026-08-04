package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NdkScopeObserver f14441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14442c;

    public /* synthetic */ b(NdkScopeObserver ndkScopeObserver, String str, int i7) {
        this.f14440a = i7;
        this.f14441b = ndkScopeObserver;
        this.f14442c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14440a) {
            case 0:
                this.f14441b.lambda$removeTag$3(this.f14442c);
                break;
            default:
                this.f14441b.lambda$removeExtra$5(this.f14442c);
                break;
        }
    }
}
