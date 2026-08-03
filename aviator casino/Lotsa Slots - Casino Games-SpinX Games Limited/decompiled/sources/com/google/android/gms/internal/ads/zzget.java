package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzget {
    protected final java.io.File zza;

    public zzget(java.io.File file) {
        this.zza = file;
    }

    public final java.io.File zza() {
        return this.zza;
    }

    public abstract com.google.common.util.concurrent.ListenableFuture zzb();

    public abstract com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Object obj);
}
