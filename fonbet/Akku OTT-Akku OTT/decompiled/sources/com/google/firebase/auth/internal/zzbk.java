package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbk {
    @Nullable
    public static MultiFactorInfo zza(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahyVar.zze())) {
            String zzd = zzahyVar.zzd();
            String zzc = zzahyVar.zzc();
            long zza = zzahyVar.zza();
            String zze = zzahyVar.zze();
            C0875q.d(zze);
            return new PhoneMultiFactorInfo(zzd, zzc, zza, zze);
        }
        if (zzahyVar.zzb() == null) {
            return null;
        }
        String zzd2 = zzahyVar.zzd();
        String zzc2 = zzahyVar.zzc();
        long zza2 = zzahyVar.zza();
        zzaiz zzb = zzahyVar.zzb();
        C0875q.h(zzb, "totpInfo cannot be null.");
        return new TotpMultiFactorInfo(zzd2, zzc2, zza2, zzb);
    }

    public static List<MultiFactorInfo> zza(List<zzahy> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzahy> it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo zza = zza(it.next());
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
