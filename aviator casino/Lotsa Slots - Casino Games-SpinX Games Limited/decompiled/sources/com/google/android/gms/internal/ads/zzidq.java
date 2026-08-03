package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidq extends com.google.android.gms.internal.ads.zzidp {
    zzidq() {
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    final void zza(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zziea) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    final void zzb(com.google.android.gms.internal.ads.zzihi zzihiVar, java.util.Map.Entry entry) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzieb zziebVar = (com.google.android.gms.internal.ads.zzieb) entry.getKey();
        if (!zziebVar.zzc) {
            com.google.android.gms.internal.ads.zzihg zzihgVar = com.google.android.gms.internal.ads.zzihg.DOUBLE;
            switch (zziebVar.zzb) {
                case DOUBLE:
                    zzihiVar.zzf(zziebVar.zza, ((java.lang.Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzihiVar.zze(zziebVar.zza, ((java.lang.Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzihiVar.zzc(zziebVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzihiVar.zzh(zziebVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzihiVar.zzi(zziebVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzihiVar.zzj(zziebVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzihiVar.zzk(zziebVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzihiVar.zzl(zziebVar.zza, ((java.lang.Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzihiVar.zzm(zziebVar.zza, (java.lang.String) entry.getValue());
                    break;
                case GROUP:
                    zzihiVar.zzs(zziebVar.zza, entry.getValue(), com.google.android.gms.internal.ads.zzifz.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzihiVar.zzr(zziebVar.zza, entry.getValue(), com.google.android.gms.internal.ads.zzifz.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzihiVar.zzn(zziebVar.zza, (com.google.android.gms.internal.ads.zzida) entry.getValue());
                    break;
                case UINT32:
                    zzihiVar.zzo(zziebVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzihiVar.zzi(zziebVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzihiVar.zzb(zziebVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzihiVar.zzd(zziebVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzihiVar.zzp(zziebVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzihiVar.zzq(zziebVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
            }
        }
        com.google.android.gms.internal.ads.zzihg zzihgVar2 = com.google.android.gms.internal.ads.zzihg.DOUBLE;
        switch (zziebVar.zzb) {
            case DOUBLE:
                com.google.android.gms.internal.ads.zzigi.zza(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case FLOAT:
                com.google.android.gms.internal.ads.zzigi.zzb(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case INT64:
                com.google.android.gms.internal.ads.zzigi.zzc(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case UINT64:
                com.google.android.gms.internal.ads.zzigi.zzd(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case INT32:
                com.google.android.gms.internal.ads.zzigi.zzh(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case FIXED64:
                com.google.android.gms.internal.ads.zzigi.zzf(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case FIXED32:
                com.google.android.gms.internal.ads.zzigi.zzk(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case BOOL:
                com.google.android.gms.internal.ads.zzigi.zzn(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case STRING:
                com.google.android.gms.internal.ads.zzigi.zzo(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar);
                break;
            case GROUP:
                java.util.List list = (java.util.List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    com.google.android.gms.internal.ads.zzigi.zzr(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, com.google.android.gms.internal.ads.zzifz.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                java.util.List list2 = (java.util.List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    com.google.android.gms.internal.ads.zzigi.zzq(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, com.google.android.gms.internal.ads.zzifz.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                com.google.android.gms.internal.ads.zzigi.zzp(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar);
                break;
            case UINT32:
                com.google.android.gms.internal.ads.zzigi.zzi(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case ENUM:
                com.google.android.gms.internal.ads.zzigi.zzh(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case SFIXED32:
                com.google.android.gms.internal.ads.zzigi.zzl(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case SFIXED64:
                com.google.android.gms.internal.ads.zzigi.zzg(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case SINT32:
                com.google.android.gms.internal.ads.zzigi.zzj(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
            case SINT64:
                com.google.android.gms.internal.ads.zzigi.zze(zziebVar.zza, (java.util.List) entry.getValue(), zzihiVar, zziebVar.zzd);
                break;
        }
    }
}
