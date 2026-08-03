package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzimf implements java.util.Iterator, java.io.Closeable, com.google.android.gms.internal.ads.zzauq {
    private static final com.google.android.gms.internal.ads.zzaup zza = new com.google.android.gms.internal.ads.zzime("eof ");
    protected com.google.android.gms.internal.ads.zzaum zzb;
    protected com.google.android.gms.internal.ads.zzimg zzc;
    com.google.android.gms.internal.ads.zzaup zzd = null;
    long zze = 0;
    long zzf = 0;
    private final java.util.List zzg = new java.util.ArrayList();

    static {
        com.google.android.gms.internal.ads.zzimm.zzb(com.google.android.gms.internal.ads.zzimf.class);
    }

    public void close() throws java.io.IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.android.gms.internal.ads.zzaup zzaupVar = this.zzd;
        if (zzaupVar == zza) {
            return false;
        }
        if (zzaupVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (java.util.NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(com.ironsource.X3.j.d);
        int i = 0;
        while (true) {
            java.util.List list = this.zzg;
            if (i >= list.size()) {
                sb.append(com.ironsource.X3.j.e);
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((com.google.android.gms.internal.ads.zzaup) list.get(i)).toString());
            i++;
        }
    }

    public final java.util.List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new com.google.android.gms.internal.ads.zziml(this.zzg, this);
    }

    public final void zzd(com.google.android.gms.internal.ads.zzimg zzimgVar, long j, com.google.android.gms.internal.ads.zzaum zzaumVar) throws java.io.IOException {
        this.zzc = zzimgVar;
        this.zze = zzimgVar.zzc();
        zzimgVar.zzd(zzimgVar.zzc() + j);
        this.zzf = zzimgVar.zzc();
        this.zzb = zzaumVar;
    }

    @Override // java.util.Iterator
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzaup next() {
        com.google.android.gms.internal.ads.zzaup zzb;
        com.google.android.gms.internal.ads.zzaup zzaupVar = this.zzd;
        if (zzaupVar != null && zzaupVar != zza) {
            this.zzd = null;
            return zzaupVar;
        }
        com.google.android.gms.internal.ads.zzimg zzimgVar = this.zzc;
        if (zzimgVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new java.util.NoSuchElementException();
        }
        try {
            synchronized (zzimgVar) {
                this.zzc.zzd(this.zze);
                zzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzb;
        } catch (java.io.EOFException unused) {
            throw new java.util.NoSuchElementException();
        } catch (java.io.IOException unused2) {
            throw new java.util.NoSuchElementException();
        }
    }
}
