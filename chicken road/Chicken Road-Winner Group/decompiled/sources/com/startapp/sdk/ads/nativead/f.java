package com.startapp.sdk.ads.nativead;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f3019a;

    public f(NativeAdDetails nativeAdDetails) {
        this.f3019a = nativeAdDetails;
    }

    public final void a() {
        NativeAdDisplayListener nativeAdDisplayListener;
        boolean z3;
        NativeAdDisplayListener nativeAdDisplayListener2;
        nativeAdDisplayListener = this.f3019a.displayListener;
        if (nativeAdDisplayListener != null) {
            z3 = this.f3019a.hiddenSent;
            if (z3) {
                return;
            }
            nativeAdDisplayListener2 = this.f3019a.displayListener;
            nativeAdDisplayListener2.adHidden(this.f3019a);
            this.f3019a.hiddenSent = true;
        }
    }
}
