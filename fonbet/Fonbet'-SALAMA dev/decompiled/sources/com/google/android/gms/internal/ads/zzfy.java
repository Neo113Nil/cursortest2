package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzfy extends IOException {
    public final int zza;

    public zzfy(int i7) {
        this.zza = i7;
    }

    public zzfy(String str, int i7) {
        super(str);
        this.zza = i7;
    }

    public zzfy(String str, Throwable th, int i7) {
        super(str, th);
        this.zza = i7;
    }

    public zzfy(Throwable th, int i7) {
        super(th);
        this.zza = i7;
    }
}
