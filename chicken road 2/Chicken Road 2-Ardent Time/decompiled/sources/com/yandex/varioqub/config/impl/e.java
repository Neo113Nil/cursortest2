package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class e implements com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.yandex.varioqub.config.impl.g f2680a;

    public e(com.yandex.varioqub.config.impl.g gVar) {
        this.f2680a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(java.lang.String str) {
        this.f2680a.getClass();
        boolean z2 = com.yandex.varioqub.config.impl.C.f2658a;
        if (z2 && z2) {
            android.util.Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
        com.yandex.varioqub.config.impl.l.a(3);
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(java.lang.String str) {
        this.f2680a.getClass();
        java.lang.String str2 = "received deviceId from adapter - " + str;
        if (com.yandex.varioqub.config.impl.C.f2658a) {
            android.util.Log.d("Varioqub/IdentifierProvider", str2);
        }
        this.f2680a.f2685d = str;
        com.yandex.varioqub.config.impl.l.a(3);
    }
}
