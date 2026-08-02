package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzkl {
    private static long zzc(zziv<?> zzivVar) {
        long j = 8;
        if (!(zzivVar instanceof zziq) && !(zzivVar instanceof zziy)) {
            if (zzivVar instanceof zzic) {
                j = 4;
            } else {
                if (!(zzivVar instanceof zzji)) {
                    String valueOf = String.valueOf(zzivVar.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("Unknown leaf node type: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                j = ((String) zzivVar.getValue()).length() + 2;
            }
        }
        return zzivVar.zzfl().isEmpty() ? j : j + 24 + zzc((zziv) zzivVar.zzfl());
    }

    public static long zzn(zzja zzjaVar) {
        if (zzjaVar.isEmpty()) {
            return 4L;
        }
        if (zzjaVar.zzfk()) {
            return zzc((zziv) zzjaVar);
        }
        long j = 1;
        Iterator<zziz> it = zzjaVar.iterator();
        while (it.hasNext()) {
            j = j + r5.zzge().zzfg().length() + 4 + zzn(it.next().zzd());
        }
        return !zzjaVar.zzfl().isEmpty() ? j + 12 + zzc((zziv) zzjaVar.zzfl()) : j;
    }

    public static int zzo(zzja zzjaVar) {
        int i = 0;
        if (zzjaVar.isEmpty()) {
            return 0;
        }
        if (zzjaVar.zzfk()) {
            return 1;
        }
        Iterator<zziz> it = zzjaVar.iterator();
        while (it.hasNext()) {
            i += zzo(it.next().zzd());
        }
        return i;
    }
}
