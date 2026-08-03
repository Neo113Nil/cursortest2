package com.fyber.inneractive.sdk.player.ui.remote;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, com.fyber.inneractive.sdk.player.ui.remote.a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f4171a;
    public final com.fyber.inneractive.sdk.web.remoteui.b b;
    public final com.fyber.inneractive.sdk.flow.t0 c;
    public final com.fyber.inneractive.sdk.player.ui.remote.e d;
    public com.fyber.inneractive.sdk.player.ui.n e;
    public final java.lang.String f;
    public boolean i;
    public com.fyber.inneractive.sdk.flow.g j;
    public boolean g = false;
    public boolean h = false;
    public final com.fyber.inneractive.sdk.player.ui.remote.b k = new com.fyber.inneractive.sdk.player.ui.remote.b(this);
    public final com.fyber.inneractive.sdk.player.ui.remote.c l = new com.fyber.inneractive.sdk.player.ui.remote.c(this);
    public boolean m = false;
    public boolean n = false;

    public d(android.content.Context context, com.fyber.inneractive.sdk.flow.t0 t0Var, java.lang.String str) {
        this.c = t0Var;
        this.f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.b = bVar;
        this.d = new com.fyber.inneractive.sdk.player.ui.remote.e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        this.j = new com.fyber.inneractive.sdk.flow.g(context, true, t0Var != null ? t0Var.f3765a : null, b(), null);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, java.lang.String str, boolean z, java.util.HashMap hashMap) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.k);
        java.lang.String str2 = (hashMap == null || !hashMap.containsKey("failedURL")) ? this.f : (java.lang.String) hashMap.get("failedURL");
        if (z) {
            if (b() != null) {
                b().I = false;
            }
            a();
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE;
            com.fyber.inneractive.sdk.flow.t0 t0Var = this.c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.f3765a : null, b(), str, str2, java.lang.Boolean.valueOf(this.i));
        } else {
            com.fyber.inneractive.sdk.network.t tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE;
            java.lang.String name = bVar.name();
            com.fyber.inneractive.sdk.flow.t0 t0Var2 = this.c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, name, str2, t0Var2 != null ? t0Var2.f3765a : null, b(), hashMap, java.lang.Boolean.valueOf(this.i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.f4171a;
        if (aVar != null) {
            aVar.a(bVar, str, z, hashMap);
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        com.fyber.inneractive.sdk.flow.t0 t0Var = this.c;
        if (t0Var != null) {
            return t0Var.b;
        }
        return null;
    }

    public final void a() {
        this.h = true;
        this.e = null;
        com.fyber.inneractive.sdk.player.ui.remote.e eVar = this.d;
        eVar.b.clear();
        eVar.f4172a = null;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.k);
        this.b.setVisibility(8);
        this.b.setUiReady(false);
        com.fyber.inneractive.sdk.util.v.a(this.b);
        this.b.destroy();
        this.j = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(java.lang.String str, java.util.HashMap hashMap) {
        com.fyber.inneractive.sdk.util.g1 lastClickedLocation;
        com.fyber.inneractive.sdk.player.ui.remote.e eVar;
        com.fyber.inneractive.sdk.player.ui.remote.d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        lastClickedLocation = this.b.getLastClickedLocation();
        eVar = this.d;
        eVar.getClass();
        str.getClass();
        str.hashCode();
        switch (str) {
            case "clickSkip":
                eVar.a(6, lastClickedLocation);
                break;
            case "expandCollapseClick":
                eVar.a(5, lastClickedLocation);
                break;
            case "appInfoClick":
                eVar.a(10, lastClickedLocation);
                break;
            case "shouldSkipUpdateUi.true":
                com.fyber.inneractive.sdk.player.ui.remote.d dVar2 = eVar.f4172a;
                if (dVar2 != null) {
                    dVar2.m = true;
                    break;
                }
                break;
            case "onGeneralError":
                com.fyber.inneractive.sdk.player.ui.remote.d dVar3 = eVar.f4172a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (java.lang.String) hashMap.get("error"), "true".equalsIgnoreCase((java.lang.String) hashMap.get("shouldFailUi")), hashMap);
                    break;
                }
                break;
            case "ctaClick":
                eVar.a(3, lastClickedLocation);
                break;
            case "isSkipEnabled.false":
                com.fyber.inneractive.sdk.player.ui.remote.d dVar4 = eVar.f4172a;
                if (dVar4 != null) {
                    dVar4.n = false;
                    break;
                }
                break;
            case "clickMuteUnmute":
                eVar.a(1, lastClickedLocation);
                break;
            case "DOMLoaded":
                java.lang.String str2 = eVar.c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                com.fyber.inneractive.sdk.player.ui.remote.d dVar5 = eVar.f4172a;
                if (dVar5 != null) {
                    dVar5.b.a(str2);
                }
                java.util.Iterator it = eVar.b.keySet().iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) eVar.b.get((java.lang.String) it.next());
                    if (!android.text.TextUtils.isEmpty(str3) && (dVar = eVar.f4172a) != null) {
                        dVar.b.a(str3);
                    }
                }
                eVar.b.clear();
                com.fyber.inneractive.sdk.player.ui.remote.d dVar6 = eVar.f4172a;
                if (dVar6 != null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    com.fyber.inneractive.sdk.util.IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar6.k);
                    dVar6.g = false;
                    dVar6.b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().I = true;
                    }
                    dVar6.b.setVisibility(0);
                    break;
                }
                break;
            case "adIdentifierClick":
                com.fyber.inneractive.sdk.player.ui.remote.d dVar7 = eVar.f4172a;
                if (dVar7 != null && (gVar = dVar7.j) != null) {
                    gVar.a();
                    break;
                }
                break;
            case "shouldSkipUpdateUi.false":
                com.fyber.inneractive.sdk.player.ui.remote.d dVar8 = eVar.f4172a;
                if (dVar8 != null) {
                    dVar8.m = false;
                    break;
                }
                break;
            case "isSkipEnabled.true":
                com.fyber.inneractive.sdk.player.ui.remote.d dVar9 = eVar.f4172a;
                if (dVar9 != null) {
                    dVar9.n = true;
                    break;
                }
                break;
            case "onVideoClick":
                eVar.a(7, lastClickedLocation);
                break;
            case "onResourceError":
                com.fyber.inneractive.sdk.player.ui.remote.d dVar10 = eVar.f4172a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (java.lang.String) hashMap.get("error"), true, hashMap);
                    break;
                }
                break;
            default:
                com.fyber.inneractive.sdk.util.IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar11 = eVar.f4172a;
        if (dVar11 != null) {
            dVar11.b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }
}
