package com.google.android.recaptcha.internal;

import B6.c;
import D6.C;
import D6.E;
import P6.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import p050g6.o;
import p050g6.v;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzdk implements zzdg {
    private static Timer zza;
    private final Context zzb;
    private final zzdl zzc;
    private final C zzd;
    private final zzda zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzdk(Context context, zzdl zzdlVar, C c3) {
        this.zzb = context;
        this.zzc = zzdlVar;
        this.zzd = c3;
        zzda zzdaVar = null;
        Object[] objArr = 0;
        try {
            zzda zzdaVar2 = zzda.zzd;
            zzdaVar2 = zzdaVar2 == null ? new zzda(context, objArr == true ? 1 : 0) : zzdaVar2;
            zzda.zzd = zzdaVar2;
            zzdaVar = zzdaVar2;
        } catch (Exception unused) {
        }
        this.zze = zzdaVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        Iterator it;
        zzda zzdaVar;
        zzda zzdaVar2 = this.zze;
        if (zzdaVar2 != null) {
            List listZzd = zzdaVar2.zzd();
            h.e(listZzd, "<this>");
            if (listZzd instanceof RandomAccess) {
                int size = listZzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i7 = 0; i7 >= 0 && i7 < size; i7 += 20) {
                    int i8 = size - i7;
                    if (20 <= i8) {
                        i8 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i8);
                    for (int i9 = 0; i9 < i8; i9++) {
                        arrayList2.add(listZzd.get(i9 + i7));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it2 = listZzd.iterator();
                h.e(it2, "iterator");
                if (it2.hasNext()) {
                    v vVar = new v(it2, null);
                    c cVar = new c();
                    cVar.f1205c = b.i(cVar, cVar, vVar);
                    it = cVar;
                } else {
                    it = o.f13307a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            for (List<zzdb> list : arrayList) {
                zzor zzorVarZzi = zzos.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzdb zzdbVar : list) {
                    try {
                        zzre zzreVarZzk = zzre.zzk(zzhz.zzg().zzj(zzdbVar.zzc()));
                        int iZzL = zzreVarZzk.zzL();
                        int i10 = iZzL - 1;
                        if (iZzL == 0) {
                            throw null;
                        }
                        if (i10 == 0) {
                            zzorVarZzi.zzp(zzreVarZzk.zzf());
                        } else if (i10 == 1) {
                            zzorVarZzi.zzq(zzreVarZzk.zzg());
                        }
                        arrayList3.add(zzdbVar);
                    } catch (Exception unused) {
                        zzda zzdaVar3 = this.zze;
                        if (zzdaVar3 != null) {
                            zzdaVar3.zzf(zzdbVar);
                        }
                    }
                }
                if (zzorVarZzi.zze() + zzorVarZzi.zzd() != 0) {
                    if (this.zzc.zza(((zzos) zzorVarZzi.zzj()).zzd()) && (zzdaVar = this.zze) != null) {
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
