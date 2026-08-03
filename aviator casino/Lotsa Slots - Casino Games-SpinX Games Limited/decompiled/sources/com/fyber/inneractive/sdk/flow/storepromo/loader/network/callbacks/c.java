package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.loader.g f3748a;
    public boolean b = false;
    public final java.lang.String c;

    public c(com.fyber.inneractive.sdk.flow.storepromo.loader.g gVar, java.lang.String str) {
        this.f3748a = gVar;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if ((r3 - r4) < 2) goto L19;
     */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        boolean z2 = false;
        if (this.b) {
            com.fyber.inneractive.sdk.util.IAlog.a("StorePromoTemplateCallback: onNetworkResult: the cached response was applied and this one being cached", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("StorePromoTemplateCallback: onNetworkResult: fromCache: " + z, new java.lang.Object[0]);
        this.b = true;
        if (str != null && exc == null) {
            com.fyber.inneractive.sdk.flow.storepromo.loader.g gVar = this.f3748a;
            gVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("StorePromoResourcesLoader: onTemplateDownloaded", new java.lang.Object[0]);
            gVar.d.c = str;
            gVar.a(null, false, null, null);
            return;
        }
        java.lang.String str2 = "Unable download store promo template, error: " + (exc != null ? exc.getMessage() != null ? exc.getMessage() : exc.toString() : "");
        com.fyber.inneractive.sdk.flow.storepromo.loader.g gVar2 = this.f3748a;
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        java.lang.String str3 = this.c;
        if (com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.TEMPLATE_FAILURE == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i = gVar2.f;
            int i2 = gVar2.g + 1;
            gVar2.g = i2;
        }
        z2 = true;
        gVar2.a(aVar, z2, str2, str3);
    }
}
