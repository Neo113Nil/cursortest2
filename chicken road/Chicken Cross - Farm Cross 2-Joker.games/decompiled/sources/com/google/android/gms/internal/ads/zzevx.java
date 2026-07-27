package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevx implements zzfdi {
    private final Set zza;

    zzevx(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzhcy.zza(new zzevw(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 8;
    }
}
