package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzdr extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdr(com.google.android.gms.internal.measurement.zzfb zzfbVar, android.content.Context context, android.os.Bundle bundle) {
        super(zzfbVar, true);
        this.zza = context;
        this.zzb = bundle;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x0006, B:5:0x001e, B:6:0x0022, B:8:0x002a, B:12:0x0034, B:14:0x0041, B:17:0x004b, B:22:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x0006, B:5:0x001e, B:6:0x0022, B:8:0x002a, B:12:0x0034, B:14:0x0041, B:17:0x004b, B:22:0x0065), top: B:2:0x0006 }] */
    @Override // com.google.android.gms.internal.measurement.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        boolean z;
        boolean z2;
        try {
            android.content.Context context = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            java.lang.String zza = com.google.android.gms.measurement.internal.zzht.zza(context);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            android.content.res.Resources resources = context.getResources();
            if (android.text.TextUtils.isEmpty(zza)) {
                zza = com.google.android.gms.measurement.internal.zzht.zza(context);
            }
            java.lang.Boolean zzc = com.google.android.gms.measurement.internal.zzht.zzc("google_analytics_force_disable_updates", resources, zza);
            com.google.android.gms.internal.measurement.zzfb zzfbVar = this.zzc;
            if (zzc != null && zzc.booleanValue()) {
                z = false;
                zzfbVar.zzR(zzfbVar.zzc(context, z));
                if (zzfbVar.zzQ() != null) {
                    android.util.Log.w(zzfbVar.zzO(), "Failed to connect to measurement client.");
                    return;
                }
                int localVersion = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID);
                int remoteVersion = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID);
                int max = java.lang.Math.max(localVersion, remoteVersion);
                if (!java.lang.Boolean.TRUE.equals(zzc) && remoteVersion >= localVersion) {
                    z2 = false;
                    ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfbVar.zzQ())).initialize(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), new com.google.android.gms.internal.measurement.zzdd(130000L, max, z2, this.zzb, com.google.android.gms.measurement.internal.zzht.zza(context)), this.zzh);
                    return;
                }
                z2 = true;
                ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfbVar.zzQ())).initialize(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), new com.google.android.gms.internal.measurement.zzdd(130000L, max, z2, this.zzb, com.google.android.gms.measurement.internal.zzht.zza(context)), this.zzh);
                return;
            }
            z = true;
            zzfbVar.zzR(zzfbVar.zzc(context, z));
            if (zzfbVar.zzQ() != null) {
            }
        } catch (java.lang.Exception e) {
            this.zzc.zzN(e, true, false);
        }
    }
}
