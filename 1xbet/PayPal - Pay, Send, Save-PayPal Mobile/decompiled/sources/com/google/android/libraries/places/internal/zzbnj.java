package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbnj implements java.util.Comparator {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnk zza;

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbnk zzbnkVar = this.zza;
        zzbnkVar.zza(obj);
        zzbnkVar.zza(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }

    zzbnj(com.google.android.libraries.places.internal.zzbnk zzbnkVar) {
        this.zza = zzbnkVar;
    }
}
