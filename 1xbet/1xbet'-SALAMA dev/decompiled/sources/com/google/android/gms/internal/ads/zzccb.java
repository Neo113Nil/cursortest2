package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzccb implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcca zza(zzcaw zzcawVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcca zzccaVar = (zzcca) it.next();
            if (zzccaVar.zza == zzcawVar) {
                return zzccaVar;
            }
        }
        return null;
    }

    public final void zzb(zzcca zzccaVar) {
        this.zza.add(zzccaVar);
    }

    public final void zzc(zzcca zzccaVar) {
        this.zza.remove(zzccaVar);
    }

    public final boolean zzd(zzcaw zzcawVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcca zzccaVar = (zzcca) it.next();
            if (zzccaVar.zza == zzcawVar) {
                arrayList.add(zzccaVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcca) it2.next()).zzb.zzf();
        }
        return true;
    }
}
