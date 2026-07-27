package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class v5 extends n5 {
    private final com.applovin.impl.sdk.network.e g;
    private final AppLovinPostbackListener h;
    private final i6.b i;

    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            v5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (v5.this.h != null) {
                v5.this.h.onPostbackSuccess(v5.this.g.f());
            }
        }
    }

    public v5(com.applovin.impl.sdk.network.e eVar, i6.b bVar, com.applovin.impl.sdk.l lVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", lVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.g = eVar;
        this.h = appLovinPostbackListener;
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.g, b());
        bVar.a(this.i);
        b().s0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.g.f())) {
            if (this.g.u()) {
                b().z0().a(this.g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d(this.b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    class b extends r6 {
        private final String n;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
            this.n = v5.this.g.f();
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, Object obj, int i) {
            if (obj instanceof String) {
                Iterator it = this.f4351a.c(c5.i0).iterator();
                while (it.hasNext()) {
                    if (this.n.startsWith((String) it.next())) {
                        String str2 = (String) obj;
                        if (TextUtils.isEmpty(str2)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str2);
                                s0.c(jSONObject, this.f4351a);
                                s0.b(jSONObject, this.f4351a);
                                s0.a(jSONObject, this.f4351a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (v5.this.h != null) {
                v5.this.h.onPostbackSuccess(this.n);
            }
            if (v5.this.g.t()) {
                this.f4351a.u().a(v5.this.g.s(), this.n, i, obj, null, true);
            }
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, Object obj) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.n);
            }
            if (v5.this.h != null) {
                v5.this.h.onPostbackFailure(this.n, i);
            }
            if (v5.this.g.t()) {
                this.f4351a.u().a(v5.this.g.s(), this.n, i, obj, str2, false);
            }
        }
    }
}
