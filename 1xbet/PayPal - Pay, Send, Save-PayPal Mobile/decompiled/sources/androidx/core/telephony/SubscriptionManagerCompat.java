package androidx.core.telephony;

/* loaded from: classes7.dex */
public class SubscriptionManagerCompat {
    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;

    public static int getSlotIndex(int i) {
        if (i == -1) {
            return -1;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.telephony.SubscriptionManagerCompat.Api29Impl.getHighSpeedVideoSizes(i);
        }
        try {
            if (getHighSpeedVideoFpsRanges == null) {
                java.lang.reflect.Method declaredMethod = android.telephony.SubscriptionManager.class.getDeclaredMethod("getSlotIndex", java.lang.Integer.TYPE);
                getHighSpeedVideoFpsRanges = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            java.lang.Integer num = (java.lang.Integer) getHighSpeedVideoFpsRanges.invoke(null, java.lang.Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        return -1;
    }

    private SubscriptionManagerCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static int getHighSpeedVideoSizes(int i) {
            return android.telephony.SubscriptionManager.getSlotIndex(i);
        }
    }
}
