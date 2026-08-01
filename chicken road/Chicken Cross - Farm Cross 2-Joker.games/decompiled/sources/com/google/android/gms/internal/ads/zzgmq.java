package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgmq implements zzgmf {
    private final zzgab zza;
    private final zzgoa zzb;
    private final zzgpx zzc;
    private final zzgrh zzd;
    private final ExecutorService zze;
    private final AtomicReference zzf = new AtomicReference("2.904631200.-1");

    zzgmq(zzgab zzgabVar, zzgoa zzgoaVar, zzgpx zzgpxVar, zzgrh zzgrhVar, ExecutorService executorService) {
        this.zza = zzgabVar;
        this.zzb = zzgoaVar;
        this.zzc = zzgpxVar;
        this.zzd = zzgrhVar;
        this.zze = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final String zza() {
        return (String) this.zzf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzb() {
        return (zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzg(zzhcq.zzw(this.zzb.zzb()), Throwable.class, zzgmp.zza, zzhdp.zza()), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzgmq.this.zzh((zzggt) obj);
                return new Boolean(true);
            }
        }, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgmq.this.zzi((Boolean) obj);
            }
        }, zzhdp.zza()), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgmj
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzgmq.this.zzj((zzfzr) obj);
                return new Boolean(true);
            }
        }, zzhdp.zza()), zzgmk.zza, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzc(final Context context) {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgml
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgmq.this.zzk(context);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhcy.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgmm
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgmq.this.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhcy.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgmn
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgmq.this.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final void zzf(InputEvent inputEvent) {
        zzfyl zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzgaa e) {
                this.zzd.zzd(15005, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final int zzg() {
        return 3;
    }

    final /* synthetic */ boolean zzh(zzggt zzggtVar) {
        if (this.zzc.zzb(zzggtVar) && zzggtVar != null) {
            return true;
        }
        this.zzd.zzb(15003);
        throw new zzgmg(1);
    }

    final /* synthetic */ ListenableFuture zzi(Boolean bool) {
        return this.zzb.zze();
    }

    final /* synthetic */ boolean zzj(final zzfzr zzfzrVar) {
        if (zzfzrVar == null) {
            throw new zzgmg(3);
        }
        File zzb = zzfzrVar.zzb();
        if (Build.VERSION.SDK_INT >= 34) {
            zzb.setReadOnly();
        }
        this.zzd.zzf(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgmq.this.zzn(zzfzrVar);
            }
        });
        return true;
    }

    final /* synthetic */ String zzk(Context context) {
        zzfyl zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zza = zzb.zza(context, null);
        if (zza != null) {
            return zza;
        }
        this.zzd.zzb(15006);
        return "";
    }

    final /* synthetic */ String zzl(Context context, String str, View view, Activity activity) {
        zzfyl zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zzb2 = zzb.zzb(context, null, view, activity);
        if (zzb2 != null) {
            return zzb2;
        }
        this.zzd.zzb(15007);
        return "";
    }

    final /* synthetic */ String zzm(Context context, String str, View view, Activity activity) {
        zzfyl zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zzc = zzb.zzc(context, null, str, view, null);
        if (zzc != null) {
            return zzc;
        }
        this.zzd.zzb(15008);
        return "";
    }

    final /* synthetic */ void zzn(zzfzr zzfzrVar) {
        if (!this.zza.zza(zzfzrVar)) {
            throw new zzgmg(2);
        }
        AtomicReference atomicReference = this.zzf;
        String zza = zzfzrVar.zza().zza();
        String.valueOf(zza);
        atomicReference.set("2.904631200.".concat(String.valueOf(zza)));
    }
}
