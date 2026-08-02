package com.gemalto.mfs.mwsdk.dcm.cdcvm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class DeviceCVMManager {
    private static int Camera2StreamConfigurationMap = 1;
    public static final com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager INSTANCE;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager[] getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static int getOutputFormats;

    private DeviceCVMManager(java.lang.String str) {
    }

    public static com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager deviceCVMManager = (com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager.class, str);
        int i = getHighResolutionOutputSizeshNQ4ISI + 65;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return deviceCVMManager;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager[] values() {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
        com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager[] deviceCVMManagerArr = (com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager[]) getInputFormats.clone();
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return deviceCVMManagerArr;
        }
        throw null;
    }

    static {
        com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager[] deviceCVMManagerArr;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("㱿캔\uf517陖瑦\uf58f窳⸝", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, "쎥倃漯꓅", "\u0000\u0000\u0000\u0000", objArr);
        com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager deviceCVMManager = new com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager(((java.lang.String) objArr[0]).intern());
        INSTANCE = deviceCVMManager;
        int i = getHighSpeedVideoFpsRanges + 111;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            deviceCVMManagerArr = new com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager[1];
            deviceCVMManagerArr[1] = deviceCVMManager;
        } else {
            deviceCVMManagerArr = new com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager[]{deviceCVMManager};
        }
        getInputFormats = deviceCVMManagerArr;
        getHighSpeedVideoSizesFor = com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager.class.toString();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 87) % 128;
    }

    public final void initialize(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) throws com.gemalto.mfs.mwsdk.exception.DeviceCVMException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 75) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("洰牼冨✱", (char) (android.view.KeyEvent.keyCodeFromString("") + 17568), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\ue4d0⑥ꂃ\ude44", "\u0000\u0000\u0000\u0000", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("輎㷉냿⹉쎪䓌ᑏ", (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2042642245, "䐆쀿띹꺈", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.j.ra.f2242.m26905(cHVerificationMethod);
        int i = getHighResolutionOutputSizeshNQ4ISI + 1;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final void setPreEntryActivation(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 51) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("洰牼冨✱", (char) (17568 - android.text.TextUtils.getCapsMode("", 0, 0)), android.view.ViewConfiguration.getTapTimeout() >> 16, "\ue4d0⑥ꂃ\ude44", "\u0000\u0000\u0000\u0000", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\udeecꚑ쌲鲑ࣲ矌䷍ⷃʅ榉", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\ue4a5귓洶鱅", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.j.ra.f2242.m26906(bArr);
        int i = getHighResolutionOutputSizeshNQ4ISI + 15;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int getExistingKeyValidityPeriod(android.content.Context context) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
        int m27482 = util.h.xy.u.a.f2431.m27482(context);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        return m27482;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 51) % 128;
        char[] charArray = str3.toCharArray();
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 119) % 128;
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)) ^ ((int) (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getInputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRangesFor = 2457411417541981002L;
        getOutputFormats = 136094734;
        getInputSizeshNQ4ISI = (char) 13130;
    }
}
