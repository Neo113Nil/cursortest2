package util.h.xy.n;

/* loaded from: classes5.dex */
public class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int f2244;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private org.json.JSONObject getInputSizeshNQ4ISI;

    static {
        getHighSpeedVideoSizes();
        f2244 = 607000;
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 111) % 128;
    }

    public a(android.content.Context context, java.lang.String str) {
        util.h.xy.u.e.m27523(context, util.h.xy.al.ra.f364);
        java.io.File filesDir = context.getFilesDir();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(java.io.File.separator);
        sb.append(util.h.xy.al.ra.f364);
        sb.append(java.io.File.separator);
        sb.append(str);
        java.lang.String obj = sb.toString();
        this.getHighSpeedVideoSizesFor = obj;
        try {
            if (!new java.io.File(obj).exists()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("唏㩗鐻籇啴⋥", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr);
                this.getInputSizeshNQ4ISI = new org.json.JSONObject(((java.lang.String) objArr[0]).intern());
                return;
            }
            this.getInputSizeshNQ4ISI = new org.json.JSONObject(getHighResolutionOutputSizeshNQ4ISI());
        } catch (java.io.IOException | org.json.JSONException unused) {
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 43) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 19) % 128;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public boolean m26981(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 79) % 128;
        org.json.JSONObject jSONObject = this.getInputSizeshNQ4ISI;
        if (jSONObject != null) {
            return jSONObject.has(str);
        }
        Camera2StreamConfigurationMap = (i + 69) % 128;
        return false;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public int m26980(java.lang.String str, int i) {
        int i2 = Camera2StreamConfigurationMap + 19;
        getHighSpeedVideoFpsRanges = i2 % 128;
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        if (i2 % 2 == 0) {
            getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, i);
            throw null;
        }
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, i);
        int i3 = Camera2StreamConfigurationMap + 103;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw new java.lang.ArithmeticException();
    }

    private static int getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i2 + 51) % 128;
        if (str == null) {
            Camera2StreamConfigurationMap = (i2 + 85) % 128;
            return i;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(str);
            int i3 = getHighSpeedVideoFpsRanges + 13;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                return parseInt;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception unused) {
            return i;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m26979(java.lang.String str, int i) throws org.json.JSONException {
        java.lang.String valueOf = java.lang.String.valueOf(i);
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i2 + 57) % 128;
        org.json.JSONObject jSONObject = this.getInputSizeshNQ4ISI;
        if (jSONObject != null) {
            jSONObject.put(str, valueOf);
        } else {
            int i3 = i2 + 15;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 107) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m26978() throws java.io.IOException {
        java.lang.Throwable th;
        java.io.FileOutputStream fileOutputStream;
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 65) % 128;
        if (this.getInputSizeshNQ4ISI == null) {
            Camera2StreamConfigurationMap = (i + 95) % 128;
            return;
        }
        try {
            fileOutputStream = new java.io.FileOutputStream(this.getHighSpeedVideoSizesFor);
            try {
                java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(fileOutputStream);
                outputStreamWriter.write(this.getInputSizeshNQ4ISI.toString());
                outputStreamWriter.close();
                m26977(fileOutputStream);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 75) % 128;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    m26977(fileOutputStream);
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 91) % 128;
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 59) % 128;
        if (this.getInputSizeshNQ4ISI == null) {
            return null;
        }
        if (m26981(str)) {
            try {
                return (java.lang.String) this.getInputSizeshNQ4ISI.get(str);
            } catch (org.json.JSONException unused) {
                return null;
            }
        }
        int i = Camera2StreamConfigurationMap + 97;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new java.io.FileInputStream(this.getHighSpeedVideoSizesFor);
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 51) % 128;
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("矼냙൮순矶", android.view.KeyEvent.getDeadChar(0, 0) + 1, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(readLine);
            }
            inputStreamReader.close();
            java.lang.String obj = sb.toString();
            int i = getHighSpeedVideoFpsRanges + 71;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                m26977(fileInputStream);
                return obj;
            }
            m26977(fileInputStream);
            throw null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                m26977(fileInputStream2);
            }
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26977(java.io.Closeable closeable) {
        int i = getHighSpeedVideoFpsRanges + 85;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (closeable != null) {
            try {
                closeable.close();
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 1) % 128;
            } catch (java.io.IOException e) {
                e.getMessage();
            }
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI = 4635360297209028839L;
    }
}
