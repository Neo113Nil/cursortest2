package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzccu {
    public static final java.lang.String[] zza = new java.lang.String[0];
    public static final java.nio.charset.Charset zzb = java.nio.charset.Charset.forName("UTF-8");

    public static java.util.List zza(java.lang.Object[] objArr) {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList((java.lang.Object[]) objArr.clone()));
    }

    public static java.lang.Object[] zzb(java.lang.Class cls, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    java.lang.Object obj2 = objArr2[i];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList.toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, arrayList.size()));
    }
}
