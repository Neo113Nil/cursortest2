package com.amplitude.android;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class j extends Lambda implements Function1<l, Unit> {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar) {
        super(1);
        this.a = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(l lVar) {
        l addPropertyChangeListener = lVar;
        Intrinsics.checkNotNullParameter(addPropertyChangeListener, "$this$addPropertyChangeListener");
        this.a.D = addPropertyChangeListener.a();
        return Unit.INSTANCE;
    }
}
