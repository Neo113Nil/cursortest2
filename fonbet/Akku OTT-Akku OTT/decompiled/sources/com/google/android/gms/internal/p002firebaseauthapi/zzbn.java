package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.compose.runtime.u;
import com.google.android.gms.internal.p002firebaseauthapi.zzxh;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbn {
    private final List<zzbq> zza = new ArrayList();
    private zzok zzb = zzok.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        Iterator<zzbq> it = this.zza.iterator();
        while (it.hasNext()) {
            it.next().zza = false;
        }
    }

    public final zzbn zza(zzbq zzbqVar) {
        if (zzbqVar.zze != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzbqVar.zza) {
            zzb();
        }
        zzbqVar.zze = this;
        this.zza.add(zzbqVar);
        return this;
    }

    public final zzbm zza() throws GeneralSecurityException {
        zzbm zzb;
        zzbp zzbpVar;
        int zza;
        zzbu zzbuVar;
        zzxh.zzb zzb2;
        zzbp zzbpVar2;
        zzbp zzbpVar3;
        if (!this.zzc) {
            this.zzc = true;
            zzxh.zza zzc = zzxh.zzc();
            ArrayList arrayList = new ArrayList(this.zza.size());
            List<zzbq> list = this.zza;
            for (int i = 0; i < list.size() - 1; i++) {
                zzbp zzbpVar4 = list.get(i).zzd;
                zzbpVar2 = zzbp.zza;
                if (zzbpVar4 == zzbpVar2) {
                    zzbp zzbpVar5 = list.get(i + 1).zzd;
                    zzbpVar3 = zzbp.zza;
                    if (zzbpVar5 != zzbpVar3) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzbq zzbqVar : this.zza) {
                if (zzbqVar.zzb != null) {
                    if (zzbqVar.zzd != null) {
                        zzbp zzbpVar6 = zzbqVar.zzd;
                        zzbpVar = zzbp.zza;
                        if (zzbpVar6 == zzbpVar) {
                            zza = 0;
                            while (true) {
                                if (zza != 0 && !hashSet.contains(Integer.valueOf(zza))) {
                                    break;
                                }
                                zza = zzqn.zza();
                            }
                        } else {
                            zza = zzbp.zza(zzbqVar.zzd);
                        }
                        int i2 = zza;
                        if (!hashSet.contains(Integer.valueOf(i2))) {
                            hashSet.add(Integer.valueOf(i2));
                            zzbi zza2 = zzop.zza().zza(zzbqVar.zzc, zzbqVar.zzc.zza() ? Integer.valueOf(i2) : null);
                            zzxc zza3 = zzbm.zza(zzbqVar.zzb);
                            boolean z = zzbqVar.zza;
                            zzbuVar = zzbs.zza;
                            zzbs zzbsVar = new zzbs(zza2, zza3, i2, z, false, zzbuVar);
                            zzb2 = zzbm.zzb(zza2, zzbm.zza(zzbqVar.zzb), i2);
                            zzc.zza(zzb2);
                            if (zzbqVar.zza) {
                                if (num == null) {
                                    num = Integer.valueOf(i2);
                                    if (zzbqVar.zzb != zzbk.zza) {
                                        throw new GeneralSecurityException("Primary key is not enabled");
                                    }
                                } else {
                                    throw new GeneralSecurityException("Two primaries were set");
                                }
                            }
                            arrayList.add(zzbsVar);
                        } else {
                            throw new GeneralSecurityException(u.a(i2, "Id ", " is used twice in the keyset"));
                        }
                    } else {
                        throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                    }
                } else {
                    throw new GeneralSecurityException("Key Status not set.");
                }
            }
            if (num != null) {
                zzc.zza(num.intValue());
                zzxh zzxhVar = (zzxh) ((zzalf) zzc.zze());
                zzbm.zzd(zzxhVar);
                zzb = zzbm.zzb(new zzbm(zzxhVar, arrayList, this.zzb));
                return zzb;
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
