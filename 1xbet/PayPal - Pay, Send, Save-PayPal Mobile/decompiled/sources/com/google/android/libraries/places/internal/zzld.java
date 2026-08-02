package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
abstract class zzld extends com.google.android.libraries.places.internal.zzgi {
    private final java.util.Locale zza;
    private final java.lang.String zzb;
    private final com.google.android.libraries.places.internal.zznh zzc;

    protected zzld(com.google.android.libraries.places.internal.zzmq zzmqVar, java.util.Locale locale, java.lang.String str, com.google.android.libraries.places.internal.zznh zznhVar) {
        super(zzmqVar);
        this.zza = locale;
        this.zzb = str;
        this.zzc = zznhVar;
    }

    protected static void zzg(java.util.Map map, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String obj3 = obj != null ? obj.toString() : null;
        if (android.text.TextUtils.isEmpty(obj3)) {
            return;
        }
        map.put(str, obj3);
    }

    @Override // com.google.android.libraries.places.internal.zzgi
    protected final java.util.Map zzc() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(this.zzc.zza());
        hashMap.put("X-Places-Android-Sdk", "5.1.1");
        return hashMap;
    }

    @Override // com.google.android.libraries.places.internal.zzgi
    protected final java.lang.String zzd() {
        com.google.android.libraries.places.internal.zzlp zzlpVar = new com.google.android.libraries.places.internal.zzlp(zzf(), this.zzb);
        zzlpVar.zza(this.zza);
        zzlpVar.zzb(zze());
        return zzlpVar.zzc();
    }

    protected abstract java.util.Map zze();

    protected abstract java.lang.String zzf();
}
