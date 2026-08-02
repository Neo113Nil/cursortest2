package util.h.xy.u;

/* loaded from: classes5.dex */
public final class d {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getInputFormats;

    static {
        getHighSpeedVideoSizes();
        getInputFormats = util.h.xy.u.d.class.getName();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes + 51;
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoSizes = (i3 + 33) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRanges ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 61) % 128;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRanges ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        int i4 = getHighSpeedVideoSizes + 89;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m27510(java.lang.String str) {
        if (str != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 97) % 128;
            if (str.length() != 0) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 19) % 128;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2229);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m27518(java.lang.String str) {
        if (str != null && str.length() != 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 107) % 128;
            return true;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 61;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m27514(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> asyncResult) {
        if (asyncResult != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 3) % 128;
            if (asyncResult.isSuccessful() && asyncResult.getResult() != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 73) % 128;
                if (asyncResult.getResult().m26180() != null) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
                    if (!asyncResult.getResult().m26180().isEmpty()) {
                        int i = getHighResolutionOutputSizeshNQ4ISI + 17;
                        getHighSpeedVideoFpsRangesFor = i % 128;
                        if (i % 2 == 0) {
                            asyncResult.getResult().m26177();
                            throw null;
                        }
                        if (asyncResult.getResult().m26177() != null && !asyncResult.getResult().m26177().isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        return false;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m27511(util.h.xy.d.me meVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 3) % 128;
        if (meVar == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2234);
        }
        int i2 = i + 109;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m27517(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            int i = getHighSpeedVideoFpsRangesFor + 119;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            int i2 = i % 2;
            while (keys.hasNext()) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                java.lang.String next = keys.next();
                if (next.equalsIgnoreCase(str2)) {
                    return jSONObject.get(next).toString();
                }
            }
            return null;
        } catch (org.json.JSONException | java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m27506(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 9) % 128;
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (next.equalsIgnoreCase(str2)) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                    return jSONObject.get(next).toString();
                }
            }
            return null;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m27520(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("曀\ue6be★ꢎ暍簐ᎈ砗ഹ\ue047蟜鑆뇪钝", 1 - android.view.KeyEvent.normalizeMetaState(0), objArr);
        boolean equalsIgnoreCase = str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern());
        java.lang.String str5 = null;
        if (equalsIgnoreCase) {
            int i = getHighSpeedVideoFpsRangesFor + 41;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (str2 != null && !str2.isEmpty()) {
                return Camera2StreamConfigurationMap(str2);
            }
            if (str3 == null) {
                return null;
            }
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 101;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (str3.isEmpty()) {
                return null;
            }
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str3);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
            return highSpeedVideoFpsRangesFor;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("鐠䇹\uebfe®鑰\ue0e72퀦", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
        if (!str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ue461\uab1a\udaa3쾹\ue437ㆼ\uef2eἵ", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr3);
            if (!str.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                return null;
            }
            try {
                java.lang.String jSONObject = new org.json.JSONObject(str2).toString();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("쌔춮걤艐썵在駞勔\ua8c6쭣එ", android.view.KeyEvent.keyCodeFromString("") + 1, objArr4);
                java.lang.String m27506 = m27506(jSONObject, ((java.lang.String) objArr4[0]).intern());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u218d妜咷閤⇪쌃愆䔻䩔彄\uf55dꥂ\uf69b⮈妄", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1, objArr5);
                str5 = m27506(m27506, ((java.lang.String) objArr5[0]).intern());
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
            } catch (java.lang.Exception unused) {
            }
            return getHighSpeedVideoFpsRanges(str5);
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
        if (str2 != null && !str2.isEmpty()) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 51;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                return Camera2StreamConfigurationMap(str2);
            }
            Camera2StreamConfigurationMap(str2);
            throw null;
        }
        if (str4 == null) {
            return null;
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 71;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str4.isEmpty()) {
            return null;
        }
        return getHighSpeedVideoSizes(str4);
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String str2 = null;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("淸ùᐍﬄ涊驳↰⮦ضض뗤", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr[0]).intern());
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONArray.get(i).toString());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("멀햑\u09da⡗먲伛㱧\uf8f5톎퍞ꠖᒿ浔ꞃө", 1 - android.text.TextUtils.indexOf("", "", 0), objArr2);
                str2 = getHighSpeedVideoFpsRanges(jSONObject2.getString(((java.lang.String) objArr2[0]).intern()));
                if (str2 != null) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
                    break;
                }
                i++;
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
            }
        } catch (java.lang.Exception unused) {
        }
        return str2;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = getHighResolutionOutputSizeshNQ4ISI(new org.json.JSONObject(str).getString(util.h.xy.s.ma.f2340));
        } catch (java.lang.Exception unused) {
            str2 = null;
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
        return str2;
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = getHighSpeedVideoFpsRanges(new org.json.JSONObject(str).getJSONObject(util.h.xy.s.ma.f2350).getString(util.h.xy.s.g.f2326));
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        } catch (java.lang.Exception unused) {
            str2 = null;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 69;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 61) % 128;
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(util.h.xy.al.rb.m25016(util.h.xy.ar.a.m25052(util.h.xy.ar.b.m25076(str), new byte[]{87})));
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 95;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("⠊镲娵\ue220⡎", -android.view.MotionEvent.axisFromString(""), objArr);
        int indexOf = str.indexOf(((java.lang.String) objArr[0]).intern());
        if (indexOf == -1) {
            int i2 = getHighSpeedVideoFpsRangesFor + 35;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m27515(java.lang.String str, java.lang.String str2) {
        try {
            if (!new org.json.JSONObject(str2).isNull(str)) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 93) % 128;
                return true;
            }
            int i = getHighResolutionOutputSizeshNQ4ISI + 113;
            getHighSpeedVideoFpsRangesFor = i % 128;
            int i2 = i % 2;
            return false;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m27512(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
            jSONObject.put(str, str2);
            java.lang.String jSONObject2 = jSONObject.toString();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 51) % 128;
            return jSONObject2;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m27507(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
        java.lang.String str3;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
            jSONObject2.put(str, jSONObject);
            str3 = jSONObject2.toString();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
        } catch (org.json.JSONException unused) {
            str3 = null;
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
        return str3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m27509(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 47) % 128;
        util.h.xy.ar.b.m25074(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE.toString().getBytes());
        util.h.xy.ar.b.m25074(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED.toString().getBytes());
        util.h.xy.ar.b.m25074(bArr);
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED;
        if (!java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE.toString().getBytes(), bArr)) {
            return digitalizedCardState;
        }
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState2 = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        return digitalizedCardState2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.d.mg m27513(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 69;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            if (java.util.Arrays.equals(util.h.xy.d.mg.f1144.toString().getBytes(), bArr)) {
                util.h.xy.d.mg mgVar = util.h.xy.d.mg.f1144;
                int i2 = getHighSpeedVideoFpsRangesFor + 65;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return mgVar;
                }
                throw new java.lang.ArithmeticException();
            }
            return util.h.xy.d.mg.f1145;
        }
        java.util.Arrays.equals(util.h.xy.d.mg.f1144.toString().getBytes(), bArr);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static org.json.JSONObject m27521(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                int i = getHighSpeedVideoFpsRangesFor + 27;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    jSONObject2.get(keys.next());
                    throw new java.lang.NullPointerException();
                }
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject2.get(next);
                if (obj instanceof org.json.JSONObject) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
                    m27521((org.json.JSONObject) jSONObject.get(next), (org.json.JSONObject) obj);
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                } else {
                    jSONObject.put(next, obj);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m27508(byte[] bArr, byte[] bArr2, int i) {
        if (bArr != null && bArr.length > 0 && bArr2 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = i2 + 5;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr2.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr2.length > 0) {
                int i4 = i2 + 37;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (i > 0 && i <= 100) {
                    int m27516 = m27516(bArr, 1);
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, 0, bArr2.length);
                    for (int i5 = 1; i5 <= i; i5++) {
                        if (m27516(copyOfRange, i5) == m27516) {
                            int i6 = getHighResolutionOutputSizeshNQ4ISI + 79;
                            getHighSpeedVideoFpsRangesFor = i6 % 128;
                            if (i6 % 2 != 0) {
                                return true;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                    }
                    return false;
                }
            }
        }
        int i7 = getHighSpeedVideoFpsRangesFor + 15;
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m27516(byte[] bArr, int i) {
        byte b = 0;
        int i2 = 0;
        byte b2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] == 124) {
                b = (byte) (b + 1);
            }
            if (b == 2) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 9;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (i2 == 0) {
                    i2 = i3 + 1;
                }
            }
            if (b == 3) {
                int i5 = getHighResolutionOutputSizeshNQ4ISI;
                int i6 = i5 + 15;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                b2 = (byte) (b2 + 1);
                if (b2 == i) {
                    int i7 = i5 + 95;
                    getHighSpeedVideoFpsRangesFor = i7 % 128;
                    if (i7 % 2 != 0) {
                        return util.h.xy.ar.b.m25071(java.util.Arrays.copyOfRange(bArr, i2, i3));
                    }
                    util.h.xy.ar.b.m25071(java.util.Arrays.copyOfRange(bArr, i2, i3));
                    throw new java.lang.ArithmeticException();
                }
                b = 0;
                i2 = 0;
            }
        }
        return -1;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m27519(int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(i));
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.DEVICE_SUSPICIOUS, 0, -1, null, util.h.xy.ar.b.m25093(i), hashMap);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 73;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return provisioningServiceError;
        }
        throw null;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRanges = 606499712715285191L;
    }
}
