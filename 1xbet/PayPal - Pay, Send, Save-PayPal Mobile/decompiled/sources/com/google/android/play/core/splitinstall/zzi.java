package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzi {
    private final java.util.Map zza = new java.util.HashMap();

    public final com.google.android.play.core.splitinstall.zzi zza(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!this.zza.containsKey(str2)) {
            this.zza.put(str2, new java.util.HashMap());
        }
        ((java.util.Map) this.zza.get(str2)).put(str, str3);
        return this;
    }

    public final com.google.android.play.core.splitinstall.zzk zzb() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            hashMap.put((java.lang.String) entry.getKey(), java.util.Collections.unmodifiableMap(new java.util.HashMap((java.util.Map) entry.getValue())));
        }
        return new com.google.android.play.core.splitinstall.zzk(java.util.Collections.unmodifiableMap(hashMap), null);
    }
}
