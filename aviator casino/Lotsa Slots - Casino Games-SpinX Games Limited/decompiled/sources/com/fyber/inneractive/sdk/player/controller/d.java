package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.i1 f3879a;
    public final com.fyber.inneractive.sdk.web.c0 b;
    public final com.fyber.inneractive.sdk.config.enums.UnitDisplayType c;
    public final com.fyber.inneractive.sdk.web.z d;
    public final boolean e;

    public d(android.content.Context context, com.fyber.inneractive.sdk.flow.vast.a aVar, com.fyber.inneractive.sdk.model.vast.i iVar, com.fyber.inneractive.sdk.flow.endcard.q qVar) {
        this.b = com.fyber.inneractive.sdk.web.c0.INLINE;
        com.fyber.inneractive.sdk.web.z zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
        this.d = zVar;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = aVar.f3759a;
        boolean z = aVar.b;
        this.c = unitDisplayType;
        this.e = z;
        int i = com.fyber.inneractive.sdk.player.controller.c.f3878a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            this.d = zVar;
            if (z) {
                this.b = com.fyber.inneractive.sdk.web.c0.INTERSTITIAL;
            }
        } else {
            this.d = zVar;
        }
        try {
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = aVar.f3759a;
            boolean z2 = !(unitDisplayType2 == null || unitDisplayType2.isFullscreenUnit()) || com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a(true, "use_fraud_detection_fullscreen");
            com.fyber.inneractive.sdk.web.i1 bVar = iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card ? new com.fyber.inneractive.sdk.web.b(qVar, z2) : new com.fyber.inneractive.sdk.ui.IAmraidWebViewController(z2, this.b, this.d, com.fyber.inneractive.sdk.web.d0.AD_CONTROLLED, true, null, null);
            this.f3879a = bVar;
            com.fyber.inneractive.sdk.web.m mVar = bVar.b;
            if (mVar != null) {
                int i2 = com.fyber.inneractive.sdk.player.controller.c.b[iVar.ordinal()];
                if (i2 == 1) {
                    mVar.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_vast_endcard_static);
                } else if (i2 == 2) {
                    mVar.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_vast_endcard_html);
                } else if (i2 == 3) {
                    mVar.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_vast_endcard_html);
                } else if (i2 == 4) {
                    mVar.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_vast_endcard_iframe);
                }
            }
            com.fyber.inneractive.sdk.web.i1 i1Var = this.f3879a;
            com.fyber.inneractive.sdk.web.m mVar2 = i1Var.b;
            if (mVar2 != null) {
                com.fyber.inneractive.sdk.util.l0.f4298a.a(context, mVar2, i1Var);
            }
            com.fyber.inneractive.sdk.web.i1 i1Var2 = this.f3879a;
            com.fyber.inneractive.sdk.web.m mVar3 = i1Var2.b;
            if (mVar3 != null) {
                mVar3.setTapListener(i1Var2);
            }
            com.fyber.inneractive.sdk.util.h1 a2 = com.fyber.inneractive.sdk.renderers.n.a(aVar.c, aVar.d, aVar.e);
            this.f3879a.setAdDefaultSize(a2.f4294a, a2.b);
        } catch (java.lang.Throwable unused) {
            this.f3879a = null;
        }
    }

    public final void a(java.lang.String str, com.fyber.inneractive.sdk.web.g gVar, boolean z) {
        java.lang.String str2;
        com.fyber.inneractive.sdk.flow.x xVar;
        if (this.f3879a == null || android.text.TextUtils.isEmpty(str)) {
            gVar.a(null, new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED, com.fyber.inneractive.sdk.flow.i.NO_WEBVIEW_CONTROLLER_AVAILABLE));
            return;
        }
        com.fyber.inneractive.sdk.web.i1 i1Var = this.f3879a;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = this.c;
        boolean z2 = true;
        i1Var.setAutoplayMRAIDVideos(unitDisplayType != null && unitDisplayType.isFullscreenUnit());
        this.f3879a.setCenteringTagsRequired(false);
        com.fyber.inneractive.sdk.web.i1 i1Var2 = this.f3879a;
        if (i1Var2 == null || (xVar = i1Var2.s) == null || (!com.fyber.inneractive.sdk.config.IAConfigManager.N.k && !xVar.f)) {
            z2 = false;
        }
        i1Var2.setMuteMraidVideo(z2);
        com.fyber.inneractive.sdk.web.i1 i1Var3 = this.f3879a;
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.name");
        if (android.text.TextUtils.isEmpty(property)) {
            str2 = "wv.inner-active.mobi/simpleM2M/";
        } else {
            str2 = property + ".inner-active.mobi/simpleM2M/";
        }
        java.lang.String str3 = str2;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = this.c;
        boolean z3 = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z3) {
            sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
        }
        java.lang.String sb2 = sb.toString();
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType3 = this.c;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        if (unitDisplayType3 != null && !unitDisplayType3.isFullscreenUnit()) {
            if (unitDisplayType3 == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER) {
                sb3.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb3.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        java.lang.String sb4 = sb3.toString();
        i1Var3.f = gVar;
        try {
            i1Var3.h();
            com.fyber.inneractive.sdk.web.e eVar = new com.fyber.inneractive.sdk.web.e(i1Var3, str, z, sb2, sb4, str3);
            i1Var3.o = eVar;
            eVar.a().post(new com.fyber.inneractive.sdk.util.c(eVar));
        } catch (java.lang.Throwable th) {
            i1Var3.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CONFIGURE_WEBVIEW, th));
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.web.m mVar;
        com.fyber.inneractive.sdk.web.i1 i1Var = this.f3879a;
        if (i1Var == null || (mVar = i1Var.b) == null) {
            return;
        }
        android.webkit.WebSettings settings = mVar.getSettings();
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
    }
}
