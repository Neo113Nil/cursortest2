package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzay extends com.google.android.gms.internal.measurement.zzav {
    protected zzay() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.APPLY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BLOCK);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BREAK);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.CASE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.DEFAULT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.CONTINUE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.DEFINE_FUNCTION);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.FN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.IF);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.QUOTE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.RETURN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.SWITCH);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.TERNARY);
    }

    private static com.google.android.gms.internal.measurement.zzao zzc(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.FN.name(), 2, list);
        com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
        if (!(zza2 instanceof com.google.android.gms.internal.measurement.zzae)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("FN requires an ArrayValue of parameter names found %s", zza2.getClass().getCanonicalName()));
        }
        java.util.List zzb = ((com.google.android.gms.internal.measurement.zzae) zza2).zzb();
        java.util.List arrayList = new java.util.ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new com.google.android.gms.internal.measurement.zzan(zza.zzc(), zzb, arrayList, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbk zzbkVar = com.google.android.gms.internal.measurement.zzbk.ADD;
        int ordinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (ordinal == 2) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.APPLY.name(), 3, list);
            com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
            java.lang.String zzc = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzc();
            com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2));
            if (!(zza2 instanceof com.google.android.gms.internal.measurement.zzae)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Function arguments for Apply are not a list found %s", zza2.getClass().getCanonicalName()));
            }
            if (zzc.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Function name for apply is undefined");
            }
            return zza.zzcA(zzc, zzgVar, ((com.google.android.gms.internal.measurement.zzae) zza2).zzb());
        }
        if (ordinal == 15) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BREAK.name(), 0, list);
            return com.google.android.gms.internal.measurement.zzao.zzh;
        }
        if (ordinal == 25) {
            return zzc(zzgVar, list);
        }
        if (ordinal == 41) {
            com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.IF.name(), 2, list);
            com.google.android.gms.internal.measurement.zzao zza3 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
            com.google.android.gms.internal.measurement.zzao zza4 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
            com.google.android.gms.internal.measurement.zzao zza5 = list.size() > 2 ? zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2)) : null;
            com.google.android.gms.internal.measurement.zzao zzaoVar = com.google.android.gms.internal.measurement.zzao.zzf;
            com.google.android.gms.internal.measurement.zzao zzb = zza3.zze().booleanValue() ? zzgVar.zzb((com.google.android.gms.internal.measurement.zzae) zza4) : zza5 != null ? zzgVar.zzb((com.google.android.gms.internal.measurement.zzae) zza5) : zzaoVar;
            return true != (zzb instanceof com.google.android.gms.internal.measurement.zzag) ? zzaoVar : zzb;
        }
        if (ordinal == 54) {
            return new com.google.android.gms.internal.measurement.zzae(list);
        }
        if (ordinal == 57) {
            if (list.isEmpty()) {
                return com.google.android.gms.internal.measurement.zzao.zzj;
            }
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.RETURN.name(), 1, list);
            return new com.google.android.gms.internal.measurement.zzag("return", zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.DEFINE_FUNCTION.name(), 2, list);
                com.google.android.gms.internal.measurement.zzan zzanVar = (com.google.android.gms.internal.measurement.zzan) zzc(zzgVar, list);
                if (zzanVar.zzg() == null) {
                    zzgVar.zze("", zzanVar);
                    return zzanVar;
                }
                zzgVar.zze(zzanVar.zzg(), zzanVar);
                return zzanVar;
            }
            if (ordinal == 60) {
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.SWITCH.name(), 3, list);
                com.google.android.gms.internal.measurement.zzao zza6 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
                com.google.android.gms.internal.measurement.zzao zza7 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
                com.google.android.gms.internal.measurement.zzao zza8 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2));
                if (!(zza7 instanceof com.google.android.gms.internal.measurement.zzae)) {
                    throw new java.lang.IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zza8 instanceof com.google.android.gms.internal.measurement.zzae)) {
                    throw new java.lang.IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                com.google.android.gms.internal.measurement.zzae zzaeVar = (com.google.android.gms.internal.measurement.zzae) zza7;
                com.google.android.gms.internal.measurement.zzae zzaeVar2 = (com.google.android.gms.internal.measurement.zzae) zza8;
                boolean z = false;
                for (int i = 0; i < zzaeVar.zzh(); i++) {
                    if (z || zza6.equals(zzgVar.zza(zzaeVar.zzl(i)))) {
                        com.google.android.gms.internal.measurement.zzao zza9 = zzgVar.zza(zzaeVar2.zzl(i));
                        if (zza9 instanceof com.google.android.gms.internal.measurement.zzag) {
                            return ((com.google.android.gms.internal.measurement.zzag) zza9).zzg().equals("break") ? com.google.android.gms.internal.measurement.zzao.zzf : zza9;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (zzaeVar.zzh() + 1 == zzaeVar2.zzh()) {
                    com.google.android.gms.internal.measurement.zzao zza10 = zzgVar.zza(zzaeVar2.zzl(zzaeVar.zzh()));
                    if (zza10 instanceof com.google.android.gms.internal.measurement.zzag) {
                        java.lang.String zzg = ((com.google.android.gms.internal.measurement.zzag) zza10).zzg();
                        if (zzg.equals("return") || zzg.equals("continue")) {
                            return zza10;
                        }
                    }
                }
                return com.google.android.gms.internal.measurement.zzao.zzf;
            }
            if (ordinal == 61) {
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.TERNARY.name(), 3, list);
                return zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zze().booleanValue() ? zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)) : zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2));
            }
            switch (ordinal) {
                case 11:
                    return zzgVar.zzc().zzb(new com.google.android.gms.internal.measurement.zzae(list));
                case 12:
                    com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BREAK.name(), 0, list);
                    return com.google.android.gms.internal.measurement.zzao.zzi;
                case 13:
                    break;
                default:
                    return super.zzb(str);
            }
        }
        if (list.isEmpty()) {
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
        com.google.android.gms.internal.measurement.zzao zza11 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        return zza11 instanceof com.google.android.gms.internal.measurement.zzae ? zzgVar.zzb((com.google.android.gms.internal.measurement.zzae) zza11) : com.google.android.gms.internal.measurement.zzao.zzf;
    }
}
