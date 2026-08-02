package com.payair.hce;

/* loaded from: classes4.dex */
final class getAckAlwaysRequiredIfCurrencyNotProvided extends com.payair.hce.getPinAutomaticallyResetByApplication {
    private static java.lang.Class AlternateContactlessPaymentDataJson;
    private final java.lang.Object writeReplace = writeReplace();
    private final java.lang.reflect.Field DigitizedCardProfile = DigitizedCardProfile();

    getAckAlwaysRequiredIfCurrencyNotProvided() {
    }

    @Override // com.payair.hce.getPinAutomaticallyResetByApplication
    public final void writeReplace(java.lang.reflect.AccessibleObject accessibleObject) {
        if (AlternateContactlessPaymentDataJson(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (java.lang.SecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Gson couldn't modify fields for ");
            sb.append(accessibleObject);
            sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
            throw new com.payair.hce.getPaymentFci(sb.toString(), e);
        }
    }

    private boolean AlternateContactlessPaymentDataJson(java.lang.reflect.AccessibleObject accessibleObject) {
        if (this.writeReplace != null && this.DigitizedCardProfile != null) {
            try {
                AlternateContactlessPaymentDataJson.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE).invoke(this.writeReplace, accessibleObject, java.lang.Long.valueOf(((java.lang.Long) AlternateContactlessPaymentDataJson.getMethod("objectFieldOffset", java.lang.reflect.Field.class).invoke(this.writeReplace, this.DigitizedCardProfile)).longValue()), java.lang.Boolean.TRUE);
                return true;
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    private static java.lang.Object writeReplace() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
            AlternateContactlessPaymentDataJson = cls;
            java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.reflect.Field DigitizedCardProfile() {
        try {
            return java.lang.reflect.AccessibleObject.class.getDeclaredField("override");
        } catch (java.lang.NoSuchFieldException unused) {
            return null;
        }
    }
}
