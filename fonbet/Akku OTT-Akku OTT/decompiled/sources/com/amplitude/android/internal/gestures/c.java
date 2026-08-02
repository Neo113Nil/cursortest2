package com.amplitude.android.internal.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function1<com.amplitude.android.internal.c, Unit> {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.a = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(com.amplitude.android.internal.c cVar) {
        com.amplitude.android.internal.c it = cVar;
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.i = it;
        return Unit.INSTANCE;
    }
}
