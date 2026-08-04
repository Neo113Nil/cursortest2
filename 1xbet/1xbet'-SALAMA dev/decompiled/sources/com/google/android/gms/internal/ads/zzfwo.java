package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzfwo extends zzfui {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfti zzb;

    public zzfwo(Iterator it, zzfti zzftiVar) {
        this.zza = it;
        this.zzb = zzftiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfui
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfti zzftiVar = this.zzb;
            Object next = it.next();
            if (zzftiVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
