package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public abstract class y {
    public static boolean a() {
        boolean z;
        java.lang.String str = android.os.Build.BRAND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        if (kotlin.text.StringsKt.startsWith$default(str, "generic", false, 2, (java.lang.Object) null)) {
            java.lang.String str2 = android.os.Build.DEVICE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            if (kotlin.text.StringsKt.startsWith$default(str2, "generic", false, 2, (java.lang.Object) null)) {
                z = true;
                java.lang.String str3 = android.os.Build.FINGERPRINT;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                boolean startsWith$default = kotlin.text.StringsKt.startsWith$default(str3, "generic", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                boolean startsWith$default2 = kotlin.text.StringsKt.startsWith$default(str3, "unknown", false, 2, (java.lang.Object) null);
                java.lang.String str4 = android.os.Build.HARDWARE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
                boolean contains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) "goldfish", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
                boolean contains$default2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) "ranchu", false, 2, (java.lang.Object) null);
                java.lang.String str5 = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                boolean contains$default3 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                boolean contains$default4 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) "Emulator", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                boolean contains$default5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) "Android SDK built for x86", false, 2, (java.lang.Object) null);
                java.lang.String str6 = android.os.Build.MANUFACTURER;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                boolean contains$default6 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str6, (java.lang.CharSequence) "Genymotion", false, 2, (java.lang.Object) null);
                java.lang.String str7 = android.os.Build.PRODUCT;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "sdk_google", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default9 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "sdk", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default10 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "sdk_x86", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default11 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "sdk_gphone64_arm64", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default12 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "vbox86p", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default13 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "emulator", false, 2, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                boolean contains$default14 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "simulator", false, 2, (java.lang.Object) null);
                return !z ? true : true;
            }
        }
        z = false;
        java.lang.String str32 = android.os.Build.FINGERPRINT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str32, "");
        boolean startsWith$default3 = kotlin.text.StringsKt.startsWith$default(str32, "generic", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str32, "");
        boolean startsWith$default22 = kotlin.text.StringsKt.startsWith$default(str32, "unknown", false, 2, (java.lang.Object) null);
        java.lang.String str42 = android.os.Build.HARDWARE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str42, "");
        boolean contains$default15 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str42, (java.lang.CharSequence) "goldfish", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str42, "");
        boolean contains$default22 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str42, (java.lang.CharSequence) "ranchu", false, 2, (java.lang.Object) null);
        java.lang.String str52 = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str52, "");
        boolean contains$default32 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str52, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str52, "");
        boolean contains$default42 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str52, (java.lang.CharSequence) "Emulator", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str52, "");
        boolean contains$default52 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str52, (java.lang.CharSequence) "Android SDK built for x86", false, 2, (java.lang.Object) null);
        java.lang.String str62 = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str62, "");
        boolean contains$default62 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str62, (java.lang.CharSequence) "Genymotion", false, 2, (java.lang.Object) null);
        java.lang.String str72 = android.os.Build.PRODUCT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default72 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "sdk_google", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default82 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default92 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "sdk", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default102 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "sdk_x86", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default112 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "sdk_gphone64_arm64", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default122 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "vbox86p", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default132 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "emulator", false, 2, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str72, "");
        boolean contains$default142 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str72, (java.lang.CharSequence) "simulator", false, 2, (java.lang.Object) null);
        return !z ? true : true;
    }
}
