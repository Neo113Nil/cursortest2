package androidx.media3.common;

/* loaded from: classes7.dex */
public class Label {
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    public final java.lang.String language;
    public final java.lang.String value;

    public Label(java.lang.String str, java.lang.String str2) {
        this.language = androidx.media3.common.util.Util.normalizeLanguageCode(str);
        this.value = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.Label label = (androidx.media3.common.Label) obj;
        return java.util.Objects.equals(this.language, label.language) && java.util.Objects.equals(this.value, label.value);
    }

    public int hashCode() {
        int hashCode = this.value.hashCode();
        java.lang.String str = this.language;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.language;
        if (str != null) {
            bundle.putString(getHighSpeedVideoFpsRanges, str);
        }
        bundle.putString(getHighSpeedVideoSizes, this.value);
        return bundle;
    }

    public static androidx.media3.common.Label fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.Label(bundle.getString(getHighSpeedVideoFpsRanges), (java.lang.String) com.google.common.base.Preconditions.checkNotNull(bundle.getString(getHighSpeedVideoSizes)));
    }
}
