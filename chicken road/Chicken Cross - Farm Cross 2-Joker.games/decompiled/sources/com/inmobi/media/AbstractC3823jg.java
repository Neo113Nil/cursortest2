package com.inmobi.media;

import android.os.Debug;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3823jg {

    /* renamed from: a, reason: collision with root package name */
    public static final CrashConfig f7183a;

    static {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        f7183a = (CrashConfig) AbstractC4260z4.f7518a.a(CrashConfig.class);
        System.currentTimeMillis();
    }

    public static void a(JSONObject payload, boolean z, boolean z2, long j) {
        int i;
        int i2;
        long j2;
        long j3;
        long[] jArr;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (f7183a.getCrashConfig().getReportOOMInfo() && z) {
            AbstractC4233y5 crashType = z2 ? C4206x5.d : C4152v5.d;
            Intrinsics.checkNotNullParameter(crashType, "type");
            Db a2 = Ea.a();
            if (a2 != null) {
                String key = crashType.c;
                Intrinsics.checkNotNullParameter(key, "key");
                a2.a(crashType.c, a2.f6510a.getInt(key, 0) + 1, true);
            }
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Db a3 = Ea.a();
            if (a3 != null) {
                String key2 = crashType.f7493a;
                Intrinsics.checkNotNullParameter(key2, "key");
                long j4 = a3.f6510a.getLong(key2, 0L);
                String str = crashType.b;
                if (j4 == 0) {
                    a3.a(str, j, true);
                } else {
                    a3.a(str, j - j4, true);
                }
            }
            if (z2) {
                C4206x5 crashType2 = C4206x5.d;
                Intrinsics.checkNotNullParameter(crashType2, "type");
                Db a4 = Ea.a();
                if (a4 != null) {
                    String key3 = crashType2.c;
                    Intrinsics.checkNotNullParameter(key3, "key");
                    i = a4.f6510a.getInt(key3, 0);
                } else {
                    i = 0;
                }
                C4152v5 crashType3 = C4152v5.d;
                Intrinsics.checkNotNullParameter(crashType3, "type");
                Db a5 = Ea.a();
                if (a5 != null) {
                    String key4 = crashType3.c;
                    Intrinsics.checkNotNullParameter(key4, "key");
                    i2 = a5.f6510a.getInt(key4, 0);
                } else {
                    i2 = 0;
                }
                int i3 = i + i2;
                float f = i3 > 0 ? (i * 100.0f) / i3 : 0.0f;
                payload.put("inmobiOOMCount", i);
                payload.put("appOOMCount", i2);
                Intrinsics.checkNotNullParameter(crashType3, "crashType");
                Db a6 = Ea.a();
                if (a6 != null) {
                    String key5 = crashType3.b;
                    Intrinsics.checkNotNullParameter(key5, "key");
                    j2 = a6.f6510a.getLong(key5, 0L);
                } else {
                    j2 = 0;
                }
                payload.put("appOomCrashInterval", j2);
                Intrinsics.checkNotNullParameter(crashType2, "crashType");
                Db a7 = Ea.a();
                if (a7 != null) {
                    String key6 = crashType2.b;
                    Intrinsics.checkNotNullParameter(key6, "key");
                    j3 = a7.f6510a.getLong(key6, 0L);
                } else {
                    j3 = 0;
                }
                payload.put("inmOOMCrashInterval", j3);
                payload.put("oomRatioInMobiToApp", Float.valueOf(f));
                Y5.f6965a.getClass();
                if (Y5.y()) {
                    long j5 = 0;
                    long j6 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key7 = entry.getKey();
                        String value = entry.getValue();
                        if (Intrinsics.areEqual(key7, "art.gc.blocking-gc-count")) {
                            Intrinsics.checkNotNull(value);
                            Long longOrNull = StringsKt.toLongOrNull(value);
                            j5 = longOrNull != null ? longOrNull.longValue() : 0L;
                        } else if (Intrinsics.areEqual(key7, "art.gc.gc-count")) {
                            Intrinsics.checkNotNull(value);
                            Long longOrNull2 = StringsKt.toLongOrNull(value);
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
