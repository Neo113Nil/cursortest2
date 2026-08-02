package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class zzhd implements Runnable {
    private final /* synthetic */ ArrayList zzpf;
    private final /* synthetic */ zzhc zzpg;

    zzhd(zzhc zzhcVar, ArrayList arrayList) {
        this.zzpg = zzhcVar;
        this.zzpf = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhz zzhzVar;
        zzhz zzhzVar2;
        ArrayList arrayList = this.zzpf;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zzgy zzgyVar = (zzgy) obj;
            zzhzVar = this.zzpg.zzbs;
            if (zzhzVar.zzfa()) {
                zzhzVar2 = this.zzpg.zzbs;
                String valueOf = String.valueOf(zzgyVar.toString());
                zzhzVar2.zza(valueOf.length() != 0 ? "Raising ".concat(valueOf) : new String("Raising "), null, new Object[0]);
            }
            zzgyVar.zzdr();
        }
    }
}
