package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdw {
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.Map zzb = new java.util.HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzhdu) it.next()).zzd(false);
        }
    }

    public final com.google.android.gms.internal.ads.zzhdw zza(com.google.android.gms.internal.ads.zzhdu zzhduVar) {
        if (zzhduVar.zzh() != null) {
            throw new java.lang.IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhduVar.zzc()) {
            zzc();
        }
        zzhduVar.zzi(this);
        this.zza.add(zzhduVar);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzheb zzb() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhdv zzhdvVar;
        int i;
        com.google.android.gms.internal.ads.zzhdx zzhdxVar;
        com.google.android.gms.internal.ads.zzhdv zzhdvVar2;
        com.google.android.gms.internal.ads.zzhdv zzhdvVar3;
        if (this.zzc) {
            throw new java.security.GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        java.util.List<com.google.android.gms.internal.ads.zzhdu> list = this.zza;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            com.google.android.gms.internal.ads.zzhdv zzg = ((com.google.android.gms.internal.ads.zzhdu) list.get(i2)).zzg();
            zzhdvVar2 = com.google.android.gms.internal.ads.zzhdv.zza;
            if (zzg == zzhdvVar2) {
                com.google.android.gms.internal.ads.zzhdv zzg2 = ((com.google.android.gms.internal.ads.zzhdu) list.get(i3)).zzg();
                zzhdvVar3 = com.google.android.gms.internal.ads.zzhdv.zza;
                if (zzg2 != zzhdvVar3) {
                    throw new java.security.GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        byte[] bArr = null;
        java.lang.Integer num = null;
        for (com.google.android.gms.internal.ads.zzhdu zzhduVar : list) {
            zzhduVar.zze();
            if (zzhduVar.zzg() == null) {
                throw new java.security.GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            com.google.android.gms.internal.ads.zzhdv zzg3 = zzhduVar.zzg();
            zzhdvVar = com.google.android.gms.internal.ads.zzhdv.zza;
            int i4 = 3;
            if (zzg3 == zzhdvVar) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(java.lang.Integer.valueOf(i))) {
                        break;
                    }
                    int i5 = com.google.android.gms.internal.ads.zzhnz.zza;
                    i = 0;
                    while (i == 0) {
                        byte[] zza = com.google.android.gms.internal.ads.zzhnp.zza(4);
                        i = (zza[3] & 255) | ((zza[0] & 255) << 24) | ((zza[c] & 255) << 16) | ((zza[2] & 255) << 8);
                    }
                }
            } else {
                zzhduVar.zzg();
                i = 0;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 31);
                sb.append("Id ");
                sb.append(i);
                sb.append(" is used twice in the keyset");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            hashSet.add(valueOf);
            com.google.android.gms.internal.ads.zzhdq zzc = com.google.android.gms.internal.ads.zzhmi.zza().zzc(zzhduVar.zzf(), c != zzhduVar.zzf().zza() ? null : valueOf);
            com.google.android.gms.internal.ads.zzhds zze = zzhduVar.zze();
            com.google.android.gms.internal.ads.zzhds zzhdsVar = com.google.android.gms.internal.ads.zzhds.zza;
            if (!zzhdsVar.equals(zze)) {
                if (com.google.android.gms.internal.ads.zzhds.zzb.equals(zze)) {
                    i4 = 4;
                } else {
                    if (!com.google.android.gms.internal.ads.zzhds.zzc.equals(zze)) {
                        throw new java.lang.IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            boolean zzc2 = zzhduVar.zzc();
            zzhdxVar = com.google.android.gms.internal.ads.zzhdz.zza;
            com.google.android.gms.internal.ads.zzhdz zzhdzVar = new com.google.android.gms.internal.ads.zzhdz(zzc, i4, i, zzc2, false, zzhdxVar, null);
            if (zzhduVar.zzc()) {
                if (num != null) {
                    throw new java.security.GeneralSecurityException("Two primaries were set");
                }
                if (zzhduVar.zze() != zzhdsVar) {
                    throw new java.security.GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzhdzVar);
            c = 1;
        }
        if (num != null) {
            return com.google.android.gms.internal.ads.zzheb.zzi(new com.google.android.gms.internal.ads.zzheb(arrayList, this.zzb, bArr));
        }
        throw new java.security.GeneralSecurityException("No primary was set");
    }
}
