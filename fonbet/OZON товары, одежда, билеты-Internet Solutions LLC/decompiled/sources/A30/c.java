package A30;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class c implements Jb.e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f351a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Q90.c> f352b;

    public c(Pc.a<SharedPreferences> aVar, Pc.a<Q90.c> aVar2) {
        this.f351a = aVar;
        this.f352b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f351a.get(), this.f352b.get());
    }
}
