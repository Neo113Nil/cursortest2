package util.h.xy.g;

/* loaded from: classes5.dex */
final class d {
    private static int Camera2StreamConfigurationMap = 1;
    public static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor;
    private static char[] getOutputFormats;

    d() {
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighResolutionOutputSizeshNQ4ISI = "d";
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 101) % 128;
    }

    public static java.util.HashMap<java.lang.String, byte[]> Camera2StreamConfigurationMap(android.content.Context context) {
        java.util.HashMap<java.lang.String, byte[]> hashMap = new java.util.HashMap<>();
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(15 - android.graphics.ImageFormat.getBitsPerPixel(0), android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (android.view.View.MeasureSpec.getMode(0) + 58934), objArr);
        android.content.SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0);
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.Gravity.getAbsoluteGravity(0, 0) + 16, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 16, (char) (17256 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2);
            java.lang.String string = sharedPreferences.getString(((java.lang.String) objArr2[0]).intern(), null);
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 61) % 128;
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((intValue >> 22) + 16, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            java.lang.String string2 = sharedPreferences.getString(((java.lang.String) objArr3[0]).intern(), null);
            if (string == null || string2 == null) {
                int i = getHighSpeedVideoSizesFor + 93;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 != 0) {
                    return null;
                }
                throw null;
            }
            byte[] m25076 = util.h.xy.ar.b.m25076(string);
            byte[] m250762 = util.h.xy.ar.b.m25076(string2);
            int length = m25076.length;
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 73) % 128;
            int length2 = m250762.length;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, 16 - android.graphics.Color.alpha(0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17258), objArr4);
            hashMap.put(((java.lang.String) objArr4[0]).intern(), m25076);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.widget.ExpandableListView.getPackedPositionType(0L) + 16, 32 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr5);
            hashMap.put(((java.lang.String) objArr5[0]).intern(), m250762);
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 91) % 128;
            return hashMap;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void getHighSpeedVideoFpsRanges(java.util.HashMap<java.lang.String, byte[]> hashMap) {
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(16 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17257), objArr);
        byte[] bArr = hashMap.get(((java.lang.String) objArr[0]).intern());
        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(offsetBefore + 16, 31 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr2);
        byte[] bArr2 = hashMap.get(((java.lang.String) objArr2[0]).intern());
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 117) % 128;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(15 - lastIndexOf, intValue >> 22, (char) (58934 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr3);
            android.content.SharedPreferences.Editor edit = m24558.getSharedPreferences(((java.lang.String) objArr3[0]).intern(), 0).edit();
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(indexOf + 17, 16 - android.graphics.Color.argb(0, 0, 0, 0), (char) (17257 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr4);
            edit.putString(((java.lang.String) objArr4[0]).intern(), util.h.xy.ar.b.m25074(bArr));
            int indexOf2 = android.text.TextUtils.indexOf("", "", 0);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(indexOf2 + 16, 31 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
            edit.putString(((java.lang.String) objArr5[0]).intern(), util.h.xy.ar.b.m25074(bArr2));
            edit.apply();
            edit.commit();
            int i = getHighSpeedVideoSizes + 113;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i3 = Camera2StreamConfigurationMap + 109;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static boolean getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 7) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(17 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), (char) (58934 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr);
        android.content.SharedPreferences.Editor edit = m24558.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0).edit();
        edit.clear();
        edit.apply();
        boolean commit = edit.commit();
        int i = getHighSpeedVideoSizes + 121;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return commit;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputFormats = new char[]{31318, 49329, 4002, 19130, 37345, 56454, 6947, 26113, 44336, 59499, 14197, 32136, 47343, 1972, 17087, 35318, 57130, 26055, 43771, 61320, 13566, 31114, 48680, 50044, 2079, 19763, 37399, 55548, 7614, 41706, 59298, 11414, 40040, 9859, 59875, 44225, 30611, 15038, 64771, 32819, 19221, 3705, 53586, 39882, 24226, 57850, 42229, 28627};
        getHighSpeedVideoFpsRanges = -8779990644517493015L;
    }
}
