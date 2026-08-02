package com.google.android.recaptcha.internal;

import g6.AbstractC1161j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzel {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(AbstractC1161j.N0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzrr) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzrr zzrrVar) {
        int zzQ = zzrrVar.zzQ();
        int i7 = zzQ - 1;
        if (zzQ == 0) {
            throw null;
        }
        switch (i7) {
            case 0:
                return this.zza.get(Integer.valueOf(zzrrVar.zzi()));
            case 1:
                return Boolean.valueOf(zzrrVar.zzO());
            case 2:
                byte[] zzl = zzrrVar.zzK().zzl();
                if (zzl.length == 1) {
                    return Byte.valueOf(zzl[0]);
                }
                throw new zzby(4, 6, null);
            case 3:
                String zzM = zzrrVar.zzM();
                if (zzM.length() == 1) {
                    return Character.valueOf(zzM.charAt(0));
                }
                throw new zzby(4, 6, null);
            case 4:
                int zzj = zzrrVar.zzj();
                if (zzj < -32768 || zzj > 32767) {
                    throw new zzby(4, 6, null);
                }
                return Short.valueOf((short) zzj);
            case 5:
                return Integer.valueOf(zzrrVar.zzk());
            case 6:
            case 8:
                throw new zzby(4, 6, null);
            case 7:
                return Long.valueOf(zzrrVar.zzJ());
            case 9:
                return Float.valueOf(zzrrVar.zzg());
            case 10:
                return Double.valueOf(zzrrVar.zzf());
            case 11:
                return zzrrVar.zzN();
            case 12:
                return null;
            default:
                throw new zzby(4, 5, null);
        }
    }

    public final Object zzb(int i7) {
        return this.zza.remove(Integer.valueOf(i7));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i7, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i7, Object obj) {
        this.zza.put(Integer.valueOf(i7), obj);
    }

    public final Class[] zzf(List list) {
        List zzh = zzh(list);
        ArrayList arrayList = new ArrayList(AbstractC1161j.N0(zzh));
        Iterator it = zzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzej.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
