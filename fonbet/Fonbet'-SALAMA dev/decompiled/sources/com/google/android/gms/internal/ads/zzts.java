package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.net.Uri;
import java.io.EOFException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzts implements zzvl {
    private final zzada zza;
    private zzacv zzb;
    private zzacw zzc;

    public zzts(zzada zzadaVar) {
        this.zza = zzadaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final int zza(zzadr zzadrVar) {
        zzacv zzacvVar = this.zzb;
        zzacvVar.getClass();
        zzacw zzacwVar = this.zzc;
        zzacwVar.getClass();
        return zzacvVar.zzb(zzacwVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        zzacw zzacwVar = this.zzc;
        if (zzacwVar != null) {
            return zzacwVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzc() {
        zzacv zzacvVar = this.zzb;
        if (zzacvVar != null && (zzacvVar instanceof zzahe)) {
            ((zzahe) zzacvVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r6.zzf() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        if (r6.zzf() != r11) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.zzvl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzl zzlVar, Uri uri, Map map, long j, long j3, zzacy zzacyVar) {
        zzack zzackVar = new zzack(zzlVar, j, j3);
        this.zzc = zzackVar;
        if (this.zzb != null) {
            return;
        }
        zzacv[] zza = this.zza.zza(uri, map);
        int length = zza.length;
        zzfwe zzi = zzfwh.zzi(length);
        boolean z4 = true;
        if (length == 1) {
            this.zzb = zza[0];
        } else {
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                zzacv zzacvVar = zza[i7];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    if (this.zzb == null && zzackVar.zzf() != j) {
                        z4 = false;
                    }
                    zzcv.zzf(z4);
                    zzackVar.zzj();
                    throw th;
                }
                if (zzacvVar.zzi(zzackVar)) {
                    this.zzb = zzacvVar;
                    zzcv.zzf(true);
                    zzackVar.zzj();
                    break;
                } else {
                    zzi.zzh(zzacvVar.zzd());
                    if (this.zzb == null) {
                    }
                    boolean z7 = true;
                    zzcv.zzf(z7);
                    zzackVar.zzj();
                    i7++;
                }
            }
            if (this.zzb == null) {
                Iterator it = zzfwx.zzb(zzfwh.zzm(zza), new zzfsw() { // from class: com.google.android.gms.internal.ads.zztr
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        zzacv zzacvVar2 = (zzacv) obj;
                        zzacvVar2.zzc();
                        return zzacvVar2.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb = new StringBuilder();
                zzfsz.zzc(sb, it, ", ");
                throw new zzww(AbstractC0486a1.h("None of the available extractors (", sb.toString(), ") could read the stream."), uri, zzi.zzi());
            }
        }
        this.zzb.zze(zzacyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzf(long j, long j3) {
        zzacv zzacvVar = this.zzb;
        zzacvVar.getClass();
        zzacvVar.zzf(j, j3);
    }
}
