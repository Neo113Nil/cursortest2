package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public abstract class g {
    public static final int c = -402;
    public static final int d = -403;
    public static final int e = -405;
    static java.lang.String getHighSpeedVideoFpsRanges = null;
    private static java.util.concurrent.ExecutorService getHighSpeedVideoFpsRangesFor = java.util.concurrent.Executors.newCachedThreadPool();
    static boolean getHighSpeedVideoSizes = false;
    public static final java.lang.String n2 = "s";
    public static final java.lang.String o2 = "hw";
    public static final java.lang.String p2 = "ts";
    public static final java.lang.String q2 = "td";
    public static final java.lang.String r2 = "e";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface a {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface b {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface c {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface d {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface e {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface f {
    }

    abstract org.json.JSONObject Camera2StreamConfigurationMap();

    abstract org.json.JSONObject getHighSpeedVideoFpsRanges(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, lib.android.paypal.com.magnessdk.d dVar, lib.android.paypal.com.magnessdk.e eVar);

    abstract void getHighSpeedVideoSizes(int i, lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings);

    static org.json.JSONObject getHighSpeedVideoFpsRanges(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(a.b.j, 0);
        getHighSpeedVideoFpsRanges = sharedPreferences.getString(a.b.j, "");
        long j = sharedPreferences.getLong(a.b.k, 0L);
        if (getHighSpeedVideoFpsRanges.equals("") && j == 0) {
            getHighSpeedVideoFpsRanges = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(true);
            j = java.lang.System.currentTimeMillis();
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(a.b.j, getHighSpeedVideoFpsRanges);
            edit.putLong(a.b.k, j);
            edit.apply();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("id", getHighSpeedVideoFpsRanges);
        hashMap.put("created_at", java.lang.String.valueOf(j));
        return getHighSpeedVideoFpsRangesFor((java.util.HashMap<java.lang.String, java.lang.String>) hashMap);
    }

    static void getHighSpeedVideoFpsRangesFor(java.lang.Runnable runnable) {
        getHighSpeedVideoFpsRangesFor.execute(runnable);
    }

    static <T> java.util.concurrent.Future<T> getHighSpeedVideoFpsRangesFor(java.util.concurrent.Callable<T> callable) {
        return getHighSpeedVideoFpsRangesFor.submit(callable);
    }

    final long getHighSpeedVideoSizes(int i) {
        java.lang.String str;
        long blockSize;
        int blockCount;
        java.io.File file = new java.io.File("/storage");
        if (file.exists()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                for (int i2 = 0; i2 < length; i2++) {
                    java.io.File file2 = listFiles[i2];
                    if (file2.exists()) {
                        try {
                            if (android.os.Environment.isExternalStorageRemovable(file2)) {
                                str = file2.getAbsolutePath();
                                break;
                            }
                            continue;
                        } catch (java.lang.Exception e2) {
                            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
                        }
                    }
                }
            }
            str = "";
            if (!str.isEmpty()) {
                java.io.File file3 = new java.io.File(str);
                if (file3.exists()) {
                    android.os.StatFs statFs = new android.os.StatFs(file3.getPath());
                    if (i == 600) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getAvailableBlocks();
                    } else if (i == 601) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getBlockCount();
                    }
                    return blockSize * blockCount;
                }
            }
        }
        return 12345L;
    }

    final boolean getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
            return false;
        }
    }

    public static boolean a(lib.android.paypal.com.magnessdk.d dVar, java.lang.String str) {
        org.json.JSONObject optJSONObject = dVar.a().optJSONObject(str);
        return optJSONObject != null && optJSONObject.optInt(lib.android.paypal.com.magnessdk.c.i.RAMP_THRESHOLD.toString(), 0) < 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r0 = r9.optInt(lib.android.paypal.com.magnessdk.c.i.RAMP_THRESHOLD.toString(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r11 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r11.equalsIgnoreCase("") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        r11 = r11.toLowerCase();
        r0 = java.lang.Math.abs(r0);
        r11 = java.lang.Math.abs(r11.hashCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r11 <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        r12.hashCode();
        r12.hashCode();
        r1 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r1 == 101) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r1 == 115) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r1 == 3343) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        if (r1 == 3696) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (r1 == 3711) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r12 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (r12 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        if (r12 == 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (r12 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
    
        if (r12 == 3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        if (r12 == 4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r11 = r11 / 10000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        r11 = r11 / 1000000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
    
        r11 = r11 % 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (r11 >= r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        if (r11 >= r0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010b, code lost:
    
        if (Camera2StreamConfigurationMap(r9, r10, r13) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fd, code lost:
    
        r11 = r11 / 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        if (r12.equals(lib.android.paypal.com.magnessdk.g.p2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bf, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c7, code lost:
    
        if (r12.equals(lib.android.paypal.com.magnessdk.g.q2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c9, code lost:
    
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d1, code lost:
    
        if (r12.equals(lib.android.paypal.com.magnessdk.g.o2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d3, code lost:
    
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00db, code lost:
    
        if (r12.equals(lib.android.paypal.com.magnessdk.g.n2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dd, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e5, code lost:
    
        if (r12.equals("e") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e7, code lost:
    
        r12 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean getHighSpeedVideoFpsRanges(lib.android.paypal.com.magnessdk.d dVar, int i, java.lang.String str, java.lang.String str2, android.content.Context context) {
        org.json.JSONObject optJSONObject;
        try {
            optJSONObject = dVar.a().optJSONObject(str2);
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
            return false;
        }
        if (optJSONObject != null && str != null && !str.equalsIgnoreCase("")) {
            java.lang.String string = optJSONObject.getString(lib.android.paypal.com.magnessdk.c.i.MIN_VERSION.toString());
            java.lang.String highSpeedVideoSizes = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(lib.android.paypal.com.magnessdk.a.z);
            if (!string.equalsIgnoreCase("")) {
                java.lang.String[] split = highSpeedVideoSizes.split("\\.");
                java.lang.String[] split2 = string.split("\\.");
                int i2 = 0;
                while (true) {
                    if (i2 >= split.length && i2 >= split2.length) {
                        break;
                    }
                    if (i2 < split.length && i2 < split2.length) {
                        if (java.lang.Integer.parseInt(split[i2]) < java.lang.Integer.parseInt(split2[i2])) {
                            break;
                        }
                        if (java.lang.Integer.parseInt(split[i2]) > java.lang.Integer.parseInt(split2[i2])) {
                            break;
                        }
                        i2++;
                    } else {
                        if (i2 >= split.length) {
                            if (i2 < split2.length && java.lang.Integer.parseInt(split2[i2]) != 0) {
                                break;
                            }
                        } else if (java.lang.Integer.parseInt(split[i2]) != 0) {
                            break;
                        }
                        i2++;
                    }
                    lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
                    return false;
                }
            }
        }
        return false;
    }

    private static org.json.JSONObject getHighSpeedVideoFpsRangesFor(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"id\":");
            sb.append(hashMap.get("id"));
            sb.append(",\"created_at\":");
            sb.append(hashMap.get("created_at"));
            sb.append("}");
            return new org.json.JSONObject(sb.toString());
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    final org.json.JSONObject getHighSpeedVideoSizes(org.json.JSONObject jSONObject) {
        org.json.JSONObject Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                java.lang.String next = keys.next();
                java.lang.Object opt = Camera2StreamConfigurationMap.opt(next);
                if (opt == null || !(opt instanceof org.json.JSONObject)) {
                    opt = jSONObject.get(next);
                } else {
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        java.lang.String next2 = keys2.next();
                        ((org.json.JSONObject) opt).put(next2, jSONObject2.get(next2));
                    }
                }
                Camera2StreamConfigurationMap.put(next, opt);
            } catch (org.json.JSONException e2) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
                return Camera2StreamConfigurationMap;
            }
        }
        return Camera2StreamConfigurationMap;
    }

    static java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            if (((java.lang.Integer) obj).intValue() == 12345) {
                return -400;
            }
            return obj;
        }
        if (obj instanceof java.lang.Double) {
            if (((java.lang.Double) obj).doubleValue() == 12345.0d) {
                return -400;
            }
            return obj;
        }
        if (obj instanceof java.lang.Long) {
            if (((java.lang.Long) obj).longValue() == 12345) {
                return -400;
            }
            return obj;
        }
        if (obj instanceof java.lang.Float) {
            if (((java.lang.Float) obj).floatValue() == 12345.0f) {
                return -400;
            }
            return obj;
        }
        if (obj instanceof java.lang.String) {
            return obj.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT) ? "-400" : obj;
        }
        return -400;
    }

    static org.json.JSONObject getHighSpeedVideoSizes(java.lang.String str, org.json.JSONArray jSONArray, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(lib.android.paypal.com.magnessdk.c.a.FEATURE.toString(), str2);
        jSONObject.put(lib.android.paypal.com.magnessdk.c.a.PAYLOAD.toString(), jSONArray);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(lib.android.paypal.com.magnessdk.c.b.f6933a, str);
        jSONObject2.put(lib.android.paypal.com.magnessdk.c.a.AUDIT_KEY.toString(), lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(jSONObject));
        return jSONObject2;
    }

    private boolean Camera2StreamConfigurationMap(org.json.JSONObject jSONObject, int i, android.content.Context context) {
        try {
            java.lang.String packageName = context.getPackageName();
            if (!lib.android.paypal.com.magnessdk.f.Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(jSONObject.getJSONArray(lib.android.paypal.com.magnessdk.c.i.EXCLUDED.toString())), lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(lib.android.paypal.com.magnessdk.a.z))) {
                return true;
            }
            java.util.List<java.lang.String> highSpeedVideoSizes = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(jSONObject.getJSONArray(lib.android.paypal.com.magnessdk.c.i.APP_IDS.toString()));
            if (lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRanges(jSONObject.getJSONArray(lib.android.paypal.com.magnessdk.c.i.APP_SOURCES.toString())).contains(java.lang.Integer.valueOf(i))) {
                return false;
            }
            return !lib.android.paypal.com.magnessdk.f.Camera2StreamConfigurationMap(highSpeedVideoSizes, packageName);
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
            return false;
        }
    }
}
