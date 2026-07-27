package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ঽ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0682 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final C0422 f1856;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final C0767 f1857;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final C1096 f1858;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final String f1859;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public volatile C0651 f1860;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1855 = StringFog.decrypt("lyousDf91uGmCCGwM/nH/A==\n", "1EVA3lKeoo4=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1854 = StringFog.decrypt("JyL9XzASxg==\n", "Ymy8HXxXgsw=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AtomicBoolean f1869 = new AtomicBoolean(false);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f1868 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public volatile ArrayList f1867 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f1866 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap f1865 = new HashMap();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final HashMap f1864 = new HashMap();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final C0430 f1863 = new C0430();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public C1074 f1862 = C1074.m5835();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public HashMap f1861 = new HashMap();

    static {
        StringFog.decrypt("MtHiRLvBlaM=\n", "dpixBfmN0Oc=\n");
    }

    public C0682(C0767 c0767, C1050 c1050, String str, C0651 c0651, C1096 c1096) {
        this.f1857 = c0767;
        C0422 c0422 = new C0422(AbstractC1145.f3287, c1050);
        this.f1856 = c0422;
        AbstractC0480.f926 = new WeakReference(c0422);
        c0422.f563.add(new C0811(this));
        this.f1859 = str;
        this.f1860 = c0651;
        this.f1858 = c1096;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static HashMap m5618(C0682 c0682) {
        HashMap hashMap;
        synchronized (c0682) {
            hashMap = c0682.f1864;
        }
        return hashMap;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static ArrayList m5619(C0682 c0682) {
        ArrayList arrayList;
        synchronized (c0682) {
            arrayList = c0682.f1866;
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List m5620(C0682 c0682) {
        ArrayList arrayList;
        synchronized (c0682) {
            arrayList = c0682.f1867;
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static HashMap m5621(C0682 c0682) {
        HashMap hashMap;
        synchronized (c0682) {
            hashMap = c0682.f1865;
        }
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5624(C0682 c0682) {
        synchronized (c0682) {
            C0651 c0651 = c0682.f1860;
            if (c0651 == null) {
                return;
            }
            if (c0651.m5610(c0682.m5627())) {
                ((C1096) c0682.m5631()).adQualitySdkInitSuccess();
            } else {
                ((C1096) c0682.m5631()).adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, StringFog.decrypt("dJSgsX6a+YlZj++gYtTgiUieoL5+lfOJXtvzp3KX8p9JnfW+fY0=\n", "OvuA0hH0l+w=\n"));
            }
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized boolean m5625() {
        return AbstractC0398.m5397().mo5398();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized void m5626() {
        if (this.f1869.getAndSet(true)) {
            return;
        }
        C0651 c0651 = this.f1860;
        AbstractC1145.m5895(new C0794(this));
        if (c0651 != null) {
            AbstractC1145.m5891(new C0656(c0651));
        }
        this.f1860 = null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m5627() {
        boolean z;
        if (AbstractC0398.m5397().mo5400()) {
            z = m5625();
        }
        return z;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized List m5628() {
        return this.f1867;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m5629() {
        HashMap hashMap;
        try {
            synchronized (this) {
                hashMap = this.f1865;
            }
            return m5623(hashMap);
        } catch (JSONException e) {
            String str = f1855;
            AbstractC0544.m5511(str, str, StringFog.decrypt("CeYPcMizoUMo/RN4mvCvSSLxHmvV4eBRKeYOdtX9sw==\n", "TJR9H7qTwCc=\n"), e, null, false);
            return new JSONObject();
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m5630() {
        return this.f1864;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5622(C0682 c0682, C0969 c0969) {
        c0682.getClass();
        String m5527 = c0969.f2809.m5527();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0739.f2019, m5527);
        } catch (JSONException e) {
            String str = f1855;
            AbstractC0544.m5511(str, str, StringFog.decrypt("MvAVwWUag8ES4xPHeV3A0BjsCct0To/BV/QC3GRTj91X6BTBeQ==\n", "d4Jnrhc64LM=\n"), e, null, false);
        }
        try {
            jSONObject.put(AbstractC0739.f2020, c0969.f2812.f3102);
        } catch (JSONException e2) {
            String str2 = f1855;
            AbstractC0544.m5511(str2, str2, StringFog.decrypt("irAD94uBqZCqowXxl8bqgaCsH/2a1aWQ77QU6orIpYzvqAL3lw==\n", "z8JxmPmhyuI=\n"), e2, null, false);
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5633(Context context, LinkedHashMap linkedHashMap, C0773 c0773) {
        boolean mo5398;
        if (linkedHashMap.size() > 0) {
            String str = (String) linkedHashMap.keySet().iterator().next();
            List list = (List) linkedHashMap.remove(str);
            String mo5375 = (list == null || list.isEmpty() || list.get(0) == null) ? null : ((AbstractC0830) list.get(0)).mo5375();
            if (mo5375 != null) {
                C0651 c0651 = this.f1860;
                if (c0651 != null) {
                    c0651.f1790.put(mo5375, new C0667(mo5375));
                }
                AbstractC1145.m5893(new C0688(this, mo5375, context, str, list, linkedHashMap, c0773));
                synchronized (this) {
                    mo5398 = AbstractC0398.m5397().mo5398();
                }
                if (mo5398) {
                    return;
                }
                m5633(context, linkedHashMap, c0773);
                return;
            }
            m5633(context, linkedHashMap, c0773);
            return;
        }
        AbstractC1145.m5895(new C0934(c0773));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5635(String str, JSONObject jSONObject) {
        C0651 c0651 = this.f1860;
        if (c0651 != null) {
            AbstractC1145.m5891(new C0660(c0651, str, EnumC0670.f1832));
        }
        if (jSONObject != null) {
            try {
                jSONObject.put(StringFog.decrypt("bBLJ\n", "CHG66vBbpkI=\n"), true);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5632(Context context, String str, String str2, AbstractC0830 abstractC0830, AbstractRunnableC0730 abstractRunnableC0730) {
        C0652 c0652;
        HashMap hashMap;
        long j;
        abstractC0830.getClass();
        String mo5410 = AbstractC0398.m5397().mo5410();
        if (((C0470) AbstractC0398.m5397()).f887.m5616()) {
            String m5617 = ((C0470) AbstractC0398.m5397()).f887.m5617(abstractC0830.mo5375());
            c0652 = TextUtils.isEmpty(m5617) ? null : new C0636(StringFog.decrypt("94D9v8uvFqvmnLw=\n", "lO+T0a7MYsQ=\n") + abstractC0830.mo5375(), mo5410, m5617);
        } else {
            c0652 = new C0652(StringFog.decrypt("iTg8+k39t5CYJH0=\n", "6ldSlCiew/8=\n") + abstractC0830.mo5375(), mo5410);
        }
        if (c0652 != null) {
            AbstractC0557 mo5374 = abstractC0830.mo5374();
            String m5527 = mo5374.m5527();
            synchronized (this) {
                hashMap = this.f1865;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AbstractC0739.f2019, m5527);
            } catch (JSONException e) {
                String str3 = f1855;
                AbstractC0544.m5511(str3, str3, StringFog.decrypt("MvAVwWUag8ES4xPHeV3A0BjsCct0To/BV/QC3GRTj91X6BTBeQ==\n", "d4Jnrhc64LM=\n"), e, null, false);
            }
            hashMap.put(str2, jSONObject);
            C0651 c0651 = this.f1860;
            if (c0651 != null) {
                AbstractC1145.m5891(new C0660(c0651, str2, EnumC0670.f1835));
            }
            C0899 c0899 = new C0899(this, context, this.f1857.m5657(c0652, new C0904(this, context, mo5374, str, str2, abstractC0830, abstractRunnableC0730)), mo5374, str, str2, abstractC0830, abstractRunnableC0730);
            if (!AbstractC0398.m5397().mo5401()) {
                C0767 c0767 = this.f1857;
                c0767.getClass();
                if (c0767.f2208.m5468(c0652.mo5550().replace(StringFog.decrypt("ZQ==\n", "SiLaLQOwaGY=\n"), StringFog.decrypt("bA==\n", "Qh+sV5WatUk=\n"))) != null) {
                    j = 0;
                    AbstractC1145.m5896(c0899, j);
                    return;
                }
            }
            j = 2000;
            AbstractC1145.m5896(c0899, j);
            return;
        }
        AbstractC1145.m5895(abstractRunnableC0730);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m5636(String str) {
        return this.f1861.containsKey(str) && ((C1033) this.f1861.get(str)).m5807(this.f1859);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5623(HashMap hashMap) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            jSONObject2.put(str.toLowerCase(), (JSONObject) hashMap.get(str));
        }
        jSONObject.put(StringFog.decrypt("B3M9Rw==\n", "cQBTNGxuM3M=\n"), jSONObject2);
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5634(String str, List list) {
        ArrayList arrayList;
        if (this.f1869.get()) {
            return;
        }
        if (this.f1867 != null) {
            arrayList = new ArrayList(this.f1867);
        } else {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C0969) it.next()).m5789().iterator();
            while (it2.hasNext()) {
                C1226 c1226 = (C1226) it2.next();
                c1226.getClass();
                String str2 = C1226.f3469 + str;
                AbstractC1145.m5892(new C0803(c1226, str2, list));
                AbstractC1145.m5891(new C0768(c1226, str2, list));
                try {
                    AbstractC1145.m5893(new C0706(new C0750(c1226, str2, list)));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m5631() {
        return this.f1858;
    }
}
