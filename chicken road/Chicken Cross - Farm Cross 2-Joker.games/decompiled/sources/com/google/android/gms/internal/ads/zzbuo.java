package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbuo implements zzbtf, zzbun {
    private final zzbun zza;
    private final HashSet zzb = new HashSet();

    public zzbuo(zzbun zzbunVar) {
        this.zza = zzbunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf, com.google.android.gms.internal.ads.zzbtq
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            String obj = ((zzbqh) simpleEntry.getValue()).toString();
            String.valueOf(obj);
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(obj)));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbqh) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzm(String str, zzbqh zzbqhVar) {
        this.zza.zzm(str, zzbqhVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbqhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzn(String str, zzbqh zzbqhVar) {
        this.zza.zzn(str, zzbqhVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbqhVar));
    }
}
