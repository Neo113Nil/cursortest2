package Z6;

import android.content.Context;

/* loaded from: classes9.dex */
public final class g implements U6.b<String> {

    /* renamed from: a, reason: collision with root package name */
    private final U6.c f35624a;

    public g(U6.c cVar) {
        this.f35624a = cVar;
    }

    @Override // Pc.a
    public final Object get() {
        String packageName = ((Context) this.f35624a.get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
