package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgby extends zzifg implements zzigx {
    private zzgby() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzgby(byte[] bArr) {
        super(r1);
        zzgca zzgcaVar;
        zzgcaVar = zzgca.zzb;
    }

    public final zzgby zza(String str) {
        str.getClass();
        zzbg();
        ((zzgca) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzgca) this.zza).zzb());
    }

    public final zzgby zzc(String str, zzgbw zzgbwVar) {
        str.getClass();
        zzgbwVar.getClass();
        zzbg();
        ((zzgca) this.zza).zze().put(str, zzgbwVar);
        return this;
    }
}
