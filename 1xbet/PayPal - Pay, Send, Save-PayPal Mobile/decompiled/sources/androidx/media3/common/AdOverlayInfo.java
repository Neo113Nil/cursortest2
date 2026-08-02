package androidx.media3.common;

/* loaded from: classes7.dex */
public final class AdOverlayInfo {
    public static final int PURPOSE_CLOSE_AD = 2;
    public static final int PURPOSE_CONTROLS = 1;
    public static final int PURPOSE_NOT_VISIBLE = 4;
    public static final int PURPOSE_OTHER = 3;
    public final int purpose;
    public final java.lang.String reasonDetail;
    public final android.view.View view;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Purpose {
    }

    public static final class Builder {
        private final int Camera2StreamConfigurationMap;
        private final android.view.View getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;

        public Builder(android.view.View view, int i) {
            this.getHighSpeedVideoFpsRangesFor = view;
            this.Camera2StreamConfigurationMap = i;
        }

        public final androidx.media3.common.AdOverlayInfo.Builder setDetailedReason(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public final androidx.media3.common.AdOverlayInfo build() {
            return new androidx.media3.common.AdOverlayInfo(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }

    @java.lang.Deprecated
    public AdOverlayInfo(android.view.View view, int i) {
        this(view, i, null);
    }

    @java.lang.Deprecated
    public AdOverlayInfo(android.view.View view, int i, java.lang.String str) {
        this.view = view;
        this.purpose = i;
        this.reasonDetail = str;
    }
}
