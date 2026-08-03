package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzy {
    private final com.google.android.gms.internal.consent_sdk.zzz zza;
    private final com.google.android.gms.internal.consent_sdk.zzcn zzb;
    private final com.google.android.gms.internal.consent_sdk.zzcr zzc;
    private int zzd = 0;
    private com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus zze = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    zzy(com.google.android.gms.internal.consent_sdk.zzz zzzVar, com.google.android.gms.internal.consent_sdk.zzcn zzcnVar, com.google.android.gms.internal.consent_sdk.zzcr zzcrVar) {
        this.zza = zzzVar;
        this.zzb = zzcnVar;
        this.zzc = zzcrVar;
    }

    final com.google.android.gms.internal.consent_sdk.zzab zza() throws com.google.android.gms.internal.consent_sdk.zzg {
        com.google.android.gms.internal.consent_sdk.zzaq zzaqVar;
        com.google.android.gms.internal.consent_sdk.zzaq zzaqVar2;
        java.lang.String str;
        com.google.android.gms.internal.consent_sdk.zze zzeVar;
        com.google.android.gms.internal.consent_sdk.zzao zzaoVar;
        com.google.android.gms.internal.consent_sdk.zzcn zzcnVar = this.zzb;
        int i = zzcnVar.zzg;
        boolean z = i == 8;
        com.google.android.gms.internal.consent_sdk.zzz zzzVar = this.zza;
        zzaqVar = zzzVar.zzc;
        zzaqVar.zzh(z);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.zzd = 3;
                break;
            case 4:
                this.zzd = 2;
                break;
            case 5:
                this.zzd = 1;
                break;
            case 6:
                throw new com.google.android.gms.internal.consent_sdk.zzg(1, "Invalid response from server: ".concat(java.lang.String.valueOf(zzcnVar.zzc)));
            case 7:
                throw new com.google.android.gms.internal.consent_sdk.zzg(3, "Publisher misconfiguration: ".concat(java.lang.String.valueOf(zzcnVar.zzc)));
            default:
                throw new com.google.android.gms.internal.consent_sdk.zzg(1, "Invalid response from server.");
        }
        int i3 = zzcnVar.zzh;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.zze = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i4 != 2) {
                throw new com.google.android.gms.internal.consent_sdk.zzg(1, "Invalid response from server.");
            }
            this.zze = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        java.lang.String str2 = zzcnVar.zza;
        com.google.android.gms.internal.consent_sdk.zzbs zzbsVar = str2 == null ? null : new com.google.android.gms.internal.consent_sdk.zzbs(zzcnVar.zzb, str2);
        this.zzc.zzk(zzcnVar.zzf);
        zzaqVar2 = zzzVar.zzc;
        zzaqVar2.zzj(new java.util.HashSet(zzcnVar.zzd));
        for (com.google.android.gms.internal.consent_sdk.zzcm zzcmVar : zzcnVar.zze) {
            int i5 = zzcmVar.zzb;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                str = null;
            } else if (i6 == 1) {
                str = "write";
            } else {
                if (i6 != 2) {
                    throw new java.lang.RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                zzeVar = zzzVar.zza;
                java.lang.String str3 = zzcmVar.zza;
                zzaoVar = zzzVar.zzb;
                zzeVar.zzb(str, str3, zzaoVar);
            }
        }
        return new com.google.android.gms.internal.consent_sdk.zzab(this.zzd, this.zze, zzbsVar, null);
    }
}
