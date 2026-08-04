package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzcbq implements zzfx {
    private final Context zza;
    private final zzfx zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbai zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzgc zzl;

    public zzcbq(Context context, zzfx zzfxVar, String str, int i7, zzgx zzgxVar, zzcbp zzcbpVar) {
        this.zza = context;
        this.zzb = zzfxVar;
        this.zzc = str;
        this.zzd = i7;
        new AtomicLong(-1L);
        this.zze = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        zzbbp zzbbpVar = zzbby.zzey;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || this.zzj) {
            return ((Boolean) c0254t.f2726c.zzb(zzbby.zzez)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i7, i8) : this.zzb.zza(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws IOException {
        Long l7;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgcVar.zza;
        this.zzh = uri;
        this.zzl = zzgcVar;
        this.zzi = zzbai.zza(uri);
        zzbbp zzbbpVar = zzbby.zzev;
        C0254t c0254t = C0254t.f2723d;
        zzbaf zzbafVarZzb = null;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgcVar.zze;
                this.zzi.zzi = zzfty.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbafVarZzb = o.f1952C.f1963i.zzb(this.zzi);
            }
            if (zzbafVarZzb != null && zzbafVarZzb.zze()) {
                this.zzj = zzbafVarZzb.zzg();
                this.zzk = zzbafVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzbafVarZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgcVar.zze;
            this.zzi.zzi = zzfty.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l7 = (Long) c0254t.f2726c.zzb(zzbby.zzex);
            } else {
                l7 = (Long) c0254t.f2726c.zzb(zzbby.zzew);
            }
            long jLongValue = l7.longValue();
            o.f1952C.j.getClass();
            SystemClock.elapsedRealtime();
            Future futureZza = zzbat.zza(this.zza, this.zzi);
            try {
                try {
                    try {
                        zzbau zzbauVar = (zzbau) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                        zzbauVar.zzd();
                        this.zzj = zzbauVar.zzf();
                        this.zzk = zzbauVar.zze();
                        zzbauVar.zza();
                        if (!zzg()) {
                            this.zzf = zzbauVar.zzc();
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        futureZza.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            o.f1952C.j.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzga zzgaVarZza = zzgcVar.zza();
            zzgaVarZza.zzd(Uri.parse(this.zzi.zza));
            this.zzl = zzgaVarZza.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            c.d(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgx zzgxVar) {
    }
}
