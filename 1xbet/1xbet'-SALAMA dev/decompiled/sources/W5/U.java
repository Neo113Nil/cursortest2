package W5;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends U5.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7060a;

    static {
        boolean z4 = false;
        try {
            Class.forName("android.app.Application", false, U.class.getClassLoader());
            z4 = true;
        } catch (Exception unused) {
        }
        f7060a = z4;
    }

    @Override // U5.g0
    public Collection a() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // U5.g0
    public boolean b() {
        return true;
    }

    @Override // U5.g0
    public int c() {
        return 5;
    }
}
