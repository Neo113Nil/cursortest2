package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgmn {
    private final Map zza;
    private final Map zzb;

    private zzgmn() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgmn zza(zzgmm zzgmmVar) throws GeneralSecurityException {
        if (zzgmmVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgmo zzgmoVar = new zzgmo(zzgmmVar.zzc(), zzgmmVar.zzd(), null);
        if (this.zza.containsKey(zzgmoVar)) {
            zzgmm zzgmmVar2 = (zzgmm) this.zza.get(zzgmoVar);
            if (!zzgmmVar2.equals(zzgmmVar) || !zzgmmVar.equals(zzgmmVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgmoVar.toString()));
            }
        } else {
            this.zza.put(zzgmoVar, zzgmmVar);
        }
        return this;
    }

    public final zzgmn zzb(zzgmv zzgmvVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzgmvVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzgmv zzgmvVar2 = (zzgmv) this.zzb.get(clsZzb);
            if (!zzgmvVar2.equals(zzgmvVar) || !zzgmvVar.equals(zzgmvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzgmvVar);
        }
        return this;
    }

    public final zzgmq zzc() {
        return new zzgmq(this, null);
    }

    public /* synthetic */ zzgmn(zzgmp zzgmpVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgmn(zzgmq zzgmqVar, zzgmp zzgmpVar) {
        this.zza = new HashMap(zzgmqVar.zza);
        this.zzb = new HashMap(zzgmqVar.zzb);
    }
}
