package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzbh implements com.google.android.gms.common.api.internal.RemoteCall, com.google.android.gms.internal.identity.zzdr {
    final /* synthetic */ com.google.android.gms.internal.identity.zzbi zza;
    private final com.google.android.gms.internal.identity.zzbg zzb;
    private com.google.android.gms.common.api.internal.ListenerHolder zzc;
    private boolean zzd = true;

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey;
        boolean z;
        com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) obj;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
        synchronized (this) {
            listenerKey = this.zzc.getListenerKey();
            z = this.zzd;
            this.zzc.clear();
        }
        if (listenerKey == null) {
            taskCompletionSource.setResult(false);
        } else {
            this.zzb.zza(zzdzVar, listenerKey, z, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzb(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        synchronized (this) {
            com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2 = this.zzc;
            if (listenerHolder2 != listenerHolder) {
                listenerHolder2.clear();
                this.zzc = listenerHolder;
            }
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey;
        synchronized (this) {
            this.zzd = false;
            listenerKey = this.zzc.getListenerKey();
        }
        if (listenerKey != null) {
            this.zza.doUnregisterEventListener(listenerKey, 2441);
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final com.google.android.gms.common.api.internal.ListenerHolder zza() {
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zzc;
        }
        return listenerHolder;
    }

    zzbh(com.google.android.gms.internal.identity.zzbi zzbiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.internal.identity.zzbg zzbgVar) {
        this.zza = zzbiVar;
        this.zzc = listenerHolder;
        this.zzb = zzbgVar;
    }
}
