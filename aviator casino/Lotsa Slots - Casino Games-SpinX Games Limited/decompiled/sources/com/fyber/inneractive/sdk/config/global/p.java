package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public abstract class p implements com.fyber.inneractive.sdk.config.global.n {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.n f3610a;

    @Override // com.fyber.inneractive.sdk.config.global.n
    public java.lang.Integer a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.global.n nVar = this.f3610a;
        if (nVar == null || nVar.a() == null || this.f3610a.a().size() <= 0) {
            return null;
        }
        return this.f3610a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public java.lang.String b(java.lang.String str) {
        com.fyber.inneractive.sdk.config.global.n nVar = this.f3610a;
        if (nVar == null || nVar.a() == null || this.f3610a.a().size() <= 0) {
            return null;
        }
        return this.f3610a.b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public java.lang.Boolean c(java.lang.String str) {
        com.fyber.inneractive.sdk.config.global.n nVar = this.f3610a;
        if (nVar == null || nVar.a() == null || this.f3610a.a().size() <= 0) {
            return null;
        }
        return this.f3610a.c(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.config.global.n nVar = this.f3610a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final java.util.Map a() {
        com.fyber.inneractive.sdk.config.global.n nVar = this.f3610a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }
}
