package sg.bigo.ads.s0;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class x {
    public static boolean a(String str) {
        boolean containsKey;
        C5460B c5460b = AbstractC5459A.f13283a;
        synchronized (c5460b.f) {
            containsKey = c5460b.f13292a.containsKey(str);
            if (!containsKey) {
                Iterator it = c5460b.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (TextUtils.equals(((C5470j) it.next()).f13291a, str)) {
                        containsKey = true;
                        break;
                    }
                }
            }
        }
        return containsKey;
    }

    public static void a(Context context, String str, boolean z, z zVar) {
        a(context, null, str, z, zVar);
    }

    public static void a(Context context, Executor executor, String str, boolean z, z zVar) {
        AbstractC5459A.f13283a.a(context, executor, str, z, zVar);
    }
}
