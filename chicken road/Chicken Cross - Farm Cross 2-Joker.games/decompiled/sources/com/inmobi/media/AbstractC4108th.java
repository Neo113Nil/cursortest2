package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.th, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4108th {

    /* renamed from: a, reason: collision with root package name */
    public static final C3827jk f7396a;

    static {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        f7396a = new C3827jk(1 - ((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        if (Intrinsics.areEqual(eventType, "PingDBMaxLimitReached")) {
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b(eventType, keyValueMap, EnumC3944nm.f7271a);
            return;
        }
        if (f7396a.a()) {
            double d = 1;
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            J4 j42 = AbstractC4260z4.f7518a;
            double pingSamplingFactor = d - ((TelemetryConfig) j42.a(TelemetryConfig.class)).getPingSamplingFactor();
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            keyValueMap.put("samplingRate", Integer.valueOf((int) ((d - ((TelemetryConfig) j42.a(TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * 100)));
            C3829jm c3829jm2 = C3829jm.f7187a;
            C3829jm.b(eventType, keyValueMap, EnumC3944nm.f7271a);
        }
    }
}
