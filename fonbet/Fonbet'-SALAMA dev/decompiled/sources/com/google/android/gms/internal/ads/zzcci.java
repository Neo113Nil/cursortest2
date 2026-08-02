package com.google.android.gms.internal.ads;

import E2.o;
import J2.d;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzcci {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcci(zzcaw zzcawVar) {
        Context context = zzcawVar.getContext();
        this.zza = context;
        this.zzb = o.f1952C.f1957c.x(context, zzcawVar.zzm().f10834a);
        this.zzc = new WeakReference(zzcawVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcci zzcciVar, String str, Map map) {
        zzcaw zzcawVar = (zzcaw) zzcciVar.zzc.get();
        if (zzcawVar != null) {
            zzcawVar.zzd("onPrecacheEvent", map);
        }
    }

    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        d.f3805b.post(new zzcch(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i7) {
        d.f3805b.post(new zzccf(this, str, str2, i7));
    }

    public final void zzj(String str, String str2, long j) {
        d.f3805b.post(new zzccg(this, str, str2, j));
    }

    public final void zzn(String str, String str2, int i7, int i8, long j, long j3, boolean z4, int i9, int i10) {
        d.f3805b.post(new zzcce(this, str, str2, i7, i8, j, j3, z4, i9, i10));
    }

    public final void zzo(String str, String str2, long j, long j3, boolean z4, long j7, long j8, long j9, int i7, int i8) {
        d.f3805b.post(new zzccd(this, str, str2, j, j3, j7, j8, j9, z4, i7, i8));
    }

    public void zzp(int i7) {
    }

    public void zzq(int i7) {
    }

    public void zzr(int i7) {
    }

    public void zzs(int i7) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcca zzccaVar) {
        return zzt(str);
    }
}
