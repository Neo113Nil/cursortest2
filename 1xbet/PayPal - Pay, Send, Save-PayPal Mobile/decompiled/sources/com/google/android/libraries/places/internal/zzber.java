package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzber extends java.util.LinkedHashMap {
    private static final com.google.android.libraries.places.internal.zzber zzb;
    private boolean zza;

    static {
        com.google.android.libraries.places.internal.zzber zzberVar = new com.google.android.libraries.places.internal.zzber();
        zzb = zzberVar;
        zzberVar.zza = false;
    }

    private zzber() {
        this.zza = true;
    }

    private static int zzf(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof com.google.android.libraries.places.internal.zzbdu) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int zzb2 = com.google.android.libraries.places.internal.zzbeb.zzb(length, bArr, 0, length);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }

    private final void zzg() {
        if (!this.zza) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        java.util.Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            java.lang.Object value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        java.util.Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        zzg();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        zzg();
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.get(it.next());
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final void zzb(com.google.android.libraries.places.internal.zzber zzberVar) {
        zzg();
        if (zzberVar.isEmpty()) {
            return;
        }
        putAll(zzberVar);
    }

    public final com.google.android.libraries.places.internal.zzber zzc() {
        return isEmpty() ? new com.google.android.libraries.places.internal.zzber() : new com.google.android.libraries.places.internal.zzber(this);
    }

    private zzber(java.util.Map map) {
        super(map);
        this.zza = true;
    }

    public final boolean zze() {
        return this.zza;
    }

    public final void zzd() {
        this.zza = false;
    }

    public static com.google.android.libraries.places.internal.zzber zza() {
        return zzb;
    }
}
