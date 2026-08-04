package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzful extends zzfxa {
    final /* synthetic */ zzfun zza;

    public zzful(zzfun zzfunVar) {
        this.zza = zzfunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfvg.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfum(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfun zzfunVar = this.zza;
        zzfva.zzo(zzfunVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public final Map zza() {
        return this.zza;
    }
}
