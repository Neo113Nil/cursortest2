package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaph implements zzanz {
    private final zzeu zza = new zzeu();

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzcy zzr;
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i2 + i);
        zzeuVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.zzd() > 0) {
            zzguk.zzb(zzeuVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int zzB = zzeuVar.zzB() - 8;
            if (zzeuVar.zzB() == 1987343459) {
                CharSequence charSequence = null;
                zzcx zzcxVar = null;
                while (zzB > 0) {
                    zzguk.zzb(zzB >= 8, "Incomplete vtt cue box header found.");
                    int zzB2 = zzeuVar.zzB();
                    int zzB3 = zzeuVar.zzB();
                    int i3 = zzB - 8;
                    int i4 = zzB2 - 8;
                    String zzk = zzfm.zzk(zzeuVar.zzi(), zzeuVar.zzg(), i4);
                    zzeuVar.zzk(i4);
                    if (zzB3 == 1937011815) {
                        zzcxVar = zzapq.zzb(zzk);
                    } else if (zzB3 == 1885436268) {
                        charSequence = zzapq.zzc(null, zzk.trim(), Collections.emptyList());
                    }
                    zzB = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcxVar != null) {
                    zzcxVar.zza(charSequence);
                    zzr = zzcxVar.zzr();
                } else {
                    Pattern pattern = zzapq.zza;
                    zzapp zzappVar = new zzapp();
                    zzappVar.zzc = charSequence;
                    zzr = zzappVar.zza().zzr();
                }
                arrayList.add(zzr);
            } else {
                zzeuVar.zzk(zzB);
            }
        }
        zzduVar.zza(new zzanr(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
