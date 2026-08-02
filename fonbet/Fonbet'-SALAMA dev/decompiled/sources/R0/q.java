package R0;

import S0.B;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public abstract class q {
    public static B a(WebSettings webSettings) {
        try {
            return new B((WebSettingsBoundaryInterface) P6.b.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) S0.x.f6311a.f6229b).convertSettings(webSettings)), 5);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e7;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e7);
            return new S0.t(null, 5);
        }
    }
}
