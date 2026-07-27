package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzht extends IOException {
    public final int zza;

    public zzht(int i) {
        this.zza = i;
    }

    public zzht(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzht(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzht(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
