package util.h.xy.br;

/* loaded from: classes5.dex */
public class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char[] getHighSpeedVideoFpsRanges = null;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static final java.lang.String getInputFormats;
    private static boolean getInputSizeshNQ4ISI = false;
    private static int getOutputFormats = 1;
    private static final byte[] getOutputMinFrameDuration;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String f1031;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getInputFormats = util.h.xy.br.ma.class.getName();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), " \u0099\u009e\u009a\u009a\u0098\u008e\u0098\u009f\u0099\u0098\u009e\u009d\u0098\u009c\u009b\u0082\u009a\u0099\u0098\u0097\u0096\u0095\u0081", objArr);
        f1031 = ((java.lang.String) objArr[0]).intern();
        getOutputMinFrameDuration = new byte[]{-18, 86, -76, 56, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 73, com.google.common.base.Ascii.RS, -118};
        int i = Camera2StreamConfigurationMap + 67;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25607(android.content.Context context, byte[] bArr) {
        Camera2StreamConfigurationMap = (getOutputFormats + 109) % 128;
        util.h.xy.al.rb.m25016(bArr);
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(f1031, 0).edit();
        edit.putString(util.h.xy.al.rb.m25016(getOutputMinFrameDuration), util.h.xy.al.rb.m25016(bArr));
        edit.commit();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0083\u0082\u0081", objArr);
        util.h.xy.am.ma.m25031(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rb.m25016(bArr));
        m25606(context);
        getOutputFormats = (Camera2StreamConfigurationMap + 23) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience m25606(android.content.Context context) {
        byte[] m25017;
        int i = Camera2StreamConfigurationMap + 17;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            m25017 = util.h.xy.al.rb.m25017(context.getSharedPreferences(f1031, 0).getString(util.h.xy.al.rb.m25016(getOutputMinFrameDuration), ""));
            if (m25017 == null) {
                return null;
            }
        } else {
            m25017 = util.h.xy.al.rb.m25017(context.getSharedPreferences(f1031, 0).getString(util.h.xy.al.rb.m25016(getOutputMinFrameDuration), ""));
            if (m25017 == null) {
                return null;
            }
        }
        java.lang.String str = new java.lang.String(m25017);
        int hashCode = str.hashCode();
        if (hashCode == 612864574) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008e\u008d\u0088\u008c\u008a\u0088\u0086\u0081\u0088\u0087\u0086\u0084\u008c\u0087", objArr);
            if (str.equals(((java.lang.String) objArr[0]).intern())) {
                return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.TWO_TAP_ALWAYS;
            }
        } else if (hashCode == 1057236460) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.view.View.getDefaultSize(0, 0), "\u008b\u0082\u008a\u0089\u0088\u0085\u0082\u0086\u0081\u0088\u0087\u0086\u0082\u0085\u0084", objArr2);
            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                Camera2StreamConfigurationMap = (getOutputFormats + 73) % 128;
                com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience paymentExperience = com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_ENABLED;
                getOutputFormats = (Camera2StreamConfigurationMap + 5) % 128;
                return paymentExperience;
            }
        }
        return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_REQUIRES_SDK_INITIALIZED;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience m25604(android.content.Context context, boolean z) {
        byte[] m25017 = util.h.xy.al.rb.m25017(context.getSharedPreferences(f1031, 0).getString(util.h.xy.al.rb.m25016(getOutputMinFrameDuration), ""));
        if (m25017 == null) {
            return null;
        }
        java.lang.String str = new java.lang.String(m25017);
        int hashCode = str.hashCode();
        if (hashCode == -8923117) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 128, "\u008b\u0082\u0094\u0092\u008a\u0088\u0092\u0087\u0092\u0085\u0092\u0086\u0093\u008b\u008e\u0086\u008e\u0082\u008f\u0092\u0091\u0090\u0082\u008f\u0086\u0081\u0088\u0087\u0086\u0082\u0085\u0084", objArr);
                if (str.equals(((java.lang.String) objArr[0]).intern())) {
                    int i = getOutputFormats + 65;
                    Camera2StreamConfigurationMap = i % 128;
                    if (i % 2 == 0) {
                        return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_REQUIRES_SDK_INITIALIZED;
                    }
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else if (hashCode == 612864574) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.KeyEvent.normalizeMetaState(0) + 127, "\u008e\u008d\u0088\u008c\u008a\u0088\u0086\u0081\u0088\u0087\u0086\u0084\u008c\u0087", objArr2);
            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.TWO_TAP_ALWAYS;
            }
        } else if (hashCode == 1057236460) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u008b\u0082\u008a\u0089\u0088\u0085\u0082\u0086\u0081\u0088\u0087\u0086\u0082\u0085\u0084", objArr3);
            if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                Camera2StreamConfigurationMap = (getOutputFormats + 41) % 128;
                return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_ENABLED;
            }
        }
        if (!z) {
            return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_REQUIRES_SDK_INITIALIZED;
        }
        getOutputFormats = (Camera2StreamConfigurationMap + 21) % 128;
        return com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.TWO_TAP_ALWAYS;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25605(android.content.Context context) {
        java.lang.String str;
        int i;
        int i2 = getOutputFormats + 21;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            str = f1031;
            i = 1;
        } else {
            str = f1031;
            i = 0;
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, i).edit();
        edit.clear();
        edit.apply();
        int i3 = Camera2StreamConfigurationMap + 39;
        getOutputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoFpsRanges;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (!getHighSpeedVideoFpsRangesFor) {
            if (!getInputSizeshNQ4ISI) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRanges = new char[]{64364, 64379, 64358, 64365, 64354, 64349, 64360, 64383, 64382, 64352, 64376, 64341, 64343, 64361, 64366, 64367, 64363, 64359, 64353, 64342, 64351, 64311, 64323, 64347, 64322, 64328, 64308, 64332, 64334, 64327, 64345, 64325};
        getHighSpeedVideoSizesFor = -1074857028;
        getInputSizeshNQ4ISI = true;
        getHighSpeedVideoFpsRangesFor = true;
    }
}
