package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
class b {
    private static final java.lang.String b = "b";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.sdk.controller.v.s f6606a;

    b(com.ironsource.sdk.controller.v.s sVar) {
        this.f6606a = sVar;
    }

    synchronized void a(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (this.f6606a == null) {
            com.ironsource.sdk.utils.Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        java.lang.reflect.Method declaredMethod = com.ironsource.sdk.controller.v.s.class.getDeclaredMethod(str, java.lang.String.class);
        if (declaredMethod.isAnnotationPresent(android.webkit.JavascriptInterface.class)) {
            declaredMethod.invoke(this.f6606a, str2);
        } else {
            throw new java.security.AccessControlException("Trying to access a private function: " + str);
        }
    }

    void b(java.lang.String str) {
        com.ironsource.sdk.controller.v.s sVar = this.f6606a;
        if (sVar != null) {
            sVar.v(str);
        }
    }

    void a(java.lang.String str) {
        com.ironsource.sdk.controller.v.s sVar = this.f6606a;
        if (sVar != null) {
            sVar.u(str);
        }
    }
}
