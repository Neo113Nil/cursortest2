package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzawm extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzawm zzr;
    private static volatile com.google.android.libraries.places.internal.zzbff zzs;
    private int zzb;
    private com.google.android.libraries.places.internal.zzawj zzf;
    private com.google.android.libraries.places.internal.zzawl zzg;
    private com.google.android.libraries.places.internal.zzbht zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private boolean zzq;
    private java.lang.String zze = "";
    private com.google.android.libraries.places.internal.zzbea zzh = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzi = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private java.lang.String zzj = "";
    private java.lang.String zzk = "";
    private java.lang.String zzo = "";

    static {
        com.google.android.libraries.places.internal.zzawm zzawmVar = new com.google.android.libraries.places.internal.zzawm();
        zzr = zzawmVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzawm.class, zzawmVar);
    }

    private zzawm() {
    }

    public static com.google.android.libraries.places.internal.zzawh zza() {
        return (com.google.android.libraries.places.internal.zzawh) zzr.zzbv();
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zze = str;
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzawj zzawjVar) {
        this.zzf = zzawjVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(com.google.android.libraries.places.internal.zzawl zzawlVar) {
        this.zzg = zzawlVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzh;
        if (!zzbeaVar.zza()) {
            this.zzh = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        this.zzh.add(str);
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzi;
        if (!zzbeaVar.zza()) {
            this.zzi = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        this.zzi.add(str);
    }

    final /* synthetic */ void zzi(java.lang.String str) {
        this.zzj = str;
    }

    final /* synthetic */ void zzk(com.google.android.libraries.places.internal.zzbht zzbhtVar) {
        this.zzl = zzbhtVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzm(java.lang.String str) {
        this.zzo = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzr, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ț\u0005Ț\u0006Ȉ\u0007Ȉ\bဉ\u0002\t\u0004\n\u0007\u000bȈ\f\u0007\r\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzawm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzawh(bArr);
        }
        if (i2 == 5) {
            return zzr;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzs;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzawm.class) {
            zzbffVar = zzs;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzr);
                zzs = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zzp = true;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzj(java.lang.String str) {
        this.zzk = str;
    }

    public static com.google.android.libraries.places.internal.zzawm zzc() {
        return zzr;
    }
}
