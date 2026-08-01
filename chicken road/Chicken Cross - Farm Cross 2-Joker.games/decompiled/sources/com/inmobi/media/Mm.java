package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public abstract class Mm {

    /* renamed from: a, reason: collision with root package name */
    public static C4229y1 f6724a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Mm", "TAG");
            String str = "SDK encountered an unexpected error while initializing the UID helper component; " + e.getMessage();
        }
    }

    public static void b() {
        String str;
        try {
            C4229y1 c4229y1 = f6724a;
            if (c4229y1 == null || (str = c4229y1.b) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("Mm", "TAG");
            Kc.a((byte) 2, "Mm", "Publisher device Id is " + str);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Mm", "TAG");
            String str2 = "SDK encountered an unexpected error attempting to print the publisher test ID; " + e.getMessage();
        }
    }

    public static void c() {
        boolean z;
        boolean booleanValue;
        C4229y1 c4229y1;
        try {
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                C4229y1 c4229y12 = new C4229y1();
                try {
                    Reflection.getOrCreateKotlinClass(AdvertisingIdClient.class).getSimpleName();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c4229y12.b = advertisingIdInfo.getId();
                        c4229y12.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        f6724a = c4229y12;
                        Boolean bool = AbstractC3940ni.b;
                        if (bool == null) {
                            Context context2 = AbstractC3914mk.f7252a;
                            z = false;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = Db.b;
                                Db a2 = Cb.a(context2, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                                AbstractC3940ni.b = Boolean.valueOf(a2.f6510a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = AbstractC3940ni.b;
                            if (bool2 != null) {
                                booleanValue = bool2.booleanValue();
                            }
                            if (z || (c4229y1 = f6724a) == null) {
                            }
                            c4229y1.b = null;
                            return;
                        }
                        booleanValue = bool.booleanValue();
                        z = booleanValue;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        Intrinsics.checkNotNullExpressionValue("Mm", "TAG");
                        String str = "SDK encountered unexpected error in trying to set the advertising ID " + th.getMessage();
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Mm", "TAG");
            String str2 = "SDK encountered unexpected error in setting the advertising ID; " + e.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a(boolean z) {
        C4229y1 c4229y1 = f6724a;
        if (c4229y1 == null) {
            return;
        }
        if (z) {
            c4229y1.b = null;
        } else if (c4229y1.b == null) {
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.Mm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Mm.d();
                }
            };
            Context context = AbstractC3914mk.f7252a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC3914mk.h.submit(runnable);
        }
    }
}
