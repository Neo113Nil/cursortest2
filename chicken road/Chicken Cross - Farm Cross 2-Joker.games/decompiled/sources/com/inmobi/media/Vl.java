package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vl {
    public static void a(Context context, String collectorId, String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectorId, "collectorId");
        Intrinsics.checkNotNullParameter(value, "value");
        a(context).a(a(collectorId), value, false);
    }

    public static String b(String str) {
        return "synapse_" + str + "_failure_count";
    }

    public static String c(String str) {
        return "synapse_" + str + "_last_run_at";
    }

    public static Db a(Context context) {
        ConcurrentHashMap concurrentHashMap = Db.b;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return Cb.a(applicationContext, "synapse_signal_store");
    }

    public static String a(String str) {
        return "synapse_" + str + "_config_fp";
    }
}
