package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0217a;
import I2.P;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import io.sentry.SentryEvent;
import io.sentry.clientreport.DiscardedEvent;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzdpu implements zzczk, InterfaceC0217a, zzcvk, zzcuu {
    private final Context zza;
    private final zzfbs zzb;
    private final zzdqq zzc;
    private final zzfar zzd;
    private final zzfaf zze;
    private final zzeaf zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgK)).booleanValue();

    public zzdpu(Context context, zzfbs zzfbsVar, zzdqq zzdqqVar, zzfar zzfarVar, zzfaf zzfafVar, zzeaf zzeafVar, String str) {
        this.zza = context;
        this.zzb = zzfbsVar;
        this.zzc = zzdqqVar;
        this.zzd = zzfarVar;
        this.zze = zzfafVar;
        this.zzf = zzeafVar;
        this.zzg = str;
    }

    private final zzdqp zzd(String str) {
        zzfaq zzfaqVar = this.zzd.zzb;
        zzdqp zzdqpVarZza = this.zzc.zza();
        zzdqpVarZza.zzd(zzfaqVar.zzb);
        zzdqpVarZza.zzc(this.zze);
        zzdqpVarZza.zzb("action", str);
        zzdqpVarZza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzt.isEmpty()) {
            zzdqpVarZza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzb()) {
            Context context = this.zza;
            o oVar = o.f1952C;
            zzdqpVarZza.zzb("device_connectivity", true != oVar.f1961g.zzA(context) ? "offline" : "online");
            oVar.j.getClass();
            zzdqpVarZza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zzdqpVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgR)).booleanValue()) {
            boolean z4 = Q0.a.o0(this.zzd.zza.zza) != 1;
            zzdqpVarZza.zzb("scar", String.valueOf(z4));
            if (z4) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzd.zza.zza.zzd;
                zzdqpVarZza.zzb("ragent", zzmVar.f10745G);
                zzdqpVarZza.zzb("rtype", Q0.a.i0(Q0.a.k0(zzmVar)));
            }
        }
        return zzdqpVarZza;
    }

    private final void zze(zzdqp zzdqpVar) {
        if (!this.zze.zzb()) {
            zzdqpVar.zzj();
            return;
        }
        String strZze = zzdqpVar.zze();
        o.f1952C.j.getClass();
        this.zzf.zzd(new zzeah(System.currentTimeMillis(), this.zzd.zzb.zzb.zzb, strZze, 2));
    }

    private final boolean zzf() {
        String strF;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzbE);
                    P p5 = o.f1952C.f1957c;
                    try {
                        strF = P.F(this.zza);
                    } catch (RemoteException unused) {
                        strF = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strF != null) {
                        try {
                            zMatches = Pattern.matches(str, strF);
                        } catch (RuntimeException e7) {
                            o.f1952C.f1961g.zzw(e7, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        if (this.zze.zzb()) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            zzdqp zzdqpVarZzd = zzd("ifts");
            zzdqpVarZzd.zzb(DiscardedEvent.JsonKeys.REASON, "adapter");
            int i7 = zzeVar.f10720a;
            if (zzeVar.f10722c.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.f10723d) != null && !zzeVar2.f10722c.equals("com.google.android.gms.ads")) {
                zzeVar = zzeVar.f10723d;
                i7 = zzeVar.f10720a;
            }
            String str = zzeVar.f10721b;
            if (i7 >= 0) {
                zzdqpVarZzd.zzb("arec", String.valueOf(i7));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdqpVarZzd.zzb("areec", strZza);
            }
            zzdqpVarZzd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zzb() {
        if (this.zzi) {
            zzdqp zzdqpVarZzd = zzd("ifts");
            zzdqpVarZzd.zzb(DiscardedEvent.JsonKeys.REASON, "blocked");
            zzdqpVarZzd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zzc(zzdey zzdeyVar) {
        if (this.zzi) {
            zzdqp zzdqpVarZzd = zzd("ifts");
            zzdqpVarZzd.zzb(DiscardedEvent.JsonKeys.REASON, SentryEvent.JsonKeys.EXCEPTION);
            if (!TextUtils.isEmpty(zzdeyVar.getMessage())) {
                zzdqpVarZzd.zzb("msg", zzdeyVar.getMessage());
            }
            zzdqpVarZzd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        if (zzf() || this.zze.zzb()) {
            zze(zzd("impression"));
        }
    }
}
