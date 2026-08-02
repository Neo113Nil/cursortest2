package androidx.compose.ui.graphics;

import android.app.NotificationChannel;

/* loaded from: classes.dex */
public final /* synthetic */ class u {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("ScreenCaptureServiceChannel", "Screen Capture Service Channel", 3);
    }

    public static /* synthetic */ NotificationChannel c(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }
}
