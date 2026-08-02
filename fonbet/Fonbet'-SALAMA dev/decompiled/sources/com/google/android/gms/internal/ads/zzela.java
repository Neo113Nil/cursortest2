package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzela implements zzesh {
    private final Set zza;

    public zzela(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgbc.zzh(new zzeky(arrayList, null));
    }
}
