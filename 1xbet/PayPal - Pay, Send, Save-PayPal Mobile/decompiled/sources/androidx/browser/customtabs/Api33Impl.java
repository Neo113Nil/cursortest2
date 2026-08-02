package androidx.browser.customtabs;

/* loaded from: classes5.dex */
class Api33Impl {
    private Api33Impl() {
    }

    static <T> T getHighSpeedVideoFpsRanges(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
