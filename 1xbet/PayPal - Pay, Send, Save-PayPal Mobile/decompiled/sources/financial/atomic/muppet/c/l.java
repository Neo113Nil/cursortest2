package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final financial.atomic.muppet.c.l f6849a = new financial.atomic.muppet.c.l();

    public l() {
        super(1, io.ktor.http.CookieKt.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
        return io.ktor.http.CookieKt.renderCookieHeader(cookie);
    }
}
