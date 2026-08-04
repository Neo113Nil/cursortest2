package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzwv {
    public static final zzwv zza = new zzwv(new zzbo[0]);
    public final int zzb;
    private final zzfwh zzc;
    private int zzd;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
    }

    public zzwv(zzbo... zzboVarArr) {
        this.zzc = zzfwh.zzm(zzboVarArr);
        this.zzb = zzboVarArr.length;
        int i7 = 0;
        while (i7 < this.zzc.size()) {
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < this.zzc.size(); i9++) {
                if (((zzbo) this.zzc.get(i7)).equals(this.zzc.get(i9))) {
                    zzdq.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwv.class == obj.getClass()) {
            zzwv zzwvVar = (zzwv) obj;
            if (this.zzb == zzwvVar.zzb && this.zzc.equals(zzwvVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzd;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final int zza(zzbo zzboVar) {
        int iIndexOf = this.zzc.indexOf(zzboVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzbo zzb(int i7) {
        return (zzbo) this.zzc.get(i7);
    }

    public final zzfwh zzc() {
        return zzfwh.zzl(zzfwx.zzb(this.zzc, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzwu
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                zzwv zzwvVar = zzwv.zza;
                return Integer.valueOf(((zzbo) obj).zzc);
            }
        }));
    }
}
