package A90;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class h implements Jb.e<ru.ozon.fintech.preferences.presentation.cbdc.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f582a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f583b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f584c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<S80.b> f585d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<R30.a> f586e;

    public h(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f582a = aVar;
        this.f583b = aVar2;
        this.f584c = fVar;
        this.f585d = aVar3;
        this.f586e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new ru.ozon.fintech.preferences.presentation.cbdc.a(this.f582a.get(), this.f583b.get(), (Z30.a) this.f584c.get(), this.f585d.get(), this.f586e.get());
    }
}
