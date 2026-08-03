package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzheb implements com.google.android.gms.internal.ads.zzhec {
    private final java.util.List zza;
    private final java.util.Map zzb;

    @javax.annotation.Nullable
    private final com.google.android.gms.internal.ads.zzheb zzc;

    private zzheb(java.util.List list, java.util.Map map) throws java.security.GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (com.google.android.gms.internal.ads.zzhkp.zza.zza()) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.zzhdz zzhdzVar = (com.google.android.gms.internal.ads.zzhdz) it.next();
                if (hashSet.contains(java.lang.Integer.valueOf(zzhdzVar.zzc()))) {
                    int zzc = zzhdzVar.zzc();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 121);
                    sb.append("KeyID ");
                    sb.append(zzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new java.security.GeneralSecurityException(sb.toString());
                }
                hashSet.add(java.lang.Integer.valueOf(zzhdzVar.zzc()));
                z |= zzhdzVar.zzd();
            }
            if (!z) {
                throw new java.security.GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private zzheb(java.util.List list, java.util.Map map, com.google.android.gms.internal.ads.zzheb zzhebVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhebVar;
    }

    /* synthetic */ zzheb(java.util.List list, java.util.Map map, byte[] bArr) {
        this(list, map);
    }

    static final com.google.android.gms.internal.ads.zzheb zza(com.google.android.gms.internal.ads.zzhsz zzhszVar) throws java.security.GeneralSecurityException {
        if (zzhszVar == null || zzhszVar.zzc() <= 0) {
            throw new java.security.GeneralSecurityException("empty keyset");
        }
        return new com.google.android.gms.internal.ads.zzheb(zzj(zzhszVar), new java.util.HashMap());
    }

    public static final com.google.android.gms.internal.ads.zzheb zzg(com.google.android.gms.internal.ads.zzheh zzhehVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhdw zzhdwVar = new com.google.android.gms.internal.ads.zzhdw();
        com.google.android.gms.internal.ads.zzhdu zzhduVar = new com.google.android.gms.internal.ads.zzhdu(zzhehVar, null);
        zzhduVar.zzb();
        zzhduVar.zza();
        zzhdwVar.zza(zzhduVar);
        return zzhdwVar.zzb();
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzheb zzi(final com.google.android.gms.internal.ads.zzheb zzhebVar) {
        final com.google.android.gms.internal.ads.zzhmc zzhmcVar = (com.google.android.gms.internal.ads.zzhmc) zzhebVar.zzf(com.google.android.gms.internal.ads.zzhmc.class);
        if (zzhmcVar == null) {
            return zzhebVar;
        }
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = new com.google.android.gms.internal.ads.zzhdx() { // from class: com.google.android.gms.internal.ads.zzhea
            @Override // com.google.android.gms.internal.ads.zzhdx
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzhdz zzhdzVar) {
                com.google.android.gms.internal.ads.zzhmm.zza().zzb().zza(com.google.android.gms.internal.ads.zzheb.this, zzhmcVar, "keyset_handle", "get_key");
            }
        };
        java.util.List<com.google.android.gms.internal.ads.zzhdz> list = zzhebVar.zza;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (com.google.android.gms.internal.ads.zzhdz zzhdzVar : list) {
            arrayList.add(new com.google.android.gms.internal.ads.zzhdz(zzhdzVar.zzf(), zzhdzVar.zzj(), zzhdzVar.zzg(), zzhdzVar.zzh(), zzhdzVar.zzi(), zzhdxVar, null));
        }
        return new com.google.android.gms.internal.ads.zzheb(arrayList, zzhebVar.zzb, zzhebVar);
    }

    private static java.util.List zzj(com.google.android.gms.internal.ads.zzhsz zzhszVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhdq zzhlzVar;
        boolean z;
        com.google.android.gms.internal.ads.zzhdx zzhdxVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(zzhszVar.zzc());
        for (com.google.android.gms.internal.ads.zzhsy zzhsyVar : zzhszVar.zzb()) {
            int zzc = zzhsyVar.zzc();
            try {
                com.google.android.gms.internal.ads.zzhnm zzl = zzl(zzhsyVar);
                com.google.android.gms.internal.ads.zzhmr zza = com.google.android.gms.internal.ads.zzhmr.zza();
                com.google.android.gms.internal.ads.zzhel zza2 = com.google.android.gms.internal.ads.zzhel.zza();
                zzhlzVar = !zza.zzf(zzl) ? new com.google.android.gms.internal.ads.zzhlz(zzl, zza2) : zza.zzg(zzl, zza2);
                z = false;
            } catch (java.security.GeneralSecurityException e) {
                if (com.google.android.gms.internal.ads.zzhkp.zza.zza()) {
                    throw e;
                }
                zzhlzVar = new com.google.android.gms.internal.ads.zzhlz(zzl(zzhsyVar), com.google.android.gms.internal.ads.zzhel.zza());
                z = true;
            }
            if (com.google.android.gms.internal.ads.zzhkp.zza.zza() && !zzm(zzhsyVar.zzk())) {
                throw new java.security.GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            int zzk = zzhsyVar.zzk();
            boolean z2 = zzc == zzhszVar.zza();
            zzhdxVar = com.google.android.gms.internal.ads.zzhdz.zza;
            arrayList.add(new com.google.android.gms.internal.ads.zzhdz(zzhlzVar, zzk, zzc, z2, z, zzhdxVar, null));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private final com.google.android.gms.internal.ads.zzheb zzk() {
        com.google.android.gms.internal.ads.zzheb zzhebVar = this.zzc;
        return zzhebVar == null ? this : zzhebVar;
    }

    private static com.google.android.gms.internal.ads.zzhnm zzl(com.google.android.gms.internal.ads.zzhsy zzhsyVar) throws java.security.GeneralSecurityException {
        return com.google.android.gms.internal.ads.zzhnm.zza(zzhsyVar.zzb().zza(), zzhsyVar.zzb().zzb(), zzhsyVar.zzb().zzc(), zzhsyVar.zzd(), zzhsyVar.zzd() == com.google.android.gms.internal.ads.zzhtm.RAW ? null : java.lang.Integer.valueOf(zzhsyVar.zzc()));
    }

    private static boolean zzm(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzhsz zzb = zzb();
        int i = com.google.android.gms.internal.ads.zzheo.zza;
        com.google.android.gms.internal.ads.zzhta zza = com.google.android.gms.internal.ads.zzhtd.zza();
        zza.zza(zzb.zza());
        for (com.google.android.gms.internal.ads.zzhsy zzhsyVar : zzb.zzb()) {
            com.google.android.gms.internal.ads.zzhtb zza2 = com.google.android.gms.internal.ads.zzhtc.zza();
            zza2.zza(zzhsyVar.zzb().zza());
            zza2.zzd(zzhsyVar.zzk());
            zza2.zzc(zzhsyVar.zzd());
            zza2.zzb(zzhsyVar.zzc());
            zza.zzb((com.google.android.gms.internal.ads.zzhtc) zza2.zzbu());
        }
        return ((com.google.android.gms.internal.ads.zzhtd) zza.zzbu()).toString();
    }

    final com.google.android.gms.internal.ads.zzhsz zzb() {
        try {
            com.google.android.gms.internal.ads.zzhsw zzh = com.google.android.gms.internal.ads.zzhsz.zzh();
            for (com.google.android.gms.internal.ads.zzhdz zzhdzVar : this.zza) {
                com.google.android.gms.internal.ads.zzhdq zza = zzhdzVar.zza();
                int zzj = zzhdzVar.zzj();
                int zzc = zzhdzVar.zzc();
                com.google.android.gms.internal.ads.zzhnm zzhnmVar = (com.google.android.gms.internal.ads.zzhnm) com.google.android.gms.internal.ads.zzhmr.zza().zzh(zza, com.google.android.gms.internal.ads.zzhnm.class, com.google.android.gms.internal.ads.zzhel.zza());
                java.lang.Integer zzb = zza.zzb();
                if (zzb != null && zzb.intValue() != zzc) {
                    throw new java.security.GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                com.google.android.gms.internal.ads.zzhsx zze = com.google.android.gms.internal.ads.zzhsy.zze();
                com.google.android.gms.internal.ads.zzhso zzd = com.google.android.gms.internal.ads.zzhsq.zzd();
                zzd.zza(zzhnmVar.zzg());
                zzd.zzb(zzhnmVar.zzb());
                zzd.zzc(zzhnmVar.zzc());
                zze.zzb(zzd);
                zze.zze(zzj);
                zze.zzc(zzc);
                zze.zzd(zzhnmVar.zzd());
                zzh.zzb((com.google.android.gms.internal.ads.zzhsy) zze.zzbu());
                if (zzhdzVar.zzd()) {
                    zzh.zza(zzhdzVar.zzc());
                }
            }
            return (com.google.android.gms.internal.ads.zzhsz) zzh.zzbu();
        } catch (java.security.GeneralSecurityException e) {
            throw new com.google.android.gms.internal.ads.zzhny(e);
        }
    }

    public final com.google.android.gms.internal.ads.zzhdz zzc() {
        for (com.google.android.gms.internal.ads.zzhdz zzhdzVar : this.zza) {
            if (zzhdzVar != null && zzhdzVar.zzd()) {
                if (zzhdzVar.zzb() == com.google.android.gms.internal.ads.zzhds.zza) {
                    return zzhdzVar;
                }
                throw new java.lang.IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new java.lang.IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final int zzd() {
        return this.zza.size();
    }

    public final com.google.android.gms.internal.ads.zzhdz zze(int i) {
        if (i < 0 || i >= zzd()) {
            int zzd = zzd();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 34 + java.lang.String.valueOf(zzd).length());
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(zzd);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        java.util.List list = this.zza;
        com.google.android.gms.internal.ads.zzhdz zzhdzVar = (com.google.android.gms.internal.ads.zzhdz) list.get(i);
        if (!zzm(zzhdzVar.zzj())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i);
            sb2.append(" has wrong status");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        if (!zzhdzVar.zzi()) {
            return (com.google.android.gms.internal.ads.zzhdz) list.get(i);
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i);
        sb3.append(" didn't parse correctly");
        throw new java.lang.IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    @javax.annotation.Nullable
    public final com.google.android.gms.internal.ads.zzhdj zzf(java.lang.Class cls) {
        return (com.google.android.gms.internal.ads.zzhdj) this.zzb.get(cls);
    }

    public final java.lang.Object zzh(com.google.android.gms.internal.ads.zzhdn zzhdnVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhsz zzb = zzk().zzb();
        int i = com.google.android.gms.internal.ads.zzheo.zza;
        int zza = zzb.zza();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (com.google.android.gms.internal.ads.zzhsy zzhsyVar : zzb.zzb()) {
            if (zzhsyVar.zzk() == 3) {
                if (!zzhsyVar.zza()) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has no key data", java.lang.Integer.valueOf(zzhsyVar.zzc())));
                }
                if (zzhsyVar.zzd() == com.google.android.gms.internal.ads.zzhtm.UNKNOWN_PREFIX) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown prefix", java.lang.Integer.valueOf(zzhsyVar.zzc())));
                }
                if (zzhsyVar.zzk() == 2) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown status", java.lang.Integer.valueOf(zzhsyVar.zzc())));
                }
                if (zzhsyVar.zzc() == zza) {
                    if (z) {
                        throw new java.security.GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzhsyVar.zzb().zzc() == com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new java.security.GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            java.util.List list = this.zza;
            if (((com.google.android.gms.internal.ads.zzhdz) list.get(i3)).zzi() || !zzm(((com.google.android.gms.internal.ads.zzhdz) list.get(i3)).zzj())) {
                java.lang.String zza2 = zzb.zzd(i3).zzb().zza();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 44 + java.lang.String.valueOf(zza2).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(zza2);
                sb.append(" failed, unable to get primitive");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return zzhdnVar.zza(zzk(), cls);
    }
}
