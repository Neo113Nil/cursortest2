package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhv implements com.google.android.gms.internal.ads.zzhp {
    private final android.content.Context zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private final com.google.android.gms.internal.ads.zzhp zzc;
    private com.google.android.gms.internal.ads.zzhp zzd;
    private com.google.android.gms.internal.ads.zzhp zze;
    private com.google.android.gms.internal.ads.zzhp zzf;
    private com.google.android.gms.internal.ads.zzhp zzg;
    private com.google.android.gms.internal.ads.zzhp zzh;
    private com.google.android.gms.internal.ads.zzhp zzi;
    private com.google.android.gms.internal.ads.zzhp zzj;
    private com.google.android.gms.internal.ads.zzhp zzk;

    public zzhv(android.content.Context context, com.google.android.gms.internal.ads.zzhp zzhpVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhpVar;
    }

    private final com.google.android.gms.internal.ads.zzhp zzf() {
        if (this.zze == null) {
            com.google.android.gms.internal.ads.zzhg zzhgVar = new com.google.android.gms.internal.ads.zzhg(this.zza);
            this.zze = zzhgVar;
            zzg(zzhgVar);
        }
        return this.zze;
    }

    private final void zzg(com.google.android.gms.internal.ads.zzhp zzhpVar) {
        int i = 0;
        while (true) {
            java.util.List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            zzhpVar.zze((com.google.android.gms.internal.ads.zzin) list.get(i));
            i++;
        }
    }

    private static final void zzh(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzin zzinVar) {
        if (zzhpVar != null) {
            zzhpVar.zze(zzinVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzhp zzhpVar;
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzk == null);
        android.net.Uri uri = zzhtVar.zza;
        java.lang.String scheme = uri.getScheme();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.String scheme2 = uri.getScheme();
        if (android.text.TextUtils.isEmpty(scheme2) || java.util.Objects.equals(scheme2, "file")) {
            java.lang.String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    com.google.android.gms.internal.ads.zzic zzicVar = new com.google.android.gms.internal.ads.zzic();
                    this.zzd = zzicVar;
                    zzg(zzicVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                com.google.android.gms.internal.ads.zzhm zzhmVar = new com.google.android.gms.internal.ads.zzhm(this.zza);
                this.zzf = zzhmVar;
                zzg(zzhmVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    com.google.android.gms.internal.ads.zzhp zzhpVar2 = (com.google.android.gms.internal.ads.zzhp) java.lang.Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                    this.zzg = zzhpVar2;
                    zzg(zzhpVar2);
                } catch (java.lang.ClassNotFoundException unused) {
                    com.google.android.gms.internal.ads.zzeg.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                com.google.android.gms.internal.ads.zzip zzipVar = new com.google.android.gms.internal.ads.zzip(2000);
                this.zzh = zzipVar;
                zzg(zzipVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                com.google.android.gms.internal.ads.zzhn zzhnVar = new com.google.android.gms.internal.ads.zzhn();
                this.zzi = zzhnVar;
                zzg(zzhnVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    com.google.android.gms.internal.ads.zzil zzilVar = new com.google.android.gms.internal.ads.zzil(this.zza);
                    this.zzj = zzilVar;
                    zzg(zzilVar);
                }
                zzhpVar = this.zzj;
            } else {
                zzhpVar = this.zzc;
            }
            this.zzk = zzhpVar;
        }
        return this.zzk.zzb(zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        com.google.android.gms.internal.ads.zzhp zzhpVar = this.zzk;
        if (zzhpVar == null) {
            return null;
        }
        return zzhpVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzhp zzhpVar = this.zzk;
        if (zzhpVar != null) {
            try {
                zzhpVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final java.util.Map zzj() {
        com.google.android.gms.internal.ads.zzhp zzhpVar = this.zzk;
        return zzhpVar == null ? java.util.Collections.emptyMap() : zzhpVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzhp zzhpVar = this.zzk;
        zzhpVar.getClass();
        return zzhpVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(com.google.android.gms.internal.ads.zzin zzinVar) {
        zzinVar.getClass();
        this.zzc.zze(zzinVar);
        this.zzb.add(zzinVar);
        zzh(this.zzd, zzinVar);
        zzh(this.zze, zzinVar);
        zzh(this.zzf, zzinVar);
        zzh(this.zzg, zzinVar);
        zzh(this.zzh, zzinVar);
        zzh(this.zzi, zzinVar);
        zzh(this.zzj, zzinVar);
    }
}
