package I3;

import J3.i;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class D {
    public static i.a a(y yVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = yVar.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (yVar.b(i12, elapsedRealtime)) {
                i11++;
            }
        }
        return new i.a(length, i11);
    }
}
