package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbja {
    public static com.google.android.libraries.places.internal.zzbit zza(com.google.android.libraries.places.internal.zzbit zzbitVar, java.util.List list) {
        com.google.common.base.Preconditions.checkNotNull(zzbitVar, "channel");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbitVar = new com.google.android.libraries.places.internal.zzbiz(zzbitVar, (com.google.android.libraries.places.internal.zzbiy) it.next(), null);
        }
        return zzbitVar;
    }
}
