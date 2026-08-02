package Ui0;

import Jb.f;
import ij0.InterfaceC7086a;
import kotlin.jvm.internal.Intrinsics;
import nj0.InterfaceC8600a;
import pi0.h;
import sj0.InterfaceC9701a;

/* loaded from: classes3.dex */
public final class e implements Jb.e<d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<kj0.b> f27828a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC9701a<Hi0.a>> f27829b;

    /* renamed from: c, reason: collision with root package name */
    private final f f27830c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC8600a> f27831d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<InterfaceC7086a> f27832e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<ij0.f> f27833f;

    public e(f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5) {
        this.f27828a = aVar;
        this.f27829b = aVar2;
        this.f27830c = fVar;
        this.f27831d = aVar3;
        this.f27832e = aVar4;
        this.f27833f = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        kj0.b configurationsLoader = this.f27828a.get();
        InterfaceC9701a<Hi0.a> menuBuilder = this.f27829b.get();
        h externalTrackerConfiguration = (h) this.f27830c.get();
        InterfaceC8600a configurationMapper = this.f27831d.get();
        InterfaceC7086a changeConfiguration = this.f27832e.get();
        ij0.f resetConfiguration = this.f27833f.get();
        Intrinsics.checkNotNullParameter(configurationsLoader, "configurationsLoader");
        Intrinsics.checkNotNullParameter(menuBuilder, "menuBuilder");
        Intrinsics.checkNotNullParameter(externalTrackerConfiguration, "externalTrackerConfiguration");
        Intrinsics.checkNotNullParameter(configurationMapper, "configurationMapper");
        Intrinsics.checkNotNullParameter(changeConfiguration, "changeConfiguration");
        Intrinsics.checkNotNullParameter(resetConfiguration, "resetConfiguration");
        return new d(configurationsLoader, menuBuilder, externalTrackerConfiguration, configurationMapper, changeConfiguration, resetConfiguration);
    }
}
