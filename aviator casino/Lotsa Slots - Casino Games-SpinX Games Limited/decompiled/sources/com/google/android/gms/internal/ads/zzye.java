package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzye extends com.google.android.gms.internal.ads.zzagn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzyq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzye(com.google.android.gms.internal.ads.zzyq zzyqVar, com.google.android.gms.internal.ads.zzahb zzahbVar) {
        super(zzahbVar);
        java.util.Objects.requireNonNull(zzyqVar);
        this.zza = zzyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagn, com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza.zzQ();
    }
}
