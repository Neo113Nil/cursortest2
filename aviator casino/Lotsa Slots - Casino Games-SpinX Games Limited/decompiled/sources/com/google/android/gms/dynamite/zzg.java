package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzg implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzg() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        int zza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza;
        if (zza != 0) {
            selectionResult.selection = 1;
        } else {
            int zzb = iVersions.zzb(context, str);
            selectionResult.localVersion = zzb;
            if (zzb != 0) {
                selectionResult.selection = -1;
            }
        }
        return selectionResult;
    }
}
