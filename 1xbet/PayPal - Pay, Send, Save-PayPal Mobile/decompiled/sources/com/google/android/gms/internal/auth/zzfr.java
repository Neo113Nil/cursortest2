package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzfr extends java.util.LinkedHashMap {
    private static final com.google.android.gms.internal.auth.zzfr zza;
    private boolean zzb;

    static {
        com.google.android.gms.internal.auth.zzfr zzfrVar = new com.google.android.gms.internal.auth.zzfr();
        zza = zzfrVar;
        zzfrVar.zzb = false;
    }

    private zzfr() {
        this.zzb = true;
    }

    private static int zzf(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof com.google.android.gms.internal.auth.zzex) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = com.google.android.gms.internal.auth.zzfa.zzd;
        int length = bArr.length;
        int zzb = com.google.android.gms.internal.auth.zzfa.zzb(length, bArr, 0, length);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }

    private final void zzg() {
        if (!this.zzb) {
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
        byte[] bArr = com.google.android.gms.internal.auth.zzfa.zzd;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        zzg();
        for (java.lang.Object obj : map.keySet()) {
            byte[] bArr = com.google.android.gms.internal.auth.zzfa.zzd;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final com.google.android.gms.internal.auth.zzfr zzb() {
        return isEmpty() ? new com.google.android.gms.internal.auth.zzfr() : new com.google.android.gms.internal.auth.zzfr(this);
    }

    public final void zzd(com.google.android.gms.internal.auth.zzfr zzfrVar) {
        zzg();
        if (zzfrVar.isEmpty()) {
            return;
        }
        putAll(zzfrVar);
    }

    private zzfr(java.util.Map map) {
        super(map);
        this.zzb = true;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final void zzc() {
        this.zzb = false;
    }

    public static com.google.android.gms.internal.auth.zzfr zza() {
        return zza;
    }
}
