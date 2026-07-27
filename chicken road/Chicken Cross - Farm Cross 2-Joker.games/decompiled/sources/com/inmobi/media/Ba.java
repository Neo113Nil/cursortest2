package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class Ba {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6473a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ba$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Ba.b();
        }
    });
    public static final Aa b;
    public static final V5 c;
    public static final Kb d;

    static {
        long currentTimeMillis = System.currentTimeMillis();
        b = new Aa();
        d = new Kb(a());
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            c = new V5(context, a(), (C4214xd) AbstractC3914mk.f.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            C4179w5 type = C4179w5.d;
            Intrinsics.checkNotNullParameter(type, "type");
            Db a2 = Ea.a();
            if (a2 != null) {
                a2.a(type.f7493a, currentTimeMillis, true);
            }
            Db a3 = Ea.a();
            if (a3 != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                a3.a("s-cnt", 0, false);
            }
        }
        if (AbstractC3823jg.f7183a.getCrashConfig().getReportOOMInfo()) {
            for (AbstractC4233y5 type2 : CollectionsKt.listOf((Object[]) new AbstractC4233y5[]{C4206x5.d, C4152v5.d})) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Db a4 = Ea.a();
                if (a4 != null) {
                    a4.a(type2.f7493a, currentTimeMillis, true);
                }
            }
        }
    }

    public static CrashConfig a() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        return (CrashConfig) AbstractC4260z4.f7518a.a(CrashConfig.class);
    }

    public static final C4266za b() {
        return new C4266za(T9.b());
    }

    public static void c() {
        Db a2;
        if (a().getCrashConfig().getReportSessionInfo() && (a2 = Ea.a()) != null) {
            Intrinsics.checkNotNullParameter("s-cnt", "key");
            a2.a("s-cnt", a2.f6510a.getInt("s-cnt", 0) + 1, false);
        }
        V5 v5 = c;
        if (v5 != null) {
            Iterator it = v5.c.iterator();
            while (it.hasNext()) {
                ((U5) it.next()).a();
            }
        }
        Kb kb = d;
        kb.getClass();
        AbstractC4143un.a(new Hb(kb, null));
        ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{2, 1, 152, TextFieldImplKt.AnimationDuration, 151}, kb.d);
        J4 j4 = AbstractC4260z4.f7518a;
        AbstractC4260z4.a("crashReporting", b);
    }

    public static void a(C3810j3 incident) {
        Intrinsics.checkNotNullParameter(incident, "event");
        Kb kb = d;
        kb.getClass();
        Intrinsics.checkNotNullParameter(incident, "incident");
        if (kb.f6669a.getCatchConfig().getEnabled() && kb.c.b.a()) {
            AbstractC4143un.a(new Gb(kb, incident, null));
        }
    }

    public static void a(JSONObject payload, boolean z, long j) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (a().getCrashConfig().getReportSessionInfo() && z) {
            C4179w5 crashType = C4179w5.d;
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Db a2 = Ea.a();
            long j2 = 0;
            if (a2 != null) {
                String key = crashType.f7493a;
                Intrinsics.checkNotNullParameter(key, "key");
                long j3 = a2.f6510a.getLong(key, 0L);
                String str = crashType.b;
                if (j3 == 0) {
                    a2.a(str, j, true);
                } else {
                    a2.a(str, j - j3, true);
                }
            }
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Db a3 = Ea.a();
            if (a3 != null) {
                String key2 = crashType.b;
                Intrinsics.checkNotNullParameter(key2, "key");
                j2 = a3.f6510a.getLong(key2, 0L);
            }
            payload.put("crashFreeSessionLength", j2);
            Db a4 = Ea.a();
            int i = 0;
            if (a4 != null) {
                Intrinsics.checkNotNullParameter("s-cnt", "key");
                i = a4.f6510a.getInt("s-cnt", 0);
            }
            payload.put("crashFreeSessionCount", i);
        }
    }
}
