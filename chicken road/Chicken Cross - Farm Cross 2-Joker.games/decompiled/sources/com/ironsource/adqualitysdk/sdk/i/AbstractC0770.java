package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0770 extends AbstractC1108 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public C0691 f2213;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public AbstractViewOnLayoutChangeListenerC4320y f2214;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f2215 = new WeakHashMap();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C0772 f2212 = new C0772();

    static {
        StringFog.decrypt("ci8E3o0t7v5RNCnWti/y/1g/Gg==\n", "NFposv5OnJs=\n");
    }

    public AbstractC0770(C0691 c0691) {
        this.f2213 = c0691;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5660(Object obj) {
        JSONObject jSONObject = new JSONObject();
        K k = m5661(obj).f301;
        mo5354(jSONObject, k != null ? (WebView) k.f125.f103.get() : null, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108, com.ironsource.adqualitysdk.sdk.i.InterfaceC1005
    /* renamed from: ｋ */
    public final void mo5351(JSONObject jSONObject, View view, Object obj) {
        mo5349(jSONObject, (WebView) view, obj);
    }

    /* renamed from: ﾇ */
    public abstract View mo5336(Object obj);

    /* renamed from: ﾇ */
    public abstract AbstractViewOnLayoutChangeListenerC4320y mo5337();

    /* renamed from: ﾇ */
    public abstract void mo5338(Object obj, ArrayList arrayList);

    /* renamed from: ﾒ */
    public abstract InterfaceC1005 mo5339();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5663(JSONObject jSONObject, Object obj, String str) {
        C0772 c0772 = this.f2212;
        boolean z = c0772.f2224 && !TextUtils.isEmpty(c0772.f2227);
        AbstractViewOnLayoutChangeListenerC4320y m5661 = m5661(obj);
        if (m5661 == null) {
            m5661 = mo5337();
            if (this.f2212.f2219) {
                this.f2215.put(obj, m5661);
            } else {
                this.f2214 = m5661;
            }
            m5661.f3235 = mo5339();
        }
        for (WebView webView : m5661.f300.keySet()) {
            webView.removeOnLayoutChangeListener(m5661);
            K k = (K) m5661.f300.get(webView);
            Iterator it = m5661.f298.iterator();
            while (it.hasNext()) {
                k.f124.remove((InterfaceC0829) it.next());
            }
        }
        m5661.f298.clear();
        m5661.f301 = null;
        m5661.f300.clear();
        C0772 c07722 = this.f2212;
        String str2 = c07722.f2227;
        List list = c07722.f2226;
        boolean z2 = c07722.f2221;
        boolean z3 = c07722.f2220;
        m5661.f303 = z;
        m5661.f299 = new H(str2, z3);
        m5661.f302 = z2;
        m5661.f305 = list;
        m5661.f304 = str;
        if (!this.f2212.f2222) {
            super.mo5351(jSONObject, null, obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo5338(obj, arrayList);
        List arrayList2 = new ArrayList();
        C0691 c0691 = this.f2213;
        if (c0691 != null) {
            try {
                C0623 c0623 = c0691.f1886;
                C1226 c1226 = c0691.f1884;
                arrayList2 = (List) c0623.m5583(c1226.f3483, c1226, Collections.singletonList(obj)).f3386;
            } catch (Exception unused) {
                AbstractC0544.m5502(StringFog.decrypt("lPPhm+9B6meK//+A/krOcQ==\n", "xpaM9JskqwM=\n"), StringFog.decrypt("gUzxBBkjzvWwSuoFDCPe9aZo6g4ccIn2tlHuSw==\n", "xD6Da2sDqZA=\n") + c0691.f1885);
                arrayList2 = null;
            }
        }
        String str3 = AbstractC0494.f1141;
        HashSet hashSet = new HashSet(arrayList);
        if (arrayList2 != null) {
            hashSet.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(hashSet);
        if (arrayList3.isEmpty() || this.f2212.f2223) {
            View mo5336 = mo5336(obj);
            if (mo5336 != null) {
                mo5336.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0809(this, obj));
            }
            if (arrayList3.isEmpty()) {
                super.mo5351(jSONObject, null, obj);
                return;
            }
        }
        if (this.f2212.f2218) {
            AbstractC1145.f3288.post(new RunnableC0775(this, obj, arrayList3, jSONObject));
        } else {
            m5662(obj, arrayList3);
            super.mo5351(jSONObject, (WebView) arrayList3.get(0), obj);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractViewOnLayoutChangeListenerC4320y m5661(Object obj) {
        if (this.f2212.f2219) {
            return (AbstractViewOnLayoutChangeListenerC4320y) this.f2215.get(obj);
        }
        return this.f2214;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5659(AbstractC0770 abstractC0770, JSONObject jSONObject, WebView webView, Object obj) {
        super.mo5351(jSONObject, webView, obj);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5662(Object obj, ArrayList arrayList) {
        AbstractViewOnLayoutChangeListenerC4320y m5661 = m5661(obj);
        m5661.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m5661.m5379((WebView) it.next());
        }
        if (this.f2212.f2225) {
            m5661(obj).f304 = Integer.toHexString(((WebView) arrayList.get(0)).hashCode());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108
    /* renamed from: ﾒ */
    public final String mo5378(Object obj) {
        return m5661(obj).f304;
    }
}
