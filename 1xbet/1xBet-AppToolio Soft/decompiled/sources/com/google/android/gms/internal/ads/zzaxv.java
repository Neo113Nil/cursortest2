package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;

/* loaded from: classes.dex */
public final class zzaxv extends zzbbo<zzaxv, zza> implements zzbcw {
    private static volatile zzbdf<zzaxv> zzakh;
    private static final zzaxv zzdmc = new zzaxv();
    private int zzdih;
    private zzaxx zzdmb;

    public static final class zza extends zzbbo.zza<zzaxv, zza> implements zzbcw {
        private zza() {
            super(zzaxv.zzdmc);
        }

        /* synthetic */ zza(zzaxw zzaxwVar) {
            this();
        }

        public final zza zzb(zzaxx zzaxxVar) {
            zzadh();
            ((zzaxv) this.zzdtx).zza(zzaxxVar);
            return this;
        }

        public final zza zzbe(int i) {
            zzadh();
            ((zzaxv) this.zzdtx).setVersion(0);
            return this;
        }
    }

    static {
        zzbbo.zza((Class<zzaxv>) zzaxv.class, zzdmc);
    }

    private zzaxv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaxx zzaxxVar) {
        if (zzaxxVar == null) {
            throw new NullPointerException();
        }
        this.zzdmb = zzaxxVar;
    }

    public static zzaxv zzaj(zzbah zzbahVar) throws zzbbu {
        return (zzaxv) zzbbo.zza(zzdmc, zzbahVar);
    }

    public static zza zzzz() {
        return (zza) ((zzbbo.zza) zzdmc.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbbo$zzb, com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxv>] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    protected final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxv> zzbdfVar;
        zzaxw zzaxwVar = null;
        switch (zzaxw.zzakf[i - 1]) {
            case 1:
                return new zzaxv();
            case 2:
                return new zza(zzaxwVar);
            case 3:
                return zza(zzdmc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzdih", "zzdmb"});
            case 4:
                return zzdmc;
            case 5:
                zzbdf<zzaxv> zzbdfVar2 = zzakh;
                zzbdf<zzaxv> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxv.class) {
                        zzbdf<zzaxv> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdmc);
                            zzakh = zzbVar;
                            zzbdfVar = zzbVar;
                        }
                    }
                    zzbdfVar3 = zzbdfVar;
                }
                return zzbdfVar3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzaxx zzzy() {
        zzaxx zzaxxVar = this.zzdmb;
        return zzaxxVar == null ? zzaxx.zzaac() : zzaxxVar;
    }
}
