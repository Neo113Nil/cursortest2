package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.C4784g;
import com.moloco.sdk.internal.ortb.model.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f10516a = new Regex("\\$\\{AUCTION_PRICE\\}");

    public static final C4784g a(C4784g c4784g) {
        Intrinsics.checkNotNullParameter(c4784g, "<this>");
        List<E> b = c4784g.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            List<C4782e> b2 = ((E) it.next()).b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b2, 10));
            for (C4782e c4782e : b2) {
                float price = c4782e.getPrice();
                String crid = c4782e.getCrid();
                String a2 = a(c4782e.getAdm(), Float.valueOf(price));
                String str = c4782e.getCom.ironsource.o2.y java.lang.String();
                arrayList2.add(new C4782e(a2, price, str != null ? a(str, Float.valueOf(price)) : null, c4782e.getExt(), crid, c4782e.getBundle(), c4782e.getW(), c4782e.getH()));
            }
            arrayList.add(new E(arrayList2));
        }
        return new C4784g(arrayList);
    }

    public static final String a(String str, Float f) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Regex regex = f10516a;
        if (f == null || (str2 = f.toString()) == null) {
            str2 = "";
        }
        return regex.replace(str, str2);
    }
}
