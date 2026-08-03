package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbg extends com.google.android.gms.internal.measurement.zzav {
    protected zzbg() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FOR_IN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FOR_IN_CONST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FOR_IN_LET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FOR_LET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FOR_OF);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FOR_OF_CONST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FOR_OF_LET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.WHILE);
    }

    private static com.google.android.gms.internal.measurement.zzao zzc(com.google.android.gms.internal.measurement.zzbe zzbeVar, com.google.android.gms.internal.measurement.zzao zzaoVar, com.google.android.gms.internal.measurement.zzao zzaoVar2) {
        return zze(zzbeVar, zzaoVar.zzf(), zzaoVar2);
    }

    private static com.google.android.gms.internal.measurement.zzao zzd(com.google.android.gms.internal.measurement.zzbe zzbeVar, com.google.android.gms.internal.measurement.zzao zzaoVar, com.google.android.gms.internal.measurement.zzao zzaoVar2) {
        if (zzaoVar instanceof java.lang.Iterable) {
            return zze(zzbeVar, ((java.lang.Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        throw new java.lang.IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static com.google.android.gms.internal.measurement.zzao zze(com.google.android.gms.internal.measurement.zzbe zzbeVar, java.util.Iterator it, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (it != null) {
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzao zzb = zzbeVar.zza((com.google.android.gms.internal.measurement.zzao) it.next()).zzb((com.google.android.gms.internal.measurement.zzae) zzaoVar);
                if (zzb instanceof com.google.android.gms.internal.measurement.zzag) {
                    com.google.android.gms.internal.measurement.zzag zzagVar = (com.google.android.gms.internal.measurement.zzag) zzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
            }
        }
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02b2, code lost:
    
        if ("return".equals(r1.zzg()) != false) goto L70;
     */
    @Override // com.google.android.gms.internal.measurement.zzav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzag zzagVar;
        com.google.android.gms.internal.measurement.zzbk zzbkVar = com.google.android.gms.internal.measurement.zzbk.ADD;
        int ordinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (ordinal == 65) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.WHILE.name(), 4, list);
            com.google.android.gms.internal.measurement.zzao zzaoVar = (com.google.android.gms.internal.measurement.zzao) list.get(0);
            com.google.android.gms.internal.measurement.zzao zzaoVar2 = (com.google.android.gms.internal.measurement.zzao) list.get(1);
            com.google.android.gms.internal.measurement.zzao zzaoVar3 = (com.google.android.gms.internal.measurement.zzao) list.get(2);
            com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(3));
            if (zzgVar.zza(zzaoVar3).zze().booleanValue()) {
                com.google.android.gms.internal.measurement.zzao zzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzae) zza);
                if (zzb instanceof com.google.android.gms.internal.measurement.zzag) {
                    zzagVar = (com.google.android.gms.internal.measurement.zzag) zzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                }
            }
            while (zzgVar.zza(zzaoVar).zze().booleanValue()) {
                com.google.android.gms.internal.measurement.zzao zzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzae) zza);
                if (zzb2 instanceof com.google.android.gms.internal.measurement.zzag) {
                    zzagVar = (com.google.android.gms.internal.measurement.zzag) zzb2;
                    if ("break".equals(zzagVar.zzg())) {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
                zzgVar.zza(zzaoVar2);
            }
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
        switch (ordinal) {
            case 26:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                java.lang.String zzc = ((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                return zzc(new com.google.android.gms.internal.measurement.zzbf(zzgVar, zzc), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2)));
            case 27:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                java.lang.String zzc2 = ((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                return zzc(new com.google.android.gms.internal.measurement.zzbc(zzgVar, zzc2), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2)));
            case 28:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                java.lang.String zzc3 = ((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                return zzc(new com.google.android.gms.internal.measurement.zzbd(zzgVar, zzc3), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2)));
            case 29:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.FOR_LET.name(), 4, list);
                com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
                if (!(zza2 instanceof com.google.android.gms.internal.measurement.zzae)) {
                    throw new java.lang.IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                com.google.android.gms.internal.measurement.zzae zzaeVar = (com.google.android.gms.internal.measurement.zzae) zza2;
                com.google.android.gms.internal.measurement.zzao zzaoVar4 = (com.google.android.gms.internal.measurement.zzao) list.get(1);
                com.google.android.gms.internal.measurement.zzao zzaoVar5 = (com.google.android.gms.internal.measurement.zzao) list.get(2);
                com.google.android.gms.internal.measurement.zzao zza3 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(3));
                com.google.android.gms.internal.measurement.zzg zzc4 = zzgVar.zzc();
                for (int i = 0; i < zzaeVar.zzh(); i++) {
                    java.lang.String zzc5 = zzaeVar.zzl(i).zzc();
                    zzc4.zze(zzc5, zzgVar.zzh(zzc5));
                }
                while (zzgVar.zza(zzaoVar4).zze().booleanValue()) {
                    com.google.android.gms.internal.measurement.zzao zzb3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzae) zza3);
                    if (zzb3 instanceof com.google.android.gms.internal.measurement.zzag) {
                        com.google.android.gms.internal.measurement.zzag zzagVar2 = (com.google.android.gms.internal.measurement.zzag) zzb3;
                        if ("break".equals(zzagVar2.zzg())) {
                            return com.google.android.gms.internal.measurement.zzao.zzf;
                        }
                        if ("return".equals(zzagVar2.zzg())) {
                            return zzagVar2;
                        }
                    }
                    com.google.android.gms.internal.measurement.zzg zzc6 = zzgVar.zzc();
                    for (int i2 = 0; i2 < zzaeVar.zzh(); i2++) {
                        java.lang.String zzc7 = zzaeVar.zzl(i2).zzc();
                        zzc6.zze(zzc7, zzc4.zzh(zzc7));
                    }
                    zzc6.zza(zzaoVar5);
                    zzc4 = zzc6;
                }
                return com.google.android.gms.internal.measurement.zzao.zzf;
            case 30:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                java.lang.String zzc8 = ((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                return zzd(new com.google.android.gms.internal.measurement.zzbf(zzgVar, zzc8), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2)));
            case 31:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                java.lang.String zzc9 = ((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                return zzd(new com.google.android.gms.internal.measurement.zzbc(zzgVar, zzc9), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2)));
            case 32:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                java.lang.String zzc10 = ((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                return zzd(new com.google.android.gms.internal.measurement.zzbd(zzgVar, zzc10), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2)));
            default:
                return super.zzb(str);
        }
    }
}
