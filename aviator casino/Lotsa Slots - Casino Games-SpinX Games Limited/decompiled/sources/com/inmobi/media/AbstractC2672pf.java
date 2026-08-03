package com.inmobi.media;

/* renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2672pf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.core.config.models.CrashConfig f5392a;

    static {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.CrashConfig.class, "clazz");
        f5392a = (com.inmobi.media.core.config.models.CrashConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.CrashConfig.class);
        java.lang.System.currentTimeMillis();
    }

    public static void a(org.json.JSONObject payload, boolean z, boolean z2, long j) {
        int i;
        int i2;
        long j2;
        long j3;
        long[] jArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        if (f5392a.getCrashConfig().getReportOOMInfo() && z) {
            com.inmobi.media.AbstractC2292b5 crashType = z2 ? com.inmobi.media.C2266a5.d : com.inmobi.media.Y4.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType, "type");
            com.inmobi.media.La a2 = com.inmobi.media.Z9.a();
            if (a2 != null) {
                java.lang.String key = crashType.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                a2.a(crashType.c, a2.f4815a.getInt(key, 0) + 1, true);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType, "crashType");
            com.inmobi.media.La a3 = com.inmobi.media.Z9.a();
            if (a3 != null) {
                java.lang.String key2 = crashType.f5115a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key2, "key");
                long j4 = a3.f4815a.getLong(key2, 0L);
                java.lang.String str = crashType.b;
                if (j4 == 0) {
                    a3.a(str, j, true);
                } else {
                    a3.a(str, j - j4, true);
                }
            }
            if (z2) {
                com.inmobi.media.C2266a5 crashType2 = com.inmobi.media.C2266a5.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType2, "type");
                com.inmobi.media.La a4 = com.inmobi.media.Z9.a();
                if (a4 != null) {
                    java.lang.String key3 = crashType2.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key3, "key");
                    i = a4.f4815a.getInt(key3, 0);
                } else {
                    i = 0;
                }
                com.inmobi.media.Y4 crashType3 = com.inmobi.media.Y4.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType3, "type");
                com.inmobi.media.La a5 = com.inmobi.media.Z9.a();
                if (a5 != null) {
                    java.lang.String key4 = crashType3.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key4, "key");
                    i2 = a5.f4815a.getInt(key4, 0);
                } else {
                    i2 = 0;
                }
                int i3 = i + i2;
                float f = i3 > 0 ? (i * 100.0f) / i3 : 0.0f;
                payload.put("inmobiOOMCount", i);
                payload.put("appOOMCount", i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType3, "crashType");
                com.inmobi.media.La a6 = com.inmobi.media.Z9.a();
                if (a6 != null) {
                    java.lang.String key5 = crashType3.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key5, "key");
                    j2 = a6.f4815a.getLong(key5, 0L);
                } else {
                    j2 = 0;
                }
                payload.put("appOomCrashInterval", j2);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType2, "crashType");
                com.inmobi.media.La a7 = com.inmobi.media.Z9.a();
                if (a7 != null) {
                    java.lang.String key6 = crashType2.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key6, "key");
                    j3 = a7.f4815a.getLong(key6, 0L);
                } else {
                    j3 = 0;
                }
                payload.put("inmOOMCrashInterval", j3);
                payload.put("oomRatioInMobiToApp", java.lang.Float.valueOf(f));
                com.inmobi.media.B5.f4614a.getClass();
                if (com.inmobi.media.B5.y()) {
                    long j5 = 0;
                    long j6 = 0;
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : android.os.Debug.getRuntimeStats().entrySet()) {
                        java.lang.String key7 = entry.getKey();
                        java.lang.String value = entry.getValue();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(key7, "art.gc.blocking-gc-count")) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                            java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(value);
                            j5 = longOrNull != null ? longOrNull.longValue() : 0L;
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(key7, "art.gc.gc-count")) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                            java.lang.Long longOrNull2 = kotlin.text.StringsKt.toLongOrNull(value);
                            j6 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{j5, j6};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    payload.put("blockingGcCount", jArr[0]);
                    payload.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
