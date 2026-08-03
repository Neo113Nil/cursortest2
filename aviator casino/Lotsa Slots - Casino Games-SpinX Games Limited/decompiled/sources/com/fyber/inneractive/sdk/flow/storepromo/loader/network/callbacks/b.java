package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.loader.g f3747a;
    public final com.fyber.inneractive.sdk.flow.storepromo.model.b b;
    public final java.lang.String c;
    public final int d;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, java.lang.String str, com.fyber.inneractive.sdk.flow.storepromo.loader.g gVar) {
        this.b = bVar;
        this.c = str;
        this.f3747a = gVar;
        this.d = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if ((r4 - r5) < 2) goto L36;
     */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        boolean z2 = false;
        if (str != null && exc == null) {
            com.fyber.inneractive.sdk.flow.storepromo.loader.g gVar = this.f3747a;
            com.fyber.inneractive.sdk.flow.storepromo.model.b bVar = this.b;
            int i = this.d;
            gVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("StorePromoResourcesLoader: onAssetDownloaded: type: %s, sortIndex: %s", bVar, java.lang.Integer.valueOf(i));
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = gVar.d;
            cVar.f3750a.add(new com.fyber.inneractive.sdk.flow.storepromo.model.a(str, bVar, i));
            if (bVar == com.fyber.inneractive.sdk.flow.storepromo.model.b.SCREENSHOT) {
                cVar.i++;
            }
            gVar.a(null, false, null, null);
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = exc instanceof com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a ? com.fyber.inneractive.sdk.flow.storepromo.events.a.FILE_SIZE_EXCEEDS_LIMIT : com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        java.lang.String str2 = "Unable download store promo asset type: " + this.b + ", error: " + (exc != null ? exc.getMessage() != null ? exc.getMessage() : exc.toString() : "");
        com.fyber.inneractive.sdk.flow.storepromo.loader.g gVar2 = this.f3747a;
        java.lang.String str3 = this.c;
        int i2 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.a.f3746a[this.b.ordinal()];
        if ((i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.UNKNOWN_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.RATING_ICON_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.VIDEO_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.APP_ICON_FAILURE) == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i3 = gVar2.f;
            int i4 = gVar2.g + 1;
            gVar2.g = i4;
        }
        z2 = true;
        gVar2.a(aVar, z2, str2, str3);
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, java.lang.String str, com.fyber.inneractive.sdk.flow.storepromo.loader.g gVar, int i) {
        this.b = bVar;
        this.c = str;
        this.f3747a = gVar;
        this.d = i;
    }
}
