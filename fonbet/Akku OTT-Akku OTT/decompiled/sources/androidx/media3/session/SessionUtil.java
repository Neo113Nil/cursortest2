package androidx.media3.session;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
class SessionUtil {
    private SessionUtil() {
    }

    public static void disconnectIMediaController(@Nullable IMediaController iMediaController) {
        if (iMediaController != null) {
            try {
                iMediaController.onDisconnected(0);
            } catch (RemoteException unused) {
            }
        }
    }
}
