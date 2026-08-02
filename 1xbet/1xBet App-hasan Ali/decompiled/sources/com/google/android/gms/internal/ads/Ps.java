package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.view.View;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ps implements InterfaceC1760wu, InterfaceC1149jB, Yj {

    /* renamed from: k, reason: collision with root package name */
    public final Object f11130k;

    public /* synthetic */ Ps(OE oe, C1199kG c1199kG, C1469qG c1469qG, IOException iOException, boolean z3) {
        this.f11130k = iOException;
    }

    public JSONObject a(View view) {
        int currentModeType;
        JSONObject a5 = Us.a(0, 0, 0, 0);
        UiModeManager uiModeManager = AbstractC1803xs.f16346e;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : AbstractC1803xs.f;
        int i5 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            a5.put("noOutputDevice", i5 == 0);
            return a5;
        } catch (JSONException e3) {
            AbstractC1668us.q("Error with setting output device status", e3);
            return a5;
        }
    }

    public void b(int i, Object obj, InterfaceC1554sC interfaceC1554sC) {
        EB eb = (EB) this.f11130k;
        eb.D0(i, 3);
        interfaceC1554sC.j((AbstractC1464qB) obj, eb.f8471l);
        eb.D0(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1760wu
    public /* bridge */ /* synthetic */ Iterator c(Hq hq, CharSequence charSequence) {
        return new C1580su(charSequence, (C1221ku) this.f11130k, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1149jB
    public Object d(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            Provider provider = Security.getProvider(strArr[i5]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (true) {
            Fz fz = (Fz) this.f11130k;
            if (i >= size) {
                return fz.i(str, null);
            }
            Object obj = arrayList.get(i);
            i++;
            try {
                return fz.i(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public void mo11k(Object obj) {
        ((PE) obj).h((IOException) this.f11130k);
    }

    public /* synthetic */ Ps(Object obj) {
        this.f11130k = obj;
    }

    public Ps(EB eb) {
        Charset charset = VB.f11871a;
        this.f11130k = eb;
        eb.f8471l = this;
    }
}
