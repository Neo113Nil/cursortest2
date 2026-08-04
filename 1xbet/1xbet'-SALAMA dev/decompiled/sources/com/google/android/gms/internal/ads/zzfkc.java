package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzfkc {
    private static final zzfkc zza = new zzfkc();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfkc() {
    }

    public static zzfkc zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfjl zzfjlVar) {
        this.zzb.add(zzfjlVar);
    }

    public final void zze(zzfjl zzfjlVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfjlVar);
        this.zzc.remove(zzfjlVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfkk.zzb().zzg();
    }

    public final void zzf(zzfjl zzfjlVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfjlVar);
        if (zZzg) {
            return;
        }
        zzfkk.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
