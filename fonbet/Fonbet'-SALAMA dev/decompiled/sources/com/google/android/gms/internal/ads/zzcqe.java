package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcqe implements zzefh {
    public final List zza;

    public zzcqe(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgbc.zzr((I3.b) it.next(), new zzcqd(this), zzgbu.zzc());
        }
    }

    public zzcqe(zzcpw zzcpwVar) {
        this.zza = Collections.singletonList(zzgbc.zzh(zzcpwVar));
    }
}
