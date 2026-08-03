package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbj extends com.google.android.gms.internal.measurement.zzav {
    protected zzbj() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.ASSIGN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.CONST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.CREATE_ARRAY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.CREATE_OBJECT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.EXPRESSION_LIST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.GET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.GET_INDEX);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.GET_PROPERTY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.NULL);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.SET_PROPERTY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.TYPEOF);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.UNDEFINED);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzao zza;
        com.google.android.gms.internal.measurement.zzao zza2;
        java.lang.String str2;
        com.google.android.gms.internal.measurement.zzbk zzbkVar = com.google.android.gms.internal.measurement.zzbk.ADD;
        int ordinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        int i = 0;
        if (ordinal != 3) {
            if (ordinal == 14) {
                com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.CONST.name(), 2, list);
                if (list.size() % 2 != 0) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("CONST requires an even number of arguments, found %s", java.lang.Integer.valueOf(list.size())));
                }
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    com.google.android.gms.internal.measurement.zzao zza3 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i2));
                    if (!(zza3 instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for const name. got %s", zza3.getClass().getCanonicalName()));
                    }
                    zzgVar.zzg(zza3.zzc(), zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i2 + 1)));
                }
                return com.google.android.gms.internal.measurement.zzao.zzf;
            }
            if (ordinal == 24) {
                com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.EXPRESSION_LIST.name(), 1, list);
                com.google.android.gms.internal.measurement.zzao zzaoVar = com.google.android.gms.internal.measurement.zzao.zzf;
                while (i < list.size()) {
                    zzaoVar = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i));
                    if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzag) {
                        throw new java.lang.IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i++;
                }
                return zzaoVar;
            }
            if (ordinal == 33) {
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.GET.name(), 1, list);
                com.google.android.gms.internal.measurement.zzao zza4 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
                if (zza4 instanceof com.google.android.gms.internal.measurement.zzas) {
                    return zzgVar.zzh(zza4.zzc());
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for get var. got %s", zza4.getClass().getCanonicalName()));
            }
            if (ordinal == 49) {
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.NULL.name(), 0, list);
                return com.google.android.gms.internal.measurement.zzao.zzg;
            }
            if (ordinal == 58) {
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.SET_PROPERTY.name(), 3, list);
                com.google.android.gms.internal.measurement.zzao zza5 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
                com.google.android.gms.internal.measurement.zzao zza6 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
                zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2));
                if (zza5 == com.google.android.gms.internal.measurement.zzao.zzf || zza5 == com.google.android.gms.internal.measurement.zzao.zzg) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Can't set property %s of %s", zza6.zzc(), zza5.zzc()));
                }
                if ((zza5 instanceof com.google.android.gms.internal.measurement.zzae) && (zza6 instanceof com.google.android.gms.internal.measurement.zzah)) {
                    ((com.google.android.gms.internal.measurement.zzae) zza5).zzn(zza6.zzd().intValue(), zza2);
                } else if (zza5 instanceof com.google.android.gms.internal.measurement.zzak) {
                    ((com.google.android.gms.internal.measurement.zzak) zza5).zzm(zza6.zzc(), zza2);
                    return zza2;
                }
            } else {
                if (ordinal == 17) {
                    if (list.isEmpty()) {
                        return new com.google.android.gms.internal.measurement.zzae();
                    }
                    com.google.android.gms.internal.measurement.zzae zzaeVar = new com.google.android.gms.internal.measurement.zzae();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.internal.measurement.zzao zza7 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) it.next());
                        if (zza7 instanceof com.google.android.gms.internal.measurement.zzag) {
                            throw new java.lang.IllegalStateException("Failed to evaluate array element");
                        }
                        zzaeVar.zzn(i, zza7);
                        i++;
                    }
                    return zzaeVar;
                }
                if (ordinal == 18) {
                    if (list.isEmpty()) {
                        return new com.google.android.gms.internal.measurement.zzal();
                    }
                    if (list.size() % 2 != 0) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("CREATE_OBJECT requires an even number of arguments, found %s", java.lang.Integer.valueOf(list.size())));
                    }
                    com.google.android.gms.internal.measurement.zzal zzalVar = new com.google.android.gms.internal.measurement.zzal();
                    while (i < list.size() - 1) {
                        com.google.android.gms.internal.measurement.zzao zza8 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i));
                        com.google.android.gms.internal.measurement.zzao zza9 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i + 1));
                        if ((zza8 instanceof com.google.android.gms.internal.measurement.zzag) || (zza9 instanceof com.google.android.gms.internal.measurement.zzag)) {
                            throw new java.lang.IllegalStateException("Failed to evaluate map entry");
                        }
                        zzalVar.zzm(zza8.zzc(), zza9);
                        i += 2;
                    }
                    return zzalVar;
                }
                if (ordinal == 35 || ordinal == 36) {
                    com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.GET_PROPERTY.name(), 2, list);
                    com.google.android.gms.internal.measurement.zzao zza10 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
                    com.google.android.gms.internal.measurement.zzao zza11 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
                    if ((zza10 instanceof com.google.android.gms.internal.measurement.zzae) && com.google.android.gms.internal.measurement.zzh.zzd(zza11)) {
                        return ((com.google.android.gms.internal.measurement.zzae) zza10).zzl(zza11.zzd().intValue());
                    }
                    if (zza10 instanceof com.google.android.gms.internal.measurement.zzak) {
                        return ((com.google.android.gms.internal.measurement.zzak) zza10).zzk(zza11.zzc());
                    }
                    if (zza10 instanceof com.google.android.gms.internal.measurement.zzas) {
                        if ("length".equals(zza11.zzc())) {
                            zza2 = new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zza10.zzc().length()));
                        } else if (com.google.android.gms.internal.measurement.zzh.zzd(zza11) && zza11.zzd().doubleValue() < zza10.zzc().length()) {
                            zza = new com.google.android.gms.internal.measurement.zzas(java.lang.String.valueOf(zza10.zzc().charAt(zza11.zzd().intValue())));
                        }
                    }
                    return com.google.android.gms.internal.measurement.zzao.zzf;
                }
                switch (ordinal) {
                    case 62:
                        com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.TYPEOF.name(), 1, list);
                        com.google.android.gms.internal.measurement.zzao zza12 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
                        if (zza12 instanceof com.google.android.gms.internal.measurement.zzat) {
                            str2 = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
                        } else if (zza12 instanceof com.google.android.gms.internal.measurement.zzaf) {
                            str2 = "boolean";
                        } else if (zza12 instanceof com.google.android.gms.internal.measurement.zzah) {
                            str2 = "number";
                        } else if (zza12 instanceof com.google.android.gms.internal.measurement.zzas) {
                            str2 = "string";
                        } else if (zza12 instanceof com.google.android.gms.internal.measurement.zzan) {
                            str2 = "function";
                        } else {
                            if ((zza12 instanceof com.google.android.gms.internal.measurement.zzap) || (zza12 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported value type %s in typeof", zza12));
                            }
                            str2 = "object";
                        }
                        zza2 = new com.google.android.gms.internal.measurement.zzas(str2);
                        break;
                    case 63:
                        com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.UNDEFINED.name(), 0, list);
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    case 64:
                        com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.VAR.name(), 1, list);
                        java.util.Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            com.google.android.gms.internal.measurement.zzao zza13 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) it2.next());
                            if (!(zza13 instanceof com.google.android.gms.internal.measurement.zzas)) {
                                throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for var name. got %s", zza13.getClass().getCanonicalName()));
                            }
                            zzgVar.zzf(zza13.zzc(), com.google.android.gms.internal.measurement.zzao.zzf);
                        }
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    default:
                        return super.zzb(str);
                }
            }
            return zza2;
        }
        com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.ASSIGN.name(), 2, list);
        com.google.android.gms.internal.measurement.zzao zza14 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        if (!(zza14 instanceof com.google.android.gms.internal.measurement.zzas)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for assign var. got %s", zza14.getClass().getCanonicalName()));
        }
        if (!zzgVar.zzd(zza14.zzc())) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to assign undefined value %s", zza14.zzc()));
        }
        zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
        zzgVar.zze(zza14.zzc(), zza);
        return zza;
    }
}
