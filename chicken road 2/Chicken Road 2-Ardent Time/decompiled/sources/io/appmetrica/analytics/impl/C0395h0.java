package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395h0 implements io.appmetrica.analytics.impl.InterfaceC0703so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new io.appmetrica.analytics.impl.C0652qo(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            java.util.UUID.fromString(str);
            return new io.appmetrica.analytics.impl.C0652qo(this, true, "");
        } catch (java.lang.Throwable unused) {
            return new io.appmetrica.analytics.impl.C0652qo(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
