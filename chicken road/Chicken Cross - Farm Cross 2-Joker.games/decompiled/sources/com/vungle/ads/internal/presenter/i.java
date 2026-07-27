package com.vungle.ads.internal.presenter;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar) {
        super(0);
        this.f12091a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f12091a.f12100a.setVisibility(0);
        return Unit.INSTANCE;
    }
}
