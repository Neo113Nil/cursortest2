package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzftt implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzftw zzb;

    public zzftt(zzftw zzftwVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzftwVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfsz.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
