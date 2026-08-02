package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public interface ThemedSpinnerAdapter extends android.widget.SpinnerAdapter {
    android.content.res.Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(android.content.res.Resources.Theme theme);

    /* loaded from: classes5.dex */
    public static final class Helper {
        private android.view.LayoutInflater Camera2StreamConfigurationMap;
        private final android.view.LayoutInflater getHighSpeedVideoFpsRangesFor;
        private final android.content.Context getHighSpeedVideoSizes;

        public Helper(android.content.Context context) {
            this.getHighSpeedVideoSizes = context;
            this.getHighSpeedVideoFpsRangesFor = android.view.LayoutInflater.from(context);
        }

        public final void setDropDownViewTheme(android.content.res.Resources.Theme theme) {
            if (theme == null) {
                this.Camera2StreamConfigurationMap = null;
            } else if (theme.equals(this.getHighSpeedVideoSizes.getTheme())) {
                this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
            } else {
                this.Camera2StreamConfigurationMap = android.view.LayoutInflater.from(new androidx.appcompat.view.ContextThemeWrapper(this.getHighSpeedVideoSizes, theme));
            }
        }

        public final android.content.res.Resources.Theme getDropDownViewTheme() {
            android.view.LayoutInflater layoutInflater = this.Camera2StreamConfigurationMap;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public final android.view.LayoutInflater getDropDownViewInflater() {
            android.view.LayoutInflater layoutInflater = this.Camera2StreamConfigurationMap;
            return layoutInflater != null ? layoutInflater : this.getHighSpeedVideoFpsRangesFor;
        }
    }
}
