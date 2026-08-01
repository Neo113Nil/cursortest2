package com.inmobi.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.rj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4054rj implements O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f7356a;

    public C4054rj(Ej ej) {
        this.f7356a = ej;
    }

    public final void a(C3702f7 metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Ej ej = this.f7356a;
        float f = metrics.f7101a;
        C3730g7 c3730g7 = metrics.b;
        Object obj = "null";
        String a2 = c3730g7 != null ? AbstractC3758h7.a(c3730g7) : "null";
        ArrayList arrayList = metrics.c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC3758h7.a((C3730g7) it.next()));
            }
            obj = new JSONArray((Collection) arrayList2);
        }
        ej.h("window.mraidview.broadcastEvent('exposureChange', " + f + ", " + a2 + ", " + obj + ");");
    }
}
