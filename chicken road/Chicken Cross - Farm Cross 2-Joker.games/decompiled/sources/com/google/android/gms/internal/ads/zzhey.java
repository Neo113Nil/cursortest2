package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhey {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhew) it.next()).zzd(false);
        }
    }

    public final zzhey zza(zzhew zzhewVar) {
        if (zzhewVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhewVar.zzc()) {
            zzc();
        }
        zzhewVar.zzi(this);
        this.zza.add(zzhewVar);
        return this;
    }

    public final zzhfd zzb() throws GeneralSecurityException {
        zzhex zzhexVar;
        int i;
        zzhez zzhezVar;
        zzhex zzhexVar2;
        zzhex zzhexVar3;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        List<zzhew> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            zzhex zzg = ((zzhew) list.get(i2)).zzg();
            zzhexVar2 = zzhex.zza;
            if (zzg == zzhexVar2) {
                zzhex zzg2 = ((zzhew) list.get(i3)).zzg();
                zzhexVar3 = zzhex.zza;
                if (zzg2 != zzhexVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhew zzhewVar : list) {
            zzhewVar.zze();
            if (zzhewVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzhex zzg3 = zzhewVar.zzg();
            zzhexVar = zzhex.zza;
            int i4 = 3;
            if (zzg3 == zzhexVar) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    int i5 = zzhpd.zza;
                    i = 0;
                    while (i == 0) {
                        byte[] zza = zzhov.zza(4);
                        i = (zza[3] & 255) | ((zza[0] & 255) << 24) | ((zza[c] & 255) << 16) | ((zza[2] & 255) << 8);
                    }
                }
            } else {
                zzhewVar.zzg();
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 31);
                sb.append("Id ");
                sb.append(i);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(valueOf);
            zzhes zzc = zzhnn.zza().zzc(zzhewVar.zzf(), c != zzhewVar.zzf().zza() ? null : valueOf);
            zzheu zze = zzhewVar.zze();
            zzheu zzheuVar = zzheu.zza;
            if (!zzheuVar.equals(zze)) {
                if (zzheu.zzb.equals(zze)) {
                    i4 = 4;
                } else {
                    if (!zzheu.zzc.equals(zze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            boolean zzc2 = zzhewVar.zzc();
            zzhezVar = zzhfb.zza;
            zzhfb zzhfbVar = new zzhfb(zzc, i4, i, zzc2, false, zzhezVar, null);
            if (zzhewVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhewVar.zze() != zzheuVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzhfbVar);
            c = 1;
        }
        if (num != null) {
            return zzhfd.zzi(new zzhfd(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
