package p0;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* loaded from: classes.dex */
public abstract class h {
    public static IBinder a(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static SidecarInterface b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static j0.i c() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            j0.i iVar = j0.i.f10457f;
            return j0.g.c(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
