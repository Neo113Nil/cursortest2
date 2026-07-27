package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3819jc extends AbstractC4254z implements Ok, InterfaceC3650db, InterfaceC3722g {
    public final C4227y b;
    public final AbstractC4120u1 c;
    public final Hd d;
    public final Ad e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3819jc(C4227y adComponent, AbstractC4120u1 adUnitTimeout, Hd publisherCallbacks, Ad stateMachine) {
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
    public final void a() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-LoadingState", "Initialize Called");
        }
        this.c.getClass();
        Ok ok = ((Ce) this).j.b.c;
        Ud ud = ok instanceof Ud ? (Ud) ok : null;
        if (ud != null) {
            Z9 z9 = ud.f6890a.f6535a.f7489a.c;
            if (z9 != null) {
                z9.a("NativeCreatedState", "Inflate Called");
            }
            ud.b.a(new De(ud.f6890a, ud.b), ud);
        }
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3650db
    public final void e() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), Sf.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-LoadingState", "onDestroy");
        }
        this.e.a(new S5(((Ce) this).j, this.c, this.b), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s));
        }
        this.e.a(new C3707fc(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }
}
