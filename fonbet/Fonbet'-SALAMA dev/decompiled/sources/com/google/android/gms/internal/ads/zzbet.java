package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbet extends zzbfb {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int rgb = Color.rgb(12, 174, 206);
        zzc = rgb;
        zza = Color.rgb(204, 204, 204);
        zzb = rgb;
    }

    public zzbet(String str, List list, Integer num, Integer num2, Integer num3, int i7, int i8, boolean z4) {
        this.zzd = str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzbew zzbewVar = (zzbew) list.get(i9);
            this.zze.add(zzbewVar);
            this.zzf.add(zzbewVar);
        }
        this.zzg = num != null ? num.intValue() : zza;
        this.zzh = num2 != null ? num2.intValue() : zzb;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i7;
        this.zzk = i8;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}
