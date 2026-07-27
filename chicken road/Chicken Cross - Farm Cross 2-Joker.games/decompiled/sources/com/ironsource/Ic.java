package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ic implements Hc {

    /* renamed from: a, reason: collision with root package name */
    private C2 f7700a;
    private WeakReference<E2> b = new WeakReference<>(null);

    public final void a(C2 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f7700a = loadListener;
    }

    @Override // com.ironsource.Hc
    public void onBannerClick() {
        E2 e2 = this.b.get();
        if (e2 != null) {
            e2.onBannerClick();
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerInitFailed(String str) {
    }

    @Override // com.ironsource.Hc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        C2 c2 = this.f7700a;
        if (c2 != null) {
            c2.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadSuccess(J9 adInstance, C4370d8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        C2 c2 = this.f7700a;
        if (c2 != null) {
            c2.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerShowSuccess() {
        E2 e2 = this.b.get();
        if (e2 != null) {
            e2.onBannerShowSuccess();
        }
    }

    public final void a(E2 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
