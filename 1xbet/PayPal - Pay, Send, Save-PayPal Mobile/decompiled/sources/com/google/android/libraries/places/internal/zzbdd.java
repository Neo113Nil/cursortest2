package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbdd extends com.google.android.libraries.places.internal.zzbdc {
    @Override // com.google.android.libraries.places.internal.zzbdc
    final com.google.android.libraries.places.internal.zzbdg zza(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzbdn zzbdnVar = (com.google.android.libraries.places.internal.zzbdn) obj;
        com.google.android.libraries.places.internal.zzbdg zzbdgVar = zzbdnVar.zzb;
        if (zzbdgVar.zzb) {
            zzbdnVar.zzb = zzbdgVar.clone();
        }
        return zzbdnVar.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbdc
    final void zzb(java.lang.Object obj) {
        ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzbdc
    final void zzc(com.google.android.libraries.places.internal.zzbgl zzbglVar, java.util.Map.Entry entry) throws java.io.IOException {
        switch (((com.google.android.libraries.places.internal.zzbdo) entry.getKey()).zzb) {
            case DOUBLE:
                zzbglVar.zzf(525004180, ((java.lang.Double) entry.getValue()).doubleValue());
                break;
            case FLOAT:
                zzbglVar.zze(525004180, ((java.lang.Float) entry.getValue()).floatValue());
                break;
            case INT64:
                zzbglVar.zzc(525004180, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case UINT64:
                zzbglVar.zzh(525004180, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case INT32:
                zzbglVar.zzi(525004180, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case FIXED64:
                zzbglVar.zzj(525004180, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case FIXED32:
                zzbglVar.zzk(525004180, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case BOOL:
                zzbglVar.zzl(525004180, ((java.lang.Boolean) entry.getValue()).booleanValue());
                break;
            case STRING:
                zzbglVar.zzm(525004180, (java.lang.String) entry.getValue());
                break;
            case GROUP:
                zzbglVar.zzs(525004180, entry.getValue(), com.google.android.libraries.places.internal.zzbfh.zza().zzb(entry.getValue().getClass()));
                break;
            case MESSAGE:
                zzbglVar.zzr(525004180, entry.getValue(), com.google.android.libraries.places.internal.zzbfh.zza().zzb(entry.getValue().getClass()));
                break;
            case BYTES:
                zzbglVar.zzn(525004180, (com.google.android.libraries.places.internal.zzbcl) entry.getValue());
                break;
            case UINT32:
                zzbglVar.zzo(525004180, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case ENUM:
                zzbglVar.zzi(525004180, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case SFIXED32:
                zzbglVar.zzb(525004180, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case SFIXED64:
                zzbglVar.zzd(525004180, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case SINT32:
                zzbglVar.zzp(525004180, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case SINT64:
                zzbglVar.zzq(525004180, ((java.lang.Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbdc
    final void zzd(com.google.android.libraries.places.internal.zzbfk zzbfkVar, java.lang.Object obj, com.google.android.libraries.places.internal.zzbdb zzbdbVar, com.google.android.libraries.places.internal.zzbdg zzbdgVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbdp zzbdpVar = (com.google.android.libraries.places.internal.zzbdp) obj;
        zzbdgVar.zzf(zzbdpVar.zzb, zzbfkVar.zzo(zzbdpVar.zza.getClass(), zzbdbVar));
    }

    zzbdd() {
    }
}
