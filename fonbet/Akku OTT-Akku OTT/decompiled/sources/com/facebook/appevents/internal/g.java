package com.facebook.appevents.internal;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.os.EnvironmentCompat;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class g {
    public static final /* synthetic */ int a = 0;

    static {
        new g();
    }

    @JvmStatic
    public static final View a(Activity activity) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean b() {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean startsWith$default3;
        boolean startsWith$default4;
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, "generic", false, 2, null);
        if (startsWith$default) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, EnvironmentCompat.MEDIA_UNKNOWN, false, 2, null);
        if (startsWith$default2) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        contains$default = StringsKt__StringsKt.contains$default(MODEL, "google_sdk", false, 2, (Object) null);
        if (contains$default) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        contains$default2 = StringsKt__StringsKt.contains$default(MODEL, "Emulator", false, 2, (Object) null);
        if (contains$default2) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        contains$default3 = StringsKt__StringsKt.contains$default(MODEL, "Android SDK built for x86", false, 2, (Object) null);
        if (contains$default3) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        contains$default4 = StringsKt__StringsKt.contains$default(MANUFACTURER, "Genymotion", false, 2, (Object) null);
        if (contains$default4) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(BRAND, "generic", false, 2, null);
        if (startsWith$default3) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(DEVICE, "generic", false, 2, null);
            if (startsWith$default4) {
                return true;
            }
        }
        return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
    }
}
