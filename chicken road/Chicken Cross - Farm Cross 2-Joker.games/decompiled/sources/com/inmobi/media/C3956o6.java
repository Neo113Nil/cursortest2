package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3956o6 extends C2 {
    public final Md b;
    public final Zn c;
    public final Nk d;
    public final AtomicInteger e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3956o6(final Md nativeBeaconMacroData, Zn nativeBeaconTrackerData, Nk progressReceivedBeacons, Nk progressTriggeredBeacons) {
        super(new Function0() { // from class: com.inmobi.media.o6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C3956o6.a(Md.this));
            }
        });
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(nativeBeaconTrackerData, "nativeBeaconTrackerData");
        Intrinsics.checkNotNullParameter(progressReceivedBeacons, "progressReceivedBeacons");
        Intrinsics.checkNotNullParameter(progressTriggeredBeacons, "progressTriggeredBeacons");
        this.b = nativeBeaconMacroData;
        this.c = nativeBeaconTrackerData;
        this.d = progressTriggeredBeacons;
        this.e = new AtomicInteger(-1);
        if (nativeBeaconTrackerData.c.isEmpty()) {
            return;
        }
        progressReceivedBeacons.a(Uf.f6892a);
    }

    public static final boolean a(Md md) {
        return Od.a(md.f6716a);
    }

    @Override // com.inmobi.media.C2
    public final void b(Z2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        int i = this.b.e;
        int i2 = this.e.get();
        if (i <= this.e.getAndSet(i)) {
            return;
        }
        ArrayList arrayList = this.c.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            int i4 = ((C3928n6) next).f7260a;
            if (i3 <= i4 && i4 <= i) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.d.a(Uf.f6892a);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String url = Od.a(((C3928n6) it2.next()).b, this.b, MapsKt.emptyMap());
            X3 x3 = X3.f6941a;
            Intrinsics.checkNotNullParameter(url, "url");
            X3.a(url, false, null);
        }
    }
}
