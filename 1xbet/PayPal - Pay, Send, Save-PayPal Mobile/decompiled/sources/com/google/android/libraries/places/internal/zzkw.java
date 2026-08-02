package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzkw {
    public static final com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse zza(com.google.android.libraries.places.internal.zzkv zzkvVar) throws com.google.android.gms.common.api.ApiException {
        int zza = com.google.android.libraries.places.internal.zzlu.zza(zzkvVar.status);
        if (com.google.android.libraries.places.api.net.PlacesStatusCodes.isError(zza)) {
            throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(zza, com.google.android.libraries.places.internal.zzlu.zzb(zzkvVar.status, zzkvVar.errorMessage)));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.libraries.places.internal.zzkk[] zzkkVarArr = zzkvVar.predictions;
        if (zzkkVarArr != null) {
            for (com.google.android.libraries.places.internal.zzkk zzkkVar : zzkkVarArr) {
                if (zzkkVar == null || android.text.TextUtils.isEmpty(zzkkVar.zzc())) {
                    throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
                }
                com.google.android.libraries.places.api.model.AutocompletePrediction.Builder builder = com.google.android.libraries.places.api.model.AutocompletePrediction.builder(zzkkVar.zzc());
                builder.setDistanceMeters(zzkkVar.zzb());
                builder.setTypes(com.google.android.libraries.places.internal.zzlq.zze(com.google.android.libraries.places.internal.zzlq.zzc(zzkkVar.zze())));
                builder.setFullText(com.google.common.base.Strings.nullToEmpty(zzkkVar.zza()));
                builder.zzb(zzb(zzkkVar.zzf()));
                com.google.android.libraries.places.internal.zzkk.zza zzd = zzkkVar.zzd();
                if (zzd != null) {
                    builder.setPrimaryText(com.google.common.base.Strings.nullToEmpty(zzd.zza()));
                    builder.zzc(zzb(zzd.zzc()));
                    builder.setSecondaryText(com.google.common.base.Strings.nullToEmpty(zzd.zzb()));
                    builder.zzd(zzb(zzd.zzd()));
                }
                arrayList.add(builder.build());
            }
        }
        return com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse.newInstance(arrayList);
    }

    private static java.util.List zzb(java.util.List list) throws com.google.android.gms.common.api.ApiException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.places.internal.zzkk.zzb zzbVar = (com.google.android.libraries.places.internal.zzkk.zzb) it.next();
            com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result");
            if (zzbVar == null) {
                throw new com.google.android.gms.common.api.ApiException(status);
            }
            java.lang.Integer num = zzbVar.offset;
            java.lang.Integer num2 = zzbVar.length;
            if (num == null || num2 == null) {
                throw new com.google.android.gms.common.api.ApiException(status);
            }
            com.google.android.libraries.places.api.model.zzfr zzc = com.google.android.libraries.places.api.model.zzfs.zzc();
            zzc.zza(num.intValue());
            zzc.zzb(num2.intValue());
            arrayList.add(zzc.zzc());
        }
        return arrayList;
    }

    zzkw() {
    }
}
