package com.google.android.gms.internal.p002firebaseauthapi;

import e1.k;

/* loaded from: classes.dex */
final class zzafi extends zzagy {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzaga zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzagy) {
            zzagy zzagyVar = (zzagy) obj;
            if (this.zza.equals(zzagyVar.zzd()) && ((str = this.zzb) != null ? str.equals(zzagyVar.zze()) : zzagyVar.zze() == null) && this.zzc.equals(zzagyVar.zzf()) && this.zzd.equals(zzagyVar.zzb()) && this.zze.equals(zzagyVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        String valueOf = String.valueOf(this.zzd);
        String str4 = this.zze;
        StringBuilder l7 = k.l("RevokeTokenRequest{providerId=", str, ", tenantId=", str2, ", token=");
        l7.append(str3);
        l7.append(", tokenType=");
        l7.append(valueOf);
        l7.append(", idToken=");
        return k.i(l7, str4, "}");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagy
    public final zzaga zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagy
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagy
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagy
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagy
    public final String zzf() {
        return this.zzc;
    }

    private zzafi(String str, String str2, String str3, zzaga zzagaVar, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzagaVar;
        this.zze = str4;
    }
}
