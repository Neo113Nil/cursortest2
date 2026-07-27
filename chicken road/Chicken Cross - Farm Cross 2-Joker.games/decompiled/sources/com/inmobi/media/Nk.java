package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Nk extends C2 {
    public final Md b;
    public final Function0 c;
    public final AtomicBoolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nk(final Md vastBeaconDataModel, Function0 getBeacons) {
        super(new Function0() { // from class: com.inmobi.media.Nk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(Nk.a(Md.this));
            }
        });
        Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.b = vastBeaconDataModel;
        this.c = getBeacons;
        this.d = new AtomicBoolean(false);
    }

    public static final boolean a(Md md) {
        return Od.a(md.f6716a);
    }

    @Override // com.inmobi.media.C2
    public final void b(Z2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (this.d.getAndSet(true)) {
            return;
        }
        boolean z = beaconExtras instanceof Tq;
        Map emptyMap = z ? ((Tq) beaconExtras).f6880a : MapsKt.emptyMap();
        List plus = CollectionsKt.plus((Collection) this.c.invoke(), (Iterable) (z ? ((Tq) beaconExtras).b : CollectionsKt.emptyList()));
        if (plus.isEmpty()) {
            return;
        }
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            String url = Od.a((String) it.next(), this.b, emptyMap);
            X3 x3 = X3.f6941a;
            Intrinsics.checkNotNullParameter(url, "url");
            X3.a(url, false, null);
        }
    }
}
