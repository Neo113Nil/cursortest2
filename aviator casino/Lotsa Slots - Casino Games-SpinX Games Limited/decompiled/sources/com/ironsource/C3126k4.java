package com.ironsource;

/* renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3126k4 {
    private final boolean b() {
        return true;
    }

    private final boolean c() {
        try {
            java.lang.Class.forName("kotlinx.coroutines.test.TestScope");
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private final boolean d() {
        try {
            java.lang.reflect.Method[] declaredMethods = java.lang.Class.forName("kotlinx.coroutines.flow.FlowKt").getDeclaredMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "flowKtClass.declaredMethods");
            for (java.lang.reflect.Method method : declaredMethods) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(method.getName(), "chunked") && kotlin.UByte$$ExternalSyntheticBackport0.m(method) == 2) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public final java.lang.String a() {
        return d() ? "1.9.0+" : c() ? "1.6.0-1.8.x" : b() ? "1.3.0-1.5.x" : "<1.3.0";
    }
}
