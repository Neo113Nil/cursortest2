package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class r implements com.iovation.mobile.android.a.h {
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0066, code lost:
    
        if (r14.checkPermission("android.permission.ACCESS_COARSE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid()) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r14.checkPermission("android.permission.ACCESS_FINE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid()) != 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0100 A[Catch: ClassCastException | Exception -> 0x010f, ClassCastException | Exception -> 0x010f, TRY_ENTER, TryCatch #3 {ClassCastException | Exception -> 0x010f, blocks: (B:40:0x00d9, B:42:0x00dd, B:106:0x0100, B:106:0x0100, B:108:0x0108, B:108:0x0108), top: B:39:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c8 A[Catch: ClassCastException | Exception -> 0x00d7, ClassCastException | Exception -> 0x00d7, TRY_ENTER, TryCatch #1 {ClassCastException | Exception -> 0x00d7, blocks: (B:24:0x00a3, B:26:0x00a7, B:118:0x00c8, B:118:0x00c8, B:120:0x00d0, B:120:0x00d0), top: B:23:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[Catch: ClassCastException | Exception -> 0x00d7, TRY_LEAVE, TryCatch #1 {ClassCastException | Exception -> 0x00d7, blocks: (B:24:0x00a3, B:26:0x00a7, B:118:0x00c8, B:118:0x00c8, B:120:0x00d0, B:120:0x00d0), top: B:23:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[Catch: ClassCastException | Exception -> 0x010f, TRY_LEAVE, TryCatch #3 {ClassCastException | Exception -> 0x010f, blocks: (B:40:0x00d9, B:42:0x00dd, B:106:0x0100, B:106:0x0100, B:108:0x0108, B:108:0x0108), top: B:39:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0203  */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.telephony.CellIdentityLte] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.telephony.CellIdentityLte] */
    @Override // com.iovation.mobile.android.a.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map a(android.content.Context context) {
        java.lang.String simOperator;
        java.lang.String networkOperator;
        android.telephony.CellIdentityGsm cellIdentityGsm;
        android.telephony.gsm.GsmCellLocation gsmCellLocation;
        android.telephony.CellIdentityCdma cellIdentityCdma;
        android.telephony.cdma.CdmaCellLocation cdmaCellLocation;
        ?? r6;
        int basestationId;
        int baseStationId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object systemService = context.getSystemService("phone");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i <= 28) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.ACCESS_COARSE_LOCATION", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (context.checkPermission("android.permission.ACCESS_COARSE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid()) != 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.ACCESS_FINE_LOCATION", "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            }
            java.util.List<android.telephony.CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            android.telephony.cdma.CdmaCellLocation cdmaCellLocation2 = null;
            try {
            } catch (java.lang.ClassCastException | java.lang.Exception unused) {
                cellIdentityGsm = null;
            }
            if (i >= 30) {
                java.util.Iterator<android.telephony.CellInfo> it = allCellInfo.iterator();
                cellIdentityGsm = null;
                while (it.hasNext()) {
                    try {
                        android.telephony.CellIdentity cellIdentity = it.next().getCellIdentity();
                        cellIdentityGsm = cellIdentity instanceof android.telephony.CellIdentityGsm ? (android.telephony.CellIdentityGsm) cellIdentity : null;
                        if (cellIdentityGsm != null) {
                            break;
                        }
                    } catch (java.lang.ClassCastException | java.lang.Exception unused2) {
                    }
                }
                gsmCellLocation = null;
                try {
                } catch (java.lang.ClassCastException | java.lang.Exception unused3) {
                    cellIdentityCdma = null;
                }
                if (android.os.Build.VERSION.SDK_INT < 30) {
                    java.util.Iterator<android.telephony.CellInfo> it2 = allCellInfo.iterator();
                    cellIdentityCdma = null;
                    while (it2.hasNext()) {
                        try {
                            android.telephony.CellIdentity cellIdentity2 = it2.next().getCellIdentity();
                            cellIdentityCdma = cellIdentity2 instanceof android.telephony.CellIdentityCdma ? (android.telephony.CellIdentityCdma) cellIdentity2 : null;
                            if (cellIdentityCdma != null) {
                                break;
                            }
                        } catch (java.lang.ClassCastException | java.lang.Exception unused4) {
                        }
                    }
                    cdmaCellLocation = null;
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        android.telephony.CellLocation cellLocation = telephonyManager.getCellLocation();
                        if (cellLocation instanceof android.telephony.cdma.CdmaCellLocation) {
                            r6 = 0;
                            cdmaCellLocation2 = (android.telephony.cdma.CdmaCellLocation) cellLocation;
                        } else {
                            r6 = 0;
                        }
                        if (gsmCellLocation != null) {
                        }
                        if (cdmaCellLocation2 != null) {
                            linkedHashMap.put("CID", java.lang.String.valueOf(baseStationId));
                        }
                        if (r6 != 0) {
                        }
                        if (cellIdentityGsm != null) {
                        }
                        if (cellIdentityCdma != null) {
                            linkedHashMap.put("CID", java.lang.String.valueOf(basestationId));
                        }
                        linkedHashMap.put("CARCC", telephonyManager.getSimCountryIso());
                        simOperator = telephonyManager.getSimOperator();
                        if (simOperator != null) {
                            java.lang.String substring = simOperator.substring(3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                            linkedHashMap.put("CARNC", substring);
                            java.lang.String substring2 = simOperator.substring(0, 3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                            linkedHashMap.put("CARMC", substring2);
                        }
                        linkedHashMap.put("CARN", telephonyManager.getSimOperatorName());
                        linkedHashMap.put("CARID", telephonyManager.getNetworkOperator());
                        linkedHashMap.put("ARGCC", telephonyManager.getNetworkCountryIso());
                        networkOperator = telephonyManager.getNetworkOperator();
                        if (networkOperator != null) {
                            java.lang.String substring3 = networkOperator.substring(3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
                            linkedHashMap.put("ARGNC", substring3);
                            java.lang.String substring4 = networkOperator.substring(0, 3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "");
                            linkedHashMap.put("ARGMC", substring4);
                        }
                        linkedHashMap.put("ARGN", telephonyManager.getNetworkOperatorName());
                        if (android.os.Build.VERSION.SDK_INT <= 28) {
                        }
                        return linkedHashMap;
                    }
                    java.util.Iterator<android.telephony.CellInfo> it3 = allCellInfo.iterator();
                    android.telephony.cdma.CdmaCellLocation cdmaCellLocation3 = null;
                    while (it3.hasNext()) {
                        try {
                            android.telephony.CellIdentity cellIdentity3 = it3.next().getCellIdentity();
                            cdmaCellLocation3 = cellIdentity3 instanceof android.telephony.CellIdentityLte ? (android.telephony.CellIdentityLte) cellIdentity3 : null;
                            if (cdmaCellLocation3 != null) {
                                break;
                            }
                        } catch (java.lang.ClassCastException | java.lang.Exception unused5) {
                            cdmaCellLocation2 = cdmaCellLocation3;
                            cdmaCellLocation3 = cdmaCellLocation2;
                            cdmaCellLocation2 = cdmaCellLocation;
                            r6 = cdmaCellLocation3;
                            if (gsmCellLocation != null) {
                            }
                            if (cdmaCellLocation2 != null) {
                            }
                            if (r6 != 0) {
                            }
                            if (cellIdentityGsm != null) {
                            }
                            if (cellIdentityCdma != null) {
                            }
                            linkedHashMap.put("CARCC", telephonyManager.getSimCountryIso());
                            simOperator = telephonyManager.getSimOperator();
                            if (simOperator != null) {
                            }
                            linkedHashMap.put("CARN", telephonyManager.getSimOperatorName());
                            linkedHashMap.put("CARID", telephonyManager.getNetworkOperator());
                            linkedHashMap.put("ARGCC", telephonyManager.getNetworkCountryIso());
                            networkOperator = telephonyManager.getNetworkOperator();
                            if (networkOperator != null) {
                            }
                            linkedHashMap.put("ARGN", telephonyManager.getNetworkOperatorName());
                            if (android.os.Build.VERSION.SDK_INT <= 28) {
                            }
                            return linkedHashMap;
                        }
                    }
                    cdmaCellLocation2 = cdmaCellLocation;
                    r6 = cdmaCellLocation3;
                    if (gsmCellLocation != null) {
                        int cid = gsmCellLocation.getCid();
                        int lac = gsmCellLocation.getLac();
                        if (cid != -1) {
                            linkedHashMap.put("CID", java.lang.String.valueOf(cid));
                        }
                        if (lac != -1) {
                            linkedHashMap.put("LAC", java.lang.String.valueOf(lac));
                        }
                    }
                    if (cdmaCellLocation2 != null && (baseStationId = cdmaCellLocation2.getBaseStationId()) != -1) {
                        linkedHashMap.put("CID", java.lang.String.valueOf(baseStationId));
                    }
                    if (r6 != 0) {
                        int ci = r6.getCi();
                        int tac = r6.getTac();
                        if (ci != -1) {
                            linkedHashMap.put("CID", java.lang.String.valueOf(ci));
                        }
                        if (tac != -1) {
                            linkedHashMap.put("LAC", java.lang.String.valueOf(tac));
                        }
                    }
                    if (cellIdentityGsm != null) {
                        int cid2 = cellIdentityGsm.getCid();
                        int lac2 = cellIdentityGsm.getLac();
                        if (cid2 != -1) {
                            linkedHashMap.put("CID", java.lang.String.valueOf(cid2));
                        }
                        if (lac2 != -1) {
                            linkedHashMap.put("LAC", java.lang.String.valueOf(lac2));
                        }
                    }
                    if (cellIdentityCdma != null && (basestationId = cellIdentityCdma.getBasestationId()) != -1) {
                        linkedHashMap.put("CID", java.lang.String.valueOf(basestationId));
                    }
                    linkedHashMap.put("CARCC", telephonyManager.getSimCountryIso());
                    simOperator = telephonyManager.getSimOperator();
                    if (simOperator != null && !kotlin.text.StringsKt.isBlank(simOperator)) {
                        java.lang.String substring5 = simOperator.substring(3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring5, "");
                        linkedHashMap.put("CARNC", substring5);
                        java.lang.String substring22 = simOperator.substring(0, 3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring22, "");
                        linkedHashMap.put("CARMC", substring22);
                    }
                    linkedHashMap.put("CARN", telephonyManager.getSimOperatorName());
                    linkedHashMap.put("CARID", telephonyManager.getNetworkOperator());
                    linkedHashMap.put("ARGCC", telephonyManager.getNetworkCountryIso());
                    networkOperator = telephonyManager.getNetworkOperator();
                    if (networkOperator != null && !kotlin.text.StringsKt.isBlank(networkOperator)) {
                        java.lang.String substring32 = networkOperator.substring(3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring32, "");
                        linkedHashMap.put("ARGNC", substring32);
                        java.lang.String substring42 = networkOperator.substring(0, 3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring42, "");
                        linkedHashMap.put("ARGMC", substring42);
                    }
                    linkedHashMap.put("ARGN", telephonyManager.getNetworkOperatorName());
                    if (android.os.Build.VERSION.SDK_INT <= 28) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.READ_PHONE_STATE", "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                        if (context.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                            linkedHashMap.put("ANID", telephonyManager.getDeviceId());
                            linkedHashMap.put("ASSN", telephonyManager.getSimSerialNumber());
                            linkedHashMap.put("ASID", telephonyManager.getSubscriberId());
                        }
                    }
                    return linkedHashMap;
                }
                android.telephony.CellLocation cellLocation2 = telephonyManager.getCellLocation();
                if (cellLocation2 instanceof android.telephony.cdma.CdmaCellLocation) {
                    cdmaCellLocation = (android.telephony.cdma.CdmaCellLocation) cellLocation2;
                    cellIdentityCdma = null;
                } else {
                    cdmaCellLocation = null;
                    cellIdentityCdma = null;
                }
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                }
            } else {
                android.telephony.CellLocation cellLocation3 = telephonyManager.getCellLocation();
                if (cellLocation3 instanceof android.telephony.gsm.GsmCellLocation) {
                    gsmCellLocation = (android.telephony.gsm.GsmCellLocation) cellLocation3;
                    cellIdentityGsm = null;
                } else {
                    gsmCellLocation = null;
                    cellIdentityGsm = null;
                }
                if (android.os.Build.VERSION.SDK_INT < 30) {
                }
            }
        }
        if (i >= 29) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.ACCESS_COARSE_LOCATION", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        }
        linkedHashMap.put("CARCC", telephonyManager.getSimCountryIso());
        simOperator = telephonyManager.getSimOperator();
        if (simOperator != null) {
        }
        linkedHashMap.put("CARN", telephonyManager.getSimOperatorName());
        linkedHashMap.put("CARID", telephonyManager.getNetworkOperator());
        linkedHashMap.put("ARGCC", telephonyManager.getNetworkCountryIso());
        networkOperator = telephonyManager.getNetworkOperator();
        if (networkOperator != null) {
        }
        linkedHashMap.put("ARGN", telephonyManager.getNetworkOperatorName());
        if (android.os.Build.VERSION.SDK_INT <= 28) {
        }
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "fb6742";
    }
}
