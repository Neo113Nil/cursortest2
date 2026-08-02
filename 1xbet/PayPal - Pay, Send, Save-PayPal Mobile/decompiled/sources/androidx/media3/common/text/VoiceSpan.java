package androidx.media3.common.text;

/* loaded from: classes7.dex */
public final class VoiceSpan {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(0);

    /* renamed from: name, reason: collision with root package name */
    public final java.lang.String f2745name;

    public VoiceSpan(java.lang.String str) {
        this.f2745name = str;
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(getHighSpeedVideoFpsRangesFor, this.f2745name);
        return bundle;
    }

    public static androidx.media3.common.text.VoiceSpan fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.text.VoiceSpan((java.lang.String) com.google.common.base.Preconditions.checkNotNull(bundle.getString(getHighSpeedVideoFpsRangesFor)));
    }
}
