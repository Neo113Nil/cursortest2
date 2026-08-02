package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zzf implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        return com.google.android.gms.dynamite.DynamiteModule.zza(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, str);
    }

    zzf() {
    }
}
