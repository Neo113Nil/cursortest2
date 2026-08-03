package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.config.global.features.i {
    public com.fyber.inneractive.sdk.model.vast.a e;

    public d() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final com.fyber.inneractive.sdk.config.global.features.i b() {
        com.fyber.inneractive.sdk.config.global.features.d dVar = new com.fyber.inneractive.sdk.config.global.features.d();
        a(dVar);
        return dVar;
    }

    public final void d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || this.e != null) {
            return;
        }
        this.e = new com.fyber.inneractive.sdk.model.vast.a(a("install_" + str, null), a("skip_ad_" + str, null), a("skip_in_" + str, null));
    }
}
