package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzaae implements Comparator {
    static final /* synthetic */ zzaae zza = new zzaae();

    private /* synthetic */ zzaae() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzaas) ((List) obj).get(0)).compareTo((zzaas) ((List) obj2).get(0));
    }
}
