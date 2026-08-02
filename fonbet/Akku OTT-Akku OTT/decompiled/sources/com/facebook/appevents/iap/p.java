package com.facebook.appevents.iap;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.A;
import com.facebook.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class p {
    public static final List<String> a = CollectionsKt.listOf("fb_currency");
    public static final List<String> b = CollectionsKt.listOf("_valueToSum");
    public static final long c = TimeUnit.MINUTES.toMillis(1);
    public static final List<Pair<String, List<String>>> d = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("fb_iap_product_id", CollectionsKt.listOf("fb_iap_product_id")), TuplesKt.to("fb_iap_product_description", CollectionsKt.listOf("fb_iap_product_description")), TuplesKt.to("fb_iap_product_title", CollectionsKt.listOf("fb_iap_product_title")), TuplesKt.to("fb_iap_purchase_token", CollectionsKt.listOf("fb_iap_purchase_token"))});

    public static Pair a(Bundle bundle, Bundle bundle2, A a2) {
        if (bundle == null) {
            return new Pair(bundle2, a2);
        }
        try {
            for (String key : bundle.keySet()) {
                String string = bundle.getString(key);
                if (string != null) {
                    A.a aVar = A.Companion;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    aVar.getClass();
                    Pair b2 = A.a.b(key, string, bundle2, a2);
                    Bundle bundle3 = (Bundle) b2.component1();
                    a2 = (A) b2.component2();
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(bundle2, a2);
    }

    public static List b(boolean z) {
        com.facebook.internal.n b2 = com.facebook.internal.p.b(w.b());
        if ((b2 != null ? b2.x : null) != null) {
            List<Pair<String, List<String>>> list = b2.x;
            if (!list.isEmpty()) {
                if (!z) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Pair<String, List<String>> pair : list) {
                    Iterator<String> it = pair.getSecond().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
                    }
                }
                return arrayList;
            }
        }
        return d;
    }

    public static List c(boolean z) {
        List<Pair<String, List<String>>> list;
        com.facebook.internal.n b2 = com.facebook.internal.p.b(w.b());
        if (b2 == null || (list = b2.y) == null || list.isEmpty()) {
            return null;
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : list) {
            Iterator<String> it = pair.getSecond().iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }
}
