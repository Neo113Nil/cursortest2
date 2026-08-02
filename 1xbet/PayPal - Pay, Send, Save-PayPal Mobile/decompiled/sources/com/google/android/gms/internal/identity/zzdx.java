package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdx implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.internal.identity.zzdy zza;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        this.zza.zzg().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zzdx(com.google.android.gms.internal.identity.zzdy zzdyVar) {
        this.zza = zzdyVar;
    }
}
