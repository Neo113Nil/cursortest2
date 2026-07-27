package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4279zn {

    /* renamed from: a, reason: collision with root package name */
    public final H f7529a;

    public C4279zn(H adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f7529a = adContext;
    }

    public static void a(HashMap macros, List nativeTrackers, Z9 z9) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(nativeTrackers, "nativeTrackers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : nativeTrackers) {
            if (Intrinsics.areEqual(((C4189wf) obj).b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C4189wf) it.next()).f7460a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(macros, "macros");
            String str2 = str;
            for (Map.Entry entry : macros.entrySet()) {
                str2 = StringsKt.replace$default(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            arrayList2.add(str2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String url = (String) it2.next();
            X3 x3 = X3.f6941a;
            Sh priority = Sh.b;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(priority, "priority");
            Vh.a(priority, new O3(url, z9, null));
        }
    }
}
