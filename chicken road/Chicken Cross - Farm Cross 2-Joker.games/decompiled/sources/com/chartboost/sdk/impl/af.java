package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import com.chartboost.sdk.tracking.g;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class af {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4679a = new HashMap();
    public final SharedPreferences b;
    public final h7 c;

    public af(SharedPreferences sharedPreferences, h7 h7Var) {
        this.b = sharedPreferences;
        this.c = h7Var;
        b();
    }

    public HashMap a() {
        return this.f4679a;
    }

    public void b(DataUseConsent dataUseConsent) {
        mb.a("Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent(), null);
        this.f4679a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        c();
    }

    public final void c() {
        if (this.b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f4679a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(a((DataUseConsent) it.next()));
            }
            a(this.b, jSONArray);
        }
    }

    public void a(String str) {
        this.f4679a.remove(str);
        c();
    }

    public final void a(JSONException jSONException) {
        this.c.mo4759track(com.chartboost.sdk.tracking.a.a(g.d.d, jSONException.getMessage(), "", ""));
    }

    public final void b() {
        DataUseConsent ccpa;
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("privacy_standards", "");
            if (string.isEmpty()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string2 = jSONObject.getString("privacyStandard");
                    String string3 = jSONObject.getString(U3.j.b0);
                    int hashCode = string2.hashCode();
                    if (hashCode == -1172350233) {
                        if (string2.equals(CCPA.CCPA_STANDARD)) {
                            CCPA.CCPA_CONSENT ccpa_consent = CCPA.CCPA_CONSENT.OPT_IN_SALE;
                            if (ccpa_consent.getValue().equals(string3)) {
                                ccpa = new CCPA(ccpa_consent);
                            } else {
                                CCPA.CCPA_CONSENT ccpa_consent2 = CCPA.CCPA_CONSENT.OPT_OUT_SALE;
                                if (ccpa_consent2.getValue().equals(string3)) {
                                    ccpa = new CCPA(ccpa_consent2);
                                }
                                ccpa = null;
                            }
                        }
                        ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(U3.j.b0));
                    } else if (hashCode == 3168159) {
                        if (string2.equals("gdpr")) {
                            GDPR.GDPR_CONSENT gdpr_consent = GDPR.GDPR_CONSENT.BEHAVIORAL;
                            if (gdpr_consent.getValue().equals(string3)) {
                                ccpa = new GDPR(gdpr_consent);
                            } else {
                                GDPR.GDPR_CONSENT gdpr_consent2 = GDPR.GDPR_CONSENT.NON_BEHAVIORAL;
                                if (gdpr_consent2.getValue().equals(string3)) {
                                    ccpa = new GDPR(gdpr_consent2);
                                }
                                ccpa = null;
                            }
                        }
                        ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(U3.j.b0));
                    } else if (hashCode == 3319983) {
                        if (string2.equals(LGPD.LGPD_STANDARD)) {
                            ccpa = new LGPD(jSONObject.getBoolean(U3.j.b0));
                        }
                        ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(U3.j.b0));
                    } else {
                        if (hashCode == 94846581 && string2.equals(COPPA.COPPA_STANDARD)) {
                            ccpa = new COPPA(jSONObject.getBoolean(U3.j.b0));
                        }
                        ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(U3.j.b0));
                    }
                    if (ccpa != null) {
                        this.f4679a.put(ccpa.getPrivacyStandard(), ccpa);
                    } else {
                        b(string2);
                        mb.a("Failed to load consent: " + string2, null);
                    }
                }
            } catch (JSONException e) {
                a(e);
                e.printStackTrace();
            }
        }
    }

    public final void a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    public final JSONObject a(DataUseConsent dataUseConsent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dataUseConsent.getPrivacyStandard());
            jSONObject.put(U3.j.b0, dataUseConsent.getConsent());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public final void b(String str) {
        this.c.mo4759track(com.chartboost.sdk.tracking.a.a(g.d.f, str, "", ""));
    }
}
