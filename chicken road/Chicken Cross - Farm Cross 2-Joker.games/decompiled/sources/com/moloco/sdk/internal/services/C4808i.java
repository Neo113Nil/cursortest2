package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.core.content.ContextCompat;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.services.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4808i implements y {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10800a;
    public final Lazy b;

    public C4808i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10800a = context;
        this.b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.services.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4808i.a(C4808i.this));
            }
        });
    }

    public static final boolean a(C4808i c4808i) {
        return c4808i.f10800a.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    @Override // com.moloco.sdk.internal.services.y
    public x b() {
        String str;
        String str2 = Build.MANUFACTURER;
        String str3 = str2 == null ? "" : str2;
        String str4 = Build.MODEL;
        String str5 = str4 == null ? "" : str4;
        String str6 = Build.HARDWARE;
        String str7 = str6 == null ? "" : str6;
        boolean e = e();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        int i = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this.f10800a, TelephonyManager.class);
        if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
            str = "";
        }
        float f = Resources.getSystem().getDisplayMetrics().density;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        String str8 = str6 == null ? "" : str6;
        String str9 = Build.BRAND;
        return new x(str3, str5, str7, e, "android", RELEASE, i, language, str, f, currentTimeMillis, str8, str9 == null ? "" : str9);
    }

    @Override // com.moloco.sdk.internal.services.y
    public String c() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @Override // com.moloco.sdk.internal.services.y
    public String d() {
        Object systemService = this.f10800a.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            return currentInputMethodSubtype.getLocale();
        }
        return null;
    }

    public final boolean e() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // com.moloco.sdk.internal.services.y
    @Deprecated(message = "Use invoke() instead", replaceWith = @ReplaceWith(expression = "deviceInfo", imports = {}))
    public x invoke() {
        return b();
    }

    @Override // com.moloco.sdk.internal.services.y
    public Boolean a() {
        try {
            Object systemService = this.f10800a.getSystemService("sensor");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            return Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (Exception unused) {
            return null;
        }
    }
}
