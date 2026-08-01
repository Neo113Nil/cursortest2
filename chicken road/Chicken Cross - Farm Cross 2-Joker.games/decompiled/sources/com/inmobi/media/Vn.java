package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Vn {
    public static final int a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{ServerSentEventKt.COLON, "."}, false, 4, 2, (Object) null);
            int parseInt = Integer.parseInt((String) split$default.get(0));
            int parseInt2 = Integer.parseInt((String) split$default.get(1));
            return (((parseInt2 * 60) + (parseInt * 3600) + Integer.parseInt((String) split$default.get(2))) * 1000) + (split$default.size() == 4 ? Integer.parseInt((String) split$default.get(3)) : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final List a(String trackerType, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(trackerType, "trackerType");
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((C4189wf) obj).b, trackerType)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C4189wf) it.next()).f7460a);
        }
        return arrayList3;
    }
}
