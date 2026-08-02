package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes.dex */
public abstract class zzcac extends TextureView implements zzcaz {
    protected final zzcaq zza;
    protected final zzcba zzb;

    public zzcac(Context context) {
        super(context);
        this.zza = new zzcaq();
        this.zzb = new zzcba(context, this);
    }

    public void zzA(int i7) {
    }

    public void zzB(int i7) {
    }

    public void zzC(String str, String[] strArr, Integer num) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i7);

    public abstract void zzr(zzcab zzcabVar);

    public abstract void zzs(String str);

    public abstract void zzt();

    public abstract void zzu(float f7, float f8);

    public Integer zzw() {
        return null;
    }

    public void zzx(int i7) {
    }

    public void zzy(int i7) {
    }

    public void zzz(int i7) {
    }
}
