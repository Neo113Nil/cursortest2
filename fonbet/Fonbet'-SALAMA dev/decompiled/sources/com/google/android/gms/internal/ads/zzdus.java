package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzdus extends Exception {
    private final int zza;

    public zzdus(int i7) {
        this.zza = i7;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdus(int i7, String str) {
        super(str);
        this.zza = i7;
    }

    public zzdus(int i7, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
