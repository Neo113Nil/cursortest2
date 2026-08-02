package V70;

import android.content.Context;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.recordaudio.network.AudioRecordNetwork;

/* loaded from: classes3.dex */
public final class e implements Jb.e<d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f28422a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f28423b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Q90.c> f28424c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<AudioRecordNetwork> f28425d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<O30.b> f28426e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<R30.a> f28427f;

    public e(Pc.a<Context> aVar, Pc.a<InterfaceC6618a> aVar2, Pc.a<Q90.c> aVar3, Pc.a<AudioRecordNetwork> aVar4, Pc.a<O30.b> aVar5, Pc.a<R30.a> aVar6) {
        this.f28422a = aVar;
        this.f28423b = aVar2;
        this.f28424c = aVar3;
        this.f28425d = aVar4;
        this.f28426e = aVar5;
        this.f28427f = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        return new d(this.f28422a.get(), this.f28423b.get(), this.f28424c.get(), this.f28425d.get(), this.f28426e.get(), this.f28427f.get());
    }
}
