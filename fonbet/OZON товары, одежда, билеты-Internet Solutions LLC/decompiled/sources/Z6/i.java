package Z6;

/* loaded from: classes9.dex */
public final class i implements U6.b<e> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final i f35626a = new i();
    }

    public static i a() {
        return a.f35626a;
    }

    @Override // Pc.a
    public final Object get() {
        Z6.a aVar = e.f35622a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
