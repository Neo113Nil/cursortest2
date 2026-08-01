package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public AdSession f5441a;
    public AdEvents b;
    public MediaEvents c;
    public boolean d = false;
    public boolean e = false;
    public t0 f;

    public final void a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th.getMessage();
        t0 t0Var = this.f;
        z.a(simpleName, str, t0Var != null ? t0Var.f5418a : null, t0Var != null ? t0Var.b : null);
    }

    public final ArrayList a(List list) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (hVar.f5443a != null) {
                    if (!TextUtils.isEmpty(hVar.e) && !TextUtils.isEmpty(hVar.d)) {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.e, hVar.f5443a, hVar.d);
                    } else {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.f5443a);
                    }
                    verificationScriptResource = createVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th) {
                a(th);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
