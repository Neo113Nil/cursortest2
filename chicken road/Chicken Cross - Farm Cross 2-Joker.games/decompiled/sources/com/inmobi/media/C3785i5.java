package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3785i5 implements T4 {
    @Override // com.inmobi.media.T4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            C3869l5 c3869l5 = C3869l5.f7216a;
            Intrinsics.checkNotNullExpressionValue("l5", "access$getTAG$p(...)");
            C3869l5 c3869l52 = C3869l5.f7216a;
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            J4 j42 = AbstractC4260z4.f7518a;
            C3869l5.e = AbstractC4234y6.a(((SignalsConfig) j42.a(SignalsConfig.class)).getKA());
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                Intrinsics.checkNotNullExpressionValue("l5", "TAG");
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "c_data_store");
                Context context2 = AbstractC3914mk.f7252a;
                int i = 1;
                if (context2 != null) {
                    Db a3 = Cb.a(context2, "c_data_store");
                    Intrinsics.checkNotNullParameter("akv", "key");
                    i = a3.f6510a.getInt("akv", 1);
                }
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                if (((SignalsConfig) j42.a(SignalsConfig.class)).getVAK() != i) {
                    Intrinsics.checkNotNullExpressionValue("l5", "TAG");
                    Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                    a2.a("akv", ((SignalsConfig) j42.a(SignalsConfig.class)).getVAK(), false);
                    c3869l52.f();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
