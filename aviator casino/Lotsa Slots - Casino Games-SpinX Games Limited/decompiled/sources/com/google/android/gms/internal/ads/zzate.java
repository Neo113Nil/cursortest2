package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzate implements java.lang.Comparable {
    private final com.google.android.gms.internal.ads.zzatp zza;
    private final int zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final java.lang.Object zze;
    private final com.google.android.gms.internal.ads.zzati zzf;
    private java.lang.Integer zzg;
    private com.google.android.gms.internal.ads.zzath zzh;
    private boolean zzi;
    private com.google.android.gms.internal.ads.zzasn zzj;
    private com.google.android.gms.internal.ads.zzatd zzk;
    private final com.google.android.gms.internal.ads.zzass zzl;

    public zzate(int i, java.lang.String str, com.google.android.gms.internal.ads.zzati zzatiVar) {
        android.net.Uri parse;
        java.lang.String host;
        this.zza = com.google.android.gms.internal.ads.zzatp.zza ? new com.google.android.gms.internal.ads.zzatp() : null;
        this.zze = new java.lang.Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzatiVar;
        this.zzl = new com.google.android.gms.internal.ads.zzass();
        if (!android.text.TextUtils.isEmpty(str) && (parse = android.net.Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.zzg.intValue() - ((com.google.android.gms.internal.ads.zzate) obj).zzg.intValue();
    }

    public final java.lang.String toString() {
        java.lang.String hexString = java.lang.Integer.toHexString(this.zzd);
        java.lang.String.valueOf(hexString);
        java.lang.String valueOf = java.lang.String.valueOf(hexString);
        zzl();
        java.lang.Integer num = this.zzg;
        java.lang.String str = this.zzc;
        int length = java.lang.String.valueOf(str).length();
        int length2 = java.lang.String.valueOf(num).length();
        java.lang.String concat = "0x".concat(valueOf);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 5 + concat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        sb.append(concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(java.lang.String str) {
        if (com.google.android.gms.internal.ads.zzatp.zza) {
            this.zza.zza(str, java.lang.Thread.currentThread().getId());
        }
    }

    final void zzd(java.lang.String str) {
        com.google.android.gms.internal.ads.zzath zzathVar = this.zzh;
        if (zzathVar != null) {
            zzathVar.zzc(this);
        }
        if (com.google.android.gms.internal.ads.zzatp.zza) {
            long id = java.lang.Thread.currentThread().getId();
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.google.android.gms.internal.ads.zzatc(this, str, id));
                return;
            }
            com.google.android.gms.internal.ads.zzatp zzatpVar = this.zza;
            zzatpVar.zza(str, id);
            zzatpVar.zzb(toString());
        }
    }

    final void zze(int i) {
        com.google.android.gms.internal.ads.zzath zzathVar = this.zzh;
        if (zzathVar != null) {
            zzathVar.zzd(this, i);
        }
    }

    public final com.google.android.gms.internal.ads.zzate zzf(com.google.android.gms.internal.ads.zzath zzathVar) {
        this.zzh = zzathVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzate zzg(int i) {
        this.zzg = java.lang.Integer.valueOf(i);
        return this;
    }

    public final java.lang.String zzh() {
        return this.zzc;
    }

    public final java.lang.String zzi() {
        int i = this.zzb;
        java.lang.String str = this.zzc;
        if (i == 0) {
            return str;
        }
        java.lang.String num = java.lang.Integer.toString(1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(num).length() + 1 + java.lang.String.valueOf(str).length());
        sb.append(num);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final com.google.android.gms.internal.ads.zzate zzj(com.google.android.gms.internal.ads.zzasn zzasnVar) {
        this.zzj = zzasnVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzasn zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public java.util.Map zzm() throws com.google.android.gms.internal.ads.zzasm {
        return java.util.Collections.emptyMap();
    }

    public byte[] zzn() throws com.google.android.gms.internal.ads.zzasm {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    protected abstract com.google.android.gms.internal.ads.zzatk zzr(com.google.android.gms.internal.ads.zzata zzataVar);

    protected abstract void zzs(java.lang.Object obj);

    public final void zzt(com.google.android.gms.internal.ads.zzatn zzatnVar) {
        com.google.android.gms.internal.ads.zzati zzatiVar;
        synchronized (this.zze) {
            zzatiVar = this.zzf;
        }
        zzatiVar.zza(zzatnVar);
    }

    final void zzu(com.google.android.gms.internal.ads.zzatd zzatdVar) {
        synchronized (this.zze) {
            this.zzk = zzatdVar;
        }
    }

    final void zzv(com.google.android.gms.internal.ads.zzatk zzatkVar) {
        com.google.android.gms.internal.ads.zzatd zzatdVar;
        synchronized (this.zze) {
            zzatdVar = this.zzk;
        }
        if (zzatdVar != null) {
            zzatdVar.zza(this, zzatkVar);
        }
    }

    final void zzw() {
        com.google.android.gms.internal.ads.zzatd zzatdVar;
        synchronized (this.zze) {
            zzatdVar = this.zzk;
        }
        if (zzatdVar != null) {
            zzatdVar.zzb(this);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzatp zzx() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzass zzy() {
        return this.zzl;
    }
}
