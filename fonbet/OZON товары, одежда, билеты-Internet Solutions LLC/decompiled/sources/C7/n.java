package C7;

/* loaded from: classes.dex */
public final class n implements D7.c {

    /* renamed from: a, reason: collision with root package name */
    private final D7.c f4445a;

    public n(D7.c cVar) {
        this.f4445a = cVar;
    }

    @Override // D7.c
    public final Object zza() {
        k kVar = (k) this.f4445a.zza();
        if (kVar != null) {
            return kVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
