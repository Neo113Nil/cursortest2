package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzpt extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzpt(int i7, int i8, int i9, int i10, zzz zzzVar, boolean z4, Exception exc) {
        String strValueOf = String.valueOf(zzzVar);
        StringBuilder sbG = p150v0.a.g("AudioTrack init failed ", i7, " Config(", i8, ", ");
        sbG.append(i9);
        sbG.append(", ");
        sbG.append(i10);
        sbG.append(") ");
        sbG.append(strValueOf);
        sbG.append(true != z4 ? "" : " (recoverable)");
        super(sbG.toString(), exc);
        this.zza = i7;
        this.zzb = z4;
    }
}
