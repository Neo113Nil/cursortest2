package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaha {
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
            String str2 = zzfm.zza;
            String str3 = group;
            int parseInt = Integer.parseInt(group, 16);
            String group2 = matcher.group(2);
            String str4 = group2;
            int parseInt2 = Integer.parseInt(group2, 16);
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

    public final boolean zza(zzap zzapVar) {
        zzgxm zze = zzapVar.zze(zzajt.class, zzagz.zza);
        int size = zze.size();
        int i = 0;
        while (i < size) {
            boolean zzc2 = zzc(((zzajt) zze.get(i)).zzc);
            i++;
            if (zzc2) {
                return true;
            }
        }
        zzgxm zze2 = zzapVar.zze(zzakb.class, zzagy.zza);
        int size2 = zze2.size();
        int i2 = 0;
        while (i2 < size2) {
            boolean zzc3 = zzc(((zzakb) zze2.get(i2)).zzc);
            i2++;
            if (zzc3) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
