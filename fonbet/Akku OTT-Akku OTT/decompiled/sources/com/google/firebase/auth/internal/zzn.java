package com.google.firebase.auth.internal;

import androidx.annotation.Nullable;
import androidx.concurrent.futures.a;
import androidx.datastore.preferences.protobuf.c;

/* loaded from: classes4.dex */
final class zzn extends zzj {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzj) {
            zzj zzjVar = (zzj) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzjVar.zzd()) : zzjVar.zzd() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzjVar.zzb()) : zzjVar.zzb() == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(zzjVar.zzc()) : zzjVar.zzc() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.zzc;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return a.a(c.a("AttestationResult{recaptchaV2Token=", str, ", playIntegrityToken=", str2, ", recaptchaEnterpriseToken="), this.zzc, "}");
    }

    @Override // com.google.firebase.auth.internal.zzj
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.internal.zzj
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.internal.zzj
    @Nullable
    public final String zzd() {
        return this.zza;
    }

    private zzn(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
