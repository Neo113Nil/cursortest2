package androidx.compose.ui.platform.coreshims;

/* loaded from: classes6.dex */
public class ViewStructureCompat {
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    public static androidx.compose.ui.platform.coreshims.ViewStructureCompat toViewStructureCompat(android.view.ViewStructure viewStructure) {
        return new androidx.compose.ui.platform.coreshims.ViewStructureCompat(viewStructure);
    }

    public android.view.ViewStructure toViewStructure() {
        return (android.view.ViewStructure) this.getHighSpeedVideoFpsRanges;
    }

    private ViewStructureCompat(android.view.ViewStructure viewStructure) {
        this.getHighSpeedVideoFpsRanges = viewStructure;
    }

    public void setId(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.getHighSpeedVideoFpsRangesFor((android.view.ViewStructure) this.getHighSpeedVideoFpsRanges, i, str, str2, str3);
    }

    public void setText(java.lang.CharSequence charSequence) {
        androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.getHighSpeedVideoFpsRangesFor((android.view.ViewStructure) this.getHighSpeedVideoFpsRanges, charSequence);
    }

    public void setClassName(java.lang.String str) {
        androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.Camera2StreamConfigurationMap((android.view.ViewStructure) this.getHighSpeedVideoFpsRanges, str);
    }

    public void setTextStyle(float f, int i, int i2, int i3) {
        androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.getHighSpeedVideoFpsRanges((android.view.ViewStructure) this.getHighSpeedVideoFpsRanges, f, i, i2, i3);
    }

    public void setContentDescription(java.lang.CharSequence charSequence) {
        androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.getHighSpeedVideoSizes((android.view.ViewStructure) this.getHighSpeedVideoFpsRanges, charSequence);
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.getHighSpeedVideoSizes((android.view.ViewStructure) this.getHighSpeedVideoFpsRanges, i, i2, i3, i4, i5, i6);
    }

    public android.os.Bundle getExtras() {
        return androidx.compose.ui.platform.coreshims.ViewStructureCompat.Api23Impl.getHighResolutionOutputSizeshNQ4ISI((android.view.ViewStructure) this.getHighSpeedVideoFpsRanges);
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.ViewStructure viewStructure, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            viewStructure.setId(i, str, str2, str3);
        }

        static void getHighSpeedVideoSizes(android.view.ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.ViewStructure viewStructure, java.lang.CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void Camera2StreamConfigurationMap(android.view.ViewStructure viewStructure, java.lang.String str) {
            viewStructure.setClassName(str);
        }

        static void getHighSpeedVideoSizes(android.view.ViewStructure viewStructure, java.lang.CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void getHighSpeedVideoFpsRanges(android.view.ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }

        static android.os.Bundle getHighResolutionOutputSizeshNQ4ISI(android.view.ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }
}
