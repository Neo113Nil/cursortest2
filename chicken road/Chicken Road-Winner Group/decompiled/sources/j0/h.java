package j0;

import a.AbstractC0086a;
import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import d0.C0268h;

/* loaded from: classes.dex */
public abstract class h {
    public static SidecarInterface a(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static C0268h b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            C0268h c0268h = C0268h.f;
            return AbstractC0086a.I(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
