package util.h.xy.aa;

/* loaded from: classes5.dex */
public class rb {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes = 24;

    static {
        int i = 24 % 2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport m24533(android.content.Context context) {
        com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport deviceKeyguardSupport;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 117) + ((i & 117) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = ((i | 33) << 1) - (i ^ 33);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0 && android.os.Build.VERSION.SDK_INT < 85) {
            deviceKeyguardSupport = com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.ANDROID_VERSION_NOT_SUPPORTED;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 49) % 128;
        } else {
            int i4 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRanges = ((i4 & 21) + (i4 | 21)) % 128;
            boolean isKeyguardSecure = ((android.app.KeyguardManager) context.getSystemService(util.h.xy.al.ra.f365)).isKeyguardSecure();
            int i5 = getHighSpeedVideoFpsRanges + 111;
            int i6 = i5 % 128;
            getHighSpeedVideoSizes = i6;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (isKeyguardSecure) {
                deviceKeyguardSupport = com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.SUPPORTED;
                int i7 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = ((i7 ^ 103) + ((i7 & 103) << 1)) % 128;
            } else {
                getHighSpeedVideoFpsRanges = (((i6 | 21) << 1) - (i6 ^ 21)) % 128;
                deviceKeyguardSupport = com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.SECURE_LOCK_NOT_PRESENTED;
            }
        }
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i8 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i8 | 43) << 1) - (i8 ^ 43)) % 128;
        return deviceKeyguardSupport;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24534(android.content.Context context) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 105) % 128;
        com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport highResolutionOutputSizeshNQ4ISI = util.h.xy.aa.mb.getHighResolutionOutputSizeshNQ4ISI(context);
        int i = getHighSpeedVideoSizes + 69;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24535(android.content.Context context) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 15) + ((i & 15) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return util.h.xy.aa.mb.getHighSpeedVideoSizes(context);
        }
        util.h.xy.aa.mb.getHighSpeedVideoSizes(context);
        throw null;
    }
}
