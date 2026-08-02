package androidx.media3.common.text;

/* loaded from: classes7.dex */
public final class TextEmphasisSpan implements androidx.media3.common.text.LanguageFeatureSpan {
    public static final int MARK_FILL_FILLED = 1;
    public static final int MARK_FILL_OPEN = 2;
    public static final int MARK_FILL_UNKNOWN = 0;
    public static final int MARK_SHAPE_CIRCLE = 1;
    public static final int MARK_SHAPE_DOT = 2;
    public static final int MARK_SHAPE_NONE = 0;
    public static final int MARK_SHAPE_SESAME = 3;
    public int markFill;
    public int markShape;
    public final int position;
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MarkFill {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MarkShape {
    }

    public TextEmphasisSpan(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(getHighSpeedVideoSizes, this.markShape);
        bundle.putInt(Camera2StreamConfigurationMap, this.markFill);
        bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, this.position);
        return bundle;
    }

    public static androidx.media3.common.text.TextEmphasisSpan fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.text.TextEmphasisSpan(bundle.getInt(getHighSpeedVideoSizes), bundle.getInt(Camera2StreamConfigurationMap), bundle.getInt(getHighResolutionOutputSizeshNQ4ISI));
    }
}
