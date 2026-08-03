package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzjt {
    public static final /* synthetic */ int zzA = 0;
    final android.content.Context zza;
    com.google.android.gms.internal.ads.zzdo zzb;
    com.google.android.gms.internal.ads.zzgub zzc;
    com.google.android.gms.internal.ads.zzgub zzd;
    com.google.android.gms.internal.ads.zzgub zze;
    com.google.android.gms.internal.ads.zzgub zzf;
    com.google.android.gms.internal.ads.zzgub zzg;
    com.google.android.gms.internal.ads.zzgta zzh;
    android.os.Looper zzi;
    int zzj;
    com.google.android.gms.internal.ads.zzd zzk;
    int zzl;
    boolean zzm;
    com.google.android.gms.internal.ads.zzni zzn;
    com.google.android.gms.internal.ads.zznh zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    java.lang.String zzx;
    boolean zzy;
    com.google.android.gms.internal.ads.zzjd zzz;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.String zza = com.google.android.gms.internal.ads.zzgss.zza(android.os.Build.DEVICE);
        if (zza.contains("emulator") || zza.contains("emu64a") || zza.contains("emu64x")) {
            return;
        }
        zza.contains("generic");
    }

    public zzjt(final android.content.Context context, final com.google.android.gms.internal.ads.zznf zznfVar) {
        com.google.android.gms.internal.ads.zzgub zzgubVar = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                int i = com.google.android.gms.internal.ads.zzjt.zzA;
                return com.google.android.gms.internal.ads.zznf.this;
            }
        };
        com.google.android.gms.internal.ads.zzgub zzgubVar2 = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzjn
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                int i = com.google.android.gms.internal.ads.zzjt.zzA;
                return new com.google.android.gms.internal.ads.zzwx(context, new com.google.android.gms.internal.ads.zzafu());
            }
        };
        com.google.android.gms.internal.ads.zzgub zzgubVar3 = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                int i = com.google.android.gms.internal.ads.zzjt.zzA;
                return new com.google.android.gms.internal.ads.zzaay(context);
            }
        };
        com.google.android.gms.internal.ads.zzjm zzjmVar = com.google.android.gms.internal.ads.zzjm.zza;
        com.google.android.gms.internal.ads.zzgub zzgubVar4 = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzjp
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                int i = com.google.android.gms.internal.ads.zzjt.zzA;
                return com.google.android.gms.internal.ads.zzabt.zzh(context);
            }
        };
        com.google.android.gms.internal.ads.zzjl zzjlVar = com.google.android.gms.internal.ads.zzjl.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzgubVar;
        this.zzd = zzgubVar2;
        this.zze = zzgubVar3;
        this.zzf = zzjmVar;
        this.zzg = zzgubVar4;
        this.zzh = zzjlVar;
        this.zzi = com.google.android.gms.internal.ads.zzfl.zzf();
        this.zzk = com.google.android.gms.internal.ads.zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = com.google.android.gms.internal.ads.zzni.zzc;
        this.zzo = com.google.android.gms.internal.ads.zznh.zza;
        this.zzz = new com.google.android.gms.internal.ads.zzjd(0.97f, 1.03f, 1000L, 1.0E-7f, com.google.android.gms.internal.ads.zzfl.zzs(20L), com.google.android.gms.internal.ads.zzfl.zzs(500L), 0.999f, null);
        this.zzb = com.google.android.gms.internal.ads.zzdo.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            int i = com.google.android.gms.internal.ads.zzjj.zza;
        }
        this.zzy = true;
    }
}
