package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.sentry.MeasurementUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
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

    public static zzako zza(String str) {
        boolean z4;
        if (str == null) {
            return null;
        }
        String zza = zzfsn.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzfwm zzm = zzfwm.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzfwn.zza(zzfyj.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        int i7 = -1;
        int i8 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z4 = false;
            }
            z4 = -1;
        } else {
            if (str2.equals("outside")) {
                z4 = true;
            }
            z4 = -1;
        }
        int i9 = z4 ? !z4 ? 1 : -2 : 2;
        zzfyh zzb = zzfyj.zzb(zze, zzm);
        if (zzb.isEmpty()) {
            zzfyh zzb2 = zzfyj.zzb(zzg, zzm);
            zzfyh zzb3 = zzfyj.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str3 = (String) zzfwn.zza(zzb2, "filled");
                int i10 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzfwn.zza(zzb3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i7 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i7 = 1;
                }
                if (i7 == 0) {
                    i7 = 2;
                } else if (i7 != 1) {
                    i8 = i10;
                    i7 = 1;
                } else {
                    i7 = 3;
                }
                i8 = i10;
            }
        } else {
            String str5 = (String) zzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(MeasurementUnit.NONE)) {
                i7 = 0;
            }
        }
        return new zzako(i7, i8, i9);
    }
}
