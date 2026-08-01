package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵏ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0969 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public E f2806;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ArrayList f2807 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Context f2808;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0557 f2809;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0430 f2810;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0422 f2811;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1042 f2812;

    public C0969(Context context, C1042 c1042, C0422 c0422, C0430 c0430, AbstractC0557 abstractC0557) {
        this.f2812 = c1042;
        this.f2811 = c0422;
        this.f2810 = c0430;
        this.f2809 = abstractC0557;
        this.f2808 = context.getApplicationContext();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5786() {
        Iterator it = this.f2807.iterator();
        while (it.hasNext()) {
            C1226 c1226 = (C1226) it.next();
            C1111 c1111 = c1226.f3475;
            c1111.getClass();
            AbstractC1145.m5891(new C1134(c1111));
            C1111 c11112 = c1226.f3475;
            c11112.getClass();
            AbstractC1145.m5891(new C1112(c11112));
            C1111 c11113 = c1226.f3475;
            c11113.getClass();
            AbstractC1145.m5891(new C1122(c11113));
            if (c1226.f3479 != null) {
                AbstractC0554 m5521 = AbstractC0554.m5521();
                C0598 c0598 = c1226.f3479;
                synchronized (m5521) {
                    m5521.f1253.remove(c0598);
                }
                c1226.f3479 = null;
            }
            C0909 c0909 = c1226.f3478;
            if (c0909 != null) {
                c0909.m5719();
                c1226.f3478 = null;
            }
            c1226.f3480 = null;
        }
        AbstractC1145.m5891(new C1090(this));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m5787() {
        return this.f2809.mo5476();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m5788() {
        HashMap hashMap;
        String m5527 = this.f2809.m5527();
        String str = null;
        if (TextUtils.isEmpty(m5527) || StringFog.decrypt("Qg9CSavVAA==\n", "B0EDC+eQRJg=\n").equals(m5527) || StringFog.decrypt("I8baUZ4NXaA=\n", "Z4+JENxBGOQ=\n").equals(m5527)) {
            return null;
        }
        C1042 c1042 = this.f2812;
        String m55272 = this.f2809.m5527();
        if (c1042.f3099 == null) {
            JSONObject optJSONObject = c1042.f3106.optJSONObject(C1042.f3095);
            if (optJSONObject != null) {
                hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next, null));
                }
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                ArrayList arrayList = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList, new C1043());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (AbstractC1191.m5913(m55272, str2) >= 0) {
                        str = (String) hashMap.get(str2);
                    }
                }
                c1042.f3099 = str;
            }
        }
        return c1042.f3099;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ArrayList m5789() {
        if (this.f2807 != null) {
            return new ArrayList(this.f2807);
        }
        return new ArrayList();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0327 m5790(C1307 c1307) {
        if (c1307 != null) {
            return new C0327(c1307, m5790((C1307) this.f2812.m5814().get(c1307.f3775)));
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5791() {
        if (this.f2809.mo5476()) {
            Iterator it = m5789().iterator();
            while (it.hasNext()) {
                C1226 c1226 = (C1226) it.next();
                this.f2812.m5815().f3184.m5838(c1226.f3484.f314.f3776, c1226);
            }
        }
    }
}
