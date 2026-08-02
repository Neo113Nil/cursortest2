package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzenq implements zzheg {
    public static zzenq zza() {
        return zzenp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        Object arrayList = new ArrayList();
        zzbbp zzbbpVar = zzbby.zzlK;
        C0254t c0254t = C0254t.f2723d;
        if (!((String) c0254t.f2726c.zzb(zzbbpVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) c0254t.f2726c.zzb(zzbbpVar)).split(","));
        }
        zzheo.zzb(arrayList);
        return arrayList;
    }
}
