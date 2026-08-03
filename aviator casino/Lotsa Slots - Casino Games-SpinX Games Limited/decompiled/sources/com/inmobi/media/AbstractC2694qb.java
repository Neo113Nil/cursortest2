package com.inmobi.media;

/* renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2694qb extends com.inmobi.media.AbstractC2366e0 implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2560la, com.inmobi.media.InterfaceC2419g {
    public final byte[] h;
    public final com.inmobi.media.C2631o1 i;
    public final com.inmobi.media.AbstractC2735s1 j;
    public final com.inmobi.media.Pc k;
    public final com.inmobi.media.Ic l;
    public final com.inmobi.media.X m;
    public final kotlinx.coroutines.CoroutineScope n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2694qb(byte[] bArr, com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Pc publisherCallbacks, com.inmobi.media.Ic stateMachine) {
        super(adManagerComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.h = bArr;
        this.i = adManagerComponent;
        this.j = adUnitTimeout;
        this.k = publisherCallbacks;
        this.l = stateMachine;
        this.m = new com.inmobi.media.X(this.f, this.g);
        this.n = com.inmobi.media.T4.a(this.b);
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.h;
        if (bArr != null && bArr.length != 0) {
            com.inmobi.media.C2259a c2259a = new com.inmobi.media.C2259a(bArr, this.d.f4958a, this.e);
            this.j.d();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.n, null, null, new com.inmobi.media.C2667pb(c2259a, this, null), 3, null);
        } else {
            com.inmobi.media.C2799u9 c2799u92 = this.e;
            if (c2799u92 != null) {
                c2799u92.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(com.inmobi.media.ads.network.common.model.AdResponse adResponse);

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
        com.inmobi.media.J3.a(this.n);
    }

    @Override // com.inmobi.media.InterfaceC2560la
    public final void e() {
        a(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2138)), new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.l.a(new com.inmobi.media.C2821v5(null, this.j, this.i), this);
    }

    public final void a(java.util.Map map, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.l.a(new com.inmobi.media.Q6(map, inMobiAdRequestStatus, this.j, this.i, this.k, this.l), this);
    }

    public final void a(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.l.a(new com.inmobi.media.C2561lb((short) 2143, inMobiAdRequestStatus, this.i, this.k, this.l), this);
    }
}
