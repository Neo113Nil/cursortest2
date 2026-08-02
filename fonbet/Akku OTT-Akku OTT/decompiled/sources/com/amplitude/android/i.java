package com.amplitude.android;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class i extends Lambda implements Function1<l, Unit> {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(1);
        this.a = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(l lVar) {
        l $receiver = lVar;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.a.D = $receiver.a();
        return Unit.INSTANCE;
    }
}
