package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzfuz implements Comparator {
    static final /* synthetic */ zzfuz zza = new zzfuz();

    private /* synthetic */ zzfuz() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzfuo zzfuoVar = (zzfuo) obj2;
        zzfuo zzfuoVar2 = (zzfuo) obj;
        int compare = Double.compare(zzfuoVar.zze(), zzfuoVar2.zze());
        return compare == 0 ? Long.compare(zzfuoVar2.zzd(), zzfuoVar.zzd()) : compare;
    }
}
