package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgpz extends android.content.BroadcastReceiver implements com.google.android.gms.internal.ads.zzgpe, com.google.android.gms.internal.ads.zzgfd {
    private final android.content.Context zza;
    private final java.util.concurrent.ExecutorService zzb;
    private boolean zzc = true;

    zzgpz(android.content.Context context, java.util.concurrent.ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    private final synchronized void zzg(boolean z) {
        this.zzc = z;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzg(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgpy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzgpz.this.zzf();
                return null;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(java.util.Map map) {
        map.put("up", java.lang.Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzc(java.util.Map map, android.content.Context context, android.view.View view) {
        map.put("up", java.lang.Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(java.util.Map map) {
        map.put("up", java.lang.Boolean.valueOf(zze()));
    }

    final synchronized boolean zze() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Void zzf() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.zza.registerReceiver(this, intentFilter);
        return null;
    }
}
