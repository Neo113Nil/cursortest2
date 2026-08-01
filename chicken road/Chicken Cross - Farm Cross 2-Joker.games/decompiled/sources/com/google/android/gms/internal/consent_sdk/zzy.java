package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import java.util.HashSet;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes9.dex */
final class zzy {
    private final zzz zza;
    private final zzcn zzb;
    private final zzcr zzc;
    private int zzd = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zze = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    zzy(zzz zzzVar, zzcn zzcnVar, zzcr zzcrVar) {
        this.zza = zzzVar;
        this.zzb = zzcnVar;
        this.zzc = zzcrVar;
    }

    final zzab zza() throws zzg {
        zzaq zzaqVar;
        zzaq zzaqVar2;
        String str;
        zze zzeVar;
        zzao zzaoVar;
        zzcn zzcnVar = this.zzb;
        int i = zzcnVar.zzg;
        boolean z = i == 8;
        zzz zzzVar = this.zza;
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
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzcnVar.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzcnVar.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i3 = zzcnVar.zzh;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.zze = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i4 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zze = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str2 = zzcnVar.zza;
        zzbs zzbsVar = str2 == null ? null : new zzbs(zzcnVar.zzb, str2);
        this.zzc.zzk(zzcnVar.zzf);
        zzaqVar2 = zzzVar.zzc;
        zzaqVar2.zzj(new HashSet(zzcnVar.zzd));
        for (zzcm zzcmVar : zzcnVar.zze) {
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
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                zzeVar = zzzVar.zza;
                String str3 = zzcmVar.zza;
                zzaoVar = zzzVar.zzb;
                zzeVar.zzb(str, str3, zzaoVar);
            }
        }
        return new zzab(this.zzd, this.zze, zzbsVar, null);
    }
}
