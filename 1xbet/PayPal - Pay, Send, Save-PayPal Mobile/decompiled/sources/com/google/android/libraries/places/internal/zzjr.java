package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzjr implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbgs zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzjw zzb;

    zzjr(com.google.android.libraries.places.internal.zzjw zzjwVar, com.google.android.libraries.places.internal.zzbgs zzbgsVar) {
        this.zza = zzbgsVar;
        java.util.Objects.requireNonNull(zzjwVar);
        this.zzb = zzjwVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        com.google.android.libraries.places.internal.zzjw zzjwVar = this.zzb;
        zzjwVar.zzf(false);
        zzjwVar.zza = null;
        zzjwVar.zzb = null;
        zzjwVar.zzc = this.zza;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final /* synthetic */ void onSuccess(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzjw zzjwVar = this.zzb;
        zzjwVar.zzf(false);
        java.lang.String zzc = ((com.google.android.libraries.places.internal.zzbhc) obj).zzc();
        com.google.android.libraries.places.internal.zzbgs zzbgsVar = this.zza;
        try {
            zzjwVar.zza = zzc;
            java.util.List<java.lang.String> splitToList = com.google.common.base.Splitter.on(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR).splitToList(zzc);
            if (splitToList.size() < 2) {
                throw new java.lang.IllegalStateException("Invalid JWT format");
            }
            zzjwVar.zzb = java.lang.Long.valueOf(java.lang.Long.parseLong(new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(splitToList.get(1), 8), java.nio.charset.StandardCharsets.UTF_8)).get("exp").toString()));
            zzjwVar.zzc = zzbgsVar;
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Couldn't decode JWT payload", e);
        }
    }
}
