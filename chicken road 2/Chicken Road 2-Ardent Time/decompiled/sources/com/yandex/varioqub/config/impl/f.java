package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class f implements com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.yandex.varioqub.config.impl.g f2681a;

    public f(com.yandex.varioqub.config.impl.g gVar) {
        this.f2681a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(java.lang.String str) {
        this.f2681a.f2683b.countDown();
        this.f2681a.getClass();
        boolean z2 = com.yandex.varioqub.config.impl.C.f2658a;
        if (z2 && z2) {
            android.util.Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(java.lang.String str) {
        this.f2681a.getClass();
        java.lang.String str2 = "received userId from adapter - " + str;
        if (com.yandex.varioqub.config.impl.C.f2658a) {
            android.util.Log.d("Varioqub/IdentifierProvider", str2);
        }
        com.yandex.varioqub.config.impl.g gVar = this.f2681a;
        gVar.f2684c = str;
        gVar.f2683b.countDown();
    }
}
