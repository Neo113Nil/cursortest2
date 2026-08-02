package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import P2.v;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzduu implements zzcxn, zzddb, zzcwe {
    private final Context zza;
    private final zzdqq zzb;

    public zzduu(Context context, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = zzdqqVar;
    }

    public static void zzc(zzduu zzduuVar, Context context) {
        o.f1952C.f1966m.zzd(context, zzduuVar.zzb);
    }

    private final void zzd(final Context context) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeL)).booleanValue()) {
            zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdut
                @Override // java.lang.Runnable
                public final void run() {
                    zzduu.zzc(zzduu.this, context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeN)).booleanValue()) {
            zzd(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zze(v vVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeO)).booleanValue()) {
            zzd(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzf(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeP)).booleanValue()) {
            zzd(this.zza);
        }
    }
}
