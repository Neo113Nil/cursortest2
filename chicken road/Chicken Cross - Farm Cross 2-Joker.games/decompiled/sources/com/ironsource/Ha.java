package com.ironsource;

import com.ironsource.AbstractC4365d3;
import com.ironsource.Df;
import com.ironsource.InterfaceC4516lb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class Ha implements Ka {

    /* renamed from: a, reason: collision with root package name */
    private final Ba f7659a;
    private final J2 b;
    private final J2 c;
    private final long d;
    private final boolean e;
    private InterfaceC4516lb<LevelPlayAdInfo> f;
    private Df.a g;

    static final class a extends Lambda implements Function1<Ha, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7660a = new a();

        a() {
            super(1);
        }

        public final void a(Ha weakScheduleOnLevelPlay) {
            Intrinsics.checkNotNullParameter(weakScheduleOnLevelPlay, "$this$weakScheduleOnLevelPlay");
            weakScheduleOnLevelPlay.e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Ha ha) {
            a(ha);
            return Unit.INSTANCE;
        }
    }

    public Ha(Ba strategy, J2 currentAdUnit, J2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f7659a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC4516lb<LevelPlayAdInfo> interfaceC4516lb = this.f;
        if (interfaceC4516lb == null) {
            Ba ba = this.f7659a;
            ba.a((Ka) new Ja(ba, this.b, this.c, this.d, this.e));
        } else if (interfaceC4516lb instanceof InterfaceC4516lb.b) {
            a((LevelPlayAdInfo) ((InterfaceC4516lb.b) interfaceC4516lb).b());
        } else if (interfaceC4516lb instanceof InterfaceC4516lb.a) {
            a(((InterfaceC4516lb.a) interfaceC4516lb).b());
        }
    }

    private final void g() {
        Df n = this.f7659a.n();
        Duration.Companion companion = Duration.INSTANCE;
        this.g = n.a(this, DurationKt.toDuration(this.f7659a.k(), DurationUnit.MILLISECONDS), a.f7660a);
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.f7659a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.Ka
    public void c() {
        Df.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        this.c.a(true);
        Ba ba = this.f7659a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        Df.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        Ba ba = this.f7659a;
        ba.a((Ka) new Ga(ba, this.b));
    }

    @Override // com.ironsource.Ka
    public void f() {
        Ba ba = this.f7659a;
        ba.a((Ka) new Ha(ba, this.b, this.c, ba.o().a(), false, 16, null));
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            a(new InterfaceC4516lb.b(c));
        } else {
            a(new InterfaceC4516lb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC4516lb.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long a2 = this.f7659a.o().a() - this.d;
        this.f7659a.a(new C4666u0(this.c, levelPlayAdInfo), this.c, this.b, (AbstractC4365d3) new AbstractC4365d3.c(a2, AbstractC4365d3.d.h.f8133a), false, Long.valueOf(this.d));
    }

    public /* synthetic */ Ha(Ba ba, J2 j2, J2 j22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, j2, j22, j, (i & 16) != 0 ? true : z);
    }

    private final void a(IronSourceError ironSourceError) {
        this.f7659a.a(ironSourceError, this.b, (AbstractC4365d3) new AbstractC4365d3.c(this.f7659a.o().a() - this.d, AbstractC4365d3.d.g.f8132a), this.e, false, Long.valueOf(this.d));
    }

    private final void a(InterfaceC4516lb<LevelPlayAdInfo> interfaceC4516lb) {
        String b;
        if (this.f != null) {
            Ba ba = this.f7659a;
            b = Ia.b(interfaceC4516lb);
            ba.a("Received excessive load " + b + " while reloading");
            return;
        }
        this.f = interfaceC4516lb;
    }
}
