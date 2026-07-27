package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532h0 implements InterfaceC0892uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C0840so(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C0840so(this, true, "");
        } catch (Throwable unused) {
            return new C0840so(this, false, B0.c.k("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
