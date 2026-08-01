package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import com.vungle.ads.VungleError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class g0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f11920a;
    public final /* synthetic */ VungleError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, VungleError vungleError) {
        super(0);
        this.f11920a = i0Var;
        this.b = vungleError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BaseAdListener adListener = this.f11920a.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this.f11920a, this.b);
        }
        return Unit.INSTANCE;
    }
}
