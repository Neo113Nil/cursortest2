package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzvd {
    private static final com.google.android.libraries.places.internal.zzuz zza = new com.google.android.libraries.places.internal.zzvb();
    private static final com.google.android.libraries.places.internal.zzuy zzb = new com.google.android.libraries.places.internal.zzvc();

    public static com.google.android.libraries.places.internal.zzuw zza(java.util.Set set) {
        com.google.android.libraries.places.internal.zzuw zzuwVar = new com.google.android.libraries.places.internal.zzuw(zza, null);
        zzuwVar.zza(zzb);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            zzuwVar.zzb((com.google.android.libraries.places.internal.zztv) it.next());
        }
        return zzuwVar;
    }
}
