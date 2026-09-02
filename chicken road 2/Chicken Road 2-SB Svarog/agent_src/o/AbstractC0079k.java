package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0079k {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
