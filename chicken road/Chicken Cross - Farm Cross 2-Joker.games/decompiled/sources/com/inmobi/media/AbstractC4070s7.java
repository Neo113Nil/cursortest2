package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.s7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4070s7 extends AbstractC3695f0 implements Ok, InterfaceC3650db, InterfaceC3722g {
    public final C4008q1 h;
    public final Ad i;
    public final AbstractC4120u1 j;
    public final Hd k;
    public final CoroutineScope l;
    public final C3935nd m;
    public final C3554a0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4070s7(C4008q1 adManagerComponent, AbstractC4120u1 adUnitTimeout, Ad stateMachine, Hd publisherCallbacks) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        this.h = adManagerComponent;
        this.i = stateMachine;
        this.j = adUnitTimeout;
        this.k = publisherCallbacks;
        this.l = AbstractC4012q5.a(this.b);
        TimeoutConfigurations.MediationConfig a0 = this.c.getTimeouts().a0();
        String str = this.d.h;
        this.f7095a.getClass();
        C3935nd a2 = AbstractC3907md.a(a0, str, "native", AbstractC3942nk.b);
        this.m = a2;
        this.n = new C3554a0(adManagerComponent, a2);
    }

    public final void a(Z z) {
        String str = "[AdFlow] Fetch Failure: " + z.b + " with status: " + z.f6983a;
        W w = z.b;
        if (w instanceof C4248yk) {
            C3922n0 c3922n0 = this.g;
            BuildersKt__Builders_commonKt.launch$default(c3922n0.f7256a, null, null, new C3894m0(c3922n0, null), 3, null);
            a(z.f6983a, ((C4248yk) z.b).f7507a);
            return;
        }
        if (w instanceof C3842k7) {
            a(z.f6983a, ((C3842k7) w).f7197a);
        } else if (w instanceof C3871l7) {
            a(z.f6983a, (short) ((C3871l7) w).f7218a);
        } else {
            if (!(w instanceof C4194wk)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((C4194wk) w).f7463a, z.f6983a);
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.Ok
    public final void c() {
        AbstractC3727g4.a(this.l);
    }

    @Override // com.inmobi.media.InterfaceC3650db
    public final void e() {
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        this.i.a(new S5(this.h), this);
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.a("AUM-FetchingState", "Initialize Called");
        }
        Mm.b();
        this.j.b();
        BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new C4042r7(this, null), 3, null);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.i.a(new C3929n7(map, inMobiAdRequestStatus, this.j, this.h, this.k, this.i), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))), inMobiAdRequestStatus);
    }
}
