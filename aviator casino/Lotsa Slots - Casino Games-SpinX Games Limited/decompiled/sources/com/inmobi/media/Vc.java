package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vc {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Uc f5013a;
    public final com.inmobi.media.Tc b;

    public Vc(com.inmobi.media.Bl bl, com.inmobi.media.C2313c0 adLifecycleData, com.inmobi.media.Ji responseBeaconData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        java.util.ArrayList arrayList = null;
        this.f5013a = new com.inmobi.media.Uc(adLifecycleData, bl != null ? bl.f4629a : null, bl != null ? bl.b : null, 24);
        if (bl != null) {
            java.util.ArrayList arrayList2 = bl.d;
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                java.lang.String type = ((com.inmobi.media.De) next).b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                    arrayList.add(next);
                }
            }
        }
        this.b = new com.inmobi.media.Tc(this.f5013a, new com.inmobi.media.Xc(responseBeaconData, arrayList));
    }

    public final void a(short s, java.util.List trackers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.b.c.a(new com.inmobi.media.Wo(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("[EVENTTYPE]", java.lang.String.valueOf((int) s))), trackers));
    }
}
