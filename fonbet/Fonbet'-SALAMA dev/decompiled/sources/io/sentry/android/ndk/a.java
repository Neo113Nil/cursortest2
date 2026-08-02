package io.sentry.android.ndk;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NdkScopeObserver f14431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14433d;

    public /* synthetic */ a(NdkScopeObserver ndkScopeObserver, String str, String str2, int i7) {
        this.f14430a = i7;
        this.f14431b = ndkScopeObserver;
        this.f14432c = str;
        this.f14433d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14430a) {
            case 0:
                this.f14431b.lambda$setExtra$4(this.f14432c, this.f14433d);
                break;
            default:
                this.f14431b.lambda$setTag$2(this.f14432c, this.f14433d);
                break;
        }
    }
}
