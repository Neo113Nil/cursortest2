package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvj extends com.google.android.libraries.places.internal.zzvk {
    private final java.util.Map zza;

    /* synthetic */ zzvj(com.google.android.libraries.places.internal.zzut zzutVar, com.google.android.libraries.places.internal.zzut zzutVar2, byte[] bArr) {
        super(null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        zzd(linkedHashMap, zzutVar);
        zzd(linkedHashMap, zzutVar2);
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            if (((com.google.android.libraries.places.internal.zztv) entry.getKey()).zzf()) {
                entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
            }
        }
        this.zza = java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    private static void zzd(java.util.Map map, com.google.android.libraries.places.internal.zzut zzutVar) {
        for (int i = 0; i < zzutVar.zza(); i++) {
            com.google.android.libraries.places.internal.zztv zzb = zzutVar.zzb(i);
            java.lang.Object obj = map.get(zzb);
            if (zzb.zzf()) {
                java.util.List list = (java.util.List) obj;
                if (list == null) {
                    list = new java.util.ArrayList();
                    map.put(zzb, list);
                }
                list.add(zzb.zze(zzutVar.zzc(i)));
            } else {
                map.put(zzb, zzb.zze(zzutVar.zzc(i)));
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzvk
    public final void zza(com.google.android.libraries.places.internal.zzva zzvaVar, java.lang.Object obj) {
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            com.google.android.libraries.places.internal.zztv zztvVar = (com.google.android.libraries.places.internal.zztv) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (zztvVar.zzf()) {
                zzvaVar.zzb(zztvVar, ((java.util.List) value).iterator(), obj);
            } else {
                zzvaVar.zza(zztvVar, value, obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzvk
    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.libraries.places.internal.zzvk
    public final java.util.Set zzc() {
        return this.zza.keySet();
    }
}
