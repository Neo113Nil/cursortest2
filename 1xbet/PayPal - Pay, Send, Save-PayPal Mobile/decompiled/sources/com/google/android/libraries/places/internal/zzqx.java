package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzqx implements com.google.android.libraries.places.internal.zzrv {
    private final java.util.UUID zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private java.lang.Thread zzd;

    zzqx(java.lang.String str, java.util.UUID uuid, java.lang.String str2, com.google.android.libraries.places.internal.zzrt zzrtVar) {
        this.zzc = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
        this.zza = uuid;
        this.zzb = str2;
        com.google.android.libraries.places.internal.zzse zzseVar = zzrtVar.zzc;
        this.zzd = java.lang.Thread.currentThread();
    }

    public static java.lang.String zzf(java.util.UUID uuid) {
        return "tk-trace-id: ".concat(java.lang.String.valueOf(java.lang.Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    public final java.lang.String toString() {
        int i = 0;
        for (com.google.android.libraries.places.internal.zzqx zzqxVar = this; zzqxVar != null; zzqxVar = null) {
            i = zzqxVar.zze().length();
        }
        char[] cArr = new char[i];
        for (com.google.android.libraries.places.internal.zzqx zzqxVar2 = this; zzqxVar2 != null; zzqxVar2 = null) {
            java.lang.String zze = zzqxVar2.zze();
            i -= zze.length();
            zze.getChars(0, zze.length(), cArr, i);
        }
        return new java.lang.String(cArr);
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final com.google.android.libraries.places.internal.zzrv zzb() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.google.common.base.Preconditions.checkNotNull(this);
        com.google.android.libraries.places.internal.zzrt zzd = com.google.android.libraries.places.internal.zzrh.zzd();
        com.google.android.libraries.places.internal.zzrv zzrvVar = zzd.zzb;
        if (zzrvVar == null) {
            java.lang.String zze = zze();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zze).length() + 101);
            sb.append("Tried to end [");
            sb.append(zze);
            sb.append("], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new com.google.android.libraries.places.internal.zzre(sb.toString());
        }
        if (this == zzrvVar) {
            com.google.android.libraries.places.internal.zzrh.zzc(zzd, null);
            this.zzd = null;
            return;
        }
        java.lang.String zze2 = zze();
        java.lang.String zze3 = zzrvVar.zze();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zze2).length() + 79 + java.lang.String.valueOf(zze3).length() + 1);
        sb2.append("Tried to end span ");
        sb2.append(zze2);
        sb2.append(", but that span is not the current span. The current span is ");
        sb2.append(zze3);
        sb2.append(".");
        throw new com.google.android.libraries.places.internal.zzrf(sb2.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final java.lang.String zze() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final java.lang.String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final java.util.UUID zzc() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrv
    public final java.lang.Thread zza() {
        return this.zzd;
    }
}
