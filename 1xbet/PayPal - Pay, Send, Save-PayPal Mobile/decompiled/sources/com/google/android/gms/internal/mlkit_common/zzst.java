package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzst {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("RemoteModelUtils", "");

    public static com.google.android.gms.internal.mlkit_common.zznc zza(com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.sdkinternal.SharedPrefManager sharedPrefManager, com.google.android.gms.internal.mlkit_common.zzsj zzsjVar) {
        com.google.mlkit.common.sdkinternal.ModelType zzb = zzsjVar.zzb();
        java.lang.String modelHash = remoteModel.getModelHash();
        com.google.android.gms.internal.mlkit_common.zzni zzniVar = new com.google.android.gms.internal.mlkit_common.zzni();
        com.google.android.gms.internal.mlkit_common.zznd zzndVar = new com.google.android.gms.internal.mlkit_common.zznd();
        zzndVar.zzc(remoteModel.getModelNameForBackend());
        zzndVar.zzd(com.google.android.gms.internal.mlkit_common.zznf.CLOUD);
        zzndVar.zza(com.google.android.gms.internal.mlkit_common.zzu.zzb(modelHash));
        int ordinal = zzb.ordinal();
        zzndVar.zzb(ordinal != 2 ? ordinal != 4 ? ordinal != 5 ? com.google.android.gms.internal.mlkit_common.zzne.TYPE_UNKNOWN : com.google.android.gms.internal.mlkit_common.zzne.BASE_DIGITAL_INK : com.google.android.gms.internal.mlkit_common.zzne.CUSTOM : com.google.android.gms.internal.mlkit_common.zzne.BASE_TRANSLATE);
        zzniVar.zzb(zzndVar.zzg());
        com.google.android.gms.internal.mlkit_common.zznl zzc = zzniVar.zzc();
        com.google.android.gms.internal.mlkit_common.zzmz zzmzVar = new com.google.android.gms.internal.mlkit_common.zzmz();
        zzmzVar.zzd(zzsjVar.zzc());
        zzmzVar.zzc(zzsjVar.zzd());
        zzmzVar.zzb(java.lang.Long.valueOf(zzsjVar.zza()));
        zzmzVar.zzf(zzc);
        if (zzsjVar.zzg()) {
            long modelDownloadBeginTimeMs = sharedPrefManager.getModelDownloadBeginTimeMs(remoteModel);
            if (modelDownloadBeginTimeMs == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long modelFirstUseTimeMs = sharedPrefManager.getModelFirstUseTimeMs(remoteModel);
                if (modelFirstUseTimeMs == 0) {
                    modelFirstUseTimeMs = android.os.SystemClock.elapsedRealtime();
                    sharedPrefManager.setModelFirstUseTimeMs(remoteModel, modelFirstUseTimeMs);
                }
                zzmzVar.zzg(java.lang.Long.valueOf(modelFirstUseTimeMs - modelDownloadBeginTimeMs));
            }
        }
        if (zzsjVar.zzf()) {
            long modelDownloadBeginTimeMs2 = sharedPrefManager.getModelDownloadBeginTimeMs(remoteModel);
            if (modelDownloadBeginTimeMs2 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzmzVar.zze(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - modelDownloadBeginTimeMs2));
            }
        }
        return zzmzVar.zzi();
    }
}
