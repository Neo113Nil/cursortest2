package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpo extends com.google.android.gms.measurement.internal.zzje {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.String[] zzb = {"firebase_", "google_", "ga_"};
    private static final java.lang.String[] zzc = {"_err"};
    private java.security.SecureRandom zzd;
    private final java.util.concurrent.atomic.AtomicLong zze;
    private int zzf;
    private androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzg;
    private java.lang.Boolean zzh;
    private java.lang.Integer zzi;

    zzpo(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzi = null;
        this.zze = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    static java.security.MessageDigest zzO() {
        java.security.MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = java.security.MessageDigest.getInstance("MD5");
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    static long zzP(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        com.google.android.gms.common.internal.Preconditions.checkState(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    static boolean zzQ(android.content.Context context, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        return android.os.Build.VERSION.SDK_INT >= 24 ? zzR(context, "com.google.android.gms.measurement.AppMeasurementJobService") : zzR(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean zzR(android.content.Context context, java.lang.String str) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean zzZ(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean zzaA(java.lang.String str, java.lang.String[] strArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        for (java.lang.String str2 : strArr) {
            if (java.util.Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzaf(java.lang.String str) {
        return !zzc[0].equals(str);
    }

    public static java.util.ArrayList zzas(java.util.List list) {
        if (list == null) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.measurement.internal.zzah zzahVar = (com.google.android.gms.measurement.internal.zzah) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("app_id", zzahVar.zza);
            bundle.putString("origin", zzahVar.zzb);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzahVar.zzd);
            bundle.putString("name", zzahVar.zzc.zzb);
            com.google.android.gms.measurement.internal.zzjg.zza(bundle, com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zzc.zza()));
            bundle.putBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzahVar.zze);
            java.lang.String str = zzahVar.zzf;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            com.google.android.gms.measurement.internal.zzbg zzbgVar = zzahVar.zzg;
            if (zzbgVar != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbgVar.zza);
                com.google.android.gms.measurement.internal.zzbe zzbeVar = zzbgVar.zzb;
                if (zzbeVar != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbeVar.zzf());
                }
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzahVar.zzh);
            com.google.android.gms.measurement.internal.zzbg zzbgVar2 = zzahVar.zzi;
            if (zzbgVar2 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbgVar2.zza);
                com.google.android.gms.measurement.internal.zzbe zzbeVar2 = zzbgVar2.zzb;
                if (zzbeVar2 != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbeVar2.zzf());
                }
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzahVar.zzc.zzc);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzahVar.zzj);
            com.google.android.gms.measurement.internal.zzbg zzbgVar3 = zzahVar.zzk;
            if (zzbgVar3 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbgVar3.zza);
                com.google.android.gms.measurement.internal.zzbe zzbeVar3 = zzbgVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbeVar3.zzf());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean zzau(android.content.Context context) {
        android.content.pm.ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new android.content.ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void zzav(com.google.android.gms.measurement.internal.zzlt zzltVar, android.os.Bundle bundle, boolean z) {
        if (bundle != null && zzltVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                java.lang.String str = zzltVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                java.lang.String str2 = zzltVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzltVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzltVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    static final boolean zzax(android.os.Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    private final java.lang.Object zzay(int i, java.lang.Object obj, boolean z, boolean z2, java.lang.String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Double)) {
            return obj;
        }
        if (obj instanceof java.lang.Integer) {
            return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Byte) {
            return java.lang.Long.valueOf(((java.lang.Byte) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return java.lang.Long.valueOf(((java.lang.Short) obj).shortValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.Long.valueOf(true != ((java.lang.Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.CharSequence)) {
            return zzC(obj.toString(), i, z);
        }
        if (!z2 || (!(obj instanceof android.os.Bundle[]) && !(obj instanceof android.os.Parcelable[]))) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
            if (parcelable instanceof android.os.Bundle) {
                android.os.Bundle zzab = zzab((android.os.Bundle) parcelable, null);
                if (!zzab.isEmpty()) {
                    arrayList.add(zzab);
                }
            }
        }
        return arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    private final int zzaz(java.lang.String str) {
        if ("_ldl".equals(str)) {
            this.zzu.zzc();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzu.zzc();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzu.zzc();
            return 100;
        }
        this.zzu.zzc();
        return 36;
    }

    static boolean zzh(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    final boolean zzA(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.zzu.zzaV().zzd().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.zzu.zzaV().zzd().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", com.google.android.gms.measurement.internal.zzgt.zzl(str));
        return false;
    }

    final boolean zzB(java.lang.String str, java.lang.String str2) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        boolean isEmpty2 = android.text.TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String zzC(java.lang.String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (!z) {
            return null;
        }
        java.lang.String substring = str.substring(0, str.offsetByCodePoints(0, i));
        java.lang.String.valueOf(substring);
        return java.lang.String.valueOf(substring).concat("...");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzD(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, android.os.Bundle bundle, java.util.List list, boolean z, boolean z2) {
        int i;
        int size;
        zzg();
        if (zzt(obj)) {
            if (!z2) {
                return 21;
            }
            if (!zzaA(str3, com.google.android.gms.measurement.internal.zzjm.zzc)) {
                return 20;
            }
            com.google.android.gms.measurement.internal.zznk zzt = this.zzu.zzt();
            zzt.zzg();
            zzt.zzb();
            if (zzt.zzK() && zzt.zzu.zzk().zzah() < 200900) {
                return 25;
            }
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzc();
            boolean z3 = obj instanceof android.os.Parcelable[];
            if (z3) {
                size = ((android.os.Parcelable[]) obj).length;
            } else if (obj instanceof java.util.ArrayList) {
                size = ((java.util.ArrayList) obj).size();
            }
            if (size > 200) {
                zzibVar.zzaV().zzh().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, java.lang.Integer.valueOf(size));
                zzibVar.zzc();
                if (z3) {
                    android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (android.os.Parcelable[]) java.util.Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof java.util.ArrayList) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new java.util.ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
                if (!zzu("param", str3, (!zzZ(str2) || zzZ(str3)) ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zze(null, false), obj)) {
                    return i;
                }
                if (!z2) {
                    return 4;
                }
                if (obj instanceof android.os.Bundle) {
                    zzz(str, str2, str3, (android.os.Bundle) obj, list, z);
                } else if (obj instanceof android.os.Parcelable[]) {
                    for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
                        if (!(parcelable instanceof android.os.Bundle)) {
                            this.zzu.zzaV().zzh().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                            return 4;
                        }
                        zzz(str, str2, str3, (android.os.Bundle) parcelable, list, z);
                    }
                } else {
                    if (!(obj instanceof java.util.ArrayList)) {
                        return 4;
                    }
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        java.lang.Object obj2 = arrayList2.get(i2);
                        if (!(obj2 instanceof android.os.Bundle)) {
                            this.zzu.zzaV().zzh().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL, str3);
                            return 4;
                        }
                        zzz(str, str2, str3, (android.os.Bundle) obj2, list, z);
                    }
                }
                return i;
            }
        }
        i = 0;
        if (!zzu("param", str3, (!zzZ(str2) || zzZ(str3)) ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zze(null, false), obj)) {
        }
    }

    final java.lang.Object zzE(java.lang.String str, java.lang.Object obj) {
        if ("_ev".equals(str)) {
            return zzay(this.zzu.zzc().zzf(null, false), obj, true, true, null);
        }
        return zzay(zzZ(str) ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zze(null, false), obj, false, true, null);
    }

    final android.os.Bundle zzF(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.util.List list, boolean z) {
        int zzq;
        int i;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        java.util.List list2 = list;
        boolean zzaA = zzaA(str2, com.google.android.gms.measurement.internal.zzjl.zzd);
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        int zzc2 = zzibVar2.zzc().zzc();
        int i2 = 0;
        boolean z2 = false;
        for (java.lang.String str3 : new java.util.TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                zzq = !z ? zzq(str3) : 0;
                if (zzq == 0) {
                    zzq = zzs(str3);
                }
            } else {
                zzq = 0;
            }
            if (zzq != 0) {
                zzJ(bundle2, zzq, str3, zzq == 3 ? str3 : null);
                bundle2.remove(str3);
                i = zzc2;
                zzibVar = zzibVar2;
            } else {
                i = zzc2;
                zzibVar = zzibVar2;
                int zzD = zzD(str, str2, str3, bundle.get(str3), bundle2, list, z, zzaA);
                if (zzD == 17) {
                    zzJ(bundle2, 17, str3, false);
                } else if (zzD != 0 && !"_ev".equals(str3)) {
                    zzJ(bundle2, zzD, zzD == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3)) {
                    int i3 = i2 + 1;
                    if (i3 > i) {
                        if (!zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbf) || !z2) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            zzibVar.zzaV().zzd().zzc(sb.toString(), zzibVar.zzl().zza(str2), zzibVar.zzl().zze(bundle));
                        }
                        zzax(bundle2, 5);
                        bundle2.remove(str3);
                        z2 = true;
                    }
                    i2 = i3;
                    zzc2 = i;
                    zzibVar2 = zzibVar;
                    list2 = list;
                }
            }
            zzc2 = i;
            zzibVar2 = zzibVar;
            list2 = list;
        }
        return bundle2;
    }

    final void zzG(com.google.android.gms.measurement.internal.zzgu zzguVar, int i) {
        android.os.Bundle bundle = zzguVar.zzd;
        int i2 = 0;
        boolean z = false;
        for (java.lang.String str : new java.util.TreeSet(bundle.keySet())) {
            if (zzh(str) && (i2 = i2 + 1) > i) {
                com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                if (!zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbf) || !z) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    zzibVar.zzaV().zzd().zzc(sb.toString(), zzibVar.zzl().zza(zzguVar.zza), zzibVar.zzl().zze(bundle));
                    zzax(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    final void zzH(android.os.Parcelable[] parcelableArr, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcelableArr);
        for (android.os.Parcelable parcelable : parcelableArr) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (java.lang.String str : new java.util.TreeSet(bundle.keySet())) {
                if (zzh(str) && !zzaA(str, com.google.android.gms.measurement.internal.zzjm.zzd) && (i2 = i2 + 1) > i) {
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    if (!zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbf) || !z) {
                        com.google.android.gms.measurement.internal.zzgr zzd = zzibVar.zzaV().zzd();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        zzd.zzc(sb.toString(), zzibVar.zzl().zzb(str), zzibVar.zzl().zze(bundle));
                    }
                    zzax(bundle, 28);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    final void zzI(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (java.lang.String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzu.zzk().zzM(bundle, str, bundle2.get(str));
            }
        }
    }

    final void zzJ(android.os.Bundle bundle, int i, java.lang.String str, java.lang.Object obj) {
        if (zzax(bundle, i)) {
            this.zzu.zzc();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
                if ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final int zzK(java.lang.String str, java.lang.Object obj) {
        return "_ldl".equals(str) ? zzu("user property referrer", str, zzaz(str), obj) : zzu("user property", str, zzaz(str), obj) ? 0 : 7;
    }

    final java.lang.Object zzL(java.lang.String str, java.lang.Object obj) {
        return "_ldl".equals(str) ? zzay(zzaz(str), obj, true, false, null) : zzay(zzaz(str), obj, false, false, null);
    }

    final void zzM(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof java.lang.Long) {
            bundle.putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            bundle.putString(str, java.lang.String.valueOf(obj));
            return;
        }
        if (obj instanceof java.lang.Double) {
            bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof android.os.Bundle[]) {
            bundle.putParcelableArray(str, (android.os.Bundle[]) obj);
        } else if (str != null) {
            java.lang.String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzh().zzc("Not putting event parameter. Invalid value type. name, type", zzibVar.zzl().zzb(str), simpleName);
        }
    }

    final void zzN(com.google.android.gms.measurement.internal.zzpn zzpnVar, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        zzax(bundle, i);
        if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        zzpnVar.zza(str, "_err", bundle);
    }

    final boolean zzS() {
        zzg();
        return zzV() == 1;
    }

    final androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzT() {
        if (this.zzg == null) {
            this.zzg = androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.from(this.zzu.zzaY());
        }
        return this.zzg;
    }

    final int zzU() {
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.ext.SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return android.os.ext.SdkExtensions.getExtensionVersion(1000000);
    }

    final long zzV() {
        long j;
        zzg();
        if (!zzX(this.zzu.zzv().zzj())) {
            return 0L;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (android.os.ext.SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            int zzU = zzU();
            zzibVar.zzc();
            j = zzU < ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzal.zzb(null)).intValue() ? 16L : 0L;
        }
        if (!zzY("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0 && !zzW()) {
            j = 64;
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    final boolean zzW() {
        java.lang.Object e;
        java.lang.Integer num;
        boolean z;
        if (this.zzh == null) {
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzT = zzT();
            if (zzT == null) {
                return false;
            }
            try {
                num = zzT.getMeasurementApiStatusAsync().get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e2) {
                e = e2;
                num = null;
            }
            if (num != null) {
                try {
                    z = true;
                } catch (java.lang.InterruptedException e3) {
                    e = e3;
                    this.zzu.zzaV().zze().zzb("Measurement manager api exception", e);
                    this.zzh = false;
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                    return this.zzh.booleanValue();
                } catch (java.util.concurrent.CancellationException e4) {
                    e = e4;
                    this.zzu.zzaV().zze().zzb("Measurement manager api exception", e);
                    this.zzh = false;
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                    return this.zzh.booleanValue();
                } catch (java.util.concurrent.ExecutionException e5) {
                    e = e5;
                    this.zzu.zzaV().zze().zzb("Measurement manager api exception", e);
                    this.zzh = false;
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                    return this.zzh.booleanValue();
                } catch (java.util.concurrent.TimeoutException e6) {
                    e = e6;
                    this.zzu.zzaV().zze().zzb("Measurement manager api exception", e);
                    this.zzh = false;
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                    return this.zzh.booleanValue();
                }
                if (num.intValue() == 1) {
                    this.zzh = java.lang.Boolean.valueOf(z);
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                }
            }
            z = false;
            this.zzh = java.lang.Boolean.valueOf(z);
            this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
        }
        return this.zzh.booleanValue();
    }

    final boolean zzX(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzar.zzb(null);
        return str2.equals("*") || java.util.Arrays.asList(str2.split(",")).contains(str);
    }

    final boolean zzY(java.lang.String str) {
        zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(zzibVar.zzaY()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzibVar.zzaV().zzj().zzb("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    protected final boolean zza() {
        return true;
    }

    final boolean zzaa(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str2)) {
            return true;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        java.lang.String zzA = zzibVar.zzc().zzA();
        zzibVar.zzaU();
        return zzA.equals(str);
    }

    final android.os.Bundle zzab(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            for (java.lang.String str2 : bundle.keySet()) {
                java.lang.Object zzE = zzE(str2, bundle.get(str2));
                if (zzE == null) {
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    zzibVar.zzaV().zzh().zzb("Param value can't be null", zzibVar.zzl().zzb(str2));
                } else {
                    zzM(bundle2, str2, zzE);
                }
            }
        }
        return bundle2;
    }

    final com.google.android.gms.measurement.internal.zzbg zzac(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, long j, boolean z, boolean z2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzn(str2) != 0) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzb().zzb("Invalid conditional property event name", zzibVar.zzl().zzc(str2));
            throw new java.lang.IllegalArgumentException();
        }
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        bundle2.putString("_o", str3);
        android.os.Bundle zzF = zzF(str, str2, bundle2, com.google.android.gms.common.util.CollectionUtils.listOf("_o"), true);
        if (z) {
            zzF = zzab(zzF, str);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzF);
        return new com.google.android.gms.measurement.internal.zzbg(str2, new com.google.android.gms.measurement.internal.zzbe(zzF), str3, j);
    }

    final boolean zzad(android.content.Context context, java.lang.String str) {
        javax.security.auth.x500.X500Principal x500Principal = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            return ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            this.zzu.zzaV().zzb().zzb("Package name not found", e);
            return true;
        } catch (java.security.cert.CertificateException e2) {
            this.zzu.zzaV().zzb().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    final byte[] zzae(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final boolean zzag(int i, boolean z) {
        java.lang.Boolean zzJ = this.zzu.zzt().zzJ();
        if (zzah() < i / 1000) {
            return (zzJ == null || zzJ.booleanValue()) ? false : true;
        }
        return true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.apkVersion"})
    public final int zzah() {
        if (this.zzi == null) {
            this.zzi = java.lang.Integer.valueOf(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzu.zzaY()) / 1000);
        }
        return this.zzi.intValue();
    }

    public final int zzai(int i) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaY(), com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzaj(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    final void zzak(android.os.Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.zzu.zzaV().zze().zzb("Params already contained engagement", java.lang.Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void zzal(com.google.android.gms.internal.measurement.zzcu zzcuVar, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str);
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zze().zzb("Error returning string value to wrapper", e);
        }
    }

    public final void zzam(com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j);
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zze().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzan(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i);
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zze().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzao(com.google.android.gms.internal.measurement.zzcu zzcuVar, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zze().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzap(com.google.android.gms.internal.measurement.zzcu zzcuVar, boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z);
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zze().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzaq(com.google.android.gms.internal.measurement.zzcu zzcuVar, android.os.Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zze().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzar(com.google.android.gms.internal.measurement.zzcu zzcuVar, java.util.ArrayList arrayList) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zze().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final java.net.URL zzat(long j, java.lang.String str, java.lang.String str2, long j2, java.lang.String str3) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            java.lang.String format = java.lang.String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", java.lang.String.format("v%s.%s", 130000L, java.lang.Integer.valueOf(zzah())), str2, str, java.lang.Long.valueOf(j2));
            if (str.equals(this.zzu.zzc().zzB())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat(com.ironsource.X3.j.c);
                }
                format = format.concat(str3);
            }
            return new java.net.URL(format);
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException e) {
            this.zzu.zzaV().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    final java.lang.String zzaw() {
        byte[] bArr = new byte[16];
        zzf().nextBytes(bArr);
        return java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    protected final void zzba() {
        zzg();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.zzu.zzaV().zze().zza("Utils falling back to Random for random id");
            }
        }
        this.zze.set(nextLong);
    }

    public final long zzd() {
        long andIncrement;
        long j;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zze;
        if (atomicLong.get() != 0) {
            java.util.concurrent.atomic.AtomicLong atomicLong2 = this.zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nextLong = new java.util.Random(java.lang.System.nanoTime() ^ this.zzu.zzaZ().currentTimeMillis()).nextLong();
            int i = this.zzf + 1;
            this.zzf = i;
            j = nextLong + i;
        }
        return j;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.secureRandom"})
    final java.security.SecureRandom zzf() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new java.security.SecureRandom();
        }
        return this.zzd;
    }

    final android.os.Bundle zzi(android.net.Uri uri) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2) && android.text.TextUtils.isEmpty(str3) && android.text.TextUtils.isEmpty(str4) && android.text.TextUtils.isEmpty(str5) && android.text.TextUtils.isEmpty(str6) && android.text.TextUtils.isEmpty(str7) && android.text.TextUtils.isEmpty(str8) && android.text.TextUtils.isEmpty(str9)) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            if (android.text.TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!android.text.TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!android.text.TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!android.text.TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            java.lang.String queryParameter = uri.getQueryParameter("gad_source");
            if (!android.text.TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            java.lang.String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.TERM, queryParameter2);
            }
            java.lang.String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            java.lang.String queryParameter4 = uri.getQueryParameter(com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID);
            if (!android.text.TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID, queryParameter4);
            }
            java.lang.String queryParameter5 = uri.getQueryParameter(com.google.firebase.analytics.FirebaseAnalytics.Param.CP1);
            if (!android.text.TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CP1, queryParameter5);
            }
            java.lang.String queryParameter6 = uri.getQueryParameter("anid");
            if (!android.text.TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!android.text.TextUtils.isEmpty(str6)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN_ID, str6);
            }
            if (!android.text.TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            java.lang.String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!android.text.TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter7);
            }
            java.lang.String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!android.text.TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter8);
            }
            java.lang.String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!android.text.TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter9);
            }
            if (!android.text.TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!android.text.TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (java.lang.String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    java.lang.String queryParameter10 = uri.getQueryParameter(str11);
                    if (!android.text.TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (java.lang.UnsupportedOperationException e) {
            this.zzu.zzaV().zze().zzb("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final boolean zzj(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(codePointAt)) {
            this.zzu.zzaV().zzd().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = java.lang.Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(codePointAt2)) {
                this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += java.lang.Character.charCount(codePointAt2);
        }
        return true;
    }

    final boolean zzk(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.zzu.zzaV().zzd().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = java.lang.Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(codePointAt2)) {
                this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += java.lang.Character.charCount(codePointAt2);
        }
        return true;
    }

    final boolean zzl(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        java.lang.String[] strArr3 = zzb;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.zzu.zzaV().zzd().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzaA(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzaA(str2, strArr2)) {
            return true;
        }
        this.zzu.zzaV().zzd().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean zzm(java.lang.String str, int i, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.zzu.zzaV().zzd().zzd("Name is too long. Type, maximum supported length, name", str, java.lang.Integer.valueOf(i), str2);
        return false;
    }

    final int zzn(java.lang.String str) {
        if (!zzk(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!zzl(androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.google.android.gms.measurement.internal.zzjl.zza, com.google.android.gms.measurement.internal.zzjl.zzb, str)) {
            return 13;
        }
        this.zzu.zzc();
        return !zzm(androidx.core.app.NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    final int zzp(java.lang.String str) {
        if (!zzk("user property", str)) {
            return 6;
        }
        if (!zzl("user property", com.google.android.gms.measurement.internal.zzjn.zza, null, str)) {
            return 15;
        }
        this.zzu.zzc();
        return !zzm("user property", 24, str) ? 6 : 0;
    }

    final int zzq(java.lang.String str) {
        if (!zzj("event param", str)) {
            return 3;
        }
        if (!zzl("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzm("event param", 40, str) ? 3 : 0;
    }

    final int zzs(java.lang.String str) {
        if (!zzk("event param", str)) {
            return 3;
        }
        if (!zzl("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzm("event param", 40, str) ? 3 : 0;
    }

    final boolean zzt(java.lang.Object obj) {
        return (obj instanceof android.os.Parcelable[]) || (obj instanceof java.util.ArrayList) || (obj instanceof android.os.Bundle);
    }

    final boolean zzu(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.CharSequence)) {
                return false;
            }
            java.lang.String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.zzu.zzaV().zzh().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, java.lang.Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    final void zzz(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, java.util.List list, boolean z) {
        int zzq;
        int i;
        java.lang.String str4;
        int i2;
        int zzD;
        if (bundle == null) {
            return;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        int i3 = true != zzibVar.zzc().zzu.zzk().zzag(231100000, true) ? 0 : 35;
        int i4 = 0;
        boolean z2 = false;
        for (java.lang.String str5 : new java.util.TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                zzq = !z ? zzq(str5) : 0;
                if (zzq == 0) {
                    zzq = zzs(str5);
                }
            } else {
                zzq = 0;
            }
            if (zzq != 0) {
                zzJ(bundle, zzq, str5, zzq == 3 ? str5 : null);
                bundle.remove(str5);
                i = i3;
            } else {
                if (zzt(bundle.get(str5))) {
                    zzibVar.zzaV().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    zzD = 22;
                    str4 = str5;
                    i2 = i3;
                } else {
                    str4 = str5;
                    i2 = i3;
                    zzD = zzD(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (zzD != 0 && !"_ev".equals(str4)) {
                    zzJ(bundle, zzD, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzh(str4) && !zzaA(str4, com.google.android.gms.measurement.internal.zzjm.zzd)) {
                    int i5 = i4 + 1;
                    if (zzag(231100000, true)) {
                        i = i2;
                        if (i5 > i) {
                            if (!zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbf) || !z2) {
                                com.google.android.gms.measurement.internal.zzgr zzd = zzibVar.zzaV().zzd();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 55);
                                sb.append("Item can't contain more than ");
                                sb.append(i);
                                sb.append(" item-scoped custom params");
                                zzd.zzc(sb.toString(), zzibVar.zzl().zza(str2), zzibVar.zzl().zze(bundle));
                            }
                            zzax(bundle, 28);
                            bundle.remove(str4);
                            i4 = i5;
                            i3 = i;
                            z2 = true;
                        }
                    } else {
                        zzibVar.zzaV().zzd().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzibVar.zzl().zza(str2), zzibVar.zzl().zze(bundle));
                        zzax(bundle, 23);
                        bundle.remove(str4);
                        i = i2;
                    }
                    i4 = i5;
                    i3 = i;
                }
                i = i2;
            }
            i3 = i;
        }
    }
}
