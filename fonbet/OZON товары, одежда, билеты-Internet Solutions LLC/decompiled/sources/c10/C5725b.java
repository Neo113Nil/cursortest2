package c10;

import L00.j;
import Sc.InterfaceC4008j;
import Sc.k;
import a10.C4915c;
import a10.C4919g;
import a10.i;
import android.util.LruCache;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5725b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5726c f56311a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56312b;

    /* renamed from: c10.b$a */
    static final class a extends AbstractC7737t implements Function0<LruCache<String, i>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f56313b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final LruCache<String, i> invoke() {
            return new LruCache<>(5);
        }
    }

    public C5725b(@NotNull C5726c serverRedirectPerformanceHandler) {
        Intrinsics.checkNotNullParameter(serverRedirectPerformanceHandler, "serverRedirectPerformanceHandler");
        this.f56311a = serverRedirectPerformanceHandler;
        this.f56312b = k.b(a.f56313b);
    }

    public final i a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        i iVar = (i) ((LruCache) this.f56312b.getValue()).remove(key);
        if (iVar == null) {
            return null;
        }
        C4919g c11 = iVar.c();
        C4919g d11 = this.f56311a.d(key);
        if (d11 != null) {
            if (c11 != null) {
                c11 = new C4919g(c11.c() + d11.c(), iVar.c().b());
            } else {
                c11 = d11;
            }
        }
        return i.a(iVar, c11);
    }

    public final C4915c b(@NotNull j response, String str, C4919g c4919g) {
        Intrinsics.checkNotNullParameter(response, "response");
        String j11 = response.j();
        if (j11 == null) {
            return null;
        }
        C4915c c11 = this.f56311a.c(response, j11, str);
        if (c11.a() != null) {
            ((LruCache) this.f56312b.getValue()).put(c11.a(), new i(response, c4919g));
        }
        return c11;
    }
}
