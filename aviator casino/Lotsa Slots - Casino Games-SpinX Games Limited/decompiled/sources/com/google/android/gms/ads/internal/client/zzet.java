package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzet extends com.google.android.gms.internal.ads.zzbrv {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzeu zza;

    /* synthetic */ zzet(com.google.android.gms.ads.internal.client.zzeu zzeuVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzeuVar);
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zzb(java.util.List list) throws android.os.RemoteException {
        int i;
        java.util.ArrayList arrayList;
        com.google.android.gms.ads.initialization.InitializationStatus zzB;
        com.google.android.gms.ads.internal.client.zzeu zzeuVar = this.zza;
        synchronized (zzeuVar.zzw()) {
            zzeuVar.zzy(false);
            zzeuVar.zzz(true);
            arrayList = new java.util.ArrayList(zzeuVar.zzx());
            zzeuVar.zzx().clear();
        }
        zzB = com.google.android.gms.ads.internal.client.zzeu.zzB(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((com.google.android.gms.ads.initialization.OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzB);
        }
    }
}
