package C90;

import android.content.Context;
import h90.f;

/* loaded from: classes3.dex */
public final class e implements Jb.e<ru.ozon.fintech.preferences.presentation.logcat.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f4512a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<U30.a> f4513b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<f> f4514c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<r90.f> f4515d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<S80.b> f4516e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f4517f;

    public e(Pc.a<Context> aVar, Pc.a<U30.a> aVar2, Pc.a<f> aVar3, Pc.a<r90.f> aVar4, Pc.a<S80.b> aVar5, Pc.a<ru.ozon.fintech.settings.domain.a> aVar6) {
        this.f4512a = aVar;
        this.f4513b = aVar2;
        this.f4514c = aVar3;
        this.f4515d = aVar4;
        this.f4516e = aVar5;
        this.f4517f = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        return new ru.ozon.fintech.preferences.presentation.logcat.b(this.f4512a.get(), this.f4513b.get(), this.f4514c.get(), this.f4515d.get(), this.f4516e.get(), this.f4517f.get());
    }
}
