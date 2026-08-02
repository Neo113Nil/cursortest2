package util.h.xy.ce;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 1;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static long getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 1;
    private static final java.lang.String getOutputMinFrameDuration;

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRanges();
        getOutputMinFrameDuration = util.h.xy.ce.a.class.getName();
        int i = getInputFormats + 109;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighResolutionOutputSizeshNQ4ISI ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 119) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRangesFor))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 87) % 128;
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0276, code lost:
    
        if (((java.lang.String) r14[0]).intern().equals(r37) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x06b5 A[Catch: JSONException -> 0x076d, TryCatch #2 {JSONException -> 0x076d, blocks: (B:3:0x000b, B:6:0x0075, B:9:0x00ed, B:11:0x0140, B:15:0x0170, B:16:0x01e9, B:20:0x0219, B:22:0x0244, B:24:0x0558, B:26:0x0588, B:28:0x0594, B:30:0x0598, B:32:0x05a4, B:34:0x05b8, B:35:0x05c5, B:37:0x05cb, B:39:0x05d7, B:41:0x05ef, B:42:0x05f7, B:44:0x05fd, B:45:0x0605, B:47:0x0640, B:50:0x064a, B:53:0x064b, B:54:0x0665, B:56:0x0666, B:58:0x06af, B:60:0x06b5, B:62:0x06f4, B:64:0x071b, B:77:0x06bc, B:79:0x06c2, B:80:0x06d0, B:82:0x06d6, B:84:0x06e2, B:85:0x06e8, B:86:0x06f2, B:89:0x066c, B:91:0x066e, B:92:0x066f, B:93:0x0676, B:94:0x0677, B:96:0x06a0, B:98:0x06a4, B:99:0x0278, B:101:0x027c, B:103:0x0288, B:105:0x028e, B:107:0x0294, B:108:0x02a6, B:110:0x02ac, B:112:0x02bc, B:114:0x02d4, B:115:0x02e1, B:117:0x02e7, B:119:0x02ef, B:123:0x0329, B:124:0x0343, B:126:0x0344, B:128:0x0377, B:130:0x037d, B:132:0x0388, B:135:0x03a4, B:137:0x03c7, B:139:0x03cd, B:141:0x03d3, B:142:0x03e2, B:144:0x03e8, B:146:0x0400, B:147:0x0408, B:149:0x040e, B:151:0x0425, B:155:0x045c, B:156:0x045f, B:158:0x048b, B:160:0x0491, B:162:0x049b, B:163:0x04b2, B:165:0x04b8, B:167:0x04c4, B:169:0x04dc, B:170:0x04ec, B:172:0x04f2, B:174:0x04fd, B:178:0x0537, B:179:0x054d, B:181:0x054e, B:184:0x0553, B:185:0x0557, B:187:0x0765, B:189:0x076b, B:190:0x076c, B:192:0x00a4, B:194:0x00a8, B:197:0x00c3, B:73:0x075c, B:75:0x0762, B:76:0x0763, B:18:0x01f1, B:133:0x038c, B:13:0x0149, B:63:0x0707, B:196:0x00b0), top: B:2:0x000b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0755 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06bc A[Catch: JSONException -> 0x076d, TryCatch #2 {JSONException -> 0x076d, blocks: (B:3:0x000b, B:6:0x0075, B:9:0x00ed, B:11:0x0140, B:15:0x0170, B:16:0x01e9, B:20:0x0219, B:22:0x0244, B:24:0x0558, B:26:0x0588, B:28:0x0594, B:30:0x0598, B:32:0x05a4, B:34:0x05b8, B:35:0x05c5, B:37:0x05cb, B:39:0x05d7, B:41:0x05ef, B:42:0x05f7, B:44:0x05fd, B:45:0x0605, B:47:0x0640, B:50:0x064a, B:53:0x064b, B:54:0x0665, B:56:0x0666, B:58:0x06af, B:60:0x06b5, B:62:0x06f4, B:64:0x071b, B:77:0x06bc, B:79:0x06c2, B:80:0x06d0, B:82:0x06d6, B:84:0x06e2, B:85:0x06e8, B:86:0x06f2, B:89:0x066c, B:91:0x066e, B:92:0x066f, B:93:0x0676, B:94:0x0677, B:96:0x06a0, B:98:0x06a4, B:99:0x0278, B:101:0x027c, B:103:0x0288, B:105:0x028e, B:107:0x0294, B:108:0x02a6, B:110:0x02ac, B:112:0x02bc, B:114:0x02d4, B:115:0x02e1, B:117:0x02e7, B:119:0x02ef, B:123:0x0329, B:124:0x0343, B:126:0x0344, B:128:0x0377, B:130:0x037d, B:132:0x0388, B:135:0x03a4, B:137:0x03c7, B:139:0x03cd, B:141:0x03d3, B:142:0x03e2, B:144:0x03e8, B:146:0x0400, B:147:0x0408, B:149:0x040e, B:151:0x0425, B:155:0x045c, B:156:0x045f, B:158:0x048b, B:160:0x0491, B:162:0x049b, B:163:0x04b2, B:165:0x04b8, B:167:0x04c4, B:169:0x04dc, B:170:0x04ec, B:172:0x04f2, B:174:0x04fd, B:178:0x0537, B:179:0x054d, B:181:0x054e, B:184:0x0553, B:185:0x0557, B:187:0x0765, B:189:0x076b, B:190:0x076c, B:192:0x00a4, B:194:0x00a8, B:197:0x00c3, B:73:0x075c, B:75:0x0762, B:76:0x0763, B:18:0x01f1, B:133:0x038c, B:13:0x0149, B:63:0x0707, B:196:0x00b0), top: B:2:0x000b, inners: #0, #1 }] */
    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.ce.ra m25872(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel, java.lang.String str2) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i;
        java.lang.String str3;
        java.lang.String str4;
        int i2;
        int i3;
        byte[] bArr;
        byte[] bArr2;
        java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> highSpeedVideoSizes;
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b>> it;
        byte[] bArr3;
        java.lang.Class<?>[] clsArr;
        int i4;
        int length;
        int i5;
        util.h.xy.ce.ma maVar = new util.h.xy.ce.ma();
        try {
            util.h.xy.ce.ra raVar = new util.h.xy.ce.ra();
            util.h.xy.d.mg Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, jSONArray, maVar, str2);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, android.graphics.Color.red(0), (char) (40638 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr);
            int i6 = jSONObject.getInt(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, 10 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr2[0]).intern());
            if (util.h.xy.d.mg.f1145 == Camera2StreamConfigurationMap2) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(11 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 17 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (48284 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr3);
                i = jSONObject2.getInt(((java.lang.String) objArr3[0]).intern());
                if (i <= 0) {
                    i = 1;
                }
            } else if (util.h.xy.d.mg.f1144 == Camera2StreamConfigurationMap2) {
                getHighSpeedVideoSizes = (getInputFormats + 51) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 10, 29 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr4);
                    i = jSONObject2.getInt(((java.lang.String) objArr4[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i = 0;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes(7 - android.view.View.MeasureSpec.getSize(0), 39 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
            int optInt = jSONObject2.optInt(((java.lang.String) objArr5[0]).intern());
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.getDefaultSize(0, 0) + 11, 47 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 7075), objArr6);
            if (jSONObject.has(((java.lang.String) objArr6[0]).intern())) {
                str3 = "getElapsedCpuTime";
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes(11 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.graphics.ImageFormat.getBitsPerPixel(0) + 48, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 7075), objArr7);
                org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes(10 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 57 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 31306), objArr8);
                java.lang.String optString = jSONObject3.optString(((java.lang.String) objArr8[0]).intern());
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes(11 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 69 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (14810 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr9);
                int optInt2 = jSONObject3.optInt(((java.lang.String) objArr9[0]).intern());
                str4 = optString;
                i2 = optInt2;
            } else {
                str3 = "getElapsedCpuTime";
                str4 = "";
                i2 = 0;
            }
            getHighSpeedVideoSizes = (getInputFormats + 67) % 128;
            try {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ue6f9㦩塓磣鯑먧\udad4ﶍ᰾㳒彴縎麮넢퀺\uf0a3ፀ㏭劇男闝뒅휯\uf7daᙴ⤝", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 57179, objArr10);
                java.security.SecureRandom secureRandom = (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr10[0]).getDeclaredConstructor(null).newInstance(null);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0, 0) + 10, 190 - android.graphics.Color.alpha(0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr11);
                if (!((java.lang.String) objArr11[0]).intern().equals(str)) {
                    getInputFormats = (getHighSpeedVideoSizes + 23) % 128;
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(4 - android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr12);
                }
                if (util.h.xy.d.mg.f1145 == Camera2StreamConfigurationMap2) {
                    int i7 = getHighSpeedVideoSizes + 37;
                    getInputFormats = i7 % 128;
                    if (i7 % 2 == 0) {
                        maVar.Camera2StreamConfigurationMap();
                        throw null;
                    }
                    java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> Camera2StreamConfigurationMap3 = maVar.Camera2StreamConfigurationMap();
                    if (Camera2StreamConfigurationMap3 == null || Camera2StreamConfigurationMap3.size() <= 0) {
                        i3 = optInt;
                        bArr = null;
                        bArr2 = null;
                    } else {
                        util.h.xy.d.rc[] rcVarArr = new util.h.xy.d.rc[Camera2StreamConfigurationMap3.size()];
                        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b>> it2 = Camera2StreamConfigurationMap3.entrySet().iterator();
                        byte[] bArr4 = null;
                        byte[] bArr5 = null;
                        int i8 = 0;
                        while (it2.hasNext()) {
                            byte[] bArr6 = bArr4;
                            int i9 = getInputFormats + 95;
                            byte[] bArr7 = bArr5;
                            getHighSpeedVideoSizes = i9 % 128;
                            if (i9 % 2 != 0) {
                                java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b> next = it2.next();
                                next.getKey();
                                next.getValue().getInputSizeshNQ4ISI();
                                throw new java.lang.ArithmeticException();
                            }
                            java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b> next2 = it2.next();
                            java.lang.Integer key = next2.getKey();
                            util.h.xy.ce.b value = next2.getValue();
                            byte[] m25076 = value.getInputSizeshNQ4ISI() != null ? util.h.xy.ar.b.m25076(value.getInputSizeshNQ4ISI()) : bArr6;
                            if (value.getHighSpeedVideoFpsRanges() != null) {
                                bArr7 = util.h.xy.ar.b.m25076(value.getHighSpeedVideoFpsRanges());
                            }
                            byte[] bArr8 = bArr7;
                            rcVarArr[i8] = new util.h.xy.d.rc(value.getOutputFormats(), value.Camera2StreamConfigurationMap(), str4.getBytes(), util.h.xy.ar.b.m25076(value.getHighSpeedVideoSizes()), value.getHighSpeedVideoFpsRangesFor(), m25076, 0, i2, bArr8);
                            i8++;
                            Camera2StreamConfigurationMap3.put(key, Camera2StreamConfigurationMap(secureRandom, value));
                            bArr4 = m25076;
                            bArr5 = bArr8;
                        }
                        byte[] bArr9 = bArr4;
                        bArr2 = bArr5;
                        raVar.m25884(rcVarArr);
                        i3 = optInt;
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(10 - android.view.View.combineMeasuredStates(0, 0), 190 - android.graphics.Color.green(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr13);
                        if (((java.lang.String) objArr13[0]).intern().equals(str) && com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isQrSupported(profileChannel)) {
                            raVar.m25887(rcVarArr);
                        }
                        bArr = bArr9;
                    }
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10, 190 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr14);
                    if (((java.lang.String) objArr14[0]).intern().equals(str) && (highSpeedVideoSizes = maVar.getHighSpeedVideoSizes()) != null && highSpeedVideoSizes.size() > 0) {
                        util.h.xy.d.rc[] rcVarArr2 = new util.h.xy.d.rc[highSpeedVideoSizes.size()];
                        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b>> it3 = highSpeedVideoSizes.entrySet().iterator();
                        int i10 = 0;
                        while (it3.hasNext()) {
                            java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b> next3 = it3.next();
                            java.lang.Integer key2 = next3.getKey();
                            util.h.xy.ce.b value2 = next3.getValue();
                            if (value2.getInputSizeshNQ4ISI() != null) {
                                bArr = util.h.xy.ar.b.m25076(value2.getInputSizeshNQ4ISI());
                            }
                            if (value2.getHighSpeedVideoFpsRanges() != null) {
                                it = it3;
                                getInputFormats = (getHighSpeedVideoSizes + 93) % 128;
                                bArr3 = util.h.xy.ar.b.m25076(value2.getHighSpeedVideoFpsRanges());
                            } else {
                                it = it3;
                                bArr3 = bArr2;
                            }
                            rcVarArr2[i10] = new util.h.xy.d.rc(value2.getOutputFormats(), value2.Camera2StreamConfigurationMap(), str4.getBytes(), util.h.xy.ar.b.m25076(value2.getHighSpeedVideoSizes()), value2.getHighSpeedVideoFpsRangesFor(), bArr, 0, i2, bArr3);
                            i10++;
                            highSpeedVideoSizes.put(key2, Camera2StreamConfigurationMap(secureRandom, value2));
                            bArr2 = bArr3;
                            it3 = it;
                        }
                        raVar.m25881(rcVarArr2);
                    }
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 210 - android.view.View.MeasureSpec.getMode(0), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr15);
                    if (((java.lang.String) objArr15[0]).intern().equals(str) && maVar.getHighSpeedVideoFpsRangesFor() != null && maVar.getHighSpeedVideoFpsRangesFor().size() > 0) {
                        util.h.xy.d.rc[] rcVarArr3 = new util.h.xy.d.rc[maVar.getHighSpeedVideoFpsRangesFor().size()];
                        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b>> it4 = maVar.getHighSpeedVideoFpsRangesFor().entrySet().iterator();
                        int i11 = 0;
                        while (it4.hasNext()) {
                            int i12 = getHighSpeedVideoSizes + 47;
                            getInputFormats = i12 % 128;
                            if (i12 % 2 == 0) {
                                java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b> next4 = it4.next();
                                next4.getKey();
                                next4.getValue().getInputSizeshNQ4ISI();
                                throw null;
                            }
                            java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b> next5 = it4.next();
                            java.lang.Integer key3 = next5.getKey();
                            util.h.xy.ce.b value3 = next5.getValue();
                            if (value3.getInputSizeshNQ4ISI() != null) {
                                bArr = util.h.xy.ar.b.m25076(value3.getInputSizeshNQ4ISI());
                                getInputFormats = (getHighSpeedVideoSizes + 85) % 128;
                            }
                            byte[] m250762 = value3.getHighSpeedVideoFpsRanges() != null ? util.h.xy.ar.b.m25076(value3.getHighSpeedVideoFpsRanges()) : bArr2;
                            rcVarArr3[i11] = new util.h.xy.d.rc(value3.getOutputFormats(), value3.Camera2StreamConfigurationMap(), str4.getBytes(), util.h.xy.ar.b.m25076(value3.getHighSpeedVideoSizes()), value3.getHighSpeedVideoFpsRangesFor(), bArr, 0, i2, m250762);
                            i11++;
                            maVar.getHighSpeedVideoFpsRangesFor().put(key3, Camera2StreamConfigurationMap(secureRandom, value3));
                            bArr2 = m250762;
                        }
                        raVar.m25887(rcVarArr3);
                    }
                    clsArr = null;
                    if (raVar.m25880() != null) {
                        length = raVar.m25880().length;
                    } else if (raVar.m25882() != null) {
                        getHighSpeedVideoSizes = (getInputFormats + 97) % 128;
                        length = raVar.m25882().length;
                    } else {
                        if (raVar.m25885() == null) {
                            i4 = 0;
                            java.lang.Class<?>[] clsArr2 = clsArr;
                            util.h.xy.d.b m27545 = util.h.xy.u.ra.m27545(i4, i, Camera2StreamConfigurationMap2, i3, i6, i2);
                            java.lang.String str5 = getOutputMinFrameDuration;
                            getInputFormats = (getHighSpeedVideoSizes + 47) % 128;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(38 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr2).invoke(clsArr2, clsArr2)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr2).invoke(clsArr2, clsArr2)).longValue() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 79, (char) (android.view.View.combineMeasuredStates(0, 0) + 52993), objArr16);
                            m27545.m26137(str5, ((java.lang.String) objArr16[0]).intern());
                            raVar.m25886(m27545);
                            maVar.getHighSpeedVideoFpsRanges();
                            i5 = getInputFormats + 101;
                            getHighSpeedVideoSizes = i5 % 128;
                            if (i5 % 2 != 0) {
                                return raVar;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                        int i13 = getInputFormats + 119;
                        getHighSpeedVideoSizes = i13 % 128;
                        if (i13 % 2 != 0) {
                            int length2 = raVar.m25885().length;
                            throw new java.lang.NullPointerException();
                        }
                        length = raVar.m25885().length;
                    }
                    i4 = length;
                    java.lang.Class<?>[] clsArr22 = clsArr;
                    util.h.xy.d.b m275452 = util.h.xy.u.ra.m27545(i4, i, Camera2StreamConfigurationMap2, i3, i6, i2);
                    java.lang.String str52 = getOutputMinFrameDuration;
                    getInputFormats = (getHighSpeedVideoSizes + 47) % 128;
                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(38 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr22).invoke(clsArr22, clsArr22)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr22).invoke(clsArr22, clsArr22)).longValue() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 79, (char) (android.view.View.combineMeasuredStates(0, 0) + 52993), objArr162);
                    m275452.m26137(str52, ((java.lang.String) objArr162[0]).intern());
                    raVar.m25886(m275452);
                    maVar.getHighSpeedVideoFpsRanges();
                    i5 = getInputFormats + 101;
                    getHighSpeedVideoSizes = i5 % 128;
                    if (i5 % 2 != 0) {
                    }
                }
                i3 = optInt;
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoSizes(4 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 201, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr17);
                if (((java.lang.String) objArr17[0]).intern().equals(str)) {
                    int i14 = getInputFormats + 85;
                    getHighSpeedVideoSizes = i14 % 128;
                    if (i14 % 2 != 0) {
                        util.h.xy.d.mg mgVar = util.h.xy.d.mg.f1145;
                        throw new java.lang.ArithmeticException();
                    }
                    if (util.h.xy.d.mg.f1145 == Camera2StreamConfigurationMap2) {
                        int i15 = util.h.xy.ce.ma.getHighSpeedVideoFpsRanges + 27;
                        util.h.xy.ce.ma.Camera2StreamConfigurationMap = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        util.h.xy.d.rc[] rcVarArr4 = new util.h.xy.d.rc[maVar.getHighResolutionOutputSizeshNQ4ISI.size()];
                        int i16 = util.h.xy.ce.ma.getHighSpeedVideoFpsRanges + 27;
                        util.h.xy.ce.ma.Camera2StreamConfigurationMap = i16 % 128;
                        if (i16 % 2 != 0) {
                            throw null;
                        }
                        java.util.Iterator<java.util.Map.Entry<java.lang.String, util.h.xy.ce.b>> it5 = maVar.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
                        byte[] bArr10 = null;
                        byte[] bArr11 = null;
                        int i17 = 0;
                        while (it5.hasNext()) {
                            int i18 = getInputFormats + 87;
                            getHighSpeedVideoSizes = i18 % 128;
                            if (i18 % 2 != 0) {
                                java.util.Map.Entry<java.lang.String, util.h.xy.ce.b> next6 = it5.next();
                                next6.getKey();
                                next6.getValue().getInputSizeshNQ4ISI();
                                throw new java.lang.ArithmeticException();
                            }
                            java.util.Map.Entry<java.lang.String, util.h.xy.ce.b> next7 = it5.next();
                            java.lang.String key4 = next7.getKey();
                            util.h.xy.ce.b value4 = next7.getValue();
                            if (value4.getInputSizeshNQ4ISI() != null) {
                                bArr10 = util.h.xy.ar.b.m25076(value4.getInputSizeshNQ4ISI());
                            }
                            if (value4.getHighSpeedVideoFpsRanges() != null) {
                                bArr11 = util.h.xy.ar.b.m25076(value4.getHighSpeedVideoFpsRanges());
                            }
                            rcVarArr4[i17] = new util.h.xy.d.rc(value4.getOutputFormats(), null, str4.getBytes(), value4.getHighSpeedVideoSizes().getBytes(), value4.getHighSpeedVideoFpsRangesFor(), bArr10, 0, i2, bArr11);
                            i17++;
                            util.h.xy.ce.b Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(secureRandom, value4);
                            int i19 = util.h.xy.ce.ma.getHighSpeedVideoFpsRanges + 27;
                            java.security.SecureRandom secureRandom2 = secureRandom;
                            util.h.xy.ce.ma.Camera2StreamConfigurationMap = i19 % 128;
                            if (i19 % 2 != 0) {
                                throw null;
                            }
                            maVar.getHighResolutionOutputSizeshNQ4ISI.put(key4, Camera2StreamConfigurationMap4);
                            secureRandom = secureRandom2;
                        }
                        raVar.m25884(rcVarArr4);
                        clsArr = null;
                        if (raVar.m25880() != null) {
                        }
                        i4 = length;
                        java.lang.Class<?>[] clsArr222 = clsArr;
                        util.h.xy.d.b m2754522 = util.h.xy.u.ra.m27545(i4, i, Camera2StreamConfigurationMap2, i3, i6, i2);
                        java.lang.String str522 = getOutputMinFrameDuration;
                        getInputFormats = (getHighSpeedVideoSizes + 47) % 128;
                        java.lang.Object[] objArr1622 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(38 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr222).invoke(clsArr222, clsArr222)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr222).invoke(clsArr222, clsArr222)).longValue() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 79, (char) (android.view.View.combineMeasuredStates(0, 0) + 52993), objArr1622);
                        m2754522.m26137(str522, ((java.lang.String) objArr1622[0]).intern());
                        raVar.m25886(m2754522);
                        maVar.getHighSpeedVideoFpsRanges();
                        i5 = getInputFormats + 101;
                        getHighSpeedVideoSizes = i5 % 128;
                        if (i5 % 2 != 0) {
                        }
                    }
                }
                clsArr = null;
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.text.TextUtils.getOffsetBefore("", 0) + 4, 199 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.red(0), objArr18);
                if (((java.lang.String) objArr18[0]).intern().equals(str) && util.h.xy.d.mg.f1144 == Camera2StreamConfigurationMap2) {
                    raVar.m25884(getHighResolutionOutputSizeshNQ4ISI(maVar.getHighResolutionOutputSizeshNQ4ISI(), str4, i2));
                }
                if (raVar.m25880() != null) {
                }
                i4 = length;
                java.lang.Class<?>[] clsArr2222 = clsArr;
                util.h.xy.d.b m27545222 = util.h.xy.u.ra.m27545(i4, i, Camera2StreamConfigurationMap2, i3, i6, i2);
                java.lang.String str5222 = getOutputMinFrameDuration;
                getInputFormats = (getHighSpeedVideoSizes + 47) % 128;
                java.lang.Object[] objArr16222 = new java.lang.Object[1];
                getHighSpeedVideoSizes(38 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr2222).invoke(clsArr2222, clsArr2222)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod(str3, clsArr2222).invoke(clsArr2222, clsArr2222)).longValue() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 79, (char) (android.view.View.combineMeasuredStates(0, 0) + 52993), objArr16222);
                m27545222.m26137(str5222, ((java.lang.String) objArr16222[0]).intern());
                raVar.m25886(m27545222);
                maVar.getHighSpeedVideoFpsRanges();
                i5 = getInputFormats + 101;
                getHighSpeedVideoSizes = i5 % 128;
                if (i5 % 2 != 0) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (org.json.JSONException e) {
            maVar.getHighSpeedVideoFpsRanges();
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v16, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m25871(java.lang.String str, java.lang.String str2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr;
        util.h.xy.ck.rc rcVar;
        com.gemalto.mfs.mwsdk.exception.InternalComponentException internalComponentException;
        java.lang.Throwable th2;
        byte[] bArr2;
        util.h.xy.ck.rc e;
        com.gemalto.mfs.mwsdk.exception.InternalComponentException e2;
        byte[] bArr3 = null;
        try {
            try {
                bArr2 = util.h.xy.ck.ra.f1116.m25945().mo25943(util.h.xy.bx.ra.f1063.m25786(str2));
                try {
                    util.h.xy.ar.b.m25074(bArr2);
                    str = util.h.xy.bx.ra.f1063.m25787(bArr2, util.h.xy.bx.ra.f1063.m25786(str));
                    try {
                        util.h.xy.ar.b.m25074((byte[]) str);
                        java.lang.String str3 = new java.lang.String((byte[]) str);
                        util.h.xy.ar.b.m25095(bArr2);
                        util.h.xy.ar.b.m25095((byte[]) str);
                        int i = getHighSpeedVideoSizes + 99;
                        getInputFormats = i % 128;
                        if (i % 2 != 0) {
                            return str3;
                        }
                        throw null;
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                        e2 = e3;
                        internalComponentException = e2;
                        internalComponentException.getMessage();
                        throw internalComponentException;
                    } catch (util.h.xy.ck.rc e4) {
                        e = e4;
                        rcVar = e;
                        rcVar.getMessage();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42, android.view.View.resolveSize(0, 0) + 116, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 2636), objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(rcVar.getMessage());
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
                    } catch (java.lang.Throwable th3) {
                        th2 = th3;
                        java.lang.Throwable th4 = th2;
                        bArr3 = bArr2;
                        th = th4;
                        bArr = str;
                        util.h.xy.ar.b.m25095(bArr3);
                        util.h.xy.ar.b.m25095(bArr);
                        throw th;
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e5) {
                    e2 = e5;
                } catch (util.h.xy.ck.rc e6) {
                    e = e6;
                } catch (java.lang.Throwable th5) {
                    th2 = th5;
                    str = 0;
                }
            } catch (java.lang.Throwable th6) {
                th2 = th6;
                bArr2 = null;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e7) {
            internalComponentException = e7;
        } catch (util.h.xy.ck.rc e8) {
            rcVar = e8;
        } catch (java.lang.Throwable th7) {
            th = th7;
            bArr = null;
            util.h.xy.ar.b.m25095(bArr3);
            util.h.xy.ar.b.m25095(bArr);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x07dc, code lost:
    
        r4 = new java.lang.Object[1];
        getHighSpeedVideoSizes(35 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 646 - android.text.TextUtils.indexOf(r13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x080a, code lost:
    
        throw new org.json.JSONException(((java.lang.String) r4[0]).intern());
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x085f  */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private util.h.xy.d.mg Camera2StreamConfigurationMap(java.lang.String str, org.json.JSONArray jSONArray, util.h.xy.ce.ma maVar, java.lang.String str2) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.d.mg mgVar;
        util.h.xy.d.mg mgVar2;
        int i;
        java.lang.String str3;
        java.lang.Throwable cause;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String[] strArr;
        java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> highSpeedVideoSizes;
        java.lang.String[] strArr2;
        org.json.JSONArray jSONArray2 = jSONArray;
        java.lang.String str6 = str2;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            java.lang.String str7 = "";
            if (i3 >= jSONArray.length()) {
                java.lang.String str8 = str6;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(11 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 190 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
                if (((java.lang.String) objArr[0]).intern().equals(str)) {
                    if (!maVar.Camera2StreamConfigurationMap().isEmpty()) {
                        int i4 = getInputFormats + 61;
                        getHighSpeedVideoSizes = i4 % 128;
                        if (i4 % 2 != 0) {
                            maVar.Camera2StreamConfigurationMap().size();
                            throw null;
                        }
                        if (maVar.Camera2StreamConfigurationMap().size() > 0) {
                            java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> Camera2StreamConfigurationMap2 = maVar.Camera2StreamConfigurationMap();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, android.text.TextUtils.indexOf("", "", 0) + 757, (char) (50824 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr2);
                            mgVar2 = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2, ((java.lang.String) objArr2[0]).intern());
                            if (!maVar.getHighSpeedVideoSizes().isEmpty() || maVar.getHighSpeedVideoSizes().size() <= 0) {
                                return mgVar2;
                            }
                            java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> highSpeedVideoSizes2 = maVar.getHighSpeedVideoSizes();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionType(0L) + 4, 759 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.View.resolveSize(0, 0) + 62890), objArr3);
                            return getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes2, ((java.lang.String) objArr3[0]).intern());
                        }
                    }
                    mgVar2 = null;
                    if (maVar.getHighSpeedVideoSizes().isEmpty()) {
                    }
                    return mgVar2;
                }
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4, android.text.TextUtils.getOffsetAfter("", 0) + 200, (char) android.view.View.resolveSize(0, 0), objArr4);
                if (((java.lang.String) objArr4[0]).intern().equals(str)) {
                    java.util.TreeMap<java.lang.String, util.h.xy.ce.b> highResolutionOutputSizeshNQ4ISI = maVar.getHighResolutionOutputSizeshNQ4ISI();
                    int i5 = util.h.xy.ce.ma.getHighSpeedVideoFpsRanges + 27;
                    util.h.xy.ce.ma.Camera2StreamConfigurationMap = i5 % 128;
                    if (i5 % 2 == 0) {
                        return getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, maVar.getHighResolutionOutputSizeshNQ4ISI, str8);
                    }
                    throw null;
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, 209 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5);
                if (!((java.lang.String) objArr5[0]).intern().equals(str)) {
                    return null;
                }
                getInputFormats = (getHighSpeedVideoSizes + 45) % 128;
                java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> Camera2StreamConfigurationMap3 = maVar.Camera2StreamConfigurationMap();
                if (Camera2StreamConfigurationMap3 == null || Camera2StreamConfigurationMap3.isEmpty()) {
                    mgVar = null;
                } else {
                    util.h.xy.d.mg highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap3);
                    getHighSpeedVideoSizes = (getInputFormats + 105) % 128;
                    mgVar = highSpeedVideoFpsRanges;
                }
                java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> highSpeedVideoFpsRangesFor = maVar.getHighSpeedVideoFpsRangesFor();
                return (highSpeedVideoFpsRangesFor == null || highSpeedVideoFpsRangesFor.isEmpty()) ? mgVar : getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor);
            }
            if (jSONArray2.isNull(i3)) {
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(16 - android.graphics.Color.green(i2), 159 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr6);
                    throw new org.json.JSONException(((java.lang.String) objArr6[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th;
                }
            }
            org.json.JSONObject jSONObject = jSONArray2.getJSONObject(i3);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.graphics.Color.blue(i2) + 11, 223 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.keyCodeFromString(""), objArr7);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr7[i2]).intern());
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, 186 - android.view.View.MeasureSpec.makeMeasureSpec(i2, i2), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr8);
            java.lang.String string = jSONObject2.getString(((java.lang.String) objArr8[i2]).intern());
            try {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                objArr9[i2] = "";
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.Process");
                java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                clsArr[i2] = java.lang.String.class;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoSizes(9 - ((java.lang.Integer) cls.getMethod("getGidForName", clsArr).invoke(null, objArr9)).intValue(), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr10);
                if (((java.lang.String) objArr10[i2]).intern().equals(str)) {
                    getHighSpeedVideoSizes = (getInputFormats + 29) % 128;
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(11 - (android.util.TypedValue.complexToFloat(i2) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i2) == 0.0f ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", i2) + 1380, (char) android.text.TextUtils.getTrimmedLength(""), objArr11);
                    byte[] m25786 = util.h.xy.bx.ra.f1063.m25786(jSONObject.getString(((java.lang.String) objArr11[i2]).intern()));
                    util.h.xy.ar.b.m25074(m25786);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.graphics.Color.blue(i2) + 7, android.graphics.Color.argb(i2, i2, i2, i2) + 1391, (char) (android.graphics.ImageFormat.getBitsPerPixel(i2) + 14411), objArr12);
                    java.lang.String string2 = jSONObject.getString(((java.lang.String) objArr12[i2]).intern());
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.text.TextUtils.getOffsetAfter("", i2) + 3, android.view.View.combineMeasuredStates(i2, i2) + 1398, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr13);
                    if (!((java.lang.String) objArr13[i2]).intern().equals(string2)) {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(6 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.KeyEvent.keyCodeFromString("") + 1401, (char) (39992 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr14);
                        if (!((java.lang.String) objArr14[i2]).intern().equals(string2)) {
                            int i6 = getInputFormats + 83;
                            getHighSpeedVideoSizes = i6 % 128;
                            if (i6 % 2 == 0) {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(2 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1406 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.MotionEvent.axisFromString("") + 15719), objArr15);
                                if (!((java.lang.String) objArr15[i2]).intern().equals(string2)) {
                                    break;
                                }
                            } else {
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarSize() + 80) * 2, 30498 >>> android.text.TextUtils.indexOf((java.lang.CharSequence) "", (char) 22), (char) (4453 << android.view.MotionEvent.axisFromString("")), objArr16);
                                if (!((java.lang.String) objArr16[i2]).intern().equals(string2)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        try {
                            m25786 = util.h.xy.ck.ra.f1116.m25945().mo25943(m25786);
                            getInputFormats = (getHighSpeedVideoSizes + 47) % 128;
                        } catch (util.h.xy.ck.rc e) {
                            e.getMessage();
                            m25786 = null;
                        }
                    }
                    util.h.xy.ar.b.m25074(m25786);
                    util.h.xy.ar.mb[] m25059 = util.h.xy.ar.a.m25059(m25786, new byte[]{5, 4, com.google.common.base.Ascii.FF});
                    int length = m25059.length;
                    int length2 = m25059.length;
                    if (length2 == 0) {
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(39 - android.graphics.ImageFormat.getBitsPerPixel(i2), 1440 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
                        throw new org.json.JSONException(((java.lang.String) objArr17[0]).intern());
                    }
                    java.lang.String[] highSpeedVideoSizes3 = getHighSpeedVideoSizes(jSONObject, length2);
                    org.json.JSONObject highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(jSONObject, str);
                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", i2);
                    double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i2);
                    char offsetAfter = (char) android.text.TextUtils.getOffsetAfter("", i2);
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(3 - offsetBefore, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 1481, offsetAfter, objArr18);
                    java.lang.String optString = highSpeedVideoFpsRanges2.optString(((java.lang.String) objArr18[0]).intern(), null);
                    i = i3;
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.MotionEvent.axisFromString("") + 1485, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31892), objArr19);
                    java.lang.String intern = ((java.lang.String) objArr19[0]).intern();
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.view.Gravity.getAbsoluteGravity(0, 0) + 3, android.text.TextUtils.getCapsMode("", 0, 0) + 1488, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr20);
                    java.lang.String optString2 = highSpeedVideoFpsRanges2.optString(intern, ((java.lang.String) objArr20[0]).intern());
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(3 - android.view.View.getDefaultSize(0, 0), 1488 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr21);
                    if (((java.lang.String) objArr21[0]).intern().equalsIgnoreCase(optString2)) {
                        getInputFormats = (getHighSpeedVideoSizes + 41) % 128;
                        highSpeedVideoSizes = maVar.Camera2StreamConfigurationMap();
                    } else {
                        try {
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(2 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1490, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr22);
                            if (!((java.lang.String) objArr22[0]).intern().equalsIgnoreCase(optString2)) {
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(34 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1494 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr23);
                                throw new org.json.JSONException(((java.lang.String) objArr23[0]).intern());
                            }
                            getHighSpeedVideoSizes = (getInputFormats + 89) % 128;
                            highSpeedVideoSizes = maVar.getHighSpeedVideoSizes();
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause3 = th2.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th2;
                        }
                    }
                    java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap = highSpeedVideoSizes;
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(6 - android.graphics.Color.argb(0, 0, 0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 1401, (char) (39992 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr24);
                    if (((java.lang.String) objArr24[0]).intern().equals(string2)) {
                        getInputFormats = (getHighSpeedVideoSizes + 77) % 128;
                        strArr2 = getHighSpeedVideoFpsRanges(jSONObject, length2);
                    } else {
                        strArr2 = null;
                    }
                    getHighSpeedVideoSizes(str, treeMap, m25059, string2, highSpeedVideoSizes3, optString, strArr2);
                } else {
                    int i7 = i2;
                    i = i3;
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(4 - android.view.View.combineMeasuredStates(i7, i7), 200 - android.text.TextUtils.getCapsMode("", i7, i7), (char) (android.util.TypedValue.complexToFraction(i7, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i7, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr25);
                    if (((java.lang.String) objArr25[i7]).intern().equals(str)) {
                        getHighSpeedVideoSizes = (getInputFormats + 7) % 128;
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 3, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 204, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr26);
                        if (((java.lang.String) objArr26[0]).intern().equals(string)) {
                            int i8 = util.h.xy.ce.ma.getHighSpeedVideoFpsRanges + 27;
                            util.h.xy.ce.ma.Camera2StreamConfigurationMap = i8 % 128;
                            if (i8 % 2 != 0) {
                                throw null;
                            }
                            java.util.LinkedHashMap<java.lang.String, util.h.xy.ce.b> linkedHashMap = maVar.getHighResolutionOutputSizeshNQ4ISI;
                            getInputFormats = (getHighSpeedVideoSizes + 113) % 128;
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(11 - android.view.View.getDefaultSize(0, 0), android.view.View.MeasureSpec.getSize(0) + 1380, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr27);
                            byte[] m257862 = util.h.xy.bx.ra.f1063.m25786(jSONObject.getString(((java.lang.String) objArr27[0]).intern()));
                            util.h.xy.ar.b.m25074(m257862);
                            util.h.xy.ar.mb[] m25067 = util.h.xy.ar.a.m25067(m257862, (byte) 3);
                            int length3 = m25067.length;
                            if (length3 == 0) {
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 34, android.view.KeyEvent.normalizeMetaState(0) + 1527, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49549), objArr28);
                                throw new org.json.JSONException(((java.lang.String) objArr28[0]).intern());
                            }
                            java.lang.String[] Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(jSONObject, length3);
                            org.json.JSONObject highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(jSONObject, str);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(android.text.TextUtils.getOffsetAfter("", 0) + 3, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1481, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr29);
                            java.lang.String optString3 = highSpeedVideoFpsRanges3.optString(((java.lang.String) objArr29[0]).intern(), null);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(7 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.getMode(0) + 1391, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 14410), objArr30);
                            java.lang.String string3 = jSONObject.getString(((java.lang.String) objArr30[0]).intern());
                            int i9 = 1;
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(6 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1401, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39991), objArr31);
                            if (((java.lang.String) objArr31[0]).intern().equals(string3)) {
                                java.lang.String[] highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(jSONObject, length3);
                                getHighSpeedVideoSizes = (getInputFormats + 27) % 128;
                                strArr = highSpeedVideoFpsRanges4;
                            } else {
                                strArr = null;
                            }
                            getInputFormats = (getHighSpeedVideoSizes + 23) % 128;
                            if (m25067.length != 0) {
                                int i10 = 0;
                                while (i10 < m25067.length) {
                                    java.lang.String str9 = Camera2StreamConfigurationMap4[i10];
                                    if (linkedHashMap.containsKey(str9)) {
                                        java.lang.Object[] objArr32 = new java.lang.Object[i9];
                                        getHighSpeedVideoSizes(75 - android.graphics.Color.red(0), 682 - android.view.KeyEvent.getDeadChar(0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 63213), objArr32);
                                        throw new org.json.JSONException(((java.lang.String) objArr32[0]).intern());
                                    }
                                    java.lang.String[] strArr3 = Camera2StreamConfigurationMap4;
                                    int i11 = i9;
                                    util.h.xy.ce.b bVar = new util.h.xy.ce.b(str, string3, Camera2StreamConfigurationMap4[i10], optString3, strArr[i10]);
                                    bVar.getHighSpeedVideoFpsRangesFor(m25067[i10].m25110());
                                    linkedHashMap.put(str9, bVar);
                                    int i12 = getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                    getHighSpeedVideoSizes = i12 % 128;
                                    i10 = i12 % 2 != 0 ? i10 + 107 : i10 + 1;
                                    i9 = i11;
                                    Camera2StreamConfigurationMap4 = strArr3;
                                }
                            }
                            getHighSpeedVideoSizes = (getInputFormats + 31) % 128;
                        } else {
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            getInputFormats = (getHighSpeedVideoSizes + 51) % 128;
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(4 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 207, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr33);
                            if (((java.lang.String) objArr33[0]).intern().equals(string)) {
                                java.util.TreeMap<java.lang.String, util.h.xy.ce.b> highResolutionOutputSizeshNQ4ISI2 = maVar.getHighResolutionOutputSizeshNQ4ISI();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(11 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1380 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr34);
                                byte[] m257863 = util.h.xy.bx.ra.f1063.m25786(jSONObject.getString(((java.lang.String) objArr34[0]).intern()));
                                util.h.xy.ar.b.m25074(m257863);
                                util.h.xy.ar.mb[] m250592 = util.h.xy.ar.a.m25059(m257863, new byte[]{3, 2});
                                int length4 = m250592.length;
                                java.lang.String[] Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(jSONObject, length4);
                                if (Camera2StreamConfigurationMap5.length != 1) {
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 18, 1561 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 53826), objArr35);
                                    throw new org.json.JSONException(((java.lang.String) objArr35[0]).intern());
                                }
                                org.json.JSONObject highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(jSONObject, str);
                                try {
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(android.graphics.Color.rgb(0, 0, 0) + 16777219, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1481, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr36);
                                    java.lang.String optString4 = highSpeedVideoFpsRanges5.optString(((java.lang.String) objArr36[0]).intern(), null);
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(android.view.KeyEvent.getDeadChar(0, 0) + 7, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1391, (char) (14410 - android.text.TextUtils.getOffsetBefore("", 0)), objArr37);
                                    java.lang.String string4 = jSONObject.getString(((java.lang.String) objArr37[0]).intern());
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(android.graphics.Color.rgb(0, 0, 0) + 16777222, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 1401, (char) (39992 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr38);
                                    java.lang.String[] highSpeedVideoFpsRanges6 = ((java.lang.String) objArr38[0]).intern().equals(string4) ? getHighSpeedVideoFpsRanges(jSONObject, length4) : null;
                                    if (m250592.length != 0) {
                                        int i13 = 0;
                                        while (i13 < m250592.length) {
                                            int i14 = getHighSpeedVideoSizes + 69;
                                            getInputFormats = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                java.lang.String str10 = Camera2StreamConfigurationMap5[i13];
                                                highResolutionOutputSizeshNQ4ISI2.isEmpty();
                                                throw new java.lang.ArithmeticException();
                                            }
                                            java.lang.String str11 = Camera2StreamConfigurationMap5[i13];
                                            if (!highResolutionOutputSizeshNQ4ISI2.isEmpty() || highResolutionOutputSizeshNQ4ISI2.containsKey(str11)) {
                                                str4 = string4;
                                                str5 = str7;
                                                if (highResolutionOutputSizeshNQ4ISI2.isEmpty() || !highResolutionOutputSizeshNQ4ISI2.containsKey(str11)) {
                                                    break loop0;
                                                }
                                                util.h.xy.ce.b bVar2 = highResolutionOutputSizeshNQ4ISI2.get(str11);
                                                if (m250592[i13].m25110() != null) {
                                                    getInputFormats = (getHighSpeedVideoSizes + 59) % 128;
                                                    bVar2.getHighSpeedVideoFpsRanges(m250592[i13].m25110());
                                                    util.h.xy.ak.ma.f84.m24988(str2.getBytes(util.h.xy.h.a.f2221), new byte[]{1});
                                                }
                                                getHighSpeedVideoSizes = (getInputFormats + 65) % 128;
                                            } else {
                                                java.lang.String str12 = string4;
                                                str4 = string4;
                                                str5 = str7;
                                                util.h.xy.ce.b bVar3 = new util.h.xy.ce.b(str, str12, Camera2StreamConfigurationMap5[i13], optString4, highSpeedVideoFpsRanges6[i13]);
                                                bVar3.Camera2StreamConfigurationMap(m250592[i13].m25110());
                                                highResolutionOutputSizeshNQ4ISI2.put(str11, bVar3);
                                                util.h.xy.ak.ma.f84.m24988(str2.getBytes(util.h.xy.h.a.f2221), new byte[]{0});
                                                getInputFormats = (getHighSpeedVideoSizes + 83) % 128;
                                            }
                                            i13++;
                                            str7 = str5;
                                            string4 = str4;
                                        }
                                    }
                                } catch (java.lang.Throwable th3) {
                                    cause = th3.getCause();
                                    if (cause == null) {
                                    }
                                }
                                cause = th3.getCause();
                                if (cause == null) {
                                    throw cause;
                                }
                                throw th3;
                            }
                        }
                    } else {
                        str3 = str2;
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(4 - android.text.TextUtils.getOffsetBefore("", 0), 209 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr39);
                        if (((java.lang.String) objArr39[0]).intern().equals(str)) {
                            getHighSpeedVideoSizes = (getInputFormats + 23) % 128;
                            Camera2StreamConfigurationMap(str, maVar, jSONObject);
                        }
                        i3 = i + 1;
                        jSONArray2 = jSONArray;
                        str6 = str3;
                        i2 = 0;
                    }
                }
                str3 = str2;
                i3 = i + 1;
                jSONArray2 = jSONArray;
                str6 = str3;
                i2 = 0;
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }
        java.lang.Object[] objArr40 = new java.lang.Object[1];
        getHighSpeedVideoSizes(32 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i2) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i2) == 0.0d ? 0 : -1)), android.graphics.Color.blue(i2) + 1409, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(i2) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i2) == 0L ? 0 : -1)) + 63186), objArr40);
        throw new org.json.JSONException(((java.lang.String) objArr40[i2]).intern());
    }

    private static org.json.JSONObject getHighSpeedVideoFpsRanges(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.View.MeasureSpec.getMode(0) + 11, 175 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern());
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(5 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 186, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            java.lang.String string = jSONObject2.getString(((java.lang.String) objArr2[0]).intern());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(10 - android.graphics.Color.green(0), 190 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.graphics.Color.blue(0), objArr3);
            if (((java.lang.String) objArr3[0]).intern().equals(str)) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(3 - android.view.View.MeasureSpec.getSize(0), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 204, (char) android.text.TextUtils.indexOf("", ""), objArr4);
                if (!((java.lang.String) objArr4[0]).intern().equals(string)) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(42 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr5);
                    throw new org.json.JSONException(((java.lang.String) objArr5[0]).intern());
                }
            } else {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(4 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 199 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr6);
                if (!((java.lang.String) objArr6[0]).intern().equals(str)) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(4 - android.view.View.MeasureSpec.getSize(0), 210 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
                    if (!((java.lang.String) objArr7[0]).intern().equals(str)) {
                        return jSONObject2;
                    }
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(2 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 204 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
                    if (!((java.lang.String) objArr8[0]).intern().equals(string)) {
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 42, android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, (char) (android.view.MotionEvent.axisFromString("") + 1), objArr9);
                        throw new org.json.JSONException(((java.lang.String) objArr9[0]).intern());
                    }
                } else {
                    getInputFormats = (getHighSpeedVideoSizes + 19) % 128;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(3 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 207 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr10);
                    if (!((java.lang.String) objArr10[0]).intern().equals(string)) {
                        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                        getInputFormats = (getHighSpeedVideoSizes + 39) % 128;
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(capsMode + 3, (keyRepeatDelay >> 16) + 204, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), objArr11);
                        if (!((java.lang.String) objArr11[0]).intern().equals(string)) {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(41 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr12);
                            throw new org.json.JSONException(((java.lang.String) objArr12[0]).intern());
                        }
                    }
                }
            }
            return jSONObject2;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
    
        if (r0 >= r11.length()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
    
        if (r11.getString(r0).length() != 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        r3 = r11.getString(r0);
        r12[r0] = r3;
        r10 = new java.lang.Object[1];
        getHighSpeedVideoSizes(14 - android.view.KeyEvent.getDeadChar(0, 0), android.view.View.combineMeasuredStates(0, 0) + 362, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17516), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        if (r3.matches(((java.lang.String) r10[0]).intern()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        r0 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.graphics.Color.alpha(0) + 31, (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 375, (char) android.text.TextUtils.indexOf("", "", 0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ec, code lost:
    
        throw new org.json.JSONException(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ed, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoSizes((-16777173) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 319, (char) (32506 - android.text.TextUtils.indexOf("", "")), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0114, code lost:
    
        throw new org.json.JSONException(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0115, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r11.length() == r12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r11.length() == r12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0116, code lost:
    
        r11.length();
        r0 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51, (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (char) android.text.TextUtils.getCapsMode("", 0, 0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0140, code lost:
    
        throw new org.json.JSONException(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0073, code lost:
    
        r12 = new java.lang.String[r11.length()];
        util.h.xy.ce.a.getInputFormats = (util.h.xy.ce.a.getHighSpeedVideoSizes + 37) % 128;
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String[] getHighSpeedVideoSizes(org.json.JSONObject jSONObject, int i) throws org.json.JSONException {
        org.json.JSONArray jSONArray;
        int i2 = getInputFormats + 107;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(37 >>> (android.view.ViewConfiguration.getLongPressTimeout() / 77), 15727 % android.view.View.getDefaultSize(1, 0), (char) (36457 >> (android.view.ViewConfiguration.getDoubleTapTimeout() / 93)), objArr);
            jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr[0]).intern());
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(12 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 256 - android.view.View.getDefaultSize(0, 0), (char) (36457 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr2);
            jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr2[0]).intern());
        }
    }

    private static java.lang.String[] Camera2StreamConfigurationMap(org.json.JSONObject jSONObject, int i) throws org.json.JSONException {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(11 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 256 - android.text.TextUtils.getOffsetAfter("", 0), (char) (36457 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr[0]).intern());
            if (jSONArray.length() != i) {
                jSONArray.length();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.view.View.resolveSizeAndState(0, 0, 0) + 51, 268 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                throw new org.json.JSONException(((java.lang.String) objArr2[0]).intern());
            }
            java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                java.lang.String string = jSONArray.getString(i2);
                strArr[i2] = string;
                if (!getHighSpeedVideoFpsRangesFor(string)) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 408, (char) android.graphics.Color.red(0), objArr3);
                    throw new org.json.JSONException(((java.lang.String) objArr3[0]).intern());
                }
            }
            return strArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0087, code lost:
    
        if (r0 >= r9.length()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
    
        r1 = util.h.xy.bx.ra.f1063.m25786(r9.getString(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if (r1.length != 16) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        r10[r0] = util.h.xy.ar.b.m25074(r1);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.graphics.Color.argb(0, 0, 0, 0) + 28, android.view.View.resolveSize(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
    
        throw new org.json.JSONException(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r9.length() == r10) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (r9.length() == r10) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00cb, code lost:
    
        r3 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 49, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 453, (char) android.graphics.Color.argb(0, 0, 0, 0), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00f5, code lost:
    
        throw new org.json.JSONException(((java.lang.String) r3[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        r10 = new java.lang.String[r9.length()];
        util.h.xy.ce.a.getInputFormats = (util.h.xy.ce.a.getHighSpeedVideoSizes + 39) % 128;
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String[] getHighSpeedVideoFpsRanges(org.json.JSONObject jSONObject, int i) throws org.json.JSONException {
        org.json.JSONArray jSONArray;
        int i2 = getHighSpeedVideoSizes + 15;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(80 >>> android.text.TextUtils.lastIndexOf("", 'o'), (android.view.ViewConfiguration.getScrollDefaultDelay() / 62) * 2145, (char) (47948 >>> (android.view.ViewConfiguration.getMaximumFlingVelocity() / 65)), objArr);
            jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr[0]).intern());
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(8 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 444 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (47948 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr2);
            jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr2[0]).intern());
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap, util.h.xy.ar.mb[] mbVarArr, java.lang.String str2, java.lang.String[] strArr, java.lang.String str3, java.lang.String[] strArr2) throws org.json.JSONException {
        if (mbVarArr.length != 0) {
            for (int i = 0; i < mbVarArr.length; i++) {
                byte m25109 = mbVarArr[i].m25109();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.text.TextUtils.getOffsetBefore("", 0) + 4, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 529, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(strArr[i]);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(util.h.xy.ar.b.m25084(util.h.xy.ar.b.m25076(sb.toString())));
                if (treeMap.containsKey(valueOf)) {
                    util.h.xy.ce.b bVar = treeMap.get(valueOf);
                    if (5 == m25109) {
                        if (bVar.getOutputFormats() != null) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(android.text.TextUtils.getCapsMode("", 0, 0) + 80, 534 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                            throw new org.json.JSONException(((java.lang.String) objArr2[0]).intern());
                        }
                        bVar.getHighSpeedVideoFpsRangesFor(mbVarArr[i].m25110());
                    } else if (4 == m25109) {
                        if (bVar.Camera2StreamConfigurationMap() != null) {
                            try {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(80 - (android.view.ViewConfiguration.getTapTimeout() >> 16), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 534, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
                                throw new org.json.JSONException(((java.lang.String) objArr3[0]).intern());
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bVar.getHighSpeedVideoFpsRanges(mbVarArr[i].m25110());
                    } else if (12 == m25109) {
                        if (bVar.getHighSpeedVideoFpsRangesFor() != null) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(80 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 533 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
                            throw new org.json.JSONException(((java.lang.String) objArr4[0]).intern());
                        }
                        bVar.getHighResolutionOutputSizeshNQ4ISI(mbVarArr[i].m25110());
                    }
                    if (strArr2 != null) {
                        if (bVar.getHighSpeedVideoFpsRanges() == null) {
                            java.lang.String str4 = strArr2[i];
                            int i2 = (util.h.xy.ce.b.getHighSpeedVideoFpsRanges + 53) % 128;
                            util.h.xy.ce.b.getHighSpeedVideoFpsRangesFor = i2;
                            bVar.getHighSpeedVideoSizesFor = str4;
                            util.h.xy.ce.b.getHighSpeedVideoFpsRanges = (i2 + 13) % 128;
                        } else if (!bVar.getHighSpeedVideoFpsRanges().equals(strArr2[i])) {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(34 - android.graphics.Color.green(0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 614, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr5);
                            throw new org.json.JSONException(((java.lang.String) objArr5[0]).intern());
                        }
                    }
                    int i3 = (util.h.xy.ce.b.getHighSpeedVideoFpsRangesFor + 29) % 128;
                    util.h.xy.ce.b.getHighSpeedVideoFpsRanges = i3;
                    bVar.getHighResolutionOutputSizeshNQ4ISI = str3;
                    util.h.xy.ce.b.getHighSpeedVideoFpsRangesFor = (i3 + 109) % 128;
                    treeMap.put(valueOf, bVar);
                } else {
                    util.h.xy.ce.b bVar2 = new util.h.xy.ce.b(str, str2, strArr[i], str3, strArr2 != null ? strArr2[i] : null);
                    if (5 == m25109) {
                        bVar2.getHighSpeedVideoFpsRangesFor(mbVarArr[i].m25110());
                    } else if (4 == m25109) {
                        bVar2.getHighSpeedVideoFpsRanges(mbVarArr[i].m25110());
                    } else if (12 == m25109) {
                        bVar2.getHighResolutionOutputSizeshNQ4ISI(mbVarArr[i].m25110());
                    }
                    treeMap.put(valueOf, bVar2);
                }
            }
        }
    }

    private static util.h.xy.d.mg getHighSpeedVideoFpsRangesFor(java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap, java.lang.String str) throws org.json.JSONException {
        if (treeMap.isEmpty()) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 76, 763 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 24804), objArr);
                throw new org.json.JSONException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            util.h.xy.ce.b value = it.next().getValue();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 757, (char) (50824 - android.graphics.Color.alpha(0)), objArr2);
            if (str.equals(((java.lang.String) objArr2[0]).intern()) && (value.getHighResolutionOutputSizeshNQ4ISI() != 3 || value.getOutputMinFrameDuration() != 3)) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.view.KeyEvent.keyCodeFromString("") + 73, android.widget.ExpandableListView.getPackedPositionType(0L) + 839, (char) android.graphics.Color.blue(0), objArr3);
                throw new org.json.JSONException(((java.lang.String) objArr3[0]).intern());
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 4, 759 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (62891 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr4);
            if (str.equals(((java.lang.String) objArr4[0]).intern()) && (value.getHighResolutionOutputSizeshNQ4ISI() != 2 || value.getOutputMinFrameDuration() != 2)) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes(51 - android.view.View.combineMeasuredStates(0, 0), 912 - android.graphics.Color.alpha(0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr5);
                throw new org.json.JSONException(((java.lang.String) objArr5[0]).intern());
            }
        }
        if ((util.h.xy.ar.b.m25077(util.h.xy.ar.b.m25076(treeMap.get(treeMap.firstKey()).getHighSpeedVideoSizes())) + treeMap.size()) - 1 != util.h.xy.ar.b.m25077(util.h.xy.ar.b.m25076(treeMap.get(treeMap.lastKey()).getHighSpeedVideoSizes()))) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, android.text.TextUtils.getOffsetAfter("", 0) + 963, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 13509), objArr6);
            throw new org.json.JSONException(((java.lang.String) objArr6[0]).intern());
        }
        return util.h.xy.d.mg.f1145;
    }

    private static util.h.xy.d.mg getHighSpeedVideoFpsRangesFor(java.util.TreeMap<java.lang.String, util.h.xy.ce.b> treeMap, java.util.LinkedHashMap<java.lang.String, util.h.xy.ce.b> linkedHashMap, java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (treeMap.isEmpty() && linkedHashMap.isEmpty()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(65 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 998, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 18077), objArr);
            throw new org.json.JSONException(((java.lang.String) objArr[0]).intern());
        }
        if (!treeMap.isEmpty() && !linkedHashMap.isEmpty()) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(36 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1062 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr2);
            throw new org.json.JSONException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.d.mg mgVar = null;
        if (!treeMap.isEmpty()) {
            if (treeMap.size() != 1) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 61, 1099 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr3);
                throw new org.json.JSONException(((java.lang.String) objArr3[0]).intern());
            }
            java.util.Iterator<java.util.Map.Entry<java.lang.String, util.h.xy.ce.b>> it = treeMap.entrySet().iterator();
            while (it.hasNext()) {
                util.h.xy.ce.b value = it.next().getValue();
                if (java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(str.getBytes(util.h.xy.h.a.f2221)), new byte[]{1})) {
                    if (value.getOutputMinFrameDuration() != 2 || value.getInputFormats() == null || value.Camera2StreamConfigurationMap() == null) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(14 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1160 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr4);
                        throw new org.json.JSONException(((java.lang.String) objArr4[0]).intern());
                    }
                } else if (value.getOutputMinFrameDuration() != 1 || value.getInputFormats() == null) {
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.view.View.MeasureSpec.getMode(0) + 15, 1160 - android.text.TextUtils.indexOf("", "", 0), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr5);
                        throw new org.json.JSONException(((java.lang.String) objArr5[0]).intern());
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            mgVar = util.h.xy.d.mg.f1144;
        }
        if (linkedHashMap.isEmpty()) {
            return mgVar;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, util.h.xy.ce.b>> it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            util.h.xy.ce.b value2 = it2.next().getValue();
            if (value2.getOutputMinFrameDuration() != 1 || value2.getOutputFormats() == null) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 71, 1175 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr6);
                throw new org.json.JSONException(((java.lang.String) objArr6[0]).intern());
            }
        }
        return util.h.xy.d.mg.f1145;
    }

    private static util.h.xy.d.mg getHighSpeedVideoFpsRanges(java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap) throws org.json.JSONException {
        try {
            if (treeMap.isEmpty()) {
                float maxVolume = android.media.AudioTrack.getMaxVolume();
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(65 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), 1246 - (intValue >> 22), (char) (50023 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr);
                throw new org.json.JSONException(((java.lang.String) objArr[0]).intern());
            }
            java.util.Iterator<java.util.Map.Entry<java.lang.Integer, util.h.xy.ce.b>> it = treeMap.entrySet().iterator();
            while (it.hasNext()) {
                util.h.xy.ce.b value = it.next().getValue();
                int i = (util.h.xy.ce.b.getHighSpeedVideoFpsRanges + 37) % 128;
                util.h.xy.ce.b.getHighSpeedVideoFpsRangesFor = i;
                if (value.Camera2StreamConfigurationMap != null) {
                    int i2 = i + 113;
                    util.h.xy.ce.b.getHighSpeedVideoFpsRanges = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    if (value.getOutputMinFrameDuration != null && value.getHighSpeedVideoSizes == null) {
                        int i3 = (i + 69) % 128;
                        util.h.xy.ce.b.getHighSpeedVideoFpsRanges = i3;
                        if (value.getInputSizeshNQ4ISI == null) {
                            util.h.xy.ce.b.getHighSpeedVideoFpsRangesFor = (i3 + 115) % 128;
                        }
                    }
                }
                long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes((longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)) + 69, 1310 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 45707), objArr2);
                throw new org.json.JSONException(((java.lang.String) objArr2[0]).intern());
            }
            if ((util.h.xy.ar.b.m25077(util.h.xy.ar.b.m25076(treeMap.get(treeMap.firstKey()).getHighSpeedVideoSizes())) + treeMap.size()) - 1 == util.h.xy.ar.b.m25077(util.h.xy.ar.b.m25076(treeMap.get(treeMap.lastKey()).getHighSpeedVideoSizes()))) {
                return util.h.xy.d.mg.f1145;
            }
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(35 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 963, (char) (13509 - android.view.View.resolveSize(0, 0)), objArr3);
            throw new org.json.JSONException(((java.lang.String) objArr3[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @util.h.xy.a.a
    private static void Camera2StreamConfigurationMap(java.lang.String str, util.h.xy.ce.ma maVar, org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> Camera2StreamConfigurationMap2;
        java.lang.String[] strArr;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(11 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1380, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        byte[] m25786 = util.h.xy.bx.ra.f1063.m25786(jSONObject.getString(((java.lang.String) objArr[0]).intern()));
        util.h.xy.ar.b.m25074(m25786);
        int alpha = android.graphics.Color.alpha(0);
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        getHighSpeedVideoSizes = (getInputFormats + 121) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(alpha + 7, indexOf + 1392, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 14410), objArr2);
            java.lang.String string = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(5 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1401 - android.text.TextUtils.indexOf("", ""), (char) (39991 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr3);
            if (!((java.lang.String) objArr3[0]).intern().equals(string)) {
                getHighSpeedVideoSizes = (getInputFormats + 11) % 128;
                int axisFromString = android.view.MotionEvent.axisFromString("");
                getInputFormats = (getHighSpeedVideoSizes + 111) % 128;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(1 - axisFromString, 1407 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (android.graphics.Color.rgb(0, 0, 0) + 16792934), objArr4);
                if (!((java.lang.String) objArr4[0]).intern().equals(string)) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.graphics.Color.alpha(0) + 32, 1409 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63186), objArr5);
                    throw new org.json.JSONException(((java.lang.String) objArr5[0]).intern());
                }
            }
            util.h.xy.ar.mb[] m25059 = util.h.xy.ar.a.m25059(m25786, new byte[]{5, 4});
            int length = m25059.length;
            int length2 = m25059.length;
            if (length2 == 0) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(43 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.getOffsetBefore("", 0) + 1627, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr6);
                throw new org.json.JSONException(((java.lang.String) objArr6[0]).intern());
            }
            java.lang.String[] highSpeedVideoSizes = getHighSpeedVideoSizes(jSONObject, length2);
            org.json.JSONObject highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(jSONObject, str);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(2 - android.graphics.ImageFormat.getBitsPerPixel(0), 1481 - android.text.TextUtils.getTrimmedLength(""), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
            java.lang.String optString = highSpeedVideoFpsRanges.optString(((java.lang.String) objArr7[0]).intern(), null);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1484, (char) (31892 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr8);
            java.lang.String optString2 = highSpeedVideoFpsRanges.optString(((java.lang.String) objArr8[0]).intern(), null);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, 1669 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (4274 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr9);
            if (((java.lang.String) objArr9[0]).intern().equalsIgnoreCase(optString2)) {
                Camera2StreamConfigurationMap2 = maVar.getHighSpeedVideoFpsRangesFor();
            } else {
                Camera2StreamConfigurationMap2 = maVar.Camera2StreamConfigurationMap();
                getHighSpeedVideoSizes = (getInputFormats + 41) % 128;
            }
            java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap = Camera2StreamConfigurationMap2;
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1401, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 39992), objArr10);
            if (((java.lang.String) objArr10[0]).intern().equals(string)) {
                getHighSpeedVideoSizes = (getInputFormats + 1) % 128;
                strArr = getHighSpeedVideoFpsRanges(jSONObject, length2);
            } else {
                strArr = null;
            }
            getHighSpeedVideoSizes(str, treeMap, m25059, string, highSpeedVideoSizes, optString, strArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static util.h.xy.d.rc[] getHighResolutionOutputSizeshNQ4ISI(java.util.TreeMap<java.lang.String, util.h.xy.ce.b> treeMap, java.lang.String str, int i) {
        getInputFormats = (getHighSpeedVideoSizes + 109) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ue6f9㦩塓磣鯑먧\udad4ﶍ᰾㳒彴縎麮넢퀺\uf0a3ፀ㏭劇男闝뒅휯\uf7daᙴ⤝", 57179 - android.view.View.MeasureSpec.getSize(0), objArr);
            java.security.SecureRandom secureRandom = (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
            util.h.xy.d.rc[] rcVarArr = null;
            byte[] bArr = null;
            for (java.util.Map.Entry<java.lang.String, util.h.xy.ce.b> entry : treeMap.entrySet()) {
                getInputFormats = (getHighSpeedVideoSizes + 111) % 128;
                java.lang.String key = entry.getKey();
                util.h.xy.ce.b value = entry.getValue();
                util.h.xy.d.rc[] rcVarArr2 = new util.h.xy.d.rc[treeMap.size()];
                if (value.getInputSizeshNQ4ISI() != null) {
                    getHighSpeedVideoSizes = (getInputFormats + 23) % 128;
                    bArr = util.h.xy.ar.b.m25076(value.getInputSizeshNQ4ISI());
                }
                byte[] m25076 = value.getHighSpeedVideoFpsRanges() != null ? util.h.xy.ar.b.m25076(value.getHighSpeedVideoFpsRanges()) : null;
                int length = value.getHighSpeedVideoSizes().getBytes().length;
                util.h.xy.ar.b.m25074(value.getHighSpeedVideoSizes().getBytes());
                util.h.xy.ar.b.m25074(value.getInputFormats());
                util.h.xy.ar.b.m25074(value.Camera2StreamConfigurationMap());
                util.h.xy.ar.b.m25074(value.getHighSpeedVideoFpsRangesFor());
                rcVarArr2[0] = new util.h.xy.d.rc(value.getInputFormats(), value.Camera2StreamConfigurationMap(), str.getBytes(), value.getHighSpeedVideoSizes().getBytes(), value.getHighSpeedVideoFpsRangesFor(), bArr, 0, i, m25076);
                treeMap.put(key, Camera2StreamConfigurationMap(secureRandom, value));
                getInputFormats = (getHighSpeedVideoSizes + 89) % 128;
                rcVarArr = rcVarArr2;
            }
            return rcVarArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static util.h.xy.ce.b Camera2StreamConfigurationMap(java.security.SecureRandom secureRandom, util.h.xy.ce.b bVar) {
        int i = getInputFormats + 121;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            if (bVar.getOutputFormats() != null) {
                byte[] bArr = new byte[bVar.getOutputFormats().length];
                secureRandom.nextBytes(bArr);
                bVar.getHighSpeedVideoFpsRangesFor(bArr);
                getInputFormats = (getHighSpeedVideoSizes + 73) % 128;
            }
            if (bVar.Camera2StreamConfigurationMap() != null) {
                byte[] bArr2 = new byte[bVar.Camera2StreamConfigurationMap().length];
                secureRandom.nextBytes(bArr2);
                bVar.getHighSpeedVideoFpsRanges(bArr2);
            }
            if (bVar.getInputFormats() != null) {
                getHighSpeedVideoSizes = (getInputFormats + 51) % 128;
                byte[] bArr3 = new byte[bVar.getInputFormats().length];
                secureRandom.nextBytes(bArr3);
                bVar.Camera2StreamConfigurationMap(bArr3);
            }
            return bVar;
        }
        bVar.getOutputFormats();
        throw new java.lang.ArithmeticException();
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        getInputFormats = (getHighSpeedVideoSizes + 19) % 128;
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int indexOf = android.text.TextUtils.indexOf("", "", 0);
        getHighSpeedVideoSizes = (getInputFormats + 23) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(7 - lastIndexOf, indexOf + 1673, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 54926), objArr);
            if (!str.matches(((java.lang.String) objArr[0]).intern())) {
                return false;
            }
            long parseLong = java.lang.Long.parseLong(str.substring(1, 5));
            return parseLong >= 1 && parseLong <= 8784;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void Camera2StreamConfigurationMap() {
        getHighResolutionOutputSizeshNQ4ISI = -9037988415955413752L;
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[1681];
        java.nio.ByteBuffer.wrap("\u0002Í\nó\u0012\u009d\u001a\u0087\"t*\u00072';ÔC\u0092K¼\u009cs\u0094M\u008c#\u0084.¼Í´¾¬\u0092¥m ð(Ý0¡8¶\u0000X\b)\u0010(\u0019ða°i\u0088qt\u009cl\u0094A\u008c=\u0084*¼Ä´µ¬\u009a¥{Ý'Õ\u0004Íè\u009cl\u0094A\u008c=\u0084>¼Ä´µ¬\u0084\u0087Ö\u008fù\u0097\u0090\u009f¿§b¯\"·<¾ÑÆ\u0082Î¦ÖJæ-î\u0019öjþZÆ\u009eÎüÖúß6§t¯\\¥¶\u00ad\u0093µñ½ð\u0085\u001e\u008do\u0095@\u009c¡äýìÞô2Sp[HC K\bsÁ{\u009dc\u0097jf\u0012%\u001a\u0014\u0002ô\n·2¯9g![)\u0003ÑõÙ×Á\u0096ÈbðUø1à¨èÁ\u0090½\u009fv\u0087n\u008f\u0010·?¿×§«¯\u0093VS^ F\u001cNýv«\u0096\u001f\u009e%\u0086X\u008es¶º¾Ç¦Ú¯&×`ßKÇ¶Ï÷÷äü ä\u0010ìO\u0014\u00ad\u001c\u0080\u0004Æ\r)5\u0017=*%ë-\u0086UðZ/B\u0015JgrAz\u009cbæjÞ\u0093=\u009be\u0083F\u008b\u0095³û»Å ?¨!Ð@Ø¨À×\u009cQ\u0094Z\u008c<\u0084\f¼æ´¾¬\u0092¥zÝiÕ\u0019ÍèÅâý\u0083öaîSæ\n\u009cq\u0094I\u008c*\u00849¼×´©¬\u0093¥_Ý=Õ\u0004Íé\u009cu\u0094Q\u008c#\u0084\u001f\u009cL\u0094i\u008c\u0000\u0084.¼à´\u009e¬´¥_Ý\u001bÕ4\u009cW\u0094a\u008c\u0000\u0084;\u009cR\u0094}\u008c\u0018\u009cM\u0094}\u008c\u0018\u009cQ\u0094}\u008c\u0001\u0084?\u009cH\u0094F\u008c%\u0084\u001b¼É´¥¬\u0093¥>Ý\u0019Õ\u0011ÍâÅ¯ý\u0088özîKæF\u001eÒ\u0016Ê\u000e\u0086\u0007n?P72/ó'Ç_¸PlH\u000b@&x\u0004pÔhª`Ö\u0099G\u0091'\u0089\u0001\u0081º¹¶±\u008fª\u007f¢[Ú\u0004Òõ\u0012\f\u001a(\u0002L\nv2¾:Ö\"÷+\u0011SI[|C\u0080KØ\u009cO\u0094]\u008c>\u0084\u0018¼À´¾¬×¥qÝ/ÕPÍßÅ«ý\u009böqîMæ\u0015\u001eø\u0016Þ\u000e\u008a\u0007o?G7//§'À_¶PtH\u000b@?x\u001cpÐh¬`\u009e\u0099\u0001\u0091?\u0089\u001a\u0081î¹\u00ad±Ìªy¢KÚ\u0004ÒòÊÞÂ\u0090û-ó[ë9ã¦\u001bÚ\u0013½\u0004zâ·ê·òÇúçÂ+Ê^Ò-Û\u008b£Õ«ª³%»Q\u0083a\u0088\u008b\u0090·\u0098ï`\u0002h$ppy\u0095A½IÕQ]Y=!P.Ú6¿>Ç\u0006ó\u000e~\u0016\u0001\u001e,ç³ï×÷ñÿ\u0001Ç\u001fÏrÔ\u0084Ü£¤ú¬\u001e´2Ø6ÐtÈ\u0012À/ø\u0088ð\u008dèÝá\u0013\u0099\b\u0091z\u0089ª\u0081Õ¹µ²\u0005\u009cH\u0094F\u008c%\u0084\u001b¼É´¥¬\u0093¥>Ý/Õ\u001fÍéÅ¯ý\u008cö`î\u001fæ\t\u001e÷\u0016\u0098\u000e¢\u0007^?v7|/·'\u009e_éP0H\u0006@\u0014x;pâh\u0089\u009cE\u0094A\u008c%\u0084\u001f¼×´¿¬\u009e¥xÝ Õ\u0015ÍéÅ±ýÍö}îLæF\u001eÿ\u0016×\u000e\u0097\u0007*?\\72/§'÷_\u0091PHHc@\u001ax>pçhï`\u0090\u0099N\u0091:\u0089\u001e\u0081û¹±',/\u00137t?x\u0007\u0086\u000fî\u0017Ø\u001e7fv\u009cO\u0094]\u008c>\u0084\u0018¼À´¾¬×¥qÝ/ÕPÍÚÅ\u0095ý¦ö4îQæ\t\u001eÿ\u0016Û\u000e\u0086\u0007*?[73/ó'\u008e_´PaH_@1x\u0015p\u0084h¸`\u009f\u0099U\u0091 \u0089S\u0081ô¹°±\u0081ªu¢[Ú\u001bÒ°ÊÔÂ\u0084û-ó_ë:ãÿ\u009cM\u0094M\u008c=\u0084\u001d¼Ñ´¤¬×¥qÝ/ÕPÍÚÅ\u0095ý¦ö4îVæ\u0015\u001e±\u0016Ö\u000e\u008c\u0007~?\u00157m/±'\u008e_»PyH_@7\u009c1\u0094\u0018\u008cc\u0084J\u009cE\u0094A\u008c%\u0084\u001f¼×´¿¬\u009e¥xÝ Õ\u0015ÍéÅâý\u0084ögî\u001fæ\b\u001eþ\u0016Ì\u000eÃ\u0007\u007f?[75/ö'Û_¼P.H\u000b@\u001fx\u0012pÖhª`Ö\u0099U\u0091 \u0089\u0012\u0081ô¹å±\u0083ªy¢[ÚIÒÝÊÚÂ\u0091ûyóQë-ãå\u001bÐ\u0013ª\u0004g<\n4>,\u0019$Þ\\îT\u009fMOE9}Ruîm´e\u008a\u009eu\u0096(\u008e\u000e\u0086ê¾\u009a¶¤¯X§tß~×íÏÕÇ¯øgðNè à\u001a\u0018Â\u009c@\u0094D\u008c!\u0084\u001f¼Ä´¨¬\u008e¥>Ý*Õ\u001fÍõÅ¶ý\u008cö}îQæF\u001eß\u0016×\u000e\u008d\u0007i?P7|/á'Á_«P H_@:x\u0014p×hï`\u0097\u0099U\u0091+\u009cL\u0094G\u008c!\u0084\u001f¼\u0085´¸¬\u009f¥\u007fÝ'ÕPÍôÅ¬ý\u0088ö4îiæ\u000f\u001eâ\u0016Ù\u000eÃ\u0007F?`7\u0017/§'Å_¼PyH\u000b@6x\u0018pÐhª`\u0095\u0099U\u0091-\u0089\u0017j©b\u00adzÉróJ;BSZrS\u0094+Ì#ù;\u00053\u000e\u000bh\u0000\u008b\u0018ó\u0010äè\u0012à ø/ñ\u0093É·ÁÙÙ\u001aÑ7©P¦Â¾ç¶ó\u008eþ\u0086:\u009eF\u0096:o¹gÌ\u007fþw\u0018O\tGo\\\u0095T·,¥$\u0017<24w\rÁ\u0005¯\u001dÚ\u0015\u001eí5å\u0014ò\u009cÊ§ÂÔÚõÒkªF¢|»º³Â\u008bì\u0083\u0002\u009bA\u0093eh\u0093`Èxöp_H2@lY\u0094Q¾)Ñ!\u0011991SZÊRìiïaÑy«q\u0080ü«ô£ì\u0097äýÜ.ÔEÌcÅ\u009b½Ùµý\u00ad\u001d¥J\u009dl\u0096Ð\u008e¶\u0086ã~\u0006v(nbg\u009c_²WÙO\u0011G.?\u001d0\u008f(ª Ï\u0018¹\u00104\bD\u00002ùµñÍéåá\rÙDÑ&ÊÓÂ\u0097ºì²\u0007ª+¢c\u009b\u009b\u0093³\u008bÚ\u0083\u0010{1s\u001cd\u0097\\¯TÃLëD*<D4z-ä%Ë\u001d÷\u0015\r\rA\u0005iþ\u0093öÖîéæWÞ7ÖrÏÈÇ¶¿×·\u001d¯ §F\u0098È\u009cE\u0094G\u008cs\u0084\u0014¼Ê´¸¬×¥}Ý&Õ\u001eÍïÅ£ý\u0084özî\u001fæ\u0007\u001e±\u0016È\u000e\u0082\u0007c?G7|/è'È_ùPSH~@\u0019x\"pñh\u0082`²\u0099\u0001\u0091)\u0089\u001d\u0081þ¹å±¿ªB¢uÚ6ÒÝÊÿÂÂûbóFë\u007fãë\u001bØ\u0013«\u0004p<C4;,\u001b$\u0087\\\u0087TºMcEk}\u0016uämªe\u008e\u009e{\u0096(\u008e\u000b\u0086³¾Ô¶\u0090¯a§Uß;×û\u009cE\u0094G\u008cs\u0084\u0014¼Ê´¸¬×¥}Ý&Õ\u001eÍïÅ£ý\u0084özî\u001fæ\u0007\u001e±\u0016È\u000e\u0082\u0007c?G7|/è'È_ùPSH~@\u0019x\"pñh\u0082`²\u0099\u0001\u0091'\u0089\u0001\u0081º¹\u0096±¹ª\\¢aÚ$ÒÔÊ\u009bÂ\u0084ûbóFë\u007fãÂ\u001bâ\u0013\u008a\u0004S¨\u0085 ¹¸Õ°\u009f\u0088\t\u0080z\u0098\u0012\u0091µéãáÁù~ñnÉFÂñÚ\u0093ÒÍ*7\"\u000f:C3®\u000b\u0083\u0003ð\u001b,\u0013\fk<dª|\u009ctóLÝD\u0013\\*T\\\u00ad\u0082¥\u00ad½\u0087ÚÒÒÚÊîÂ\u0084úWò<ê\u001aãâ\u009b \u0093\u0084\u008bd\u00833»\u0015°©¨Ô \u0092X\u007fPDH^AüyÍq¸i:aG\u0019+\u0016½\u000eÆ\u0006®>\u00926J.7&Eß\u009c×\u0083Ï\u0087Çtÿ9÷QìúäÂ\u009c\u0086\u0094~\u008cO\u0084\u0011½÷µ\u0089\u00ad¦¥z]XU$BüzÖr»j\u0084b\u001a\u001a:\u0012\u0017\u000b\u009d\u0003³;\u00823p+-#\u000bØ¥\u009cN\u0094F\u008c?\u0084\u0003¼\u0085´\u009f¬\u0082¥nÝ9Õ\u001fÍéÅ¶ýÍögîVæ\b\u001eö\u0016Ô\u000e\u0086\u0007*?^79/þ'\u008e_\u008dPyH[@7x]pÂh `\u0084\u0099\u0001\u0091\u001e\u0089:\u0081É¹\u0084\u009cH\u0094F\u008c%\u0084\u001b¼É´¥¬\u0093¥>Ý/Õ\u001fÍéÅ¯ý\u008cö`î\u0011æF\u001eÜ\u0016Í\u000e\u008f\u0007~?\\7,/ë'Ë_ùPVHB@!x\u001cp\u0084h¤`\u0093\u0099X\u0091f\u0089S\u0081Õ¹«±\u0080ªn¢\u001eÚ\bÒóÊØÂ\u0087û}ó@ë\u007fã·\u001b\u0091\u0013®\u0004j<Y44,\\$ë\\\u009bT²M\u0000E }\u0017uä\u009cH\u0094F\u008c%\u0084\u001b¼É´¥¬\u0093¥>Ý/Õ\u001fÍéÅ¯ý\u008cö`î\u0011\u009cH\u0094F\u008c%\u0084\u001b¼É´¥¬\u0093¥>Ý/Õ\u001fÍéÅ¯ý\u008cö`î\u001fæ\t\u001e÷\u0016\u0098\u000e\u0093\u0007k?L7\u001f/õ'Ë_½P.H\u000b@\u0016x\u0012p\u0084h¡`\u0099\u0099U\u0091h\u0089\u0010\u0081õ¹«±\u0098ªv¢WÚ\u0007Ò°ÊíÂ«û^óuë\u007fãÕ\u001bä\u0013\u0093\u0004\\<\u007f4\u0018,8$\u0087\\¨T\u0096MREk}\u0013u½m·e\u0086\u009ex\u0096&\u008e\u0004\u0086ö¾\u009a¶¤¯X§t_(W O\u0014G~\u007f\u00adwÆoàf\u0018\u001eZ\u0016~\u000e\u009e\u0006É>ï5S-\b%tÝ\u0084ÕºÍ¤Ä\u0006ü7ôBìÀä½\u009cÑ\u0093G\u008b<\u0083T»h³°«Í£¿ZfR\u007fJaB\u008fzÇr«i\u0000a8\u0019|\u0011\u0084\tµ\u0001ë8\r0s(\\ \u0080Ø¢ÐÞÇ\u0006ÿ,÷Aï~çà\u009fÀ\u0097í\u008eg\u0086I¾x¶\u008a®×¦ñ]_.Î&Ì>ø6\u009f\u000eA\u00063\u001e\\\u0017öo\u00adg\u0095\u007fdw(O\u000fDñ\\\u0094T\u008c¬:¤C¼\tµè\u008dÌ\u0085÷\u009dc\u0095CírâØúõò\u0092Ê©ÂnÚ\u0007Ò]+Ë#\u00ad;\u009c31\u000b\u001d\u00032\u0018×\u0010êh®`Xx\u0010p\u0006IôA\u009fY·Qb©T¡'¶é\u008eÈ\u0086°\u009e×\u0096Eî+æ\u0004ÿÊ÷¬Ï\u0090Çrßo×\u000f,ø$³<Ã4l\fH\u0004\u001e\u001dâ\u009cq\u0094I\u008c*\u00849¼×´©¬\u0093¥ZÝ(Õ\u0004Íú¤.¬\f´z¼d\u0084\u0096\u008cö\u0094Ø\u009c@\u0094{\u008c\u001e\u0000n\bR\u00104\u0018\u0003 Ê(¿¡0©\fj\u009ab\u0094z÷rÉJ\u001bBwZASì+ý#Í;;3}\u000b^\u0000²\u0018Ã\u0010\u0094è\nà\u0004øGñ¹É\u008bÁçÙ1Ñ\\©n¦¼¾\u009a¶ \u008eû\u0086\u000f\u009em\u0096A\u009cO\u0094G\u008c=\u0084Z¼è´\u00ad¬\u0084¥jÝ,Õ\u0002ÍØÅ£ý\u009föpî\u001fæ\r\u001eô\u0016Á\u000eÃ\u0007l?Z7)/é'Ê_ùPiHE@rx-pÅh¶`\u009b\u0099D\u0091&\u0089\u0007\u0081º¹¦±\u009eªr¢Z\u009ce\u0094C\u008c:à÷èÕð§ø\u0081\u009cB\u0094g\u008c\u001d\u009cS\u0094m\u008c\u001e\u009cH\u0094F\u008c%\u0084\u001b¼É´¥¬\u0093¥>Ý/Õ\u001fÍéÅ¯ý\u008cö`î\u0011æF\u001eØ\u0016Ö\u000e\u0095\u0007k?Y75/ã'\u008e_ºPhHJ@<x]pðh¶`\u0086\u0099D]ÃUËM±EÖ}\u007fu)m\bdó\u001cå\u0014\u0097\fr\u00047<A7þ/Ü'\u009fßs×PÏOÆïþ×öðî[æC\u009e,\u0091á\u0089Â\u0081°¹\u0085±\b© ¡\bXÈP N\rF\u0005^1VKn\u0092fç~Áw=\u000fi\u0007^\u001f¼\u0017 /ù$\u001f<.4eÌóÄ\u0091ÜÄÕ1íWåqý·õÌ\u008dö\u0082-\u009a\u001b\u0092uª\u001f¢\u0092ºå²ÕK\rC*[\u0000SøkÑcçx\u0006p=\b\u000b\u0000\u0099\u0018\u009c\u0010Ù)o!\u00109r1±É\u009dÁþÖaî\u0001æyþ\u001eöµ\u008eí\u0086Â\u009f\u000f\u0097l¯^§«¿¦·ÎL&Df\\N\u009cO\u0094G\u008cs\u0084*¼Ð´¾¬\u0092¥>Ý:Õ\u0005ÍëÅ²ý\u0082öfîKæ\u0003\u001eõ\u0016\u0098\u000e\u0088\u0007o?L7|/á'Á_¬PnHO@rx\u0014pÊhï`¦\u0099@\u00911\u0089\u001e\u0081ÿ¹«±\u0098ª7¢]Ú\u001bÒõÊß\u008câ\u0084È\u009c¢JÔB\u0096ZðRÍjvb9zNsí".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1681);
        getHighSpeedVideoSizesFor = cArr;
        getHighSpeedVideoFpsRangesFor = -3801137489285639128L;
    }
}
