package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3936ne extends AbstractC3792ic {
    public final C4008q1 o;
    public final AbstractC4120u1 p;
    public final Hd q;
    public final Ad r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3936ne(byte[] bArr, C4008q1 adManagerComponent, AbstractC4120u1 adUnitTimeout, Hd nativeCallback, Ad stateMachine) {
        super(bArr, adManagerComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.o = adManagerComponent;
        this.p = adUnitTimeout;
        this.q = nativeCallback;
        this.r = stateMachine;
    }

    @Override // com.inmobi.media.AbstractC3792ic
    public final void a(AdResponse obj) {
        Intrinsics.checkNotNullParameter(obj, "adResponse");
        Z9 z9 = this.e;
        if (z9 != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            z9.a("AUM-NativeLoadResponseState", "onAdResponseParseSuccess - ad response received: " + AbstractC3875lb.a(obj, AdResponse.class));
        }
        U0.a(this.o, obj, new C3878le(this), new C3908me(this));
    }
}
