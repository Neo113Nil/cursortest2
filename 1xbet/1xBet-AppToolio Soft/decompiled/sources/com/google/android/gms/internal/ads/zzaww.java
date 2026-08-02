package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;

/* loaded from: classes.dex */
public final class zzaww extends zzbbo<zzaww, zza> implements zzbcw {
    private static volatile zzbdf<zzaww> zzakh;
    private static final zzaww zzdjx = new zzaww();
    private int zzdju;
    private int zzdjv;
    private zzbah zzdjw = zzbah.zzdpq;

    public static final class zza extends zzbbo.zza<zzaww, zza> implements zzbcw {
        private zza() {
            super(zzaww.zzdjx);
        }

        /* synthetic */ zza(zzawx zzawxVar) {
            this();
        }
    }

    static {
        zzbbo.zza((Class<zzaww>) zzaww.class, zzdjx);
    }

    private zzaww() {
    }

    public static zzaww zzyk() {
        return zzdjx;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbbo$zzb, com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaww>] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    protected final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaww> zzbdfVar;
        zzawx zzawxVar = null;
        switch (zzawx.zzakf[i - 1]) {
            case 1:
                return new zzaww();
            case 2:
                return new zza(zzawxVar);
            case 3:
                return zza(zzdjx, "\u0000\u0003\u0000\u0000\u0001\u000b\u000b\f\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzdju", "zzdjv", "zzdjw"});
            case 4:
                return zzdjx;
            case 5:
                zzbdf<zzaww> zzbdfVar2 = zzakh;
                zzbdf<zzaww> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaww.class) {
                        zzbdf<zzaww> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdjx);
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

    public final zzawy zzyh() {
        zzawy zzat = zzawy.zzat(this.zzdju);
        return zzat == null ? zzawy.UNRECOGNIZED : zzat;
    }

    public final zzaxa zzyi() {
        zzaxa zzau = zzaxa.zzau(this.zzdjv);
        return zzau == null ? zzaxa.UNRECOGNIZED : zzau;
    }

    public final zzbah zzyj() {
        return this.zzdjw;
    }
}
