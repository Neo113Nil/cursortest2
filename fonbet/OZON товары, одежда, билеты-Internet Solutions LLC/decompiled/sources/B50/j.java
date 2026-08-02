package B50;

import android.app.Application;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class j implements Jb.e<i> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f2934a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f2935b;

    public j(Pc.a<Application> aVar, Pc.a<InterfaceC6618a> aVar2) {
        this.f2934a = aVar;
        this.f2935b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new i(this.f2934a.get(), this.f2935b.get());
    }
}
