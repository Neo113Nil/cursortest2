package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Td extends AbstractC4261z5 {
    public final C4008q1 k;
    public final Hd l;
    public final Ad m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Td(C4008q1 adManagerComponent, Hd nativeCallback, Ad stateMachine) {
        super(adManagerComponent, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.k = adManagerComponent;
        this.l = nativeCallback;
        this.m = stateMachine;
    }
}
