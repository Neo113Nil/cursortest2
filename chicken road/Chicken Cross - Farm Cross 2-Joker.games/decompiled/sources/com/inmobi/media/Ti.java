package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ti {

    /* renamed from: a, reason: collision with root package name */
    public final B4 f6874a;
    public final Lazy b;

    public Ti(B4 configDao) {
        Intrinsics.checkNotNullParameter(configDao, "configDao");
        this.f6874a = configDao;
        this.b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ti$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ti.a();
            }
        });
    }

    public static final Zi a() {
        return new Zi((C3733ga) If.b.getValue());
    }

    public static final ArrayList a(Ti ti) {
        N4 n4;
        N4 n42;
        N4 n43;
        N4 n44;
        N4 n45;
        ArrayList arrayList = new ArrayList();
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        J4 j42 = AbstractC4260z4.f7518a;
        RootConfig rootConfig = (RootConfig) j42.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig2 = (RootConfig) j42.a(RootConfig.class);
            if (Intrinsics.areEqual(RootConfig.class, RootConfig.class)) {
                n45 = new N4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
                Config a2 = j42.a(RootConfig.class);
                n45 = new N4(rootConfig2.getUrlForType(a2.getType()), a2);
            }
            arrayList.add(n45);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig3 = (RootConfig) j42.a(RootConfig.class);
            if (Intrinsics.areEqual(AdConfig.class, RootConfig.class)) {
                n44 = new N4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                Config a3 = j42.a(AdConfig.class);
                n44 = new N4(rootConfig3.getUrlForType(a3.getType()), a3);
            }
            arrayList.add(n44);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig4 = (RootConfig) j42.a(RootConfig.class);
            if (Intrinsics.areEqual(TelemetryConfig.class, RootConfig.class)) {
                n43 = new N4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                Config a4 = j42.a(TelemetryConfig.class);
                n43 = new N4(rootConfig4.getUrlForType(a4.getType()), a4);
            }
            arrayList.add(n43);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig5 = (RootConfig) j42.a(RootConfig.class);
            if (Intrinsics.areEqual(SignalsConfig.class, RootConfig.class)) {
                n42 = new N4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                Config a5 = j42.a(SignalsConfig.class);
                n42 = new N4(rootConfig5.getUrlForType(a5.getType()), a5);
            }
            arrayList.add(n42);
        }
        if (a(rootConfig, CrashConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig6 = (RootConfig) j42.a(RootConfig.class);
            if (Intrinsics.areEqual(CrashConfig.class, RootConfig.class)) {
                n4 = new N4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                Config a6 = j42.a(CrashConfig.class);
                n4 = new N4(rootConfig6.getUrlForType(a6.getType()), a6);
            }
            arrayList.add(n4);
        }
        return arrayList;
    }

    public static boolean a(RootConfig rootConfig, Class clazz) {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Config a2 = AbstractC4260z4.f7518a.a(clazz);
        return a2 == null || System.currentTimeMillis() - a2.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(U4.a(clazz));
    }
}
