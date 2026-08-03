package androidx.browser.customtabs;

/* loaded from: classes.dex */
class Api33Impl {
    private Api33Impl() {
    }

    static <T> T getParcelable(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
