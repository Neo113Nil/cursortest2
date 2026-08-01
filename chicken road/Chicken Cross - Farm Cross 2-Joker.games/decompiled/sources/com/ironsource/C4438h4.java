package com.ironsource;

import java.lang.reflect.Method;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4438h4 {
    private final boolean b() {
        return true;
    }

    private final boolean c() {
        try {
            Class.forName("kotlinx.coroutines.test.TestScope");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final boolean d() {
        try {
            Method[] declaredMethods = Class.forName("kotlinx.coroutines.flow.FlowKt").getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "flowKtClass.declaredMethods");
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual(method.getName(), "chunked") && UByte$$ExternalSyntheticBackport0.m(method) == 2) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String a() {
        return d() ? "1.9.0+" : c() ? "1.6.0-1.8.x" : b() ? "1.3.0-1.5.x" : "<1.3.0";
    }
}
