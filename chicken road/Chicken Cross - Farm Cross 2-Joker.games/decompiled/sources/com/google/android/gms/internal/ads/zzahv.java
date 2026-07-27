package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhbf zzb = zzhbf.zzb(0, 2, 1);
    private static final zzhbf zzc = zzhbf.zzc(0, 2, 1, 3, 4);
    private static final zzhbf zzd = zzhbf.zzd(0, 2, 1, 5, 3, 4);
    private static final zzhbf zze = zzhbf.zze(0, 2, 1, 6, 5, 3, 4);
    private static final zzhbf zzf = zzhbf.zze(0, 2, 1, 7, 5, 6, 3, 4);

    public static zzhbf zza(int i) {
        if (i == 3) {
            return zzb;
        }
        if (i == 5) {
            return zzc;
        }
        if (i == 6) {
            return zzd;
        }
        if (i == 7) {
            return zze;
        }
        if (i != 8) {
            return null;
        }
        return zzf;
    }

    public static zzap zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzfm.zza;
            String[] split = str.split(U3.j.b, 2);
            if (split.length != 2) {
                String.valueOf(str);
                zzeh.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzajn.zzb(new zzeu(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzeh.zzd("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzakj(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }
}
