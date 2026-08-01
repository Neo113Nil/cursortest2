package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4241yd extends C2 {
    public final Md b;
    public final Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4241yd(final Md nativeBeaconMacroData, Function0 getBeacons) {
        super(new Function0() { // from class: com.inmobi.media.yd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4241yd.a(Md.this));
            }
        });
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.b = nativeBeaconMacroData;
        this.c = getBeacons;
    }

    public static final boolean a(Md md) {
        return Od.a(md.f6716a);
    }

    @Override // com.inmobi.media.C2
    public final void b(Z2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        boolean z = beaconExtras instanceof Tq;
        List plus = CollectionsKt.plus((Collection) this.c.invoke(), (Iterable) (z ? ((Tq) beaconExtras).b : CollectionsKt.emptyList()));
        if (plus.isEmpty()) {
            return;
        }
        Map emptyMap = z ? ((Tq) beaconExtras).f6880a : MapsKt.emptyMap();
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            String url = Od.a((String) it.next(), this.b, emptyMap);
            X3 x3 = X3.f6941a;
            Intrinsics.checkNotNullParameter(url, "url");
            X3.a(url, false, null);
        }
    }
}
