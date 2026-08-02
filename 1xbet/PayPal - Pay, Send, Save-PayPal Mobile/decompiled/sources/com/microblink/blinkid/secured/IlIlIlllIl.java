package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class IlIlIlllIl {
    public static volatile com.microblink.blinkid.secured.IlIlIlllIl IllIIIIllI;
    public static final int IllIIIllII;
    public static final int llIIIlllll;
    public final android.content.Context IlIllIlIIl;
    public final java.util.HashMap llIIlIlIIl;

    static {
        try {
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(new com.microblink.blinkid.secured.IllIIlllIl());
            IllIIIllII = listFiles.length;
            llIIIlllll = -1;
            for (java.io.File file : listFiles) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(file.getAbsolutePath());
                sb.append("/cpufreq/cpuinfo_max_freq");
                java.lang.String obj = sb.toString();
                com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IlIlIlllIl.class, "Examining file {}", obj);
                int llIIlIlIIl = llIIlIlIIl(obj);
                if (llIIlIlIIl > llIIIlllll) {
                    llIIIlllll = llIIlIlIIl;
                }
            }
            int i = llIIIlllll;
            if (i != -1) {
                llIIIlllll = java.lang.Math.round(i / 1000.0f);
            }
            com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IlIlIlllIl.class, "Calculated max CPU frequency: {} MHz", java.lang.Integer.valueOf(llIIIlllll));
        } catch (java.lang.Exception unused) {
            IllIIIllII = java.lang.Runtime.getRuntime().availableProcessors();
            llIIIlllll = -1;
        }
    }

    public IlIlIlllIl(android.content.Context context) {
        this.IlIllIlIIl = context;
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open("microblink/device_list.json");
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
                    for (int i = 0; i < names.length(); i++) {
                        java.lang.String string = names.getString(i);
                        com.microblink.blinkid.secured.IllllIIIIl illllIIIIl = new com.microblink.blinkid.secured.IllllIIIIl(jSONObject.getJSONObject(string), string);
                        java.lang.String[] split = string.split(",");
                        if (split.length > 1) {
                            for (java.lang.String str : split) {
                                this.llIIlIlIIl.put(str, illllIIIIl);
                            }
                        } else {
                            this.llIIlIlIIl.put(string, illllIIIIl);
                        }
                    }
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                    throw new java.lang.RuntimeException("Failed to parse assets/microblink/device_list.json. Please make sure JSON syntax is correct!", e);
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Cannot load asset microblink/device_list.json. Please make sure that this asset exists!", e2);
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

    public static int IllIIIIllI() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static com.microblink.blinkid.secured.IlIlIlllIl IllIIIllII() {
        if (IllIIIIllI != null) {
            return IllIIIIllI;
        }
        throw new java.lang.IllegalStateException("DeviceManager.setup wasn't called and DeviceManager instance is null.");
    }

    public static java.lang.String llIIIlllll() {
        return android.os.Build.MANUFACTURER;
    }

    public final com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl() {
        java.util.HashMap hashMap = this.llIIlIlIIl;
        java.lang.String str = android.os.Build.DEVICE;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("Device and Model cannot be null");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("::");
        sb.append(str2);
        return (com.microblink.blinkid.secured.IllllIIIIl) hashMap.get(sb.toString());
    }

    public final boolean llIIlIlIIl() {
        return this.IlIllIlIIl.getPackageManager().hasSystemFeature("android.hardware.camera") || this.IlIllIlIIl.getPackageManager().hasSystemFeature("android.hardware.camera.front");
    }

    public final float llIIlIlIIl(float f) {
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl = IlIllIlIIl();
        if (IlIllIlIIl != null) {
            float f2 = (float) IlIllIlIIl.lIlIIIIlIl;
            float f3 = ((((float) IlIllIlIIl.llIIlIIlll) - f2) * f) + f2;
            com.microblink.blinkid.util.Log.i(this, "Adjusting zoom level from {} to {}", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f3));
            return f3;
        }
        com.microblink.blinkid.util.Log.i(this, "Keeping zoom level at {}", java.lang.Float.valueOf(f));
        return f;
    }

    public final boolean llIIlIlIIl(com.microblink.blinkid.secured.IlIlIIlIll ilIlIIlIll) {
        if (ilIlIIlIll == null) {
            return false;
        }
        try {
            return ilIlIIlIll.llIIlIlIIl(new com.microblink.blinkid.secured.IIlIIIlIIl(android.os.Build.VERSION.RELEASE));
        } catch (java.lang.Exception e) {
            com.microblink.blinkid.util.Log.w(this, e, "Failed to extract android version number!", new java.lang.Object[0]);
            return false;
        }
    }

    public static int llIIlIlIIl(java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile;
        java.lang.String readLine;
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    randomAccessFile = new java.io.RandomAccessFile(str, "r");
                } catch (java.io.IOException unused) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
            }
        } catch (java.io.IOException unused2) {
        }
        try {
            readLine = randomAccessFile.readLine();
        } catch (java.io.IOException unused3) {
            randomAccessFile2 = randomAccessFile;
            com.microblink.blinkid.util.Log.i(com.microblink.blinkid.secured.IlIlIlllIl.class, "Failed to open {} for reading", str);
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            return -1;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused4) {
                }
            }
            throw th;
        }
        if (readLine == null) {
            randomAccessFile.close();
            return -1;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(readLine);
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused5) {
            }
            return parseInt;
        } catch (java.lang.NumberFormatException unused6) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.IlIlIlllIl.class, "Failed to parse CPU frequency: '{}'", readLine);
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused7) {
            }
            return -1;
        }
    }
}
