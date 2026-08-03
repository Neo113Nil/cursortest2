package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Sb {

    /* renamed from: a, reason: collision with root package name */
    public static byte f4954a;

    public static final void a(byte b, java.lang.String tag, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        if (str == null) {
            return;
        }
        if (b == 1) {
            byte b2 = f4954a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                android.util.Log.e("[InMobi]", str);
                return;
            }
            return;
        }
        if (b != 2) {
            if (b == 3) {
                a(tag, str);
            }
        } else {
            byte b3 = f4954a;
            if (2 == b3 || 3 == b3) {
                android.util.Log.d("[InMobi]", str);
            }
        }
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if (str2.length() > 4000) {
            java.lang.String substring = str2.substring(0, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            android.util.Log.d(str, substring);
            java.lang.String substring2 = str2.substring(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            a(str, substring2);
            return;
        }
        android.util.Log.d(str, str2);
    }
}
