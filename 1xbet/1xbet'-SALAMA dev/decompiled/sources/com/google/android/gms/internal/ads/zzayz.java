package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class zzayz implements Comparator {
    public zzayz(zzazb zzazbVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazf zzazfVar = (zzazf) obj;
        zzazf zzazfVar2 = (zzazf) obj2;
        int i7 = zzazfVar.zzc - zzazfVar2.zzc;
        return i7 != 0 ? i7 : Long.compare(zzazfVar.zza, zzazfVar2.zza);
    }
}
