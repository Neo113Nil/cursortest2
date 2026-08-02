package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class h implements io.ktor.client.plugins.cookies.CookiesStorage {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.impl.Page f6865a;
    public final /* synthetic */ kotlin.jvm.functions.Function1 b;

    public h(financial.atomic.muppet.impl.Page page, kotlin.jvm.functions.Function1 function1) {
        this.f6865a = page;
        this.b = function1;
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public final java.lang.Object addCookie(io.ktor.http.Url url, io.ktor.http.Cookie cookie, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.d.f(this.f6865a, this.b, cookie, url, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public final java.lang.Object get(io.ktor.http.Url url, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.d.g(this.f6865a, url, this.b, null), continuation);
    }
}
