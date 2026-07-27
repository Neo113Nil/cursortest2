package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.p7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3986p7 extends AbstractC4254z implements Ok, InterfaceC3650db, InterfaceC3722g {
    public final C4227y b;
    public final AbstractC4120u1 c;
    public final Hd d;
    public final Ad e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3986p7(C4227y adComponent, AbstractC4120u1 adUnitTimeout, Hd publisherCallbacks, Ad stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adComponent;
        this.c = adUnitTimeout;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3650db
    public final void e() {
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.e.a(new C3707fc(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-FetchedState", "onDestroy Called");
        }
        this.e.a(new S5(null, this.c, this.b), this);
    }
}
