package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzdb implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzdc zza;
    private int zzb = 0;

    zzdb(com.google.android.gms.internal.play_games_inputmapping.zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        com.google.android.gms.internal.play_games_inputmapping.zzdc zzdcVar = this.zza;
        return i < zzdcVar.zzc() - zzdcVar.zzb();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object[] objArr;
        int i = this.zzb;
        com.google.android.gms.internal.play_games_inputmapping.zzdc zzdcVar = this.zza;
        if (i >= zzdcVar.zzc() - zzdcVar.zzb()) {
            throw new java.util.NoSuchElementException();
        }
        com.google.android.gms.internal.play_games_inputmapping.zzdc zzdcVar2 = this.zza;
        objArr = zzdcVar2.zzb.zzb;
        java.lang.Object obj = objArr[zzdcVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
