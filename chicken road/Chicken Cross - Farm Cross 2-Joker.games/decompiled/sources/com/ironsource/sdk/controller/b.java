package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* loaded from: classes6.dex */
class b {
    private static final String b = "b";

    /* renamed from: a, reason: collision with root package name */
    private final v.s f8545a;

    b(v.s sVar) {
        this.f8545a = sVar;
    }

    synchronized void a(String str, String str2) throws Exception {
        if (this.f8545a == null) {
            Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.s.class.getDeclaredMethod(str, String.class);
        if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
        declaredMethod.invoke(this.f8545a, str2);
    }

    void b(String str) {
        v.s sVar = this.f8545a;
        if (sVar != null) {
            sVar.v(str);
        }
    }

    void a(String str) {
        v.s sVar = this.f8545a;
        if (sVar != null) {
            sVar.u(str);
        }
    }
}
