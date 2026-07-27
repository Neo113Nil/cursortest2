package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgvf {
    public static zzgvc zza(zzgvc zzgvcVar) {
        return ((zzgvcVar instanceof zzgve) || (zzgvcVar instanceof zzgvd)) ? zzgvcVar : zzgvcVar instanceof Serializable ? new zzgvd(zzgvcVar) : new zzgve(zzgvcVar);
    }
}
