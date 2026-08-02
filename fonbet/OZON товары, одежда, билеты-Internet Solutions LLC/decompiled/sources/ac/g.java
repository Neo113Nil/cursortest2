package ac;

import Ub.r;
import Ub.t;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    private final C4992a f36555a;

    public g(@NonNull C4992a c4992a) {
        this.f36555a = c4992a;
    }

    @Override // Ub.t
    public final Object a(@NonNull Ub.f fVar, @NonNull r rVar) {
        return new f(fVar.g(), this.f36555a, ((Boolean) e.f36549a.b(rVar)).booleanValue());
    }
}
