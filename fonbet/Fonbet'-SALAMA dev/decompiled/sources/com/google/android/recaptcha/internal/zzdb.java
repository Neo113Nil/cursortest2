package com.google.android.recaptcha.internal;

import t6.h;

/* loaded from: classes.dex */
public final class zzdb {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzdb(String str, long j, int i7) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        return h.a(zzdbVar.zza, this.zza) && zzdbVar.zzb == this.zzb && zzdbVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
