package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3707fc extends H2 {
    public final Map d;
    public final InMobiAdRequestStatus e;
    public final Hd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3707fc(Map telemetryPayload, InMobiAdRequestStatus status, AbstractC4120u1 abstractC4120u1, InterfaceC3620c9 adManagerComponent, Hd publisherCallbacks, Ad stateMachine) {
        super(abstractC4120u1, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(telemetryPayload, "telemetryPayload");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = telemetryPayload;
        this.e = status;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Y9 c = this.b.c();
        if (c != null) {
            Z9 z9 = (Z9) c;
            z9.b("AUM-LoadFailedState", "Initialize Called " + this.d + ServerSentEventKt.SPACE + this.e.getStatusCode() + ServerSentEventKt.SPACE + this.e.getMessage());
        }
        AbstractC4012q5.a(this.b.a(), new C3678ec(this, null));
        C3922n0 b = this.b.b();
        Map payload = this.d;
        b.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        BuildersKt__Builders_commonKt.launch$default(b.f7256a, null, null, new C3780i0(b, payload, null), 3, null);
        AbstractC4120u1 abstractC4120u1 = this.f6593a;
        if (abstractC4120u1 != null) {
            abstractC4120u1.a();
        }
        j();
    }
}
