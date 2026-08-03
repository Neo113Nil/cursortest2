package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.response.b {
    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(java.lang.String str, com.fyber.inneractive.sdk.config.r0 r0Var) {
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) this.f4250a;
        if (android.text.TextUtils.isEmpty(fVar.z) && r0Var != null) {
            fVar.z = r0Var.b;
        }
        if (str == null) {
            str = null;
        } else {
            com.fyber.inneractive.sdk.util.s0 s0Var = com.fyber.inneractive.sdk.util.s0.c;
            s0Var.getClass();
            int indexOf = str.indexOf(38);
            if (indexOf >= 0) {
                java.io.StringWriter stringWriter = new java.io.StringWriter((int) ((str.length() * 0.1d) + str.length()));
                try {
                    s0Var.a(stringWriter, str, indexOf);
                } catch (java.io.IOException unused) {
                }
                str = stringWriter.toString();
            }
        }
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!android.text.TextUtils.isEmpty(property)) {
            java.lang.String b = com.fyber.inneractive.sdk.util.o.b(property);
            if (!android.text.TextUtils.isEmpty(b)) {
                str = b;
            }
        }
        fVar.K = str;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final com.fyber.inneractive.sdk.response.e a() {
        com.fyber.inneractive.sdk.response.f fVar = new com.fyber.inneractive.sdk.response.f();
        this.f4250a = fVar;
        return fVar;
    }
}
