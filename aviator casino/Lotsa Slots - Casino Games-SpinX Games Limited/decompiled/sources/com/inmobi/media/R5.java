package com.inmobi.media;

/* loaded from: classes5.dex */
public final class R5 extends com.inmobi.media.AbstractC2422g2 {
    public final com.inmobi.media.Uc b;
    public final com.inmobi.media.C2389em c;
    public final com.inmobi.media.C2756sj d;
    public final java.util.concurrent.atomic.AtomicInteger e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5(final com.inmobi.media.Uc nativeBeaconMacroData, com.inmobi.media.C2389em nativeBeaconTrackerData, com.inmobi.media.C2756sj progressReceivedBeacons, com.inmobi.media.C2756sj progressTriggeredBeacons) {
        super(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.R5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.inmobi.media.R5.a(com.inmobi.media.Uc.this));
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconTrackerData, "nativeBeaconTrackerData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressReceivedBeacons, "progressReceivedBeacons");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressTriggeredBeacons, "progressTriggeredBeacons");
        this.b = nativeBeaconMacroData;
        this.c = nativeBeaconTrackerData;
        this.d = progressTriggeredBeacons;
        this.e = new java.util.concurrent.atomic.AtomicInteger(-1);
        if (nativeBeaconTrackerData.c.isEmpty()) {
            return;
        }
        progressReceivedBeacons.a(com.inmobi.media.C2302bf.f5123a);
    }

    public static final boolean a(com.inmobi.media.Uc uc) {
        return com.inmobi.media.Wc.a(uc.f4995a);
    }

    @Override // com.inmobi.media.AbstractC2422g2
    public final void b(com.inmobi.media.D2 beaconExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        int i = this.b.e;
        int i2 = this.e.get();
        if (i <= this.e.getAndSet(i)) {
            return;
        }
        java.util.ArrayList arrayList = this.c.c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i3 = i2 + 1;
            int i4 = ((com.inmobi.media.Q5) next).f4910a;
            if (i3 <= i4 && i4 <= i) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.d.a(com.inmobi.media.C2302bf.f5123a);
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            java.lang.String url = com.inmobi.media.Wc.a(((com.inmobi.media.Q5) it2.next()).b, this.b, kotlin.collections.MapsKt.emptyMap());
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.A3.a(url, false, null);
        }
    }
}
