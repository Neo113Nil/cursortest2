package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class t implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.u f3756a;

    public t(com.fyber.inneractive.sdk.flow.u uVar) {
        this.f3756a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        com.fyber.inneractive.sdk.util.IAlog.a("IAVideoContentLoader : Remote ui template callback onNetworkResult from cache: %s", java.lang.Boolean.valueOf(z));
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        com.fyber.inneractive.sdk.flow.u uVar = this.f3756a;
        uVar.getClass();
        if (android.text.TextUtils.isEmpty(str) && z) {
            uVar.a(exc, "Fetched cached template is ".concat(str == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : "empty"), true);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.g i = uVar.i();
        if (i == null) {
            uVar.a(null, "Flow Manager is null", z);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            boolean z2 = i.f4174a.i;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown error while receiving template: templateContent is: ");
            sb.append(android.text.TextUtils.isEmpty(str) ? "null or empty" : "not null and not empty");
            sb.append(" isFromCache: ");
            sb.append(z2);
            uVar.a(exc, sb.toString(), z2);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = i.f4174a;
        dVar.i = z;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : schedule UI load timeout task with delay: %d", "RemoteUIWebviewController", 10000);
        com.fyber.inneractive.sdk.util.r.b.postDelayed(dVar.k, 10000);
        try {
            dVar.b.loadData(str, "text/html", "UTF-8");
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.k);
            dVar.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable load data: " + th.getMessage(), true, null);
        }
    }
}
