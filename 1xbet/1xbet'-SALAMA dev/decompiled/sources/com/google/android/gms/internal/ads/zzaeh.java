package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzaeh {
    public static int zza(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i7 >>>= 1;
            i8++;
        }
        return i8;
    }

    public static zzav zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i8 = zzen.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzdq.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaft.zzb(new zzed(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    zzdq.zzg("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new zzagq(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzav(arrayList);
    }

    public static zzaee zzc(zzed zzedVar, boolean z4, boolean z7) throws zzaz {
        if (z4) {
            zzd(3, zzedVar, false);
        }
        String strZzB = zzedVar.zzB((int) zzedVar.zzs(), StandardCharsets.UTF_8);
        int length = strZzB.length();
        long jZzs = zzedVar.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i7 = 0; i7 < jZzs; i7++) {
            String strZzB2 = zzedVar.zzB((int) zzedVar.zzs(), StandardCharsets.UTF_8);
            strArr[i7] = strZzB2;
            length2 = length2 + 4 + strZzB2.length();
        }
        if (z7 && (zzedVar.zzm() & 1) == 0) {
            throw zzaz.zza("framing bit expected to be set", null);
        }
        return new zzaee(strZzB, strArr, length2 + 1);
    }

    public static boolean zzd(int i7, zzed zzedVar, boolean z4) throws zzaz {
        if (zzedVar.zzb() < 7) {
            if (z4) {
                return false;
            }
            throw zzaz.zza("too short header: " + zzedVar.zzb(), null);
        }
        if (zzedVar.zzm() != i7) {
            if (z4) {
                return false;
            }
            throw zzaz.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i7))), null);
        }
        if (zzedVar.zzm() == 118 && zzedVar.zzm() == 111 && zzedVar.zzm() == 114 && zzedVar.zzm() == 98 && zzedVar.zzm() == 105 && zzedVar.zzm() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw zzaz.zza("expected characters 'vorbis'", null);
    }
}
