package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzing implements com.google.android.gms.internal.ads.zzimu {
    private final java.util.List zza;
    private final java.util.List zzb;

    static {
        com.google.android.gms.internal.ads.zzimv.zza(java.util.Collections.emptySet());
    }

    /* synthetic */ zzing(java.util.List list, java.util.List list2, com.google.android.gms.internal.ads.zzine zzineVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static com.google.android.gms.internal.ads.zzinf zza(int i, int i2) {
        return new com.google.android.gms.internal.ads.zzinf(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.util.Set zzb() {
        java.util.List list = this.zza;
        int size = list.size();
        java.util.List list2 = this.zzb;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection collection = (java.util.Collection) ((com.google.android.gms.internal.ads.zzind) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet zzb = com.google.android.gms.internal.ads.zzimr.zzb(size);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            java.lang.Object zzb2 = ((com.google.android.gms.internal.ads.zzind) list.get(i2)).zzb();
            zzb2.getClass();
            zzb.add(zzb2);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (java.lang.Object obj : (java.util.Collection) arrayList.get(i3)) {
                obj.getClass();
                zzb.add(obj);
            }
        }
        return java.util.Collections.unmodifiableSet(zzb);
    }
}
