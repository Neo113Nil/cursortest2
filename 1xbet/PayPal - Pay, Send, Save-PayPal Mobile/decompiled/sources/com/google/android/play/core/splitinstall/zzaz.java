package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzaz extends com.google.android.play.core.splitinstall.zzbb {
    zzaz(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzh(java.util.List list) throws android.os.RemoteException {
        super.zzh(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd((android.os.Bundle) it.next()));
        }
        this.zza.trySetResult(arrayList);
    }
}
