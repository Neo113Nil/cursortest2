package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbua implements com.google.android.libraries.places.internal.zzbkt, com.google.android.libraries.places.internal.zzcai {
    private final java.lang.String zzA;
    private com.google.android.libraries.places.internal.zzbsh zzB;
    private final com.google.android.libraries.places.internal.zzbku zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.libraries.places.internal.zzbtt zzd;
    private final com.google.android.libraries.places.internal.zzbpq zze;
    private final java.util.concurrent.ScheduledExecutorService zzf;
    private final com.google.android.libraries.places.internal.zzbkn zzg;
    private final com.google.android.libraries.places.internal.zzbpb zzh;
    private final com.google.android.libraries.places.internal.zzbiv zzi;
    private final boolean zzj;
    private final java.util.List zzk;
    private final com.google.android.libraries.places.internal.zzbnx zzl;
    private final com.google.android.libraries.places.internal.zzbtu zzm;
    private volatile java.util.List zzn;
    private final com.google.common.base.Stopwatch zzo;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbnw zzp;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbnw zzq;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbwd zzr;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbqa zzu;

    @javax.annotation.Nullable
    private volatile com.google.android.libraries.places.internal.zzbwd zzv;
    private com.google.android.libraries.places.internal.zzbnp zzx;
    private volatile com.google.android.libraries.places.internal.zzbio zzy;
    private final com.google.android.libraries.places.internal.zzcaf zzz;
    private final java.util.Collection zzs = new java.util.ArrayList();
    private final com.google.android.libraries.places.internal.zzbte zzt = new com.google.android.libraries.places.internal.zzbth(this);
    private volatile com.google.android.libraries.places.internal.zzbjo zzw = com.google.android.libraries.places.internal.zzbjo.zza(com.google.android.libraries.places.internal.zzbjn.IDLE);

    zzbua(com.google.android.libraries.places.internal.zzbld zzbldVar, java.lang.String str, java.lang.String str2, com.google.android.libraries.places.internal.zzbsg zzbsgVar, com.google.android.libraries.places.internal.zzbpq zzbpqVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.common.base.Supplier supplier, com.google.android.libraries.places.internal.zzbnx zzbnxVar, com.google.android.libraries.places.internal.zzbtt zzbttVar, com.google.android.libraries.places.internal.zzbkn zzbknVar, com.google.android.libraries.places.internal.zzbpb zzbpbVar, com.google.android.libraries.places.internal.zzbpd zzbpdVar, com.google.android.libraries.places.internal.zzbku zzbkuVar, com.google.android.libraries.places.internal.zzbiv zzbivVar, java.util.List list, java.lang.String str3, com.google.android.libraries.places.internal.zzbmo zzbmoVar) {
        java.util.List zza = zzbldVar.zza();
        com.google.common.base.Preconditions.checkNotNull(zza, "addressGroups");
        com.google.common.base.Preconditions.checkArgument(!zza.isEmpty(), "addressGroups is empty");
        zzN(zza, "addressGroups contains null entry");
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(new java.util.ArrayList(zza));
        this.zzn = unmodifiableList;
        this.zzm = new com.google.android.libraries.places.internal.zzbtu(unmodifiableList);
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzbpqVar;
        this.zzf = scheduledExecutorService;
        this.zzo = (com.google.common.base.Stopwatch) supplier.get();
        this.zzl = zzbnxVar;
        this.zzd = zzbttVar;
        this.zzg = zzbknVar;
        this.zzh = zzbpbVar;
        this.zza = (com.google.android.libraries.places.internal.zzbku) com.google.common.base.Preconditions.checkNotNull(zzbkuVar, "logId");
        this.zzi = (com.google.android.libraries.places.internal.zzbiv) com.google.common.base.Preconditions.checkNotNull(zzbivVar, "channelLogger");
        this.zzk = list;
        this.zzj = ((java.lang.Boolean) zzbldVar.zzc(com.google.android.libraries.places.internal.zzblp.zzc)).booleanValue();
        this.zzA = str3;
        this.zzz = new com.google.android.libraries.places.internal.zzcaf(zzbmoVar);
    }

    private final void zzM(com.google.android.libraries.places.internal.zzbjo zzbjoVar) {
        this.zzl.zzc();
        if (this.zzw.zzc() != zzbjoVar.zzc()) {
            com.google.common.base.Preconditions.checkState(this.zzw.zzc() != com.google.android.libraries.places.internal.zzbjn.SHUTDOWN, "Cannot transition out of SHUTDOWN to %s", zzbjoVar.zzc());
            if (this.zzj && zzbjoVar.zzc() == com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE) {
                this.zzw = com.google.android.libraries.places.internal.zzbjo.zza(com.google.android.libraries.places.internal.zzbjn.IDLE);
            } else {
                this.zzw = zzbjoVar;
            }
            com.google.android.libraries.places.internal.zzbtt zzbttVar = this.zzd;
            com.google.common.base.Preconditions.checkState(true, "listener is null");
            ((com.google.android.libraries.places.internal.zzbvn) zzbttVar).zza.zza(zzbjoVar);
        }
    }

    private static void zzN(java.util.List list, java.lang.String str) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.common.base.Preconditions.checkNotNull(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String zzO(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(zzbnpVar.zzg());
        if (zzbnpVar.zzh() != null) {
            sb.append("(");
            sb.append(zzbnpVar.zzh());
            sb.append(")");
        }
        if (zzbnpVar.zzi() != null) {
            sb.append("[");
            sb.append(zzbnpVar.zzi());
            sb.append("]");
        }
        return sb.toString();
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("logId", this.zza.zzc()).add("addressGroups", this.zzn).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcai
    public final com.google.android.libraries.places.internal.zzbpo zza() {
        com.google.android.libraries.places.internal.zzbwd zzbwdVar = this.zzv;
        if (zzbwdVar != null) {
            return zzbwdVar;
        }
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzl;
        zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbtj(this));
        zzbnxVar.zza();
        return null;
    }

    public final void zzb(java.util.List list) {
        com.google.common.base.Preconditions.checkNotNull(list, "newAddressGroups");
        zzN(list, "newAddressGroups contains null entry");
        com.google.common.base.Preconditions.checkArgument(!list.isEmpty(), "newAddressGroups is empty");
        com.google.android.libraries.places.internal.zzbtl zzbtlVar = new com.google.android.libraries.places.internal.zzbtl(this, java.util.Collections.unmodifiableList(new java.util.ArrayList(list)));
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzl;
        zzbnxVar.zzb(zzbtlVar);
        zzbnxVar.zza();
    }

    public final void zzd(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.android.libraries.places.internal.zzbtm zzbtmVar = new com.google.android.libraries.places.internal.zzbtm(this, zzbnpVar);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzl;
        zzbnxVar.zzb(zzbtmVar);
        zzbnxVar.zza();
    }

    final void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        zzd(zzbnpVar);
        com.google.android.libraries.places.internal.zzbtp zzbtpVar = new com.google.android.libraries.places.internal.zzbtp(this, zzbnpVar);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzl;
        zzbnxVar.zzb(zzbtpVar);
        zzbnxVar.zza();
    }

    final /* synthetic */ void zzf() {
        com.google.android.libraries.places.internal.zzbki zzbkiVar;
        this.zzl.zzc();
        com.google.common.base.Preconditions.checkState(this.zzp == null, "Should have no reconnectTask scheduled");
        com.google.android.libraries.places.internal.zzbtu zzbtuVar = this.zzm;
        if (zzbtuVar.zzb()) {
            this.zzo.reset().start();
        }
        java.net.SocketAddress zze = zzbtuVar.zze();
        byte[] bArr = null;
        if (zze instanceof com.google.android.libraries.places.internal.zzbki) {
            com.google.android.libraries.places.internal.zzbki zzbkiVar2 = (com.google.android.libraries.places.internal.zzbki) zze;
            zzbkiVar = zzbkiVar2;
            zze = zzbkiVar2.zzd();
        } else {
            zzbkiVar = null;
        }
        com.google.android.libraries.places.internal.zzbio zzf = zzbtuVar.zzf();
        java.lang.String str = (java.lang.String) zzf.zza(com.google.android.libraries.places.internal.zzbka.zza);
        com.google.android.libraries.places.internal.zzbpp zzbppVar = new com.google.android.libraries.places.internal.zzbpp();
        if (str == null) {
            str = this.zzb;
        }
        zzbppVar.zzb(str);
        zzbppVar.zzd(zzf);
        zzbppVar.zzf(this.zzc);
        zzbppVar.zzh(zzbkiVar);
        com.google.android.libraries.places.internal.zzbtz zzbtzVar = new com.google.android.libraries.places.internal.zzbtz();
        zzbtzVar.zza = this.zza;
        com.google.android.libraries.places.internal.zzbts zzbtsVar = new com.google.android.libraries.places.internal.zzbts(this.zze.zza(zze, zzbppVar, zzbtzVar), this.zzh, bArr);
        zzbtzVar.zza = zzbtsVar.zzc();
        this.zzg.zzd(zzbtsVar);
        this.zzu = zzbtsVar;
        this.zzs.add(zzbtsVar);
        zzbtsVar.zzaq(new com.google.android.libraries.places.internal.zzbty(this, zzbtsVar));
        this.zzi.zzb(2, "Started transport {0}", zzbtzVar.zza);
    }

    final /* synthetic */ void zzg(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzl;
        zzbnxVar.zzc();
        zzM(com.google.android.libraries.places.internal.zzbjo.zzb(zzbnpVar));
        if (this.zzj) {
            return;
        }
        if (this.zzB == null) {
            this.zzB = new com.google.android.libraries.places.internal.zzbsh();
        }
        long zza = this.zzB.zza() - this.zzo.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS);
        this.zzi.zzb(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", zzO(zzbnpVar), java.lang.Long.valueOf(zza));
        com.google.common.base.Preconditions.checkState(this.zzp == null, "previous reconnectTask is not done");
        this.zzp = zzbnxVar.zzd(new com.google.android.libraries.places.internal.zzbti(this), zza, java.util.concurrent.TimeUnit.NANOSECONDS, this.zzf);
    }

    final /* synthetic */ void zzh(com.google.android.libraries.places.internal.zzbjn zzbjnVar) {
        this.zzl.zzc();
        zzM(com.google.android.libraries.places.internal.zzbjo.zza(zzbjnVar));
    }

    final /* synthetic */ void zzi() {
        com.google.android.libraries.places.internal.zzbtn zzbtnVar = new com.google.android.libraries.places.internal.zzbtn(this);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzl;
        zzbnxVar.zzb(zzbtnVar);
        zzbnxVar.zza();
    }

    final /* synthetic */ void zzj(com.google.android.libraries.places.internal.zzbqa zzbqaVar, boolean z) {
        com.google.android.libraries.places.internal.zzbto zzbtoVar = new com.google.android.libraries.places.internal.zzbto(this, zzbqaVar, z);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzl;
        zzbnxVar.zzb(zzbtoVar);
        zzbnxVar.zza();
    }

    final /* synthetic */ void zzk() {
        this.zzl.zzc();
        com.google.android.libraries.places.internal.zzbnw zzbnwVar = this.zzp;
        if (zzbnwVar != null) {
            zzbnwVar.zza();
            this.zzp = null;
            this.zzB = null;
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbte zzz() {
        return this.zzt;
    }

    final /* synthetic */ java.util.Collection zzy() {
        return this.zzs;
    }

    final /* synthetic */ void zzx(com.google.android.libraries.places.internal.zzbwd zzbwdVar) {
        this.zzr = zzbwdVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbwd zzw() {
        return this.zzr;
    }

    final /* synthetic */ void zzv(com.google.android.libraries.places.internal.zzbnw zzbnwVar) {
        this.zzq = zzbnwVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnw zzu() {
        return this.zzq;
    }

    final /* synthetic */ void zzt(com.google.android.libraries.places.internal.zzbnw zzbnwVar) {
        this.zzp = null;
    }

    final /* synthetic */ void zzs(java.util.List list) {
        this.zzn = list;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbtu zzr() {
        return this.zzm;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnx zzq() {
        return this.zzl;
    }

    final /* synthetic */ java.util.List zzp() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbiv zzo() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbkn zzn() {
        return this.zzg;
    }

    final /* synthetic */ java.util.concurrent.ScheduledExecutorService zzm() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbtt zzl() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzbkz
    public final com.google.android.libraries.places.internal.zzbku zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzK(com.google.android.libraries.places.internal.zzbsh zzbshVar) {
        this.zzB = null;
    }

    final /* synthetic */ java.lang.String zzJ() {
        return this.zzA;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcaf zzI() {
        return this.zzz;
    }

    final /* synthetic */ void zzH(com.google.android.libraries.places.internal.zzbio zzbioVar) {
        this.zzy = zzbioVar;
    }

    final /* synthetic */ void zzG(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zzx = zzbnpVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zzF() {
        return this.zzx;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjo zzE() {
        return this.zzw;
    }

    final /* synthetic */ void zzD(com.google.android.libraries.places.internal.zzbwd zzbwdVar) {
        this.zzv = zzbwdVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbwd zzC() {
        return this.zzv;
    }

    final /* synthetic */ void zzB(com.google.android.libraries.places.internal.zzbqa zzbqaVar) {
        this.zzu = null;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbqa zzA() {
        return this.zzu;
    }
}
