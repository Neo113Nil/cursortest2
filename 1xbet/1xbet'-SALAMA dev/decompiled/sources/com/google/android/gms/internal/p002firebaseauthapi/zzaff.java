package com.google.android.gms.internal.p002firebaseauthapi;

import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
final class zzaff extends zzagt {
    private final String zza;
    private final String zzb;

    public zzaff(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzagt) {
            zzagt zzagtVar = (zzagt) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzagtVar.zzb()) : zzagtVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzagtVar.zza()) : zzagtVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return L.j("RecaptchaEnforcementState{provider=", this.zza, ", enforcementState=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagt
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagt
    public final String zzb() {
        return this.zza;
    }
}
