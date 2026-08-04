package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import p109p.g;
import p109p.n;
import p109p.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzbcx extends n {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdqq zzd;
    private q zze;
    private g zzf;

    public static /* synthetic */ void zzb(zzbcx zzbcxVar, int i7) {
        zzdqq zzdqqVar = zzbcxVar.zzd;
        if (zzdqqVar != null) {
            zzdqp zzdqpVarZza = zzdqqVar.zza();
            zzdqpVarZza.zzb("action", "cct_nav");
            zzdqpVarZza.zzb("cct_navs", String.valueOf(i7));
            zzdqpVarZza.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Context context) {
        String strB;
        if (this.zzf != null || context == null || (strB = g.b(context, null, false)) == null) {
            return;
        }
        g.a(context, strB, this);
    }

    @Override // p109p.n
    public final void onCustomTabsServiceConnected(ComponentName componentName, g gVar) {
        this.zzf = gVar;
        gVar.getClass();
        try {
            ((p017c.b) gVar.f15647a).B0();
        } catch (RemoteException unused) {
        }
        this.zze = gVar.c(new zzbcw(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final q zza() {
        if (this.zze == null) {
            zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcv
                @Override // java.lang.Runnable
                public final void run() {
                    zzbcx zzbcxVar = this.zza;
                    zzbcxVar.zzf(zzbcxVar.zzc);
                }
            });
        }
        return this.zze;
    }

    public final void zzd(Context context, zzdqq zzdqqVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdqqVar;
        zzf(context);
    }

    public final void zze(final int i7) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeK)).booleanValue() || this.zzd == null) {
            return;
        }
        zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcu
            @Override // java.lang.Runnable
            public final void run() {
                zzbcx.zzb(this.zza, i7);
            }
        });
    }
}
