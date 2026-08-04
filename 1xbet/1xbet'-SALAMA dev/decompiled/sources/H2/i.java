package H2;

import android.webkit.SafeBrowsingResponse;
import dalvik.system.DelegateLastClassLoader;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ SafeBrowsingResponse b(Object obj) {
        return (SafeBrowsingResponse) obj;
    }

    public static /* synthetic */ DelegateLastClassLoader c(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* synthetic */ void d() {
    }
}
