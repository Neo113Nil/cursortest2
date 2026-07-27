package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcjl implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcif zzcifVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjk zzcjkVar = (zzcjk) it.next();
            if (zzcjkVar.zza == zzcifVar) {
                arrayList.add(zzcjkVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcjk) it2.next()).zzb.zzl();
        }
        return true;
    }

    final zzcjk zzb(zzcif zzcifVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjk zzcjkVar = (zzcjk) it.next();
            if (zzcjkVar.zza == zzcifVar) {
                return zzcjkVar;
            }
        }
        return null;
    }

    public final void zzc(zzcjk zzcjkVar) {
        this.zza.add(zzcjkVar);
    }

    public final void zzd(zzcjk zzcjkVar) {
        this.zza.remove(zzcjkVar);
    }
}
