package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgx implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzgz zza;
    private int zzb = -1;
    private boolean zzc;
    private java.util.Iterator zzd;

    private final java.util.Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzj().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb + 1 >= this.zza.zzi().size()) {
            return !this.zza.zzj().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        return i < this.zza.zzi().size() ? (java.util.Map.Entry) this.zza.zzi().get(this.zzb) : (java.util.Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzh();
        if (this.zzb >= this.zza.zzi().size()) {
            zza().remove();
            return;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzgz zzgzVar = this.zza;
        int i = this.zzb;
        this.zzb = i - 1;
        zzgzVar.zzg(i);
    }
}
