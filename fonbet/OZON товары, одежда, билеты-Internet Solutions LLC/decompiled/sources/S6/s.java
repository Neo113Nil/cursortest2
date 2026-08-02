package S6;

import java.util.Set;

/* loaded from: classes9.dex */
final class s implements Q6.i {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Q6.c> f25939a;

    /* renamed from: b, reason: collision with root package name */
    private final r f25940b;

    /* renamed from: c, reason: collision with root package name */
    private final u f25941c;

    s(Set set, r rVar, u uVar) {
        this.f25939a = set;
        this.f25940b = rVar;
        this.f25941c = uVar;
    }

    @Override // Q6.i
    public final Q6.h a(String str, Q6.c cVar, Q6.g gVar) {
        Set<Q6.c> set = this.f25939a;
        if (set.contains(cVar)) {
            return new t(this.f25940b, str, cVar, gVar, this.f25941c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
