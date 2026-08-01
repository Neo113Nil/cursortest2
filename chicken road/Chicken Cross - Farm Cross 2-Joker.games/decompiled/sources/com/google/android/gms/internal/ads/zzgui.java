package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzgui implements Serializable {
    zzgui() {
    }

    public static zzgui zzc() {
        return zzgtq.zza;
    }

    public static zzgui zzd(Object obj) {
        return obj == null ? zzgtq.zza : new zzgup(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgui zzb(zzgub zzgubVar);
}
