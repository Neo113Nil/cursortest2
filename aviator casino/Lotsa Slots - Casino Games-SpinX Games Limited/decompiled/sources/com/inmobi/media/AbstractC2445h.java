package com.inmobi.media;

/* renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2445h extends com.inmobi.media.AbstractC2861wj implements com.inmobi.media.InterfaceC2577m1, com.inmobi.media.InterfaceC2560la, com.inmobi.media.InterfaceC2419g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2445h(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    public final void a(byte[] bArr) {
        java.util.Objects.toString(bArr != null ? java.lang.Integer.valueOf(bArr.length) : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) this).c;
        com.inmobi.media.AbstractC2319c5 abstractC2319c5 = interfaceC2782tj instanceof com.inmobi.media.AbstractC2319c5 ? (com.inmobi.media.AbstractC2319c5) interfaceC2782tj : null;
        if (abstractC2319c5 != null) {
            abstractC2319c5.a(bArr);
        }
    }

    @Override // com.inmobi.media.InterfaceC2560la
    public final void e() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) this).c;
        com.inmobi.media.InterfaceC2560la interfaceC2560la = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2560la ? (com.inmobi.media.InterfaceC2560la) interfaceC2782tj : null;
        if (interfaceC2560la != null) {
            interfaceC2560la.e();
        }
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) this).c;
        com.inmobi.media.InterfaceC2419g interfaceC2419g = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2419g ? (com.inmobi.media.InterfaceC2419g) interfaceC2782tj : null;
        if (interfaceC2419g != null) {
            interfaceC2419g.j();
        }
    }

    public final void c() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) this).c;
        com.inmobi.media.AbstractC2319c5 abstractC2319c5 = interfaceC2782tj instanceof com.inmobi.media.AbstractC2319c5 ? (com.inmobi.media.AbstractC2319c5) interfaceC2782tj : null;
        if (abstractC2319c5 == null) {
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        com.inmobi.media.C2799u9 c2799u9 = abstractC2319c5.e;
        if (c2799u9 != null) {
            c2799u9.a("AUM-CreatedState", "fetch called");
        }
        com.inmobi.media.C2313c0 c2313c0 = abstractC2319c5.f;
        c2313c0.getClass();
        c2313c0.f5131a = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.C2576m0 c2576m0 = abstractC2319c5.g;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2576m0.f5324a, null, null, new com.inmobi.media.C2393f0(c2576m0, null), 3, null);
        if (abstractC2319c5.b()) {
            com.inmobi.media.C2799u9 c2799u92 = abstractC2319c5.e;
            if (c2799u92 != null) {
                c2799u92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        com.inmobi.media.C2631o1 adManagerComponent = abstractC2319c5.h;
        com.inmobi.media.Ic stateMachine = abstractC2319c5.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        com.inmobi.media.C2508jb adUnitTimeout = new com.inmobi.media.C2508jb(adManagerComponent, stateMachine);
        com.inmobi.media.C2300bd c2300bd = (com.inmobi.media.C2300bd) abstractC2319c5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        com.inmobi.media.C2799u9 c2799u93 = c2300bd.e;
        if (c2799u93 != null) {
            c2799u93.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        c2300bd.m.a(new com.inmobi.media.C2510jd(c2300bd.k, adUnitTimeout, c2300bd.m, c2300bd.l), c2300bd);
    }

    public final void g() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) this).c;
        com.inmobi.media.Ei ei = interfaceC2782tj instanceof com.inmobi.media.Ei ? (com.inmobi.media.Ei) interfaceC2782tj : null;
        if (ei != null) {
            com.inmobi.media.InterfaceC2772t9 l = ei.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("AUM-RenderedState", "onAdImpression");
            }
            com.inmobi.media.T4.a(ei.k(), new com.inmobi.media.Ci(ei, null));
        }
    }

    public final void a(com.inmobi.ads.InMobiAdRequestStatus status, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        java.util.Objects.toString(status);
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) this).c;
        com.inmobi.media.AbstractC2719rb abstractC2719rb = interfaceC2782tj instanceof com.inmobi.media.AbstractC2719rb ? (com.inmobi.media.AbstractC2719rb) interfaceC2782tj : null;
        if (abstractC2719rb != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
            com.inmobi.media.InterfaceC2772t9 l = abstractC2719rb.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC2719rb.a(status, s);
        }
    }

    public final void a(java.util.Map params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        java.util.Objects.toString(params);
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Ic) this).c;
        com.inmobi.media.Ei ei = interfaceC2782tj instanceof com.inmobi.media.Ei ? (com.inmobi.media.Ei) interfaceC2782tj : null;
        if (ei != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            com.inmobi.media.InterfaceC2772t9 l = ei.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("AUM-RenderedState", com.ironsource.Vf.f);
            }
            com.inmobi.media.T4.a(ei.k(), new com.inmobi.media.Bi(ei, params, null));
        }
    }
}
