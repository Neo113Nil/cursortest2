package androidx.core.telephony;

/* loaded from: classes7.dex */
public class TelephonyManagerCompat {
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    public static java.lang.String getImei(android.telephony.TelephonyManager telephonyManager) {
        return androidx.core.telephony.TelephonyManagerCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(telephonyManager);
    }

    public static int getSubscriptionId(android.telephony.TelephonyManager telephonyManager) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.telephony.TelephonyManagerCompat.Api30Impl.Camera2StreamConfigurationMap(telephonyManager);
        }
        try {
            if (getHighSpeedVideoSizes == null) {
                java.lang.reflect.Method declaredMethod = android.telephony.TelephonyManager.class.getDeclaredMethod("getSubId", new java.lang.Class[0]);
                getHighSpeedVideoSizes = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            java.lang.Integer num = (java.lang.Integer) getHighSpeedVideoSizes.invoke(telephonyManager, new java.lang.Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }

    private TelephonyManagerCompat() {
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static int Camera2StreamConfigurationMap(android.telephony.TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.telephony.TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }
}
