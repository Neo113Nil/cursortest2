package com.microblink.blinkid.hardware;

/* loaded from: classes.dex */
public class MicroblinkDeviceManager {
    public static final boolean IllIIIllII;
    public static volatile com.microblink.blinkid.hardware.MicroblinkDeviceManager llIIIlllll;
    public final com.microblink.blinkid.secured.IlIlIlllIl IlIllIlIIl = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII();
    public final java.util.HashMap llIIlIlIIl;

    static {
        boolean z;
        int i = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII;
        if (android.os.Build.CPU_ABI.equals("armeabi-v7a")) {
            z = false;
            if (new java.io.File("/proc/cpuinfo").exists()) {
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("/proc/cpuinfo")));
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            break;
                        }
                        java.lang.String lowerCase = readLine.toLowerCase(java.util.Locale.ROOT);
                        boolean contains = lowerCase.contains("neon");
                        boolean contains2 = lowerCase.contains("vfpv4");
                        if (contains && contains2) {
                            bufferedReader.close();
                            break;
                        }
                    }
                } catch (java.io.IOException e) {
                    com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIlIlllIl.class, e, "Cannot read /proc/cpuinfo to obtain whether NEON and VFPv4 are supported. Will assume they are (and risk crash).", new java.lang.Object[0]);
                }
                IllIIIllII = z;
                llIIIlllll = null;
                com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
            }
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIlIlllIl.class, "File /proc/cpuinfo seems to be missing. Cannot determine whether NEON and VFPv4 are supported. Will assume they are (and risk crash).", new java.lang.Object[0]);
        }
        z = true;
        IllIIIllII = z;
        llIIIlllll = null;
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
    }

    public MicroblinkDeviceManager(android.content.Context context) {
        boolean z;
        com.microblink.blinkid.secured.lllllllIIl llIIlIlIIl;
        com.microblink.blinkid.secured.IlIlIIlIll ilIlIIlIll;
        com.microblink.blinkid.secured.IlIlIIlIll ilIlIIlIll2;
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open("microblink/device_list_mb.json");
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, "UTF-8"));
                for (java.lang.String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    stringWriter.write(readLine);
                }
                java.lang.String obj = stringWriter.toString();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(obj);
                    org.json.JSONArray names = jSONObject.names();
                    this.llIIlIlIIl = new java.util.HashMap(names.length());
                    boolean z2 = false;
                    for (int i = 0; i < names.length(); i++) {
                        java.lang.String string = names.getString(i);
                        this.llIIlIlIIl.put(string, new com.microblink.blinkid.secured.lllllllIIl(jSONObject.getJSONObject(string), string));
                    }
                    java.lang.String str = android.os.Build.VERSION.RELEASE;
                    java.lang.String llIIIlllll2 = com.microblink.blinkid.secured.IlIlIlllIl.llIIIlllll();
                    java.lang.String str2 = android.os.Build.MODEL;
                    java.lang.String str3 = android.os.Build.DEVICE;
                    int i2 = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII;
                    int i3 = com.microblink.blinkid.secured.IlIlIlllIl.llIIIlllll;
                    com.microblink.blinkid.secured.lllllllIIl llIIlIlIIl2 = llIIlIlIIl();
                    if (llIIlIlIIl2 != null && (ilIlIIlIll2 = llIIlIlIIl2.IlIllIlIIl) != null) {
                        try {
                            z = ilIlIIlIll2.llIIlIlIIl(new com.microblink.blinkid.secured.IIlIIIlIIl(str));
                        } catch (java.lang.Exception e) {
                            com.microblink.blinkid.util.Log.w(this, e, "Failed to extract android version number!", new java.lang.Object[0]);
                        }
                        llIIlIlIIl = llIIlIlIIl();
                        if (llIIlIlIIl != null && (ilIlIIlIll = llIIlIlIIl.IllIIIllII) != null) {
                            try {
                                int i4 = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII;
                                z2 = ilIlIIlIll.llIIlIlIIl(new com.microblink.blinkid.secured.IIlIIIlIIl(android.os.Build.VERSION.RELEASE));
                            } catch (java.lang.Exception e2) {
                                com.microblink.blinkid.util.Log.w(this, e2, "Failed to extract android version number!", new java.lang.Object[0]);
                            }
                        }
                        initNativeDeviceInfo(str, llIIIlllll2, str2, str3, i2, i3, z, z2);
                    }
                    z = false;
                    llIIlIlIIl = llIIlIlIIl();
                    if (llIIlIlIIl != null) {
                        int i42 = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII;
                        z2 = ilIlIIlIll.llIIlIlIIl(new com.microblink.blinkid.secured.IIlIIIlIIl(android.os.Build.VERSION.RELEASE));
                    }
                    initNativeDeviceInfo(str, llIIIlllll2, str2, str3, i2, i3, z, z2);
                } catch (org.json.JSONException e3) {
                    e3.printStackTrace();
                    throw new java.lang.RuntimeException("Failed to parse assets/microblink/device_list_mb.json. Please make sure JSON syntax is correct!", e3);
                }
            } catch (java.io.IOException e4) {
                throw new java.lang.RuntimeException("Cannot load asset microblink/device_list_mb.json. Please make sure that this asset exists!", e4);
            }
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }

    private static native long initNativeDeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, boolean z, boolean z2);

    public static com.microblink.blinkid.hardware.MicroblinkDeviceManager llIIlIlIIl(android.content.Context context) {
        if (llIIIlllll == null) {
            synchronized (com.microblink.blinkid.hardware.MicroblinkDeviceManager.class) {
                if (llIIIlllll == null) {
                    llIIIlllll = new com.microblink.blinkid.hardware.MicroblinkDeviceManager(context.getApplicationContext());
                }
            }
        }
        return llIIIlllll;
    }

    public final com.microblink.blinkid.secured.lllllllIIl llIIlIlIIl() {
        int i = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII;
        java.lang.String str = android.os.Build.DEVICE;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str != null && str2 != null) {
            java.util.HashMap hashMap = this.llIIlIlIIl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("::");
            sb.append(str2);
            return (com.microblink.blinkid.secured.lllllllIIl) hashMap.get(sb.toString());
        }
        throw new java.lang.IllegalArgumentException("Device and Model cannot be null");
    }
}
