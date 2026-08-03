package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzec extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzec(com.google.android.gms.internal.measurement.zzfb zzfbVar, boolean z, int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        super(zzfbVar, false);
        this.zza = str;
        this.zzb = obj;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzQ())).logHealthData(5, this.zza, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), com.google.android.gms.dynamic.ObjectWrapper.wrap(null), com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
    }
}
