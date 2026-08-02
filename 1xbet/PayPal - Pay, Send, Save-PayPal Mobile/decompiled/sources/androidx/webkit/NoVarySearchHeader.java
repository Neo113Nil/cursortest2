package androidx.webkit;

/* loaded from: classes7.dex */
public class NoVarySearchHeader {
    public final java.util.List<java.lang.String> consideredQueryParameters;
    public final boolean ignoreDifferencesInParameters;
    public final java.util.List<java.lang.String> ignoredQueryParameters;
    public final boolean varyOnKeyOrder;

    private NoVarySearchHeader(boolean z, boolean z2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        this.varyOnKeyOrder = z;
        this.ignoreDifferencesInParameters = z2;
        this.ignoredQueryParameters = list;
        this.consideredQueryParameters = list2;
    }

    public static androidx.webkit.NoVarySearchHeader neverVaryHeader() {
        return new androidx.webkit.NoVarySearchHeader(false, true, new java.util.ArrayList(), new java.util.ArrayList());
    }

    public static androidx.webkit.NoVarySearchHeader alwaysVaryHeader() {
        return new androidx.webkit.NoVarySearchHeader(true, false, new java.util.ArrayList(), new java.util.ArrayList());
    }

    public static androidx.webkit.NoVarySearchHeader neverVaryExcept(boolean z, java.util.List<java.lang.String> list) {
        return new androidx.webkit.NoVarySearchHeader(z, true, new java.util.ArrayList(), list);
    }

    public static androidx.webkit.NoVarySearchHeader varyExcept(boolean z, java.util.List<java.lang.String> list) {
        return new androidx.webkit.NoVarySearchHeader(z, false, list, new java.util.ArrayList());
    }
}
