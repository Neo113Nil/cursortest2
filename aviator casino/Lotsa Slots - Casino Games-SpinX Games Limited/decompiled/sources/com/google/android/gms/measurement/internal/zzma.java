package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzma extends com.google.android.gms.measurement.internal.zzg {
    protected com.google.android.gms.measurement.internal.zzlt zza;
    private volatile com.google.android.gms.measurement.internal.zzlt zzb;
    private volatile com.google.android.gms.measurement.internal.zzlt zzc;
    private final java.util.Map zzd;
    private com.google.android.gms.internal.measurement.zzdf zze;
    private volatile boolean zzf;
    private volatile com.google.android.gms.measurement.internal.zzlt zzg;
    private com.google.android.gms.measurement.internal.zzlt zzh;
    private boolean zzi;
    private final java.lang.Object zzj;

    public zzma(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzj = new java.lang.Object();
        this.zzd = new java.util.concurrent.ConcurrentHashMap();
    }

    private final void zzA(com.google.android.gms.measurement.internal.zzlt zzltVar, boolean z, long j) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        zzibVar2.zzw().zzc(zzibVar.zzaZ().elapsedRealtime());
        if (!zzibVar2.zzh().zzb.zzd(zzltVar != null && zzltVar.zzd, z, j) || zzltVar == null) {
            return;
        }
        zzltVar.zzd = false;
    }

    private final com.google.android.gms.measurement.internal.zzlt zzB(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdfVar);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(zzdfVar.zza);
        java.util.Map map = this.zzd;
        com.google.android.gms.measurement.internal.zzlt zzltVar = (com.google.android.gms.measurement.internal.zzlt) map.get(valueOf);
        if (zzltVar == null) {
            com.google.android.gms.measurement.internal.zzlt zzltVar2 = new com.google.android.gms.measurement.internal.zzlt(null, zzi(zzdfVar.zzb, "Activity"), this.zzu.zzk().zzd());
            map.put(valueOf, zzltVar2);
            zzltVar = zzltVar2;
        }
        return this.zzg != null ? this.zzg : zzltVar;
    }

    private final void zzy(java.lang.String str, com.google.android.gms.measurement.internal.zzlt zzltVar, boolean z) {
        com.google.android.gms.measurement.internal.zzlt zzltVar2;
        com.google.android.gms.measurement.internal.zzlt zzltVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzltVar.zzb == null) {
            zzltVar2 = new com.google.android.gms.measurement.internal.zzlt(zzltVar.zza, str != null ? zzi(str, "Activity") : null, zzltVar.zzc, zzltVar.zze, zzltVar.zzf);
        } else {
            zzltVar2 = zzltVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzltVar2;
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlv(this, zzltVar2, zzltVar3, zzibVar.zzaZ().elapsedRealtime(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzz(com.google.android.gms.measurement.internal.zzlt zzltVar, com.google.android.gms.measurement.internal.zzlt zzltVar2, long j, boolean z, android.os.Bundle bundle) {
        boolean z2;
        long j2;
        long j3;
        zzg();
        boolean z3 = false;
        if (zzltVar2 != null) {
            if (zzltVar2.zzc == zzltVar.zzc && java.util.Objects.equals(zzltVar2.zzb, zzltVar.zzb) && java.util.Objects.equals(zzltVar2.zza, zzltVar.zza)) {
                z2 = false;
                if (z && this.zza != null) {
                    z3 = true;
                }
                if (z2) {
                    android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
                    com.google.android.gms.measurement.internal.zzpo.zzav(zzltVar, bundle2, true);
                    if (zzltVar2 != null) {
                        java.lang.String str = zzltVar2.zza;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        java.lang.String str2 = zzltVar2.zzb;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", zzltVar2.zzc);
                    }
                    if (z3) {
                        com.google.android.gms.measurement.internal.zznz zznzVar = this.zzu.zzh().zzb;
                        long j4 = j - zznzVar.zzb;
                        zznzVar.zzb = j;
                        if (j4 > 0) {
                            this.zzu.zzk().zzak(bundle2, j4);
                        }
                    }
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    if (!zzibVar.zzc().zzv()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    boolean z4 = zzltVar.zze;
                    java.lang.String str3 = true != z4 ? "auto" : "app";
                    long currentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
                    if (z4) {
                        j2 = currentTimeMillis;
                        long j5 = zzltVar.zzf;
                        if (j5 != 0) {
                            j3 = j5;
                            this.zzu.zzj().zzG(str3, "_vs", j3, bundle2);
                        }
                    } else {
                        j2 = currentTimeMillis;
                    }
                    j3 = j2;
                    this.zzu.zzj().zzG(str3, "_vs", j3, bundle2);
                }
                if (z3) {
                    zzA(this.zza, true, j);
                }
                this.zza = zzltVar;
                if (zzltVar.zze) {
                    this.zzh = zzltVar;
                }
                this.zzu.zzt().zzG(zzltVar);
            }
        }
        z2 = true;
        if (z) {
            z3 = true;
        }
        if (z2) {
        }
        if (z3) {
        }
        this.zza = zzltVar;
        if (zzltVar.zze) {
        }
        this.zzu.zzt().zzG(zzltVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final com.google.android.gms.measurement.internal.zzlt zzh(boolean z) {
        zzb();
        zzg();
        if (!z) {
            return this.zza;
        }
        com.google.android.gms.measurement.internal.zzlt zzltVar = this.zza;
        return zzltVar != null ? zzltVar : this.zzh;
    }

    final java.lang.String zzi(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return "Activity";
        }
        java.lang.String[] split = str.split("\\.");
        int length = split.length;
        java.lang.String str3 = length > 0 ? split[length - 1] : "";
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        return str3.length() > zzibVar.zzc().zze(null, false) ? str3.substring(0, zzibVar.zzc().zze(null, false)) : str3;
    }

    public final void zzj(android.os.Bundle bundle, long j) {
        synchronized (this.zzj) {
            if (!this.zzi) {
                this.zzu.zzaV().zzh().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            java.lang.String string = bundle.getString(com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_NAME);
            if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzc().zze(null, false))) {
                this.zzu.zzaV().zzh().zzb("Invalid screen name length for screen view. Length", java.lang.Integer.valueOf(string.length()));
                return;
            }
            java.lang.String string2 = bundle.getString(com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_CLASS);
            if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzc().zze(null, false))) {
                this.zzu.zzaV().zzh().zzb("Invalid screen class length for screen view. Length", java.lang.Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                com.google.android.gms.internal.measurement.zzdf zzdfVar = this.zze;
                string2 = zzdfVar != null ? zzi(zzdfVar.zzb, "Activity") : "Activity";
            }
            com.google.android.gms.measurement.internal.zzlt zzltVar = this.zzb;
            if (this.zzf && zzltVar != null) {
                this.zzf = false;
                boolean equals = java.util.Objects.equals(zzltVar.zzb, string2);
                boolean equals2 = java.util.Objects.equals(zzltVar.zza, string);
                if (equals && equals2) {
                    this.zzu.zzaV().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzk().zzc("Logging screen view with name, class", string == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : string, string2 == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : string2);
            com.google.android.gms.measurement.internal.zzlt zzltVar2 = this.zzb == null ? this.zzc : this.zzb;
            com.google.android.gms.measurement.internal.zzlt zzltVar3 = new com.google.android.gms.measurement.internal.zzlt(string, string2, zzibVar.zzk().zzd(), true, j);
            this.zzb = zzltVar3;
            this.zzc = zzltVar2;
            this.zzg = zzltVar3;
            zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlu(this, bundle, zzltVar3, zzltVar2, zzibVar.zzaZ().elapsedRealtime()));
        }
    }

    @java.lang.Deprecated
    public final void zzk(com.google.android.gms.internal.measurement.zzdf zzdfVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzv()) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        com.google.android.gms.measurement.internal.zzlt zzltVar = this.zzb;
        if (zzltVar == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        java.util.Map map = this.zzd;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(zzdfVar.zza);
        if (map.get(valueOf) == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzi(zzdfVar.zzb, "Activity");
        }
        java.lang.String str3 = zzltVar.zzb;
        java.lang.String str4 = zzltVar.zza;
        boolean equals = java.util.Objects.equals(str3, str2);
        boolean equals2 = java.util.Objects.equals(str4, str);
        if (equals && equals2) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid class name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str2.length()));
            return;
        }
        zzibVar.zzaV().zzk().zzc("Setting current screen to name, class", str == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : str, str2);
        com.google.android.gms.measurement.internal.zzlt zzltVar2 = new com.google.android.gms.measurement.internal.zzlt(str, str2, zzibVar.zzk().zzd());
        map.put(valueOf, zzltVar2);
        zzy(zzdfVar.zzb, zzltVar2, true);
    }

    public final com.google.android.gms.measurement.internal.zzlt zzl() {
        return this.zzb;
    }

    public final void zzm(com.google.android.gms.internal.measurement.zzdf zzdfVar, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        if (!this.zzu.zzc().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(java.lang.Integer.valueOf(zzdfVar.zza), new com.google.android.gms.measurement.internal.zzlt(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzn(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        java.lang.Object obj = this.zzj;
        synchronized (obj) {
            this.zzi = true;
            if (!java.util.Objects.equals(zzdfVar, this.zze)) {
                synchronized (obj) {
                    this.zze = zzdfVar;
                    this.zzf = false;
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    if (zzibVar.zzc().zzv()) {
                        this.zzg = null;
                        zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlz(this));
                    }
                }
            }
        }
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        if (!zzibVar2.zzc().zzv()) {
            this.zzb = this.zzg;
            zzibVar2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlw(this));
            return;
        }
        zzy(zzdfVar.zzb, zzB(zzdfVar), false);
        com.google.android.gms.measurement.internal.zzd zzw = this.zzu.zzw();
        com.google.android.gms.measurement.internal.zzib zzibVar3 = zzw.zzu;
        zzibVar3.zzaW().zzj(new com.google.android.gms.measurement.internal.zzc(zzw, zzibVar3.zzaZ().elapsedRealtime()));
    }

    public final void zzp(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        long elapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
        if (!zzibVar.zzc().zzv()) {
            this.zzb = null;
            zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlx(this, elapsedRealtime));
        } else {
            com.google.android.gms.measurement.internal.zzlt zzB = zzB(zzdfVar);
            this.zzc = this.zzb;
            this.zzb = null;
            zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzly(this, zzB, elapsedRealtime));
        }
    }

    public final void zzq(com.google.android.gms.internal.measurement.zzdf zzdfVar, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzlt zzltVar;
        if (!this.zzu.zzc().zzv() || bundle == null || (zzltVar = (com.google.android.gms.measurement.internal.zzlt) this.zzd.get(java.lang.Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putLong("id", zzltVar.zzc);
        bundle2.putString("name", zzltVar.zza);
        bundle2.putString("referrer_name", zzltVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            if (java.util.Objects.equals(this.zze, zzdfVar)) {
                this.zze = null;
            }
        }
        if (this.zzu.zzc().zzv()) {
            this.zzd.remove(java.lang.Integer.valueOf(zzdfVar.zza));
        }
    }

    final /* synthetic */ void zzt(android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzlt zzltVar, com.google.android.gms.measurement.internal.zzlt zzltVar2, long j) {
        bundle.remove(com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_CLASS);
        zzz(zzltVar, zzltVar2, j, true, this.zzu.zzk().zzF(null, com.google.firebase.analytics.FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    final /* synthetic */ void zzu(com.google.android.gms.measurement.internal.zzlt zzltVar, com.google.android.gms.measurement.internal.zzlt zzltVar2, long j, boolean z, android.os.Bundle bundle) {
        zzz(zzltVar, zzltVar2, j, z, null);
    }

    final /* synthetic */ void zzv(com.google.android.gms.measurement.internal.zzlt zzltVar, boolean z, long j) {
        zzA(zzltVar, false, j);
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzlt zzw() {
        return this.zzh;
    }

    final /* synthetic */ void zzx(com.google.android.gms.measurement.internal.zzlt zzltVar) {
        this.zzh = null;
    }
}
