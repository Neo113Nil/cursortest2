package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzjc {
    private final android.content.Context zza;

    private final void zzc(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        android.content.Context context = this.zza;
        java.lang.String zza = com.google.android.libraries.places.internal.zzmr.zza(context.getPackageManager(), context.getPackageName());
        if (android.text.TextUtils.isEmpty(zza)) {
            return;
        }
        com.google.android.libraries.places.internal.zzbmb zzbmbVar = com.google.android.libraries.places.internal.zzbmg.zza;
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("X-Android-Package", zzbmbVar), context.getPackageName());
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("X-Places-Android-Sdk", zzbmbVar), "5.1.1");
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("X-Android-Cert", zzbmbVar), zza);
    }

    private static final void zzd(com.google.android.libraries.places.internal.zzbmg zzbmgVar, java.lang.String str) {
        if (str.isEmpty()) {
            return;
        }
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("X-Goog-FieldMask", com.google.android.libraries.places.internal.zzbmg.zza), str);
    }

    public final com.google.android.libraries.places.internal.zzbmg zza(java.lang.String str, java.lang.String str2) {
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("X-Goog-Api-Key", com.google.android.libraries.places.internal.zzbmg.zza), str);
        zzc(zzbmgVar);
        zzd(zzbmgVar, str2);
        return zzbmgVar;
    }

    public final com.google.android.libraries.places.internal.zzbmg zzb(java.lang.String str, java.lang.String str2) {
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
        zzbmgVar.zzc(com.google.android.libraries.places.internal.zzbmc.zzc("Authorization", com.google.android.libraries.places.internal.zzbmg.zza), "Bearer ".concat(java.lang.String.valueOf(str)));
        zzd(zzbmgVar, str2);
        zzc(zzbmgVar);
        return zzbmgVar;
    }

    public zzjc(android.content.Context context) {
        this.zza = context;
    }
}
