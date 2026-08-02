package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzadj {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i7 = zzen.zza;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzav zzavVar) {
        for (int i7 = 0; i7 < zzavVar.zza(); i7++) {
            zzau zzb = zzavVar.zzb(i7);
            if (zzb instanceof zzaga) {
                zzaga zzagaVar = (zzaga) zzb;
                if ("iTunSMPB".equals(zzagaVar.zzb) && zzc(zzagaVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzagh) {
                zzagh zzaghVar = (zzagh) zzb;
                if ("com.apple.iTunes".equals(zzaghVar.zza) && "iTunSMPB".equals(zzaghVar.zzb) && zzc(zzaghVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
