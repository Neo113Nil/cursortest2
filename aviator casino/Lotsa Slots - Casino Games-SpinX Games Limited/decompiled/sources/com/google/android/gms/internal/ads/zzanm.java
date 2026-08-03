package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzanm implements com.google.android.gms.internal.ads.zzagb {
    private final com.google.android.gms.internal.ads.zzagb zzb;
    private final com.google.android.gms.internal.ads.zzanj zzc;
    private final android.util.SparseArray zzd = new android.util.SparseArray();
    private boolean zze;

    public zzanm(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzanj zzanjVar) {
        this.zzb = zzagbVar;
        this.zzc = zzanjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final com.google.android.gms.internal.ads.zzahk zzu(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.zze = true;
        }
        if (i2 != 3) {
            return this.zzb.zzu(i, i2);
        }
        android.util.SparseArray sparseArray = this.zzd;
        com.google.android.gms.internal.ads.zzano zzanoVar = (com.google.android.gms.internal.ads.zzano) sparseArray.get(i);
        if (zzanoVar != null) {
            return zzanoVar;
        }
        com.google.android.gms.internal.ads.zzano zzanoVar2 = new com.google.android.gms.internal.ads.zzano(this.zzb.zzu(i, 3), this.zzc);
        sparseArray.put(i, zzanoVar2);
        return zzanoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.zzd;
            if (i >= sparseArray.size()) {
                return;
            }
            ((com.google.android.gms.internal.ads.zzano) sparseArray.valueAt(i)).zzf(true);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzw(com.google.android.gms.internal.ads.zzahb zzahbVar) {
        this.zzb.zzw(zzahbVar);
    }
}
