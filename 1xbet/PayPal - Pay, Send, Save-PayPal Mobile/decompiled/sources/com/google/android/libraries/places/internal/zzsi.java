package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzsi extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object zza;
    int zzb;
    java.lang.Object zzc;
    final /* synthetic */ com.google.android.libraries.places.internal.zzsj zzd;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return this.zzd.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsi(com.google.android.libraries.places.internal.zzsj zzsjVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.zzd = zzsjVar;
    }
}
