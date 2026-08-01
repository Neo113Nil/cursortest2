package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.nativead.g;
import com.fyber.inneractive.sdk.flow.nativead.s;
import com.fyber.inneractive.sdk.flow.nativead.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.nativead.j;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements d, s {
    public static final String h = IAlog.a(b.class);

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.f f5371a;
    public c b;
    public u0 c;
    public com.fyber.inneractive.sdk.flow.nativead.b d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;
    public j e;
    public r f;
    public long g;

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, j jVar, r rVar) {
        this.f5371a = fVar;
        this.b = fVar2;
        this.e = jVar;
        this.f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) {
        if (this.d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
            String message = exc != null ? exc.getMessage() : "Failed to download main media image: " + iVar.name();
            IAlog.f("%s : %s", h, message);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            c cVar = this.b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, message);
                return;
            }
            return;
        }
        if (this.e != null && this.f != null) {
            u uVar = u.EVENT_READY_ON_CLIENT;
            j jVar = this.e;
            JSONArray b = this.f.b();
            w wVar = new w(jVar);
            wVar.c = uVar;
            wVar.f5514a = null;
            wVar.d = b;
            long currentTimeMillis = System.currentTimeMillis() - this.g;
            IAlog.a("%sMain image load took: " + currentTimeMillis + " msec", IAlog.a(this));
            JSONObject jSONObject = new JSONObject();
            String str = this.f5371a.d.f5912a;
            try {
                jSONObject.put("url", str);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str);
            }
            String b2 = com.fyber.inneractive.sdk.util.u.b(gVar.b);
            try {
                jSONObject.put("mime", b2);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mime", b2);
            }
            Long valueOf = Long.valueOf(currentTimeMillis);
            try {
                jSONObject.put("load_time", valueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "load_time", valueOf);
            }
            wVar.f.put(jSONObject);
            wVar.a((String) null);
        }
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar2 = this.b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f5371a;
        if (fVar != null && (cVar = fVar.d) != null && (str = cVar.f5912a) != null && !str.trim().isEmpty()) {
            this.g = System.currentTimeMillis();
            this.d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            t tVar = new t(this.f5371a, this);
            IAConfigManager iAConfigManager = IAConfigManager.R;
            u0 u0Var = new u0(tVar, iAConfigManager.v.f5266a, new com.fyber.inneractive.sdk.cache.e(this.f5371a.d.f5912a));
            this.c = u0Var;
            iAConfigManager.s.a(u0Var);
            return;
        }
        a aVar = new a("Main media image is not loadable");
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = aVar.getMessage();
        IAlog.f("%s : %s", h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        c cVar2 = this.b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u0 u0Var = this.c;
        if (u0Var != null) {
            u0Var.c();
            this.c = null;
        }
        this.e = null;
        this.f = null;
        this.f5371a = null;
        this.b = null;
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
