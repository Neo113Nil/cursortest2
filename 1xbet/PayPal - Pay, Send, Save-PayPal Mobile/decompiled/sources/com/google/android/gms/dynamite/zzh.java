package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zzh implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        int zzb = iVersions.zzb(context, str);
        selectionResult.localVersion = zzb;
        if (zzb != 0) {
            selectionResult.selection = -1;
            return selectionResult;
        }
        int zza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza;
        if (zza != 0) {
            selectionResult.selection = 1;
        }
        return selectionResult;
    }

    zzh() {
    }
}
