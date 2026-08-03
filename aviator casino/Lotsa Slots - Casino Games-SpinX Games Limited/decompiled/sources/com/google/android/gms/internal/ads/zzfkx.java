package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfkx {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private java.lang.String zzc;
    private com.google.android.gms.ads.internal.client.zzfw zzd;
    private boolean zze;
    private java.util.ArrayList zzf;
    private java.util.ArrayList zzg;
    private com.google.android.gms.internal.ads.zzblt zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private com.google.android.gms.ads.formats.AdManagerAdViewOptions zzj;
    private com.google.android.gms.ads.formats.PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcl zzl;
    private com.google.android.gms.internal.ads.zzbsb zzn;
    private com.google.android.gms.internal.ads.zzetc zzr;
    private android.os.Bundle zzt;
    private org.json.JSONArray zzw;
    private com.google.android.gms.ads.internal.client.zzcp zzx;
    private int zzm = 1;
    private final com.google.android.gms.internal.ads.zzfkl zzo = new com.google.android.gms.internal.ads.zzfkl();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final java.util.concurrent.atomic.AtomicLong zzu = new java.util.concurrent.atomic.AtomicLong();
    private boolean zzv = false;

    public final com.google.android.gms.internal.ads.zzfkx zzA(com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        this.zzo.zza(zzfkyVar.zzp.zza);
        this.zza = zzfkyVar.zzd;
        this.zzb = zzfkyVar.zzf;
        this.zzx = zzfkyVar.zzx;
        this.zzc = zzfkyVar.zzg;
        this.zzd = zzfkyVar.zza;
        this.zzf = zzfkyVar.zzh;
        this.zzg = zzfkyVar.zzi;
        this.zzh = zzfkyVar.zzj;
        this.zzi = zzfkyVar.zzk;
        zzs(zzfkyVar.zzm);
        zzr(zzfkyVar.zzn);
        this.zzp = zzfkyVar.zzq;
        this.zzq = zzfkyVar.zzr;
        this.zzr = zzfkyVar.zzc;
        this.zzs = zzfkyVar.zzs;
        this.zzt = zzfkyVar.zzt;
        this.zzu.set(zzfkyVar.zzu.get());
        this.zzv = zzfkyVar.zzv;
        this.zzw = zzfkyVar.zzw;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfky zzB() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new com.google.android.gms.internal.ads.zzfky(this, null);
    }

    public final boolean zzC() {
        return this.zzp;
    }

    public final boolean zzD() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzE() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzF() {
        return this.zzb;
    }

    final /* synthetic */ java.lang.String zzG() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfw zzH() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzI() {
        return this.zze;
    }

    final /* synthetic */ java.util.ArrayList zzJ() {
        return this.zzf;
    }

    final /* synthetic */ java.util.ArrayList zzK() {
        return this.zzg;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzblt zzL() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzM() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.AdManagerAdViewOptions zzN() {
        return this.zzj;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.PublisherAdViewOptions zzO() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcl zzP() {
        return this.zzl;
    }

    final /* synthetic */ int zzQ() {
        return this.zzm;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbsb zzR() {
        return this.zzn;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfkl zzS() {
        return this.zzo;
    }

    final /* synthetic */ boolean zzT() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzU() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzetc zzV() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzW() {
        return this.zzs;
    }

    final /* synthetic */ android.os.Bundle zzX() {
        return this.zzt;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicLong zzY() {
        return this.zzu;
    }

    final /* synthetic */ boolean zzZ() {
        return this.zzv;
    }

    public final com.google.android.gms.internal.ads.zzfkx zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    final /* synthetic */ org.json.JSONArray zzaa() {
        return this.zzw;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzab(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zzx = zzcpVar;
        return this;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcp zzac() {
        return this.zzx;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zze(boolean z) {
        this.zzq = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzg(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    public final java.lang.String zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzi(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        this.zzd = zzfwVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkl zzj() {
        return this.zzo;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzk(boolean z) {
        this.zze = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzm(java.util.ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzn(java.util.ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzo(com.google.android.gms.internal.ads.zzblt zzbltVar) {
        this.zzh = zzbltVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzq(com.google.android.gms.internal.ads.zzbsb zzbsbVar) {
        this.zzn = zzbsbVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfw(false, true, false);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzr(com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzs(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzt(com.google.android.gms.internal.ads.zzetc zzetcVar) {
        this.zzr = zzetcVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzu(boolean z) {
        this.zzs = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzv(android.os.Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final com.google.android.gms.internal.ads.zzfkx zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzy(boolean z) {
        this.zzv = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfkx zzz(org.json.JSONArray jSONArray) {
        this.zzw = jSONArray;
        return this;
    }
}
