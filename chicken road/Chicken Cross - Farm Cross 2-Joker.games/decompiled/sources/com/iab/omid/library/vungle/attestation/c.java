package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {
    private static final Map<String, k> d = new HashMap();
    private static volatile c e;

    /* renamed from: a, reason: collision with root package name */
    private final d f6385a = new d();
    private final Context b;
    private volatile List<b> c;

    private c(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
        c();
    }

    public static c a(Context context) {
        if (e == null) {
            synchronized (c.class) {
                if (e == null) {
                    e = new c(context);
                }
            }
        }
        return e;
    }

    private void c() {
        d.put("FireTVFOSDAT", j.a(this.b));
    }

    public List<b> a() {
        b a2;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, k> entry : d.entrySet()) {
                    if (entry.getValue().a() && (a2 = this.f6385a.a(entry.getKey(), this.b)) != null) {
                        arrayList.add(a2);
                    }
                }
                this.c = arrayList;
                return this.c;
            } catch (Exception e2) {
                com.iab.omid.library.vungle.utils.d.a("Error getting supported attestation mechanisms", e2);
                this.c = new ArrayList();
                return this.c;
            }
        }
    }

    public boolean a(String str) {
        k kVar = d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }

    public boolean b() {
        return a().size() > 0;
    }
}
