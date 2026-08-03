package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class s extends com.fyber.inneractive.sdk.flow.k {
    public com.fyber.inneractive.sdk.ui.IAmraidWebViewController m;
    public final com.fyber.inneractive.sdk.flow.q n = new com.fyber.inneractive.sdk.flow.q(this);

    @Override // com.fyber.inneractive.sdk.flow.k
    public final com.fyber.inneractive.sdk.external.InneractiveInfrastructureError d() {
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        if (aVar != null) {
            int i = this.i;
            if (aVar.g) {
                i = aVar.f3858a - i;
            }
            r1 = (i == aVar.f3858a ? aVar.h : 0) + (aVar.b * i) + aVar.d;
        }
        return new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.LOAD_TIMEOUT, com.fyber.inneractive.sdk.flow.i.WEBVIEW_LOAD_TIMEOUT, new java.lang.Exception("LoadTimeout after " + r1 + " ms"));
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final java.lang.String e() {
        return "send_failed_display_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void g() {
        com.fyber.inneractive.sdk.web.z zVar;
        java.lang.String str;
        java.lang.String str2;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.f3705a;
        com.fyber.inneractive.sdk.flow.q0 q0Var = new com.fyber.inneractive.sdk.flow.q0(inneractiveAdRequest == null ? this.f : inneractiveAdRequest.getSelectedUnitConfig(), this.g);
        this.c = q0Var;
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) eVar;
        q0Var.b = fVar;
        q0Var.f = this.h;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = eVar != null ? fVar.n : null;
        com.fyber.inneractive.sdk.web.c0 c0Var = com.fyber.inneractive.sdk.web.c0.INLINE;
        if (unitDisplayType == null) {
            this.n.a(null, new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_UNIT_DISPLAY_TYPE, new java.lang.Exception("Unit display type was not found")));
            return;
        }
        int i = com.fyber.inneractive.sdk.flow.r.f3731a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = this.f3705a;
            if (inneractiveAdRequest2 == null || inneractiveAdRequest2.getAllowFullscreen()) {
                c0Var = com.fyber.inneractive.sdk.web.c0.INTERSTITIAL;
            }
        } else {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
        }
        com.fyber.inneractive.sdk.web.c0 c0Var2 = c0Var;
        com.fyber.inneractive.sdk.web.z zVar2 = zVar;
        com.fyber.inneractive.sdk.response.e eVar2 = this.b;
        boolean z = (eVar2 == null || (str2 = ((com.fyber.inneractive.sdk.response.f) eVar2).K) == null || str2.contains("iaNotifyLoadFinished")) ? false : true;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        boolean z2 = !unitDisplayType.isFullscreenUnit() || iAConfigManager.t.b.a(true, "use_fraud_detection_fullscreen");
        try {
            com.fyber.inneractive.sdk.web.d0 d0Var = com.fyber.inneractive.sdk.web.d0.AD_CONTROLLED;
            java.lang.Boolean c = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.L.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.j);
            boolean booleanValue = c != null ? c.booleanValue() : false;
            com.fyber.inneractive.sdk.util.IAlog.a("OMSDK AB %s", java.lang.String.valueOf(booleanValue));
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = new com.fyber.inneractive.sdk.ui.IAmraidWebViewController(z2, c0Var2, zVar2, d0Var, z, booleanValue ? iAConfigManager.J : null, this.g);
            this.m = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.c);
            this.m.setAdRequest(this.f3705a);
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController2 = this.m;
            com.fyber.inneractive.sdk.flow.q0 q0Var2 = (com.fyber.inneractive.sdk.flow.q0) this.c;
            q0Var2.getClass();
            iAmraidWebViewController2.setMuteMraidVideo(iAConfigManager.k || q0Var2.f);
            ((com.fyber.inneractive.sdk.flow.q0) this.c).i = this.m;
            com.fyber.inneractive.sdk.response.e eVar3 = this.b;
            if (eVar3 != null) {
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = ((com.fyber.inneractive.sdk.response.f) eVar3).n;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest3 = this.f3705a;
                boolean z3 = inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z3) {
                    sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                java.lang.String sb2 = sb.toString();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                if (unitDisplayType2 != null && !unitDisplayType2.isFullscreenUnit()) {
                    if (unitDisplayType2 == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER) {
                        sb3.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
                    } else {
                        sb3.append(" #iawrapper { position:unset !important; display: unset !important; }");
                    }
                }
                java.lang.String sb4 = sb3.toString();
                this.m.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit() || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT.equals(unitDisplayType));
                com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController3 = this.m;
                int i2 = com.fyber.inneractive.sdk.config.k.f3616a;
                java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.name");
                if (android.text.TextUtils.isEmpty(property)) {
                    str = "wv.inner-active.mobi/simpleM2M/";
                } else {
                    str = property + ".inner-active.mobi/simpleM2M/";
                }
                java.lang.String str3 = str;
                java.lang.String str4 = "" + ((com.fyber.inneractive.sdk.response.f) this.b).K;
                iAmraidWebViewController3.f = this.n;
                try {
                    iAmraidWebViewController3.h();
                    com.fyber.inneractive.sdk.web.e eVar4 = new com.fyber.inneractive.sdk.web.e(iAmraidWebViewController3, str4, true, sb2, sb4, str3);
                    iAmraidWebViewController3.o = eVar4;
                    eVar4.a().post(new com.fyber.inneractive.sdk.util.c(eVar4));
                } catch (java.lang.Throwable th) {
                    com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CONFIGURE_WEBVIEW, th);
                    com.fyber.inneractive.sdk.web.g gVar = iAmraidWebViewController3.f;
                    if (gVar != null) {
                        gVar.a(iAmraidWebViewController3, inneractiveInfrastructureError);
                    }
                    iAmraidWebViewController3.b(true);
                }
            }
        } catch (java.lang.Throwable th2) {
            b(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CREATE_WEBVIEW_CONTROLLER, th2));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController;
        com.iab.omid.library.fyber.adsession.AdSession adSession;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAMraidContentLoader : destroyController", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (this.c != null && (iAmraidWebViewController = this.m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f3791a) != null) {
                try {
                    adSession.finish();
                } catch (java.lang.Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f3791a = null;
                eVar.b = null;
            }
            this.m.e();
            this.m = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController;
        com.iab.omid.library.fyber.adsession.AdSession adSession;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAMraidContentLoader : destroyController", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (this.c != null && (iAmraidWebViewController = this.m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f3791a) != null) {
                try {
                    adSession.finish();
                } catch (java.lang.Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f3791a = null;
                eVar.b = null;
            }
            this.m.e();
            this.m = null;
        }
        this.k.a();
        com.fyber.inneractive.sdk.util.IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.l);
        this.f3705a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
