package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzez implements com.google.android.libraries.places.internal.zzasm {
    private static final com.google.android.libraries.places.internal.zzbmc zzb = com.google.android.libraries.places.internal.zzbmc.zzc("Cookie", com.google.android.libraries.places.internal.zzbmg.zza);
    private com.google.common.util.concurrent.ListenableFuture zza;
    private final com.google.android.libraries.places.internal.zzex zzc;

    @Override // com.google.android.libraries.places.internal.zzasm
    public final com.google.android.libraries.places.internal.zzats zza(com.google.android.libraries.places.internal.zzask zzaskVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzaskVar, "");
        com.google.common.util.concurrent.ListenableFuture zza = this.zzc.zza();
        this.zza = zza;
        com.google.android.libraries.places.internal.zzats zzb2 = com.google.android.libraries.places.internal.zzats.zzb(zza);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzb2, "");
        return zzb2;
    }

    @Override // com.google.android.libraries.places.internal.zzasm
    public final com.google.android.libraries.places.internal.zzats zzb(com.google.android.libraries.places.internal.zzask zzaskVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzaskVar, "");
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        if (listenableFuture == null) {
            com.google.android.libraries.places.internal.zzats zza = com.google.android.libraries.places.internal.zzats.zza();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza, "");
            return zza;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNull(listenableFuture);
            java.lang.Object done = com.google.common.util.concurrent.Futures.getDone(listenableFuture);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(done, "");
            java.lang.String str = (java.lang.String) done;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "")) {
                com.google.android.libraries.places.internal.zzbmg zzb2 = zzaskVar.zzb();
                com.google.android.libraries.places.internal.zzbmc zzbmcVar = zzb;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 4);
                sb.append("NID=");
                sb.append(str);
                zzb2.zzc(zzbmcVar, sb.toString());
            }
        } catch (java.lang.Exception unused) {
        }
        com.google.android.libraries.places.internal.zzats zza2 = com.google.android.libraries.places.internal.zzats.zza();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza2, "");
        return zza2;
    }

    public zzez(com.google.android.libraries.places.internal.zzex zzexVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzexVar, "");
        this.zzc = zzexVar;
    }
}
