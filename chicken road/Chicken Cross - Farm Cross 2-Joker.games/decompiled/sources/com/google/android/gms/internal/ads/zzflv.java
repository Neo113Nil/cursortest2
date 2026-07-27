package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzflv {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfw zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbmk zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcl zzl;
    private zzbst zzn;
    private zzeua zzr;
    private Bundle zzt;
    private JSONArray zzw;
    private com.google.android.gms.ads.internal.client.zzcp zzx;
    private int zzm = 1;
    private final zzflj zzo = new zzflj();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final zzflv zzA(zzflw zzflwVar) {
        this.zzo.zza(zzflwVar.zzp.zza);
        this.zza = zzflwVar.zzd;
        this.zzb = zzflwVar.zzf;
        this.zzx = zzflwVar.zzx;
        this.zzc = zzflwVar.zzg;
        this.zzd = zzflwVar.zza;
        this.zzf = zzflwVar.zzh;
        this.zzg = zzflwVar.zzi;
        this.zzh = zzflwVar.zzj;
        this.zzi = zzflwVar.zzk;
        zzs(zzflwVar.zzm);
        zzr(zzflwVar.zzn);
        this.zzp = zzflwVar.zzq;
        this.zzq = zzflwVar.zzr;
        this.zzr = zzflwVar.zzc;
        this.zzs = zzflwVar.zzs;
        this.zzt = zzflwVar.zzt;
        this.zzu.set(zzflwVar.zzu.get());
        this.zzv = zzflwVar.zzv;
        this.zzw = zzflwVar.zzw;
        return this;
    }

    public final zzflw zzB() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzflw(this, null);
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

    final /* synthetic */ String zzG() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfw zzH() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzI() {
        return this.zze;
    }

    final /* synthetic */ ArrayList zzJ() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzK() {
        return this.zzg;
    }

    final /* synthetic */ zzbmk zzL() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzM() {
        return this.zzi;
    }

    final /* synthetic */ AdManagerAdViewOptions zzN() {
        return this.zzj;
    }

    final /* synthetic */ PublisherAdViewOptions zzO() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcl zzP() {
        return this.zzl;
    }

    final /* synthetic */ int zzQ() {
        return this.zzm;
    }

    final /* synthetic */ zzbst zzR() {
        return this.zzn;
    }

    final /* synthetic */ zzflj zzS() {
        return this.zzo;
    }

    final /* synthetic */ boolean zzT() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzU() {
        return this.zzq;
    }

    final /* synthetic */ zzeua zzV() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzW() {
        return this.zzs;
    }

    final /* synthetic */ Bundle zzX() {
        return this.zzt;
    }

    final /* synthetic */ AtomicLong zzY() {
        return this.zzu;
    }

    final /* synthetic */ boolean zzZ() {
        return this.zzv;
    }

    public final zzflv zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    final /* synthetic */ JSONArray zzaa() {
        return this.zzw;
    }

    public final zzflv zzab(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zzx = zzcpVar;
        return this;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcp zzac() {
        return this.zzx;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzflv zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzflv zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzflv zze(boolean z) {
        this.zzq = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzflv zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzflv zzi(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        this.zzd = zzfwVar;
        return this;
    }

    public final zzflj zzj() {
        return this.zzo;
    }

    public final zzflv zzk(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzflv zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final zzflv zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzflv zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzflv zzo(zzbmk zzbmkVar) {
        this.zzh = zzbmkVar;
        return this;
    }

    public final zzflv zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzflv zzq(zzbst zzbstVar) {
        this.zzn = zzbstVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfw(false, true, false);
        return this;
    }

    public final zzflv zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzflv zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzflv zzt(zzeua zzeuaVar) {
        this.zzr = zzeuaVar;
        return this;
    }

    public final zzflv zzu(boolean z) {
        this.zzs = true;
        return this;
    }

    public final zzflv zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzflv zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzflv zzy(boolean z) {
        this.zzv = true;
        return this;
    }

    public final zzflv zzz(JSONArray jSONArray) {
        this.zzw = jSONArray;
        return this;
    }
}
