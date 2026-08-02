package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdu implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.internal.identity.zzdv zza;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        this.zza.zzh().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zzdu(com.google.android.gms.internal.identity.zzdv zzdvVar) {
        this.zza = zzdvVar;
    }
}
