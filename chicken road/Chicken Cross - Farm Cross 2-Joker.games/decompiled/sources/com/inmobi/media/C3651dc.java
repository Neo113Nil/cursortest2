package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.dc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3651dc extends H2 {
    public final short d;
    public final InMobiAdRequestStatus e;
    public final Hd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3651dc(short s, InMobiAdRequestStatus status, C4008q1 adManagerComponent, Hd publisherCallbacks, Ad stateMachine) {
        super(null, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = s;
        this.e = status;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Y9 c = this.b.c();
        if (c != null) {
            short s = this.d;
            Z9 z9 = (Z9) c;
            z9.b("AUM-LoadDroppedState", "Initialize Called " + ((int) s) + ServerSentEventKt.SPACE + this.e.getStatusCode() + ServerSentEventKt.SPACE + this.e.getMessage());
        }
        AbstractC4012q5.a(this.b.a(), new C3623cc(this, null));
        C3922n0 b = this.b.b();
        BuildersKt__Builders_commonKt.launch$default(b.f7256a, null, null, new C3751h0(b, this.d, null), 3, null);
        AbstractC4120u1 abstractC4120u1 = this.f6593a;
        if (abstractC4120u1 != null) {
            abstractC4120u1.a();
        }
        j();
    }
}
