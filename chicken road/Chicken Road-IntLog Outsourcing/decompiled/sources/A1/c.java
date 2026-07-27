package A1;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class c extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Looper looper, int i2) {
        super(looper);
        switch (i2) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    public c(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
