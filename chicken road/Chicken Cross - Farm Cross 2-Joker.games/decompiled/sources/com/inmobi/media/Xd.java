package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xd implements Ok, InterfaceC3694f {

    /* renamed from: a, reason: collision with root package name */
    public final short f6948a;
    public final InMobiAdRequestStatus b;
    public final Ed c;
    public final Jd d;

    public Xd(short s, InMobiAdRequestStatus status, Ed nativeAdUnitComponent, Jd stateMachine) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f6948a = s;
        this.b = status;
        this.c = nativeAdUnitComponent;
        this.d = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Z9 z9 = this.c.f6535a.f7489a.c;
        if (z9 != null) {
            z9.a("NativeFailedState", "Initialize Called");
        }
        this.c.c.a(this.b, this.f6948a);
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3694f
    public final Object a(Continuation continuation) {
        Z9 z9 = this.c.f6535a.f7489a.c;
        if (z9 != null) {
            z9.a("NativeFailedState", "onDestroy");
        }
        Object a2 = this.d.a(new Vd(), this, (ContinuationImpl) continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
