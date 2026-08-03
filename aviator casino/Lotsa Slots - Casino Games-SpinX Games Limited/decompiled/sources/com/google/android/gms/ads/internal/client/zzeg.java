package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzeg {
    private java.lang.String zzg;
    private java.lang.String zzi;
    private java.lang.String zzj;
    private boolean zzl;
    private java.lang.String zzm;
    private long zzo;
    private final java.util.HashSet zza = new java.util.HashSet();
    private final android.os.Bundle zzb = new android.os.Bundle();
    private final java.util.HashMap zzc = new java.util.HashMap();
    private final java.util.HashSet zzd = new java.util.HashSet();
    private final android.os.Bundle zze = new android.os.Bundle();
    private final java.util.HashSet zzf = new java.util.HashSet();
    private final java.util.List zzh = new java.util.ArrayList();
    private int zzk = -1;
    private int zzn = 60000;

    final /* synthetic */ java.lang.String zzA() {
        return this.zzj;
    }

    final /* synthetic */ int zzB() {
        return this.zzk;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzl;
    }

    final /* synthetic */ java.lang.String zzD() {
        return this.zzm;
    }

    final /* synthetic */ int zzE() {
        return this.zzn;
    }

    final /* synthetic */ long zzF() {
        return this.zzo;
    }

    public final void zza(java.lang.String str) {
        this.zza.add(str);
    }

    public final void zzb(android.os.Bundle bundle) {
        this.zzb.putAll(bundle);
    }

    public final void zzc(java.lang.Class cls, android.os.Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    public final void zzd(java.lang.Class cls, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = this.zzb;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new android.os.Bundle());
        }
        android.os.Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void zze(java.lang.String str) {
        this.zzd.add(str);
    }

    public final void zzf(java.lang.String str) {
        this.zzd.remove(com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR);
    }

    public final void zzg(java.lang.String str) {
        this.zzg = str;
    }

    public final void zzh(java.util.List list) {
        java.util.List list2 = this.zzh;
        list2.clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (android.text.TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    public final void zzi(java.lang.String str) {
        this.zzi = str;
    }

    public final void zzj(java.lang.String str) {
        this.zzj = str;
    }

    @java.lang.Deprecated
    public final void zzk(boolean z) {
        this.zzk = z ? 1 : 0;
    }

    public final void zzl(java.lang.String str, java.lang.String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzm(java.lang.String str) {
        this.zzf.add(str);
    }

    @java.lang.Deprecated
    public final void zzn(boolean z) {
        this.zzl = z;
    }

    public final void zzo(java.lang.String str) {
        this.zzm = str;
    }

    public final void zzp(int i) {
        this.zzn = i;
    }

    public final void zzq(long j) {
        this.zzo = j;
    }

    final /* synthetic */ java.util.HashSet zzr() {
        return this.zza;
    }

    final /* synthetic */ android.os.Bundle zzs() {
        return this.zzb;
    }

    final /* synthetic */ java.util.HashMap zzt() {
        return this.zzc;
    }

    final /* synthetic */ java.util.HashSet zzu() {
        return this.zzd;
    }

    final /* synthetic */ android.os.Bundle zzv() {
        return this.zze;
    }

    final /* synthetic */ java.util.HashSet zzw() {
        return this.zzf;
    }

    final /* synthetic */ java.lang.String zzx() {
        return this.zzg;
    }

    final /* synthetic */ java.util.List zzy() {
        return this.zzh;
    }

    final /* synthetic */ java.lang.String zzz() {
        return this.zzi;
    }
}
