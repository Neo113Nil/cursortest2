package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibw extends java.util.AbstractMap implements java.io.Serializable {
    private static final java.util.Comparator zze = new com.google.android.gms.internal.ads.zzibp();
    com.google.android.gms.internal.ads.zzibv zza;
    int zzb;
    int zzc;
    final com.google.android.gms.internal.ads.zzibv zzd;
    private final java.util.Comparator zzf;
    private final boolean zzg;
    private com.google.android.gms.internal.ads.zzibr zzh;
    private com.google.android.gms.internal.ads.zzibt zzi;

    public zzibw() {
        this(zze, true);
    }

    private final void zzf(com.google.android.gms.internal.ads.zzibv zzibvVar, com.google.android.gms.internal.ads.zzibv zzibvVar2) {
        com.google.android.gms.internal.ads.zzibv zzibvVar3 = zzibvVar.zza;
        zzibvVar.zza = null;
        if (zzibvVar2 != null) {
            zzibvVar2.zza = zzibvVar3;
        }
        if (zzibvVar3 == null) {
            this.zza = zzibvVar2;
        } else if (zzibvVar3.zzb == zzibvVar) {
            zzibvVar3.zzb = zzibvVar2;
        } else {
            zzibvVar3.zzc = zzibvVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzg(com.google.android.gms.internal.ads.zzibv zzibvVar, boolean z) {
        while (zzibvVar != null) {
            com.google.android.gms.internal.ads.zzibv zzibvVar2 = zzibvVar.zzb;
            com.google.android.gms.internal.ads.zzibv zzibvVar3 = zzibvVar.zzc;
            boolean z2 = false;
            int i = zzibvVar2 != null ? zzibvVar2.zzi : 0;
            int i2 = zzibvVar3 != null ? zzibvVar3.zzi : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                com.google.android.gms.internal.ads.zzibv zzibvVar4 = zzibvVar3.zzb;
                com.google.android.gms.internal.ads.zzibv zzibvVar5 = zzibvVar3.zzc;
                int i4 = (zzibvVar4 != null ? zzibvVar4.zzi : 0) - (zzibvVar5 != null ? zzibvVar5.zzi : 0);
                if (i4 != -1) {
                    if (i4 != 0) {
                        z3 = z;
                    }
                    zzi(zzibvVar3);
                    zzh(zzibvVar);
                    if (!z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzh(zzibvVar);
                z3 = z2;
                if (!z3) {
                }
            } else if (i3 == 2) {
                com.google.android.gms.internal.ads.zzibv zzibvVar6 = zzibvVar2.zzb;
                com.google.android.gms.internal.ads.zzibv zzibvVar7 = zzibvVar2.zzc;
                int i5 = (zzibvVar6 != null ? zzibvVar6.zzi : 0) - (zzibvVar7 != null ? zzibvVar7.zzi : 0);
                if (i5 != 1) {
                    if (i5 != 0) {
                        z3 = z;
                    }
                    zzh(zzibvVar2);
                    zzi(zzibvVar);
                    if (!z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzi(zzibvVar);
                z3 = z2;
                if (!z3) {
                }
            } else if (i3 == 0) {
                zzibvVar.zzi = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzibvVar.zzi = java.lang.Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzibvVar = zzibvVar.zza;
        }
    }

    private final void zzh(com.google.android.gms.internal.ads.zzibv zzibvVar) {
        com.google.android.gms.internal.ads.zzibv zzibvVar2 = zzibvVar.zzb;
        com.google.android.gms.internal.ads.zzibv zzibvVar3 = zzibvVar.zzc;
        com.google.android.gms.internal.ads.zzibv zzibvVar4 = zzibvVar3.zzb;
        com.google.android.gms.internal.ads.zzibv zzibvVar5 = zzibvVar3.zzc;
        zzibvVar.zzc = zzibvVar4;
        if (zzibvVar4 != null) {
            zzibvVar4.zza = zzibvVar;
        }
        zzf(zzibvVar, zzibvVar3);
        zzibvVar3.zzb = zzibvVar;
        zzibvVar.zza = zzibvVar3;
        int max = java.lang.Math.max(zzibvVar2 != null ? zzibvVar2.zzi : 0, zzibvVar4 != null ? zzibvVar4.zzi : 0) + 1;
        zzibvVar.zzi = max;
        zzibvVar3.zzi = java.lang.Math.max(max, zzibvVar5 != null ? zzibvVar5.zzi : 0) + 1;
    }

    private final void zzi(com.google.android.gms.internal.ads.zzibv zzibvVar) {
        com.google.android.gms.internal.ads.zzibv zzibvVar2 = zzibvVar.zzb;
        com.google.android.gms.internal.ads.zzibv zzibvVar3 = zzibvVar.zzc;
        com.google.android.gms.internal.ads.zzibv zzibvVar4 = zzibvVar2.zzb;
        com.google.android.gms.internal.ads.zzibv zzibvVar5 = zzibvVar2.zzc;
        zzibvVar.zzb = zzibvVar5;
        if (zzibvVar5 != null) {
            zzibvVar5.zza = zzibvVar;
        }
        zzf(zzibvVar, zzibvVar2);
        zzibvVar2.zzc = zzibvVar;
        zzibvVar.zza = zzibvVar2;
        int max = java.lang.Math.max(zzibvVar3 != null ? zzibvVar3.zzi : 0, zzibvVar5 != null ? zzibvVar5.zzi : 0) + 1;
        zzibvVar.zzi = max;
        zzibvVar2.zzi = java.lang.Math.max(max, zzibvVar4 != null ? zzibvVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        com.google.android.gms.internal.ads.zzibv zzibvVar = this.zzd;
        zzibvVar.zze = zzibvVar;
        zzibvVar.zzd = zzibvVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        com.google.android.gms.internal.ads.zzibr zzibrVar = this.zzh;
        if (zzibrVar != null) {
            return zzibrVar;
        }
        com.google.android.gms.internal.ads.zzibr zzibrVar2 = new com.google.android.gms.internal.ads.zzibr(this);
        this.zzh = zzibrVar2;
        return zzibrVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzibv zzb = zzb(obj);
        if (zzb != null) {
            return zzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        com.google.android.gms.internal.ads.zzibt zzibtVar = this.zzi;
        if (zzibtVar != null) {
            return zzibtVar;
        }
        com.google.android.gms.internal.ads.zzibt zzibtVar2 = new com.google.android.gms.internal.ads.zzibt(this);
        this.zzi = zzibtVar2;
        return zzibtVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new java.lang.NullPointerException("value == null");
        }
        com.google.android.gms.internal.ads.zzibv zza = zza(obj, true);
        java.lang.Object obj3 = zza.zzh;
        zza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzibv zze2 = zze(obj);
        if (zze2 != null) {
            return zze2.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final com.google.android.gms.internal.ads.zzibv zza(java.lang.Object obj, boolean z) {
        int i;
        com.google.android.gms.internal.ads.zzibv zzibvVar;
        java.util.Comparator comparator = this.zzf;
        com.google.android.gms.internal.ads.zzibv zzibvVar2 = this.zza;
        if (zzibvVar2 != null) {
            java.lang.Comparable comparable = comparator == zze ? (java.lang.Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(zzibvVar2.zzf) : comparator.compare(obj, zzibvVar2.zzf);
                if (i == 0) {
                    return zzibvVar2;
                }
                com.google.android.gms.internal.ads.zzibv zzibvVar3 = i < 0 ? zzibvVar2.zzb : zzibvVar2.zzc;
                if (zzibvVar3 == null) {
                    break;
                }
                zzibvVar2 = zzibvVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        com.google.android.gms.internal.ads.zzibv zzibvVar4 = this.zzd;
        if (zzibvVar2 != null) {
            zzibvVar = new com.google.android.gms.internal.ads.zzibv(this.zzg, zzibvVar2, obj, zzibvVar4, zzibvVar4.zze);
            if (i < 0) {
                zzibvVar2.zzb = zzibvVar;
            } else {
                zzibvVar2.zzc = zzibvVar;
            }
            zzg(zzibvVar2, true);
        } else {
            if (comparator == zze && !(obj instanceof java.lang.Comparable)) {
                java.lang.String name = obj.getClass().getName();
                java.lang.String.valueOf(name);
                throw new java.lang.ClassCastException(java.lang.String.valueOf(name).concat(" is not Comparable"));
            }
            zzibvVar = new com.google.android.gms.internal.ads.zzibv(this.zzg, null, obj, zzibvVar4, zzibvVar4.zze);
            this.zza = zzibvVar;
        }
        this.zzb++;
        this.zzc++;
        return zzibvVar;
    }

    final com.google.android.gms.internal.ads.zzibv zzb(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    final com.google.android.gms.internal.ads.zzibv zzc(java.util.Map.Entry entry) {
        com.google.android.gms.internal.ads.zzibv zzb = zzb(entry.getKey());
        if (zzb == null || !java.util.Objects.equals(zzb.zzh, entry.getValue())) {
            return null;
        }
        return zzb;
    }

    final void zzd(com.google.android.gms.internal.ads.zzibv zzibvVar, boolean z) {
        com.google.android.gms.internal.ads.zzibv zzibvVar2;
        com.google.android.gms.internal.ads.zzibv zzibvVar3;
        int i;
        if (z) {
            com.google.android.gms.internal.ads.zzibv zzibvVar4 = zzibvVar.zze;
            zzibvVar4.zzd = zzibvVar.zzd;
            zzibvVar.zzd.zze = zzibvVar4;
        }
        com.google.android.gms.internal.ads.zzibv zzibvVar5 = zzibvVar.zzb;
        com.google.android.gms.internal.ads.zzibv zzibvVar6 = zzibvVar.zzc;
        com.google.android.gms.internal.ads.zzibv zzibvVar7 = zzibvVar.zza;
        int i2 = 0;
        if (zzibvVar5 == null || zzibvVar6 == null) {
            if (zzibvVar5 != null) {
                zzf(zzibvVar, zzibvVar5);
                zzibvVar.zzb = null;
            } else if (zzibvVar6 != null) {
                zzf(zzibvVar, zzibvVar6);
                zzibvVar.zzc = null;
            } else {
                zzf(zzibvVar, null);
            }
            zzg(zzibvVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzibvVar5.zzi > zzibvVar6.zzi) {
            do {
                zzibvVar3 = zzibvVar5;
                zzibvVar5 = zzibvVar5.zzc;
            } while (zzibvVar5 != null);
        } else {
            do {
                zzibvVar2 = zzibvVar6;
                zzibvVar6 = zzibvVar6.zzb;
            } while (zzibvVar6 != null);
            zzibvVar3 = zzibvVar2;
        }
        zzd(zzibvVar3, false);
        com.google.android.gms.internal.ads.zzibv zzibvVar8 = zzibvVar.zzb;
        if (zzibvVar8 != null) {
            i = zzibvVar8.zzi;
            zzibvVar3.zzb = zzibvVar8;
            zzibvVar8.zza = zzibvVar3;
            zzibvVar.zzb = null;
        } else {
            i = 0;
        }
        com.google.android.gms.internal.ads.zzibv zzibvVar9 = zzibvVar.zzc;
        if (zzibvVar9 != null) {
            i2 = zzibvVar9.zzi;
            zzibvVar3.zzc = zzibvVar9;
            zzibvVar9.zza = zzibvVar3;
            zzibvVar.zzc = null;
        }
        zzibvVar3.zzi = java.lang.Math.max(i, i2) + 1;
        zzf(zzibvVar, zzibvVar3);
    }

    final com.google.android.gms.internal.ads.zzibv zze(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzibv zzb = zzb(obj);
        if (zzb != null) {
            zzd(zzb, true);
        }
        return zzb;
    }

    public zzibw(java.util.Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new com.google.android.gms.internal.ads.zzibv(z);
    }

    public zzibw(boolean z) {
        this(zze, false);
    }
}
