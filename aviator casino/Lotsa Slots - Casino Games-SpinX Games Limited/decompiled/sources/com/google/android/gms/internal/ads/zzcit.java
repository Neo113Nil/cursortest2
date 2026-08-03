package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcit implements java.lang.Iterable {
    private final java.util.List zza = new java.util.ArrayList();

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzchn zzchnVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzcis zzcisVar = (com.google.android.gms.internal.ads.zzcis) it.next();
            if (zzcisVar.zza == zzchnVar) {
                arrayList.add(zzcisVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((com.google.android.gms.internal.ads.zzcis) it2.next()).zzb.zzl();
        }
        return true;
    }

    final com.google.android.gms.internal.ads.zzcis zzb(com.google.android.gms.internal.ads.zzchn zzchnVar) {
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzcis zzcisVar = (com.google.android.gms.internal.ads.zzcis) it.next();
            if (zzcisVar.zza == zzchnVar) {
                return zzcisVar;
            }
        }
        return null;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzcis zzcisVar) {
        this.zza.add(zzcisVar);
    }

    public final void zzd(com.google.android.gms.internal.ads.zzcis zzcisVar) {
        this.zza.remove(zzcisVar);
    }
}
