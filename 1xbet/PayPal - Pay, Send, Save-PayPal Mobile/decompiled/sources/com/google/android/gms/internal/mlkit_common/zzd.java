package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzd extends com.google.android.gms.internal.mlkit_common.zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    protected final int zza(android.content.Context context, com.google.android.gms.internal.mlkit_common.zzj zzjVar, boolean z) {
        return (zzjVar.zza.getAuthority().lastIndexOf(64) < 0 || androidx.core.content.PermissionChecker.checkSelfPermission(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }

    zzd() {
    }
}
