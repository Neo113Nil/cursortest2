package C7;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private m f4434a;

    public final e a() {
        m mVar = this.f4434a;
        if (mVar != null) {
            return new A(mVar);
        }
        throw new IllegalStateException(String.valueOf(m.class.getCanonicalName()).concat(" must be set"));
    }

    public final void b(m mVar) {
        this.f4434a = mVar;
    }
}
