package com.google.android.recaptcha.internal;

import B6.c;
import D6.C;
import D6.E;
import P6.b;
import android.content.Context;
import g6.C1166o;
import g6.C1173v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import t6.h;

/* loaded from: classes.dex */
public final class zzdk implements zzdg {
    private static Timer zza;
    private final Context zzb;
    private final zzdl zzc;
    private final C zzd;
    private final zzda zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzdk(Context context, zzdl zzdlVar, C c3) {
        zzda zzdaVar;
        this.zzb = context;
        this.zzc = zzdlVar;
        this.zzd = c3;
        zzda zzdaVar2 = null;
        Object[] objArr = 0;
        try {
            zzdaVar = zzda.zzd;
            zzdaVar = zzdaVar == null ? new zzda(context, objArr == true ? 1 : 0) : zzdaVar;
            zzda.zzd = zzdaVar;
            zzdaVar2 = zzdaVar;
        } catch (Exception unused) {
        }
        this.zze = zzdaVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        Iterator it;
        zzda zzdaVar;
        zzre zzk;
        int zzL;
        int i7;
        zzda zzdaVar2 = this.zze;
        if (zzdaVar2 != null) {
            List zzd = zzdaVar2.zzd();
            h.e(zzd, "<this>");
            if (zzd instanceof RandomAccess) {
                int size = zzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i8 = 0; i8 >= 0 && i8 < size; i8 += 20) {
                    int i9 = size - i8;
                    if (20 <= i9) {
                        i9 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i9);
                    for (int i10 = 0; i10 < i9; i10++) {
                        arrayList2.add(zzd.get(i10 + i8));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it2 = zzd.iterator();
                h.e(it2, "iterator");
                if (it2.hasNext()) {
                    C1173v c1173v = new C1173v(it2, null);
                    c cVar = new c();
                    cVar.f1205c = b.i(cVar, cVar, c1173v);
                    it = cVar;
                } else {
                    it = C1166o.f13301a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            for (List<zzdb> list : arrayList) {
                zzor zzi = zzos.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzdb zzdbVar : list) {
                    try {
                        zzk = zzre.zzk(zzhz.zzg().zzj(zzdbVar.zzc()));
                        zzL = zzk.zzL();
                        i7 = zzL - 1;
                    } catch (Exception unused) {
                        zzda zzdaVar3 = this.zze;
                        if (zzdaVar3 != null) {
                            zzdaVar3.zzf(zzdbVar);
                        }
                    }
                    if (zzL == 0) {
                        throw null;
                    }
                    if (i7 == 0) {
                        zzi.zzp(zzk.zzf());
                    } else if (i7 == 1) {
                        zzi.zzq(zzk.zzg());
                    }
                    arrayList3.add(zzdbVar);
                }
                if (zzi.zze() + zzi.zzd() != 0) {
                    if (this.zzc.zza(((zzos) zzi.zzj()).zzd()) && (zzdaVar = this.zze) != null) {
                        zzdaVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzdh(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzdg
    public final void zza(zzre zzreVar) {
        E.p(this.zzd, new zzdj(this, zzreVar, null));
        zzh();
    }
}
