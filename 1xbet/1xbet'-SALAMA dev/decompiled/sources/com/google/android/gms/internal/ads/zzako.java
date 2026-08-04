package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.sentry.MeasurementUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class zzako {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfwm zze = zzfwm.zzp("auto", MeasurementUnit.NONE);
    private static final zzfwm zzf = zzfwm.zzq("dot", "sesame", "circle");
    private static final zzfwm zzg = zzfwm.zzp("filled", "open");
    private static final zzfwm zzh = zzfwm.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzako(int i7, int i8, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static zzako zza(String str) {
        byte b7;
        int i7;
        if (str == null) {
            return null;
        }
        String strZza = zzfsn.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzfwm zzfwmVarZzm = zzfwm.zzm(TextUtils.split(strZza, zzd));
        String str2 = (String) zzfwn.zza(zzfyj.zzb(zzh, zzfwmVarZzm), "outside");
        int iHashCode = str2.hashCode();
        int i8 = -1;
        int i9 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
        } else if (str2.equals("outside")) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            i7 = b7 != 1 ? 1 : -2;
        } else {
            i7 = 2;
        }
        zzfyh zzfyhVarZzb = zzfyj.zzb(zze, zzfwmVarZzm);
        if (zzfyhVarZzb.isEmpty()) {
            zzfyh zzfyhVarZzb2 = zzfyj.zzb(zzg, zzfwmVarZzm);
            zzfyh zzfyhVarZzb3 = zzfyj.zzb(zzf, zzfwmVarZzm);
            if (!zzfyhVarZzb2.isEmpty() || !zzfyhVarZzb3.isEmpty()) {
                String str3 = (String) zzfwn.zza(zzfyhVarZzb2, "filled");
                int i10 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzfwn.zza(zzfyhVarZzb3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i8 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i8 = 1;
                }
                if (i8 == 0) {
                    i8 = 2;
                } else if (i8 != 1) {
                    i9 = i10;
                    i8 = 1;
                } else {
                    i8 = 3;
                }
                i9 = i10;
            }
        } else {
            String str5 = (String) zzfyhVarZzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(MeasurementUnit.NONE)) {
                i8 = 0;
            }
        }
        return new zzako(i8, i9, i7);
    }
}
