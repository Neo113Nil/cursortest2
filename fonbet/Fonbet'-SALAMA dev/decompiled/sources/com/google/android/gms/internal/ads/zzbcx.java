package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import p.AbstractC1520g;
import p.AbstractServiceConnectionC1527n;
import p.C1530q;

/* loaded from: classes.dex */
public final class zzbcx extends AbstractServiceConnectionC1527n {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdqq zzd;
    private C1530q zze;
    private AbstractC1520g zzf;

    public static /* synthetic */ void zzb(zzbcx zzbcxVar, int i7) {
        zzdqq zzdqqVar = zzbcxVar.zzd;
        if (zzdqqVar != null) {
            zzdqp zza2 = zzdqqVar.zza();
            zza2.zzb("action", "cct_nav");
            zza2.zzb("cct_navs", String.valueOf(i7));
            zza2.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Context context) {
        String b7;
        if (this.zzf != null || context == null || (b7 = AbstractC1520g.b(context, null, false)) == null) {
            return;
        }
        AbstractC1520g.a(context, b7, this);
    }

    @Override // p.AbstractServiceConnectionC1527n
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC1520g abstractC1520g) {
        this.zzf = abstractC1520g;
        abstractC1520g.getClass();
        try {
            ((c.b) abstractC1520g.f15641a).B0();
        } catch (RemoteException unused) {
        }
        this.zze = abstractC1520g.c(new zzbcw(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final C1530q zza() {
        if (this.zze == null) {
            zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcv
                @Override // java.lang.Runnable
                public final void run() {
                    r0.zzf(zzbcx.this.zzc);
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
                zzbcx.zzb(zzbcx.this, i7);
            }
        });
    }
}
