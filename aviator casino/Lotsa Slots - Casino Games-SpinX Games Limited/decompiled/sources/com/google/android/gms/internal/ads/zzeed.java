package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzeed extends java.lang.Exception {
    private final int zza;

    public zzeed(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzeed(int i, java.lang.String str) {
        super(str);
        this.zza = i;
    }

    public zzeed(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
