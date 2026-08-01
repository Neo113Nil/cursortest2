package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzawd implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzawe zzaweVar = (zzawe) obj;
        zzawe zzaweVar2 = (zzawe) obj2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzaweVar.zza.length;
            if (i >= length || i2 >= zzaweVar2.zza.length) {
                break;
            }
            int compare = Integer.compare(zzawe.zzg(zzaweVar.zzb(i)), zzawe.zzg(zzaweVar2.zzb(i2)));
            if (compare != 0) {
                return compare;
            }
            i++;
            i2++;
        }
        return Integer.compare(length, zzaweVar2.zza.length);
    }
}
