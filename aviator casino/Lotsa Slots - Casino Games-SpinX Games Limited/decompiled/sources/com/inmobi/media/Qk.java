package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Qk {

    /* renamed from: a, reason: collision with root package name */
    public static com.inmobi.media.C2764t1 f4922a;

    public static void a() {
        try {
            c();
            b();
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Qk", "TAG");
            e.getMessage();
        }
    }

    public static void b() {
        java.lang.String str;
        try {
            com.inmobi.media.C2764t1 c2764t1 = f4922a;
            if (c2764t1 == null || (str = c2764t1.b) == null) {
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Qk", "TAG");
            com.inmobi.media.Sb.a((byte) 2, "Qk", "Publisher device Id is " + str);
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Qk", "TAG");
            e.getMessage();
        }
    }

    public static void c() {
        boolean booleanValue;
        com.inmobi.media.C2764t1 c2764t1;
        try {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                com.inmobi.media.C2764t1 c2764t12 = new com.inmobi.media.C2764t1();
                try {
                    kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.android.gms.ads.identifier.AdvertisingIdClient.class).getSimpleName();
                    try {
                        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c2764t12.b = advertisingIdInfo.getId();
                        c2764t12.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        f4922a = c2764t12;
                        java.lang.Boolean bool = com.inmobi.media.AbstractC2332ch.b;
                        if (bool != null) {
                            booleanValue = bool.booleanValue();
                        } else {
                            android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                            if (context2 != null) {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context2, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                                com.inmobi.media.AbstractC2332ch.b = java.lang.Boolean.valueOf(a2.f4815a.getBoolean("user_age_restricted", false));
                            }
                            java.lang.Boolean bool2 = com.inmobi.media.AbstractC2332ch.b;
                            if (bool2 == null) {
                                return;
                            } else {
                                booleanValue = bool2.booleanValue();
                            }
                        }
                        if (!booleanValue || (c2764t1 = f4922a) == null) {
                            return;
                        }
                        c2764t1.b = null;
                    } catch (java.lang.Throwable th) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Qk", "TAG");
                        th.getMessage();
                    }
                } catch (java.lang.NoClassDefFoundError unused) {
                }
            }
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Qk", "TAG");
            e.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a(boolean z) {
        com.inmobi.media.C2764t1 c2764t1 = f4922a;
        if (c2764t1 == null) {
            return;
        }
        if (z) {
            c2764t1.b = null;
        } else if (c2764t1.b == null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Qk$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Qk.d();
                }
            };
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            com.inmobi.media.Xi.g.submit(runnable);
        }
    }
}
