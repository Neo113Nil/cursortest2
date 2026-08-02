package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zzo implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    private final int zza;

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context context, java.lang.String str, boolean z) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context context, java.lang.String str) {
        return this.zza;
    }

    public zzo(int i, int i2) {
        this.zza = i;
    }
}
