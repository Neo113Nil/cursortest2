package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class d {
    public static final d d = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5448a = new HashMap();
    public final HashMap b = new HashMap();
    public final f c = new f();

    public final g a(String str) {
        try {
            if (str == null) {
                return this.c;
            }
            g gVar = (g) this.f5448a.get(str);
            if (gVar != null) {
                return gVar;
            }
            e eVar = new e();
            this.f5448a.put(str, eVar);
            return eVar;
        } catch (Exception unused) {
            return this.c;
        }
    }

    public final i b(String str) {
        i iVar = (i) this.b.get(str);
        if (iVar == null) {
            iVar = new i();
        }
        this.b.put(str, iVar);
        return iVar;
    }
}
