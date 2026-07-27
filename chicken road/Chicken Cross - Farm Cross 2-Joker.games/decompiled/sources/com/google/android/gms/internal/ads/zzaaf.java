package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzaaf implements Comparator {
    static final /* synthetic */ zzaaf zza = new zzaaf();

    private /* synthetic */ zzaaf() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgwz.zzg().zza((zzabb) Collections.max(list2, zzaba.zza), (zzabb) Collections.max(list, zzaav.zza), zzaaw.zza).zzb(list2.size(), list.size()).zza((zzabb) Collections.max(list2, zzaax.zza), (zzabb) Collections.max(list, zzaay.zza), zzaaz.zza).zze();
    }
}
