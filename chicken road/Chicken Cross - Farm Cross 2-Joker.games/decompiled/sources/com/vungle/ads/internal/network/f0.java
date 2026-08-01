package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f12048a = a();
    public static String b;
    public static String c;

    public static void a(String str) {
        b = str;
    }

    public static String b() {
        return b;
    }

    public static void c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f12048a = str;
    }

    public static String d() {
        return f12048a;
    }

    public static String a() {
        return (Intrinsics.areEqual("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat(BuildConfig.VERSION_NAME);
    }

    public static void b(String str) {
        c = str;
    }

    public static String c() {
        return c;
    }
}
