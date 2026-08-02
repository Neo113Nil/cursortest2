package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zzk implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        int zza;
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        int zzb = iVersions.zzb(context, str);
        selectionResult.localVersion = zzb;
        int i = 1;
        int i2 = 0;
        if (zzb != 0) {
            zza = iVersions.zza(context, str, false);
            selectionResult.remoteVersion = zza;
        } else {
            zza = iVersions.zza(context, str, true);
            selectionResult.remoteVersion = zza;
        }
        int i3 = selectionResult.localVersion;
        if (i3 != 0) {
            i2 = i3;
        } else if (zza == 0) {
            i = 0;
            selectionResult.selection = i;
            return selectionResult;
        }
        if (i2 >= zza) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }

    zzk() {
    }
}
