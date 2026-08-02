package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.qr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1488qr implements InterfaceC1443pr {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f15176a;

    public C1488qr(Q2.X0 x02, String str, int i, String str2, Q2.d1 d1Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(x02.f4958l));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(x02.f4959m));
        } else if (hashSet.contains("npa")) {
            arrayList.add(x02.f4959m.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(x02.f4960n));
        }
        if (hashSet.contains("keywords")) {
            List list = x02.f4961o;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(x02.f4962p));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(x02.f4963q));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(x02.f4964r));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(x02.f4965s);
        }
        if (hashSet.contains("location")) {
            Location location = x02.f4967u;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(x02.f4968v);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(x02.f4969w));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(x02.f4970x));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = x02.f4971y;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(x02.f4972z);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(x02.f4948A);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(x02.f4949B));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(x02.f4951D));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(x02.f4952E);
        }
        if (hashSet.contains("orientation")) {
            if (d1Var != null) {
                arrayList.add(Integer.valueOf(d1Var.f5009k));
            } else {
                arrayList.add(null);
            }
        }
        this.f15176a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1488qr) {
            return Arrays.equals(this.f15176a, ((C1488qr) obj).f15176a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15176a);
    }

    public final String toString() {
        Object[] objArr = this.f15176a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + "]";
    }
}
