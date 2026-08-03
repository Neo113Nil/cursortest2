package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaik extends com.google.android.gms.internal.ads.zzaim {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaik() {
        super(new com.google.android.gms.internal.ads.zzafv());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static java.lang.Double zzg(com.google.android.gms.internal.ads.zzet zzetVar) {
        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(zzetVar.zzD()));
    }

    private static java.lang.String zzh(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzt = zzetVar.zzt();
        int zzg = zzetVar.zzg();
        zzetVar.zzk(zzt);
        return new java.lang.String(zzetVar.zzi(), zzg, zzt);
    }

    private static java.util.HashMap zzi(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzH = zzetVar.zzH();
        java.util.HashMap hashMap = new java.util.HashMap(zzH);
        for (int i = 0; i < zzH; i++) {
            java.lang.String zzh = zzh(zzetVar);
            java.lang.Object zzj = zzj(zzetVar, zzetVar.zzs());
            if (zzj != null) {
                hashMap.put(zzh, zzj);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zza(com.google.android.gms.internal.ads.zzet zzetVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zzb(com.google.android.gms.internal.ads.zzet zzetVar, long j) {
        if (zzetVar.zzs() == 2 && "onMetaData".equals(zzh(zzetVar)) && zzetVar.zzd() != 0 && zzetVar.zzs() == 8) {
            java.util.HashMap zzi = zzi(zzetVar);
            java.lang.Object obj = zzi.get(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION);
            if (obj instanceof java.lang.Double) {
                double doubleValue = ((java.lang.Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            java.lang.Object obj2 = zzi.get("keyframes");
            if (obj2 instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj2;
                java.lang.Object obj3 = map.get("filepositions");
                java.lang.Object obj4 = map.get("times");
                if ((obj3 instanceof java.util.List) && (obj4 instanceof java.util.List)) {
                    java.util.List list = (java.util.List) obj3;
                    java.util.List list2 = (java.util.List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        java.lang.Object obj5 = list.get(i);
                        java.lang.Object obj6 = list2.get(i);
                        if (!(obj6 instanceof java.lang.Double) || !(obj5 instanceof java.lang.Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((java.lang.Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((java.lang.Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }

    private static java.lang.Object zzj(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        if (i == 0) {
            return zzg(zzetVar);
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(zzetVar.zzs() == 1);
        }
        if (i == 2) {
            return zzh(zzetVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzi(zzetVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                java.util.Date date = new java.util.Date((long) zzg(zzetVar).doubleValue());
                zzetVar.zzk(2);
                return date;
            }
            int zzH = zzetVar.zzH();
            java.util.ArrayList arrayList = new java.util.ArrayList(zzH);
            for (int i2 = 0; i2 < zzH; i2++) {
                java.lang.Object zzj = zzj(zzetVar, zzetVar.zzs());
                if (zzj != null) {
                    arrayList.add(zzj);
                }
            }
            return arrayList;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        while (true) {
            java.lang.String zzh = zzh(zzetVar);
            int zzs = zzetVar.zzs();
            if (zzs == 9) {
                return hashMap;
            }
            java.lang.Object zzj2 = zzj(zzetVar, zzs);
            if (zzj2 != null) {
                hashMap.put(zzh, zzj2);
            }
        }
    }
}
