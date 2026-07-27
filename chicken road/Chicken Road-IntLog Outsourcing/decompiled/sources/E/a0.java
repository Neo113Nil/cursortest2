package E;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class a0 {
    public static int a(int i2) {
        int statusBars;
        int i3 = 0;
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i2 & i6) != 0) {
                if (i6 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i6 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i6 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i6 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i6 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i6 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i6 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i6 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i3 |= statusBars;
            }
        }
        return i3;
    }
}
