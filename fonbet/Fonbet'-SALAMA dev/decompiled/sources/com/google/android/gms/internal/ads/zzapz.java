package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzapz {
    private final int zza;
    private final List zzb;
    private final int zzc;
    private final InputStream zzd;

    public zzapz(int i7, List list, int i8, InputStream inputStream) {
        this.zza = i7;
        this.zzb = list;
        this.zzc = i8;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final InputStream zzc() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzb);
    }
}
