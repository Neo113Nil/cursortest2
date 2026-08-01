package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Nd {

    /* renamed from: a, reason: collision with root package name */
    public final Md f6742a;
    public final Ld b;

    public Nd(C4197wn c4197wn, C3639d0 adLifecycleData, Yj responseBeaconData) {
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        ArrayList arrayList = null;
        this.f6742a = new Md(adLifecycleData, c4197wn != null ? c4197wn.f7465a : null, c4197wn != null ? c4197wn.b : null, 24);
        if (c4197wn != null) {
            ArrayList arrayList2 = c4197wn.d;
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String type = ((C4189wf) next).b;
                Intrinsics.checkNotNullParameter(type, "type");
                if (Intrinsics.areEqual(type, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                    arrayList.add(next);
                }
            }
        }
        this.b = new Ld(this.f6742a, new Pd(responseBeaconData, arrayList));
    }

    public final void a(short s, List trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        String str = "[AdFlow] Firing Click Event Beacons for asset type: " + ((int) s);
        this.b.c.a(new Tq(MapsKt.mapOf(TuplesKt.to("[EVENTTYPE]", String.valueOf((int) s))), trackers));
    }
}
