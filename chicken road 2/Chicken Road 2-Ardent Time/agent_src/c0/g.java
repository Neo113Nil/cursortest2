package c0;

/* loaded from: classes.dex */
public abstract class g {
    public static android.os.IBinder a(android.app.Activity activity) {
        android.view.Window window;
        android.view.WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static androidx.window.sidecar.SidecarInterface b(android.content.Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        return androidx.window.sidecar.SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static W.i c() {
        try {
            java.lang.String apiVersion = androidx.window.sidecar.SidecarProvider.getApiVersion();
            if (android.text.TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            W.i iVar = W.i.f1821f;
            return W.g.c(apiVersion);
        } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }
}
