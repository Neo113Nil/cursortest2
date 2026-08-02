package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzhu {
    public static java.lang.String zza(java.util.List list, java.util.List list2) {
        return zzc(list, true, list2);
    }

    public static java.lang.String zzb(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.add("attributions");
        return zzc(arrayList, false, new java.util.ArrayList());
    }

    private static java.lang.String zzc(java.util.List list, boolean z, java.util.List list2) {
        if (list.isEmpty()) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z) {
                str = "places.".concat(java.lang.String.valueOf(str));
            }
            arrayList.add(str);
        }
        if (!list.contains("attributions")) {
            arrayList.add(true == z ? "places.attributions" : "attributions");
        }
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((com.google.android.libraries.places.internal.zzht) it2.next()).toString());
        }
        return com.google.common.base.Joiner.on(",").join(arrayList);
    }
}
