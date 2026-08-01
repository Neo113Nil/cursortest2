package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u0 extends v0 {
    public static final String t = IAlog.a(u0.class);

    public u0(com.fyber.inneractive.sdk.flow.nativead.t tVar, Context context, com.fyber.inneractive.sdk.cache.e eVar) {
        super(tVar, context, eVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final void a(o0 o0Var, String str, String str2) {
        d0 d0Var = this.s;
        if (d0Var == null) {
            IAlog.f("%s: failed to cache file: no cache helper", t);
            return;
        }
        d0Var.b(str2);
        if (o0Var == null || TextUtils.isEmpty(o0Var.b) || TextUtils.isEmpty(str)) {
            IAlog.f("%s: failed to cache file: empty result", t);
            return;
        }
        boolean a2 = this.s.a(str, o0Var.b);
        Uri uri = (Uri) this.s.a().f5209a;
        o0Var.f5505a = uri;
        if (a2) {
            this.r.a(uri);
        } else {
            IAlog.b("%s: Failed to cache file", t);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c() {
        this.f5511a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final a i() {
        e0 e0Var = new e0(this.q, this.r, com.fyber.inneractive.sdk.nativead.b.f.b);
        this.s = e0Var;
        com.fyber.inneractive.sdk.cache.n a2 = e0Var.a();
        String str = a2.b;
        Uri uri = (Uri) a2.f5209a;
        this.r.c();
        return new a(uri, str);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        o0 o0Var = new o0();
        try {
            o0Var.b = new String(Base64.encode(com.fyber.inneractive.sdk.util.v.a(lVar.c), 0));
            return o0Var;
        } catch (Exception e) {
            IAlog.b("%s : failed parse cacheable network request", t, e);
            throw new n0(e);
        }
    }
}
