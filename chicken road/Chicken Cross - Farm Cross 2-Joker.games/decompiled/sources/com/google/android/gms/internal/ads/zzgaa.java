package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgaa extends Exception {
    private final int zza;

    public zzgaa(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzgaa(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
