package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˊ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0447 extends AbstractC1108 {

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f742 = StringFog.decrypt("l5P8TDaQj1yglP1XEoY=\n", "wfqZO3f0/BQ=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public C0448 f744;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public Class f745;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final C0436 f748;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C0650 f750;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f751 = new WeakHashMap();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final WeakHashMap f747 = new WeakHashMap();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f746 = new WeakHashMap();

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final ArrayList f743 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC0437 f749 = new ViewOnLayoutChangeListenerC0437(this);

    public C0447(JSONObject jSONObject, C0650 c0650) {
        this.f744 = new C0448();
        this.f744 = new C0448(jSONObject);
        this.f750 = c0650;
        C0436 c0436 = new C0436(this);
        this.f748 = c0436;
        C1188.m5907().m5909(c0436);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5443(C0447 c0447, ArrayList arrayList) {
        int i;
        c0447.getClass();
        for (0; i < arrayList.size(); i + 1) {
            View view = (View) arrayList.get(i);
            C0448 c0448 = c0447.f744;
            if (c0447.f750 != null) {
                List<String> list = c0448.f752;
                if (list != null && !list.isEmpty()) {
                    String name = view.getClass().getPackage().getName();
                    for (String str : list) {
                        if (TextUtils.isEmpty(str)) {
                            str = null;
                        } else {
                            List asList = Arrays.asList(str.split(StringFog.decrypt("56Rl\n", "vIo4k393MmY=\n")));
                            if (asList.size() > 3) {
                                str = TextUtils.join(StringFog.decrypt("TA==\n", "YqTnY1lw2qM=\n"), asList.subList(0, 3));
                            }
                        }
                        if (TextUtils.isEmpty(str) || !name.startsWith(str)) {
                        }
                    }
                }
                C0650 c0650 = c0447.f750;
                C0623 c0623 = c0650.f1789;
                C1226 c1226 = c0650.f1788;
                i = c0623.m5583(c1226.f3483, c1226, Collections.singletonList(view)).m5918() ? 0 : i + 1;
            }
            if (!c0448.f761) {
                ArrayList arrayList2 = new ArrayList();
                AbstractC4297a.m5341(view, WebView.class, null, false, c0448.f759, c0448.f755, c0448.f753, arrayList2);
                if (view instanceof WebView) {
                    arrayList2.add((WebView) view);
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    WebView webView = (WebView) it.next();
                    if (c0447.f747.get(webView) == null && webView.getClass().getName().startsWith(c0448.f765)) {
                        C4321z c4321z = new C4321z();
                        c0447.f751.put(webView, c4321z);
                        String str2 = c0448.f764;
                        List asList2 = TextUtils.isEmpty(c0448.f762) ? null : Arrays.asList(c0448.f762.split(StringFog.decrypt("ng==\n", "sjDaGCpXnQY=\n")));
                        boolean z = c0448.f758;
                        boolean z2 = c0448.f763;
                        boolean z3 = c0448.f757;
                        c4321z.f303 = z;
                        c4321z.f299 = new H(str2, z3);
                        c4321z.f302 = z2;
                        c4321z.f305 = asList2;
                        c4321z.f3235 = new C0451(c0447);
                        c4321z.m5379(webView);
                        c4321z.f304 = Integer.toHexString(webView.hashCode());
                        c0447.f747.put(webView, c0447);
                    }
                }
            } else if (((C0447) c0447.f747.get(view)) == null) {
                c0447.f747.put(view, c0447);
                c0447.mo5351(new JSONObject(), view, null);
            } else if (c0448.f760) {
                c0447.mo5351(new JSONObject(), view, null);
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5444(View view) {
        Activity m5342;
        try {
            if (this.f745 == null) {
                this.f745 = Class.forName(this.f744.f766);
            }
            Activity mo5524 = AbstractC0554.m5521().mo5524();
            if (mo5524 == null) {
                return;
            }
            if (this.f744.f754.isEmpty() || (m5342 = AbstractC4297a.m5342(view)) == null || !this.f744.f754.contains(m5342.getClass().getName())) {
                AbstractC1145.m5895(new C0452(this, mo5524, view));
            }
        } catch (Throwable th) {
            AbstractC0544.m5502(f742, StringFog.decrypt("C7RU2r7GwGM6sk/bq8bEai+1VZU=\n", "TsYmtczmpwY=\n") + this.f744.f766 + StringFog.decrypt("KZCf\n", "Cb2/VjSFRdU=\n") + th.getLocalizedMessage());
            m5445();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108
    /* renamed from: ﾒ */
    public final /* bridge */ /* synthetic */ String mo5378(Object obj) {
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5445() {
        this.f3235 = null;
        C1188.m5907().m5908(this.f748);
        HashSet hashSet = new HashSet(this.f746.keySet());
        this.f746.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.f749);
        }
    }
}
