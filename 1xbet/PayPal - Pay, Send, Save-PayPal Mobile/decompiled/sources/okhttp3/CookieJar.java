package okhttp3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lokhttp3/CookieJar;", "", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "cookies", "", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CookieJar {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.CookieJar.Companion INSTANCE = okhttp3.CookieJar.Companion.$$INSTANCE;
    public static final okhttp3.CookieJar NO_COOKIES = new okhttp3.CookieJar.Companion.NoCookies();

    java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl url);

    void saveFromResponse(okhttp3.HttpUrl url, java.util.List<okhttp3.Cookie> cookies);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lokhttp3/CookieJar$Companion;", "", "<init>", "()V", "Lokhttp3/CookieJar;", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ okhttp3.CookieJar.Companion $$INSTANCE = new okhttp3.CookieJar.Companion();

        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "<init>", "()V", "Lokhttp3/HttpUrl;", "p0", "", "Lokhttp3/Cookie;", "p1", "", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
        static final class NoCookies implements okhttp3.CookieJar {
            @Override // okhttp3.CookieJar
            public final java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                return kotlin.collections.CollectionsKt.emptyList();
            }

            @Override // okhttp3.CookieJar
            public final void saveFromResponse(okhttp3.HttpUrl p0, java.util.List<okhttp3.Cookie> p1) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            }
        }
    }
}
