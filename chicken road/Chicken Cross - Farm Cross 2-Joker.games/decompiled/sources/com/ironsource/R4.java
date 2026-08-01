package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4531m8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class R4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Q4> f7870a = new LinkedHashMap();
    private final Map<String, Q4> b = new LinkedHashMap();
    private final Map<String, Q4> c = new LinkedHashMap();

    private Map<String, Q4> b(C4531m8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C4531m8.e.RewardedVideo.name())) {
            return this.f7870a;
        }
        if (eVar.name().equalsIgnoreCase(C4531m8.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(C4531m8.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public Collection<Q4> a(C4531m8.e eVar) {
        Map<String, Q4> b = b(eVar);
        return b != null ? b.values() : new ArrayList();
    }

    public Q4 a(C4531m8.e eVar, String str) {
        Map<String, Q4> b;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null) {
            return null;
        }
        return b.get(str);
    }

    public void b(C4531m8.e eVar, String str) {
        Map<String, Q4> b;
        Q4 remove;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null || (remove = b.remove(str)) == null) {
            return;
        }
        remove.a();
    }

    private void a(C4531m8.e eVar, String str, Q4 q4) {
        Map<String, Q4> b;
        if (TextUtils.isEmpty(str) || q4 == null || (b = b(eVar)) == null) {
            return;
        }
        b.put(str, q4);
    }

    public Q4 a(C4531m8.e eVar, J9 j9) {
        Q4 q4 = new Q4(j9);
        a(eVar, j9.e(), q4);
        return q4;
    }

    public Q4 a(C4531m8.e eVar, String str, Map<String, String> map, Gc gc) {
        Q4 q4 = new Q4(str, str, map, gc);
        a(eVar, str, q4);
        return q4;
    }
}
