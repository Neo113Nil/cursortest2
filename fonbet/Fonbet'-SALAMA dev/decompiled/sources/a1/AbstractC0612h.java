package a1;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* renamed from: a1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0612h {
    public static IBinder a(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static SidecarInterface b(Context context) {
        t6.h.e(context, "context");
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static U0.j c() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            U0.j jVar = U0.j.f6393f;
            return U0.g.c(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
