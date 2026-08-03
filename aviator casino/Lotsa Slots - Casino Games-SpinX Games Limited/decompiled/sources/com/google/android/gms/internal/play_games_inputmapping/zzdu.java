package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzdu implements java.io.Closeable {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.play_games_inputmapping.zzdt();
    private int zzb = 0;

    public static int zza() {
        return ((com.google.android.gms.internal.play_games_inputmapping.zzdu) zza.get()).zzb;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdu zzc() {
        com.google.android.gms.internal.play_games_inputmapping.zzdu zzduVar = (com.google.android.gms.internal.play_games_inputmapping.zzdu) zza.get();
        int i = zzduVar.zzb + 1;
        zzduVar.zzb = i;
        if (i != 0) {
            return zzduVar;
        }
        throw new java.lang.AssertionError("Overflow of RecursionDepth (possible error in core library)");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i <= 0) {
            throw new java.lang.AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i - 1;
    }

    public final int zzb() {
        return this.zzb;
    }
}
