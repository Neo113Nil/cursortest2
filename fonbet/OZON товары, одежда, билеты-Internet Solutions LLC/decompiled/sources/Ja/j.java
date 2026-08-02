package Ja;

import B0.C2454a;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final List<String> f14317g = C7714v.b0("text/html", "application/json");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f14318a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f14319b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14320c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f14321d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f14322e;

    /* renamed from: f, reason: collision with root package name */
    private final La.a f14323f;

    static {
        new Regex("charset=(.*)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull h protocol, @NotNull String url, int i11, @NotNull String statusText, @NotNull Map<String, ? extends List<String>> headers, La.a aVar) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f14318a = protocol;
        this.f14319b = url;
        this.f14320c = i11;
        this.f14321d = statusText;
        this.f14322e = headers;
        this.f14323f = aVar;
    }

    public final La.a c() {
        return this.f14323f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        La.a aVar = this.f14323f;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final String d() {
        String str;
        Intrinsics.checkNotNullParameter("content-type", CommentV3DTO.HEADER_FIELD_NAME);
        List list = (List) Ia.a.b("content-type", this.f14322e);
        if (list == null || (str = (String) C7714v.M(list)) == null) {
            return null;
        }
        int I11 = kotlin.text.h.I(';', 0, 6, str);
        if (I11 == -1) {
            return str;
        }
        String substring = str.substring(0, I11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14318a == jVar.f14318a && Intrinsics.d(this.f14319b, jVar.f14319b) && this.f14320c == jVar.f14320c && Intrinsics.d(this.f14321d, jVar.f14321d) && Intrinsics.d(this.f14322e, jVar.f14322e) && Intrinsics.d(this.f14323f, jVar.f14323f);
    }

    public final int hashCode() {
        int a11 = D40.c.a(this.f14322e, G.g.a(C2454a.a(this.f14320c, G.g.a(this.f14318a.hashCode() * 31, 31, this.f14319b), 31), 31, this.f14321d), 31);
        La.a aVar = this.f14323f;
        return a11 + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final Map<String, List<String>> j() {
        return this.f14322e;
    }

    @NotNull
    public final h k() {
        return this.f14318a;
    }

    public final int m() {
        return this.f14320c;
    }

    @NotNull
    public final String o() {
        return this.f14321d;
    }

    @NotNull
    public final String toString() {
        return "HttpResponse(protocol=" + this.f14318a + ", url=" + this.f14319b + ", statusCode=" + this.f14320c + ", statusText=" + this.f14321d + ", headers=" + this.f14322e + ", body=" + this.f14323f + ")";
    }
}
