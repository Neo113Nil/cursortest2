package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzffp implements zzffn {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfgd zzj = zzfgd.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzffp(Context context, int i7) {
        this.zza = context;
        this.zzp = i7;
    }

    public final synchronized zzffp zzA() {
        o.f1952C.j.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        return this;
    }

    public final synchronized zzffp zzK(int i7) {
        this.zzq = i7;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzb(zzfaq zzfaqVar) {
        zzs(zzfaqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzf(zzfgd zzfgdVar) {
        zzw(zzfgdVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzg(boolean z4) {
        zzx(z4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzh(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final synchronized zzffr zzm() {
        try {
            zzffq zzffqVar = null;
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzz();
            }
            if (this.zzc < 0) {
                zzA();
            }
            return new zzffr(this, zzffqVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzn(int i7) {
        zzK(i7);
        return this;
    }

    public final synchronized zzffp zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.f10724e;
            if (iBinder != null) {
                zzcuj zzcujVar = (zzcuj) iBinder;
                String zzl = zzcujVar.zzl();
                if (!TextUtils.isEmpty(zzl)) {
                    this.zzf = zzl;
                }
                String zzi = zzcujVar.zzi();
                if (!TextUtils.isEmpty(zzi)) {
                    this.zzg = zzi;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2.zzg = r0.zzab;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzffp zzs(zzfaq zzfaqVar) {
        try {
            if (!TextUtils.isEmpty(zzfaqVar.zzb.zzb)) {
                this.zzf = zzfaqVar.zzb.zzb;
            }
            Iterator it = zzfaqVar.zza.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzfaf zzfafVar = (zzfaf) it.next();
                if (!TextUtils.isEmpty(zzfafVar.zzab)) {
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzffp zzt(String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziP)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzffp zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzffp zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzffp zzw(zzfgd zzfgdVar) {
        this.zzj = zzfgdVar;
        return this;
    }

    public final synchronized zzffp zzx(boolean z4) {
        this.zzd = z4;
        return this;
    }

    public final synchronized zzffp zzy(Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziP)).booleanValue()) {
            this.zzl = zzbtl.zzf(th);
            this.zzk = (String) zzftw.zzb(zzfss.zzc('\n')).zzd(zzbtl.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzffp zzz() {
        Configuration configuration;
        o oVar = o.f1952C;
        this.zze = oVar.f1959e.g(this.zza);
        Resources resources = this.zza.getResources();
        int i7 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i7 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i7;
        oVar.j.getClass();
        this.zzb = SystemClock.elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
