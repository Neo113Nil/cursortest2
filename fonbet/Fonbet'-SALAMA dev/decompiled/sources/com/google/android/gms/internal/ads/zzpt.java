package com.google.android.gms.internal.ads;

import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzpt extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpt(int i7, int i8, int i9, int i10, zzz zzzVar, boolean z4, Exception exc) {
        super(r5.toString(), exc);
        String valueOf = String.valueOf(zzzVar);
        StringBuilder g3 = AbstractC1663a.g("AudioTrack init failed ", i7, " Config(", i8, ", ");
        g3.append(i9);
        g3.append(", ");
        g3.append(i10);
        g3.append(") ");
        g3.append(valueOf);
        g3.append(true != z4 ? "" : " (recoverable)");
        this.zza = i7;
        this.zzb = z4;
    }
}
