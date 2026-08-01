package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgxx extends zzgxs {
    public final zzgxx zzb(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder(U3.j.d);
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            zzgxh zzgxhVar = (zzgxh) zza().get(obj);
            if (zzgxhVar == null) {
                zzgxhVar = zzgxw.zzt(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                zza().put(obj, zzgxhVar);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgwi.zza(obj, next);
                zzgxhVar.zzd(next);
            }
        }
        return this;
    }

    public final zzgxz zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgxa.zza;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return zzgxa.zza;
        }
        zzgxo zzgxoVar = new zzgxo(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            zzgxw zzp = zzgxw.zzp(((zzgxv) entry.getValue()).zzh());
            if (!zzp.isEmpty()) {
                zzgxoVar.zza(key, zzp);
                i += zzp.size();
            }
        }
        return new zzgxz(zzgxoVar.zzc(), i, null);
    }
}
