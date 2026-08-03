package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhhd {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhhf zza;

    @javax.annotation.Nullable
    private java.lang.String zzb;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhhe zzc;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzheu zzd;

    private zzhhd() {
        throw null;
    }

    /* synthetic */ zzhhd(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhhd zza(com.google.android.gms.internal.ads.zzhhf zzhhfVar) {
        this.zza = zzhhfVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhhd zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhhd zzc(com.google.android.gms.internal.ads.zzhhe zzhheVar) {
        this.zzc = zzhheVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhhd zzd(com.google.android.gms.internal.ads.zzheu zzheuVar) {
        this.zzd = zzheuVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhhg zze() throws java.security.GeneralSecurityException {
        if (this.zza == null) {
            this.zza = com.google.android.gms.internal.ads.zzhhf.zzb;
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("kekUri must be set");
        }
        com.google.android.gms.internal.ads.zzhhe zzhheVar = this.zzc;
        if (zzhheVar == null) {
            throw new java.security.GeneralSecurityException("dekParsingStrategy must be set");
        }
        com.google.android.gms.internal.ads.zzheu zzheuVar = this.zzd;
        if (zzheuVar == null) {
            throw new java.security.GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzheuVar.zza()) {
            throw new java.security.GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhheVar.equals(com.google.android.gms.internal.ads.zzhhe.zza) && (zzheuVar instanceof com.google.android.gms.internal.ads.zzhfx)) || ((zzhheVar.equals(com.google.android.gms.internal.ads.zzhhe.zzc) && (zzheuVar instanceof com.google.android.gms.internal.ads.zzhgm)) || ((zzhheVar.equals(com.google.android.gms.internal.ads.zzhhe.zzb) && (zzheuVar instanceof com.google.android.gms.internal.ads.zzhii)) || ((zzhheVar.equals(com.google.android.gms.internal.ads.zzhhe.zzd) && (zzheuVar instanceof com.google.android.gms.internal.ads.zzhfg)) || ((zzhheVar.equals(com.google.android.gms.internal.ads.zzhhe.zze) && (zzheuVar instanceof com.google.android.gms.internal.ads.zzhfo)) || (zzhheVar.equals(com.google.android.gms.internal.ads.zzhhe.zzf) && (zzheuVar instanceof com.google.android.gms.internal.ads.zzhgg))))))) {
            return new com.google.android.gms.internal.ads.zzhhg(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        java.lang.String zzhheVar2 = this.zzc.toString();
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzhheVar2.length() + 67 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("Cannot use parsing strategy ");
        sb.append(zzhheVar2);
        sb.append(" when new keys are picked according to ");
        sb.append(valueOf);
        sb.append(".");
        throw new java.security.GeneralSecurityException(sb.toString());
    }
}
