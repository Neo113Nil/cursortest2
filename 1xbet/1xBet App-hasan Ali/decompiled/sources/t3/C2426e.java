package t3;

import dalvik.system.PathClassLoader;

/* renamed from: t3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2426e extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z3) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z3);
    }
}
