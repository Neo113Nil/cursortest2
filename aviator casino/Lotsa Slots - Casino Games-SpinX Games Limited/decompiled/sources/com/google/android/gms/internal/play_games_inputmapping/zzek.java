package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzek implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.play_games_inputmapping.zzek zzb = new com.google.android.gms.internal.play_games_inputmapping.zzei(com.google.android.gms.internal.play_games_inputmapping.zzfi.zzd);
    private static final java.util.Comparator zzc;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzej zzd;
    private int zza = 0;

    static {
        int i = com.google.android.gms.internal.play_games_inputmapping.zzea.zza;
        zzd = new com.google.android.gms.internal.play_games_inputmapping.zzej(null);
        zzc = new com.google.android.gms.internal.play_games_inputmapping.zzed();
    }

    zzek() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzek zzj(java.lang.String str) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzei(str.getBytes(com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb));
    }

    static int zzm(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15 + java.lang.String.valueOf(i3).length());
        sb.append("End index: ");
        sb.append(i2);
        sb.append(" >= ");
        sb.append(i3);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc2 = zzc();
            i = zzi(zzc2, 0, zzc2);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_games_inputmapping.zzec(this);
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzc());
        objArr[2] = zzc() <= 50 ? com.google.android.gms.internal.play_games_inputmapping.zzhb.zza(this) : com.google.android.gms.internal.play_games_inputmapping.zzhb.zza(zze(0, 47)).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzc();

    public abstract com.google.android.gms.internal.play_games_inputmapping.zzek zze(int i, int i2);

    abstract void zzf(com.google.android.gms.internal.play_games_inputmapping.zzeb zzebVar) throws java.io.IOException;

    protected abstract java.lang.String zzg(java.nio.charset.Charset charset);

    public abstract boolean zzh();

    protected abstract int zzi(int i, int i2, int i3);

    public final java.lang.String zzk(java.nio.charset.Charset charset) {
        return zzc() == 0 ? "" : zzg(charset);
    }

    protected final int zzl() {
        return this.zza;
    }
}
