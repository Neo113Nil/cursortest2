package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class P2 {
    public static java.util.HashMap a() {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return hashMap;
        }
        int cellOperatorFlag = com.inmobi.media.AbstractC2676pj.a().getCellOperatorFlag();
        boolean z = (cellOperatorFlag & 2) == 2;
        boolean z2 = (cellOperatorFlag & 1) == 1;
        com.inmobi.media.N2 n2 = new com.inmobi.media.N2();
        java.lang.Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
        if (!z) {
            int[] a2 = a(telephonyManager.getNetworkOperator());
            n2.f4844a = a2[0];
            n2.b = a2[1];
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                java.lang.String lowerCase = networkCountryIso.toLowerCase(ENGLISH);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                n2.e = lowerCase;
            }
        }
        if (!z2) {
            int[] a3 = a(telephonyManager.getSimOperator());
            n2.c = a3[0];
            n2.d = a3[1];
        }
        java.lang.String b = n2.b();
        if (b != null) {
            hashMap.put("s-ho", b);
        }
        java.lang.String a4 = n2.a();
        if (a4 != null) {
            hashMap.put("s-co", a4);
        }
        java.lang.String str2 = n2.e;
        if (str2 != null) {
            hashMap.put("s-iso", str2);
        }
        com.inmobi.media.B5.f4614a.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService2 = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        android.telephony.TelephonyManager telephonyManager2 = systemService2 instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService2 : null;
        if (telephonyManager2 == null || (str = telephonyManager2.getNetworkOperatorName()) == null) {
            str = "";
        }
        hashMap.put("s-cn", str);
        return hashMap;
    }

    public static java.util.HashMap b() {
        android.content.Context context;
        com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
        com.inmobi.media.O2 o2 = null;
        if ((com.inmobi.media.Xi.b() == null || com.inmobi.media.AbstractC2676pj.a().isConnectedCellTowerEnabled()) && d() && e() && (context = com.inmobi.media.Xi.f5051a) != null) {
            java.lang.Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
            int[] a2 = a(telephonyManager.getNetworkOperator());
            java.lang.String valueOf = java.lang.String.valueOf(a2[0]);
            java.lang.String valueOf2 = java.lang.String.valueOf(a2[1]);
            java.util.List<android.telephony.CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int size = allCellInfo.size();
                android.telephony.CellInfo cellInfo = null;
                for (int i = 0; i < size; i++) {
                    cellInfo = allCellInfo.get(i);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    o2 = new com.inmobi.media.O2(cellInfo, valueOf, valueOf2, android.os.Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
                }
            }
            android.telephony.CellLocation cellLocation = telephonyManager.getCellLocation();
            if (cellLocation != null && a2[0] != -1) {
                o2 = new com.inmobi.media.O2();
                if (cellLocation instanceof android.telephony.cdma.CdmaCellLocation) {
                    o2.b = Integer.MAX_VALUE;
                    o2.c = android.os.Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    android.telephony.cdma.CdmaCellLocation cdmaCellLocation = (android.telephony.cdma.CdmaCellLocation) cellLocation;
                    o2.f4866a = com.inmobi.media.O2.a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    android.telephony.gsm.GsmCellLocation gsmCellLocation = (android.telephony.gsm.GsmCellLocation) cellLocation;
                    o2.b = Integer.MAX_VALUE;
                    o2.c = android.os.Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    o2.f4866a = com.inmobi.media.O2.a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (o2 != null) {
            hashMap.put("c-sc", o2.a().toString());
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.HashMap c() {
        java.util.ArrayList arrayList;
        if (com.inmobi.media.Xi.d() && d() && e()) {
            com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
            if (com.inmobi.media.Xi.b() == null || com.inmobi.media.AbstractC2676pj.a().isVisibleCellTowerEnabled()) {
                android.content.Context context = com.inmobi.media.Xi.f5051a;
                if (context == null) {
                    arrayList = new java.util.ArrayList();
                } else {
                    java.lang.Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int[] a2 = a(telephonyManager.getNetworkOperator());
                    java.lang.String valueOf = java.lang.String.valueOf(a2[0]);
                    java.lang.String valueOf2 = java.lang.String.valueOf(a2[1]);
                    java.util.List<android.telephony.CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null) {
                        for (android.telephony.CellInfo cellInfo : allCellInfo) {
                            if (!cellInfo.isRegistered()) {
                                arrayList2.add(new com.inmobi.media.O2(cellInfo, valueOf, valueOf2, android.os.Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()));
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                if (!arrayList.isEmpty()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(((com.inmobi.media.O2) arrayList.get(arrayList.size() - 1)).a());
                    hashMap.put("v-sc", jSONArray.toString());
                }
                return hashMap;
            }
        }
        arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (!arrayList.isEmpty()) {
        }
        return hashMap2;
    }

    public static boolean d() {
        if (!com.inmobi.media.Xi.d()) {
            return false;
        }
        boolean a2 = com.inmobi.media.Sf.a(com.inmobi.media.Xi.f5051a, "android.permission.READ_PHONE_STATE");
        boolean a3 = com.inmobi.media.Sf.a(com.inmobi.media.Xi.f5051a, "android.permission.ACCESS_FINE_LOCATION");
        int i = android.os.Build.VERSION.SDK_INT;
        if (i == 29) {
            if (!a3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("P2", "TAG");
            }
            return a3;
        }
        if (i >= 30) {
            if (!a3 || !a2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("P2", "TAG");
            }
            return a3 && a2;
        }
        boolean a4 = com.inmobi.media.Sf.a(com.inmobi.media.Xi.f5051a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!a4 && !a3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("P2", "TAG");
        }
        return a4 || a3;
    }

    public static boolean e() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return true;
        }
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        java.lang.Object systemService = context != null ? context.getSystemService(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION) : null;
        android.location.LocationManager locationManager = systemService instanceof android.location.LocationManager ? (android.location.LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static int[] a(java.lang.String str) {
        int[] iArr = {-1, -1};
        if (str != null && !kotlin.jvm.internal.Intrinsics.areEqual("", str)) {
            try {
                java.lang.String substring = str.substring(0, 3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int parseInt = java.lang.Integer.parseInt(substring);
                java.lang.String substring2 = str.substring(3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                int parseInt2 = java.lang.Integer.parseInt(substring2);
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
