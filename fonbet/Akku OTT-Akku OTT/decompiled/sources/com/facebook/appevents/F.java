package com.facebook.appevents;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class F implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.internal.instrument.crashshield.a.b(H.class)) {
            return;
        }
        try {
            if (!H.c.get()) {
                H.a.b();
            }
            H.d.clear();
            SharedPreferences sharedPreferences = H.b;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, H.class);
        }
    }
}
