package S7;

import f8.I;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final I.b f26022a;

    private l(I.b bVar) {
        this.f26022a = bVar;
    }

    public static l b(j jVar) {
        return new l(jVar.f().C());
    }

    public final synchronized j a() throws GeneralSecurityException {
        return j.c(this.f26022a.b());
    }
}
