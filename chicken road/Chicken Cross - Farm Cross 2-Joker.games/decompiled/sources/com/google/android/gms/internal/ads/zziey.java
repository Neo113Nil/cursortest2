package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zziey extends zziex {
    zziey() {
    }

    @Override // com.google.android.gms.internal.ads.zziex
    final void zza(zziip zziipVar, Map.Entry entry) throws IOException {
        zzifj zzifjVar = (zzifj) entry.getKey();
        if (!zzifjVar.zzc) {
            zziin zziinVar = zziin.DOUBLE;
            switch (zzifjVar.zzb) {
                case DOUBLE:
                    zziipVar.zzf(zzifjVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zziipVar.zze(zzifjVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zziipVar.zzc(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zziipVar.zzh(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zziipVar.zzi(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zziipVar.zzj(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zziipVar.zzk(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zziipVar.zzl(zzifjVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zziipVar.zzm(zzifjVar.zza, (String) entry.getValue());
                    break;
                case GROUP:
                    zziipVar.zzs(zzifjVar.zza, entry.getValue(), zzihg.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zziipVar.zzr(zzifjVar.zza, entry.getValue(), zzihg.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zziipVar.zzn(zzifjVar.zza, (zziei) entry.getValue());
                    break;
                case UINT32:
                    zziipVar.zzo(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zziipVar.zzi(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zziipVar.zzb(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zziipVar.zzd(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zziipVar.zzp(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zziipVar.zzq(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zziin zziinVar2 = zziin.DOUBLE;
        switch (zzifjVar.zzb) {
            case DOUBLE:
                zzihp.zza(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case FLOAT:
                zzihp.zzb(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case INT64:
                zzihp.zzc(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case UINT64:
                zzihp.zzd(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case INT32:
                zzihp.zzh(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case FIXED64:
                zzihp.zzf(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case FIXED32:
                zzihp.zzk(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case BOOL:
                zzihp.zzn(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case STRING:
                zzihp.zzo(zzifjVar.zza, (List) entry.getValue(), zziipVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzihp.zzr(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzihg.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzihp.zzq(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzihg.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzihp.zzp(zzifjVar.zza, (List) entry.getValue(), zziipVar);
                break;
            case UINT32:
                zzihp.zzi(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case ENUM:
                zzihp.zzh(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case SFIXED32:
                zzihp.zzl(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case SFIXED64:
                zzihp.zzg(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case SINT32:
                zzihp.zzj(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case SINT64:
                zzihp.zze(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
        }
    }
}
