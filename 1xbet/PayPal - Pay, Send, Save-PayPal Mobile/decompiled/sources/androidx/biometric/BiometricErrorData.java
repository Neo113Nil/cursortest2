package androidx.biometric;

/* loaded from: classes3.dex */
class BiometricErrorData {
    final int Camera2StreamConfigurationMap;
    final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;

    BiometricErrorData(int i, java.lang.CharSequence charSequence) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
    }

    public int hashCode() {
        int i = this.Camera2StreamConfigurationMap;
        java.lang.CharSequence charSequence = this.getHighResolutionOutputSizeshNQ4ISI;
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(i), charSequence != null ? charSequence.toString() : null});
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.biometric.BiometricErrorData)) {
            return false;
        }
        androidx.biometric.BiometricErrorData biometricErrorData = (androidx.biometric.BiometricErrorData) obj;
        if (this.Camera2StreamConfigurationMap != biometricErrorData.Camera2StreamConfigurationMap) {
            return false;
        }
        java.lang.CharSequence charSequence = biometricErrorData.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.CharSequence charSequence2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String obj2 = charSequence2 != null ? charSequence2.toString() : null;
        java.lang.String obj3 = charSequence != null ? charSequence.toString() : null;
        if (obj2 == null && obj3 == null) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }
}
