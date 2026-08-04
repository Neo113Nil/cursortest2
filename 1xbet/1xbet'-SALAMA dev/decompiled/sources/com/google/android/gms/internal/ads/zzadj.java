package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
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
            String strGroup = matcher.group(1);
            int i7 = zzen.zza;
            int i8 = Integer.parseInt(strGroup, 16);
            int i9 = Integer.parseInt(matcher.group(2), 16);
            if (i8 <= 0 && i9 <= 0) {
                return false;
            }
            this.zza = i8;
            this.zzb = i9;
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
            zzau zzauVarZzb = zzavVar.zzb(i7);
            if (zzauVarZzb instanceof zzaga) {
                zzaga zzagaVar = (zzaga) zzauVarZzb;
                if ("iTunSMPB".equals(zzagaVar.zzb) && zzc(zzagaVar.zzc)) {
                    return true;
                }
            } else if (zzauVarZzb instanceof zzagh) {
                zzagh zzaghVar = (zzagh) zzauVarZzb;
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
