package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgjl extends zzgka {
    private final Context zza;

    zzgjl(zzaya zzayaVar, zzgiw zzgiwVar, Context context, zzgrh zzgrhVar) {
        super("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", zzayaVar, zzgiwVar, zzgrhVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzayaVar) {
            zzayaVar.zzO(((Integer) objArr2[0]).intValue());
            int i = 1;
            zzayaVar.zzd(((Integer) objArr2[1]).intValue());
            zzayaVar.zze(((Integer) objArr2[2]).intValue());
            zzayaVar.zzab(((Integer) objArr2[3]).intValue());
            Boolean bool = (Boolean) objArr2[4];
            if (bool == null) {
                zzayaVar.zzaf(3);
            } else {
                zzayaVar.zzaf(true != bool.booleanValue() ? 1 : 2);
            }
            Boolean bool2 = (Boolean) objArr2[5];
            if (bool2 == null) {
                zzayaVar.zzae(3);
            } else {
                if (true == bool2.booleanValue()) {
                    i = 2;
                }
                zzayaVar.zzae(i);
            }
        }
    }
}
