package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zzi implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        int zza = iVersions.zza(context, str, false);
        selectionResult.remoteVersion = zza;
        selectionResult.selection = zza != 0 ? 1 : 0;
        return selectionResult;
    }

    zzi() {
    }
}
