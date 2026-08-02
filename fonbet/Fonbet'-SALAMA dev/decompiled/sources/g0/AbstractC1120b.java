package g0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1120b {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
