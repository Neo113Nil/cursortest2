package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzafh extends zzagx {
    private String zza;
    private String zzb;
    private String zzc;
    private zzaga zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null idToken");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null providerId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zzd(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zza(zzaga zzagaVar) {
        if (zzagaVar != null) {
            this.zzd = zzagaVar;
            return this;
        }
        throw new NullPointerException("Null tokenType");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagy zza() {
        String str;
        zzaga zzagaVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzagaVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzafi(str3, this.zzb, str, zzagaVar, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" providerId");
        }
        if (this.zzc == null) {
            sb.append(" token");
        }
        if (this.zzd == null) {
            sb.append(" tokenType");
        }
        if (this.zze == null) {
            sb.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
