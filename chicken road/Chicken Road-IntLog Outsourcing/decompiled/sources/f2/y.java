package f2;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f5653b;

    /* renamed from: a, reason: collision with root package name */
    public B.d f5654a;

    public final synchronized x a() {
        String str;
        x xVar;
        B.d dVar = this.f5654a;
        synchronized (((ArrayDeque) dVar.f109e)) {
            str = (String) ((ArrayDeque) dVar.f109e).peek();
        }
        Pattern pattern = x.f5649d;
        xVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                xVar = new x(split[0], split[1]);
            }
        }
        return xVar;
    }
}
