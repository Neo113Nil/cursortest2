package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgbp extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object zza;
    long zzb;
    /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgce zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbp(com.google.android.gms.internal.ads.zzgce zzgceVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.zzd = zzgceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object zzu;
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        zzu = this.zzd.zzu(this);
        return zzu;
    }
}
