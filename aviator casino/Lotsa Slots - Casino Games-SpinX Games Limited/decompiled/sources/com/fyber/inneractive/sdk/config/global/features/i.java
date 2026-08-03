package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes3.dex */
public abstract class i extends com.fyber.inneractive.sdk.config.global.p {
    public java.lang.String b;
    public java.util.HashMap c = new java.util.HashMap();
    public java.util.HashMap d = new java.util.HashMap();

    public i(java.lang.String str) {
        this.b = str;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.util.Iterator it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = ((com.fyber.inneractive.sdk.config.global.k) this.d.get((java.lang.String) it.next())).b(str);
            if (str3 != null) {
                break;
            }
        }
        if (str3 != null) {
            return str3;
        }
        com.fyber.inneractive.sdk.config.global.n nVar = this.f3610a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    public abstract com.fyber.inneractive.sdk.config.global.features.i b();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final java.lang.String b(java.lang.String str) {
        return a(str, null);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final java.lang.Boolean c(java.lang.String str) {
        java.lang.Boolean bool;
        java.util.Iterator it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = ((com.fyber.inneractive.sdk.config.global.k) this.d.get((java.lang.String) it.next())).c(str);
            if (bool != null) {
                break;
            }
        }
        return bool == null ? super.c(str) : bool;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("id: %s, params: %s exp: %s", this.b, this.f3610a, this.c);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final java.lang.Integer a(java.lang.String str) {
        java.lang.Integer num;
        java.util.Iterator it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = ((com.fyber.inneractive.sdk.config.global.k) this.d.get((java.lang.String) it.next())).a(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.a(str) : num;
    }

    public final void a(com.fyber.inneractive.sdk.config.global.features.i iVar) {
        iVar.b = this.b;
        iVar.f3610a = this.f3610a;
        iVar.c = new java.util.HashMap(this.c);
        iVar.d = new java.util.HashMap(this.d);
    }
}
