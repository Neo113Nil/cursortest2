package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.rk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4055rk {
    public static void a() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.rk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4055rk.b();
            }
        };
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (Og.a(AbstractC3914mk.f7252a, str)) {
                sb.append("\n").append(str);
            }
        }
        Kc.a((byte) 2, "InMobiSdk", sb.toString());
    }

    public static void a(long j, Short sh) {
        String str;
        if (sh == null) {
            String str2 = "Provider full init starting; latency=" + j + ".";
            return;
        }
        short shortValue = sh.shortValue();
        if (shortValue == 2421) {
            str = "sdk_init_active";
        } else if (shortValue == 2423) {
            str = "account_id_reset_enabled";
        } else if (shortValue == 2420) {
            str = "account_id_unavailable";
        } else if (shortValue == 2422) {
            str = "start_exception";
        } else if (shortValue == 2424) {
            str = "pre_init_disabled";
        } else {
            str = "unknown";
        }
        String str3 = "Provider full init skipped; reason=" + str + " latency=" + j + ".";
    }

    public static void a(String sourceName, String str, String str2, Long l) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        if (str2 == null) {
            Kc.a((byte) 2, "InMobiSdk", "InMobi SDK initialized with account id: " + str);
            String str3 = "SDK init completed successfully; source=" + sourceName + " latency=" + l + " accountId=" + str + ".";
        } else {
            String str4 = "SDK init completed with failure; source=" + sourceName + " error=" + str2 + " latency=" + l + ".";
        }
    }
}
