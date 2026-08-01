package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class Yn {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f6980a;
    public final Md b;
    public final Xn c;

    public Yn(C4197wn vastBeaconData, C3639d0 adLifecycleData, C4145up responseBeaconData) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        this.f6980a = new AtomicInteger(0);
        this.b = new Md(adLifecycleData, vastBeaconData.f7465a, vastBeaconData.b, 24);
        ArrayList arrayList = vastBeaconData.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C4189wf c4189wf = (C4189wf) next;
            if (!(c4189wf instanceof C3985p6)) {
                String type = c4189wf.b;
                Intrinsics.checkNotNullParameter(type, "type");
                if (!Intrinsics.areEqual(type, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n) && !Intrinsics.areEqual(type, "click")) {
                    arrayList2.add(next);
                }
            }
        }
        ArrayList arrayList3 = vastBeaconData.d;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof C3985p6) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            C3985p6 c3985p6 = (C3985p6) it3.next();
            int i3 = vastBeaconData.c;
            Intrinsics.checkNotNullParameter(c3985p6, "<this>");
            if (StringsKt.endsWith$default(c3985p6.c, "%", false, 2, (Object) null)) {
                try {
                    i = Integer.parseInt(StringsKt.dropLast(c3985p6.c, 1));
                } catch (Exception unused) {
                    i = 0;
                }
                i2 = (i3 * i) / 100;
            } else {
                i2 = Vn.a(c3985p6.c);
            }
            arrayList5.add(new C3928n6(c3985p6.f7460a, i2));
        }
        this.c = new Xn(this.b, new Zn(responseBeaconData, arrayList2, arrayList5));
    }
}
