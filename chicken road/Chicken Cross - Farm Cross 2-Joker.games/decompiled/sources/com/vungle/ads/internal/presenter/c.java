package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f12081a;

    public c(b adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.f12081a = adPlayCallback;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        this.f12081a.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        this.f12081a.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
        this.f12081a.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f12081a.onFailure(error);
    }
}
