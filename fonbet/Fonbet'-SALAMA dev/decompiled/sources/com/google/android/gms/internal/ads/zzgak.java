package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzgak extends zzgam {
    public zzgak(zzfwc zzfwcVar, boolean z4) {
        super(zzfwcVar, z4);
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfwx.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgal zzgalVar = (zzgal) it.next();
            zza.add(zzgalVar != null ? zzgalVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
