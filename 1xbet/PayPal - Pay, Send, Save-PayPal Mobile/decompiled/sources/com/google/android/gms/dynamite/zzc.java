package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zzc implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        int zzb = iVersions.zzb(context, str);
        selectionResult.localVersion = zzb;
        selectionResult.selection = zzb != 0 ? -1 : 0;
        return selectionResult;
    }

    zzc() {
    }
}
