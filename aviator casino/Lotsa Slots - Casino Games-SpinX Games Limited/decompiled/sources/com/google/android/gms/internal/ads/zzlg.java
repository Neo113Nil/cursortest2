package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzlg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzlh zza;
    private final java.lang.ref.WeakReference zzb;
    private final java.util.function.IntConsumer zzc;

    /* synthetic */ zzlg(com.google.android.gms.internal.ads.zzlh zzlhVar, android.content.Context context, byte[] bArr) {
        java.util.Objects.requireNonNull(zzlhVar);
        this.zza = zzlhVar;
        this.zzb = new java.lang.ref.WeakReference(context);
        java.util.function.IntConsumer intConsumer = new java.util.function.IntConsumer() { // from class: com.google.android.gms.internal.ads.zzle
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                com.google.android.gms.internal.ads.zzlh zzlhVar2 = com.google.android.gms.internal.ads.zzlg.this.zza;
                if (zzlhVar2.zzae()) {
                    return;
                }
                zzlhVar2.zzT(1, 19, java.lang.Integer.valueOf(i));
            }
        };
        this.zzc = intConsumer;
        final com.google.android.gms.internal.ads.zzdz zzd = zzlhVar.zzX().zzd(zzlhVar.zzW(), null);
        java.util.Objects.requireNonNull(zzd);
        context.registerDeviceIdChangeListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzlf
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(java.lang.Runnable runnable) {
                com.google.android.gms.internal.ads.zzdz.this.zzm(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void zza() {
        android.content.Context context = (android.content.Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
