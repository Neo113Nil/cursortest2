package y;

/* loaded from: classes.dex */
public abstract class P {
    public static int a(int i2) {
        int statusBars;
        int i3 = 0;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0) {
                if (i4 == 1) {
                    statusBars = android.view.WindowInsets.Type.statusBars();
                } else if (i4 == 2) {
                    statusBars = android.view.WindowInsets.Type.navigationBars();
                } else if (i4 == 4) {
                    statusBars = android.view.WindowInsets.Type.captionBar();
                } else if (i4 == 8) {
                    statusBars = android.view.WindowInsets.Type.ime();
                } else if (i4 == 16) {
                    statusBars = android.view.WindowInsets.Type.systemGestures();
                } else if (i4 == 32) {
                    statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                } else if (i4 == 64) {
                    statusBars = android.view.WindowInsets.Type.tappableElement();
                } else if (i4 == 128) {
                    statusBars = android.view.WindowInsets.Type.displayCutout();
                }
                i3 |= statusBars;
            }
        }
        return i3;
    }
}
