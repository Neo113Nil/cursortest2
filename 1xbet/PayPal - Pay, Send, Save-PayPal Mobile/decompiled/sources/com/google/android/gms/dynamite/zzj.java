package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zzj implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i = 1;
        int zza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza;
        int i2 = selectionResult.localVersion;
        if (i2 == 0) {
            i2 = 0;
            if (zza == 0) {
                i = 0;
                selectionResult.selection = i;
                return selectionResult;
            }
        }
        if (i2 >= zza) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }

    zzj() {
    }
}
