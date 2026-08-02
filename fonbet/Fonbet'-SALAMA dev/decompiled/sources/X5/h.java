package X5;

import U5.S;
import U5.T;

/* loaded from: classes2.dex */
public final class h extends T {
    @Override // U5.T
    public S a(String str) {
        return new g(str);
    }

    @Override // U5.T
    public boolean b() {
        return true;
    }

    @Override // U5.T
    public int c() {
        try {
            Class.forName("android.app.Application", false, h.class.getClassLoader());
            return 8;
        } catch (Exception unused) {
            return 3;
        }
    }
}
