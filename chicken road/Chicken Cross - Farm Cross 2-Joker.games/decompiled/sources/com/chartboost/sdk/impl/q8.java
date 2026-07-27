package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.a;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes4.dex */
public class q8 {

    /* renamed from: a, reason: collision with root package name */
    public final af f4970a;

    public q8(af afVar) {
        this.f4970a = afVar;
    }

    public List a(a.b bVar) {
        HashMap a2 = this.f4970a.a();
        List<DataUseConsent> a3 = a(a2);
        ArrayList arrayList = new ArrayList();
        HashSet b = b(bVar);
        if (b != null) {
            for (DataUseConsent dataUseConsent : a3) {
                if (a(b, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (a2.containsKey(CCPA.CCPA_STANDARD)) {
                arrayList.add((DataUseConsent) a2.get(CCPA.CCPA_STANDARD));
            }
            if (a2.containsKey(COPPA.COPPA_STANDARD)) {
                arrayList.add((DataUseConsent) a2.get(COPPA.COPPA_STANDARD));
            }
            if (a2.containsKey(LGPD.LGPD_STANDARD)) {
                arrayList.add((DataUseConsent) a2.get(LGPD.LGPD_STANDARD));
            }
        }
        return arrayList;
    }

    public final HashSet b(a.b bVar) {
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final boolean a(HashSet hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandardName())) {
            return true;
        }
        mb.b("DataUseConsent " + dataUseConsent.getPrivacyStandardName() + " is not whitelisted.", null);
        return false;
    }

    public final List a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.remove("gdpr");
        return new ArrayList(hashMap2.values());
    }
}
