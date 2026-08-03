package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpj extends com.google.android.gms.measurement.internal.zzor {
    zzpj(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
    }

    static final void zzC(com.google.android.gms.internal.measurement.zzhr zzhrVar, java.lang.String str, java.lang.Object obj) {
        java.util.List zza = zzhrVar.zza();
        int i = 0;
        while (true) {
            if (i >= zza.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i)).zzb())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn.zzb(str);
        zzn.zzf(((java.lang.Long) obj).longValue());
        if (i >= 0) {
            zzhrVar.zze(i, zzn);
        } else {
            zzhrVar.zzg(zzn);
        }
    }

    static final boolean zzD(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbgVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        return !android.text.TextUtils.isEmpty(zzrVar.zzb);
    }

    static final android.os.Bundle zzE(java.util.List list) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            java.lang.String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putDouble(zzb, zzhwVar.zzj());
            } else if (zzhwVar.zzg()) {
                bundle.putFloat(zzb, zzhwVar.zzh());
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(zzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    static final com.google.android.gms.internal.measurement.zzhw zzF(com.google.android.gms.internal.measurement.zzhs zzhsVar, java.lang.String str) {
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    static final java.util.Map zzG(com.google.android.gms.internal.measurement.zzhs zzhsVar, java.lang.String... strArr) {
        java.lang.Object zzP;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (java.util.Arrays.asList(strArr).contains(zzhwVar.zzb()) && (zzP = zzP(zzhwVar)) != null) {
                hashMap.put(zzhwVar.zzb(), zzP);
            }
        }
        return hashMap;
    }

    static final java.util.Map zzH(com.google.android.gms.internal.measurement.zzhs zzhsVar, java.lang.String str) {
        java.lang.Object zzP;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (zzP = zzP(zzhwVar)) != null) {
                hashMap.put(zzhwVar.zzb(), zzP);
            }
        }
        return hashMap;
    }

    static final java.lang.Object zzI(com.google.android.gms.internal.measurement.zzhs zzhsVar, java.lang.String str) {
        com.google.android.gms.internal.measurement.zzhw zzF = zzF(zzhsVar, str);
        if (zzF == null) {
            return null;
        }
        return zzP(zzF);
    }

    static final java.lang.Object zzJ(com.google.android.gms.internal.measurement.zzhs zzhsVar, java.lang.String str, java.lang.Object obj) {
        java.lang.Object zzI = zzI(zzhsVar, str);
        return zzI == null ? obj : zzI;
    }

    private final void zzK(java.lang.StringBuilder sb, int i, java.util.List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                zzM(sb, i2);
                sb.append("param {\n");
                zzS(sb, i2, "name", zzhwVar.zza() ? this.zzu.zzl().zzb(zzhwVar.zzb()) : null);
                zzS(sb, i2, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                zzS(sb, i2, "int_value", zzhwVar.zze() ? java.lang.Long.valueOf(zzhwVar.zzf()) : null);
                zzS(sb, i2, "double_value", zzhwVar.zzi() ? java.lang.Double.valueOf(zzhwVar.zzj()) : null);
                if (zzhwVar.zzm() > 0) {
                    zzK(sb, i2, zzhwVar.zzk());
                }
                zzM(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zzL(java.lang.StringBuilder sb, int i, com.google.android.gms.internal.measurement.zzfh zzfhVar) {
        java.lang.String str;
        if (zzfhVar == null) {
            return;
        }
        zzM(sb, i);
        sb.append("filter {\n");
        if (zzfhVar.zze()) {
            zzS(sb, i, "complement", java.lang.Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzg()) {
            zzS(sb, i, "param_name", this.zzu.zzl().zzb(zzfhVar.zzh()));
        }
        if (zzfhVar.zza()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzfr zzb = zzfhVar.zzb();
            if (zzb != null) {
                zzM(sb, i2);
                sb.append("string_filter {\n");
                if (zzb.zza()) {
                    switch (zzb.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzS(sb, i2, "match_type", str);
                }
                if (zzb.zzb()) {
                    zzS(sb, i2, "expression", zzb.zzc());
                }
                if (zzb.zzd()) {
                    zzS(sb, i2, "case_sensitive", java.lang.Boolean.valueOf(zzb.zze()));
                }
                if (zzb.zzg() > 0) {
                    zzM(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (java.lang.String str2 : zzb.zzf()) {
                        zzM(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzM(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            zzT(sb, i + 1, "number_filter", zzfhVar.zzd());
        }
        zzM(sb, i);
        sb.append("}\n");
    }

    private static final void zzM(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final void zzN(android.net.Uri.Builder builder, java.lang.String str, java.lang.String str2, java.util.Set set) {
        if (set.contains(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static final java.lang.String zzO(boolean z, boolean z2, boolean z3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final java.lang.Object zzP(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return java.lang.Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzi()) {
            return java.lang.Double.valueOf(zzhwVar.zzj());
        }
        if (zzhwVar.zzm() > 0) {
            return zzy(zzhwVar.zzk());
        }
        return null;
    }

    private static final void zzQ(android.net.Uri.Builder builder, java.lang.String[] strArr, android.os.Bundle bundle, java.util.Set set) {
        for (java.lang.String str : strArr) {
            java.lang.String[] split = str.split(",");
            java.lang.String str2 = split[0];
            java.lang.String str3 = split[split.length - 1];
            java.lang.String string = bundle.getString(str2);
            if (string != null) {
                zzN(builder, str3, string, set);
            }
        }
    }

    private static final void zzR(java.lang.StringBuilder sb, int i, java.lang.String str, com.google.android.gms.internal.measurement.zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        zzM(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziiVar.zzd() != 0) {
            zzM(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (java.lang.Long l : zziiVar.zzc()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            zzM(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (java.lang.Long l2 : zziiVar.zza()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            zzM(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhqVar.zza() ? java.lang.Integer.valueOf(zzhqVar.zzb()) : null);
                sb.append(":");
                sb.append(zzhqVar.zzc() ? java.lang.Long.valueOf(zzhqVar.zzd()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zziiVar.zzh() != 0) {
            zzM(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzg()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzikVar.zza() ? java.lang.Integer.valueOf(zzikVar.zzb()) : null);
                sb.append(": [");
                java.util.Iterator it = zzikVar.zzc().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long longValue = ((java.lang.Long) it.next()).longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append(com.ironsource.X3.j.e);
                i8 = i9;
            }
            sb.append("}\n");
        }
        zzM(sb, 3);
        sb.append("}\n");
    }

    private static final void zzS(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        zzM(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzT(java.lang.StringBuilder sb, int i, java.lang.String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        if (zzflVar == null) {
            return;
        }
        zzM(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzflVar.zza()) {
            int zzm = zzflVar.zzm();
            zzS(sb, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzflVar.zzb()) {
            zzS(sb, i, "match_as_float", java.lang.Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            zzS(sb, i, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            zzS(sb, i, "min_comparison_value", zzflVar.zzg());
        }
        if (zzflVar.zzh()) {
            zzS(sb, i, "max_comparison_value", zzflVar.zzi());
        }
        zzM(sb, i);
        sb.append("}\n");
    }

    static boolean zzm(java.lang.String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean zzn(java.util.List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((java.lang.Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    static java.util.List zzp(java.util.BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    static com.google.android.gms.internal.measurement.zznk zzw(com.google.android.gms.internal.measurement.zznk zznkVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzmq {
        com.google.android.gms.internal.measurement.zzlq zza = com.google.android.gms.internal.measurement.zzlq.zza();
        return zza != null ? zznkVar.zzaV(bArr, zza) : zznkVar.zzaW(bArr);
    }

    static int zzx(com.google.android.gms.internal.measurement.zzic zzicVar, java.lang.String str) {
        for (int i = 0; i < zzicVar.zzl(); i++) {
            if (str.equals(zzicVar.zzm(i).zzc())) {
                return i;
            }
        }
        return -1;
    }

    static android.os.Bundle[] zzy(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar2 : zzhwVar.zzk()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzi()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzj());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (android.os.Bundle[]) arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    final com.google.android.gms.measurement.internal.zzbg zzA(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        java.lang.Object obj;
        android.os.Bundle zzB = zzB(zzaaVar.zzf(), true);
        java.lang.String obj2 = (!zzB.containsKey("_o") || (obj = zzB.get("_o")) == null) ? "app" : obj.toString();
        java.lang.String zzb = com.google.android.gms.measurement.internal.zzjl.zzb(zzaaVar.zzb());
        if (zzb == null) {
            zzb = zzaaVar.zzb();
        }
        return new com.google.android.gms.measurement.internal.zzbg(zzb, new com.google.android.gms.measurement.internal.zzbe(zzB), obj2, zzaaVar.zza());
    }

    final android.os.Bundle zzB(java.util.Map map, boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            } else if (!(obj instanceof java.util.ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzB((java.util.Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (android.os.Parcelable[]) arrayList2.toArray(new android.os.Parcelable[0]));
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        return false;
    }

    final void zzc(com.google.android.gms.internal.measurement.zzit zzitVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzitVar.zzd();
        zzitVar.zzf();
        zzitVar.zzh();
        if (obj instanceof java.lang.String) {
            zzitVar.zzc((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzitVar.zze(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.Double) {
            zzitVar.zzg(((java.lang.Double) obj).doubleValue());
        } else {
            this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void zzd(com.google.android.gms.internal.measurement.zzhv zzhvVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzhvVar.zze();
        zzhvVar.zzg();
        zzhvVar.zzi();
        zzhvVar.zzm();
        if (obj instanceof java.lang.String) {
            zzhvVar.zzd((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzhvVar.zzf(((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            zzhvVar.zzh(((java.lang.Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof android.os.Bundle[])) {
            this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Bundle bundle : (android.os.Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                for (java.lang.String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                    zzn2.zzb(str);
                    java.lang.Object obj2 = bundle.get(str);
                    if (obj2 instanceof java.lang.Long) {
                        zzn2.zzf(((java.lang.Long) obj2).longValue());
                    } else if (obj2 instanceof java.lang.String) {
                        zzn2.zzd((java.lang.String) obj2);
                    } else if (obj2 instanceof java.lang.Double) {
                        zzn2.zzh(((java.lang.Double) obj2).doubleValue());
                    }
                    zzn.zzk(zzn2);
                }
                if (zzn.zzj() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhw) zzn.zzbc());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    final com.google.android.gms.measurement.internal.zzog zzf(java.lang.String str, com.google.android.gms.internal.measurement.zzic zzicVar, com.google.android.gms.internal.measurement.zzhr zzhrVar, java.lang.String str2) {
        int indexOf;
        com.google.android.gms.internal.measurement.zzql.zza();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
            return null;
        }
        long currentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        java.util.Set m = kotlin.UByte$$ExternalSyntheticBackport0.m((java.lang.Object[]) zzibVar.zzc().zzk(str, com.google.android.gms.measurement.internal.zzfx.zzau).split(","));
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
        com.google.android.gms.measurement.internal.zzot zzf = zzpfVar.zzf();
        java.lang.String zzc = zzf.zzg.zzh().zzc(str);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzf.zzu;
        builder.scheme(zzibVar2.zzc().zzk(str, com.google.android.gms.measurement.internal.zzfx.zzan));
        if (android.text.TextUtils.isEmpty(zzc)) {
            builder.authority(zzibVar2.zzc().zzk(str, com.google.android.gms.measurement.internal.zzfx.zzao));
        } else {
            java.lang.String zzk = zzibVar2.zzc().zzk(str, com.google.android.gms.measurement.internal.zzfx.zzao);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 1 + java.lang.String.valueOf(zzk).length());
            sb.append(zzc);
            sb.append(".");
            sb.append(zzk);
            builder.authority(sb.toString());
        }
        builder.path(zzibVar2.zzc().zzk(str, com.google.android.gms.measurement.internal.zzfx.zzap));
        zzN(builder, "gmp_app_id", zzicVar.zzac(), m);
        zzibVar.zzc().zzi();
        zzN(builder, "gmp_version", java.lang.String.valueOf(130000L), m);
        java.lang.String zzV = zzicVar.zzV();
        com.google.android.gms.measurement.internal.zzal zzc2 = zzibVar.zzc();
        com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzaS;
        if (zzc2.zzp(str, zzfwVar) && zzpfVar.zzh().zzt(str)) {
            zzV = "";
        }
        zzN(builder, "app_instance_id", zzV, m);
        zzN(builder, "rdid", zzicVar.zzP(), m);
        zzN(builder, "bundle_id", zzicVar.zzK(), m);
        java.lang.String zzk2 = zzhrVar.zzk();
        java.lang.String zza = com.google.android.gms.measurement.internal.zzjl.zza(zzk2);
        if (true != android.text.TextUtils.isEmpty(zza)) {
            zzk2 = zza;
        }
        zzN(builder, "app_event_name", zzk2, m);
        zzN(builder, "app_version", java.lang.String.valueOf(zzicVar.zzai()), m);
        java.lang.String zzD = zzicVar.zzD();
        if (zzibVar.zzc().zzp(str, zzfwVar) && zzpfVar.zzh().zzq(str) && !android.text.TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
            zzD = zzD.substring(0, indexOf);
        }
        zzN(builder, "os_version", zzD, m);
        zzN(builder, com.ironsource.C4.a.d, java.lang.String.valueOf(zzhrVar.zzn()), m);
        if (zzicVar.zzS()) {
            zzN(builder, com.ironsource.M6.s, "1", m);
        }
        zzN(builder, "privacy_sandbox_version", java.lang.String.valueOf(zzicVar.zzaG()), m);
        zzN(builder, "trigger_uri_source", "1", m);
        zzN(builder, "trigger_uri_timestamp", java.lang.String.valueOf(currentTimeMillis), m);
        zzN(builder, "request_uuid", str2, m);
        java.util.List<com.google.android.gms.internal.measurement.zzhw> zza2 = zzhrVar.zza();
        android.os.Bundle bundle = new android.os.Bundle();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zza2) {
            java.lang.String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putString(zzb, java.lang.String.valueOf(zzhwVar.zzj()));
            } else if (zzhwVar.zzg()) {
                bundle.putString(zzb, java.lang.String.valueOf(zzhwVar.zzh()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(zzb, java.lang.String.valueOf(zzhwVar.zzf()));
            }
        }
        zzQ(builder, zzibVar.zzc().zzk(str, com.google.android.gms.measurement.internal.zzfx.zzat).split("\\|"), bundle, m);
        java.util.List<com.google.android.gms.internal.measurement.zziu> zzk3 = zzicVar.zzk();
        android.os.Bundle bundle2 = new android.os.Bundle();
        for (com.google.android.gms.internal.measurement.zziu zziuVar : zzk3) {
            java.lang.String zzc3 = zziuVar.zzc();
            if (zziuVar.zzj()) {
                bundle2.putString(zzc3, java.lang.String.valueOf(zziuVar.zzk()));
            } else if (zziuVar.zzh()) {
                bundle2.putString(zzc3, java.lang.String.valueOf(zziuVar.zzi()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(zzc3, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(zzc3, java.lang.String.valueOf(zziuVar.zzg()));
            }
        }
        zzQ(builder, zzibVar.zzc().zzk(str, com.google.android.gms.measurement.internal.zzfx.zzas).split("\\|"), bundle2, m);
        zzN(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", m);
        if (!zzicVar.zzaE().isEmpty()) {
            zzN(builder, "dma_cps", zzicVar.zzaE(), m);
        }
        if (zzicVar.zzaK()) {
            com.google.android.gms.internal.measurement.zzha zzaL = zzicVar.zzaL();
            if (!zzaL.zzb().isEmpty()) {
                zzN(builder, "dl_gclid", zzaL.zzb(), m);
            }
            if (!zzaL.zzd().isEmpty()) {
                zzN(builder, "dl_gbraid", zzaL.zzd(), m);
            }
            if (!zzaL.zzf().isEmpty()) {
                zzN(builder, "dl_gs", zzaL.zzf(), m);
            }
            if (zzaL.zzh() > 0) {
                zzN(builder, "dl_ss_ts", java.lang.String.valueOf(zzaL.zzh()), m);
            }
            if (!zzaL.zzj().isEmpty()) {
                zzN(builder, "mr_gclid", zzaL.zzj(), m);
            }
            if (!zzaL.zzm().isEmpty()) {
                zzN(builder, "mr_gbraid", zzaL.zzm(), m);
            }
            if (!zzaL.zzo().isEmpty()) {
                zzN(builder, "mr_gs", zzaL.zzo(), m);
            }
            if (zzaL.zzq() > 0) {
                zzN(builder, "mr_click_ts", java.lang.String.valueOf(zzaL.zzq()), m);
            }
        }
        return new com.google.android.gms.measurement.internal.zzog(builder.build().toString(), currentTimeMillis, 1);
    }

    final com.google.android.gms.internal.measurement.zzhs zzh(com.google.android.gms.measurement.internal.zzbb zzbbVar) {
        com.google.android.gms.internal.measurement.zzhr zzk = com.google.android.gms.internal.measurement.zzhs.zzk();
        zzk.zzq(zzbbVar.zze);
        com.google.android.gms.measurement.internal.zzbe zzbeVar = zzbbVar.zzf;
        com.google.android.gms.measurement.internal.zzbd zzbdVar = new com.google.android.gms.measurement.internal.zzbd(zzbeVar);
        while (zzbdVar.hasNext()) {
            java.lang.String next = zzbdVar.next();
            com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzn.zzb(next);
            java.lang.Object zza = zzbeVar.zza(next);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zza);
            zzd(zzn, zza);
            zzk.zzg(zzn);
        }
        java.lang.String str = zzbbVar.zzc;
        if (!android.text.TextUtils.isEmpty(str) && zzbeVar.zza("_o") == null) {
            com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzn2.zzb("_o");
            zzn2.zzd(str);
            zzk.zzf((com.google.android.gms.internal.measurement.zzhw) zzn2.zzbc());
        }
        return (com.google.android.gms.internal.measurement.zzhs) zzk.zzbc();
    }

    final java.lang.String zzi(com.google.android.gms.internal.measurement.zzib zzibVar) {
        com.google.android.gms.internal.measurement.zzhe zzat;
        if (zzibVar == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nbatch {\n");
        if (zzibVar.zzf()) {
            zzS(sb, 0, "upload_subdomain", zzibVar.zzg());
        }
        if (zzibVar.zzd()) {
            zzS(sb, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (com.google.android.gms.internal.measurement.zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                zzM(sb, 1);
                sb.append("bundle {\n");
                if (zzidVar.zza()) {
                    zzS(sb, 1, "protocol_version", java.lang.Integer.valueOf(zzidVar.zzb()));
                }
                com.google.android.gms.internal.measurement.zzqu.zza();
                com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
                if (zzibVar2.zzc().zzp(zzidVar.zzA(), com.google.android.gms.measurement.internal.zzfx.zzaM) && zzidVar.zzag()) {
                    zzS(sb, 1, "session_stitching_token", zzidVar.zzah());
                }
                zzS(sb, 1, com.ironsource.M6.H, zzidVar.zzt());
                if (zzidVar.zzC()) {
                    zzS(sb, 1, "gmp_version", java.lang.Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    zzS(sb, 1, "uploading_gmp_version", java.lang.Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    zzS(sb, 1, "dynamite_version", java.lang.Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    zzS(sb, 1, "config_version", java.lang.Long.valueOf(zzidVar.zzX()));
                }
                zzS(sb, 1, "gmp_app_id", zzidVar.zzP());
                zzS(sb, 1, "app_id", zzidVar.zzA());
                zzS(sb, 1, "app_version", zzidVar.zzB());
                if (zzidVar.zzU()) {
                    zzS(sb, 1, "app_version_major", java.lang.Integer.valueOf(zzidVar.zzV()));
                }
                zzS(sb, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    zzS(sb, 1, "dev_cert_hash", java.lang.Long.valueOf(zzidVar.zzL()));
                }
                zzS(sb, 1, "app_store", zzidVar.zzz());
                if (zzidVar.zzi()) {
                    zzS(sb, 1, "upload_timestamp_millis", java.lang.Long.valueOf(zzidVar.zzj()));
                }
                if (zzidVar.zzk()) {
                    zzS(sb, 1, "start_timestamp_millis", java.lang.Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    zzS(sb, 1, "end_timestamp_millis", java.lang.Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    zzS(sb, 1, "previous_bundle_start_timestamp_millis", java.lang.Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    zzS(sb, 1, "previous_bundle_end_timestamp_millis", java.lang.Long.valueOf(zzidVar.zzs()));
                }
                zzS(sb, 1, "app_instance_id", zzidVar.zzJ());
                zzS(sb, 1, "resettable_device_id", zzidVar.zzG());
                zzS(sb, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    zzS(sb, 1, "limited_ad_tracking", java.lang.Boolean.valueOf(zzidVar.zzI()));
                }
                zzS(sb, 1, "os_version", zzidVar.zzu());
                zzS(sb, 1, "device_model", zzidVar.zzv());
                zzS(sb, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    zzS(sb, 1, "time_zone_offset_minutes", java.lang.Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    zzS(sb, 1, "bundle_sequential_index", java.lang.Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    zzS(sb, 1, "delivery_index", java.lang.Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    zzS(sb, 1, "service_upload", java.lang.Boolean.valueOf(zzidVar.zzR()));
                }
                zzS(sb, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    zzS(sb, 1, "retry_counter", java.lang.Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    zzS(sb, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    zzS(sb, 1, "is_dma_region", java.lang.Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    zzS(sb, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    zzS(sb, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    zzS(sb, 1, "target_os_version", java.lang.Long.valueOf(zzidVar.zzaj()));
                }
                com.google.android.gms.internal.measurement.zzql.zza();
                if (zzibVar2.zzc().zzp(zzidVar.zzA(), com.google.android.gms.measurement.internal.zzfx.zzaP)) {
                    zzS(sb, 1, "ad_services_version", java.lang.Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzat = zzidVar.zzat()) != null) {
                        zzM(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        zzS(sb, 2, "eligible", java.lang.Boolean.valueOf(zzat.zza()));
                        zzS(sb, 2, "no_access_adservices_attribution_permission", java.lang.Boolean.valueOf(zzat.zzb()));
                        zzS(sb, 2, "pre_r", java.lang.Boolean.valueOf(zzat.zzc()));
                        zzS(sb, 2, "r_extensions_too_old", java.lang.Boolean.valueOf(zzat.zzd()));
                        zzS(sb, 2, "adservices_extension_too_old", java.lang.Boolean.valueOf(zzat.zze()));
                        zzS(sb, 2, "ad_storage_not_allowed", java.lang.Boolean.valueOf(zzat.zzf()));
                        zzS(sb, 2, "measurement_manager_disabled", java.lang.Boolean.valueOf(zzat.zzg()));
                        zzM(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    com.google.android.gms.internal.measurement.zzha zzax = zzidVar.zzax();
                    zzM(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (zzax.zza()) {
                        zzS(sb, 2, "deep_link_gclid", zzax.zzb());
                    }
                    if (zzax.zzc()) {
                        zzS(sb, 2, "deep_link_gbraid", zzax.zzd());
                    }
                    if (zzax.zze()) {
                        zzS(sb, 2, "deep_link_gad_source", zzax.zzf());
                    }
                    if (zzax.zzg()) {
                        zzS(sb, 2, "deep_link_session_millis", java.lang.Long.valueOf(zzax.zzh()));
                    }
                    if (zzax.zzi()) {
                        zzS(sb, 2, "market_referrer_gclid", zzax.zzj());
                    }
                    if (zzax.zzk()) {
                        zzS(sb, 2, "market_referrer_gbraid", zzax.zzm());
                    }
                    if (zzax.zzn()) {
                        zzS(sb, 2, "market_referrer_gad_source", zzax.zzo());
                    }
                    if (zzax.zzp()) {
                        zzS(sb, 2, "market_referrer_click_millis", java.lang.Long.valueOf(zzax.zzq()));
                    }
                    zzM(sb, 2);
                    sb.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    zzS(sb, 1, "batching_timestamp_millis", java.lang.Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    com.google.android.gms.internal.measurement.zzis zzaz = zzidVar.zzaz();
                    zzM(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int zzf = zzaz.zzf();
                    zzS(sb, 2, "upload_type", zzf != 1 ? zzf != 2 ? zzf != 3 ? zzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    zzS(sb, 2, "client_upload_eligibility", zzaz.zza().name());
                    int zzg = zzaz.zzg();
                    zzS(sb, 2, "service_upload_eligibility", zzg != 1 ? zzg != 2 ? zzg != 3 ? zzg != 4 ? zzg != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    zzM(sb, 2);
                    sb.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    com.google.android.gms.internal.measurement.zzho zzaD = zzidVar.zzaD();
                    zzM(sb, 2);
                    sb.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.zzhl zzhlVar : zzaD.zza()) {
                        zzM(sb, 3);
                        sb.append("limited_data_modes {\n");
                        int zzc = zzhlVar.zzc();
                        zzS(sb, 3, "type", zzc != 1 ? zzc != 2 ? zzc != 3 ? zzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int zzd = zzhlVar.zzd();
                        zzS(sb, 3, com.ironsource.X3.a.t, zzd != 1 ? zzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        zzM(sb, 3);
                        sb.append("}\n");
                    }
                    zzM(sb, 2);
                    sb.append("}\n");
                }
                java.util.List<com.google.android.gms.internal.measurement.zziu> zzf2 = zzidVar.zzf();
                if (zzf2 != null) {
                    for (com.google.android.gms.internal.measurement.zziu zziuVar : zzf2) {
                        if (zziuVar != null) {
                            zzM(sb, 2);
                            sb.append("user_property {\n");
                            zzS(sb, 2, "set_timestamp_millis", zziuVar.zza() ? java.lang.Long.valueOf(zziuVar.zzb()) : null);
                            zzS(sb, 2, "name", zzibVar2.zzl().zzc(zziuVar.zzc()));
                            zzS(sb, 2, "string_value", zziuVar.zze());
                            zzS(sb, 2, "int_value", zziuVar.zzf() ? java.lang.Long.valueOf(zziuVar.zzg()) : null);
                            zzS(sb, 2, "double_value", zziuVar.zzj() ? java.lang.Double.valueOf(zziuVar.zzk()) : null);
                            zzM(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzhg> zzS = zzidVar.zzS();
                if (zzS != null) {
                    for (com.google.android.gms.internal.measurement.zzhg zzhgVar : zzS) {
                        if (zzhgVar != null) {
                            zzM(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                zzS(sb, 2, "audience_id", java.lang.Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                zzS(sb, 2, "new_audience", java.lang.Boolean.valueOf(zzhgVar.zzg()));
                            }
                            zzR(sb, 2, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                zzR(sb, 2, "previous_data", zzhgVar.zze());
                            }
                            zzM(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzhs> zzc2 = zzidVar.zzc();
                if (zzc2 != null) {
                    for (com.google.android.gms.internal.measurement.zzhs zzhsVar : zzc2) {
                        if (zzhsVar != null) {
                            zzM(sb, 2);
                            sb.append("event {\n");
                            zzS(sb, 2, "name", zzibVar2.zzl().zza(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                zzS(sb, 2, "timestamp_millis", java.lang.Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzhsVar.zzg()) {
                                zzS(sb, 2, "previous_timestamp_millis", java.lang.Long.valueOf(zzhsVar.zzh()));
                            }
                            if (zzhsVar.zzi()) {
                                zzS(sb, 2, com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(zzhsVar.zzj()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                zzK(sb, 2, zzhsVar.zza());
                            }
                            zzM(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zzM(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    final java.lang.String zzj(com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar == null) {
            return kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzffVar.zza()) {
            zzS(sb, 0, "filter_id", java.lang.Integer.valueOf(zzffVar.zzb()));
        }
        zzS(sb, 0, "event_name", this.zzu.zzl().zza(zzffVar.zzc()));
        java.lang.String zzO = zzO(zzffVar.zzi(), zzffVar.zzj(), zzffVar.zzm());
        if (!zzO.isEmpty()) {
            zzS(sb, 0, "filter_type", zzO);
        }
        if (zzffVar.zzg()) {
            zzT(sb, 1, "event_count_filter", zzffVar.zzh());
        }
        if (zzffVar.zze() > 0) {
            sb.append("  filters {\n");
            java.util.Iterator it = zzffVar.zzd().iterator();
            while (it.hasNext()) {
                zzL(sb, 2, (com.google.android.gms.internal.measurement.zzfh) it.next());
            }
        }
        zzM(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final java.lang.String zzk(com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        if (zzfnVar == null) {
            return kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            zzS(sb, 0, "filter_id", java.lang.Integer.valueOf(zzfnVar.zzb()));
        }
        zzS(sb, 0, "property_name", this.zzu.zzl().zzc(zzfnVar.zzc()));
        java.lang.String zzO = zzO(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzh());
        if (!zzO.isEmpty()) {
            zzS(sb, 0, "filter_type", zzO);
        }
        zzL(sb, 1, zzfnVar.zzd());
        sb.append("}\n");
        return sb.toString();
    }

    final android.os.Parcelable zzl(byte[] bArr, android.os.Parcelable.Creator creator) {
        android.os.Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (android.os.Parcelable) creator.createFromParcel(obtain);
            } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused) {
                this.zzu.zzaV().zzb().zza("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    final java.util.List zzq(java.util.List list, java.util.List list2) {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num.intValue() < 0) {
                this.zzu.zzaV().zze().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzu.zzaV().zze().zzc("Ignoring bit index greater than bitSet size", num, java.lang.Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, java.lang.Long.valueOf(((java.lang.Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((java.lang.Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final boolean zzs(long j, long j2) {
        return j == 0 || j2 <= 0 || java.lang.Math.abs(this.zzu.zzaZ().currentTimeMillis() - j) > j2;
    }

    final long zzt(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzk().zzg();
        java.security.MessageDigest zzO = com.google.android.gms.measurement.internal.zzpo.zzO();
        if (zzO != null) {
            return com.google.android.gms.measurement.internal.zzpo.zzP(zzO.digest(bArr));
        }
        zzibVar.zzaV().zzb().zza("Failed to get MD5");
        return 0L;
    }

    final long zzu(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzt(str.getBytes(java.nio.charset.Charset.forName("UTF-8")));
    }

    final byte[] zzv(byte[] bArr) throws java.io.IOException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            this.zzu.zzaV().zzb().zzb("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(zzz((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(zzz((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(zzz((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.util.Map zzz(android.os.Bundle bundle, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            java.lang.Object obj = bundle.get(next);
            boolean z2 = obj instanceof android.os.Parcelable[];
            if (!z2 && !(obj instanceof java.util.ArrayList) && !(obj instanceof android.os.Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }
}
