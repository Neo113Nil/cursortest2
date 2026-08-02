package p000;

import android.app.PictureInPictureUiState;
import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qr0 {
    /* JADX INFO: renamed from: a */
    public static u90 m4134a(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 9;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new u90(i2);
        }
        if (i < 31) {
            return new u90(i2);
        }
        pictureInPictureUiState.isStashed();
        return new u90(i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m4135b(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
