package Ja;

import Sc.n;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f14324a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f14325b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f14326c;

    static final class a extends AbstractC7737t implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            k kVar = k.this;
            String host = kVar.f14324a.getHost();
            if (host != null) {
                return host;
            }
            throw new IllegalStateException("Uri " + kVar.f14324a + " doesn't have host!");
        }
    }

    static final class b extends AbstractC7737t implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            k kVar = k.this;
            String scheme = kVar.f14324a.getScheme();
            if (scheme != null) {
                return scheme;
            }
            throw new IllegalStateException("Uri " + kVar.f14324a + " doesn't have scheme!");
        }
    }

    public k(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f14324a = uri;
        n nVar = n.NONE;
        this.f14325b = Sc.k.a(nVar, new a());
        this.f14326c = Sc.k.a(nVar, new b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final String b() {
        return (String) this.f14325b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final String c() {
        return (String) this.f14326c.getValue();
    }

    @NotNull
    public final String toString() {
        String uri = this.f14324a.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
