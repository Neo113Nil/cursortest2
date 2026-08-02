package p000;

import android.app.Notification;
import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;

/* JADX INFO: renamed from: au */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0038au {
    /* JADX INFO: renamed from: a */
    public static v31 m482a(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C0270h1.m2190f(j11.m2773h("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new v31(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX INFO: renamed from: b */
    public static void m483b(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
