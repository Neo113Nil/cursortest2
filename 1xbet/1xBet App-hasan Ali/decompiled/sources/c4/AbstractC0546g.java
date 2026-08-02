package c4;

/* renamed from: c4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0546g extends AbstractC0540a {
    public AbstractC0546g(a4.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != a4.i.f6649k) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // a4.c
    public final a4.h getContext() {
        return a4.i.f6649k;
    }
}
