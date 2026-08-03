package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public class zzar {
    private final java.lang.String zza;
    private final java.lang.Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    protected zzar(java.lang.String str, java.lang.Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzar zzc(java.lang.String str, java.lang.Class cls) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzar(str, cls, false, false);
    }

    public final java.lang.String toString() {
        java.lang.String name = getClass().getName();
        java.lang.String str = this.zza;
        java.lang.String name2 = this.zzb.getName();
        int length = java.lang.String.valueOf(name).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 3 + str.length() + java.lang.String.valueOf(name2).length());
        sb.append(name);
        sb.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(str);
        sb.append(com.ironsource.X3.j.d);
        sb.append(name2);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    protected void zza(java.util.Iterator it, com.google.android.gms.internal.play_games_inputmapping.zzaq zzaqVar) {
        while (it.hasNext()) {
            zzb(it.next(), zzaqVar);
        }
    }

    protected void zzb(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzaq zzaqVar) {
        zzaqVar.zza(this.zza, obj);
    }

    public final java.lang.String zzd() {
        return this.zza;
    }

    public final java.lang.Object zze(java.lang.Object obj) {
        return this.zzb.cast(obj);
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final void zzg(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzaq zzaqVar) {
        if (!this.zzd || com.google.android.gms.internal.play_games_inputmapping.zzcb.zza() <= 20) {
            zzb(obj, zzaqVar);
        } else {
            zzaqVar.zza(this.zza, obj);
        }
    }

    public final void zzh(java.util.Iterator it, com.google.android.gms.internal.play_games_inputmapping.zzaq zzaqVar) {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("non repeating key");
        }
        if (!this.zzd || com.google.android.gms.internal.play_games_inputmapping.zzcb.zza() <= 20) {
            zza(it, zzaqVar);
        } else {
            while (it.hasNext()) {
                zzaqVar.zza(this.zza, it.next());
            }
        }
    }

    public final long zzi() {
        return this.zze;
    }

    private zzar(java.lang.String str, java.lang.Class cls, boolean z, boolean z2) {
        com.google.android.gms.internal.play_games_inputmapping.zzds.zzc(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        this.zzd = z2;
        int identityHashCode = java.lang.System.identityHashCode(this);
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.zze = j;
    }
}
