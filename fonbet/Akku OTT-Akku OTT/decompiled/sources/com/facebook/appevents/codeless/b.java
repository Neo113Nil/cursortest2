package com.facebook.appevents.codeless;

import android.hardware.SensorManager;
import androidx.annotation.RestrictTo;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static SensorManager c;
    public static g d;
    public static String e;
    public static volatile boolean h;
    public static final b a = new b();
    public static final h b = new h();
    public static final AtomicBoolean f = new AtomicBoolean(true);
    public static final AtomicBoolean g = new AtomicBoolean(false);

    @JvmStatic
    public static final String a() {
        if (com.facebook.internal.instrument.crashshield.a.b(b.class)) {
            return null;
        }
        try {
            if (e == null) {
                e = UUID.randomUUID().toString();
            }
            String str = e;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, b.class);
            return null;
        }
    }
}
