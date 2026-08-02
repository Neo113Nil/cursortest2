package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcea extends com.google.common.util.concurrent.AbstractFuture {
    private final com.google.android.libraries.places.internal.zzbix zza;

    zzcea(com.google.android.libraries.places.internal.zzbix zzbixVar) {
        this.zza = zzbixVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void interruptTask() {
        this.zza.zze("GrpcFuture was cancelled", null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final java.lang.String pendingToString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("clientCall", this.zza).toString();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final boolean set(@javax.annotation.Nullable java.lang.Object obj) {
        return super.set(obj);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final boolean setException(java.lang.Throwable th) {
        return super.setException(th);
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbix zza() {
        return this.zza;
    }
}
