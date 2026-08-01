package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhch extends zzhcj {
    zzhch(zzgxi zzgxiVar, boolean z) {
        super(zzgxiVar, z);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhcj
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList zzb = zzgym.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhci zzhciVar = (zzhci) it.next();
            zzb.add(zzhciVar != null ? zzhciVar.zza : null);
        }
        return Collections.unmodifiableList(zzb);
    }
}
