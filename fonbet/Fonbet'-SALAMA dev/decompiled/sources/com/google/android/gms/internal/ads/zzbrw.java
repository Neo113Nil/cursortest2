package com.google.android.gms.internal.ads;

import J2.j;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbrw extends O2.b {
    private final zzbfj zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        J2.j.e("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        J2.j.e("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        J2.j.e("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        J2.j.e("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbrw(zzbfj zzbfjVar) {
        Drawable drawable;
        InterfaceC1506a zzf;
        this.zza = zzbfjVar;
        Uri uri = null;
        try {
            zzf = zzbfjVar.zzf();
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        if (zzf != null) {
            drawable = (Drawable) BinderC1507b.t0(zzf);
            this.zzb = drawable;
            uri = this.zza.zze();
            this.zzc = uri;
            double d7 = this.zza.zzb();
            this.zzd = d7;
            int i7 = -1;
            int i8 = this.zza.zzd();
            this.zze = i8;
            i7 = this.zza.zzc();
            this.zzf = i7;
        }
        drawable = null;
        this.zzb = drawable;
        uri = this.zza.zze();
        this.zzc = uri;
        double d72 = this.zza.zzb();
        this.zzd = d72;
        int i72 = -1;
        int i82 = this.zza.zzd();
        this.zze = i82;
        i72 = this.zza.zzc();
        this.zzf = i72;
    }

    @Override // O2.b
    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zze;
    }
}
