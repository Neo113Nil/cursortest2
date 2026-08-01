package com.moloco.sdk.internal;

import com.moloco.sdk.service_locator.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f10430a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.A$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return A.a();
        }
    });
    public static final String b = "[ERROR_CODE]";
    public static final String c = "[HAPPENED_AT_TS]";

    public static final z a() {
        return new z(a.i.f10874a.c());
    }

    public static final y b() {
        return c();
    }

    public static final z c() {
        return (z) f10430a.getValue();
    }
}
