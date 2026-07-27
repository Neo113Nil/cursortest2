package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.ic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3792ic extends AbstractC3695f0 implements Ok, InterfaceC3650db, InterfaceC3722g {
    public final byte[] h;
    public final C4008q1 i;
    public final AbstractC4120u1 j;
    public final Hd k;
    public final Ad l;
    public final Y m;
    public final CoroutineScope n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3792ic(byte[] bArr, C4008q1 adManagerComponent, AbstractC4120u1 adUnitTimeout, Hd publisherCallbacks, Ad stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.h = bArr;
        this.i = adManagerComponent;
        this.j = adUnitTimeout;
        this.k = publisherCallbacks;
        this.l = stateMachine;
        this.m = new Y(this.f, this.g);
        this.n = AbstractC4012q5.a(this.b);
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.h;
        if (bArr != null && bArr.length != 0) {
            C3553a c3553a = new C3553a(bArr, this.d.f7031a, this.e);
            this.j.d();
            BuildersKt__Builders_commonKt.launch$default(this.n, null, null, new C3763hc(c3553a, this, null), 3, null);
        } else {
            Z9 z92 = this.e;
            if (z92 != null) {
                z92.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.Ok
    public final void c() {
        AbstractC3727g4.a(this.n);
    }

    @Override // com.inmobi.media.InterfaceC3650db
    public final void e() {
        a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.l.a(new S5(null, this.j, this.i), this);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.l.a(new C3929n7(map, inMobiAdRequestStatus, this.j, this.i, this.k, this.l), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.l.a(new C3651dc((short) 2143, inMobiAdRequestStatus, this.i, this.k, this.l), this);
    }
}
