package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzhe {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzhe zza = new com.google.android.gms.internal.play_games_inputmapping.zzhe(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;

    private zzhe() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzhe(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzhe zza() {
        return zza;
    }

    static com.google.android.gms.internal.play_games_inputmapping.zzhe zzb(com.google.android.gms.internal.play_games_inputmapping.zzhe zzheVar, com.google.android.gms.internal.play_games_inputmapping.zzhe zzheVar2) {
        int i = zzheVar.zzb;
        int i2 = zzheVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zzheVar.zzc, 0);
        int[] iArr = zzheVar2.zzc;
        int i3 = zzheVar.zzb;
        int i4 = zzheVar2.zzb;
        java.lang.System.arraycopy(iArr, 0, copyOf, 0, 0);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzheVar.zzd, 0);
        java.lang.Object[] objArr = zzheVar2.zzd;
        int i5 = zzheVar.zzb;
        int i6 = zzheVar2.zzb;
        java.lang.System.arraycopy(objArr, 0, copyOf2, 0, 0);
        return new com.google.android.gms.internal.play_games_inputmapping.zzhe(0, copyOf, copyOf2, true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzhe)) {
            return false;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhe zzheVar = (com.google.android.gms.internal.play_games_inputmapping.zzhe) obj;
        int[] iArr = zzheVar.zzc;
        java.lang.Object[] objArr = zzheVar.zzd;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zzc() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzd() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    final void zze(java.lang.StringBuilder sb, int i) {
    }
}
