package com.fyber.inneractive.sdk.measurement;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.fyber.adsession.AdSession f3787a;
    public com.iab.omid.library.fyber.adsession.AdEvents b;
    public com.iab.omid.library.fyber.adsession.media.MediaEvents c;
    public boolean d = false;
    public boolean e = false;
    public com.fyber.inneractive.sdk.flow.t0 f;

    public final void a(java.lang.Throwable th) {
        java.lang.String simpleName = th.getClass().getSimpleName();
        java.lang.String str = "OpenMeasurementNativeVideoTracker - " + th.getMessage();
        com.fyber.inneractive.sdk.flow.t0 t0Var = this.f;
        com.fyber.inneractive.sdk.network.z.a(simpleName, str, t0Var != null ? t0Var.f3765a : null, t0Var != null ? t0Var.b : null);
    }

    public final java.util.ArrayList a(java.util.List list) {
        com.iab.omid.library.fyber.adsession.VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.measurement.h hVar = (com.fyber.inneractive.sdk.measurement.h) it.next();
            com.iab.omid.library.fyber.adsession.VerificationScriptResource verificationScriptResource = null;
            try {
                if (hVar.f3789a != null) {
                    if (!android.text.TextUtils.isEmpty(hVar.e) && !android.text.TextUtils.isEmpty(hVar.d)) {
                        createVerificationScriptResourceWithoutParameters = com.iab.omid.library.fyber.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.e, hVar.f3789a, hVar.d);
                    } else {
                        createVerificationScriptResourceWithoutParameters = com.iab.omid.library.fyber.adsession.VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.f3789a);
                    }
                    verificationScriptResource = createVerificationScriptResourceWithoutParameters;
                }
            } catch (java.lang.Throwable th) {
                a(th);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
