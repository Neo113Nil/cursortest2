package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Qd {
    public static final List a(Rd rd) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(rd, "<this>");
        C4224xn c4224xn = rd.f6826a;
        if (c4224xn != null) {
            ArrayList arrayList2 = c4224xn.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.areEqual(((C4189wf) next).b, "click")) {
                    arrayList3.add(next);
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C4189wf) it2.next()).f7460a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
