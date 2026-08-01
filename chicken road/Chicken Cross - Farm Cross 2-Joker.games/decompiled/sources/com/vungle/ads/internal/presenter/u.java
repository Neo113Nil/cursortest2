package com.vungle.ads.internal.presenter;

import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class u implements com.vungle.ads.internal.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12103a;
    public final /* synthetic */ w b;

    public u(String str, w wVar) {
        this.f12103a = str;
        this.b = wVar;
    }

    @Override // com.vungle.ads.internal.ui.m
    public final void a(boolean z) {
        if (!z) {
            new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, com.iab.omid.library.vungle.internal.l.a("Fail to open ").append(this.f12103a).toString()).setLogEntry$vungle_ads_release(this.b.a()).logErrorNoReturnValue$vungle_ads_release();
        }
        List b = this.b.c.b("deeplink.click", String.valueOf(z), null);
        if (b != null) {
            w wVar = this.b;
            Iterator it = b.iterator();
            while (it.hasNext()) {
                com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                pVar.i = "deeplink.click";
                pVar.j = wVar.a();
                wVar.b().a(pVar.a(), false);
            }
        }
    }
}
