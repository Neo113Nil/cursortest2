package O5;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f19967a = new HashSet();

    public final void a(String str, Throwable th2) {
        HashSet hashSet = f19967a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        hashSet.add(str);
    }
}
