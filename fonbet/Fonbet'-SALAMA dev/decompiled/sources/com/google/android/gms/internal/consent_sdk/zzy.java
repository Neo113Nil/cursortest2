package com.google.android.gms.internal.consent_sdk;

import B3.f;
import java.util.HashSet;

/* loaded from: classes.dex */
final class zzy {
    private final zzz zza;
    private final zzcl zzb;
    private int zzc = 0;
    private f zzd = f.f1057a;

    public zzy(zzz zzzVar, zzcl zzclVar) {
        this.zza = zzzVar;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzab zza() {
        zzaq zzaqVar;
        zzaq zzaqVar2;
        String str;
        zze zzeVar;
        zzao zzaoVar;
        zzcl zzclVar = this.zzb;
        int i7 = zzclVar.zzf;
        boolean z4 = i7 == 8;
        zzz zzzVar = this.zza;
        zzaqVar = zzzVar.zzc;
        zzaqVar.zzh(z4);
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        switch (i8) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzclVar.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzclVar.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i9 = zzclVar.zzg;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        if (i10 == 1) {
            this.zzd = f.f1059c;
        } else {
            if (i10 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zzd = f.f1058b;
        }
        String str2 = zzclVar.zza;
        zzbq zzbqVar = str2 == null ? null : new zzbq(zzclVar.zzb, str2);
        zzaqVar2 = zzzVar.zzc;
        zzaqVar2.zzj(new HashSet(zzclVar.zzd));
        for (zzck zzckVar : zzclVar.zze) {
            int i11 = zzckVar.zzb;
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 != 0) {
                if (i12 == 1) {
                    str = "write";
                } else if (i12 == 2) {
                    str = "clear";
                }
                if (str == null) {
                    zzeVar = zzzVar.zza;
                    String str3 = zzckVar.zza;
                    zzaoVar = zzzVar.zzb;
                    zzeVar.zzb(str, str3, zzaoVar);
                }
            }
            str = null;
            if (str == null) {
            }
        }
        return new zzab(this.zzc, this.zzd, zzbqVar, null);
    }
}
