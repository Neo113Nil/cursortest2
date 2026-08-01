package com.vungle.ads.internal.presenter;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar) {
        super(0);
        this.f12085a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.vungle.ads.internal.ui.view.f fVar = this.f12085a.f12100a.d;
        if (fVar != null) {
            fVar.close();
        }
        return Unit.INSTANCE;
    }
}
