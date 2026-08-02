package Z60;

import Jb.e;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class c implements e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<U30.a> f35677a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f35678b;

    public c(Pc.a<U30.a> aVar, Pc.a<SharedPreferences> aVar2) {
        this.f35677a = aVar;
        this.f35678b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f35677a.get(), this.f35678b.get());
    }
}
