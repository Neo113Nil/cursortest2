package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NdkScopeObserver f14437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14439d;

    public /* synthetic */ a(NdkScopeObserver ndkScopeObserver, String str, String str2, int i7) {
        this.f14436a = i7;
        this.f14437b = ndkScopeObserver;
        this.f14438c = str;
        this.f14439d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14436a) {
            case 0:
                this.f14437b.lambda$setExtra$4(this.f14438c, this.f14439d);
                break;
            default:
                this.f14437b.lambda$setTag$2(this.f14438c, this.f14439d);
                break;
        }
    }
}
