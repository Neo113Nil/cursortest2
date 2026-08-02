package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class m implements com.iovation.mobile.android.a.h {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (com.iovation.mobile.android.d.a.a("android.permission.ACCESS_COARSE_LOCATION", r4) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.net.wifi.WifiInfo d(android.content.Context context) {
        java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
        android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
        if (wifiManager != null && wifiManager.isWifiEnabled()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (!com.iovation.mobile.android.d.a.a("android.permission.ACCESS_FINE_LOCATION", context)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            }
            try {
                return wifiManager.getConnectionInfo();
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d6, code lost:
    
        if (r11.checkPermission("android.permission.ACCESS_FINE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid()) != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ef, code lost:
    
        if (r11.checkPermission("android.permission.ACCESS_FINE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid()) == 0) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e3  */
    @Override // com.iovation.mobile.android.a.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map a(android.content.Context context) {
        java.lang.String str;
        android.bluetooth.BluetoothManager bluetoothManager;
        android.bluetooth.BluetoothAdapter adapter;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        android.net.wifi.WifiInfo d;
        java.lang.String ssid;
        android.net.wifi.WifiManager wifiManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str4 = android.os.Build.VERSION.SDK_INT >= 31 ? "android.permission.BLUETOOTH_CONNECT" : "android.permission.BLUETOOTH";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (context.checkPermission(str4, android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
            try {
                java.lang.Object systemService = context.getSystemService("bluetooth");
                bluetoothManager = systemService instanceof android.bluetooth.BluetoothManager ? (android.bluetooth.BluetoothManager) systemService : null;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null) {
                str = adapter.getAddress();
                linkedHashMap.put("BMACA", str);
            }
            str = null;
            linkedHashMap.put("BMACA", str);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.INTERNET", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (context.checkPermission("android.permission.INTERNET", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
            try {
                java.util.ArrayList<java.net.NetworkInterface> list = java.util.Collections.list(java.net.NetworkInterface.getNetworkInterfaces());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
                java.lang.String str5 = "{";
                java.lang.String str6 = "";
                for (java.net.NetworkInterface networkInterface : list) {
                    java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterface.getInetAddresses();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inetAddresses, "");
                    java.util.ArrayList<java.net.InetAddress> list2 = java.util.Collections.list(inetAddresses);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "");
                    if (!list2.isEmpty()) {
                        java.util.Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (!((java.net.InetAddress) it.next()).isLoopbackAddress()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str5);
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append("\n                        ");
                                sb2.append(str6);
                                sb2.append('\"');
                                sb2.append(networkInterface.getName());
                                sb2.append("\":{\n                        \"ips\": [\n                        ");
                                sb.append(kotlin.text.StringsKt.trimIndent(sb2.toString()));
                                java.lang.String obj = sb.toString();
                                java.lang.String str7 = "";
                                for (java.net.InetAddress inetAddress : list2) {
                                    if (!inetAddress.isLoopbackAddress()) {
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                        sb3.append(obj);
                                        sb3.append(str7);
                                        sb3.append('\"');
                                        sb3.append(inetAddress.getHostAddress());
                                        sb3.append('\"');
                                        obj = sb3.toString();
                                        str7 = ",";
                                    }
                                }
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                sb4.append(obj);
                                sb4.append("]}");
                                str5 = sb4.toString();
                                str6 = ", ";
                            }
                        }
                    }
                }
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(str5);
                sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
                str2 = sb5.toString();
            } catch (java.lang.NullPointerException e2) {
                e2.printStackTrace();
                str2 = null;
                linkedHashMap.put("NETS", str2);
                if (!context.getPackageManager().isInstantApp()) {
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ftp ");
                sb6.append(a("ftp://www.example.com/"));
                sb6.append(';');
                java.lang.String obj2 = sb6.toString();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(obj2);
                sb7.append("http ");
                sb7.append(a("http://www.example.com/"));
                sb7.append(';');
                java.lang.String obj3 = sb7.toString();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(obj3);
                sb8.append("https ");
                sb8.append(a("https://www.example.com/"));
                linkedHashMap.put("APROXL", sb8.toString());
                if (android.os.Build.VERSION.SDK_INT <= 29) {
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.READ_PHONE_STATE", "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                if (context.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                    java.lang.Object systemService2 = context.getSystemService("phone");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
                    linkedHashMap.put("ADATANET", java.lang.String.valueOf(((android.telephony.TelephonyManager) systemService2).getDataNetworkType()));
                }
                return linkedHashMap;
            } catch (java.net.SocketException e3) {
                e3.printStackTrace();
                str2 = null;
                linkedHashMap.put("NETS", str2);
                if (!context.getPackageManager().isInstantApp()) {
                }
                java.lang.StringBuilder sb62 = new java.lang.StringBuilder("ftp ");
                sb62.append(a("ftp://www.example.com/"));
                sb62.append(';');
                java.lang.String obj22 = sb62.toString();
                java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
                sb72.append(obj22);
                sb72.append("http ");
                sb72.append(a("http://www.example.com/"));
                sb72.append(';');
                java.lang.String obj32 = sb72.toString();
                java.lang.StringBuilder sb82 = new java.lang.StringBuilder();
                sb82.append(obj32);
                sb82.append("https ");
                sb82.append(a("https://www.example.com/"));
                linkedHashMap.put("APROXL", sb82.toString());
                if (android.os.Build.VERSION.SDK_INT <= 29) {
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.READ_PHONE_STATE", "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                if (context.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                }
                return linkedHashMap;
            }
            linkedHashMap.put("NETS", str2);
        }
        if (!context.getPackageManager().isInstantApp()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.ACCESS_WIFI_STATE", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (context.checkPermission("android.permission.ACCESS_WIFI_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                try {
                    java.lang.Object systemService3 = context.getApplicationContext().getSystemService("wifi");
                    wifiManager = systemService3 instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService3 : null;
                } catch (java.lang.Exception e4) {
                    e4.printStackTrace();
                }
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    str3 = wifiManager.getConnectionInfo().getMacAddress();
                    linkedHashMap.put("MACA", str3);
                    i = android.os.Build.VERSION.SDK_INT;
                    if (i < 28) {
                        if (i >= 28) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.ACCESS_COARSE_LOCATION", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                            if (context.checkPermission("android.permission.ACCESS_COARSE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid()) != 0) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.ACCESS_FINE_LOCATION", "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                            }
                            try {
                                d = d(context);
                            } catch (java.lang.Exception unused) {
                            }
                        }
                        if (i >= 29) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.ACCESS_FINE_LOCATION", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                        }
                        d = null;
                    } else {
                        d = d(context);
                    }
                    ssid = d == null ? d.getSSID() : null;
                    java.lang.String bssid = d != null ? d.getBSSID() : null;
                    if (ssid != null && !kotlin.text.StringsKt.isBlank(ssid) && !kotlin.jvm.internal.Intrinsics.areEqual(ssid, "<unknown ssid>") && !kotlin.jvm.internal.Intrinsics.areEqual(ssid, "0x")) {
                        try {
                            java.lang.String substring = ssid.substring(1, ssid.length() - 1);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                            byte[] bytes = substring.getBytes(kotlin.text.Charsets.UTF_8);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                            linkedHashMap.put("SSID", com.iovation.mobile.android.d.a.a(bytes));
                        } catch (java.lang.NullPointerException unused2) {
                        }
                    }
                    linkedHashMap.put("BSSID", bssid);
                }
                str3 = null;
                linkedHashMap.put("MACA", str3);
                i = android.os.Build.VERSION.SDK_INT;
                if (i < 28) {
                }
                if (d == null) {
                }
                if (d != null) {
                }
                if (ssid != null) {
                    java.lang.String substring2 = ssid.substring(1, ssid.length() - 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                    byte[] bytes2 = substring2.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    linkedHashMap.put("SSID", com.iovation.mobile.android.d.a.a(bytes2));
                }
                linkedHashMap.put("BSSID", bssid);
            }
        }
        java.lang.StringBuilder sb622 = new java.lang.StringBuilder("ftp ");
        sb622.append(a("ftp://www.example.com/"));
        sb622.append(';');
        java.lang.String obj222 = sb622.toString();
        java.lang.StringBuilder sb722 = new java.lang.StringBuilder();
        sb722.append(obj222);
        sb722.append("http ");
        sb722.append(a("http://www.example.com/"));
        sb722.append(';');
        java.lang.String obj322 = sb722.toString();
        java.lang.StringBuilder sb822 = new java.lang.StringBuilder();
        sb822.append(obj322);
        sb822.append("https ");
        sb822.append(a("https://www.example.com/"));
        linkedHashMap.put("APROXL", sb822.toString());
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.READ_PHONE_STATE", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (context.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                java.lang.Object systemService4 = context.getSystemService("phone");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService4, "");
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService4;
                telephonyManager.getNetworkType();
                linkedHashMap.put("ANETTYPE", java.lang.String.valueOf(telephonyManager.getNetworkType()));
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.READ_PHONE_STATE", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (context.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0 && context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            java.lang.Object systemService22 = context.getSystemService("phone");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService22, "");
            linkedHashMap.put("ADATANET", java.lang.String.valueOf(((android.telephony.TelephonyManager) systemService22).getDataNetworkType()));
        }
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "e94029";
    }

    public static java.lang.String a(java.lang.String str) {
        try {
            return java.net.ProxySelector.getDefault().select(new java.net.URI(str)).toString();
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException | java.net.URISyntaxException unused) {
            return "";
        }
    }
}
