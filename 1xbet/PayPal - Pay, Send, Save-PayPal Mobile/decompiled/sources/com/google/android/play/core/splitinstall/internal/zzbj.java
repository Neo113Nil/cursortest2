package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public class zzbj {
    private final java.lang.Object zza;
    private final java.lang.reflect.Field zzb;
    private final java.lang.Class zzc;

    public final java.lang.Object zzc() {
        try {
            return this.zzc.cast(this.zzb.get(this.zza));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to get value of field %s of type %s on object of type %s", this.zzb.getName(), this.zza.getClass().getName(), this.zzc.getName()), e);
        }
    }

    public final void zze(java.lang.Object obj) {
        try {
            this.zzb.set(this.zza, obj);
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to set value of field %s of type %s on object of type %s", this.zzb.getName(), this.zza.getClass().getName(), this.zzc.getName()), e);
        }
    }

    protected final java.lang.reflect.Field zzd() {
        return this.zzb;
    }

    zzbj(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Class cls) {
        this.zza = obj;
        this.zzb = field;
        this.zzc = cls;
    }
}
