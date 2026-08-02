package com.payair.hce;

/* loaded from: classes4.dex */
public final class getCvmResetTimeout extends com.payair.hce.getCiacDecline {
    public final java.lang.Object DigitizedCardProfile;

    public getCvmResetTimeout(java.lang.Boolean bool) {
        this.DigitizedCardProfile = bool;
    }

    public getCvmResetTimeout(java.lang.Number number) {
        this.DigitizedCardProfile = number;
    }

    public getCvmResetTimeout(java.lang.String str) {
        this.DigitizedCardProfile = str;
    }

    @Override // com.payair.hce.getCiacDecline
    public final java.lang.Number AlternateContactlessPaymentDataJson() {
        java.lang.Object obj = this.DigitizedCardProfile;
        return obj instanceof java.lang.String ? new com.payair.hce.getPinIvCvc3Track2((java.lang.String) obj) : (java.lang.Number) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.DigitizedCardProfile == null) {
            return 31;
        }
        if (AlternateContactlessPaymentDataJson(this)) {
            doubleToLongBits = AlternateContactlessPaymentDataJson().longValue();
        } else {
            java.lang.Object obj = this.DigitizedCardProfile;
            if (obj instanceof java.lang.Number) {
                doubleToLongBits = java.lang.Double.doubleToLongBits(AlternateContactlessPaymentDataJson().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.payair.hce.getCvmResetTimeout getcvmresettimeout = (com.payair.hce.getCvmResetTimeout) obj;
        if (this.DigitizedCardProfile == null) {
            return getcvmresettimeout.DigitizedCardProfile == null;
        }
        if (AlternateContactlessPaymentDataJson(this) && AlternateContactlessPaymentDataJson(getcvmresettimeout)) {
            return AlternateContactlessPaymentDataJson().longValue() == getcvmresettimeout.AlternateContactlessPaymentDataJson().longValue();
        }
        java.lang.Object obj2 = this.DigitizedCardProfile;
        if ((obj2 instanceof java.lang.Number) && (getcvmresettimeout.DigitizedCardProfile instanceof java.lang.Number)) {
            double doubleValue = AlternateContactlessPaymentDataJson().doubleValue();
            double doubleValue2 = getcvmresettimeout.AlternateContactlessPaymentDataJson().doubleValue();
            return doubleValue == doubleValue2 || (java.lang.Double.isNaN(doubleValue) && java.lang.Double.isNaN(doubleValue2));
        }
        return obj2.equals(getcvmresettimeout.DigitizedCardProfile);
    }

    private static boolean AlternateContactlessPaymentDataJson(com.payair.hce.getCvmResetTimeout getcvmresettimeout) {
        java.lang.Object obj = getcvmresettimeout.DigitizedCardProfile;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }

    @Override // com.payair.hce.getCiacDecline
    public final java.lang.String DigitizedCardProfile() {
        java.lang.Object obj = this.DigitizedCardProfile;
        if (obj instanceof java.lang.Number) {
            return AlternateContactlessPaymentDataJson().toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) obj).toString();
        }
        return (java.lang.String) obj;
    }
}
