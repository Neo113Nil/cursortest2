package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfum implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfun zzc;

    public zzfum(zzfun zzfunVar) {
        this.zzc = zzfunVar;
        this.zza = zzfunVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        zzfth.zzm(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfva zzfvaVar = this.zzc.zzb;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
