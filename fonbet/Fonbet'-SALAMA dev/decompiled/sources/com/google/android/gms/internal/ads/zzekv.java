package com.google.android.gms.internal.ads;

import I2.M;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class zzekv implements zzesh {
    private final zzesh zza;
    private final zzfba zzb;
    private final Context zzc;
    private final zzbyq zzd;

    public zzekv(zzemz zzemzVar, zzfba zzfbaVar, Context context, zzbyq zzbyqVar) {
        this.zza = zzemzVar;
        this.zzb = zzfbaVar;
        this.zzc = context;
        this.zzd = zzbyqVar;
    }

    public static /* synthetic */ zzekw zzc(zzekv zzekvVar, zzesq zzesqVar) {
        String str;
        boolean z4;
        String str2;
        float f7;
        int i7;
        int i8;
        int i9;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzekvVar.zzb.zze;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.f10777x;
        if (zzrVarArr != null) {
            str = null;
            boolean z7 = false;
            boolean z8 = false;
            z4 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z9 = zzrVar2.f10779z;
                if (!z9 && !z7) {
                    str = zzrVar2.f10771a;
                    z7 = true;
                }
                if (z9) {
                    if (z8) {
                        z8 = true;
                    } else {
                        z8 = true;
                        z4 = true;
                    }
                }
                if (z7 && z8) {
                    break;
                }
            }
        } else {
            str = zzrVar.f10771a;
            z4 = zzrVar.f10779z;
        }
        Resources resources = zzekvVar.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f7 = 0.0f;
            i7 = 0;
            i8 = 0;
        } else {
            zzbyq zzbyqVar = zzekvVar.zzd;
            f7 = displayMetrics.density;
            i8 = displayMetrics.widthPixels;
            i7 = displayMetrics.heightPixels;
            str2 = ((M) zzbyqVar.zzi()).o();
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr2 = zzrVar.f10777x;
        if (zzrVarArr2 != null) {
            boolean z10 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar3 : zzrVarArr2) {
                if (zzrVar3.f10779z) {
                    z10 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i10 = -1;
                    int i11 = zzrVar3.f10775e;
                    if (i11 != -1) {
                        i10 = i11;
                    } else if (f7 != 0.0f) {
                        i10 = (int) (zzrVar3.f10776f / f7);
                    }
                    sb.append(i10);
                    sb.append("x");
                    int i12 = -2;
                    int i13 = zzrVar3.f10772b;
                    if (i13 != -2) {
                        i12 = i13;
                    } else if (f7 != 0.0f) {
                        i12 = (int) (zzrVar3.f10773c / f7);
                    }
                    sb.append(i12);
                }
            }
            if (z10) {
                if (sb.length() != 0) {
                    i9 = 0;
                    sb.insert(0, "|");
                } else {
                    i9 = 0;
                }
                sb.insert(i9, "320x50");
            }
        }
        return new zzekw(zzrVar, str, z4, sb.toString(), f7, i8, i7, str2, zzekvVar.zzb.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return zzgbc.zzm(this.zza.zzb(), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzeku
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzekv.zzc(zzekv.this, (zzesq) obj);
            }
        }, zzbza.zzg);
    }
}
