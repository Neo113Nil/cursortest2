package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3750h extends Rk implements InterfaceC3951o1, InterfaceC3650db, InterfaceC3722g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3750h(CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    public final void a(byte[] bArr) {
        String str = "load() called with response: " + (bArr != null ? Integer.valueOf(bArr.length) : "null") + " bytes";
        Ok ok = ((Ad) this).c;
        AbstractC4261z5 abstractC4261z5 = ok instanceof AbstractC4261z5 ? (AbstractC4261z5) ok : null;
        if (abstractC4261z5 != null) {
            abstractC4261z5.a(bArr);
        }
    }

    @Override // com.inmobi.media.InterfaceC3650db
    public final void e() {
        Ok ok = ((Ad) this).c;
        InterfaceC3650db interfaceC3650db = ok instanceof InterfaceC3650db ? (InterfaceC3650db) ok : null;
        if (interfaceC3650db != null) {
            interfaceC3650db.e();
        }
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        Ok ok = ((Ad) this).c;
        InterfaceC3722g interfaceC3722g = ok instanceof InterfaceC3722g ? (InterfaceC3722g) ok : null;
        if (interfaceC3722g != null) {
            interfaceC3722g.j();
        }
    }

    public final void c() {
        Ok ok = ((Ad) this).c;
        AbstractC4261z5 abstractC4261z5 = ok instanceof AbstractC4261z5 ? (AbstractC4261z5) ok : null;
        if (abstractC4261z5 == null) {
            Kc.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        Z9 z9 = abstractC4261z5.e;
        if (z9 != null) {
            z9.a("AUM-CreatedState", "fetch called");
        }
        C3639d0 c3639d0 = abstractC4261z5.f;
        c3639d0.getClass();
        c3639d0.f7058a = SystemClock.elapsedRealtime();
        C3922n0 c3922n0 = abstractC4261z5.g;
        BuildersKt__Builders_commonKt.launch$default(c3922n0.f7256a, null, null, new C3723g0(c3922n0, null), 3, null);
        if (abstractC4261z5.b()) {
            Z9 z92 = abstractC4261z5.e;
            if (z92 != null) {
                z92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C4008q1 adManagerComponent = abstractC4261z5.h;
        Ad stateMachine = abstractC4261z5.j;
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C3594bc adUnitTimeout = new C3594bc(adManagerComponent, stateMachine);
        Td td = (Td) abstractC4261z5;
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Z9 z93 = td.e;
        if (z93 != null) {
            z93.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        td.m.a(new C3596be(td.k, adUnitTimeout, td.m, td.l), td);
    }

    public final void g() {
        Ok ok = ((Ad) this).c;
        Tj tj = ok instanceof Tj ? (Tj) ok : null;
        if (tj != null) {
            Y9 l = tj.l();
            if (l != null) {
                ((Z9) l).a("AUM-RenderedState", "onAdImpression");
            }
            AbstractC4012q5.a(tj.k(), new Rj(tj, null));
        }
    }

    public final void a(InMobiAdRequestStatus status, short s) {
        Intrinsics.checkNotNullParameter(status, "status");
        String str = "onLoadFailure() called with errorCode: " + ((int) s) + ", status: " + status;
        Ok ok = ((Ad) this).c;
        AbstractC3819jc abstractC3819jc = ok instanceof AbstractC3819jc ? (AbstractC3819jc) ok : null;
        if (abstractC3819jc != null) {
            Intrinsics.checkNotNullParameter(status, "status");
            Y9 l = abstractC3819jc.l();
            if (l != null) {
                ((Z9) l).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC3819jc.a(status, s);
        }
    }

    public final void a(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = "onAdClicked() called with params: " + params;
        Ok ok = ((Ad) this).c;
        Tj tj = ok instanceof Tj ? (Tj) ok : null;
        if (tj != null) {
            Intrinsics.checkNotNullParameter(params, "params");
            Y9 l = tj.l();
            if (l != null) {
                ((Z9) l).a("AUM-RenderedState", com.ironsource.Wf.f);
            }
            AbstractC4012q5.a(tj.k(), new Qj(tj, params, null));
        }
    }
}
