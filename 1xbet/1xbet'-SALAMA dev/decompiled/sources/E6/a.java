package E6;

import D6.t0;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public t0 a(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(f.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int b() {
        return 1073741823;
    }

    public String c() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
