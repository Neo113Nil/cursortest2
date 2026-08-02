package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbik implements com.google.android.libraries.places.internal.zzbie {
    private final java.util.List zza;
    private final java.util.List zzb;

    static {
        com.google.android.libraries.places.internal.zzbif.zza(java.util.Collections.emptySet());
    }

    public static com.google.android.libraries.places.internal.zzbij zza(int i, int i2) {
        return new com.google.android.libraries.places.internal.zzbij(1, 0, null);
    }

    @Override // com.google.android.libraries.places.internal.zzcez
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.util.Set zzb() {
        java.util.List list = this.zza;
        int size = list.size();
        java.util.List list2 = this.zzb;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection collection = (java.util.Collection) ((com.google.android.libraries.places.internal.zzbih) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet hashSet = new java.util.HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            hashSet.add(((com.google.android.libraries.places.internal.zzbih) list.get(i2)).zzb());
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            java.util.Iterator it = ((java.util.Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    /* synthetic */ zzbik(java.util.List list, java.util.List list2, com.google.android.libraries.places.internal.zzbii zzbiiVar) {
        this.zza = list;
        this.zzb = list2;
    }
}
