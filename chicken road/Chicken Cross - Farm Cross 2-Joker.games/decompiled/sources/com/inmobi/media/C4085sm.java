package com.inmobi.media;

import android.os.Build;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4085sm {

    /* renamed from: a, reason: collision with root package name */
    public TelemetryConfig f7380a;

    public C4085sm(TelemetryConfig telemetryConfig) {
        Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
        this.f7380a = telemetryConfig;
        ((C4214xd) AbstractC3914mk.f.getValue()).a(new int[]{TextFieldImplKt.AnimationDuration, 152}, new Function1() { // from class: com.inmobi.media.sm$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4085sm.a(C4085sm.this, (C3698f3) obj);
            }
        });
    }

    public static final Unit a(C4085sm c4085sm, C3698f3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.f7098a) {
            case TextFieldImplKt.AnimationDuration /* 150 */:
                Map map = it.c;
                Object obj = map != null ? map.get("data") : null;
                c4085sm.a("CrashEventOccurred", obj instanceof C4124u5 ? (C4124u5) obj : null);
                break;
            case 151:
                Map map2 = it.c;
                Object obj2 = map2 != null ? map2.get("data") : null;
                C3892lq c3892lq = obj2 instanceof C3892lq ? (C3892lq) obj2 : null;
                c4085sm.getClass();
                if (c3892lq != null && AbstractC4143un.a(c3892lq)) {
                    Y5.f6965a.getClass();
                    if (!Y5.t()) {
                        c4085sm.a("MainThreadBlockedEvent", c3892lq);
                        break;
                    }
                }
                break;
            case 152:
                Map map3 = it.c;
                Object obj3 = map3 != null ? map3.get("data") : null;
                c4085sm.a(obj3 instanceof T1 ? (T1) obj3 : null);
                break;
        }
        return Unit.INSTANCE;
    }

    public final void a(T1 t1) {
        if (Build.VERSION.SDK_INT < 30 || t1 == null || t1.g != 6) {
            return;
        }
        a("ANREvent", t1);
    }

    public final void a(String str, Ca ca) {
        if (this.f7380a.getPriorityEventsList().contains(str) && ca != null && AbstractC4143un.a(ca)) {
            C3829jm.b(str, new LinkedHashMap(), EnumC3944nm.f7271a);
        }
    }
}
