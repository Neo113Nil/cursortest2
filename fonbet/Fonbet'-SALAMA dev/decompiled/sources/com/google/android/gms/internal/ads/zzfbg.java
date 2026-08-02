package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y2.j;

/* loaded from: classes.dex */
public final class zzfbg {
    public static com.google.android.gms.ads.internal.client.zzr zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfag zzfagVar = (zzfag) it.next();
            if (zzfagVar.zzc) {
                arrayList.add(j.f18161p);
            } else {
                arrayList.add(new j(zzfagVar.zza, zzfagVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzr(context, (j[]) arrayList.toArray(new j[arrayList.size()]));
    }

    public static zzfag zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.f10779z ? new zzfag(-3, 0, true) : new zzfag(zzrVar.f10775e, zzrVar.f10772b, false);
    }
}
