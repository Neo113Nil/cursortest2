package F;

import T7.E;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;

/* loaded from: classes8.dex */
public final class a {
    @NonNull
    public static InterfaceC5086c0 a(@NonNull EncoderProfiles encoderProfiles) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i11 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException(E.a(i11, "Unable to call from(EncoderProfiles) on API ", ". Version 31 or higher required."));
    }
}
