package io.sentry.android.ndk;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NdkScopeObserver f14435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14436c;

    public /* synthetic */ b(NdkScopeObserver ndkScopeObserver, String str, int i7) {
        this.f14434a = i7;
        this.f14435b = ndkScopeObserver;
        this.f14436c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14434a) {
            case 0:
                this.f14435b.lambda$removeTag$3(this.f14436c);
                break;
            default:
                this.f14435b.lambda$removeExtra$5(this.f14436c);
                break;
        }
    }
}
