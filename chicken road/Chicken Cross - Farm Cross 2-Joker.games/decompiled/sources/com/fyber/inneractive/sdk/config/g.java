package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class g extends com.fyber.inneractive.sdk.network.v0 {
    public g(f0 f0Var, Context context) {
        super(f0Var, context, new f());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    @Override // com.fyber.inneractive.sdk.network.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Exception exc, boolean z, HashMap hashMap) {
        int parseInt;
        Integer valueOf;
        m mVar;
        m0 m0Var = (m0) obj;
        if (hashMap != null) {
            String a2 = com.fyber.inneractive.sdk.network.n.DT_COUNTRY.a();
            Locale locale = Locale.US;
            String str = (String) hashMap.get(a2.toLowerCase(locale));
            String str2 = (String) hashMap.get(com.fyber.inneractive.sdk.network.n.DT_IS_GDPR.a().toLowerCase(locale));
            if (!TextUtils.isEmpty(str2)) {
                try {
                    parseInt = Integer.parseInt(str2.trim());
                } catch (NumberFormatException unused) {
                }
                if (parseInt == 1 || parseInt == 0) {
                    valueOf = Integer.valueOf(parseInt);
                    IAConfigManager iAConfigManager = IAConfigManager.R;
                    iAConfigManager.f = valueOf;
                    mVar = iAConfigManager.C;
                    if (mVar != null) {
                        IAlog.a("DtLocationHeadersStore is null when persistDtLocationHeadersAndInvalidatePrivacyKeys called", new Object[0]);
                    } else {
                        IAlog.a("DtLocationHeadersStore: persisting location headers: country=%s, isGdpr=%s", str, valueOf);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("IADtCountry", str);
                        hashMap2.put("IADtIsGdpr", valueOf);
                        mVar.f5269a.f5198a.a(hashMap2);
                        com.fyber.inneractive.sdk.util.r.b.post(new l0());
                    }
                }
            }
            valueOf = null;
            IAConfigManager iAConfigManager2 = IAConfigManager.R;
            iAConfigManager2.f = valueOf;
            mVar = iAConfigManager2.C;
            if (mVar != null) {
            }
        }
        super.a(m0Var, exc, z, hashMap);
    }
}
