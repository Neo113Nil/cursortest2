package com.inmobi.media;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.z3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4258z3 extends C2 {
    public final Md b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4258z3(final Md vastBeaconDataModel) {
        super(new Function0() { // from class: com.inmobi.media.z3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4258z3.a(Md.this));
            }
        });
        Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        this.b = vastBeaconDataModel;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }

    public static final boolean a(Md md) {
        return Od.a(md.f6716a);
    }

    @Override // com.inmobi.media.C2
    public final void b(Z2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        Tq tq = beaconExtras instanceof Tq ? (Tq) beaconExtras : null;
        if (tq == null) {
            return;
        }
        Map map = tq.f6880a;
        List<String> list = tq.b;
        String str = (String) map.get("[EVENTTYPE]");
        if (str == null) {
            return;
        }
        if (Intrinsics.areEqual(str, "1") || StringsKt.contains((CharSequence) str, (CharSequence) "companion", true)) {
            if (!this.d.compareAndSet(false, true)) {
                String str2 = "Companion click trackers for event type: " + str + " have already been fired. Skipping.";
                return;
            }
        } else if (!this.c.compareAndSet(false, true)) {
            String str3 = "Ad click trackers for event type: " + str + " have already been fired. Skipping.";
            return;
        }
        for (String str4 : list) {
            String str5 = "Processing click tracker URL: " + str4 + " for event type: " + str;
            String url = Od.a(str4, this.b, map);
            X3 x3 = X3.f6941a;
            Intrinsics.checkNotNullParameter(url, "url");
            X3.a(url, false, null);
        }
    }
}
