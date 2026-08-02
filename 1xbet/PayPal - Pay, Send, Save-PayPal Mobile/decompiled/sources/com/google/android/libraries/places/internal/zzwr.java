package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzwr {
    private final int zza;
    private final com.google.android.libraries.places.internal.zzuk zzb;

    protected zzwr(com.google.android.libraries.places.internal.zzuk zzukVar, int i) {
        if (zzukVar == null) {
            throw new java.lang.IllegalArgumentException("format options cannot be null");
        }
        if (i >= 0) {
            this.zza = i;
            this.zzb = zzukVar;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 15);
            sb.append("invalid index: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    protected abstract void zzb(com.google.android.libraries.places.internal.zzws zzwsVar, java.lang.Object obj);

    public final void zze(com.google.android.libraries.places.internal.zzws zzwsVar, java.lang.Object[] objArr) {
        if (this.zza > 0) {
            zzwsVar.zze();
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj != null) {
            zzb(zzwsVar, obj);
        } else {
            zzwsVar.zzf();
        }
    }

    protected final com.google.android.libraries.places.internal.zzuk zzd() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }
}
