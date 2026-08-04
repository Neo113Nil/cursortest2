package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class zzazb {
    private final int zza;
    private final zzayy zzb = new zzazd();

    public zzazb(int i7) {
        this.zza = i7;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            sb.append(((String) arrayList.get(i7)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzaza zzazaVar = new zzaza();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzayz(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzazc.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzazg.zzc(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazaVar.zzb.write(this.zzb.zzb(((zzazf) it.next()).zzb));
            } catch (IOException e7) {
                int i8 = J.f3546b;
                j.e("Error while writing hash to byteStream", e7);
            }
        }
        return zzazaVar.toString();
    }
}
