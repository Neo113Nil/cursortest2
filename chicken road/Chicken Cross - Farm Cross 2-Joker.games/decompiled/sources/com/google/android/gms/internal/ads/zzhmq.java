package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhmq extends zzicu {
    public static final zzico zza(zzidl zzidlVar) throws IOException {
        String str;
        int zzm = zzidlVar.zzm();
        zzico zzc = zzc(zzidlVar, zzm);
        if (zzc == null) {
            return zzb(zzidlVar, zzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzidlVar.zzf()) {
                if (zzc instanceof zzicq) {
                    str = zzidlVar.zzh();
                    if (!zzhms.zza(str)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    str = null;
                }
                int zzm2 = zzidlVar.zzm();
                zzico zzc2 = zzc(zzidlVar, zzm2);
                zzico zzb = zzc2 == null ? zzb(zzidlVar, zzm2) : zzc2;
                if (zzc instanceof zzicn) {
                    ((zzicn) zzc).zza(zzb);
                } else {
                    zzicq zzicqVar = (zzicq) zzc;
                    if (zzicqVar.zzc(str)) {
                        String.valueOf(str);
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    zzicqVar.zza(str, zzb);
                }
                if (zzc2 != null) {
                    arrayDeque.addLast(zzc);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzc = zzb;
                } else {
                    continue;
                }
            } else {
                if (zzc instanceof zzicn) {
                    zzidlVar.zzc();
                } else {
                    zzidlVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzc;
                }
                zzc = (zzico) arrayDeque.removeLast();
            }
        }
    }

    private static final zzico zzb(zzidl zzidlVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String zzi = zzidlVar.zzi();
            if (zzhms.zza(zzi)) {
                return new zzics(zzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new zzics(new zzhmr(zzidlVar.zzi()));
        }
        if (i2 == 7) {
            return new zzics(Boolean.valueOf(zzidlVar.zzj()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzidm.zza(i)));
        }
        zzidlVar.zzk();
        return zzicp.zza;
    }

    @Nullable
    private static final zzico zzc(zzidl zzidlVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzidlVar.zzb();
            return new zzicn();
        }
        if (i2 != 2) {
            return null;
        }
        zzidlVar.zzd();
        return new zzicq();
    }
}
