package Vi0;

import Jb.f;
import ij0.InterfaceC7086a;
import kotlin.jvm.internal.Intrinsics;
import nj0.InterfaceC8600a;
import pi0.h;
import sj0.InterfaceC9701a;

/* loaded from: classes3.dex */
public final class e implements Jb.e<d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<kj0.b> f32815a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC9701a<Hi0.a>> f32816b;

    /* renamed from: c, reason: collision with root package name */
    private final f f32817c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC8600a> f32818d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<InterfaceC7086a> f32819e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<ij0.f> f32820f;

    public e(f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5) {
        this.f32815a = aVar;
        this.f32816b = aVar2;
        this.f32817c = fVar;
        this.f32818d = aVar3;
        this.f32819e = aVar4;
        this.f32820f = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        kj0.b configurationsLoader = this.f32815a.get();
        InterfaceC9701a<Hi0.a> productMenuBuilder = this.f32816b.get();
        h externalConfiguration = (h) this.f32817c.get();
        InterfaceC8600a configurationMapper = this.f32818d.get();
        InterfaceC7086a changeConfiguration = this.f32819e.get();
        ij0.f resetConfiguration = this.f32820f.get();
        Intrinsics.checkNotNullParameter(configurationsLoader, "configurationsLoader");
        Intrinsics.checkNotNullParameter(productMenuBuilder, "productMenuBuilder");
        Intrinsics.checkNotNullParameter(externalConfiguration, "externalConfiguration");
        Intrinsics.checkNotNullParameter(configurationMapper, "configurationMapper");
        Intrinsics.checkNotNullParameter(changeConfiguration, "changeConfiguration");
        Intrinsics.checkNotNullParameter(resetConfiguration, "resetConfiguration");
        return new d(configurationsLoader, productMenuBuilder, externalConfiguration, configurationMapper, changeConfiguration, resetConfiguration);
    }
}
