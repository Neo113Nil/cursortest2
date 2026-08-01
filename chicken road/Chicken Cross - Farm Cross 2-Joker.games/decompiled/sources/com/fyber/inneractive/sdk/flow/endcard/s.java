package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q0;

/* loaded from: classes4.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f5352a;

    public s(u uVar) {
        this.f5352a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        IAlog.a("%s End-Card loaded", this.f5352a.f5335a);
        this.f5352a.h.set(false);
        u uVar = this.f5352a;
        uVar.getClass();
        boolean z = iVar != null;
        uVar.f = z;
        com.fyber.inneractive.sdk.web.m mVar = z ? iVar.b : null;
        String str = IAConfigManager.R.G.e;
        if (!uVar.f() || mVar == null || TextUtils.isEmpty(str)) {
            uVar.b.m();
        } else {
            q0.a(mVar, str, uVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.f("%s End-Card failed to load!", this.f5352a.f5335a);
        this.f5352a.h.set(false);
        u uVar = this.f5352a;
        uVar.f = false;
        uVar.b.a(inneractiveInfrastructureError);
    }
}
