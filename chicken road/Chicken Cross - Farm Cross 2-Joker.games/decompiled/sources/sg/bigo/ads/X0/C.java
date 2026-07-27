package sg.bigo.ads.X0;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class C {
    public static final C c = new C();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12597a = new ConcurrentHashMap();
    public boolean b = false;

    public final B a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        B b = (B) this.f12597a.get(str);
        if (b != null) {
            return b;
        }
        B b2 = new B(this);
        this.f12597a.put(str, b2);
        return b2;
    }
}
