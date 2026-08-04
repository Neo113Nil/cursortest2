package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class zzexo implements zzfsw {
    final /* synthetic */ zzexs zza;

    public zzexo(zzexs zzexsVar) {
        this.zza = zzexsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i7 = J.f3546b;
        j.e("", (zzdxc) obj);
        J.k("Failed to get a cache key, reverting to legacy flow.");
        zzexs zzexsVar = this.zza;
        zzexsVar.zzd = new zzexq(null, zzexsVar.zze(), null);
        return this.zza.zzd;
    }
}
