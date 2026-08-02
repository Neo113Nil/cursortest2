package G;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Q0;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class p {
    public static boolean a(Q0 q02, @NonNull int... iArr) {
        if (q02 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return Collections.EMPTY_SET.containsAll(arrayList);
    }
}
