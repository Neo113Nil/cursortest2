package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar) {
        super(0);
        this.f12083a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.vungle.ads.internal.ui.view.j jVar;
        i0 i0Var;
        jVar = this.f12083a.f12100a;
        Context context = jVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        i0Var = this.f12083a.b;
        return new p0(context, i0Var);
    }
}
