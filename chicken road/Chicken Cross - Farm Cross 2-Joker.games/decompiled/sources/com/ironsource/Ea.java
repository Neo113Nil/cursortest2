package com.ironsource;

import android.graphics.Rect;
import com.ironsource.AbstractC4365d3;
import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class Ea implements Ka {

    /* renamed from: a, reason: collision with root package name */
    private final Ba f7615a;
    private final J2 b;
    private final Long c;
    private Df.a d;
    private final long e;

    public Ea(Ba strategy, J2 currentAdUnit, Long l) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f7615a = strategy;
        this.b = currentAdUnit;
        this.c = l;
        this.e = strategy.o().a();
        strategy.q();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Ea this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Fg.a(this$0.f7615a.j(), new Rect())) {
            this$0.f7615a.a().a(new Runnable() { // from class: com.ironsource.Ea$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Ea.b(Ea.this);
                }
            });
            return;
        }
        final long a2 = this$0.f7615a.o().a();
        long j = a2 - this$0.e;
        Long l = this$0.c;
        final AbstractC4365d3.c cVar = new AbstractC4365d3.c(l != null ? a2 - l.longValue() : 0L, new AbstractC4365d3.d.f(j));
        this$0.f7615a.a().a(new Runnable() { // from class: com.ironsource.Ea$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ea.a(Ea.this, cVar, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ea this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e();
    }

    private final void e() {
        long p = this.f7615a.p();
        Df n = this.f7615a.n();
        Runnable runnable = new Runnable() { // from class: com.ironsource.Ea$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Ea.a(Ea.this);
            }
        };
        Duration.Companion companion = Duration.INSTANCE;
        this.d = n.a(runnable, DurationKt.toDuration(p, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.Ka
    public void c() {
        Df.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        Ba ba = this.f7615a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        Df.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        Ba ba = this.f7615a;
        ba.a((Ka) new Ga(ba, this.b));
    }

    @Override // com.ironsource.Ka
    public void f() {
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.f7615a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        this.f7615a.a("Received load success while paused not visible");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ea this$0, AbstractC4365d3.c reloadReason, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        this$0.f7615a.a(this$0.b, reloadReason, Long.valueOf(j));
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7615a.a("Received load success while paused not visible");
    }
}
