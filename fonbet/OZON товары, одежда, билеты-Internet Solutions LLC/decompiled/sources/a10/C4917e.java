package a10;

import android.net.Uri;
import c10.C5725b;
import c10.C5726c;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a10.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4917e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5725b f36197a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b10.b f36198b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4913a f36199c;

    public C4917e(@NotNull InterfaceC4918f redirectListener) {
        Intrinsics.checkNotNullParameter(redirectListener, "redirectListener");
        this.f36197a = new C5725b(new C5726c(redirectListener));
        this.f36198b = new b10.b(redirectListener);
        this.f36199c = new C4913a(new C4914b());
    }

    public final i a(@NotNull String redirectKey, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f36198b.c(redirectKey);
        i a11 = this.f36197a.a(redirectKey);
        this.f36199c.a(redirectKey, a11, requestId);
        return a11;
    }

    public final C4919g b(String str, @NotNull L00.j response) throws C4916d {
        C4915c b11;
        String queryParameter;
        Intrinsics.checkNotNullParameter(response, "response");
        b10.b bVar = this.f36198b;
        C4916d c4916d = null;
        C4919g f7 = str != null ? bVar.f(str) : null;
        if (response.k()) {
            String str2 = response.c().get("Location");
            if (str2 != null) {
                C4915c e11 = bVar.e(response, str2, str);
                String b12 = e11.b();
                if (kotlin.text.h.t(b12, "composer-api.bx/page/json/", false) && (queryParameter = Uri.parse(b12).getQueryParameter(ImagesContract.URL)) != null) {
                    b12 = queryParameter;
                }
                c4916d = new C4916d(e11.a(), b12, k.REGULAR);
            }
        } else if (response.j() != null && (b11 = this.f36197a.b(response, str, f7)) != null) {
            c4916d = new C4916d(b11.a(), b11.b(), k.SERVER);
        }
        if (c4916d == null) {
            return f7;
        }
        this.f36199c.b(response, c4916d);
        throw c4916d;
    }
}
