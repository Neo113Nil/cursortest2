package androidx.media3.common.text;

/* loaded from: classes7.dex */
public final class RubySpan implements androidx.media3.common.text.LanguageFeatureSpan {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    public final int position;
    public final java.lang.String rubyText;

    public RubySpan(java.lang.String str, int i) {
        this.rubyText = str;
        this.position = i;
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(getHighSpeedVideoFpsRangesFor, this.rubyText);
        bundle.putInt(getHighSpeedVideoSizes, this.position);
        return bundle;
    }

    public static androidx.media3.common.text.RubySpan fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.text.RubySpan((java.lang.String) com.google.common.base.Preconditions.checkNotNull(bundle.getString(getHighSpeedVideoFpsRangesFor)), bundle.getInt(getHighSpeedVideoSizes));
    }
}
