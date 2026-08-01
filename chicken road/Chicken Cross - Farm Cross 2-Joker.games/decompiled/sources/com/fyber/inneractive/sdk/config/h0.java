package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f5263a;

    public h0(IAConfigManager iAConfigManager) {
        this.f5263a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar;
        IAConfigManager iAConfigManager = this.f5263a;
        if (iAConfigManager.q == null) {
            iAConfigManager.q = k.a(iAConfigManager.g);
        }
        IAConfigManager iAConfigManager2 = this.f5263a;
        m mVar = iAConfigManager2.C;
        if (mVar == null) {
            IAlog.a("%sDtLocationHeadersStore is null when loadLocationHeadersSnapshot called", IAlog.a(iAConfigManager2));
        } else {
            try {
                Map unmodifiableMap = Collections.unmodifiableMap(mVar.f5269a.f5198a.f5210a.getAll());
                Object obj = unmodifiableMap.get("IADtCountry");
                Integer num = null;
                String str = obj instanceof String ? (String) obj : null;
                Object obj2 = unmodifiableMap.get("IADtIsGdpr");
                if (obj2 instanceof Integer) {
                    Integer num2 = (Integer) obj2;
                    int intValue = num2.intValue();
                    if (intValue == 0 || intValue == 1) {
                        num = num2;
                    }
                } else if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            int parseInt = Integer.parseInt(str2.trim());
                            if (parseInt == 1 || parseInt == 0) {
                                num = Integer.valueOf(parseInt);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                IAlog.a("DtLocationHeadersStore: loaded location headers: country=%s, isGdpr=%s", str, num);
                lVar = new l(str, num);
            } catch (Throwable th) {
                IAlog.a("DtLocationHeadersStore: failed to load persisted location headers", th, new Object[0]);
                lVar = l.b;
            }
            iAConfigManager2.f = lVar.f5268a;
        }
        com.fyber.inneractive.sdk.util.r.b.post(new g0(this));
    }
}
